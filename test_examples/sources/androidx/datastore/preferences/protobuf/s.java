package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
public final class s implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final s f4934a = new s();

    @Override // androidx.datastore.preferences.protobuf.h0
    public final g0 a(Class<?> cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (g0) GeneratedMessageLite.l(cls.asSubclass(GeneratedMessageLite.class)).k(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
