package kotlin.reflect.jvm.internal.impl.load.kotlin;

import g9.d;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f13985a;

    /* loaded from: classes.dex */
    public static final class a {
        public static i a(g9.d dVar) {
            if (dVar instanceof d.b) {
                String c = dVar.c();
                String b5 = dVar.b();
                v7.g.f(c, "name");
                v7.g.f(b5, "desc");
                return new i(c.concat(b5));
            } else if (dVar instanceof d.a) {
                String c10 = dVar.c();
                String b10 = dVar.b();
                v7.g.f(c10, "name");
                v7.g.f(b10, "desc");
                return new i(c10 + '#' + b10);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public i(String str) {
        this.f13985a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && v7.g.a(this.f13985a, ((i) obj).f13985a);
    }

    public final int hashCode() {
        return this.f13985a.hashCode();
    }

    public final String toString() {
        return androidx.activity.e.j(new StringBuilder("MemberSignature(signature="), this.f13985a, ')');
    }
}
