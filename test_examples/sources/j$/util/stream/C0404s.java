package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import j$.util.function.InterfaceC0277f;

/* renamed from: j$.util.stream.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0404s implements InterfaceC0277f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12535a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BiConsumer f12536b;

    public /* synthetic */ C0404s(BiConsumer biConsumer, int i10) {
        this.f12535a = i10;
        this.f12536b = biConsumer;
    }

    @Override // j$.util.function.BiFunction
    public final BiFunction a(Function function) {
        switch (this.f12535a) {
            case 0:
                function.getClass();
                return new j$.util.concurrent.u(this, function);
            case 1:
                function.getClass();
                return new j$.util.concurrent.u(this, function);
            default:
                function.getClass();
                return new j$.util.concurrent.u(this, function);
        }
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i10 = this.f12535a;
        BiConsumer biConsumer = this.f12536b;
        switch (i10) {
            case 0:
                biConsumer.accept(obj, obj2);
                return obj;
            case 1:
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                biConsumer.accept(obj, obj2);
                return obj;
        }
    }
}
