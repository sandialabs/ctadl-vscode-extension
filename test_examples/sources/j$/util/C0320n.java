package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0320n {
    private static final C0320n c = new C0320n();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12279a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12280b;

    private C0320n() {
        this.f12279a = false;
        this.f12280b = 0L;
    }

    private C0320n(long j2) {
        this.f12279a = true;
        this.f12280b = j2;
    }

    public static C0320n a() {
        return c;
    }

    public static C0320n d(long j2) {
        return new C0320n(j2);
    }

    public final long b() {
        if (this.f12279a) {
            return this.f12280b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f12279a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0320n) {
            C0320n c0320n = (C0320n) obj;
            boolean z10 = this.f12279a;
            if (z10 && c0320n.f12279a) {
                if (this.f12280b == c0320n.f12280b) {
                    return true;
                }
            } else if (z10 == c0320n.f12279a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12279a) {
            long j2 = this.f12280b;
            return (int) (j2 ^ (j2 >>> 32));
        }
        return 0;
    }

    public final String toString() {
        return this.f12279a ? String.format("OptionalLong[%s]", Long.valueOf(this.f12280b)) : "OptionalLong.empty";
    }
}
