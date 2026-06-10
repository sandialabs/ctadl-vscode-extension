package kotlinx.datetime.serializers;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import c8.k;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m7.n;
import sa.a;
import u7.l;
import v7.g;
import v7.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsa/a;", "Lm7/n;", "invoke", "(Lsa/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class MonthBasedDateTimeUnitSerializer$descriptor$1 extends Lambda implements l<a, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final MonthBasedDateTimeUnitSerializer$descriptor$1 f15571j = new MonthBasedDateTimeUnitSerializer$descriptor$1();

    public MonthBasedDateTimeUnitSerializer$descriptor$1() {
        super(1);
    }

    @Override // u7.l
    public final n U(a aVar) {
        a aVar2 = aVar;
        g.f(aVar2, "$this$buildClassSerialDescriptor");
        EmptyList emptyList = EmptyList.f12981i;
        k i10 = i.f18169a.i(i.a(Integer.TYPE), Collections.emptyList());
        g.f(i10, "type");
        aVar2.a("months", c.q1(xa.c.f18773a, i10).a(), emptyList, false);
        return n.f16010a;
    }
}
