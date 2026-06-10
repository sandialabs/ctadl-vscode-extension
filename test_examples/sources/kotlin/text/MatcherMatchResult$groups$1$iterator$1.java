package kotlin.text;

import androidx.datastore.preferences.PreferencesProto$Value;
import b8.i;
import ha.c;
import ha.d;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lha/c;", "invoke", "(I)Lha/c;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MatcherMatchResult$groups$1$iterator$1 extends Lambda implements l<Integer, c> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MatcherMatchResult$groups$1 f15128j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatcherMatchResult$groups$1$iterator$1(MatcherMatchResult$groups$1 matcherMatchResult$groups$1) {
        super(1);
        this.f15128j = matcherMatchResult$groups$1;
    }

    @Override // u7.l
    public final c U(Integer num) {
        int intValue = num.intValue();
        d dVar = this.f15128j.f15127i;
        Matcher matcher = dVar.f11611a;
        i V1 = a1.c.V1(matcher.start(intValue), matcher.end(intValue));
        if (Integer.valueOf(V1.f6497i).intValue() >= 0) {
            String group = dVar.f11611a.group(intValue);
            g.e(group, "matchResult.group(index)");
            return new c(group, V1);
        }
        return null;
    }
}
