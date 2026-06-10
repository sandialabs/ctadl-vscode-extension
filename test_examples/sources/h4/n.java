package h4;

import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import com.noto.R;
import h4.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final h4.a f11416a = new h4.a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<WeakReference<p.b<ViewGroup, ArrayList<j>>>> f11417b = new ThreadLocal<>();
    public static final ArrayList<ViewGroup> c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: i  reason: collision with root package name */
        public final j f11418i;

        /* renamed from: j  reason: collision with root package name */
        public final ViewGroup f11419j;

        /* renamed from: h4.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0125a extends m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ p.b f11420a;

            public C0125a(p.b bVar) {
                this.f11420a = bVar;
            }

            @Override // h4.j.d
            public final void e(j jVar) {
                ((ArrayList) this.f11420a.getOrDefault(a.this.f11419j, null)).remove(jVar);
                jVar.x(this);
            }
        }

        public a(ViewGroup viewGroup, j jVar) {
            this.f11418i = jVar;
            this.f11419j = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01d3 A[EDGE_INSN: B:142:0x01d3->B:89:0x01d3 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01fb  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onPreDraw() {
            ArrayList arrayList;
            j jVar;
            p.b bVar;
            p.b bVar2;
            int i10;
            int[] iArr;
            int i11;
            int i12;
            int i13;
            j.b orDefault;
            View view;
            boolean z10;
            boolean z11;
            ViewGroup viewGroup;
            q qVar;
            View view2;
            ViewGroup viewGroup2;
            ViewGroup viewGroup3 = this.f11419j;
            viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup3.removeOnAttachStateChangeListener(this);
            int i14 = 1;
            if (!n.c.remove(viewGroup3)) {
                return true;
            }
            p.b<ViewGroup, ArrayList<j>> b5 = n.b();
            Long l2 = null;
            ArrayList<j> orDefault2 = b5.getOrDefault(viewGroup3, null);
            if (orDefault2 == null) {
                orDefault2 = new ArrayList<>();
                b5.put(viewGroup3, orDefault2);
            } else if (orDefault2.size() > 0) {
                arrayList = new ArrayList(orDefault2);
                jVar = this.f11418i;
                orDefault2.add(jVar);
                jVar.a(new C0125a(b5));
                jVar.j(viewGroup3, false);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((j) it.next()).z(viewGroup3);
                    }
                }
                jVar.f11401s = new ArrayList<>();
                jVar.f11402t = new ArrayList<>();
                r rVar = jVar.f11397o;
                r rVar2 = jVar.f11398p;
                bVar = new p.b(rVar.f11428a);
                bVar2 = new p.b(rVar2.f11428a);
                i10 = 0;
                while (true) {
                    iArr = jVar.f11400r;
                    if (i10 < iArr.length) {
                        break;
                    }
                    int i15 = iArr[i10];
                    if (i15 != i14) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 == 4) {
                                    p.e<View> eVar = rVar.c;
                                    p.e<View> eVar2 = rVar2.c;
                                    int L = eVar.L();
                                    int i16 = 0;
                                    while (i16 < L) {
                                        View M = eVar.M(i16);
                                        if (M != null && jVar.u(M)) {
                                            viewGroup2 = viewGroup3;
                                            View view3 = (View) eVar2.h(eVar.t(i16), l2);
                                            if (view3 != null && jVar.u(view3)) {
                                                q qVar2 = (q) bVar.getOrDefault(M, l2);
                                                q qVar3 = (q) bVar2.getOrDefault(view3, l2);
                                                if (qVar2 != null && qVar3 != null) {
                                                    jVar.f11401s.add(qVar2);
                                                    jVar.f11402t.add(qVar3);
                                                    bVar.remove(M);
                                                    bVar2.remove(view3);
                                                }
                                            }
                                        } else {
                                            viewGroup2 = viewGroup3;
                                        }
                                        i16++;
                                        viewGroup3 = viewGroup2;
                                        l2 = null;
                                    }
                                }
                                viewGroup = viewGroup3;
                            } else {
                                viewGroup = viewGroup3;
                                SparseArray<View> sparseArray = rVar.f11429b;
                                SparseArray<View> sparseArray2 = rVar2.f11429b;
                                int size = sparseArray.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    View valueAt = sparseArray.valueAt(i17);
                                    if (valueAt != null && jVar.u(valueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i17))) != null && jVar.u(view2)) {
                                        q qVar4 = (q) bVar.getOrDefault(valueAt, null);
                                        q qVar5 = (q) bVar2.getOrDefault(view2, null);
                                        if (qVar4 != null && qVar5 != null) {
                                            jVar.f11401s.add(qVar4);
                                            jVar.f11402t.add(qVar5);
                                            bVar.remove(valueAt);
                                            bVar2.remove(view2);
                                        }
                                    }
                                }
                            }
                        } else {
                            viewGroup = viewGroup3;
                            p.b<String, View> bVar3 = rVar.f11430d;
                            int i18 = bVar3.f16580k;
                            for (int i19 = 0; i19 < i18; i19++) {
                                View k3 = bVar3.k(i19);
                                if (k3 != null && jVar.u(k3)) {
                                    View orDefault3 = rVar2.f11430d.getOrDefault(bVar3.i(i19), null);
                                    if (orDefault3 != null && jVar.u(orDefault3)) {
                                        q qVar6 = (q) bVar.getOrDefault(k3, null);
                                        q qVar7 = (q) bVar2.getOrDefault(orDefault3, null);
                                        if (qVar6 != null && qVar7 != null) {
                                            jVar.f11401s.add(qVar6);
                                            jVar.f11402t.add(qVar7);
                                            bVar.remove(k3);
                                            bVar2.remove(orDefault3);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        viewGroup = viewGroup3;
                        int i20 = bVar.f16580k;
                        while (true) {
                            i20--;
                            if (i20 >= 0) {
                                View view4 = (View) bVar.i(i20);
                                if (view4 != null && jVar.u(view4) && (qVar = (q) bVar2.remove(view4)) != null && jVar.u(qVar.f11427b)) {
                                    jVar.f11401s.add((q) bVar.j(i20));
                                    jVar.f11402t.add(qVar);
                                }
                            }
                        }
                    }
                    i10++;
                    viewGroup3 = viewGroup;
                    l2 = null;
                    i14 = 1;
                }
                ViewGroup viewGroup4 = viewGroup3;
                for (i11 = 0; i11 < bVar.f16580k; i11++) {
                    q qVar8 = (q) bVar.k(i11);
                    if (jVar.u(qVar8.f11427b)) {
                        jVar.f11401s.add(qVar8);
                        jVar.f11402t.add(null);
                    }
                }
                for (i12 = 0; i12 < bVar2.f16580k; i12++) {
                    q qVar9 = (q) bVar2.k(i12);
                    if (jVar.u(qVar9.f11427b)) {
                        jVar.f11402t.add(qVar9);
                        jVar.f11401s.add(null);
                    }
                }
                p.b<Animator, j.b> q10 = j.q();
                int i21 = q10.f16580k;
                v vVar = t.f11432a;
                WindowId windowId = viewGroup4.getWindowId();
                for (i13 = i21 - 1; i13 >= 0; i13--) {
                    Animator i22 = q10.i(i13);
                    if (i22 != null && (orDefault = q10.getOrDefault(i22, null)) != null && (view = orDefault.f11409a) != null) {
                        c0 c0Var = orDefault.f11411d;
                        if ((c0Var instanceof b0) && ((b0) c0Var).f11378a.equals(windowId)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            q s10 = jVar.s(view, true);
                            q p10 = jVar.p(view, true);
                            if (s10 == null && p10 == null) {
                                p10 = jVar.f11398p.f11428a.getOrDefault(view, null);
                            }
                            if ((s10 != null || p10 != null) && orDefault.f11412e.t(orDefault.c, p10)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                if (!i22.isRunning() && !i22.isStarted()) {
                                    q10.remove(i22);
                                }
                                i22.cancel();
                            }
                        }
                    }
                }
                jVar.n(viewGroup4, jVar.f11397o, jVar.f11398p, jVar.f11401s, jVar.f11402t);
                jVar.A();
                return true;
            }
            arrayList = null;
            jVar = this.f11418i;
            orDefault2.add(jVar);
            jVar.a(new C0125a(b5));
            jVar.j(viewGroup3, false);
            if (arrayList != null) {
            }
            jVar.f11401s = new ArrayList<>();
            jVar.f11402t = new ArrayList<>();
            r rVar3 = jVar.f11397o;
            r rVar22 = jVar.f11398p;
            bVar = new p.b(rVar3.f11428a);
            bVar2 = new p.b(rVar22.f11428a);
            i10 = 0;
            while (true) {
                iArr = jVar.f11400r;
                if (i10 < iArr.length) {
                }
                i10++;
                viewGroup3 = viewGroup;
                l2 = null;
                i14 = 1;
            }
            ViewGroup viewGroup42 = viewGroup3;
            while (i11 < bVar.f16580k) {
            }
            while (i12 < bVar2.f16580k) {
            }
            p.b<Animator, j.b> q102 = j.q();
            int i212 = q102.f16580k;
            v vVar2 = t.f11432a;
            WindowId windowId2 = viewGroup42.getWindowId();
            while (i13 >= 0) {
            }
            jVar.n(viewGroup42, jVar.f11397o, jVar.f11398p, jVar.f11401s, jVar.f11402t);
            jVar.A();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f11419j;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            n.c.remove(viewGroup);
            ArrayList<j> orDefault = n.b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<j> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().z(viewGroup);
                }
            }
            this.f11418i.k(true);
        }
    }

    public static void a(ViewGroup viewGroup, j jVar) {
        ArrayList<ViewGroup> arrayList = c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if (j0.g.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (jVar == null) {
                    jVar = f11416a;
                }
                j clone = jVar.clone();
                ArrayList<j> orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<j> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().w(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.j(viewGroup, true);
                }
                if (((i) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, null);
                    if (clone != null) {
                        a aVar = new a(viewGroup, clone);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static p.b<ViewGroup, ArrayList<j>> b() {
        p.b<ViewGroup, ArrayList<j>> bVar;
        ThreadLocal<WeakReference<p.b<ViewGroup, ArrayList<j>>>> threadLocal = f11417b;
        WeakReference<p.b<ViewGroup, ArrayList<j>>> weakReference = threadLocal.get();
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            p.b<ViewGroup, ArrayList<j>> bVar2 = new p.b<>();
            threadLocal.set(new WeakReference<>(bVar2));
            return bVar2;
        }
        return bVar;
    }
}
