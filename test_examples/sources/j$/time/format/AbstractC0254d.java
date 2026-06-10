package j$.time.format;

/* renamed from: j$.time.format.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC0254d {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f11933a;

    static {
        int[] iArr = new int[F.values().length];
        f11933a = iArr;
        try {
            iArr[F.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11933a[F.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11933a[F.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11933a[F.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
