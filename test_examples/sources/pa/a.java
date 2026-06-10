package pa;

import kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer;
import kotlinx.serialization.SealedClassSerializer;
import na.a;
import v7.i;

/* loaded from: classes.dex */
public final class a extends ua.b<a.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16785a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final SealedClassSerializer<a.b> f16786b = new SealedClassSerializer<>("kotlinx.datetime.DateTimeUnit.DateBased", i.a(a.b.class), new c8.b[]{i.a(a.c.class), i.a(a.d.class)}, new qa.b[]{DayBasedDateTimeUnitSerializer.f15566a, MonthBasedDateTimeUnitSerializer.f15569a});

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f16786b.a();
    }

    @Override // ua.b
    public final qa.a<a.b> f(ta.a aVar, String str) {
        v7.g.f(aVar, "decoder");
        return f16786b.f(aVar, str);
    }

    @Override // ua.b
    public final qa.e<a.b> g(ta.d dVar, a.b bVar) {
        a.b bVar2 = bVar;
        v7.g.f(dVar, "encoder");
        v7.g.f(bVar2, "value");
        return f16786b.g(dVar, bVar2);
    }

    @Override // ua.b
    public final c8.b<a.b> h() {
        return i.a(a.b.class);
    }
}
