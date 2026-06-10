package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import j1.b0;
import j1.k;
import j1.t;
import s.r;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class ScrollingLayoutModifier implements k {

    /* renamed from: i  reason: collision with root package name */
    public final ScrollState f1588i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1589j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f1590k;

    /* renamed from: l  reason: collision with root package name */
    public final r f1591l;

    public ScrollingLayoutModifier(ScrollState scrollState, boolean z10, boolean z11, r rVar) {
        g.f(scrollState, "scrollerState");
        g.f(rVar, "overscrollEffect");
        this.f1588i = scrollState;
        this.f1589j = z10;
        this.f1590k = z11;
        this.f1591l = rVar;
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScrollingLayoutModifier) {
            ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) obj;
            return g.a(this.f1588i, scrollingLayoutModifier.f1588i) && this.f1589j == scrollingLayoutModifier.f1589j && this.f1590k == scrollingLayoutModifier.f1590k && g.a(this.f1591l, scrollingLayoutModifier.f1591l);
        }
        return false;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f1588i.hashCode() * 31;
        int i10 = 1;
        boolean z10 = this.f1589j;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z11 = this.f1590k;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return this.f1591l.hashCode() + ((i12 + i10) * 31);
    }

    @Override // j1.k
    public final j1.r n(t tVar, j1.p pVar, long j2) {
        Orientation orientation;
        boolean z10;
        int e10;
        int i10;
        j1.r m02;
        boolean z11;
        g.f(tVar, "$this$measure");
        Orientation orientation2 = Orientation.Vertical;
        boolean z12 = this.f1590k;
        if (z12) {
            orientation = orientation2;
        } else {
            orientation = Orientation.Horizontal;
        }
        boolean z13 = false;
        if (orientation == orientation2) {
            if (b2.a.e(j2) != Integer.MAX_VALUE) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        } else {
            if (b2.a.f(j2) != Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        }
        if (z12) {
            e10 = Integer.MAX_VALUE;
        } else {
            e10 = b2.a.e(j2);
        }
        if (z12) {
            i10 = b2.a.f(j2);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b0 b5 = pVar.b(b2.a.a(j2, 0, i10, 0, e10, 5));
        int i11 = b5.f12640i;
        int f10 = b2.a.f(j2);
        if (i11 > f10) {
            i11 = f10;
        }
        int i12 = b5.f12641j;
        int e11 = b2.a.e(j2);
        if (i12 > e11) {
            i12 = e11;
        }
        int i13 = b5.f12641j - i12;
        int i14 = b5.f12640i - i11;
        if (!z12) {
            i13 = i14;
        }
        if (i13 != 0) {
            z13 = true;
        }
        this.f1591l.setEnabled(z13);
        m02 = tVar.m0(i11, i12, kotlin.collections.d.K1(), new ScrollingLayoutModifier$measure$1(this, i13, b5));
        return m02;
    }

    public final String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.f1588i + ", isReversed=" + this.f1589j + ", isVertical=" + this.f1590k + ", overscrollEffect=" + this.f1591l + ')';
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
