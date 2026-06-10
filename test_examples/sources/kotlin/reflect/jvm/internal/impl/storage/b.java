package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import u7.l;

/* loaded from: classes.dex */
public final class b extends LockBasedStorageManager.i<Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ l f14924m;
    public final /* synthetic */ l n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LockBasedStorageManager lockBasedStorageManager, u7.a aVar, l lVar, l lVar2) {
        super(lockBasedStorageManager, aVar);
        this.f14924m = lVar;
        this.n = lVar2;
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i10 != 2 ? 2 : 3];
        if (i10 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i10 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i10 == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f
    public final LockBasedStorageManager.l<Object> d(boolean z10) {
        l lVar = this.f14924m;
        if (lVar == null) {
            LockBasedStorageManager.l<Object> d5 = super.d(z10);
            if (d5 != null) {
                return d5;
            }
            a(0);
            throw null;
        }
        return new LockBasedStorageManager.l<>(lVar.U(Boolean.valueOf(z10)), false);
    }
}
