package f7;

import android.os.Build;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f10949a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f10950b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f10949a = i10 >= 31 ? 201326592 : 134217728;
        f10950b = i10 >= 31 ? 167772160 : 134217728;
    }
}
