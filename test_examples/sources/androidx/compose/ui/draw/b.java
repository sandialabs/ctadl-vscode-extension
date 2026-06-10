package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import m7.n;
import q0.d;
import u7.l;
import v0.c0;
import v0.h0;
import v0.v;
import v7.g;

/* loaded from: classes.dex */
public final class b {
    public static d a(d dVar, float f10, h0 h0Var, int i10) {
        boolean z10;
        long j2;
        long j10;
        if ((i10 & 2) != 0) {
            h0Var = c0.f18087a;
        }
        h0 h0Var2 = h0Var;
        if ((i10 & 4) != 0 && Float.compare(f10, 0) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            j2 = v.f18139a;
        } else {
            j2 = 0;
        }
        if ((i10 & 16) != 0) {
            j10 = v.f18139a;
        } else {
            j10 = 0;
        }
        g.f(dVar, "$this$shadow");
        g.f(h0Var2, "shape");
        if (Float.compare(f10, 0) > 0 || z10) {
            l<n0, n> lVar = InspectableValueKt.f3744a;
            return InspectableValueKt.a(dVar, lVar, new BlockGraphicsLayerModifier(new ShadowKt$shadow$2$1(f10, h0Var2, z10, j2, j10), lVar));
        }
        return dVar;
    }
}
