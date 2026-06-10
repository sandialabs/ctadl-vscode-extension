package com.airbnb.epoxy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.appcompat.widget.e1;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g0.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0004()*+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0006J\u0012\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u0015H\u0016J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010\u001f\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0016J\b\u0010!\u001a\u00020 H\u0002R\u001a\u0010'\u001a\u00020\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "removeAdapterWhenDetachedFromWindow", "Lm7/n;", "setRemoveAdapterWhenDetachedFromWindow", "", "delayMsWhenRemovingAdapterOnDetach", "setDelayMsWhenRemovingAdapterOnDetach", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "Landroidx/recyclerview/widget/RecyclerView$l;", "layout", "setLayoutManager", "itemSpacingRes", "setItemSpacingRes", "dp", "setItemSpacingDp", "spacingPx", "setItemSpacingPx", "", "Lcom/airbnb/epoxy/r;", "models", "setModels", "Lcom/airbnb/epoxy/m;", "controller", "setController", "setControllerAndBuildModels", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "setAdapter", "Landroid/content/Context;", "getContextForSharedViewPool", "Lcom/airbnb/epoxy/q;", "R0", "Lcom/airbnb/epoxy/q;", "getSpacingDecorator", "()Lcom/airbnb/epoxy/q;", "spacingDecorator", "a", "ModelBuilderCallbackController", "b", "WithModelsController", "epoxy-adapter_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public class EpoxyRecyclerView extends RecyclerView {

    /* renamed from: a1  reason: collision with root package name */
    public static final f1 f6588a1 = new f1(1, 0);
    public final q R0;
    public m S0;
    public RecyclerView.Adapter<?> T0;
    public boolean U0;
    public int V0;
    public boolean W0;
    public final e1 X0;
    public final ArrayList Y0;
    public final ArrayList Z0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;", "Lcom/airbnb/epoxy/m;", "Lm7/n;", "buildModels", "Lcom/airbnb/epoxy/EpoxyRecyclerView$a;", "callback", "Lcom/airbnb/epoxy/EpoxyRecyclerView$a;", "getCallback", "()Lcom/airbnb/epoxy/EpoxyRecyclerView$a;", "setCallback", "(Lcom/airbnb/epoxy/EpoxyRecyclerView$a;)V", "<init>", "()V", "epoxy-adapter_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* loaded from: classes.dex */
    public static final class ModelBuilderCallbackController extends m {
        private a callback = new a();

        /* loaded from: classes.dex */
        public static final class a implements a {
            @Override // com.airbnb.epoxy.EpoxyRecyclerView.a
            public final void a(m mVar) {
                v7.g.f(mVar, "controller");
            }
        }

        @Override // com.airbnb.epoxy.m
        public void buildModels() {
            this.callback.a(this);
        }

        public final a getCallback() {
            return this.callback;
        }

        public final void setCallback(a aVar) {
            v7.g.f(aVar, "<set-?>");
            this.callback = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;", "Lcom/airbnb/epoxy/m;", "Lm7/n;", "buildModels", "Lkotlin/Function1;", "callback", "Lu7/l;", "getCallback", "()Lu7/l;", "setCallback", "(Lu7/l;)V", "<init>", "()V", "epoxy-adapter_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* loaded from: classes.dex */
    public static final class WithModelsController extends m {
        private u7.l<? super m, m7.n> callback = EpoxyRecyclerView$WithModelsController$callback$1.f6589j;

        @Override // com.airbnb.epoxy.m
        public void buildModels() {
            this.callback.U(this);
        }

        public final u7.l<m, m7.n> getCallback() {
            return this.callback;
        }

        public final void setCallback(u7.l<? super m, m7.n> lVar) {
            v7.g.f(lVar, "<set-?>");
            this.callback = lVar;
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(m mVar);
    }

    /* loaded from: classes.dex */
    public static final class b<T extends r<?>, U, P> {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        v7.g.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        v7.g.f(context, "context");
        this.R0 = new q();
        this.U0 = true;
        this.V0 = 2000;
        this.X0 = new e1(11, this);
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.c.f68e, 0, 0);
            v7.g.e(obtainStyledAttributes, "context.obtainStyledAttr…tyleAttr, 0\n            )");
            setItemSpacingPx(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            obtainStyledAttributes.recycle();
        }
        setClipToPadding(false);
        Context contextForSharedViewPool = getContextForSharedViewPool();
        EpoxyRecyclerView$initViewPool$1 epoxyRecyclerView$initViewPool$1 = new EpoxyRecyclerView$initViewPool$1(this);
        f1 f1Var = f6588a1;
        f1Var.getClass();
        v7.g.f(contextForSharedViewPool, "context");
        ArrayList arrayList = f1Var.f11050a;
        Iterator it = arrayList.iterator();
        v7.g.e(it, "pools.iterator()");
        PoolReference poolReference = null;
        while (it.hasNext()) {
            Object next = it.next();
            v7.g.e(next, "iterator.next()");
            PoolReference poolReference2 = (PoolReference) next;
            if (poolReference2.f6607k.get() == contextForSharedViewPool) {
                if (poolReference == null) {
                    poolReference = poolReference2;
                } else {
                    throw new IllegalStateException("A pool was already found");
                }
            } else if (a1.b.i0(poolReference2.f6607k.get())) {
                poolReference2.f6605i.a();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(contextForSharedViewPool, (RecyclerView.r) epoxyRecyclerView$initViewPool$1.k0(), f1Var);
            Lifecycle c = f1.c(contextForSharedViewPool);
            if (c != null) {
                c.a(poolReference);
            }
            arrayList.add(poolReference);
        }
        setRecycledViewPool(poolReference.f6605i);
    }

    private final Context getContextForSharedViewPool() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return context;
            }
        }
        Context context2 = getContext();
        v7.g.e(context2, "this.context");
        return context2;
    }

    public final q getSpacingDecorator() {
        return this.R0;
    }

    public final void n0() {
        RecyclerView.l layoutManager = getLayoutManager();
        m mVar = this.S0;
        if ((layoutManager instanceof GridLayoutManager) && mVar != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (mVar.getSpanCount() != gridLayoutManager.G || gridLayoutManager.L != mVar.getSpanSizeLookup()) {
                mVar.setSpanCount(gridLayoutManager.G);
                gridLayoutManager.L = mVar.getSpanSizeLookup();
            }
        }
    }

    public final void o0() {
        ArrayList arrayList = this.Y0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a5.a aVar = (a5.a) it.next();
            ArrayList arrayList2 = this.f5638s0;
            if (arrayList2 != null) {
                arrayList2.remove(aVar);
            }
        }
        arrayList.clear();
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            return;
        }
        Iterator it2 = this.Z0.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            if (!(adapter instanceof k)) {
                if (this.S0 != null) {
                    bVar.getClass();
                    a1.c.N0(null);
                    v7.g.f(null, "requestHolderFactory");
                    throw null;
                }
            } else {
                k kVar = (k) adapter;
                bVar.getClass();
                a1.c.N0(null);
                v7.g.f(null, "requestHolderFactory");
                throw null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.Adapter<?> adapter = this.T0;
        e1 e1Var = this.X0;
        if (adapter != null) {
            setLayoutFrozen(false);
            g0(adapter, true, false);
            W(true);
            requestLayout();
            this.T0 = null;
            if (this.W0) {
                removeCallbacks(e1Var);
                this.W0 = false;
            }
            o0();
        }
        this.T0 = null;
        if (this.W0) {
            removeCallbacks(e1Var);
            this.W0 = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator it = this.Y0.iterator();
        if (!it.hasNext()) {
            if (this.U0) {
                int i10 = this.V0;
                e1 e1Var = this.X0;
                if (i10 > 0) {
                    this.W0 = true;
                    postDelayed(e1Var, i10);
                } else {
                    RecyclerView.Adapter<?> adapter = getAdapter();
                    if (adapter != null) {
                        setLayoutFrozen(false);
                        g0(null, true, true);
                        W(true);
                        requestLayout();
                        this.T0 = null;
                        if (this.W0) {
                            removeCallbacks(e1Var);
                            this.W0 = false;
                        }
                        o0();
                        this.T0 = adapter;
                    }
                    if (a1.b.i0(getContext())) {
                        getRecycledViewPool().a();
                    }
                }
            }
            if (a1.b.i0(getContext())) {
                getRecycledViewPool().a();
                return;
            }
            return;
        }
        ((a5.a) it.next()).getClass();
        throw null;
    }

    public final void p0(u7.l<? super m, m7.n> lVar) {
        m mVar = this.S0;
        WithModelsController withModelsController = mVar instanceof WithModelsController ? (WithModelsController) mVar : null;
        if (withModelsController == null) {
            withModelsController = new WithModelsController();
            setController(withModelsController);
        }
        withModelsController.setCallback(lVar);
        withModelsController.requestModelBuild();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        n0();
        super.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        super.setAdapter(adapter);
        this.T0 = null;
        if (this.W0) {
            removeCallbacks(this.X0);
            this.W0 = false;
        }
        o0();
    }

    public final void setController(m mVar) {
        v7.g.f(mVar, "controller");
        this.S0 = mVar;
        setAdapter(mVar.getAdapter());
        n0();
    }

    public final void setControllerAndBuildModels(m mVar) {
        v7.g.f(mVar, "controller");
        mVar.requestModelBuild();
        setController(mVar);
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int i10) {
        this.V0 = i10;
    }

    public final void setItemSpacingDp(int i10) {
        setItemSpacingPx((int) TypedValue.applyDimension(1, i10, getResources().getDisplayMetrics()));
    }

    public void setItemSpacingPx(int i10) {
        q qVar = this.R0;
        a0(qVar);
        qVar.f6671a = i10;
        if (i10 > 0) {
            g(qVar);
        }
    }

    public final void setItemSpacingRes(int i10) {
        setItemSpacingPx(getResources().getDimensionPixelOffset(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.l lVar) {
        super.setLayoutManager(lVar);
        n0();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        LinearLayoutManager linearLayoutManager;
        v7.g.f(layoutParams, "params");
        if (getLayoutParams() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setLayoutParams(layoutParams);
        if (z10 && getLayoutManager() == null) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            int i10 = layoutParams2.height;
            if (i10 != -1 && i10 != 0) {
                getContext();
                linearLayoutManager = new LinearLayoutManager(0);
                setLayoutManager(linearLayoutManager);
            }
            int i11 = layoutParams2.width;
            if (i11 == -1 || i11 == 0) {
                setHasFixedSize(true);
            }
            getContext();
            linearLayoutManager = new LinearLayoutManager(1);
            setLayoutManager(linearLayoutManager);
        }
    }

    public void setModels(List<? extends r<?>> list) {
        v7.g.f(list, "models");
        m mVar = this.S0;
        SimpleEpoxyController simpleEpoxyController = mVar instanceof SimpleEpoxyController ? (SimpleEpoxyController) mVar : null;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(list);
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean z10) {
        this.U0 = z10;
    }
}
