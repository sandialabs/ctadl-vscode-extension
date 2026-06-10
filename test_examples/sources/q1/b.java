package q1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class b {
    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        v7.g.f(charSequence, "text");
        v7.g.f(textPaint, "paint");
        v7.g.f(alignment, "alignment");
        v7.g.f(metrics, "metrics");
        return a.a(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, z11, truncateAt, i11);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        v7.g.f(charSequence, "text");
        v7.g.f(textPaint, "paint");
        v7.g.f(textDirectionHeuristic, "textDir");
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }
}
