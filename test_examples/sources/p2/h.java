package p2;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p2.f;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f16735i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f16736j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f16737k;

    public /* synthetic */ h(int i10, int i11, Object obj) {
        this.f16735i = i11;
        this.f16737k = obj;
        this.f16736j = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16735i;
        int i11 = this.f16736j;
        Object obj = this.f16737k;
        switch (i10) {
            case 0:
                ((f.e) obj).c(i11);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.n.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i11, false);
                    return;
                }
                return;
        }
    }
}
