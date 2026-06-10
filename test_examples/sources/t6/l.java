package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17654a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17655b = new g.b(2, 1, 1);
    public final na.d c = new na.d(2022, Month.JULY, 9);

    public l(String str) {
        this.f17654a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17654a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17655b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        if (v7.g.a(this.f17654a, ((l) obj).f17654a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17654a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_1_1(changelog=", g.a.a(this.f17654a), ")");
    }
}
