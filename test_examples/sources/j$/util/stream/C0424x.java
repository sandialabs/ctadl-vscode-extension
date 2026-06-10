package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0424x extends AbstractC0336c0 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f12575s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Object f12576t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0424x(AbstractC0335c abstractC0335c, int i10, Object obj, int i11) {
        super(abstractC0335c, i10);
        this.f12575s = i11;
        this.f12576t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        switch (this.f12575s) {
            case 0:
                return new C0412u(this, interfaceC0363h2, 2);
            case 1:
                return new X(this, interfaceC0363h2, 1);
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return new X(this, interfaceC0363h2, 3);
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return new X(this, interfaceC0363h2, 7);
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return new X(this, interfaceC0363h2, 8);
            case 5:
                return new C0356g0(this, interfaceC0363h2, 3);
            case 6:
                return new T1(this, interfaceC0363h2, 3);
            default:
                return new C0397q(this, interfaceC0363h2);
        }
    }
}
