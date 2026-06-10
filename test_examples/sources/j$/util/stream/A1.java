package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.function.InterfaceC0270b0;
import j$.util.function.InterfaceC0277f;
import j$.util.function.InterfaceC0285j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class A1 extends AbstractC0421w0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f12285h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f12286i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A1(W2 w22, Object obj, int i10) {
        super(w22);
        this.f12285h = i10;
        this.f12286i = obj;
    }

    @Override // j$.util.stream.AbstractC0421w0
    public final P1 u1() {
        int i10 = this.f12285h;
        Object obj = this.f12286i;
        switch (i10) {
            case 0:
                return new B1((InterfaceC0285j) obj);
            case 1:
                return new E1((InterfaceC0277f) obj);
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return new K1((j$.util.function.G) obj);
            default:
                return new O1((InterfaceC0270b0) obj);
        }
    }
}
