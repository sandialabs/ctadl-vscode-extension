package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0290l0;
import j$.util.function.InterfaceC0304t;
import j$.util.function.Predicate;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: j$.util.stream.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0389o implements Consumer, j$.util.function.K0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12506a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12507b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0389o(int i10, Object obj, Object obj2) {
        this.f12506a = i10;
        this.f12507b = obj;
        this.c = obj2;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f12506a;
        Object obj2 = this.c;
        Object obj3 = this.f12507b;
        switch (i10) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) obj3).accept(obj2, obj);
                return;
            default:
                ((C0349e3) obj3).j((Consumer) obj2, obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        switch (this.f12506a) {
            case 0:
                consumer.getClass();
                return new j$.util.concurrent.u(3, this, consumer);
            case 5:
                consumer.getClass();
                return new j$.util.concurrent.u(3, this, consumer);
            default:
                consumer.getClass();
                return new j$.util.concurrent.u(3, this, consumer);
        }
    }

    @Override // j$.util.function.K0
    public final Object get() {
        int i10 = this.f12506a;
        Object obj = this.c;
        Object obj2 = this.f12507b;
        switch (i10) {
            case 1:
                return new C0394p0((j$.util.function.O) obj, (EnumC0409t0) obj2);
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0390o0((Predicate) obj, (EnumC0409t0) obj2);
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0401r0((InterfaceC0304t) obj, (EnumC0409t0) obj2);
            default:
                return new C0398q0((InterfaceC0290l0) obj, (EnumC0409t0) obj2);
        }
    }
}
