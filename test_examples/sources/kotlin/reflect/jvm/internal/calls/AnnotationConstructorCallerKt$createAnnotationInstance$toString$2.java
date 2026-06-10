package kotlin.reflect.jvm.internal.calls;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnotationConstructorCallerKt$createAnnotationInstance$toString$2 extends Lambda implements u7.a<String> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Class<T> f13260j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f13261k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationConstructorCallerKt$createAnnotationInstance$toString$2(Class<T> cls, Map<String, ? extends Object> map) {
        super(0);
        this.f13260j = cls;
        this.f13261k = map;
    }

    @Override // u7.a
    public final String k0() {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(this.f13260j.getCanonicalName());
        kotlin.collections.c.s2(this.f13261k.entrySet(), sb, ", ", "(", ")", AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1.f13262j, 48);
        String sb2 = sb.toString();
        g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
