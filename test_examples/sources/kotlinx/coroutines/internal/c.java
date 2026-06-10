package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class c<T> extends m {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15472a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = a1.b.O0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.m
    public final c<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.m
    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == a1.b.O0) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t10, Object obj);

    public final Object e(Object obj) {
        boolean z10;
        Object obj2 = this._consensus;
        r rVar = a1.b.O0;
        if (obj2 != rVar) {
            return obj2;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15472a;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, obj)) {
                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        return z10 ? obj : this._consensus;
    }

    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        return this._consensus != a1.b.O0;
    }

    public abstract Object i(T t10);
}
