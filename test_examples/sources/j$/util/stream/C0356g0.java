package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.function.C0286j0;
import j$.util.function.C0292m0;
import j$.util.function.C0298p0;
import j$.util.function.InterfaceC0278f0;
import j$.util.function.InterfaceC0284i0;
import j$.util.function.InterfaceC0290l0;
import j$.util.function.InterfaceC0296o0;
import j$.util.function.InterfaceC0301r0;

/* renamed from: j$.util.stream.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0356g0 extends AbstractC0338c2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12473b;
    final /* synthetic */ AbstractC0335c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0356g0(AbstractC0335c abstractC0335c, InterfaceC0363h2 interfaceC0363h2, int i10) {
        super(interfaceC0363h2);
        this.f12473b = i10;
        this.c = abstractC0335c;
    }

    @Override // j$.util.stream.InterfaceC0358g2, j$.util.stream.InterfaceC0363h2
    public final void accept(long j2) {
        int i10 = this.f12473b;
        AbstractC0335c abstractC0335c = this.c;
        InterfaceC0363h2 interfaceC0363h2 = this.f12449a;
        switch (i10) {
            case 0:
                interfaceC0363h2.accept(j2);
                return;
            case 1:
                interfaceC0363h2.accept(((j$.util.function.v0) ((C0428y) abstractC0335c).f12580t).applyAsLong(j2));
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                interfaceC0363h2.accept(((InterfaceC0284i0) ((C0420w) abstractC0335c).f12563t).apply(j2));
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                interfaceC0363h2.accept(((C0298p0) ((InterfaceC0301r0) ((C0424x) abstractC0335c).f12576t)).a(j2));
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                interfaceC0363h2.accept(((C0292m0) ((InterfaceC0296o0) ((C0416v) abstractC0335c).f12556t)).a(j2));
                return;
            case 5:
                InterfaceC0386n0 interfaceC0386n0 = (InterfaceC0386n0) ((InterfaceC0284i0) ((C0428y) abstractC0335c).f12580t).apply(j2);
                if (interfaceC0386n0 != null) {
                    try {
                        interfaceC0386n0.sequential().G(new C0346e0(1, this));
                    } catch (Throwable th) {
                        try {
                            interfaceC0386n0.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC0386n0 != null) {
                    interfaceC0386n0.close();
                    return;
                }
                return;
            case 6:
                if (((C0286j0) ((InterfaceC0290l0) ((C0428y) abstractC0335c).f12580t)).e(j2)) {
                    interfaceC0363h2.accept(j2);
                    return;
                }
                return;
            default:
                ((InterfaceC0278f0) ((C0428y) abstractC0335c).f12580t).accept(j2);
                interfaceC0363h2.accept(j2);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        int i10 = this.f12473b;
        InterfaceC0363h2 interfaceC0363h2 = this.f12449a;
        switch (i10) {
            case 5:
                interfaceC0363h2.g(-1L);
                return;
            case 6:
                interfaceC0363h2.g(-1L);
                return;
            default:
                interfaceC0363h2.g(j2);
                return;
        }
    }
}
