package kotlin.reflect.jvm.internal.impl.types;

import l8.h0;
import l8.i0;
import y9.m0;

/* loaded from: classes.dex */
public interface k {

    /* loaded from: classes.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15044a = new a();

        @Override // kotlin.reflect.jvm.internal.impl.types.k
        public final void a(h0 h0Var, m0 m0Var) {
            v7.g.f(h0Var, "typeAlias");
            v7.g.f(m0Var, "substitutedArgument");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.k
        public final void b(m8.c cVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.k
        public final void c(h0 h0Var) {
            v7.g.f(h0Var, "typeAlias");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.k
        public final void d(TypeSubstitutor typeSubstitutor, y9.r rVar, y9.r rVar2, i0 i0Var) {
        }
    }

    void a(h0 h0Var, m0 m0Var);

    void b(m8.c cVar);

    void c(h0 h0Var);

    void d(TypeSubstitutor typeSubstitutor, y9.r rVar, y9.r rVar2, i0 i0Var);
}
