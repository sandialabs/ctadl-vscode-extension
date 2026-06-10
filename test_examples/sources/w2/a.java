package w2;

import android.graphics.Typeface;
import p2.f;
import q2.e;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ma.i f18260i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Typeface f18261j;

    public a(ma.i iVar, Typeface typeface) {
        this.f18260i = iVar;
        this.f18261j = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((e.a) this.f18260i).f16879y;
        if (eVar != null) {
            eVar.d(this.f18261j);
        }
    }
}
