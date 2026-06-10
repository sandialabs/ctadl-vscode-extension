package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.function.Function;
import j$.util.function.InterfaceC0278f0;
import j$.util.function.InterfaceC0293n;
import java.util.HashSet;
import java.util.Set;

/* renamed from: j$.util.stream.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0397q extends AbstractC0343d2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12518b = 0;
    Object c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AbstractC0335c f12519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397q(r rVar, InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
        this.f12519d = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397q(C0416v c0416v, InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
        this.f12519d = c0416v;
        this.c = new C0408t(0, interfaceC0363h2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397q(C0424x c0424x, InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
        this.f12519d = c0424x;
        this.c = new W(0, interfaceC0363h2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397q(C0428y c0428y, InterfaceC0363h2 interfaceC0363h2) {
        super(interfaceC0363h2);
        this.f12519d = c0428y;
        this.c = new C0346e0(0, interfaceC0363h2);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f12518b;
        AbstractC0335c abstractC0335c = this.f12519d;
        switch (i10) {
            case 0:
                if (((Set) this.c).contains(obj)) {
                    return;
                }
                ((Set) this.c).add(obj);
                this.f12453a.accept(obj);
                return;
            case 1:
                InterfaceC0386n0 interfaceC0386n0 = (InterfaceC0386n0) ((Function) ((C0428y) abstractC0335c).f12580t).apply(obj);
                if (interfaceC0386n0 != null) {
                    try {
                        interfaceC0386n0.sequential().G((InterfaceC0278f0) this.c);
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
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                IntStream intStream = (IntStream) ((Function) ((C0424x) abstractC0335c).f12576t).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().a0((j$.util.function.K) this.c);
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                G g10 = (G) ((Function) ((C0416v) abstractC0335c).f12556t).apply(obj);
                if (g10 != null) {
                    try {
                        g10.sequential().J((InterfaceC0293n) this.c);
                    } catch (Throwable th5) {
                        try {
                            g10.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (g10 != null) {
                    g10.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0343d2, j$.util.stream.InterfaceC0363h2
    public final void end() {
        switch (this.f12518b) {
            case 0:
                this.c = null;
                this.f12453a.end();
                return;
            default:
                super.end();
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        int i10 = this.f12518b;
        InterfaceC0363h2 interfaceC0363h2 = this.f12453a;
        switch (i10) {
            case 0:
                this.c = new HashSet();
                interfaceC0363h2.g(-1L);
                return;
            case 1:
                interfaceC0363h2.g(-1L);
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                interfaceC0363h2.g(-1L);
                return;
            default:
                interfaceC0363h2.g(-1L);
                return;
        }
    }
}
