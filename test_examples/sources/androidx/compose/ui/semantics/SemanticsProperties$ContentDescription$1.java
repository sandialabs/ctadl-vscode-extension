package androidx.compose.ui.semantics;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.jvm.internal.Lambda;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "parentValue", "childValue", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsProperties$ContentDescription$1 extends Lambda implements p<List<? extends String>, List<? extends String>, List<? extends String>> {

    /* renamed from: j  reason: collision with root package name */
    public static final SemanticsProperties$ContentDescription$1 f3967j = new SemanticsProperties$ContentDescription$1();

    public SemanticsProperties$ContentDescription$1() {
        super(2);
    }

    @Override // u7.p
    public final List<? extends String> R(List<? extends String> list, List<? extends String> list2) {
        List<? extends String> list3 = list;
        List<? extends String> list4 = list2;
        g.f(list4, "childValue");
        if (list3 != null) {
            ArrayList N2 = c.N2(list3);
            N2.addAll(list4);
            return N2;
        }
        return list4;
    }
}
