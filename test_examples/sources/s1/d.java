package s1;

import android.graphics.Paint;
import android.text.Layout;
import kotlin.Pair;
import q1.r;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17239a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            f17239a = iArr;
        }
    }

    public static final float a(Layout layout, int i10, Paint paint) {
        boolean z10;
        int i11;
        float abs;
        float width;
        v7.g.f(layout, "<this>");
        v7.g.f(paint, "paint");
        float lineLeft = layout.getLineLeft(i10);
        Pair<Integer, Integer> pair = r.f16868a;
        if (layout.getEllipsisCount(i10) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        int lineStart = layout.getLineStart(i10);
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + lineStart) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if (paragraphAlignment == null) {
            i11 = -1;
        } else {
            i11 = a.f17239a[paragraphAlignment.ordinal()];
        }
        if (i11 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float b(Layout layout, int i10, Paint paint) {
        boolean z10;
        v7.g.f(layout, "<this>");
        v7.g.f(paint, "paint");
        Pair<Integer, Integer> pair = r.f16868a;
        if (layout.getEllipsisCount(i10) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = -1;
            if (layout.getParagraphDirection(i10) == -1 && layout.getWidth() < layout.getLineRight(i10)) {
                float primaryHorizontal = layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10));
                float measureText = paint.measureText("…") + (layout.getLineRight(i10) - primaryHorizontal);
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
                if (paragraphAlignment != null) {
                    i11 = a.f17239a[paragraphAlignment.ordinal()];
                }
                float width = layout.getWidth() - layout.getLineRight(i10);
                float width2 = layout.getWidth() - measureText;
                if (i11 == 1) {
                    width2 /= 2.0f;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }
}
