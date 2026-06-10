package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import b4.b;

/* loaded from: classes.dex */
public final class q implements b.InterfaceC0053b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f5249a;

    public q(s sVar) {
        this.f5249a = sVar;
    }

    @Override // b4.b.InterfaceC0053b
    public final Bundle a() {
        s sVar;
        Bundle bundle = new Bundle();
        do {
            sVar = this.f5249a;
        } while (s.n(sVar.f5251z.f5260a.f5265l));
        sVar.A.f(Lifecycle.Event.ON_STOP);
        b0 W = sVar.f5251z.f5260a.f5265l.W();
        if (W != null) {
            bundle.putParcelable("android:support:fragments", W);
        }
        return bundle;
    }
}
