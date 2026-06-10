package w5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.noto.R;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public int f18383a;

    /* renamed from: b  reason: collision with root package name */
    public int f18384b;
    public int[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f18385d;

    /* renamed from: e  reason: collision with root package name */
    public int f18386e;

    /* renamed from: f  reason: collision with root package name */
    public int f18387f;

    public c(Context context, AttributeSet attributeSet) {
        int C;
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray d5 = u5.j.d(context, attributeSet, a1.b.P, R.attr.circularProgressIndicatorStyle, 2132083754, new int[0]);
        this.f18383a = x5.c.c(context, d5, 8, dimensionPixelSize);
        this.f18384b = Math.min(x5.c.c(context, d5, 7, 0), this.f18383a / 2);
        this.f18386e = d5.getInt(4, 0);
        this.f18387f = d5.getInt(1, 0);
        if (!d5.hasValue(2)) {
            this.c = new int[]{a1.b.S(context, R.attr.colorPrimary, -1)};
        } else if (d5.peekValue(2).type != 1) {
            this.c = new int[]{d5.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(d5.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (d5.hasValue(6)) {
            C = d5.getColor(6, -1);
        } else {
            this.f18385d = this.c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f10 = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            C = a1.b.C(this.f18385d, (int) (f10 * 255.0f));
        }
        this.f18385d = C;
        d5.recycle();
    }
}
