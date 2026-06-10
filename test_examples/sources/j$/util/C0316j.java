package j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0316j {

    /* renamed from: b  reason: collision with root package name */
    private static final C0316j f12273b = new C0316j();

    /* renamed from: a  reason: collision with root package name */
    private final Object f12274a;

    private C0316j() {
        this.f12274a = null;
    }

    private C0316j(Object obj) {
        obj.getClass();
        this.f12274a = obj;
    }

    public static C0316j a() {
        return f12273b;
    }

    public static C0316j d(Object obj) {
        return new C0316j(obj);
    }

    public final Object b() {
        Object obj = this.f12274a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f12274a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0316j) {
            return AbstractC0261c.o(this.f12274a, ((C0316j) obj).f12274a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f12274a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f12274a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
