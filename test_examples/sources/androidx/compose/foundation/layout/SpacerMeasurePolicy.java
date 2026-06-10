package androidx.compose.foundation.layout;

import j1.p;
import j1.q;
import j1.r;
import j1.t;
import java.util.List;
import kotlin.collections.d;
import v7.g;

/* loaded from: classes.dex */
public final class SpacerMeasurePolicy implements q {

    /* renamed from: a  reason: collision with root package name */
    public static final SpacerMeasurePolicy f1978a = new SpacerMeasurePolicy();

    @Override // j1.q
    public final r a(t tVar, List<? extends p> list, long j2) {
        boolean z10;
        int i10;
        r m02;
        g.f(tVar, "$this$measure");
        boolean z11 = true;
        int i11 = 0;
        if (b2.a.f(j2) == b2.a.h(j2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = b2.a.f(j2);
        } else {
            i10 = 0;
        }
        if (b2.a.e(j2) != b2.a.g(j2)) {
            z11 = false;
        }
        if (z11) {
            i11 = b2.a.e(j2);
        }
        m02 = tVar.m0(i10, i11, d.K1(), SpacerMeasurePolicy$measure$1$1.f1979j);
        return m02;
    }
}
