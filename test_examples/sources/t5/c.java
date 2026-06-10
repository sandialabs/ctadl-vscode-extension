package t5;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.d f17591i;

    public c(com.google.android.material.floatingactionbutton.d dVar) {
        this.f17591i = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.material.floatingactionbutton.d dVar = this.f17591i;
        float rotation = dVar.f7170v.getRotation();
        if (dVar.f7163o != rotation) {
            dVar.f7163o = rotation;
            dVar.p();
            return true;
        }
        return true;
    }
}
