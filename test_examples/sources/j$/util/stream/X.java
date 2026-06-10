package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class X extends AbstractC0333b2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12421b;
    final /* synthetic */ AbstractC0335c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC0335c abstractC0335c, InterfaceC0363h2 interfaceC0363h2, int i10) {
        super(interfaceC0363h2);
        this.f12421b = i10;
        this.c = abstractC0335c;
    }

    @Override // j$.util.stream.InterfaceC0353f2, j$.util.stream.InterfaceC0363h2
    public final void accept(int i10) {
        int i11 = this.f12421b;
        AbstractC0335c abstractC0335c = this.c;
        InterfaceC0363h2 interfaceC0363h2 = this.f12437a;
        switch (i11) {
            case 0:
                interfaceC0363h2.accept(i10);
                return;
            case 1:
                ((j$.util.function.K) ((C0424x) abstractC0335c).f12576t).accept(i10);
                interfaceC0363h2.accept(i10);
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                interfaceC0363h2.accept(i10);
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                interfaceC0363h2.accept(((j$.util.function.W) ((j$.util.function.Y) ((C0424x) abstractC0335c).f12576t)).b(i10));
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                interfaceC0363h2.accept(((IntFunction) ((C0420w) abstractC0335c).f12563t).apply(i10));
                return;
            case 5:
                interfaceC0363h2.accept(((j$.util.function.V) ((C0428y) abstractC0335c).f12580t).applyAsLong(i10));
                return;
            case 6:
                interfaceC0363h2.accept(((j$.util.function.P) ((j$.util.function.S) ((C0416v) abstractC0335c).f12556t)).a(i10));
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                IntStream intStream = (IntStream) ((IntFunction) ((C0424x) abstractC0335c).f12576t).apply(i10);
                if (intStream != null) {
                    try {
                        intStream.sequential().a0(new W(1, this));
                    } catch (Throwable th) {
                        try {
                            intStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                if (((j$.util.function.M) ((j$.util.function.O) ((C0424x) abstractC0335c).f12576t)).e(i10)) {
                    interfaceC0363h2.accept(i10);
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        int i10 = this.f12421b;
        InterfaceC0363h2 interfaceC0363h2 = this.f12437a;
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                interfaceC0363h2.g(-1L);
                return;
            case 8:
                interfaceC0363h2.g(-1L);
                return;
            default:
                interfaceC0363h2.g(j2);
                return;
        }
    }
}
