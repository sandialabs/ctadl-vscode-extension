package j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0286j0 implements InterfaceC0290l0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongPredicate f12246a;

    private /* synthetic */ C0286j0(LongPredicate longPredicate) {
        this.f12246a = longPredicate;
    }

    public static /* synthetic */ InterfaceC0290l0 b(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return longPredicate instanceof C0288k0 ? ((C0288k0) longPredicate).f12249a : new C0286j0(longPredicate);
    }

    public final /* synthetic */ InterfaceC0290l0 a(InterfaceC0290l0 interfaceC0290l0) {
        return b(this.f12246a.and(C0288k0.a(interfaceC0290l0)));
    }

    public final /* synthetic */ InterfaceC0290l0 c() {
        return b(this.f12246a.negate());
    }

    public final /* synthetic */ InterfaceC0290l0 d(InterfaceC0290l0 interfaceC0290l0) {
        return b(this.f12246a.or(C0288k0.a(interfaceC0290l0)));
    }

    public final /* synthetic */ boolean e(long j2) {
        return this.f12246a.test(j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0286j0) {
            obj = ((C0286j0) obj).f12246a;
        }
        return this.f12246a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12246a.hashCode();
    }
}
