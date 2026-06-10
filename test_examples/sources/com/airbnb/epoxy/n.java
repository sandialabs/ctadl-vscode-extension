package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.airbnb.epoxy.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends d implements c.InterfaceC0056c {
    public static final a n = new a();

    /* renamed from: i  reason: collision with root package name */
    public final m0 f6664i;

    /* renamed from: j  reason: collision with root package name */
    public final c f6665j;

    /* renamed from: k  reason: collision with root package name */
    public final m f6666k;

    /* renamed from: l  reason: collision with root package name */
    public int f6667l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f6668m;

    /* loaded from: classes.dex */
    public class a extends k.e<r<?>> {
    }

    public n(m mVar, Handler handler) {
        m0 m0Var = new m0();
        this.f6664i = m0Var;
        this.f6668m = new ArrayList();
        this.f6666k = mVar;
        this.f6665j = new c(handler, this);
        p(m0Var);
    }

    @Override // com.airbnb.epoxy.d, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int d() {
        return this.f6667l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void g(RecyclerView recyclerView) {
        this.f6666k.onAttachedToRecyclerViewInternal(recyclerView);
    }

    @Override // com.airbnb.epoxy.d, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void k(RecyclerView recyclerView) {
        super.k(recyclerView);
        this.f6666k.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    @Override // com.airbnb.epoxy.d
    public final List<? extends r<?>> s() {
        return this.f6665j.f6626f;
    }

    @Override // com.airbnb.epoxy.d
    public final void v(RuntimeException runtimeException) {
        this.f6666k.onExceptionSwallowed(runtimeException);
    }

    @Override // com.airbnb.epoxy.d
    public final void w(b0 b0Var, r<?> rVar, int i10, r<?> rVar2) {
        this.f6666k.onModelBound(b0Var, rVar, i10, rVar2);
    }

    @Override // com.airbnb.epoxy.d
    public final void x(b0 b0Var, r<?> rVar) {
        this.f6666k.onModelUnbound(b0Var, rVar);
    }

    @Override // com.airbnb.epoxy.d, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: y */
    public final void m(b0 b0Var) {
        super.m(b0Var);
        b0Var.s();
        this.f6666k.onViewAttachedToWindow(b0Var, b0Var.f6617u);
    }

    @Override // com.airbnb.epoxy.d, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: z */
    public final void n(b0 b0Var) {
        super.n(b0Var);
        b0Var.s();
        this.f6666k.onViewDetachedFromWindow(b0Var, b0Var.f6617u);
    }
}
