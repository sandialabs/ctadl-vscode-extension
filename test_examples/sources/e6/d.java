package e6;

import a3.b1;
import a3.x;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes.dex */
public final class d implements x {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f10666i;

    public d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10666i = baseTransientBottomBar;
    }

    @Override // a3.x
    public final b1 a(View view, b1 b1Var) {
        int c = b1Var.c();
        BaseTransientBottomBar baseTransientBottomBar = this.f10666i;
        baseTransientBottomBar.n = c;
        baseTransientBottomBar.f7307o = b1Var.d();
        baseTransientBottomBar.f7308p = b1Var.e();
        baseTransientBottomBar.g();
        return b1Var;
    }
}
