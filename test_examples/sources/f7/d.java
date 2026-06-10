package f7;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d extends EdgeEffect {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10946a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10947b;
    public final o3.c c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(int i10, RecyclerView recyclerView, Context context) {
        super(context);
        boolean z10;
        androidx.datastore.preferences.protobuf.k kVar;
        this.f10948d = recyclerView;
        int i11 = 1;
        if (i10 != 3 && i10 != 1) {
            z10 = false;
            this.f10946a = z10;
            if (i10 != 2 || i10 == 3) {
                i11 = -1;
            }
            this.f10947b = i11;
            if (!z10) {
                kVar = o3.b.f16246m;
            } else {
                kVar = o3.b.f16245l;
            }
            o3.c cVar = new o3.c(recyclerView, kVar);
            o3.d dVar = new o3.d();
            dVar.f16274i = 0.0f;
            dVar.a(0.5f);
            dVar.b(200.0f);
            cVar.f16264t = dVar;
            this.c = cVar;
        }
        z10 = true;
        this.f10946a = z10;
        if (i10 != 2) {
        }
        i11 = -1;
        this.f10947b = i11;
        if (!z10) {
        }
        o3.c cVar2 = new o3.c(recyclerView, kVar);
        o3.d dVar2 = new o3.d();
        dVar2.f16274i = 0.0f;
        dVar2.a(0.5f);
        dVar2.b(200.0f);
        cVar2.f16264t = dVar2;
        this.c = cVar2;
    }

    public final void a(float f10) {
        boolean z10 = this.f10946a;
        int i10 = this.f10947b;
        RecyclerView recyclerView = this.f10948d;
        if (z10) {
            recyclerView.setTranslationY((recyclerView.getWidth() * i10 * f10 * 0.2f) + recyclerView.getTranslationY());
        } else {
            recyclerView.setTranslationX((recyclerView.getHeight() * i10 * f10 * 0.2f) + recyclerView.getTranslationX());
        }
        o3.c cVar = this.c;
        cVar.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (cVar.f16256f) {
                cVar.b(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        return false;
    }

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        return !this.c.f16256f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        super.onAbsorb(i10);
        float f10 = this.f10947b * i10 * 0.2f;
        o3.c cVar = this.c;
        cVar.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (cVar.f16256f) {
                cVar.b(true);
            }
            cVar.f16252a = f10;
            cVar.e();
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        super.onPull(f10);
        a(f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        super.onPull(f10, f11);
        a(f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        boolean z10 = this.f10946a;
        o3.c cVar = this.c;
        boolean z11 = true;
        RecyclerView recyclerView = this.f10948d;
        if (z10) {
            if (recyclerView.getTranslationY() != 0.0f) {
                z11 = false;
            }
            if (z11) {
                return;
            }
        } else {
            if (recyclerView.getTranslationX() != 0.0f) {
                z11 = false;
            }
            if (z11) {
                return;
            }
        }
        cVar.e();
    }
}
