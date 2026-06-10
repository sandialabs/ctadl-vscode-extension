package ja;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f12764i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f12765j;

    public /* synthetic */ f(int i10, Object obj) {
        this.f12764i = i10;
        this.f12765j = obj;
    }

    @Override // u7.l
    public final /* bridge */ /* synthetic */ m7.n U(Throwable th) {
        switch (this.f12764i) {
            case 0:
                a(th);
                return m7.n.f16010a;
            default:
                a(th);
                return m7.n.f16010a;
        }
    }

    @Override // ja.h
    public final void a(Throwable th) {
        int i10 = this.f12764i;
        Object obj = this.f12765j;
        switch (i10) {
            case 0:
                if (th != null) {
                    ((Future) obj).cancel(false);
                    return;
                }
                return;
            default:
                ((h0) obj).a();
                return;
        }
    }

    public final String toString() {
        int i10 = this.f12764i;
        Object obj = this.f12765j;
        switch (i10) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) obj) + ']';
            default:
                return "DisposeOnCancel[" + ((h0) obj) + ']';
        }
    }
}
