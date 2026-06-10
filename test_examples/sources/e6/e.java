package e6;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes.dex */
public final class e extends a3.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f10667d;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f10667d = baseTransientBottomBar;
    }

    @Override // a3.a
    public final void d(View view, b3.g gVar) {
        this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
        gVar.a(1048576);
        gVar.m(true);
    }

    @Override // a3.a
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            this.f10667d.a();
            return true;
        }
        return super.g(view, i10, bundle);
    }
}
