package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.InterfaceC0277f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0422w1 extends AbstractC0421w0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f12570h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f12571i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Object f12572j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Object f12573k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0422w1(W2 w22, Object obj, Object obj2, Object obj3, int i10) {
        super(w22);
        this.f12570h = i10;
        this.f12571i = obj;
        this.f12573k = obj2;
        this.f12572j = obj3;
    }

    @Override // j$.util.stream.AbstractC0421w0
    public final P1 u1() {
        int i10 = this.f12570h;
        Object obj = this.f12571i;
        Object obj2 = this.f12573k;
        Object obj3 = this.f12572j;
        switch (i10) {
            case 0:
                return new C0426x1((j$.util.function.K0) obj3, (j$.util.function.E0) obj2, (InterfaceC0277f) obj);
            case 1:
                return new C1((j$.util.function.K0) obj3, (j$.util.function.y0) obj2, (InterfaceC0277f) obj);
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return new D1(obj3, (BiFunction) obj2, (InterfaceC0277f) obj);
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return new H1((j$.util.function.K0) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new L1((j$.util.function.K0) obj3, (j$.util.function.B0) obj2, (InterfaceC0277f) obj);
        }
    }
}
