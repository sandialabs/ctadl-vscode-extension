package j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0291m implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0293n f12251a;

    private /* synthetic */ C0291m(InterfaceC0293n interfaceC0293n) {
        this.f12251a = interfaceC0293n;
    }

    public static /* synthetic */ DoubleConsumer a(InterfaceC0293n interfaceC0293n) {
        if (interfaceC0293n == null) {
            return null;
        }
        return interfaceC0293n instanceof C0289l ? ((C0289l) interfaceC0293n).f12250a : new C0291m(interfaceC0293n);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d5) {
        this.f12251a.accept(d5);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return a(this.f12251a.n(C0289l.a(doubleConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0293n interfaceC0293n = this.f12251a;
        if (obj instanceof C0291m) {
            obj = ((C0291m) obj).f12251a;
        }
        return interfaceC0293n.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12251a.hashCode();
    }
}
