package h4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.n0;
import h4.j;
import java.util.ArrayList;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class f extends n0 {

    /* loaded from: classes.dex */
    public class a implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f11382a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f11383b;

        public a(View view, ArrayList arrayList) {
            this.f11382a = view;
            this.f11383b = arrayList;
        }

        @Override // h4.j.d
        public final void a(j jVar) {
            jVar.x(this);
            jVar.a(this);
        }

        @Override // h4.j.d
        public final void b() {
        }

        @Override // h4.j.d
        public final void c() {
        }

        @Override // h4.j.d
        public final void d() {
        }

        @Override // h4.j.d
        public final void e(j jVar) {
            jVar.x(this);
            this.f11382a.setVisibility(8);
            ArrayList arrayList = this.f11383b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) arrayList.get(i10)).setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f11384a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f11385b;
        public final /* synthetic */ Object c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f11386d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f11387e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f11388f;

        public b(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f11384a = obj;
            this.f11385b = arrayList;
            this.c = obj2;
            this.f11386d = arrayList2;
            this.f11387e = obj3;
            this.f11388f = arrayList3;
        }

        @Override // h4.m, h4.j.d
        public final void a(j jVar) {
            f fVar = f.this;
            Object obj = this.f11384a;
            if (obj != null) {
                fVar.u(obj, this.f11385b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                fVar.u(obj2, this.f11386d, null);
            }
            Object obj3 = this.f11387e;
            if (obj3 != null) {
                fVar.u(obj3, this.f11388f, null);
            }
        }

        @Override // h4.j.d
        public final void e(j jVar) {
            jVar.x(this);
        }
    }

    /* loaded from: classes.dex */
    public class c extends j.c {
    }

    @Override // androidx.fragment.app.n0
    public final void a(View view, Object obj) {
        if (obj != null) {
            ((j) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.n0
    public final void b(Object obj, ArrayList<View> arrayList) {
        boolean z10;
        j jVar;
        j jVar2 = (j) obj;
        if (jVar2 == null) {
            return;
        }
        int i10 = 0;
        if (jVar2 instanceof o) {
            o oVar = (o) jVar2;
            int size = oVar.F.size();
            while (i10 < size) {
                if (i10 >= 0 && i10 < oVar.F.size()) {
                    jVar = oVar.F.get(i10);
                    b(jVar, arrayList);
                    i10++;
                }
                jVar = null;
                b(jVar, arrayList);
                i10++;
            }
            return;
        }
        if (n0.h(jVar2.f11396m) && n0.h(null) && n0.h(null)) {
            z10 = false;
            if (z10 && n0.h(jVar2.n)) {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    jVar2.b(arrayList.get(i10));
                    i10++;
                }
                return;
            }
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // androidx.fragment.app.n0
    public final void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (j) obj);
    }

    @Override // androidx.fragment.app.n0
    public final boolean e(Object obj) {
        return obj instanceof j;
    }

    @Override // androidx.fragment.app.n0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((j) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.n0
    public final Object i(Object obj, Object obj2, Object obj3) {
        j jVar = (j) obj;
        j jVar2 = (j) obj2;
        j jVar3 = (j) obj3;
        if (jVar != null && jVar2 != null) {
            o oVar = new o();
            oVar.J(jVar);
            oVar.J(jVar2);
            oVar.G = false;
            jVar = oVar;
        } else if (jVar == null) {
            if (jVar2 != null) {
                jVar = jVar2;
            } else {
                jVar = null;
            }
        }
        if (jVar3 != null) {
            o oVar2 = new o();
            if (jVar != null) {
                oVar2.J(jVar);
            }
            oVar2.J(jVar3);
            return oVar2;
        }
        return jVar;
    }

    @Override // androidx.fragment.app.n0
    public final Object j(Object obj, Object obj2, Object obj3) {
        o oVar = new o();
        if (obj != null) {
            oVar.J((j) obj);
        }
        if (obj2 != null) {
            oVar.J((j) obj2);
        }
        if (obj3 != null) {
            oVar.J((j) obj3);
        }
        return oVar;
    }

    @Override // androidx.fragment.app.n0
    public final void l(Object obj, View view, ArrayList<View> arrayList) {
        ((j) obj).a(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.n0
    public final void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((j) obj).a(new b(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.n0
    public final void n(View view, Object obj) {
        if (view != null) {
            n0.g(view, new Rect());
            ((j) obj).C(new e());
        }
    }

    @Override // androidx.fragment.app.n0
    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((j) obj).C(new c());
        }
    }

    @Override // androidx.fragment.app.n0
    public final void p(Object obj, v2.d dVar, Runnable runnable) {
        j jVar = (j) obj;
        dVar.b(new g(jVar));
        jVar.a(new h(runnable));
    }

    @Override // androidx.fragment.app.n0
    public final void r(Object obj, View view, ArrayList<View> arrayList) {
        o oVar = (o) obj;
        ArrayList<View> arrayList2 = oVar.n;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0.d(arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(oVar, arrayList);
    }

    @Override // androidx.fragment.app.n0
    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        o oVar = (o) obj;
        if (oVar != null) {
            ArrayList<View> arrayList3 = oVar.n;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            u(oVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.n0
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        o oVar = new o();
        oVar.J((j) obj);
        return oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        boolean z10;
        int size;
        j jVar;
        j jVar2 = (j) obj;
        int i10 = 0;
        if (jVar2 instanceof o) {
            o oVar = (o) jVar2;
            int size2 = oVar.F.size();
            while (i10 < size2) {
                if (i10 >= 0 && i10 < oVar.F.size()) {
                    jVar = oVar.F.get(i10);
                    u(jVar, arrayList, arrayList2);
                    i10++;
                }
                jVar = null;
                u(jVar, arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (n0.h(jVar2.f11396m) && n0.h(null) && n0.h(null)) {
            z10 = false;
            if (z10) {
                ArrayList<View> arrayList3 = jVar2.n;
                if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                    if (arrayList2 == null) {
                        size = 0;
                    } else {
                        size = arrayList2.size();
                    }
                    while (i10 < size) {
                        jVar2.b(arrayList2.get(i10));
                        i10++;
                    }
                    int size3 = arrayList.size();
                    while (true) {
                        size3--;
                        if (size3 >= 0) {
                            jVar2.y(arrayList.get(size3));
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        z10 = true;
        if (z10) {
        }
    }
}
