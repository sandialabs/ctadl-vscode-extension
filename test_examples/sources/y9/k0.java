package y9;

import kotlin.reflect.jvm.internal.impl.builtins.g;

/* loaded from: classes.dex */
public final class k0 implements u7.l<h9.c, Boolean> {
    @Override // u7.l
    public final Boolean U(h9.c cVar) {
        h9.c cVar2 = cVar;
        if (cVar2 != null) {
            return Boolean.valueOf(!cVar2.equals(g.a.f13382y));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
    }
}
