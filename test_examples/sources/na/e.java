package na;

import j$.time.LocalDateTime;
import j$.time.chrono.ChronoLocalDateTime;

@qa.d(with = pa.f.class)
/* loaded from: classes.dex */
public final class e implements Comparable<e> {
    public static final a Companion = new a();

    /* renamed from: i  reason: collision with root package name */
    public final LocalDateTime f16149i;

    /* loaded from: classes.dex */
    public static final class a {
        public final qa.b<e> serializer() {
            return pa.f.f16795a;
        }
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        v7.g.e(localDateTime, "MIN");
        new e(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        v7.g.e(localDateTime2, "MAX");
        new e(localDateTime2);
    }

    public e(LocalDateTime localDateTime) {
        v7.g.f(localDateTime, "value");
        this.f16149i = localDateTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        e eVar2 = eVar;
        v7.g.f(eVar2, "other");
        return this.f16149i.compareTo((ChronoLocalDateTime<?>) eVar2.f16149i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (v7.g.a(this.f16149i, ((e) obj).f16149i)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16149i.hashCode();
    }

    public final String toString() {
        String localDateTime = this.f16149i.toString();
        v7.g.e(localDateTime, "value.toString()");
        return localDateTime;
    }
}
