package kotlin;

import java.io.Serializable;
import m0.b;
import m7.e;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lm7/e;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SynchronizedLazyImpl<T> implements e<T>, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public u7.a<? extends T> f12969i;

    /* renamed from: j  reason: collision with root package name */
    public volatile Object f12970j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f12971k;

    public SynchronizedLazyImpl(u7.a aVar) {
        g.f(aVar, "initializer");
        this.f12969i = aVar;
        this.f12970j = b.f15890b;
        this.f12971k = this;
    }

    @Override // m7.e
    public final boolean a() {
        return this.f12970j != b.f15890b;
    }

    @Override // m7.e
    public final T getValue() {
        T t10;
        T t11 = (T) this.f12970j;
        b bVar = b.f15890b;
        if (t11 != bVar) {
            return t11;
        }
        synchronized (this.f12971k) {
            t10 = (T) this.f12970j;
            if (t10 == bVar) {
                u7.a<? extends T> aVar = this.f12969i;
                g.c(aVar);
                t10 = aVar.k0();
                this.f12970j = t10;
                this.f12969i = null;
            }
        }
        return t10;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
