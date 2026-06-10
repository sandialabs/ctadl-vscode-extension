package s7;

import v7.g;

/* loaded from: classes.dex */
public class a extends r7.a {

    /* renamed from: s7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0221a {

        /* renamed from: a  reason: collision with root package name */
        public static final Integer f17501a;

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null) {
                    if (num.intValue() > 0) {
                        num2 = num;
                    }
                }
                f17501a = num2;
            }
            num = null;
            if (num != null) {
            }
            f17501a = num2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // r7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Throwable th, Throwable th2) {
        boolean z10;
        g.f(th, "cause");
        g.f(th2, "exception");
        Integer num = C0221a.f17501a;
        if (num != null && num.intValue() < 19) {
            z10 = false;
            if (!z10) {
                th.addSuppressed(th2);
                return;
            } else {
                super.a(th, th2);
                return;
            }
        }
        z10 = true;
        if (!z10) {
        }
    }
}
