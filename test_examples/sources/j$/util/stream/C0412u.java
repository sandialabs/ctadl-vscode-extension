package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.function.C0306u;
import j$.util.function.InterfaceC0293n;
import j$.util.function.InterfaceC0299q;
import j$.util.function.InterfaceC0304t;
import j$.util.function.InterfaceC0309w;
import j$.util.function.InterfaceC0312z;

/* renamed from: j$.util.stream.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0412u extends AbstractC0328a2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12549b;
    final /* synthetic */ AbstractC0335c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0412u(AbstractC0335c abstractC0335c, InterfaceC0363h2 interfaceC0363h2, int i10) {
        super(interfaceC0363h2);
        this.f12549b = i10;
        this.c = abstractC0335c;
    }

    @Override // j$.util.stream.InterfaceC0348e2, j$.util.function.InterfaceC0293n
    public final void accept(double d5) {
        int i10 = this.f12549b;
        InterfaceC0363h2 interfaceC0363h2 = this.f12433a;
        AbstractC0335c abstractC0335c = this.c;
        switch (i10) {
            case 0:
                interfaceC0363h2.accept(((j$.util.function.A) ((j$.util.function.C) ((C0416v) abstractC0335c).f12556t)).b(d5));
                return;
            case 1:
                interfaceC0363h2.accept(((InterfaceC0299q) ((C0420w) abstractC0335c).f12563t).apply(d5));
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                interfaceC0363h2.accept(((C0306u) ((InterfaceC0309w) ((C0424x) abstractC0335c).f12576t)).a(d5));
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                interfaceC0363h2.accept(((InterfaceC0312z) ((C0428y) abstractC0335c).f12580t).applyAsLong(d5));
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                G g10 = (G) ((InterfaceC0299q) ((C0416v) abstractC0335c).f12556t).apply(d5);
                if (g10 != null) {
                    try {
                        g10.sequential().J(new C0408t(1, this));
                    } catch (Throwable th) {
                        try {
                            g10.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (g10 != null) {
                    g10.close();
                    return;
                }
                return;
            case 5:
                if (((j$.util.function.r) ((InterfaceC0304t) ((C0416v) abstractC0335c).f12556t)).e(d5)) {
                    interfaceC0363h2.accept(d5);
                    return;
                }
                return;
            default:
                ((InterfaceC0293n) ((C0416v) abstractC0335c).f12556t).accept(d5);
                interfaceC0363h2.accept(d5);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0363h2
    public final void g(long j2) {
        int i10 = this.f12549b;
        InterfaceC0363h2 interfaceC0363h2 = this.f12433a;
        switch (i10) {
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                interfaceC0363h2.g(-1L);
                return;
            case 5:
                interfaceC0363h2.g(-1L);
                return;
            default:
                interfaceC0363h2.g(j2);
                return;
        }
    }
}
