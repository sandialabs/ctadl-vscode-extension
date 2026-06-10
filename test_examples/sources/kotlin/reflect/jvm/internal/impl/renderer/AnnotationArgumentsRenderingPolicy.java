package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes.dex */
public enum AnnotationArgumentsRenderingPolicy {
    NO_ARGUMENTS(false, 3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(true, 2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);
    

    /* renamed from: i  reason: collision with root package name */
    public final boolean f14591i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f14592j;

    /* synthetic */ AnnotationArgumentsRenderingPolicy(boolean z10, int i10) {
        this((i10 & 1) != 0 ? false : z10, false);
    }

    AnnotationArgumentsRenderingPolicy(boolean z10, boolean z11) {
        this.f14591i = z10;
        this.f14592j = z11;
    }
}
