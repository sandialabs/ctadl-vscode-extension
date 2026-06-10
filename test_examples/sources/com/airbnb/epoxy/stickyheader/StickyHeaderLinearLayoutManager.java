package com.airbnb.epoxy.stickyheader;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.e;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.d;
import kotlin.Metadata;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "a", "epoxy-adapter_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {
    public d F;
    public int G;
    public int H;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0057a();

        /* renamed from: i  reason: collision with root package name */
        public final Parcelable f6694i;

        /* renamed from: j  reason: collision with root package name */
        public final int f6695j;

        /* renamed from: k  reason: collision with root package name */
        public final int f6696k;

        /* renamed from: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0057a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                g.f(parcel, "parcel");
                return new a(parcel.readParcelable(a.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Parcelable parcelable, int i10, int i11) {
            g.f(parcelable, "superState");
            this.f6694i = parcelable;
            this.f6695j = i10;
            this.f6696k = i11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return g.a(this.f6694i, aVar.f6694i) && this.f6695j == aVar.f6695j && this.f6696k == aVar.f6696k;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.f6694i.hashCode() * 31) + this.f6695j) * 31) + this.f6696k;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState(superState=");
            sb.append(this.f6694i);
            sb.append(", scrollPosition=");
            sb.append(this.f6695j);
            sb.append(", scrollOffset=");
            return e.h(sb, this.f6696k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            g.f(parcel, "out");
            parcel.writeParcelable(this.f6694i, i10);
            parcel.writeInt(this.f6695j);
            parcel.writeInt(this.f6696k);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void W(RecyclerView.Adapter adapter) {
        d dVar = this.F;
        if (dVar != null) {
            dVar.r(null);
        }
        if (!(adapter instanceof d)) {
            this.F = null;
            throw null;
        }
        d dVar2 = (d) adapter;
        this.F = dVar2;
        if (dVar2 != null) {
            dVar2.p(null);
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void X(RecyclerView recyclerView) {
        g.f(recyclerView, "recyclerView");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        d dVar = this.F;
        if (dVar != null) {
            dVar.r(null);
        }
        if (adapter instanceof d) {
            d dVar2 = (d) adapter;
            this.F = dVar2;
            if (dVar2 != null) {
                dVar2.p(null);
            }
            throw null;
        }
        this.F = null;
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final View Z(View view, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        g.f(view, "focused");
        g.f(sVar, "recycler");
        g.f(xVar, "state");
        return (View) new StickyHeaderLinearLayoutManager$onFocusSearchFailed$1(this, view, i10, sVar, xVar).k0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i10) {
        return (PointF) u1(new StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1(this, i10));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void j1(int i10, int i11) {
        this.G = -1;
        this.H = Integer.MIN_VALUE;
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void k0(RecyclerView.s sVar, RecyclerView.x xVar) {
        g.f(sVar, "recycler");
        g.f(xVar, "state");
        new StickyHeaderLinearLayoutManager$onLayoutChildren$1(this, sVar, xVar).k0();
        if (xVar.f5747g) {
            return;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void m0(Parcelable parcelable) {
        g.f(parcelable, "state");
        a aVar = (a) parcelable;
        this.G = aVar.f6695j;
        this.H = aVar.f6696k;
        super.m0(aVar.f6694i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int n(RecyclerView.x xVar) {
        g.f(xVar, "state");
        return ((Number) new StickyHeaderLinearLayoutManager$computeHorizontalScrollExtent$1(this, xVar).k0()).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final Parcelable n0() {
        return new a(super.n0(), this.G, this.H);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int o(RecyclerView.x xVar) {
        g.f(xVar, "state");
        return ((Number) new StickyHeaderLinearLayoutManager$computeHorizontalScrollOffset$1(this, xVar).k0()).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int p(RecyclerView.x xVar) {
        g.f(xVar, "state");
        return ((Number) new StickyHeaderLinearLayoutManager$computeHorizontalScrollRange$1(this, xVar).k0()).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int q(RecyclerView.x xVar) {
        g.f(xVar, "state");
        return ((Number) new StickyHeaderLinearLayoutManager$computeVerticalScrollExtent$1(this, xVar).k0()).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int r(RecyclerView.x xVar) {
        g.f(xVar, "state");
        return ((Number) new StickyHeaderLinearLayoutManager$computeVerticalScrollOffset$1(this, xVar).k0()).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int s(RecyclerView.x xVar) {
        g.f(xVar, "state");
        return ((Number) new StickyHeaderLinearLayoutManager$computeVerticalScrollRange$1(this, xVar).k0()).intValue();
    }

    public final <T> T u1(u7.a<? extends T> aVar) {
        return aVar.k0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int v0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        g.f(sVar, "recycler");
        g.f(xVar, "state");
        int intValue = ((Number) new StickyHeaderLinearLayoutManager$scrollHorizontallyBy$scrolled$1(this, i10, sVar, xVar).k0()).intValue();
        if (intValue == 0) {
            return intValue;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void w0(int i10) {
        j1(i10, Integer.MIN_VALUE);
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final int x0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        g.f(sVar, "recycler");
        g.f(xVar, "state");
        int intValue = ((Number) new StickyHeaderLinearLayoutManager$scrollVerticallyBy$scrolled$1(this, i10, sVar, xVar).k0()).intValue();
        if (intValue == 0) {
            return intValue;
        }
        throw null;
    }
}
