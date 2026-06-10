package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes.dex */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String str) {
        super(str);
        v7.g.f(str, "message");
    }
}
