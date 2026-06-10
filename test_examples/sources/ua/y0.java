package ua;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;

/* loaded from: classes.dex */
public abstract class y0 implements sa.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f18033a;

    /* renamed from: b  reason: collision with root package name */
    public final sa.e f18034b;
    public final sa.e c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18035d = 2;

    public y0(String str, sa.e eVar, sa.e eVar2) {
        this.f18033a = str;
        this.f18034b = eVar;
        this.c = eVar2;
    }

    @Override // sa.e
    public final int a(String str) {
        v7.g.f(str, "name");
        Integer P0 = ha.h.P0(str);
        if (P0 != null) {
            return P0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // sa.e
    public final String b() {
        return this.f18033a;
    }

    @Override // sa.e
    public final int c() {
        return this.f18035d;
    }

    @Override // sa.e
    public final String d(int i10) {
        return String.valueOf(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (v7.g.a(this.f18033a, y0Var.f18033a) && v7.g.a(this.f18034b, y0Var.f18034b) && v7.g.a(this.c, y0Var.c)) {
            return true;
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
        throw new IllegalArgumentException(androidx.activity.e.k(a4.b.o("Illegal index ", i10, ", "), this.f18033a, " expects only non-negative indices").toString());
    }

    @Override // sa.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f12981i;
    }

    @Override // sa.e
    public final sa.h h() {
        return b.c.f15611a;
    }

    public final int hashCode() {
        int hashCode = this.f18034b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.f18033a.hashCode() * 31)) * 31);
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
            int i11 = i10 % 2;
            if (i11 != 0) {
                if (i11 == 1) {
                    return this.c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f18034b;
        }
        throw new IllegalArgumentException(androidx.activity.e.k(a4.b.o("Illegal index ", i10, ", "), this.f18033a, " expects only non-negative indices").toString());
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
        throw new IllegalArgumentException(androidx.activity.e.k(a4.b.o("Illegal index ", i10, ", "), this.f18033a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f18033a + '(' + this.f18034b + ", " + this.c + ')';
    }
}
