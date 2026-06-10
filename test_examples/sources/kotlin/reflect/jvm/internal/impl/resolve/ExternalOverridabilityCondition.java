package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes.dex */
public interface ExternalOverridabilityCondition {

    /* loaded from: classes.dex */
    public enum Contract {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* loaded from: classes.dex */
    public enum Result {
        OVERRIDABLE,
        /* JADX INFO: Fake field, exist only in values array */
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    Result a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, l8.b bVar);

    Contract b();
}
