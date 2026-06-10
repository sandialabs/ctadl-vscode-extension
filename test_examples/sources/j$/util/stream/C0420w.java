package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0420w extends Y1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f12562s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Object f12563t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0420w(AbstractC0335c abstractC0335c, int i10, Object obj, int i11) {
        super(abstractC0335c, i10);
        this.f12562s = i11;
        this.f12563t = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        switch (this.f12562s) {
            case 0:
                return new C0412u(this, interfaceC0363h2, 1);
            case 1:
                return new X(this, interfaceC0363h2, 4);
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0356g0(this, interfaceC0363h2, 2);
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return new T1(this, interfaceC0363h2, 0);
            default:
                return new T1(this, interfaceC0363h2, 1);
        }
    }
}
