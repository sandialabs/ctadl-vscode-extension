package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17650a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17651b = new g.b(2, 0, 1);
    public final na.d c = new na.d(2022, Month.FEBRUARY, 13);

    public j(String str) {
        this.f17650a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17650a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17651b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        if (v7.g.a(this.f17650a, ((j) obj).f17650a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17650a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_0_1(changelog=", g.a.a(this.f17650a), ")");
    }
}
