package i5;

import android.view.View;
import b3.k;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f11814b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f11814b = bottomSheetBehavior;
        this.f11813a = i10;
    }

    @Override // b3.k
    public final boolean a(View view) {
        this.f11814b.E(this.f11813a);
        return true;
    }
}
