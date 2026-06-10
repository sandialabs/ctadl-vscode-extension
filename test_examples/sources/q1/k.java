package q1;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final m f16843a;

    static {
        f16843a = Build.VERSION.SDK_INT >= 23 ? new g() : new l();
    }

    public static StaticLayout a(CharSequence charSequence, int i10, int i11, x1.a aVar, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        v7.g.f(charSequence, "text");
        v7.g.f(aVar, "paint");
        v7.g.f(textDirectionHeuristic, "textDir");
        v7.g.f(alignment, "alignment");
        return f16843a.a(new n(charSequence, i10, i11, aVar, i12, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2));
    }
}
