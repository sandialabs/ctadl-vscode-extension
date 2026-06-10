package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class m implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17656a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17657b = new g.b(2, 1, 2);
    public final na.d c = new na.d(2022, Month.JULY, 14);

    public m(String str) {
        this.f17656a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17656a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17657b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        if (v7.g.a(this.f17656a, ((m) obj).f17656a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17656a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_1_2(changelog=", g.a.a(this.f17656a), ")");
    }
}
