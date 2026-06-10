package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17646a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17647b = new g.b(1, 8, 0);
    public final na.d c = new na.d(2022, Month.JANUARY, 11);

    public h(String str) {
        this.f17646a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17646a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17647b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        if (v7.g.a(this.f17646a, ((h) obj).f17646a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17646a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_1_8_0(changelog=", g.a.a(this.f17646a), ")");
    }
}
