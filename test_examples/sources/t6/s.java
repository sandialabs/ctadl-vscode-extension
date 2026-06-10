package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class s implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17668a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17669b = new g.b(2, 2, 1);
    public final na.d c = new na.d(2023, Month.MARCH, 13);

    public s(String str) {
        this.f17668a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17668a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17669b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        if (v7.g.a(this.f17668a, ((s) obj).f17668a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17668a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_2_1(changelog=", g.a.a(this.f17668a), ")");
    }
}
