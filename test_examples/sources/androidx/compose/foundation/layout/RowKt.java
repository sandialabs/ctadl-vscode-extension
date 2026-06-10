package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.b;
import g0.d;
import j1.q;
import ma.i;
import q0.a;
import q0.b;
import v.f;
import v7.g;

/* loaded from: classes.dex */
public final class RowKt {

    /* renamed from: a  reason: collision with root package name */
    public static final RowColumnImplKt$rowColumnMeasurePolicy$1 f1954a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        b.i iVar = b.f1998a;
        int i10 = f.f18048a;
        f1954a = i.K(0, new f.e(a.C0210a.f16814d), layoutOrientation, RowKt$DefaultRowMeasurePolicy$1.f1955j);
    }

    public static final q a(b.d dVar, b.C0211b c0211b, d dVar2) {
        RowColumnImplKt$rowColumnMeasurePolicy$1 K;
        g.f(dVar, "horizontalArrangement");
        dVar2.f(-837807694);
        dVar2.f(511388516);
        boolean z10 = dVar2.z(dVar) | dVar2.z(c0211b);
        Object g10 = dVar2.g();
        if (z10 || g10 == d.a.f11039a) {
            if (g.a(dVar, b.f1998a) && g.a(c0211b, a.C0210a.f16814d)) {
                K = f1954a;
            } else {
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                float a10 = dVar.a();
                int i10 = f.f18048a;
                K = i.K(a10, new f.e(c0211b), layoutOrientation, new RowKt$rowMeasurePolicy$1$1(dVar));
            }
            g10 = K;
            dVar2.q(g10);
        }
        dVar2.u();
        q qVar = (q) g10;
        dVar2.u();
        return qVar;
    }
}
