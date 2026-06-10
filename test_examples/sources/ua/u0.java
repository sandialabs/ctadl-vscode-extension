package ua;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;

/* loaded from: classes.dex */
public abstract class u0 implements sa.e {

    /* renamed from: a  reason: collision with root package name */
    public final sa.e f18015a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18016b = 1;

    public u0(sa.e eVar) {
        this.f18015a = eVar;
    }

    @Override // sa.e
    public final int a(String str) {
        v7.g.f(str, "name");
        Integer P0 = ha.h.P0(str);
        if (P0 != null) {
            return P0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // sa.e
    public final int c() {
        return this.f18016b;
    }

    @Override // sa.e
    public final String d(int i10) {
        return String.valueOf(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            return v7.g.a(this.f18015a, u0Var.f18015a) && v7.g.a(b(), u0Var.b());
        }
        return false;
    }

    @Override // sa.e
    public final boolean f() {
        return false;
    }

    @Override // sa.e
    public final List<Annotation> g(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return EmptyList.f12981i;
        }
        StringBuilder o10 = a4.b.o("Illegal index ", i10, ", ");
        o10.append(b());
        o10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o10.toString().toString());
    }

    @Override // sa.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f12981i;
    }

    @Override // sa.e
    public final sa.h h() {
        return b.C0175b.f15610a;
    }

    public final int hashCode() {
        return b().hashCode() + (this.f18015a.hashCode() * 31);
    }

    @Override // sa.e
    public final boolean i() {
        return false;
    }

    @Override // sa.e
    public final sa.e j(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return this.f18015a;
        }
        StringBuilder o10 = a4.b.o("Illegal index ", i10, ", ");
        o10.append(b());
        o10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o10.toString().toString());
    }

    @Override // sa.e
    public final boolean k(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        StringBuilder o10 = a4.b.o("Illegal index ", i10, ", ");
        o10.append(b());
        o10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(o10.toString().toString());
    }

    public final String toString() {
        return b() + '(' + this.f18015a + ')';
    }
}
