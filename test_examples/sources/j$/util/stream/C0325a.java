package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0284i0;
import java.util.List;

/* renamed from: j$.util.stream.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0325a implements j$.util.function.K0, InterfaceC0284i0, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12431a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12432b;

    public /* synthetic */ C0325a(int i10, Object obj) {
        this.f12431a = i10;
        this.f12432b = obj;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f12431a;
        Object obj2 = this.f12432b;
        switch (i10) {
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                ((InterfaceC0363h2) obj2).accept(obj);
                return;
            default:
                ((List) obj2).add(obj);
                return;
        }
    }

    @Override // j$.util.function.InterfaceC0284i0
    public final Object apply(long j2) {
        int i10 = L0.f12345k;
        return AbstractC0421w0.P0(j2, (IntFunction) this.f12432b);
    }

    @Override // j$.util.function.Consumer
    public final Consumer e(Consumer consumer) {
        switch (this.f12431a) {
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                consumer.getClass();
                return new j$.util.concurrent.u(3, this, consumer);
            default:
                consumer.getClass();
                return new j$.util.concurrent.u(3, this, consumer);
        }
    }

    @Override // j$.util.function.K0
    public final Object get() {
        int i10 = this.f12431a;
        Object obj = this.f12432b;
        switch (i10) {
            case 0:
                return (Spliterator) obj;
            default:
                return ((AbstractC0335c) obj).G1();
        }
    }
}
