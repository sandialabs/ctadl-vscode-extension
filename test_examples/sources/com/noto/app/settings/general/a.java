package com.noto.app.settings.general;

import android.view.View;
import com.noto.app.domain.model.Icon;
import com.noto.app.settings.c;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ IconDialogFragment f9765i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Icon f9766j;

    public a(Icon icon, IconDialogFragment iconDialogFragment) {
        this.f9765i = iconDialogFragment;
        this.f9766j = icon;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IconDialogFragment iconDialogFragment = this.f9765i;
        ((c) iconDialogFragment.f9745u0.getValue()).o(this.f9766j);
        iconDialogFragment.Z();
    }
}
