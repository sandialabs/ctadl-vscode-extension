package i5;

import android.content.res.TypedArray;
import android.view.View;

/* loaded from: classes.dex */
public final class d implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.b f11815i;

    public d(com.google.android.material.bottomsheet.b bVar) {
        this.f11815i = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.material.bottomsheet.b bVar = this.f11815i;
        if (bVar.f6924q && bVar.isShowing()) {
            if (!bVar.f6926s) {
                TypedArray obtainStyledAttributes = bVar.getContext().obtainStyledAttributes(new int[]{16843611});
                bVar.f6925r = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                bVar.f6926s = true;
            }
            if (bVar.f6925r) {
                bVar.cancel();
            }
        }
    }
}
