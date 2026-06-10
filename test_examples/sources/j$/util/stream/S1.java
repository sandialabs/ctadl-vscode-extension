package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.C0313g;
import j$.util.C0314h;
import j$.util.C0315i;
import j$.util.C0316j;
import j$.util.C0318l;
import j$.util.C0319m;
import j$.util.C0320n;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0270b0;
import j$.util.function.InterfaceC0285j;
import j$.util.function.InterfaceC0299q;
import j$.util.function.Predicate;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final /* synthetic */ class S1 implements IntFunction, j$.util.function.T0, Consumer, j$.util.function.K0, BiConsumer, InterfaceC0285j, InterfaceC0299q, j$.util.function.y0, Predicate, j$.util.function.G, j$.util.function.B0, InterfaceC0270b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12379a;

    public /* synthetic */ S1(int i10) {
        this.f12379a = i10;
    }

    @Override // j$.util.function.Predicate
    public final Predicate a(Predicate predicate) {
        switch (this.f12379a) {
            case 19:
                predicate.getClass();
                return new j$.util.function.F0(this, predicate, 0);
            case 20:
                predicate.getClass();
                return new j$.util.function.F0(this, predicate, 0);
            case 21:
                predicate.getClass();
                return new j$.util.function.F0(this, predicate, 0);
            default:
                predicate.getClass();
                return new j$.util.function.F0(this, predicate, 0);
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // j$.util.function.y0
    public final void accept(Object obj, double d5) {
        ((C0313g) obj).accept(d5);
    }

    @Override // j$.util.function.B0
    public final void accept(Object obj, int i10) {
        ((C0314h) obj).accept(i10);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f12379a) {
            case 12:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 13:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            case 18:
                ((C0313g) obj).a((C0313g) obj2);
                return;
            default:
                ((C0314h) obj).a((C0314h) obj2);
                return;
        }
    }

    @Override // j$.util.function.InterfaceC0299q
    public final Object apply(double d5) {
        return Double.valueOf(d5);
    }

    @Override // j$.util.function.IntFunction
    public final Object apply(int i10) {
        switch (this.f12379a) {
            case 0:
                return new Object[i10];
            case 1:
            default:
                return Integer.valueOf(i10);
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return new Object[i10];
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return new Integer[i10];
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return new Long[i10];
            case 5:
                return new Double[i10];
        }
    }

    @Override // j$.util.function.InterfaceC0285j
    public final double applyAsDouble(double d5, double d10) {
        switch (this.f12379a) {
            case 14:
                return Math.min(d5, d10);
            default:
                return Math.max(d5, d10);
        }
    }

    @Override // j$.util.function.G
    public final int applyAsInt(int i10, int i11) {
        switch (this.f12379a) {
            case 23:
                return Math.min(i10, i11);
            case 24:
                return i10 + i11;
            default:
                return Math.max(i10, i11);
        }
    }

    @Override // j$.util.function.InterfaceC0270b0
    public final long applyAsLong(long j2, long j10) {
        return Math.min(j2, j10);
    }

    @Override // j$.util.function.T0
    public final long applyAsLong(Object obj) {
        return 1L;
    }

    @Override // j$.util.function.Predicate
    public final Predicate b(Predicate predicate) {
        switch (this.f12379a) {
            case 19:
                predicate.getClass();
                return new j$.util.function.F0(this, predicate, 1);
            case 20:
                predicate.getClass();
                return new j$.util.function.F0(this, predicate, 1);
            case 21:
                predicate.getClass();
                return new j$.util.function.F0(this, predicate, 1);
            default:
                predicate.getClass();
                return new j$.util.function.F0(this, predicate, 1);
        }
    }

    @Override // j$.util.function.BiConsumer
    public final BiConsumer c(BiConsumer biConsumer) {
        switch (this.f12379a) {
            case 12:
                biConsumer.getClass();
                return new j$.util.concurrent.u(1, this, biConsumer);
            case 13:
                biConsumer.getClass();
                return new j$.util.concurrent.u(1, this, biConsumer);
            case 18:
                biConsumer.getClass();
                return new j$.util.concurrent.u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new j$.util.concurrent.u(1, this, biConsumer);
        }
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        switch (this.f12379a) {
            case 6:
                consumer.getClass();
                return new j$.util.concurrent.u(3, this, consumer);
            default:
                consumer.getClass();
                return new j$.util.concurrent.u(3, this, consumer);
        }
    }

    @Override // j$.util.function.K0
    public final Object get() {
        switch (this.f12379a) {
            case 8:
                return new C0313g();
            case ma.i.f16046m /* 9 */:
                return new C0314h();
            case ma.i.f16047o /* 10 */:
                return new C0315i();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // j$.util.function.Predicate
    public final Predicate negate() {
        switch (this.f12379a) {
            case 19:
                return new j$.util.function.G0(this);
            case 20:
                return new j$.util.function.G0(this);
            case 21:
                return new j$.util.function.G0(this);
            default:
                return new j$.util.function.G0(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f12379a) {
            case 19:
                return ((C0318l) obj).c();
            case 20:
                return ((C0320n) obj).c();
            case 21:
                return ((C0316j) obj).c();
            default:
                return ((C0319m) obj).c();
        }
    }
}
