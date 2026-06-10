package androidx.compose.ui.semantics;

import o1.j;
import v7.g;

/* loaded from: classes.dex */
public final class SemanticsConfigurationKt {
    public static final <T> T a(j jVar, a<T> aVar) {
        g.f(jVar, "<this>");
        g.f(aVar, "key");
        g.f(SemanticsConfigurationKt$getOrNull$1.f3934j, "defaultValue");
        T t10 = (T) jVar.f16206i.get(aVar);
        if (t10 == null) {
            return null;
        }
        return t10;
    }
}
