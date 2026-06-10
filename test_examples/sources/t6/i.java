package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17648a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17649b = new g.b(2, 0, 0);
    public final na.d c = new na.d(2022, Month.FEBRUARY, 9);

    public i(String str) {
        this.f17648a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17648a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17649b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        if (v7.g.a(this.f17648a, ((i) obj).f17648a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17648a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_0_0(changelog=", g.a.a(this.f17648a), ")");
    }
}
