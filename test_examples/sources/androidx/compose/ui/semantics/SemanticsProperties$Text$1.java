package androidx.compose.ui.semantics;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.jvm.internal.Lambda;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lp1/a;", "parentValue", "childValue", "invoke", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SemanticsProperties$Text$1 extends Lambda implements p<List<? extends p1.a>, List<? extends p1.a>, List<? extends p1.a>> {

    /* renamed from: j  reason: collision with root package name */
    public static final SemanticsProperties$Text$1 f3974j = new SemanticsProperties$Text$1();

    public SemanticsProperties$Text$1() {
        super(2);
    }

    @Override // u7.p
    public final List<? extends p1.a> R(List<? extends p1.a> list, List<? extends p1.a> list2) {
        List<? extends p1.a> list3 = list;
        List<? extends p1.a> list4 = list2;
        g.f(list4, "childValue");
        if (list3 != null) {
            ArrayList N2 = c.N2(list3);
            N2.addAll(list4);
            return N2;
        }
        return list4;
    }
}
