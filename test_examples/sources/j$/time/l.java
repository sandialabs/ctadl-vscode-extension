package j$.time;

/* loaded from: classes2.dex */
abstract /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ int[] f12008a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f12008a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12008a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
