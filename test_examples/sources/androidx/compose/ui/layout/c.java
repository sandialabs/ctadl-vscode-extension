package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import g0.g;
import j1.f0;
import j1.g0;
import j1.r;
import m7.n;
import u7.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public b f3364b;

    /* renamed from: a  reason: collision with root package name */
    public final g0 f3363a = a1.b.H0;
    public final p<LayoutNode, c, n> c = new SubcomposeLayoutState$setRoot$1(this);

    /* renamed from: d  reason: collision with root package name */
    public final p<LayoutNode, g, n> f3365d = new SubcomposeLayoutState$setCompositionContext$1(this);

    /* renamed from: e  reason: collision with root package name */
    public final p<LayoutNode, p<? super f0, ? super b2.a, ? extends r>, n> f3366e = new SubcomposeLayoutState$setMeasurePolicy$1(this);

    public final b a() {
        b bVar = this.f3364b;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }
}
