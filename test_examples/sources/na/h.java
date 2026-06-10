package na;

import j$.time.ZoneOffset;

@qa.d(with = pa.h.class)
/* loaded from: classes.dex */
public final class h {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ZoneOffset f16152a;

    /* loaded from: classes.dex */
    public static final class a {
        public final qa.b<h> serializer() {
            return pa.h.f16799a;
        }
    }

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        v7.g.e(zoneOffset, "UTC");
        new h(zoneOffset);
    }

    public h(ZoneOffset zoneOffset) {
        v7.g.f(zoneOffset, "zoneOffset");
        this.f16152a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (v7.g.a(this.f16152a, ((h) obj).f16152a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16152a.hashCode();
    }

    public final String toString() {
        String zoneOffset = this.f16152a.toString();
        v7.g.e(zoneOffset, "zoneOffset.toString()");
        return zoneOffset;
    }
}
