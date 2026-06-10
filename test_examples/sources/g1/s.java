package g1;

import androidx.compose.ui.node.LayoutNode;
import g0.e1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import l1.e0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final LayoutNode f11187a;

    /* renamed from: b  reason: collision with root package name */
    public final e1 f11188b;
    public final p c;

    /* renamed from: d  reason: collision with root package name */
    public final l1.f<e0> f11189d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11190e;

    public s(LayoutNode layoutNode) {
        v7.g.f(layoutNode, "root");
        this.f11187a = layoutNode;
        this.f11188b = new e1(layoutNode.J.f15779b);
        this.c = new p();
        this.f11189d = new l1.f<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1 A[Catch: all -> 0x010f, TryCatch #0 {all -> 0x010f, blocks: (B:6:0x0014, B:8:0x0020, B:10:0x0028, B:29:0x0055, B:30:0x005d, B:33:0x0065, B:35:0x006d, B:37:0x0073, B:41:0x007c, B:43:0x0090, B:44:0x0099, B:53:0x00c8, B:55:0x00d0, B:58:0x00d7, B:59:0x00db, B:61:0x00e1, B:63:0x00f9, B:47:0x00b1, B:13:0x002f, B:14:0x0033, B:16:0x0039, B:18:0x0043), top: B:78:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(q qVar, x xVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        e1 e1Var;
        int i10;
        Collection<o> values;
        boolean z14;
        int i11;
        boolean z15;
        l1.f<e0> fVar = this.f11189d;
        v7.g.f(xVar, "positionCalculator");
        if (this.f11190e) {
            return 0;
        }
        boolean z16 = true;
        try {
            this.f11190e = true;
            f a10 = this.c.a(qVar, xVar);
            Map<n, o> map = a10.f11143a;
            Collection<o> values2 = map.values();
            if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                for (o oVar : values2) {
                    if (!oVar.f11164d && !oVar.f11167g) {
                        z11 = false;
                        continue;
                        if (z11) {
                            z12 = true;
                            break;
                        }
                    }
                    z11 = true;
                    if (z11) {
                    }
                }
            }
            z12 = false;
            if (!z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            Iterator<T> it = map.values().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                e1Var = this.f11188b;
                if (!hasNext) {
                    break;
                }
                o oVar2 = (o) it.next();
                if (z13 || v0.p.f(oVar2)) {
                    if (oVar2.f11168h == 1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    LayoutNode layoutNode = this.f11187a;
                    long j2 = oVar2.c;
                    l1.f<e0> fVar2 = this.f11189d;
                    LayoutNode.b bVar = LayoutNode.S;
                    layoutNode.s(j2, fVar2, z15, true);
                    if (!fVar.isEmpty()) {
                        e1Var.a(oVar2.f11162a, fVar);
                        fVar.clear();
                    }
                }
            }
            ((j) e1Var.f11043b).f();
            Object obj = e1Var.f11043b;
            Object obj2 = e1Var.f11042a;
            if (((j) obj).a(map, (j1.h) obj2, a10, z10)) {
                boolean e10 = ((j) obj).e(map, (j1.h) obj2, a10, z10);
                if (!((j) obj).d(a10)) {
                    if (e10) {
                    }
                }
                i10 = 1;
                values = map.values();
                if ((values instanceof Collection) || !values.isEmpty()) {
                    for (o oVar3 : values) {
                        v7.g.f(oVar3, "<this>");
                        if ((!u0.c.a(v0.p.C(oVar3, true), u0.c.f17721b)) && oVar3.b()) {
                            z14 = true;
                            continue;
                        } else {
                            z14 = false;
                            continue;
                        }
                        if (z14) {
                            break;
                        }
                    }
                }
                z16 = false;
                if (!z16) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                return i10 | i11;
            }
            i10 = 0;
            values = map.values();
            if (values instanceof Collection) {
            }
            while (r2.hasNext()) {
            }
            z16 = false;
            if (!z16) {
            }
            return i10 | i11;
        } finally {
            this.f11190e = false;
        }
    }
}
