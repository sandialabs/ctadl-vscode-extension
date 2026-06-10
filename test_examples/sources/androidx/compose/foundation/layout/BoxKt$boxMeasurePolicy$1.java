package androidx.compose.foundation.layout;

import b2.a;
import j1.b0;
import j1.p;
import j1.q;
import j1.r;
import j1.t;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Ref$IntRef;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class BoxKt$boxMeasurePolicy$1 implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f1892a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q0.a f1893b;

    public BoxKt$boxMeasurePolicy$1(q0.b bVar, boolean z10) {
        this.f1892a = z10;
        this.f1893b = bVar;
    }

    @Override // j1.q
    public final r a(t tVar, List<? extends p> list, long j2) {
        long a10;
        int i10;
        int i11;
        l boxKt$boxMeasurePolicy$1$measure$5;
        int i12;
        int i13;
        v.b bVar;
        boolean z10;
        v.b bVar2;
        boolean z11;
        v.b bVar3;
        boolean z12;
        int i14;
        int i15;
        b0 b5;
        r m02;
        g.f(tVar, "$this$MeasurePolicy");
        if (list.isEmpty()) {
            i10 = b2.a.h(j2);
            i11 = b2.a.g(j2);
            boxKt$boxMeasurePolicy$1$measure$5 = BoxKt$boxMeasurePolicy$1$measure$1.f1894j;
        } else {
            if (this.f1892a) {
                a10 = j2;
            } else {
                a10 = b2.a.a(j2, 0, 0, 0, 0, 10);
            }
            boolean z13 = true;
            if (list.size() == 1) {
                p pVar = list.get(0);
                Object n = pVar.n();
                if (n instanceof v.b) {
                    bVar3 = (v.b) n;
                } else {
                    bVar3 = null;
                }
                if (bVar3 != null) {
                    z12 = bVar3.f18046k;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    b0 b10 = pVar.b(a10);
                    i14 = Math.max(b2.a.h(j2), b10.f12640i);
                    i15 = Math.max(b2.a.g(j2), b10.f12641j);
                    b5 = b10;
                } else {
                    int h10 = b2.a.h(j2);
                    int g10 = b2.a.g(j2);
                    int h11 = b2.a.h(j2);
                    int g11 = b2.a.g(j2);
                    if (h11 < 0 || g11 < 0) {
                        z13 = false;
                    }
                    if (z13) {
                        i14 = h10;
                        i15 = g10;
                        b5 = pVar.b(a.C0052a.b(h11, h11, g11, g11));
                    } else {
                        throw new IllegalArgumentException(("width(" + h11 + ") and height(" + g11 + ") must be >= 0").toString());
                    }
                }
                BoxKt$boxMeasurePolicy$1$measure$2 boxKt$boxMeasurePolicy$1$measure$2 = new BoxKt$boxMeasurePolicy$1$measure$2(b5, pVar, tVar, i14, i15, this.f1893b);
                i10 = i14;
                i11 = i15;
                boxKt$boxMeasurePolicy$1$measure$5 = boxKt$boxMeasurePolicy$1$measure$2;
            } else {
                b0[] b0VarArr = new b0[list.size()];
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.f13058i = b2.a.h(j2);
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                ref$IntRef2.f13058i = b2.a.g(j2);
                int size = list.size();
                boolean z14 = false;
                for (int i16 = 0; i16 < size; i16++) {
                    p pVar2 = list.get(i16);
                    Object n10 = pVar2.n();
                    if (n10 instanceof v.b) {
                        bVar2 = (v.b) n10;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 != null) {
                        z11 = bVar2.f18046k;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        b0 b11 = pVar2.b(a10);
                        b0VarArr[i16] = b11;
                        ref$IntRef.f13058i = Math.max(ref$IntRef.f13058i, b11.f12640i);
                        ref$IntRef2.f13058i = Math.max(ref$IntRef2.f13058i, b11.f12641j);
                    } else {
                        z14 = true;
                    }
                }
                if (z14) {
                    int i17 = ref$IntRef.f13058i;
                    if (i17 != Integer.MAX_VALUE) {
                        i12 = i17;
                    } else {
                        i12 = 0;
                    }
                    int i18 = ref$IntRef2.f13058i;
                    if (i18 != Integer.MAX_VALUE) {
                        i13 = i18;
                    } else {
                        i13 = 0;
                    }
                    long b12 = v8.b.b(i12, i17, i13, i18);
                    int size2 = list.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        p pVar3 = list.get(i19);
                        Object n11 = pVar3.n();
                        if (n11 instanceof v.b) {
                            bVar = (v.b) n11;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            z10 = bVar.f18046k;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            b0VarArr[i19] = pVar3.b(b12);
                        }
                    }
                }
                int i20 = ref$IntRef.f13058i;
                i10 = i20;
                i11 = ref$IntRef2.f13058i;
                boxKt$boxMeasurePolicy$1$measure$5 = new BoxKt$boxMeasurePolicy$1$measure$5(b0VarArr, list, tVar, ref$IntRef, ref$IntRef2, this.f1893b);
            }
        }
        m02 = tVar.m0(i10, i11, d.K1(), boxKt$boxMeasurePolicy$1$measure$5);
        return m02;
    }
}
