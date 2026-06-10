package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes.dex */
public enum Variance {
    INVARIANT("", true),
    IN_VARIANCE("in", false),
    OUT_VARIANCE("out", true);
    

    /* renamed from: i  reason: collision with root package name */
    public final String f14973i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f14974j;

    Variance(String str, boolean z10) {
        this.f14973i = str;
        this.f14974j = z10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f14973i;
    }
}
