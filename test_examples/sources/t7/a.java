package t7;

import kotlin.random.Random;
import z7.b;

/* loaded from: classes.dex */
public class a extends s7.a {

    /* renamed from: t7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0227a {

        /* renamed from: a  reason: collision with root package name */
        public static final Integer f17695a;

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
                f17695a = num2;
            }
            num = null;
            if (num != null) {
            }
            f17695a = num2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @Override // r7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Random b() {
        boolean z10;
        Integer num = C0227a.f17695a;
        if (num != null && num.intValue() < 34) {
            z10 = false;
            if (!z10) {
                return new a8.a();
            }
            return new b();
        }
        z10 = true;
        if (!z10) {
        }
    }
}
