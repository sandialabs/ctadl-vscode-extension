package c6;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f6545a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f6545a = sideSheetBehavior;
    }

    public final int a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f6545a;
        return Math.max(0, sideSheetBehavior.f7278m - sideSheetBehavior.f7277l);
    }
}
