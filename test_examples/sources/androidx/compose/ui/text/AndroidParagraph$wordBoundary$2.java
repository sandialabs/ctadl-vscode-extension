package androidx.compose.ui.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.b;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm0/b;", "invoke", "()Lm0/b;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class AndroidParagraph$wordBoundary$2 extends Lambda implements u7.a<b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AndroidParagraph f3989j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraph$wordBoundary$2(AndroidParagraph androidParagraph) {
        super(0);
        this.f3989j = androidParagraph;
    }

    @Override // u7.a
    public final b k0() {
        AndroidParagraph androidParagraph = this.f3989j;
        Locale textLocale = androidParagraph.f3984a.f4154g.getTextLocale();
        g.e(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return new b(textLocale, androidParagraph.f3986d.h());
    }
}
