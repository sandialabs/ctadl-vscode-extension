package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class a0 extends LinearLayoutManager {

    /* loaded from: classes.dex */
    public class a extends androidx.recyclerview.widget.r {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        public final float h(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public a0(int i10) {
        super(i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void G0(RecyclerView recyclerView, RecyclerView.x xVar, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.f5729a = i10;
        H0(aVar);
    }
}
