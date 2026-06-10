package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes.dex */
public final class a extends LockBasedStorageManager.h<Object> {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f14923l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LockBasedStorageManager lockBasedStorageManager, u7.a aVar, EmptyList emptyList) {
        super(lockBasedStorageManager, aVar);
        this.f14923l = emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f
    public final LockBasedStorageManager.l<Object> d(boolean z10) {
        return new LockBasedStorageManager.l<>(this.f14923l, false);
    }
}
