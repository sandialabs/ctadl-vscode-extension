package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class n implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17658a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17659b = new g.b(2, 1, 3);
    public final na.d c = new na.d(2022, Month.JULY, 24);

    public n(String str) {
        this.f17658a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17658a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17659b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        if (v7.g.a(this.f17658a, ((n) obj).f17658a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17658a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_1_3(changelog=", g.a.a(this.f17658a), ")");
    }
}
