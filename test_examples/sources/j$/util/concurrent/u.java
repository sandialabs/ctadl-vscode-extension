package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12173a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12174b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.f12173a = i10;
        this.f12174b = obj;
        this.c = obj2;
    }

    public /* synthetic */ u(BiFunction biFunction, Function function) {
        this.f12173a = 2;
        this.c = biFunction;
        this.f12174b = function;
    }

    @Override // j$.util.function.BiFunction
    public final BiFunction a(Function function) {
        function.getClass();
        return new u(this, function);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        ((Consumer) this.f12174b).accept(obj);
        ((Consumer) this.c).accept(obj);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i10 = this.f12173a;
        Object obj3 = this.c;
        Object obj4 = this.f12174b;
        switch (i10) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                return;
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                return;
        }
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.f12174b).apply(((BiFunction) this.c).apply(obj, obj2));
    }

    @Override // j$.util.function.BiConsumer
    public final BiConsumer c(BiConsumer biConsumer) {
        switch (this.f12173a) {
            case 0:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
        }
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        consumer.getClass();
        return new u(3, this, consumer);
    }
}
