package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.z0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import n7.i;
import u7.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg0/c;", "<anonymous parameter 0>", "Lg0/z0;", "slots", "Lg0/t0;", "<anonymous parameter 2>", "Lm7/n;", "invoke", "(Lg0/c;Lg0/z0;Lg0/t0;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ComposerImpl$start$2 extends Lambda implements q<g0.c<?>, z0, t0, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f2730j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$start$2(int i10) {
        super(3);
        this.f2730j = i10;
    }

    @Override // u7.q
    public final n O(g0.c<?> cVar, z0 z0Var, t0 t0Var) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        z0 z0Var2 = z0Var;
        androidx.activity.e.p(cVar, "<anonymous parameter 0>", z0Var2, "slots", t0Var, "<anonymous parameter 2>");
        if (z0Var2.f11130m == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i12 = this.f2730j;
            if (i12 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i12 != 0) {
                    int i13 = z0Var2.f11134r;
                    int i14 = z0Var2.f11135s;
                    int i15 = z0Var2.f11124g;
                    int i16 = i13;
                    while (i12 > 0) {
                        i16 += a1.c.A(z0Var2.f11120b, z0Var2.n(i16));
                        if (i16 <= i15) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            ComposerKt.c("Parameter offset is out of bounds".toString());
                            throw null;
                        }
                        i12--;
                    }
                    int A = a1.c.A(z0Var2.f11120b, z0Var2.n(i16));
                    int i17 = z0Var2.f11125h;
                    int g10 = z0Var2.g(z0Var2.f11120b, z0Var2.n(i16));
                    int i18 = i16 + A;
                    int g11 = z0Var2.g(z0Var2.f11120b, z0Var2.n(i18));
                    int i19 = g11 - g10;
                    z0Var2.r(i19, Math.max(z0Var2.f11134r - 1, 0));
                    z0Var2.q(A);
                    int[] iArr = z0Var2.f11120b;
                    int n = z0Var2.n(i18) * 5;
                    i.a2(z0Var2.n(i13) * 5, n, (A * 5) + n, iArr, iArr);
                    if (i19 > 0) {
                        Object[] objArr = z0Var2.c;
                        i.b2(objArr, objArr, i17, z0Var2.h(g10 + i19), z0Var2.h(g11 + i19));
                    }
                    int i20 = g10 + i19;
                    int i21 = i20 - i17;
                    int i22 = z0Var2.f11127j;
                    int i23 = z0Var2.f11128k;
                    int length = z0Var2.c.length;
                    int i24 = z0Var2.f11129l;
                    int i25 = i13 + A;
                    int i26 = i13;
                    while (i26 < i25) {
                        int n10 = z0Var2.n(i26);
                        int i27 = i22;
                        int g12 = z0Var2.g(iArr, n10) - i21;
                        if (i24 < n10) {
                            i10 = i21;
                            i11 = 0;
                        } else {
                            i10 = i21;
                            i11 = i27;
                        }
                        if (g12 > i11) {
                            g12 = -(((length - i23) - g12) + 1);
                        }
                        int i28 = z0Var2.f11127j;
                        int i29 = i23;
                        int i30 = z0Var2.f11128k;
                        int i31 = length;
                        int length2 = z0Var2.c.length;
                        if (g12 > i28) {
                            g12 = -(((length2 - i30) - g12) + 1);
                        }
                        iArr[(n10 * 5) + 4] = g12;
                        i26++;
                        i22 = i27;
                        i21 = i10;
                        length = i31;
                        i23 = i29;
                    }
                    int i32 = A + i18;
                    int m10 = z0Var2.m();
                    int E = a1.c.E(z0Var2.f11121d, i18, m10);
                    ArrayList arrayList = new ArrayList();
                    if (E >= 0) {
                        while (E < z0Var2.f11121d.size()) {
                            g0.b bVar = z0Var2.f11121d.get(E);
                            v7.g.e(bVar, "anchors[index]");
                            g0.b bVar2 = bVar;
                            int c = z0Var2.c(bVar2);
                            if (c < i18 || c >= i32) {
                                break;
                            }
                            arrayList.add(bVar2);
                            z0Var2.f11121d.remove(E);
                        }
                    }
                    int i33 = i13 - i18;
                    int size = arrayList.size();
                    for (int i34 = 0; i34 < size; i34++) {
                        g0.b bVar3 = (g0.b) arrayList.get(i34);
                        int c10 = z0Var2.c(bVar3) + i33;
                        if (c10 >= z0Var2.f11122e) {
                            bVar3.f11033a = -(m10 - c10);
                        } else {
                            bVar3.f11033a = c10;
                        }
                        z0Var2.f11121d.add(a1.c.E(z0Var2.f11121d, c10, m10), bVar3);
                    }
                    if (!z0Var2.D(i18, A)) {
                        z0Var2.l(i14, z0Var2.f11124g, i13);
                        if (i19 > 0) {
                            z0Var2.E(i20, i19, i18 - 1);
                        }
                    } else {
                        ComposerKt.c("Unexpectedly removed anchors".toString());
                        throw null;
                    }
                }
                return n.f16010a;
            }
            ComposerKt.c("Parameter offset is out of bounds".toString());
            throw null;
        }
        ComposerKt.c("Cannot move a group while inserting".toString());
        throw null;
    }
}
