package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: f  reason: collision with root package name */
    public static final b f13322f = new b();

    public b() {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        d(false);
    }
}
