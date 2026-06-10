package g1;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.NodeCoordinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import l1.e0;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: b  reason: collision with root package name */
    public final e0 f11151b;
    public final h0.e<n> c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f11152d;

    /* renamed from: e  reason: collision with root package name */
    public NodeCoordinator f11153e;

    /* renamed from: f  reason: collision with root package name */
    public k f11154f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11155g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11156h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11157i;

    public i(e0 e0Var) {
        v7.g.f(e0Var, "pointerInputNode");
        this.f11151b = e0Var;
        this.c = new h0.e<>(new n[16]);
        this.f11152d = new LinkedHashMap();
        this.f11156h = true;
        this.f11157i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b5, code lost:
        if (r11 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d7, code lost:
        if (r4 != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    @Override // g1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Map<n, o> map, j1.h hVar, f fVar, boolean z10) {
        LinkedHashMap linkedHashMap;
        h0.e<n> eVar;
        o oVar;
        boolean z11;
        boolean z12;
        boolean z13;
        NodeCoordinator nodeCoordinator;
        boolean z14;
        boolean z15;
        int i10;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        float f10;
        i iVar = this;
        j1.h hVar2 = hVar;
        v7.g.f(map, "changes");
        v7.g.f(hVar2, "parentCoordinates");
        boolean a10 = super.a(map, hVar, fVar, z10);
        e0 e0Var = iVar.f11151b;
        if (!m0.b.A0(e0Var)) {
            return true;
        }
        iVar.f11153e = v0.p.D(e0Var, 16);
        Iterator<Map.Entry<n, o>> it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = iVar.f11152d;
            int i11 = 0;
            eVar = iVar.c;
            if (!hasNext) {
                break;
            }
            Map.Entry<n, o> next = it.next();
            long j2 = next.getKey().f11161a;
            o value = next.getValue();
            if (eVar.h(new n(j2))) {
                ArrayList arrayList = new ArrayList();
                List list = value.f11171k;
                if (list == null) {
                    list = EmptyList.f12981i;
                }
                int size = list.size();
                while (i11 < size) {
                    e eVar2 = (e) list.get(i11);
                    List list2 = list;
                    long j10 = eVar2.f11141a;
                    Iterator<Map.Entry<n, o>> it2 = it;
                    NodeCoordinator nodeCoordinator2 = iVar.f11153e;
                    v7.g.c(nodeCoordinator2);
                    arrayList.add(new e(j10, nodeCoordinator2.c1(hVar2, eVar2.f11142b)));
                    i11++;
                    list = list2;
                    size = size;
                    it = it2;
                    a10 = a10;
                }
                boolean z21 = a10;
                Iterator<Map.Entry<n, o>> it3 = it;
                n nVar = new n(j2);
                NodeCoordinator nodeCoordinator3 = iVar.f11153e;
                v7.g.c(nodeCoordinator3);
                long c12 = nodeCoordinator3.c1(hVar2, value.f11166f);
                NodeCoordinator nodeCoordinator4 = iVar.f11153e;
                v7.g.c(nodeCoordinator4);
                long c13 = nodeCoordinator4.c1(hVar2, value.c);
                long j11 = value.f11162a;
                long j12 = value.f11163b;
                boolean z22 = value.f11164d;
                long j13 = value.f11165e;
                boolean z23 = value.f11167g;
                int i12 = value.f11168h;
                long j14 = value.f11169i;
                Float f11 = value.f11170j;
                if (f11 != null) {
                    f10 = f11.floatValue();
                } else {
                    f10 = 0.0f;
                }
                o oVar2 = new o(j11, j12, c13, z22, f10, j13, c12, z23, i12, arrayList, j14);
                oVar2.f11172l = value.f11172l;
                linkedHashMap.put(nVar, oVar2);
                iVar = this;
                hVar2 = hVar;
                it = it3;
                a10 = z21;
            } else {
                iVar = this;
                hVar2 = hVar;
            }
        }
        boolean z24 = a10;
        if (linkedHashMap.isEmpty()) {
            eVar.g();
            this.f11158a.g();
            return true;
        }
        for (int i13 = eVar.f11334k - 1; -1 < i13; i13--) {
            if (!map.containsKey(new n(eVar.f11332i[i13].f11161a))) {
                eVar.n(i13);
            }
        }
        k kVar = new k(kotlin.collections.c.L2(linkedHashMap.values()), fVar);
        List<o> list3 = kVar.f11159a;
        int size2 = list3.size();
        int i14 = 0;
        while (true) {
            if (i14 < size2) {
                oVar = list3.get(i14);
                if (fVar.a(oVar.f11162a)) {
                    break;
                }
                i14++;
            } else {
                oVar = null;
                break;
            }
        }
        o oVar3 = oVar;
        if (oVar3 != null) {
            boolean z25 = oVar3.f11164d;
            if (!z10) {
                this.f11156h = false;
            } else if (!this.f11156h && (z25 || oVar3.f11167g)) {
                v7.g.c(this.f11153e);
                this.f11156h = !v0.p.u(oVar3, nodeCoordinator.f12642k);
                z14 = this.f11156h;
                z15 = this.f11155g;
                int i15 = 4;
                if (z14 != z15) {
                    int i16 = kVar.f11160b;
                    if (i16 == 3) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (!z18) {
                        if (i16 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (!z19) {
                            if (i16 == 5) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                        }
                    }
                    if (!z14) {
                        i15 = 5;
                    }
                    kVar.f11160b = i15;
                }
                i10 = kVar.f11160b;
                if (i10 != 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16 || !z15 || this.f11157i) {
                    if (i10 != 5) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        if (z14) {
                        }
                    }
                }
                kVar.f11160b = 3;
            }
            z14 = this.f11156h;
            z15 = this.f11155g;
            int i152 = 4;
            if (z14 != z15) {
            }
            i10 = kVar.f11160b;
            if (i10 != 4) {
            }
            if (z16) {
            }
            if (i10 != 5) {
            }
            if (z17) {
            }
        }
        if (!z24) {
            if (kVar.f11160b == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                k kVar2 = this.f11154f;
                if (kVar2 != null) {
                    List<o> list4 = kVar2.f11159a;
                    if (list4.size() == list3.size()) {
                        int size3 = list3.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            if (u0.c.a(list4.get(i17).c, list3.get(i17).c)) {
                            }
                        }
                        z13 = false;
                        if (z13) {
                            z11 = false;
                            this.f11154f = kVar;
                            return z11;
                        }
                    }
                }
                z13 = true;
                if (z13) {
                }
            }
        }
        z11 = true;
        this.f11154f = kVar;
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        r10.c.l(new g1.n(r8));
     */
    @Override // g1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(f fVar) {
        super.b(fVar);
        k kVar = this.f11154f;
        if (kVar == null) {
            return;
        }
        this.f11155g = this.f11156h;
        List<o> list = kVar.f11159a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= size) {
                break;
            }
            o oVar = list.get(i10);
            boolean z12 = oVar.f11164d;
            long j2 = oVar.f11162a;
            if (z12 || (fVar.a(j2) && this.f11156h)) {
                z11 = false;
            }
            i10++;
        }
        this.f11156h = false;
        if (kVar.f11160b == 5) {
            z10 = true;
        }
        this.f11157i = z10;
    }

    @Override // g1.j
    public final void c() {
        h0.e<i> eVar = this.f11158a;
        int i10 = eVar.f11334k;
        if (i10 > 0) {
            i[] iVarArr = eVar.f11332i;
            v7.g.d(iVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            do {
                iVarArr[i11].c();
                i11++;
            } while (i11 < i10);
            this.f11151b.k();
        }
        this.f11151b.k();
    }

    @Override // g1.j
    public final boolean d(f fVar) {
        h0.e<i> eVar;
        int i10;
        LinkedHashMap linkedHashMap = this.f11152d;
        int i11 = 0;
        r2 = false;
        boolean z10 = false;
        if (!linkedHashMap.isEmpty()) {
            e0 e0Var = this.f11151b;
            if (m0.b.A0(e0Var)) {
                k kVar = this.f11154f;
                v7.g.c(kVar);
                NodeCoordinator nodeCoordinator = this.f11153e;
                v7.g.c(nodeCoordinator);
                e0Var.d(kVar, PointerEventPass.Final, nodeCoordinator.f12642k);
                if (m0.b.A0(e0Var) && (i10 = (eVar = this.f11158a).f11334k) > 0) {
                    i[] iVarArr = eVar.f11332i;
                    v7.g.d(iVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    do {
                        iVarArr[i11].d(fVar);
                        i11++;
                    } while (i11 < i10);
                    z10 = true;
                } else {
                    z10 = true;
                }
            }
        }
        b(fVar);
        linkedHashMap.clear();
        this.f11153e = null;
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // g1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Map<n, o> map, j1.h hVar, f fVar, boolean z10) {
        h0.e<i> eVar;
        int i10;
        v7.g.f(map, "changes");
        v7.g.f(hVar, "parentCoordinates");
        LinkedHashMap linkedHashMap = this.f11152d;
        int i11 = 0;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        e0 e0Var = this.f11151b;
        if (!m0.b.A0(e0Var)) {
            return false;
        }
        k kVar = this.f11154f;
        v7.g.c(kVar);
        NodeCoordinator nodeCoordinator = this.f11153e;
        v7.g.c(nodeCoordinator);
        long j2 = nodeCoordinator.f12642k;
        e0Var.d(kVar, PointerEventPass.Initial, j2);
        if (m0.b.A0(e0Var) && (i10 = (eVar = this.f11158a).f11334k) > 0) {
            i[] iVarArr = eVar.f11332i;
            v7.g.d(iVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                NodeCoordinator nodeCoordinator2 = this.f11153e;
                v7.g.c(nodeCoordinator2);
                iVarArr[i11].e(linkedHashMap, nodeCoordinator2, fVar, z10);
                i11++;
            } while (i11 < i10);
            if (m0.b.A0(e0Var)) {
            }
            return true;
        }
        if (m0.b.A0(e0Var)) {
            e0Var.d(kVar, PointerEventPass.Main, j2);
        }
        return true;
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.f11151b + ", children=" + this.f11158a + ", pointerIds=" + this.c + ')';
    }
}
