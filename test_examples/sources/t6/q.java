package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class q implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17664a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17665b = new g.b(2, 1, 6);
    public final na.d c = new na.d(2022, Month.AUGUST, 7);

    public q(String str) {
        this.f17664a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17664a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17665b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        if (v7.g.a(this.f17664a, ((q) obj).f17664a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17664a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_1_6(changelog=", g.a.a(this.f17664a), ")");
    }
}
