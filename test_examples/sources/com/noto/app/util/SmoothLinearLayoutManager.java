package com.noto.app.util;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import kotlin.Metadata;
import v7.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/noto/app/util/SmoothLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SmoothLinearLayoutManager extends LinearLayoutManager {

    /* loaded from: classes.dex */
    public static final class a extends r {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        public final float h(DisplayMetrics displayMetrics) {
            g.f(displayMetrics, "displayMetrics");
            return 75.0f / displayMetrics.densityDpi;
        }
    }

    public SmoothLinearLayoutManager() {
        super(0);
    }

    public SmoothLinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void G0(RecyclerView recyclerView, RecyclerView.x xVar, int i10) {
        g.f(recyclerView, "recyclerView");
        g.f(xVar, "state");
        a aVar = new a(recyclerView.getContext());
        aVar.f5729a = i10;
        H0(aVar);
    }
}
