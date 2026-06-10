package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.b;
import g0.d;
import j1.q;
import ma.i;
import q0.a;
import v.f;
import v7.g;

/* loaded from: classes.dex */
public final class ColumnKt {

    /* renamed from: a  reason: collision with root package name */
    public static final RowColumnImplKt$rowColumnMeasurePolicy$1 f1905a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        b.i iVar = b.f1998a;
        int i10 = f.f18048a;
        f1905a = i.K(0, new f.c(a.C0210a.f16816f), layoutOrientation, ColumnKt$DefaultColumnMeasurePolicy$1.f1906j);
    }

    public static final q a(b.k kVar, a.b bVar, d dVar) {
        RowColumnImplKt$rowColumnMeasurePolicy$1 K;
        g.f(kVar, "verticalArrangement");
        g.f(bVar, "horizontalAlignment");
        dVar.f(1089876336);
        dVar.f(511388516);
        boolean z10 = dVar.z(kVar) | dVar.z(bVar);
        Object g10 = dVar.g();
        if (z10 || g10 == d.a.f11039a) {
            if (g.a(kVar, b.c) && g.a(bVar, a.C0210a.f16816f)) {
                K = f1905a;
            } else {
                LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
                float a10 = kVar.a();
                int i10 = f.f18048a;
                K = i.K(a10, new f.c(bVar), layoutOrientation, new ColumnKt$columnMeasurePolicy$1$1(kVar));
            }
            g10 = K;
            dVar.q(g10);
        }
        dVar.u();
        q qVar = (q) g10;
        dVar.u();
        return qVar;
    }
}
