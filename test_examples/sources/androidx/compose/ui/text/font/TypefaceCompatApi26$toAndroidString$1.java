package androidx.compose.ui.text.font;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u1.k;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/k;", "setting", "", "invoke", "(Lu1/k;)Ljava/lang/CharSequence;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class TypefaceCompatApi26$toAndroidString$1 extends Lambda implements l<k, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b2.b f4115j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceCompatApi26$toAndroidString$1(b2.c cVar) {
        super(1);
        this.f4115j = cVar;
    }

    @Override // u7.l
    public final CharSequence U(k kVar) {
        k kVar2 = kVar;
        g.f(kVar2, "setting");
        return "'" + kVar2.c() + "' " + kVar2.b();
    }
}
