package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import s1.f;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutIntrinsics$maxIntrinsicWidth$2 extends Lambda implements u7.a<Float> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f4060j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ CharSequence f4061k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TextPaint f4062l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$maxIntrinsicWidth$2(a aVar, CharSequence charSequence, x1.a aVar2) {
        super(0);
        this.f4060j = aVar;
        this.f4061k = charSequence;
        this.f4062l = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (m0.b.x0(r3, s1.e.class) == false) goto L23;
     */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Float k0() {
        Float f10;
        boolean z10;
        boolean z11;
        BoringLayout.Metrics metrics = (BoringLayout.Metrics) this.f4060j.f4066a.getValue();
        if (metrics != null) {
            f10 = Float.valueOf(metrics.width);
        } else {
            f10 = null;
        }
        boolean z12 = false;
        TextPaint textPaint = this.f4062l;
        CharSequence charSequence = this.f4061k;
        if (f10 == null) {
            f10 = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint)));
        }
        if (f10.floatValue() == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (charSequence instanceof Spanned)) {
            if (textPaint.getLetterSpacing() == 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Spanned spanned = (Spanned) charSequence;
                if (!m0.b.x0(spanned, f.class)) {
                }
            }
            z12 = true;
        }
        if (z12) {
            return Float.valueOf(f10.floatValue() + 0.5f);
        }
        return f10;
    }
}
