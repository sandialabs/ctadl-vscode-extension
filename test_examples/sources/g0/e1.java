package g0;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11042a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11043b;

    public e1(int i10) {
        if (i10 == 2) {
            this.f11042a = new h0.e(new Reference[16]);
            this.f11043b = new ReferenceQueue();
        } else if (i10 != 3) {
            this.f11042a = new AtomicReference(n0.b.f16063a);
            this.f11043b = new Object();
        } else {
            this.f11043b = new Object();
            this.f11042a = new LinkedHashMap();
        }
    }

    public /* synthetic */ e1(androidx.compose.ui.node.b bVar) {
        v7.g.f(bVar, "rootCoordinates");
        this.f11042a = bVar;
        this.f11043b = new g1.j();
    }

    public /* synthetic */ e1(Object obj) {
        this.f11043b = obj;
        this.f11042a = Thread.currentThread();
    }

    public final void a(long j2, l1.f fVar) {
        g1.i iVar;
        v7.g.f(fVar, "pointerInputNodes");
        g1.i iVar2 = (g1.j) this.f11043b;
        int i10 = fVar.f15732l;
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            l1.e0 e0Var = (l1.e0) fVar.f15729i[i11];
            if (z10) {
                h0.e<g1.i> eVar = iVar2.f11158a;
                int i12 = eVar.f11334k;
                if (i12 > 0) {
                    g1.i[] iVarArr = eVar.f11332i;
                    v7.g.d(iVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i13 = 0;
                    do {
                        iVar = iVarArr[i13];
                        if (v7.g.a(iVar.f11151b, e0Var)) {
                            break;
                        }
                        i13++;
                    } while (i13 < i12);
                    iVar = null;
                } else {
                    iVar = null;
                }
                g1.i iVar3 = iVar;
                if (iVar3 != null) {
                    iVar3.f11156h = true;
                    g1.n nVar = new g1.n(j2);
                    h0.e<g1.n> eVar2 = iVar3.c;
                    if (!eVar2.h(nVar)) {
                        eVar2.b(new g1.n(j2));
                    }
                    iVar2 = iVar3;
                } else {
                    z10 = false;
                }
            }
            g1.i iVar4 = new g1.i(e0Var);
            iVar4.c.b(new g1.n(j2));
            iVar2.f11158a.b(iVar4);
            iVar2 = iVar4;
        }
    }

    public final void b() {
        Reference poll;
        do {
            poll = ((ReferenceQueue) this.f11043b).poll();
            if (poll != null) {
                ((h0.e) this.f11042a).l(poll);
                continue;
            }
        } while (poll != null);
    }

    public final boolean c(w4.l lVar) {
        boolean containsKey;
        synchronized (this.f11043b) {
            containsKey = ((Map) this.f11042a).containsKey(lVar);
        }
        return containsKey;
    }

    public final Object d() {
        n0.a aVar = (n0.a) ((AtomicReference) this.f11042a).get();
        int a10 = aVar.a(Thread.currentThread().getId());
        if (a10 >= 0) {
            return aVar.c[a10];
        }
        return null;
    }

    public final List e(String str) {
        List L2;
        v7.g.f(str, "workSpecId");
        synchronized (this.f11043b) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) this.f11042a).entrySet()) {
                if (v7.g.a(((w4.l) entry.getKey()).f18326a, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (w4.l lVar : linkedHashMap.keySet()) {
                ((Map) this.f11042a).remove(lVar);
            }
            L2 = kotlin.collections.c.L2(linkedHashMap.values());
        }
        return L2;
    }

    public final o4.t f(w4.l lVar) {
        o4.t tVar;
        v7.g.f(lVar, "id");
        synchronized (this.f11043b) {
            tVar = (o4.t) ((Map) this.f11042a).remove(lVar);
        }
        return tVar;
    }

    public final void g(Object obj) {
        boolean z10;
        long id = Thread.currentThread().getId();
        synchronized (this.f11043b) {
            n0.a aVar = (n0.a) ((AtomicReference) this.f11042a).get();
            int a10 = aVar.a(id);
            if (a10 < 0) {
                z10 = false;
            } else {
                aVar.c[a10] = obj;
                z10 = true;
            }
            if (z10) {
                return;
            }
            ((AtomicReference) this.f11042a).set(aVar.b(id, obj));
            m7.n nVar = m7.n.f16010a;
        }
    }

    public final o4.t h(w4.l lVar) {
        o4.t tVar;
        synchronized (this.f11043b) {
            Map map = (Map) this.f11042a;
            Object obj = map.get(lVar);
            if (obj == null) {
                obj = new o4.t(lVar);
                map.put(lVar, obj);
            }
            tVar = (o4.t) obj;
        }
        return tVar;
    }
}
