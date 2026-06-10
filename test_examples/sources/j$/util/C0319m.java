package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0319m {
    private static final C0319m c = new C0319m();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12277a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12278b;

    private C0319m() {
        this.f12277a = false;
        this.f12278b = 0;
    }

    private C0319m(int i10) {
        this.f12277a = true;
        this.f12278b = i10;
    }

    public static C0319m a() {
        return c;
    }

    public static C0319m d(int i10) {
        return new C0319m(i10);
    }

    public final int b() {
        if (this.f12277a) {
            return this.f12278b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f12277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0319m) {
            C0319m c0319m = (C0319m) obj;
            boolean z10 = this.f12277a;
            if (z10 && c0319m.f12277a) {
                if (this.f12278b == c0319m.f12278b) {
                    return true;
                }
            } else if (z10 == c0319m.f12277a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12277a) {
            return this.f12278b;
        }
        return 0;
    }

    public final String toString() {
        return this.f12277a ? String.format("OptionalInt[%s]", Integer.valueOf(this.f12278b)) : "OptionalInt.empty";
    }
}
