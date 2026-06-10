package ca;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.o;
import v7.g;
import y9.e0;
import y9.f0;
import y9.h0;

/* loaded from: classes.dex */
public final class b extends o {
    @Override // kotlin.reflect.jvm.internal.impl.types.o
    public final f0 g(e0 e0Var) {
        g.f(e0Var, "key");
        l9.b bVar = e0Var instanceof l9.b ? (l9.b) e0Var : null;
        if (bVar == null) {
            return null;
        }
        if (bVar.b().d()) {
            return new h0(bVar.b().b(), Variance.OUT_VARIANCE);
        }
        return bVar.b();
    }
}
