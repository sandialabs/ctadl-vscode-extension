package n4;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f16088a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile g f16089b;

    /* loaded from: classes.dex */
    public static class a extends g {
        public final int c;

        public a(int i10) {
            this.c = i10;
        }

        @Override // n4.g
        public final void a(String str, String str2) {
            if (this.c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // n4.g
        public final void b(String str, String str2) {
            if (this.c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // n4.g
        public final void c(String str, String str2, Throwable th) {
            if (this.c <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // n4.g
        public final void e(String str, String str2) {
            if (this.c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // n4.g
        public final void g(String str, String str2) {
            if (this.c <= 5) {
                Log.w(str, str2);
            }
        }
    }

    public static g d() {
        g gVar;
        synchronized (f16088a) {
            if (f16089b == null) {
                f16089b = new a(3);
            }
            gVar = f16089b;
        }
        return gVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2);

    public abstract void c(String str, String str2, Throwable th);

    public abstract void e(String str, String str2);

    public abstract void g(String str, String str2);
}
