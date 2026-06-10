package androidx.biometric;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final a f1237a = new a();

    /* renamed from: b  reason: collision with root package name */
    public CancellationSignal f1238b;
    public v2.d c;

    /* loaded from: classes.dex */
    public class a {
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }
}
