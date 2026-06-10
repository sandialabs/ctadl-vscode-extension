package kotlin;

import java.io.Serializable;
import m0.b;
import m7.e;
import v7.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/UnsafeLazyImpl;", "T", "Lm7/e;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UnsafeLazyImpl<T> implements e<T>, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public u7.a<? extends T> f12975i;

    /* renamed from: j  reason: collision with root package name */
    public Object f12976j;

    public UnsafeLazyImpl(u7.a<? extends T> aVar) {
        g.f(aVar, "initializer");
        this.f12975i = aVar;
        this.f12976j = b.f15890b;
    }

    @Override // m7.e
    public final boolean a() {
        return this.f12976j != b.f15890b;
    }

    @Override // m7.e
    public final T getValue() {
        if (this.f12976j == b.f15890b) {
            u7.a<? extends T> aVar = this.f12975i;
            g.c(aVar);
            this.f12976j = aVar.k0();
            this.f12975i = null;
        }
        return (T) this.f12976j;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
