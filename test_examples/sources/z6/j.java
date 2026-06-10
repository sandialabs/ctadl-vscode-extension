package z6;

import android.content.Context;
import com.noto.R;
import com.noto.app.main.MainFragment;

/* loaded from: classes.dex */
public final class j extends com.google.android.material.bottomsheet.b {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ MainFragment f19149w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MainFragment mainFragment, Context context) {
        super(context, R.style.BottomSheetDialog);
        this.f19149w = mainFragment;
    }

    @Override // androidx.activity.h, android.app.Dialog
    public final void onBackPressed() {
        MainFragment mainFragment = this.f19149w;
        if (((m) mainFragment.f8844v0.getValue()).f19155a) {
            androidx.fragment.app.s c = mainFragment.c();
            if (c != null) {
                c.finish();
                return;
            }
            return;
        }
        super.onBackPressed();
    }
}
