package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements Comparable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f12063a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f12064b;
    private final ZoneOffset c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f12063a = LocalDateTime.B(j2, 0, zoneOffset);
        this.f12064b = zoneOffset;
        this.c = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f12063a = localDateTime;
        this.f12064b = zoneOffset;
        this.c = zoneOffset2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        return this.f12063a.H(this.f12064b).compareTo(aVar.f12063a.H(aVar.f12064b));
    }

    public final LocalDateTime e() {
        return this.f12063a.E(this.c.v() - this.f12064b.v());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f12063a.equals(aVar.f12063a) && this.f12064b.equals(aVar.f12064b) && this.c.equals(aVar.c);
        }
        return false;
    }

    public final LocalDateTime f() {
        return this.f12063a;
    }

    public final j$.time.d h() {
        return j$.time.d.j(this.c.v() - this.f12064b.v());
    }

    public final int hashCode() {
        return (this.f12063a.hashCode() ^ this.f12064b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 16);
    }

    public final ZoneOffset i() {
        return this.c;
    }

    public final ZoneOffset j() {
        return this.f12064b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List k() {
        return o() ? Collections.emptyList() : Arrays.asList(this.f12064b, this.c);
    }

    public final boolean o() {
        return this.c.v() > this.f12064b.v();
    }

    public final long s() {
        return this.f12063a.G(this.f12064b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(o() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f12063a);
        sb.append(this.f12064b);
        sb.append(" to ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
