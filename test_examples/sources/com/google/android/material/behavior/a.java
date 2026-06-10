package com.google.android.material.behavior;

import a3.j0;
import a3.v0;
import android.view.View;
import b3.k;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f6843a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f6843a = swipeDismissBehavior;
    }

    @Override // b3.k
    public final boolean a(View view) {
        boolean z10;
        SwipeDismissBehavior swipeDismissBehavior = this.f6843a;
        boolean z11 = false;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.e.d(view) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = swipeDismissBehavior.f6833e;
        if ((i10 == 0 && z10) || (i10 == 1 && !z10)) {
            z11 = true;
        }
        int width = view.getWidth();
        if (z11) {
            width = -width;
        }
        j0.j(view, width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = swipeDismissBehavior.f6831b;
        if (bVar != null) {
            ((e) bVar).a(view);
        }
        return true;
    }
}
