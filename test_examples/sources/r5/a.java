package r5;

import android.content.Context;
import android.graphics.Color;
import com.noto.R;
import x5.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f17065f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17066a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17067b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17068d;

    /* renamed from: e  reason: collision with root package name */
    public final float f17069e;

    public a(Context context) {
        boolean b5 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int S = a1.b.S(context, R.attr.elevationOverlayColor, 0);
        int S2 = a1.b.S(context, R.attr.elevationOverlayAccentColor, 0);
        int S3 = a1.b.S(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f17066a = b5;
        this.f17067b = S;
        this.c = S2;
        this.f17068d = S3;
        this.f17069e = f10;
    }

    public final int a(int i10, float f10) {
        boolean z10;
        float f11;
        int p02;
        int i11;
        if (this.f17066a) {
            if (q2.a.d(i10, 255) == this.f17068d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                float f12 = this.f17069e;
                if (f12 > 0.0f && f10 > 0.0f) {
                    f11 = Math.min(((((float) Math.log1p(f10 / f12)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                    int alpha = Color.alpha(i10);
                    p02 = a1.b.p0(f11, q2.a.d(i10, 255), this.f17067b);
                    if (f11 > 0.0f && (i11 = this.c) != 0) {
                        p02 = q2.a.b(q2.a.d(i11, f17065f), p02);
                    }
                    return q2.a.d(p02, alpha);
                }
                f11 = 0.0f;
                int alpha2 = Color.alpha(i10);
                p02 = a1.b.p0(f11, q2.a.d(i10, 255), this.f17067b);
                if (f11 > 0.0f) {
                    p02 = q2.a.b(q2.a.d(i11, f17065f), p02);
                }
                return q2.a.d(p02, alpha2);
            }
            return i10;
        }
        return i10;
    }
}
