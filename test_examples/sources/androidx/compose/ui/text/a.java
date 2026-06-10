package androidx.compose.ui.text;

import a1.b;
import a2.d;
import a2.j;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p1.h;
import p1.k;
import p1.l;
import p1.p;
import u1.e;
import u1.i;
import u1.m;
import v0.g0;
import v0.r;
import v7.g;
import w1.c;
import w1.f;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final p a(p pVar, LayoutDirection layoutDirection) {
        p pVar2;
        int i10;
        int i11;
        float f10;
        String str;
        p pVar3;
        c cVar;
        boolean z10;
        long j2;
        int i12;
        boolean z11;
        int i13;
        long j10;
        j jVar;
        d dVar;
        b bVar;
        g.f(pVar, "style");
        int i14 = l.f16686e;
        k kVar = pVar.f16703a;
        g.f(kVar, "style");
        androidx.compose.ui.text.style.a b5 = kVar.f16671a.b(SpanStyleKt$resolveSpanStyleDefaults$1.f4056j);
        long j11 = kVar.f16672b;
        if (b.n0(j11)) {
            j11 = l.f16683a;
        }
        long j12 = j11;
        m mVar = kVar.c;
        if (mVar == null) {
            mVar = m.n;
        }
        m mVar2 = mVar;
        i iVar = kVar.f16673d;
        if (iVar != null) {
            i10 = iVar.f17748a;
        } else {
            i10 = 0;
        }
        i iVar2 = new i(i10);
        u1.j jVar2 = kVar.f16674e;
        if (jVar2 != null) {
            i11 = jVar2.f17749a;
        } else {
            i11 = 1;
        }
        u1.j jVar3 = new u1.j(i11);
        e eVar = kVar.f16675f;
        if (eVar == null) {
            eVar = e.f17740i;
        }
        e eVar2 = eVar;
        String str2 = kVar.f16676g;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        long j13 = kVar.f16677h;
        if (b.n0(j13)) {
            j13 = l.f16684b;
        }
        long j14 = j13;
        a2.a aVar = kVar.f16678i;
        if (aVar != null) {
            f10 = aVar.f89a;
        } else {
            f10 = 0.0f;
        }
        a2.a aVar2 = new a2.a(f10);
        a2.i iVar3 = kVar.f16679j;
        if (iVar3 == null) {
            iVar3 = a2.i.c;
        }
        a2.i iVar4 = iVar3;
        c cVar2 = kVar.f16680k;
        if (cVar2 != null) {
            str = "style";
            pVar3 = pVar2;
            cVar = cVar2;
        } else {
            List<w1.d> a10 = f.f18259a.a();
            pVar3 = pVar2;
            ArrayList arrayList = new ArrayList(a10.size());
            int size = a10.size();
            str = "style";
            int i15 = 0;
            while (i15 < size) {
                int i16 = size;
                arrayList.add(new w1.b(a10.get(i15)));
                i15++;
                a10 = a10;
                size = i16;
            }
            cVar = new c(arrayList);
        }
        long j15 = r.f18133g;
        long j16 = kVar.f16681l;
        if (j16 != j15) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j2 = j16;
        } else {
            j2 = l.c;
        }
        a2.g gVar = kVar.f16682m;
        if (gVar == null) {
            gVar = a2.g.f100b;
        }
        a2.g gVar2 = gVar;
        g0 g0Var = kVar.n;
        if (g0Var == null) {
            g0Var = g0.f18112d;
        }
        k kVar2 = new k(b5, j12, mVar2, iVar2, jVar3, eVar2, str3, j14, aVar2, iVar4, cVar, j2, gVar2, g0Var);
        int i17 = p1.i.f16670b;
        h hVar = pVar.f16704b;
        g.f(hVar, str);
        a2.f fVar = hVar.f16664a;
        if (fVar != null) {
            i12 = fVar.f99a;
        } else {
            i12 = 5;
        }
        a2.f fVar2 = new a2.f(i12);
        a2.h hVar2 = hVar.f16665b;
        if (hVar2 != null && hVar2.f103a == 3) {
            z11 = true;
            if (!z11) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i13 = 5;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i13 = 4;
                }
            } else if (hVar2 == null) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        i13 = 2;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i13 = 1;
                }
            } else {
                i13 = hVar2.f103a;
            }
            a2.h hVar3 = new a2.h(i13);
            j10 = hVar.c;
            if (b.n0(j10)) {
                j10 = p1.i.f16669a;
            }
            jVar = hVar.f16666d;
            if (jVar == null) {
                jVar = j.c;
            }
            j jVar4 = jVar;
            hVar.getClass();
            dVar = hVar.f16667e;
            if (dVar == null) {
                dVar = d.f93d;
            }
            d dVar2 = dVar;
            bVar = hVar.f16668f;
            if (bVar == null) {
                bVar = b.f23e;
            }
            h hVar4 = new h(fVar2, hVar3, j10, jVar4, null, dVar2, bVar);
            pVar.getClass();
            return new p(kVar2, hVar4, null);
        }
        z11 = false;
        if (!z11) {
        }
        a2.h hVar32 = new a2.h(i13);
        j10 = hVar.c;
        if (b.n0(j10)) {
        }
        jVar = hVar.f16666d;
        if (jVar == null) {
        }
        j jVar42 = jVar;
        hVar.getClass();
        dVar = hVar.f16667e;
        if (dVar == null) {
        }
        d dVar22 = dVar;
        bVar = hVar.f16668f;
        if (bVar == null) {
        }
        h hVar42 = new h(fVar2, hVar32, j10, jVar42, null, dVar22, bVar);
        pVar.getClass();
        return new p(kVar2, hVar42, null);
    }
}
