package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e0 extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f5841a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5842b = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.q {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5843a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(int i10, RecyclerView recyclerView) {
            if (i10 == 0 && this.f5843a) {
                this.f5843a = false;
                e0.this.d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f5843a = true;
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5841a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.f5842b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f5638s0;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            this.f5841a.setOnFlingListener(null);
        }
        this.f5841a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.f5841a.h(aVar);
                this.f5841a.setOnFlingListener(this);
                new Scroller(this.f5841a.getContext(), new DecelerateInterpolator());
                d();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.l lVar, View view);

    @SuppressLint({"UnknownNullness"})
    public abstract View c(RecyclerView.l lVar);

    public final void d() {
        RecyclerView.l layoutManager;
        View c;
        RecyclerView recyclerView = this.f5841a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c = c(layoutManager)) == null) {
            return;
        }
        int[] b5 = b(layoutManager, c);
        int i10 = b5[0];
        if (i10 != 0 || b5[1] != 0) {
            this.f5841a.i0(i10, b5[1], false);
        }
    }
}
