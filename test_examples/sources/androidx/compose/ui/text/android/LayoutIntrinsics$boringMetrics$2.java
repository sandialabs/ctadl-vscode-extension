package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import q1.c;
import q1.r;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/BoringLayout$Metrics;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class LayoutIntrinsics$boringMetrics$2 extends Lambda implements u7.a<BoringLayout.Metrics> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f4057j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ CharSequence f4058k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TextPaint f4059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$boringMetrics$2(int i10, x1.a aVar, CharSequence charSequence) {
        super(0);
        this.f4057j = i10;
        this.f4058k = charSequence;
        this.f4059l = aVar;
    }

    @Override // u7.a
    public final BoringLayout.Metrics k0() {
        TextDirectionHeuristic a10 = r.a(this.f4057j);
        CharSequence charSequence = this.f4058k;
        g.f(charSequence, "text");
        TextPaint textPaint = this.f4059l;
        g.f(textPaint, "paint");
        if (v2.a.a()) {
            return q1.b.b(charSequence, textPaint, a10);
        }
        return c.b(charSequence, textPaint, a10);
    }
}
