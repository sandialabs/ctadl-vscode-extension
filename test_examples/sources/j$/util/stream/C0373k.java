package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0273d;
import j$.util.function.Function;
import j$.util.function.InterfaceC0277f;
import java.util.Set;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0373k implements InterfaceC0381m {

    /* renamed from: a */
    public final /* synthetic */ Collector f12488a;

    private /* synthetic */ C0373k(Collector collector) {
        this.f12488a = collector;
    }

    public static /* synthetic */ InterfaceC0381m d(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C0377l ? ((C0377l) collector).f12493a : new C0373k(collector);
    }

    public final /* synthetic */ BiConsumer a() {
        return BiConsumer.VivifiedWrapper.convert(this.f12488a.accumulator());
    }

    public final /* synthetic */ Set b() {
        return this.f12488a.characteristics();
    }

    public final /* synthetic */ InterfaceC0277f c() {
        return C0273d.b(this.f12488a.combiner());
    }

    public final /* synthetic */ Function e() {
        return Function.VivifiedWrapper.convert(this.f12488a.finisher());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0373k) {
            obj = ((C0373k) obj).f12488a;
        }
        return this.f12488a.equals(obj);
    }

    public final /* synthetic */ j$.util.function.K0 f() {
        return j$.util.function.I0.a(this.f12488a.supplier());
    }

    public final /* synthetic */ int hashCode() {
        return this.f12488a.hashCode();
    }
}
