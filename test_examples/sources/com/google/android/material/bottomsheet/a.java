package com.google.android.material.bottomsheet;

import a3.b1;
import a3.x;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements x {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b f6920i;

    public a(b bVar) {
        this.f6920i = bVar;
    }

    @Override // a3.x
    public final b1 a(View view, b1 b1Var) {
        b bVar = this.f6920i;
        b.C0059b c0059b = bVar.f6927t;
        if (c0059b != null) {
            bVar.f6921m.W.remove(c0059b);
        }
        b.C0059b c0059b2 = new b.C0059b(bVar.f6923p, b1Var);
        bVar.f6927t = c0059b2;
        c0059b2.e(bVar.getWindow());
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = bVar.f6921m;
        b.C0059b c0059b3 = bVar.f6927t;
        ArrayList<BottomSheetBehavior.c> arrayList = bottomSheetBehavior.W;
        if (!arrayList.contains(c0059b3)) {
            arrayList.add(c0059b3);
        }
        return b1Var;
    }
}
