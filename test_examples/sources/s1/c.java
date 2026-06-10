package s1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.Pair;
import q1.r;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (layout == null || paint == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(i15);
        boolean z11 = true;
        if (lineForOffset == layout.getLineCount() - 1) {
            Pair<Integer, Integer> pair = r.f16868a;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float b5 = d.b(layout, lineForOffset, paint) + d.a(layout, lineForOffset, paint);
                if (b5 != 0.0f) {
                    z11 = false;
                }
                if (z11) {
                    return;
                }
                v7.g.c(canvas);
                canvas.translate(b5, 0.0f);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
