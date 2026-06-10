package i5;

import android.os.Bundle;
import android.view.View;
import b3.g;

/* loaded from: classes.dex */
public final class e extends a3.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.b f11816d;

    public e(com.google.android.material.bottomsheet.b bVar) {
        this.f11816d = bVar;
    }

    @Override // a3.a
    public final void d(View view, g gVar) {
        boolean z10;
        this.f108a.onInitializeAccessibilityNodeInfo(view, gVar.f6357a);
        if (this.f11816d.f6924q) {
            gVar.a(1048576);
            z10 = true;
        } else {
            z10 = false;
        }
        gVar.m(z10);
    }

    @Override // a3.a
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            com.google.android.material.bottomsheet.b bVar = this.f11816d;
            if (bVar.f6924q) {
                bVar.cancel();
                return true;
            }
        }
        return super.g(view, i10, bundle);
    }
}
