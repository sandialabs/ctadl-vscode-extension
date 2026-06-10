package fa;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11023a = new a();

    /* loaded from: classes.dex */
    public static class a {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f11024a;

        public b(Throwable th) {
            this.f11024a = th;
        }

        public static /* synthetic */ void a(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i10 != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(format);
            }
        }

        public final String toString() {
            return this.f11024a.toString();
        }
    }

    public static void a(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f11024a;
            if (th != null) {
                throw th;
            }
            b.a(1);
            throw null;
        }
    }
}
