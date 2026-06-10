package t4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import m7.n;
import u4.h;
import u4.i;
import v7.g;
import w4.s;

/* loaded from: classes.dex */
public abstract class c<T> implements s4.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f17569a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f17570b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public T f17571d;

    /* renamed from: e  reason: collision with root package name */
    public a f17572e;

    /* loaded from: classes.dex */
    public interface a {
        void a(ArrayList arrayList);

        void b(ArrayList arrayList);
    }

    public c(h<T> hVar) {
        g.f(hVar, "tracker");
        this.f17569a = hVar;
        this.f17570b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override // s4.a
    public final void a(T t10) {
        this.f17571d = t10;
        e(this.f17572e, t10);
    }

    public abstract boolean b(s sVar);

    public abstract boolean c(T t10);

    public final void d(Collection collection) {
        g.f(collection, "workSpecs");
        this.f17570b.clear();
        this.c.clear();
        ArrayList arrayList = this.f17570b;
        for (T t10 : collection) {
            if (b((s) t10)) {
                arrayList.add(t10);
            }
        }
        ArrayList arrayList2 = this.f17570b;
        ArrayList arrayList3 = this.c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((s) it.next()).f18334a);
        }
        if (this.f17570b.isEmpty()) {
            this.f17569a.b(this);
        } else {
            h<T> hVar = this.f17569a;
            hVar.getClass();
            synchronized (hVar.c) {
                if (hVar.f17789d.add(this)) {
                    if (hVar.f17789d.size() == 1) {
                        hVar.f17790e = hVar.a();
                        n4.g d5 = n4.g.d();
                        String str = i.f17791a;
                        d5.a(str, hVar.getClass().getSimpleName() + ": initial state = " + hVar.f17790e);
                        hVar.d();
                    }
                    a(hVar.f17790e);
                }
                n nVar = n.f16010a;
            }
        }
        e(this.f17572e, this.f17571d);
    }

    public final void e(a aVar, T t10) {
        ArrayList arrayList = this.f17570b;
        if (!arrayList.isEmpty() && aVar != null) {
            if (t10 != null && !c(t10)) {
                aVar.a(arrayList);
                return;
            }
            aVar.b(arrayList);
        }
    }
}
