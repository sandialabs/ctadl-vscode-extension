package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f4856a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f4857b;

    static {
        Class<?> cls;
        boolean z10;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f4856a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4857b = z10;
    }

    public static boolean a() {
        return (f4856a == null || f4857b) ? false : true;
    }
}
