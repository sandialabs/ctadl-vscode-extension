package j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0289l implements InterfaceC0293n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f12250a;

    private /* synthetic */ C0289l(DoubleConsumer doubleConsumer) {
        this.f12250a = doubleConsumer;
    }

    public static /* synthetic */ InterfaceC0293n a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return doubleConsumer instanceof C0291m ? ((C0291m) doubleConsumer).f12251a : new C0289l(doubleConsumer);
    }

    @Override // j$.util.function.InterfaceC0293n
    public final /* synthetic */ void accept(double d5) {
        this.f12250a.accept(d5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0289l) {
            obj = ((C0289l) obj).f12250a;
        }
        return this.f12250a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12250a.hashCode();
    }

    @Override // j$.util.function.InterfaceC0293n
    public final /* synthetic */ InterfaceC0293n n(InterfaceC0293n interfaceC0293n) {
        return a(this.f12250a.andThen(C0291m.a(interfaceC0293n)));
    }
}
