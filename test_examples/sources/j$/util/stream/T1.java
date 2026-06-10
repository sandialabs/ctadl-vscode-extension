package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.function.Consumer;
import j$.util.function.Predicate;

/* loaded from: classes2.dex */
final class T1 extends AbstractC0343d2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12383b;
    final /* synthetic */ AbstractC0335c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T1(AbstractC0335c abstractC0335c, InterfaceC0363h2 interfaceC0363h2, int i10) {
        super(interfaceC0363h2);
        this.f12383b = i10;
        this.c = abstractC0335c;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f12383b;
        InterfaceC0363h2 interfaceC0363h2 = this.f12453a;
        AbstractC0335c abstractC0335c = this.c;
        switch (i10) {
            case 0:
                ((Consumer) ((C0420w) abstractC0335c).f12563t).accept(obj);
                interfaceC0363h2.accept(obj);
                return;
            case 1:
                if (((Predicate) ((C0420w) abstractC0335c).f12563t).test(obj)) {
                    interfaceC0363h2.accept(obj);
                    return;
                }
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                interfaceC0363h2.accept(((V1) abstractC0335c).f12397t.apply(obj));
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                interfaceC0363h2.accept(((j$.util.function.Q0) ((C0424x) abstractC0335c).f12576t).applyAsInt(obj));
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                interfaceC0363h2.accept(((j$.util.function.T0) ((C0428y) abstractC0335c).f12580t).applyAsLong(obj));
                return;
            case 5:
                interfaceC0363h2.accept(((j$.util.function.N0) ((C0416v) abstractC0335c).f12556t).applyAsDouble(obj));
                return;
            default:
                Stream stream = (Stream) ((V1) abstractC0335c).f12397t.apply(obj);
                if (stream != null) {
                    try {
                        ((Stream) stream.sequential()).forEach(interfaceC0363h2);
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        int i10 = this.f12383b;
        InterfaceC0363h2 interfaceC0363h2 = this.f12453a;
        switch (i10) {
            case 1:
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
