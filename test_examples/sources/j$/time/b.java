package j$.time;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b extends Clock implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final ZoneId f11891a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ZoneOffset zoneOffset) {
        this.f11891a = zoneOffset;
    }

    @Override // j$.time.Clock
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // j$.time.Clock
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f11891a.equals(((b) obj).f11891a);
        }
        return false;
    }

    @Override // j$.time.Clock
    public final int hashCode() {
        return this.f11891a.hashCode() + 1;
    }

    @Override // j$.time.Clock
    public final Instant instant() {
        return Instant.v(System.currentTimeMillis());
    }

    public final String toString() {
        return "SystemClock[" + this.f11891a + "]";
    }
}
