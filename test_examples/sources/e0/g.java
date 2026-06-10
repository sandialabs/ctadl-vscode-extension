package e0;

import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f10542a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.q<u7.p<? super g0.d, ? super Integer, m7.n>, g0.d, Integer, m7.n> f10543b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(m mVar, ComposableLambdaImpl composableLambdaImpl) {
        this.f10542a = mVar;
        this.f10543b = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return v7.g.a(this.f10542a, gVar.f10542a) && v7.g.a(this.f10543b, gVar.f10543b);
        }
        return false;
    }

    public final int hashCode() {
        T t10 = this.f10542a;
        return this.f10543b.hashCode() + ((t10 == null ? 0 : t10.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f10542a + ", transition=" + this.f10543b + ')';
    }
}
