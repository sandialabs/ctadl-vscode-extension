package m8;

/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: i  reason: collision with root package name */
    public final e f16011i;

    public b(e eVar) {
        if (eVar != null) {
            this.f16011i = eVar;
        } else {
            K(0);
            throw null;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // m8.a
    public e getAnnotations() {
        e eVar = this.f16011i;
        if (eVar != null) {
            return eVar;
        }
        K(1);
        throw null;
    }
}
