package com.airbnb.epoxy;

import android.view.View;
import com.airbnb.epoxy.x;
import java.util.Collections;

/* loaded from: classes.dex */
public final class s implements x.a {
    @Override // com.airbnb.epoxy.x.a
    public final void a(int i10, r rVar, b0 b0Var) {
        int i11;
        boolean z10 = rVar.c;
        View view = b0Var.f5666a;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        b0Var.t(rVar, null, Collections.emptyList(), i10);
    }
}
