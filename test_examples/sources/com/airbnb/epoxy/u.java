package com.airbnb.epoxy;

import android.view.View;
import com.airbnb.epoxy.x;
import java.util.Collections;

/* loaded from: classes.dex */
public final class u implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6726a;

    public u(x xVar) {
        this.f6726a = xVar;
    }

    @Override // com.airbnb.epoxy.x.a
    public final void a(int i10, r rVar, b0 b0Var) {
        int i11;
        r<?> rVar2;
        boolean z10 = rVar.c;
        View view = b0Var.f5666a;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        x xVar = this.f6726a;
        if (i10 < xVar.f6727k.size()) {
            rVar2 = (r) xVar.f6727k.get(i10);
            if (rVar2.f6681a == rVar.f6681a) {
                b0Var.t(rVar, rVar2, Collections.emptyList(), i10);
            }
        }
        rVar2 = null;
        b0Var.t(rVar, rVar2, Collections.emptyList(), i10);
    }
}
