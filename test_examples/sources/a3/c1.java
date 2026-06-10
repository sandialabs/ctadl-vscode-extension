package a3;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f166i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ View f167j;

    public /* synthetic */ c1(View view, int i10) {
        this.f166i = i10;
        this.f167j = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f166i;
        View view = this.f167j;
        switch (i10) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 1:
                int i11 = BottomAppBar.B0;
                view.requestLayout();
                return;
            default:
                v7.g.f(view, "$this_enable");
                view.setEnabled(true);
                return;
        }
    }
}
