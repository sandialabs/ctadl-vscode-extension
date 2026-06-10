package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class g1 extends a1.c {
    public boolean V = false;
    public final /* synthetic */ int W;
    public final /* synthetic */ h1 X;

    public g1(h1 h1Var, int i10) {
        this.X = h1Var;
        this.W = i10;
    }

    @Override // a3.w0
    public final void a() {
        if (this.V) {
            return;
        }
        this.X.f947a.setVisibility(this.W);
    }

    @Override // a1.c, a3.w0
    public final void d(View view) {
        this.V = true;
    }

    @Override // a1.c, a3.w0
    public final void g() {
        this.X.f947a.setVisibility(0);
    }
}
