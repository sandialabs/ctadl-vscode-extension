package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.b;
import m7.e;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lm7/e;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "j", "Ljava/lang/Object;", "_value", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SafePublicationLazyImpl<T> implements e<T>, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f12966k = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "j");

    /* renamed from: i  reason: collision with root package name */
    public volatile u7.a<? extends T> f12967i;

    /* renamed from: j  reason: collision with root package name */
    public volatile Object f12968j;

    public SafePublicationLazyImpl(u7.a<? extends T> aVar) {
        g.f(aVar, "initializer");
        this.f12967i = aVar;
        this.f12968j = b.f15890b;
    }

    @Override // m7.e
    public final boolean a() {
        return this.f12968j != b.f15890b;
    }

    @Override // m7.e
    public final T getValue() {
        boolean z10;
        T t10 = (T) this.f12968j;
        b bVar = b.f15890b;
        if (t10 != bVar) {
            return t10;
        }
        u7.a<? extends T> aVar = this.f12967i;
        if (aVar != null) {
            T k02 = aVar.k0();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = f12966k;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, bVar, k02)) {
                    if (atomicReferenceFieldUpdater.get(this) != bVar) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                this.f12967i = null;
                return k02;
            }
        }
        return (T) this.f12968j;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
