package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class x extends r {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ y f5998q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Context context) {
        super(context);
        this.f5998q = yVar;
    }

    @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.w
    public final void e(View view, RecyclerView.w.a aVar) {
        y yVar = this.f5998q;
        int[] b5 = yVar.b(yVar.f5841a.getLayoutManager(), view);
        int i10 = b5[0];
        int i11 = b5[1];
        int ceil = (int) Math.ceil(i(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f5989j;
            aVar.f5736a = i10;
            aVar.f5737b = i11;
            aVar.c = ceil;
            aVar.f5739e = decelerateInterpolator;
            aVar.f5740f = true;
        }
    }

    @Override // androidx.recyclerview.widget.r
    public final float h(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.r
    public final int i(int i10) {
        return Math.min(100, super.i(i10));
    }
}
