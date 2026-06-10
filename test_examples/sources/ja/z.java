package ja;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f12817a;

    static {
        String str;
        boolean z10;
        b0 b0Var;
        int i10 = kotlinx.coroutines.internal.s.f15496a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z10 = Boolean.parseBoolean(str);
        } else {
            z10 = false;
        }
        if (z10) {
            kotlinx.coroutines.scheduling.b bVar = f0.f12766a;
            b1 b1Var = kotlinx.coroutines.internal.l.f15491a;
            b1Var.W();
            if (b1Var instanceof b0) {
                b0Var = (b0) b1Var;
                f12817a = b0Var;
            }
        }
        b0Var = kotlinx.coroutines.b.f15167q;
        f12817a = b0Var;
    }
}
