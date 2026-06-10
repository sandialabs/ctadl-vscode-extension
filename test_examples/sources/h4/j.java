package h4;

import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class j implements Cloneable {
    public static final int[] C = {2, 1, 3, 4};
    public static final a D = new a();
    public static final ThreadLocal<p.b<Animator, b>> E = new ThreadLocal<>();
    public c A;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<q> f11401s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<q> f11402t;

    /* renamed from: i  reason: collision with root package name */
    public final String f11392i = getClass().getName();

    /* renamed from: j  reason: collision with root package name */
    public long f11393j = -1;

    /* renamed from: k  reason: collision with root package name */
    public long f11394k = -1;

    /* renamed from: l  reason: collision with root package name */
    public TimeInterpolator f11395l = null;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<Integer> f11396m = new ArrayList<>();
    public final ArrayList<View> n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public r f11397o = new r();

    /* renamed from: p  reason: collision with root package name */
    public r f11398p = new r();

    /* renamed from: q  reason: collision with root package name */
    public o f11399q = null;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f11400r = C;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<Animator> f11403u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public int f11404v = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11405w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11406x = false;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<d> f11407y = null;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<Animator> f11408z = new ArrayList<>();
    public androidx.datastore.preferences.protobuf.k B = D;

    /* loaded from: classes.dex */
    public static class a extends androidx.datastore.preferences.protobuf.k {
        @Override // androidx.datastore.preferences.protobuf.k
        public final Path x0(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final View f11409a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11410b;
        public final q c;

        /* renamed from: d  reason: collision with root package name */
        public final c0 f11411d;

        /* renamed from: e  reason: collision with root package name */
        public final j f11412e;

        public b(View view, String str, j jVar, b0 b0Var, q qVar) {
            this.f11409a = view;
            this.f11410b = str;
            this.c = qVar;
            this.f11411d = b0Var;
            this.f11412e = jVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(j jVar);

        void b();

        void c();

        void d();

        void e(j jVar);
    }

    public static void c(r rVar, View view, q qVar) {
        rVar.f11428a.put(view, qVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray<View> sparseArray = rVar.f11429b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        String k3 = j0.i.k(view);
        if (k3 != null) {
            p.b<String, View> bVar = rVar.f11430d;
            if (bVar.containsKey(k3)) {
                bVar.put(k3, null);
            } else {
                bVar.put(k3, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                p.e<View> eVar = rVar.c;
                if (eVar.f16553i) {
                    eVar.f();
                }
                if (ma.i.q(eVar.f16554j, eVar.f16556l, itemIdAtPosition) >= 0) {
                    View view2 = (View) eVar.h(itemIdAtPosition, null);
                    if (view2 != null) {
                        j0.d.r(view2, false);
                        eVar.J(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                j0.d.r(view, true);
                eVar.J(itemIdAtPosition, view);
            }
        }
    }

    public static p.b<Animator, b> q() {
        ThreadLocal<p.b<Animator, b>> threadLocal = E;
        p.b<Animator, b> bVar = threadLocal.get();
        if (bVar == null) {
            p.b<Animator, b> bVar2 = new p.b<>();
            threadLocal.set(bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static boolean v(q qVar, q qVar2, String str) {
        Object obj = qVar.f11426a.get(str);
        Object obj2 = qVar2.f11426a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    public void A() {
        H();
        p.b<Animator, b> q10 = q();
        Iterator<Animator> it = this.f11408z.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (q10.containsKey(next)) {
                H();
                if (next != null) {
                    next.addListener(new k(this, q10));
                    long j2 = this.f11394k;
                    if (j2 >= 0) {
                        next.setDuration(j2);
                    }
                    long j10 = this.f11393j;
                    if (j10 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f11395l;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new l(this));
                    next.start();
                }
            }
        }
        this.f11408z.clear();
        o();
    }

    public void B(long j2) {
        this.f11394k = j2;
    }

    public void C(c cVar) {
        this.A = cVar;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.f11395l = timeInterpolator;
    }

    public void E(androidx.datastore.preferences.protobuf.k kVar) {
        if (kVar == null) {
            kVar = D;
        }
        this.B = kVar;
    }

    public void F() {
    }

    public void G(long j2) {
        this.f11393j = j2;
    }

    public final void H() {
        if (this.f11404v == 0) {
            ArrayList<d> arrayList = this.f11407y;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f11407y.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).a(this);
                }
            }
            this.f11406x = false;
        }
        this.f11404v++;
    }

    public String I(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f11394k != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("dur(");
            str2 = androidx.activity.e.i(sb, this.f11394k, ") ");
        }
        if (this.f11393j != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("dly(");
            str2 = androidx.activity.e.i(sb2, this.f11393j, ") ");
        }
        if (this.f11395l != null) {
            str2 = str2 + "interp(" + this.f11395l + ") ";
        }
        ArrayList<Integer> arrayList = this.f11396m;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.n;
        if (size > 0 || arrayList2.size() > 0) {
            String l2 = a4.b.l(str2, "tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        l2 = a4.b.l(l2, ", ");
                    }
                    l2 = l2 + arrayList.get(i10);
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        l2 = a4.b.l(l2, ", ");
                    }
                    l2 = l2 + arrayList2.get(i11);
                }
            }
            return a4.b.l(l2, ")");
        }
        return str2;
    }

    public void a(d dVar) {
        if (this.f11407y == null) {
            this.f11407y = new ArrayList<>();
        }
        this.f11407y.add(dVar);
    }

    public void b(View view) {
        this.n.add(view);
    }

    public void d() {
        ArrayList<Animator> arrayList = this.f11403u;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            arrayList.get(size).cancel();
        }
        ArrayList<d> arrayList2 = this.f11407y;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.f11407y.clone();
        int size2 = arrayList3.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((d) arrayList3.get(i10)).d();
        }
    }

    public abstract void e(q qVar);

    public final void f(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            q qVar = new q(view);
            if (z10) {
                i(qVar);
            } else {
                e(qVar);
            }
            qVar.c.add(this);
            h(qVar);
            c(z10 ? this.f11397o : this.f11398p, view, qVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public void h(q qVar) {
    }

    public abstract void i(q qVar);

    public final void j(ViewGroup viewGroup, boolean z10) {
        k(z10);
        ArrayList<Integer> arrayList = this.f11396m;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.n;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View findViewById = viewGroup.findViewById(arrayList.get(i10).intValue());
            if (findViewById != null) {
                q qVar = new q(findViewById);
                if (z10) {
                    i(qVar);
                } else {
                    e(qVar);
                }
                qVar.c.add(this);
                h(qVar);
                c(z10 ? this.f11397o : this.f11398p, findViewById, qVar);
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = arrayList2.get(i11);
            q qVar2 = new q(view);
            if (z10) {
                i(qVar2);
            } else {
                e(qVar2);
            }
            qVar2.c.add(this);
            h(qVar2);
            c(z10 ? this.f11397o : this.f11398p, view, qVar2);
        }
    }

    public final void k(boolean z10) {
        r rVar;
        if (z10) {
            this.f11397o.f11428a.clear();
            this.f11397o.f11429b.clear();
            rVar = this.f11397o;
        } else {
            this.f11398p.f11428a.clear();
            this.f11398p.f11429b.clear();
            rVar = this.f11398p;
        }
        rVar.c.d();
    }

    @Override // 
    /* renamed from: l */
    public j clone() {
        try {
            j jVar = (j) super.clone();
            jVar.f11408z = new ArrayList<>();
            jVar.f11397o = new r();
            jVar.f11398p = new r();
            jVar.f11401s = null;
            jVar.f11402t = null;
            return jVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator m(ViewGroup viewGroup, q qVar, q qVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(ViewGroup viewGroup, r rVar, r rVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        boolean z10;
        Animator m10;
        View view;
        Animator animator;
        q qVar;
        Animator animator2;
        q qVar2;
        ViewGroup viewGroup2 = viewGroup;
        p.b<Animator, b> q10 = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            q qVar3 = arrayList.get(i10);
            q qVar4 = arrayList2.get(i10);
            if (qVar3 != null && !qVar3.c.contains(this)) {
                qVar3 = null;
            }
            if (qVar4 != null && !qVar4.c.contains(this)) {
                qVar4 = null;
            }
            if (qVar3 != null || qVar4 != null) {
                if (qVar3 != null && qVar4 != null && !t(qVar3, qVar4)) {
                    z10 = false;
                    if (z10 && (m10 = m(viewGroup2, qVar3, qVar4)) != null) {
                        if (qVar4 == null) {
                            String[] r3 = r();
                            view = qVar4.f11427b;
                            if (r3 != null && r3.length > 0) {
                                qVar2 = new q(view);
                                q orDefault = rVar2.f11428a.getOrDefault(view, null);
                                if (orDefault != null) {
                                    int i11 = 0;
                                    while (i11 < r3.length) {
                                        HashMap hashMap = qVar2.f11426a;
                                        Animator animator3 = m10;
                                        String str = r3[i11];
                                        hashMap.put(str, orDefault.f11426a.get(str));
                                        i11++;
                                        m10 = animator3;
                                        r3 = r3;
                                    }
                                }
                                Animator animator4 = m10;
                                int i12 = q10.f16580k;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < i12) {
                                        b orDefault2 = q10.getOrDefault(q10.i(i13), null);
                                        if (orDefault2.c != null && orDefault2.f11409a == view && orDefault2.f11410b.equals(this.f11392i) && orDefault2.c.equals(qVar2)) {
                                            animator2 = null;
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        animator2 = animator4;
                                        break;
                                    }
                                }
                            } else {
                                animator2 = m10;
                                qVar2 = null;
                            }
                            animator = animator2;
                            qVar = qVar2;
                        } else {
                            view = qVar3.f11427b;
                            animator = m10;
                            qVar = null;
                        }
                        if (animator == null) {
                            String str2 = this.f11392i;
                            v vVar = t.f11432a;
                            q10.put(animator, new b(view, str2, this, new b0(viewGroup2), qVar));
                            this.f11408z.add(animator);
                        }
                        i10++;
                        viewGroup2 = viewGroup;
                    }
                }
                z10 = true;
                if (z10) {
                    if (qVar4 == null) {
                    }
                    if (animator == null) {
                    }
                    i10++;
                    viewGroup2 = viewGroup;
                }
            }
            i10++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = this.f11408z.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i14) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i10 = this.f11404v - 1;
        this.f11404v = i10;
        if (i10 == 0) {
            ArrayList<d> arrayList = this.f11407y;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f11407y.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((d) arrayList2.get(i11)).e(this);
                }
            }
            for (int i12 = 0; i12 < this.f11397o.c.L(); i12++) {
                View M = this.f11397o.c.M(i12);
                if (M != null) {
                    WeakHashMap<View, v0> weakHashMap = j0.f188a;
                    j0.d.r(M, false);
                }
            }
            for (int i13 = 0; i13 < this.f11398p.c.L(); i13++) {
                View M2 = this.f11398p.c.M(i13);
                if (M2 != null) {
                    WeakHashMap<View, v0> weakHashMap2 = j0.f188a;
                    j0.d.r(M2, false);
                }
            }
            this.f11406x = true;
        }
    }

    public final q p(View view, boolean z10) {
        o oVar = this.f11399q;
        if (oVar != null) {
            return oVar.p(view, z10);
        }
        ArrayList<q> arrayList = z10 ? this.f11401s : this.f11402t;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            q qVar = arrayList.get(i10);
            if (qVar == null) {
                return null;
            }
            if (qVar.f11427b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f11402t : this.f11401s).get(i10);
        }
        return null;
    }

    public String[] r() {
        return null;
    }

    public final q s(View view, boolean z10) {
        r rVar;
        o oVar = this.f11399q;
        if (oVar != null) {
            return oVar.s(view, z10);
        }
        if (z10) {
            rVar = this.f11397o;
        } else {
            rVar = this.f11398p;
        }
        return rVar.f11428a.getOrDefault(view, null);
    }

    public boolean t(q qVar, q qVar2) {
        if (qVar == null || qVar2 == null) {
            return false;
        }
        String[] r3 = r();
        if (r3 == null) {
            for (String str : qVar.f11426a.keySet()) {
                if (v(qVar, qVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : r3) {
            if (!v(qVar, qVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public final String toString() {
        return I("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f11396m;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.n;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void w(View view) {
        int i10;
        if (!this.f11406x) {
            p.b<Animator, b> q10 = q();
            int i11 = q10.f16580k;
            v vVar = t.f11432a;
            WindowId windowId = view.getWindowId();
            int i12 = i11 - 1;
            while (true) {
                i10 = 0;
                if (i12 < 0) {
                    break;
                }
                b k3 = q10.k(i12);
                if (k3.f11409a != null) {
                    c0 c0Var = k3.f11411d;
                    if ((c0Var instanceof b0) && ((b0) c0Var).f11378a.equals(windowId)) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        q10.i(i12).pause();
                    }
                }
                i12--;
            }
            ArrayList<d> arrayList = this.f11407y;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f11407y.clone();
                int size = arrayList2.size();
                while (i10 < size) {
                    ((d) arrayList2.get(i10)).b();
                    i10++;
                }
            }
            this.f11405w = true;
        }
    }

    public void x(d dVar) {
        ArrayList<d> arrayList = this.f11407y;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(dVar);
        if (this.f11407y.size() == 0) {
            this.f11407y = null;
        }
    }

    public void y(View view) {
        this.n.remove(view);
    }

    public void z(ViewGroup viewGroup) {
        boolean z10;
        if (this.f11405w) {
            if (!this.f11406x) {
                p.b<Animator, b> q10 = q();
                int i10 = q10.f16580k;
                v vVar = t.f11432a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    b k3 = q10.k(i11);
                    if (k3.f11409a != null) {
                        c0 c0Var = k3.f11411d;
                        if ((c0Var instanceof b0) && ((b0) c0Var).f11378a.equals(windowId)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            q10.i(i11).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.f11407y;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f11407y.clone();
                    int size = arrayList2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((d) arrayList2.get(i12)).c();
                    }
                }
            }
            this.f11405w = false;
        }
    }
}
