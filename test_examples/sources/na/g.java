package na;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import kotlinx.datetime.IllegalTimeZoneException;

@qa.d(with = pa.g.class)
/* loaded from: classes.dex */
public class g {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ZoneId f16151a;

    /* loaded from: classes.dex */
    public static final class a {
        public static g a() {
            ZoneId systemDefault = ZoneId.systemDefault();
            v7.g.e(systemDefault, "systemDefault()");
            return c(systemDefault);
        }

        public static g b(String str) {
            v7.g.f(str, "zoneId");
            try {
                ZoneId of = ZoneId.of(str);
                v7.g.e(of, "of(zoneId)");
                return c(of);
            } catch (Exception e10) {
                if (e10 instanceof DateTimeException) {
                    throw new IllegalTimeZoneException(e10);
                }
                throw e10;
            }
        }

        public static g c(ZoneId zoneId) {
            boolean z10;
            if (zoneId instanceof ZoneOffset) {
                return new b(new h((ZoneOffset) zoneId));
            }
            try {
                z10 = zoneId.getRules().isFixedOffset();
            } catch (ArrayIndexOutOfBoundsException unused) {
                z10 = false;
            }
            if (z10) {
                ZoneId normalized = zoneId.normalized();
                v7.g.d(normalized, "null cannot be cast to non-null type java.time.ZoneOffset");
                return new b(new h((ZoneOffset) normalized), zoneId);
            }
            return new g(zoneId);
        }

        public final qa.b<g> serializer() {
            return pa.g.f16797a;
        }
    }

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        v7.g.e(zoneOffset, "UTC");
        new b(new h(zoneOffset));
    }

    public g(ZoneId zoneId) {
        v7.g.f(zoneId, "zoneId");
        this.f16151a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                if (v7.g.a(this.f16151a, ((g) obj).f16151a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16151a.hashCode();
    }

    public final String toString() {
        String zoneId = this.f16151a.toString();
        v7.g.e(zoneId, "zoneId.toString()");
        return zoneId;
    }
}
