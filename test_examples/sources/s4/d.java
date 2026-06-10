package s4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import m7.n;
import t4.c;
import t4.f;
import u4.h;
import u4.o;
import v7.g;
import w4.s;

/* loaded from: classes.dex */
public final class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final c f17274a;

    /* renamed from: b  reason: collision with root package name */
    public final t4.c<?>[] f17275b;
    public final Object c;

    public d(o oVar, c cVar) {
        g.f(oVar, "trackers");
        Object obj = oVar.f17799b;
        t4.c<?>[] cVarArr = {new t4.a((h) oVar.f17798a, 0), new t4.b((u4.c) oVar.f17800d), new t4.b((h) oVar.c), new t4.d((h) obj), new t4.a((h) obj, 1), new f((h) obj), new t4.e((h) obj)};
        this.f17274a = cVar;
        this.f17275b = cVarArr;
        this.c = new Object();
    }

    @Override // t4.c.a
    public final void a(ArrayList arrayList) {
        g.f(arrayList, "workSpecs");
        synchronized (this.c) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (c(((s) next).f18334a)) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                n4.g d5 = n4.g.d();
                String str = e.f17276a;
                d5.a(str, "Constraints met for " + ((s) it2.next()));
            }
            c cVar = this.f17274a;
            if (cVar != null) {
                cVar.d(arrayList2);
                n nVar = n.f16010a;
            }
        }
    }

    @Override // t4.c.a
    public final void b(ArrayList arrayList) {
        g.f(arrayList, "workSpecs");
        synchronized (this.c) {
            c cVar = this.f17274a;
            if (cVar != null) {
                cVar.b(arrayList);
                n nVar = n.f16010a;
            }
        }
    }

    public final boolean c(String str) {
        boolean z10;
        t4.c<?> cVar;
        boolean z11;
        g.f(str, "workSpecId");
        synchronized (this.c) {
            t4.c<?>[] cVarArr = this.f17275b;
            int length = cVarArr.length;
            z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    cVar = cVarArr[i10];
                    cVar.getClass();
                    Object obj = cVar.f17571d;
                    if (obj != null && cVar.c(obj) && cVar.c.contains(str)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                    i10++;
                } else {
                    cVar = null;
                    break;
                }
            }
            if (cVar != null) {
                n4.g d5 = n4.g.d();
                String str2 = e.f17276a;
                d5.a(str2, "Work " + str + " constrained by " + cVar.getClass().getSimpleName());
            }
            if (cVar == null) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void d(Collection collection) {
        t4.c<?>[] cVarArr;
        t4.c<?>[] cVarArr2;
        g.f(collection, "workSpecs");
        synchronized (this.c) {
            for (t4.c<?> cVar : this.f17275b) {
                if (cVar.f17572e != null) {
                    cVar.f17572e = null;
                    cVar.e(null, cVar.f17571d);
                }
            }
            for (t4.c<?> cVar2 : this.f17275b) {
                cVar2.d(collection);
            }
            for (t4.c<?> cVar3 : this.f17275b) {
                if (cVar3.f17572e != this) {
                    cVar3.f17572e = this;
                    cVar3.e(this, cVar3.f17571d);
                }
            }
            n nVar = n.f16010a;
        }
    }

    public final void e() {
        t4.c<?>[] cVarArr;
        synchronized (this.c) {
            for (t4.c<?> cVar : this.f17275b) {
                ArrayList arrayList = cVar.f17570b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    cVar.f17569a.b(cVar);
                }
            }
            n nVar = n.f16010a;
        }
    }
}
