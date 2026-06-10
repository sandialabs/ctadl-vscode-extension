package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f5250a;

    public r(s sVar) {
        this.f5250a = sVar;
    }

    @Override // a.b
    public final void a() {
        s sVar = this.f5250a;
        w<?> wVar = sVar.f5251z.f5260a;
        wVar.f5265l.c(wVar, wVar, null);
        Bundle a10 = sVar.f415m.f6385b.a("android:support:fragments");
        if (a10 != null) {
            Parcelable parcelable = a10.getParcelable("android:support:fragments");
            w<?> wVar2 = sVar.f5251z.f5260a;
            if (wVar2 instanceof androidx.lifecycle.n0) {
                wVar2.f5265l.V(parcelable);
                return;
            }
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }
}
