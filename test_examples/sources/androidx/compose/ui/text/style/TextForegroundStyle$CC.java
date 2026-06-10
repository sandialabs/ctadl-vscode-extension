package androidx.compose.ui.text.style;

import a2.b;
import androidx.compose.ui.text.style.a;
import v7.g;

/* renamed from: androidx.compose.ui.text.style.TextForegroundStyle$-CC  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class TextForegroundStyle$CC {
    public static a a(a aVar, a aVar2) {
        g.f(aVar2, "other");
        boolean z10 = aVar2 instanceof b;
        if (z10 && (aVar instanceof b)) {
            b bVar = (b) aVar2;
            float n = aVar2.n();
            TextForegroundStyle$merge$1 textForegroundStyle$merge$1 = new TextForegroundStyle$merge$1(aVar);
            if (Float.isNaN(n)) {
                n = ((Number) textForegroundStyle$merge$1.k0()).floatValue();
            }
            return new b(bVar.f90a, n);
        } else if (z10 && !(aVar instanceof b)) {
            return aVar2;
        } else {
            if (z10 || !(aVar instanceof b)) {
                return aVar2.b(new TextForegroundStyle$merge$2(aVar));
            }
            return aVar;
        }
    }

    public static a b(a aVar, u7.a aVar2) {
        g.f(aVar2, "other");
        return !g.a(aVar, a.C0028a.f4166a) ? aVar : (a) aVar2.k0();
    }
}
