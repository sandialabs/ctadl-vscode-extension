package androidx.compose.ui;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import q0.d;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Lq0/d$b;", "element", "invoke", "(Ljava/lang/String;Lq0/d$b;)Ljava/lang/String;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class CombinedModifier$toString$1 extends Lambda implements p<String, d.b, String> {

    /* renamed from: j  reason: collision with root package name */
    public static final CombinedModifier$toString$1 f2987j = new CombinedModifier$toString$1();

    public CombinedModifier$toString$1() {
        super(2);
    }

    @Override // u7.p
    public final String R(String str, d.b bVar) {
        boolean z10;
        String str2 = str;
        d.b bVar2 = bVar;
        g.f(str2, "acc");
        g.f(bVar2, "element");
        if (str2.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return bVar2.toString();
        }
        return str2 + ", " + bVar2;
    }
}
