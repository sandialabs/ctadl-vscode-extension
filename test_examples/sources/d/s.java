package d;

import android.app.Dialog;

/* loaded from: classes.dex */
public class s extends androidx.fragment.app.m {
    public s() {
    }

    public s(int i10) {
        super(i10);
    }

    @Override // androidx.fragment.app.m
    public Dialog c0() {
        return new r(j(), b0());
    }

    @Override // androidx.fragment.app.m
    public final void e0(Dialog dialog, int i10) {
        if (dialog instanceof r) {
            r rVar = (r) dialog;
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            rVar.c().w(1);
            return;
        }
        super.e0(dialog, i10);
    }
}
