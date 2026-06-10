package r;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final l f17012a = new l(0.2f);

    /* renamed from: b  reason: collision with root package name */
    public static final l f17013b;
    public static final a c;

    /* loaded from: classes.dex */
    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17014a = new a();

        @Override // r.p
        public final float a(float f10) {
            return f10;
        }
    }

    static {
        boolean z10;
        if (!Float.isNaN(0.0f) && !Float.isNaN(0.0f) && !Float.isNaN(0.2f) && !Float.isNaN(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f17013b = new l(1.0f);
            c = a.f17014a;
            return;
        }
        throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.0, 0.0, 0.2, 1.0.".toString());
    }
}
