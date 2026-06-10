package com.airbnb.epoxy;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.r;
import com.noto.R;

/* loaded from: classes.dex */
public abstract class y<T extends r> extends a0 implements e {

    /* renamed from: d  reason: collision with root package name */
    public final m f6729d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<T> f6730e;

    /* renamed from: f  reason: collision with root package name */
    public b0 f6731f;

    /* renamed from: g  reason: collision with root package name */
    public b0 f6732g;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f6733i;

        public a(RecyclerView recyclerView) {
            this.f6733i = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.this.getClass();
            this.f6733i.setTag(R.id.epoxy_touch_helper_selection_status, null);
        }
    }

    public y(m mVar, Class<T> cls) {
        this.f6729d = mVar;
        this.f6730e = cls;
    }

    @Override // com.airbnb.epoxy.a0
    public final void p(RecyclerView recyclerView, b0 b0Var) {
        super.p(recyclerView, b0Var);
        b0Var.s();
        recyclerView.postDelayed(new a(recyclerView), 300L);
    }

    @Override // com.airbnb.epoxy.a0
    public void q(Canvas canvas, RecyclerView recyclerView, b0 b0Var, float f10, float f11, int i10, boolean z10) {
        float height;
        super.q(canvas, recyclerView, b0Var, f10, f11, i10, z10);
        try {
            b0Var.s();
            r<?> rVar = b0Var.f6617u;
            if (s(rVar)) {
                float abs = Math.abs(f10);
                float abs2 = Math.abs(f11);
                View view = b0Var.f5666a;
                if (abs > abs2) {
                    height = f10 / view.getWidth();
                } else {
                    height = f11 / view.getHeight();
                }
                Math.max(-1.0f, Math.min(1.0f, height));
                return;
            }
            throw new IllegalStateException("A model was selected that is not a valid target: " + rVar.getClass());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.airbnb.epoxy.a0
    public void r(b0 b0Var, int i10) {
        b0Var.s();
        r<?> rVar = b0Var.f6617u;
        b0Var.d();
        if (s(rVar)) {
            return;
        }
        throw new IllegalStateException("A model was swiped that is not a valid target: " + rVar.getClass());
    }

    public final boolean s(r<?> rVar) {
        return this.f6730e.isInstance(rVar);
    }

    public abstract void t(T t10, View view);

    public abstract void u(r rVar, View view);

    public abstract void v(r rVar);
}
