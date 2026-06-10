package l8;

import ba.g;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class o<Type extends ba.g> extends j0<Type> {

    /* renamed from: a  reason: collision with root package name */
    public final h9.e f15857a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f15858b;

    public o(h9.e eVar, Type type) {
        v7.g.f(eVar, "underlyingPropertyName");
        v7.g.f(type, "underlyingType");
        this.f15857a = eVar;
        this.f15858b = type;
    }

    @Override // l8.j0
    public final List<Pair<h9.e, Type>> a() {
        return a1.c.N0(new Pair(this.f15857a, this.f15858b));
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f15857a + ", underlyingType=" + this.f15858b + ')';
    }
}
