package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.l;
import l8.d;
import l8.i0;
import l8.s;
import m7.e;
import y9.e0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class IntegerLiteralTypeConstructor implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f14705a;

    /* renamed from: b  reason: collision with root package name */
    public final s f14706b;
    public final Set<r> c;

    /* renamed from: d  reason: collision with root package name */
    public final v f14707d;

    /* renamed from: e  reason: collision with root package name */
    public final e f14708e;

    public IntegerLiteralTypeConstructor() {
        throw null;
    }

    public IntegerLiteralTypeConstructor(long j2, s sVar, Set set) {
        l.f15045j.getClass();
        this.f14707d = KotlinTypeFactory.d(l.f15046k, this);
        this.f14708e = a.b(new IntegerLiteralTypeConstructor$supertypes$2(this));
        this.f14705a = j2;
        this.f14706b = sVar;
        this.c = set;
    }

    @Override // y9.e0
    public final boolean a() {
        return false;
    }

    @Override // y9.e0
    public final d c() {
        return null;
    }

    @Override // y9.e0
    public final List<i0> e() {
        return EmptyList.f12981i;
    }

    @Override // y9.e0
    public final Collection<r> f() {
        return (List) this.f14708e.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + c.t2(this.c, ",", null, null, IntegerLiteralTypeConstructor$valueToString$1.f14710j, 30) + ']');
        return sb.toString();
    }

    @Override // y9.e0
    public final kotlin.reflect.jvm.internal.impl.builtins.e u() {
        return this.f14706b.u();
    }
}
