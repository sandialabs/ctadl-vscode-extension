package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import m7.n;
import u7.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg0/c;", "applier", "Lg0/z0;", "slots", "Lg0/t0;", "<anonymous parameter 2>", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$insertMovableContentGuarded$1$1$1 extends Lambda implements q<g0.c<?>, z0, t0, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f2692j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ g0.b f2693k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$1(Ref$IntRef ref$IntRef, g0.b bVar) {
        super(3);
        this.f2692j = ref$IntRef;
        this.f2693k = bVar;
    }

    @Override // u7.q
    public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
        boolean z10;
        int i10;
        boolean z11;
        int F;
        g0.c<?> cVar2 = cVar;
        z0 z0Var2 = z0Var;
        androidx.activity.e.p(cVar2, "applier", z0Var2, "slots", t0Var, "<anonymous parameter 2>");
        int c = z0Var2.c(this.f2693k);
        boolean z12 = false;
        if (z0Var2.f11134r < c) {
            z10 = true;
        } else {
            z10 = false;
        }
        ComposerKt.f(z10);
        ComposerImpl.Z(z0Var2, cVar2, c);
        int i11 = z0Var2.f11134r;
        int i12 = z0Var2.f11135s;
        while (i12 >= 0 && !z0Var2.s(i12)) {
            i12 = z0Var2.z(i12);
        }
        int i13 = i12 + 1;
        int i14 = 0;
        while (i13 < i11) {
            if (z0Var2.p(i11, i13)) {
                if (z0Var2.s(i13)) {
                    i14 = 0;
                }
                i13++;
            } else {
                if (z0Var2.s(i13)) {
                    F = 1;
                } else {
                    F = a1.c.F(z0Var2.f11120b, z0Var2.n(i13));
                }
                i14 += F;
                i13 += z0Var2.o(i13);
            }
        }
        while (true) {
            i10 = z0Var2.f11134r;
            if (i10 >= c) {
                break;
            } else if (z0Var2.p(c, i10)) {
                int i15 = z0Var2.f11134r;
                if (i15 < z0Var2.f11124g && a1.c.D(z0Var2.f11120b, z0Var2.n(i15))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    cVar2.c(z0Var2.y(z0Var2.f11134r));
                    i14 = 0;
                }
                z0Var2.K();
            } else {
                i14 += z0Var2.G();
            }
        }
        if (i10 == c) {
            z12 = true;
        }
        ComposerKt.f(z12);
        this.f2692j.f13058i = i14;
        return n.f16010a;
    }
}
