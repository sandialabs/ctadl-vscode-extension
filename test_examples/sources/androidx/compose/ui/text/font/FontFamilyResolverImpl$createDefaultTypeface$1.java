package androidx.compose.ui.text.font;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u1.m;
import u1.w;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/w;", "it", "", "invoke", "(Lu1/w;)Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class FontFamilyResolverImpl$createDefaultTypeface$1 extends Lambda implements l<w, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f4111j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$createDefaultTypeface$1(b bVar) {
        super(1);
        this.f4111j = bVar;
    }

    @Override // u7.l
    public final Object U(w wVar) {
        w wVar2 = wVar;
        g.f(wVar2, "it");
        int i10 = wVar2.c;
        int i11 = wVar2.f17770d;
        Object obj = wVar2.f17771e;
        m mVar = wVar2.f17769b;
        g.f(mVar, "fontWeight");
        return this.f4111j.b(new w(null, mVar, i10, i11, obj)).getValue();
    }
}
