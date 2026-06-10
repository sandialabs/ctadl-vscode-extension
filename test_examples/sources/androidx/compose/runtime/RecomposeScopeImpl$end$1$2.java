package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import n7.i;
import u7.l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg0/f;", "composition", "Lm7/n;", "invoke", "(Lg0/f;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class RecomposeScopeImpl$end$1$2 extends Lambda implements l<g0.f, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ r0 f2770j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f2771k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ h0.a f2772l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposeScopeImpl$end$1$2(r0 r0Var, int i10, h0.a aVar) {
        super(1);
        this.f2770j = r0Var;
        this.f2771k = i10;
        this.f2772l = aVar;
    }

    @Override // u7.l
    public final n U(g0.f fVar) {
        boolean z10;
        g0.n<?> nVar;
        h0.b<g0.n<?>, Object> bVar;
        g0.f fVar2 = fVar;
        v7.g.f(fVar2, "composition");
        r0 r0Var = this.f2770j;
        int i10 = r0Var.f11074e;
        int i11 = this.f2771k;
        if (i10 == i11) {
            h0.a aVar = r0Var.f11075f;
            h0.a aVar2 = this.f2772l;
            if (v7.g.a(aVar2, aVar) && (fVar2 instanceof b)) {
                int i12 = aVar2.f11321a;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    Object obj = aVar2.f11322b[i14];
                    v7.g.d(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i15 = aVar2.c[i14];
                    if (i15 != i11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        b bVar2 = (b) fVar2;
                        h0.d<r0> dVar = bVar2.f2854o;
                        dVar.e(obj, r0Var);
                        if (obj instanceof g0.n) {
                            nVar = (g0.n) obj;
                        } else {
                            nVar = null;
                        }
                        if (nVar != null) {
                            if (!dVar.c(nVar)) {
                                bVar2.f2856q.f(nVar);
                            }
                            h0.b<g0.n<?>, Object> bVar3 = r0Var.f11076g;
                            if (bVar3 != null) {
                                int a10 = bVar3.a(nVar);
                                if (a10 >= 0) {
                                    int i16 = bVar3.c;
                                    Object[] objArr = bVar3.f11323a;
                                    Object[] objArr2 = bVar3.f11324b;
                                    int i17 = a10 + 1;
                                    i.b2(objArr, objArr, a10, i17, i16);
                                    i.b2(objArr2, objArr2, a10, i17, i16);
                                    int i18 = i16 - 1;
                                    bVar = null;
                                    objArr[i18] = null;
                                    objArr2[i18] = null;
                                    bVar3.c = i18;
                                } else {
                                    bVar = null;
                                }
                                if (bVar3.c == 0) {
                                    r0Var.f11076g = bVar;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        if (i13 != i14) {
                            aVar2.f11322b[i13] = obj;
                            aVar2.c[i13] = i15;
                        }
                        i13++;
                    }
                }
                int i19 = aVar2.f11321a;
                for (int i20 = i13; i20 < i19; i20++) {
                    aVar2.f11322b[i20] = null;
                }
                aVar2.f11321a = i13;
                if (i13 == 0) {
                    r0Var.f11075f = null;
                }
            }
        }
        return n.f16010a;
    }
}
