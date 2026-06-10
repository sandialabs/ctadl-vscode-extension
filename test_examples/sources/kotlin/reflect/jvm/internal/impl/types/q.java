package kotlin.reflect.jvm.internal.impl.types;

import y9.f0;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15072a = new a();

    /* loaded from: classes.dex */
    public static final class a extends q {
        @Override // kotlin.reflect.jvm.internal.impl.types.q
        public final f0 d(y9.r rVar) {
            return null;
        }

        public final String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public m8.e c(m8.e eVar) {
        v7.g.f(eVar, "annotations");
        return eVar;
    }

    public abstract f0 d(y9.r rVar);

    public boolean e() {
        return this instanceof a;
    }

    public y9.r f(y9.r rVar, Variance variance) {
        v7.g.f(rVar, "topLevelType");
        v7.g.f(variance, "position");
        return rVar;
    }
}
