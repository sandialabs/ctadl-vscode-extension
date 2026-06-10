package pa;

import kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.TimeBasedDateTimeUnitSerializer;
import kotlinx.serialization.SealedClassSerializer;
import na.a;
import v7.i;

/* loaded from: classes.dex */
public final class b extends ua.b<na.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16787a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final SealedClassSerializer<na.a> f16788b = new SealedClassSerializer<>("kotlinx.datetime.DateTimeUnit", i.a(na.a.class), new c8.b[]{i.a(a.c.class), i.a(a.d.class), i.a(a.e.class)}, new qa.b[]{DayBasedDateTimeUnitSerializer.f15566a, MonthBasedDateTimeUnitSerializer.f15569a, TimeBasedDateTimeUnitSerializer.f15572a});

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f16788b.a();
    }

    @Override // ua.b
    public final qa.a<na.a> f(ta.a aVar, String str) {
        v7.g.f(aVar, "decoder");
        return f16788b.f(aVar, str);
    }

    @Override // ua.b
    public final qa.e<na.a> g(ta.d dVar, na.a aVar) {
        na.a aVar2 = aVar;
        v7.g.f(dVar, "encoder");
        v7.g.f(aVar2, "value");
        return f16788b.g(dVar, aVar2);
    }

    @Override // ua.b
    public final c8.b<na.a> h() {
        return i.a(na.a.class);
    }
}
