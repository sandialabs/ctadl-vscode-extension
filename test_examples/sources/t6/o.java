package t6;

import j$.time.Month;
import t6.g;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17660a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f17661b = new g.b(2, 1, 4);
    public final na.d c = new na.d(2022, Month.AUGUST, 2);

    public o(String str) {
        this.f17660a = str;
    }

    @Override // t6.g
    public final String a() {
        return this.f17660a;
    }

    @Override // t6.g
    public final g.b b() {
        return this.f17661b;
    }

    @Override // t6.g
    public final na.d c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        if (v7.g.a(this.f17660a, ((o) obj).f17660a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17660a.hashCode();
    }

    public final String toString() {
        return a4.b.m("Release_2_1_4(changelog=", g.a.a(this.f17660a), ")");
    }
}
