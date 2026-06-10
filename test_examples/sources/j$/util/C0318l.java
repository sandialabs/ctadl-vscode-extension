package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0318l {
    private static final C0318l c = new C0318l();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12275a;

    /* renamed from: b  reason: collision with root package name */
    private final double f12276b;

    private C0318l() {
        this.f12275a = false;
        this.f12276b = Double.NaN;
    }

    private C0318l(double d5) {
        this.f12275a = true;
        this.f12276b = d5;
    }

    public static C0318l a() {
        return c;
    }

    public static C0318l d(double d5) {
        return new C0318l(d5);
    }

    public final double b() {
        if (this.f12275a) {
            return this.f12276b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f12275a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0318l) {
            C0318l c0318l = (C0318l) obj;
            boolean z10 = this.f12275a;
            if (z10 && c0318l.f12275a) {
                if (Double.compare(this.f12276b, c0318l.f12276b) == 0) {
                    return true;
                }
            } else if (z10 == c0318l.f12275a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12275a) {
            long doubleToLongBits = Double.doubleToLongBits(this.f12276b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return 0;
    }

    public final String toString() {
        return this.f12275a ? String.format("OptionalDouble[%s]", Double.valueOf(this.f12276b)) : "OptionalDouble.empty";
    }
}
