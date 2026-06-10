package h4;

import android.os.Build;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11424a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f11425b;
    public static final boolean c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f11424a = true;
        f11425b = true;
        if (i10 < 28) {
            z10 = false;
        }
        c = z10;
    }
}
