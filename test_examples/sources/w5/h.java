package w5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.noto.R;

/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: g  reason: collision with root package name */
    public int f18405g;

    /* renamed from: h  reason: collision with root package name */
    public int f18406h;

    /* renamed from: i  reason: collision with root package name */
    public int f18407i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10 = CircularProgressIndicator.f7253u;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray d5 = u5.j.d(context, attributeSet, a1.b.U, R.attr.circularProgressIndicatorStyle, 2132083754, new int[0]);
        this.f18405g = Math.max(x5.c.c(context, d5, 2, dimensionPixelSize), this.f18383a * 2);
        this.f18406h = x5.c.c(context, d5, 1, dimensionPixelSize2);
        this.f18407i = d5.getInt(0, 0);
        d5.recycle();
    }
}
