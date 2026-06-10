package j$.util.stream;

import j$.util.function.C0267a;
import j$.util.function.C0275e;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0377l implements Collector {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0381m f12493a;

    private /* synthetic */ C0377l(InterfaceC0381m interfaceC0381m) {
        this.f12493a = interfaceC0381m;
    }

    public static /* synthetic */ Collector a(InterfaceC0381m interfaceC0381m) {
        if (interfaceC0381m == null) {
            return null;
        }
        return interfaceC0381m instanceof C0373k ? ((C0373k) interfaceC0381m).f12488a : new C0377l(interfaceC0381m);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return C0267a.a(((C0373k) this.f12493a).a());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return ((C0373k) this.f12493a).b();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return C0275e.a(((C0373k) this.f12493a).c());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0381m interfaceC0381m = this.f12493a;
        if (obj instanceof C0377l) {
            obj = ((C0377l) obj).f12493a;
        }
        return interfaceC0381m.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return j$.util.function.D.a(((C0373k) this.f12493a).e());
    }

    public final /* synthetic */ int hashCode() {
        return this.f12493a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return j$.util.function.J0.a(((C0373k) this.f12493a).f());
    }
}
