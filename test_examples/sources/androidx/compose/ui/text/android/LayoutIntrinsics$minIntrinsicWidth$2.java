package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextPaint;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import l1.m;
import q1.d;
import v7.g;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class LayoutIntrinsics$minIntrinsicWidth$2 extends Lambda implements u7.a<Float> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ CharSequence f4063j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ TextPaint f4064k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$minIntrinsicWidth$2(x1.a aVar, CharSequence charSequence) {
        super(0);
        this.f4063j = charSequence;
        this.f4064k = aVar;
    }

    @Override // u7.a
    public final Float k0() {
        Pair pair;
        CharSequence charSequence = this.f4063j;
        g.f(charSequence, "text");
        TextPaint textPaint = this.f4064k;
        g.f(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new d(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new m(1));
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                pair = new Pair(Integer.valueOf(i10), Integer.valueOf(next));
            } else {
                Pair pair2 = (Pair) priorityQueue.peek();
                if (pair2 != null && ((Number) pair2.f12963j).intValue() - ((Number) pair2.f12962i).intValue() < next - i10) {
                    priorityQueue.poll();
                    pair = new Pair(Integer.valueOf(i10), Integer.valueOf(next));
                }
                i10 = next;
            }
            priorityQueue.add(pair);
            i10 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            Pair pair3 = (Pair) it.next();
            f10 = Math.max(f10, Layout.getDesiredWidth(charSequence, ((Number) pair3.f12962i).intValue(), ((Number) pair3.f12963j).intValue(), textPaint));
        }
        return Float.valueOf(f10);
    }
}
