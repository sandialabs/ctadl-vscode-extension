package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.Adapter f5801a;

    public b(com.airbnb.epoxy.n nVar) {
        this.f5801a = nVar;
    }

    @Override // androidx.recyclerview.widget.s
    public final void a(int i10, int i11) {
        this.f5801a.f5653a.f(i10, i11);
    }

    @Override // androidx.recyclerview.widget.s
    public final void b(int i10, int i11) {
        this.f5801a.f5653a.c(i10, i11);
    }

    @Override // androidx.recyclerview.widget.s
    public final void c(int i10, int i11) {
        this.f5801a.f5653a.e(i10, i11);
    }

    @Override // androidx.recyclerview.widget.s
    @SuppressLint({"UnknownNullness"})
    public final void d(int i10, int i11, Object obj) {
        this.f5801a.f5653a.d(i10, i11, obj);
    }
}
