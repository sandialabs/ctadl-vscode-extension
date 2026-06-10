package com.airbnb.epoxy;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.c;
import com.airbnb.epoxy.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class m implements k0 {
    private static final int DELAY_TO_CHECK_ADAPTER_COUNT_MS = 3000;
    private static final o0 NO_OP_TIMER = new m0.b();
    public static Handler defaultDiffingHandler;
    public static Handler defaultModelBuildingHandler;
    private static boolean filterDuplicatesDefault;
    private static boolean globalDebugLoggingEnabled;
    private static d globalExceptionHandler;
    private final n adapter;
    private final Runnable buildModelsRunnable;
    private o debugObserver;
    private volatile boolean filterDuplicates;
    private volatile boolean hasBuiltModelsEver;
    private final g helper;
    private final List<e> interceptors;
    private final Handler modelBuildHandler;
    private List<f> modelInterceptorCallbacks;
    private ControllerModelList modelsBeingBuilt;
    private int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    private r<?> stagedModel;
    private volatile Thread threadBuildingModels;
    private o0 timer;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
            if (r10.isEmpty() != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
            r2 = new com.airbnb.epoxy.j(r10, java.util.Collections.EMPTY_LIST, null);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            int c;
            List<? extends r<?>> list;
            j0 j0Var;
            com.airbnb.epoxy.b bVar;
            j jVar;
            boolean z10;
            m.this.threadBuildingModels = Thread.currentThread();
            m.this.cancelPendingModelBuild();
            m.this.helper.resetAutoModels();
            m.this.modelsBeingBuilt = new ControllerModelList(m.this.getExpectedModelCount());
            m.this.timer.a("Models built");
            try {
                m.this.buildModels();
                m.this.addCurrentlyStagedModelIfExists();
                m.this.timer.stop();
                m.this.runInterceptors();
                m mVar = m.this;
                mVar.filterDuplicatesIfNeeded(mVar.modelsBeingBuilt);
                ControllerModelList controllerModelList = m.this.modelsBeingBuilt;
                controllerModelList.f6592j = ControllerModelList.f6587k;
                if (controllerModelList.f6591i) {
                    controllerModelList.f6591i = false;
                    m.this.timer.a("Models diffed");
                    n nVar = m.this.adapter;
                    ControllerModelList controllerModelList2 = m.this.modelsBeingBuilt;
                    List<? extends r<?>> list2 = nVar.f6665j.f6626f;
                    if (!list2.isEmpty()) {
                        if (list2.get(0).f6683d != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            for (int i10 = 0; i10 < list2.size(); i10++) {
                                list2.get(i10).v("The model was changed between being bound and when models were rebuilt", i10);
                            }
                        }
                    }
                    com.airbnb.epoxy.c cVar = nVar.f6665j;
                    synchronized (cVar) {
                        c = cVar.f6624d.c();
                        list = cVar.f6625e;
                    }
                    if (controllerModelList2 == list) {
                        if (list == null) {
                            list = Collections.emptyList();
                        }
                        jVar = new j(list, list, null);
                    } else {
                        if (controllerModelList2 != null && !controllerModelList2.isEmpty()) {
                            if (list != null && !list.isEmpty()) {
                                cVar.f6622a.execute(new com.airbnb.epoxy.a(cVar, new c.a(list, controllerModelList2, cVar.c), c, controllerModelList2, list));
                                m.this.timer.stop();
                                m.this.modelsBeingBuilt = null;
                                m.this.hasBuiltModelsEver = true;
                                m.this.threadBuildingModels = null;
                                return;
                            }
                            jVar = new j(Collections.EMPTY_LIST, controllerModelList2, null);
                        }
                        j jVar2 = null;
                        j0Var = j0.f6650k;
                        bVar = new com.airbnb.epoxy.b(c, cVar, jVar2, null);
                        j0Var.execute(bVar);
                        m.this.timer.stop();
                        m.this.modelsBeingBuilt = null;
                        m.this.hasBuiltModelsEver = true;
                        m.this.threadBuildingModels = null;
                        return;
                    }
                    j0Var = j0.f6650k;
                    bVar = new com.airbnb.epoxy.b(c, cVar, jVar, controllerModelList2);
                    j0Var.execute(bVar);
                    m.this.timer.stop();
                    m.this.modelsBeingBuilt = null;
                    m.this.hasBuiltModelsEver = true;
                    m.this.threadBuildingModels = null;
                    return;
                }
                throw new IllegalStateException("Notifications already resumed");
            } catch (Throwable th) {
                m.this.timer.stop();
                m.this.modelsBeingBuilt = null;
                m.this.hasBuiltModelsEver = true;
                m.this.threadBuildingModels = null;
                m.this.stagedModel = null;
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements d {
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar = m.this;
            if (mVar.recyclerViewAttachCount > 1) {
                mVar.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    static {
        Handler handler = j0.f6649j.f6640i;
        defaultModelBuildingHandler = handler;
        defaultDiffingHandler = handler;
        filterDuplicatesDefault = false;
        globalDebugLoggingEnabled = false;
        globalExceptionHandler = new b();
    }

    public m() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    public m(Handler handler, Handler handler2) {
        g gVar;
        this.recyclerViewAttachCount = 0;
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        LinkedHashMap linkedHashMap = h.f6643a;
        Constructor<?> a10 = h.a(getClass());
        if (a10 == null) {
            gVar = h.f6644b;
        } else {
            try {
                gVar = (g) a10.newInstance(this);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Unable to invoke " + a10, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Unable to invoke " + a10, e11);
            } catch (InvocationTargetException e12) {
                Throwable cause = e12.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException("Unable to get Epoxy helper class.", cause);
                }
                throw ((RuntimeException) cause);
            }
        }
        this.helper = gVar;
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new a();
        this.adapter = new n(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    private void assertIsBuildingModels() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("Can only call this when inside the `buildModels` method");
        }
    }

    private void assertNotBuildingModels() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call this from inside `buildModels`");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterDuplicatesIfNeeded(List<r<?>> list) {
        if (!this.filterDuplicates) {
            return;
        }
        this.timer.a("Duplicates filtered");
        HashSet hashSet = new HashSet(list.size());
        ListIterator<r<?>> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            r<?> next = listIterator.next();
            if (!hashSet.add(Long.valueOf(next.f6681a))) {
                int previousIndex = listIterator.previousIndex();
                listIterator.remove();
                int findPositionOfDuplicate = findPositionOfDuplicate(list, next);
                r<?> rVar = list.get(findPositionOfDuplicate);
                if (previousIndex <= findPositionOfDuplicate) {
                    findPositionOfDuplicate++;
                }
                onExceptionSwallowed(new IllegalEpoxyUsage("Two models have the same ID. ID's must be unique!\nOriginal has position " + findPositionOfDuplicate + ":\n" + rVar + "\nDuplicate has position " + previousIndex + ":\n" + next));
            }
        }
        this.timer.stop();
    }

    private int findPositionOfDuplicate(List<r<?>> list, r<?> rVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).f6681a == rVar.f6681a) {
                return i10;
            }
        }
        throw new IllegalArgumentException("No duplicates in list");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExpectedModelCount() {
        int i10 = this.adapter.f6667l;
        if (i10 == 0) {
            return 25;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runInterceptors() {
        if (!this.interceptors.isEmpty()) {
            List<f> list = this.modelInterceptorCallbacks;
            if (list != null) {
                for (f fVar : list) {
                    fVar.b();
                }
            }
            this.timer.a("Interceptors executed");
            for (e eVar : this.interceptors) {
                eVar.a();
            }
            this.timer.stop();
            List<f> list2 = this.modelInterceptorCallbacks;
            if (list2 != null) {
                for (f fVar2 : list2) {
                    fVar2.a();
                }
            }
        }
        this.modelInterceptorCallbacks = null;
    }

    public static void setGlobalDebugLoggingEnabled(boolean z10) {
        globalDebugLoggingEnabled = z10;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z10) {
        filterDuplicatesDefault = z10;
    }

    public static void setGlobalExceptionHandler(d dVar) {
        globalExceptionHandler = dVar;
    }

    @Override // com.airbnb.epoxy.k0
    public void add(r<?> rVar) {
        rVar.c(this);
    }

    public void add(List<? extends r<?>> list) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(list.size() + controllerModelList.size());
        for (r<?> rVar : list) {
            add(rVar);
        }
    }

    public void add(r<?>... rVarArr) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(controllerModelList.size() + rVarArr.length);
        for (r<?> rVar : rVarArr) {
            add(rVar);
        }
    }

    public void addAfterInterceptorCallback(f fVar) {
        assertIsBuildingModels();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(fVar);
    }

    public void addCurrentlyStagedModelIfExists() {
        r<?> rVar = this.stagedModel;
        if (rVar != null) {
            rVar.c(this);
        }
        this.stagedModel = null;
    }

    public void addInterceptor(e eVar) {
        this.interceptors.add(eVar);
    }

    public void addInternal(r<?> rVar) {
        assertIsBuildingModels();
        if (!rVar.f6687h) {
            if (rVar.c) {
                clearModelFromStaging(rVar);
                rVar.f6684e = null;
                this.modelsBeingBuilt.add(rVar);
                return;
            }
            throw new IllegalEpoxyUsage("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
        throw new IllegalEpoxyUsage("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
    }

    public void addModelBuildListener(n0 n0Var) {
        this.adapter.f6668m.add(n0Var);
    }

    public abstract void buildModels();

    public synchronized void cancelPendingModelBuild() {
        if (this.requestedModelBuildType != 0) {
            this.requestedModelBuildType = 0;
            this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
        }
    }

    public void clearModelFromStaging(r<?> rVar) {
        if (this.stagedModel != rVar) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    public n getAdapter() {
        return this.adapter;
    }

    public int getFirstIndexOfModelInBuildingList(r<?> rVar) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.modelsBeingBuilt.get(i10) == rVar) {
                return i10;
            }
        }
        return -1;
    }

    public int getModelCountBuiltSoFar() {
        assertIsBuildingModels();
        return this.modelsBeingBuilt.size();
    }

    public int getSpanCount() {
        return this.adapter.f6631d;
    }

    public GridLayoutManager.c getSpanSizeLookup() {
        return this.adapter.f6635h;
    }

    public boolean hasPendingModelBuild() {
        if (this.requestedModelBuildType == 0 && this.threadBuildingModels == null && !this.adapter.f6665j.f6624d.b()) {
            return false;
        }
        return true;
    }

    public boolean isBuildingModels() {
        return this.threadBuildingModels == Thread.currentThread();
    }

    public boolean isDebugLoggingEnabled() {
        return this.timer != NO_OP_TIMER;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    public boolean isModelAddedMultipleTimes(r<?> rVar) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (this.modelsBeingBuilt.get(i11) == rVar) {
                i10++;
            }
        }
        return i10 > 1;
    }

    public boolean isMultiSpan() {
        if (this.adapter.f6631d > 1) {
            return true;
        }
        return false;
    }

    public boolean isStickyHeader(int i10) {
        return false;
    }

    public void moveModel(int i10, int i11) {
        boolean a10;
        assertNotBuildingModels();
        n nVar = this.adapter;
        nVar.getClass();
        ArrayList arrayList = new ArrayList(nVar.f6665j.f6626f);
        arrayList.add(i11, (r) arrayList.remove(i10));
        nVar.f6664i.f6663a = true;
        nVar.f5653a.c(i10, i11);
        nVar.f6664i.f6663a = false;
        com.airbnb.epoxy.c cVar = nVar.f6665j;
        synchronized (cVar) {
            a10 = cVar.a();
            cVar.b(cVar.f6624d.c(), arrayList);
        }
        if (a10) {
            nVar.f6666k.requestModelBuild();
        }
        requestDelayedModelBuild(500);
    }

    public void notifyModelChanged(int i10) {
        boolean a10;
        assertNotBuildingModels();
        n nVar = this.adapter;
        nVar.getClass();
        ArrayList arrayList = new ArrayList(nVar.f6665j.f6626f);
        nVar.f6664i.f6663a = true;
        nVar.f5653a.d(i10, 1, null);
        nVar.f6664i.f6663a = false;
        com.airbnb.epoxy.c cVar = nVar.f6665j;
        synchronized (cVar) {
            a10 = cVar.a();
            cVar.b(cVar.f6624d.c(), arrayList);
        }
        if (a10) {
            nVar.f6666k.requestModelBuild();
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i10 = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i10;
        if (i10 > 1) {
            j0.f6649j.f6640i.postDelayed(new c(), 3000L);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }

    public void onExceptionSwallowed(RuntimeException runtimeException) {
        globalExceptionHandler.getClass();
    }

    public void onModelBound(b0 b0Var, r<?> rVar, int i10, r<?> rVar2) {
    }

    public void onModelUnbound(b0 b0Var, r<?> rVar) {
    }

    public void onRestoreInstanceState(Bundle bundle) {
        n nVar = this.adapter;
        if (nVar.f6633f.f6637i.L() <= 0) {
            if (bundle != null) {
                q0 q0Var = (q0) bundle.getParcelable("saved_state_view_holders");
                nVar.f6634g = q0Var;
                if (q0Var == null) {
                    throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
    }

    public void onSaveInstanceState(Bundle bundle) {
        n nVar = this.adapter;
        Iterator<b0> it = nVar.f6633f.iterator();
        while (true) {
            f.a aVar = (f.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            nVar.f6634g.N((b0) aVar.next());
        }
        if (nVar.f6634g.L() > 0 && !nVar.f5654b) {
            throw new IllegalStateException("Must have stable ids when saving view holder state");
        }
        bundle.putParcelable("saved_state_view_holders", nVar.f6634g);
    }

    public void onViewAttachedToWindow(b0 b0Var, r<?> rVar) {
    }

    public void onViewDetachedFromWindow(b0 b0Var, r<?> rVar) {
    }

    public void removeInterceptor(e eVar) {
        this.interceptors.remove(eVar);
    }

    public void removeModelBuildListener(n0 n0Var) {
        this.adapter.f6668m.remove(n0Var);
    }

    public synchronized void requestDelayedModelBuild(int i10) {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
        }
        int i11 = 1;
        if (this.requestedModelBuildType == 2) {
            cancelPendingModelBuild();
        } else if (this.requestedModelBuildType == 1) {
            return;
        }
        if (i10 != 0) {
            i11 = 2;
        }
        this.requestedModelBuildType = i11;
        this.modelBuildHandler.postDelayed(this.buildModelsRunnable, i10);
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestModelBuild` from inside `buildModels`");
        }
        if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    public void setDebugLoggingEnabled(boolean z10) {
        assertNotBuildingModels();
        if (z10) {
            this.timer = new g1.q(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new o(getClass().getSimpleName());
            }
            this.adapter.p(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        o oVar = this.debugObserver;
        if (oVar != null) {
            this.adapter.r(oVar);
        }
    }

    public void setFilterDuplicates(boolean z10) {
        this.filterDuplicates = z10;
    }

    public void setSpanCount(int i10) {
        this.adapter.f6631d = i10;
    }

    public void setStagedModel(r<?> rVar) {
        if (rVar != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = rVar;
    }

    public void setupStickyHeaderView(View view) {
    }

    public void teardownStickyHeaderView(View view) {
    }
}
