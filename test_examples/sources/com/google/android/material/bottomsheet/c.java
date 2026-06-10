package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import d.s;

/* loaded from: classes.dex */
public class c extends s {
    public c() {
    }

    @SuppressLint({"ValidFragment"})
    public c(int i10) {
        super(i10);
    }

    @Override // androidx.fragment.app.m
    public final void Z() {
        Dialog dialog = this.f5220o0;
        if (dialog instanceof b) {
            b bVar = (b) dialog;
            if (bVar.f6921m == null) {
                bVar.g();
            }
            boolean z10 = bVar.f6921m.I;
        }
        a0(false, false);
    }

    @Override // d.s, androidx.fragment.app.m
    public Dialog c0() {
        return new b(j(), b0());
    }
}
