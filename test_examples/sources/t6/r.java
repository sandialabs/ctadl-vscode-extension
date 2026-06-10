package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class r implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17666a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17667b = new g.b(2, 2, 0);
    public final na.d c = new na.d(2022, Month.NOVEMBER, 15);

    public r(String str) {
        this.f17666a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17666a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17667b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        if (v7.g.a(this.f17666a, ((r) obj).f17666a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17666a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_2_0(changelog=", g.a.a(this.f17666a), ")");
    }
}
