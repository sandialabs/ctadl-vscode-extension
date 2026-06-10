package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import u8.s;

/* loaded from: classes.dex */
public final class NullabilityAnnotationStatesImpl<T> implements s<T> {

    /* renamed from: b  reason: collision with root package name */
    public final Map<h9.c, T> f13623b;
    public final LockBasedStorageManager.j c = new LockBasedStorageManager("Java nullability annotation states").h(new NullabilityAnnotationStatesImpl$cache$1(this));

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(Map<h9.c, ? extends T> map) {
        this.f13623b = map;
    }
}
