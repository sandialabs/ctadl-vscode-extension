package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class p implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17662a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17663b = new g.b(2, 1, 5);
    public final na.d c = new na.d(2022, Month.AUGUST, 5);

    public p(String str) {
        this.f17662a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17662a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17663b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        if (v7.g.a(this.f17662a, ((p) obj).f17662a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17662a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_1_5(changelog=", g.a.a(this.f17662a), ")");
    }
}
