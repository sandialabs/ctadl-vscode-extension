package h6;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11455a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f11456b;

    public /* synthetic */ c(o oVar, int i10) {
        this.f11455a = i10;
        this.f11456b = oVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        int i10 = this.f11455a;
        o oVar = this.f11456b;
        switch (i10) {
            case 0:
                f fVar = (f) oVar;
                fVar.t(fVar.u());
                return;
            default:
                n nVar = (n) oVar;
                nVar.f11480l = z10;
                nVar.q();
                if (!z10) {
                    nVar.t(false);
                    nVar.f11481m = false;
                    return;
                }
                return;
        }
    }
}
