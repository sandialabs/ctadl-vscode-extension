package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class u implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17672a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17673b = new g.b(2, 2, 3);
    public final na.d c = new na.d(2023, Month.APRIL, 29);

    public u(String str) {
        this.f17672a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17672a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17673b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        if (v7.g.a(this.f17672a, ((u) obj).f17672a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17672a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_2_3(changelog=", g.a.a(this.f17672a), ")");
    }
}
