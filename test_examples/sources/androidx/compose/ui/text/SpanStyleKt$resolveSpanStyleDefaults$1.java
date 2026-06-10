package androidx.compose.ui.text;

import a2.c;
import androidx.compose.ui.text.style.a;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p1.l;
import v0.r;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/style/a;", "invoke", "()Landroidx/compose/ui/text/style/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class SpanStyleKt$resolveSpanStyleDefaults$1 extends Lambda implements u7.a<androidx.compose.ui.text.style.a> {

    /* renamed from: j  reason: collision with root package name */
    public static final SpanStyleKt$resolveSpanStyleDefaults$1 f4056j = new SpanStyleKt$resolveSpanStyleDefaults$1();

    public SpanStyleKt$resolveSpanStyleDefaults$1() {
        super(0);
    }

    @Override // u7.a
    public final androidx.compose.ui.text.style.a k0() {
        boolean z10;
        long j2 = l.f16685d;
        if (j2 != r.f18133g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new c(j2);
        }
        return a.C0028a.f4166a;
    }
}
