package kotlinx.serialization;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import m7.e;
import ua.b;
import v7.g;

/* loaded from: classes.dex */
public final class PolymorphicSerializer<T> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c8.b<T> f15576a;

    /* renamed from: b  reason: collision with root package name */
    public final EmptyList f15577b;
    public final e c;

    public PolymorphicSerializer(c8.b<T> bVar) {
        g.f(bVar, "baseClass");
        this.f15576a = bVar;
        this.f15577b = EmptyList.f12981i;
        this.c = a.a(LazyThreadSafetyMode.PUBLICATION, new PolymorphicSerializer$descriptor$2(this));
    }

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return (sa.e) this.c.getValue();
    }

    @Override // ua.b
    public final c8.b<T> h() {
        return this.f15576a;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f15576a + ')';
    }
}
