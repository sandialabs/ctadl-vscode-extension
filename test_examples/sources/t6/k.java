package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class k implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17652a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17653b = new g.b(2, 1, 0);
    public final na.d c = new na.d(2022, Month.JULY, 7);

    public k(String str) {
        this.f17652a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17652a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17653b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        if (v7.g.a(this.f17652a, ((k) obj).f17652a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17652a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_1_0(changelog=", g.a.a(this.f17652a), ")");
    }
}
