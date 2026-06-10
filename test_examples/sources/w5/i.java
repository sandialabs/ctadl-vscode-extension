package w5;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import w5.c;

/* loaded from: classes.dex */
public final class i<S extends c> extends l {

    /* renamed from: y  reason: collision with root package name */
    public static final a f18408y = new a();

    /* renamed from: t  reason: collision with root package name */
    public m<S> f18409t;

    /* renamed from: u  reason: collision with root package name */
    public final o3.d f18410u;

    /* renamed from: v  reason: collision with root package name */
    public final o3.c f18411v;

    /* renamed from: w  reason: collision with root package name */
    public float f18412w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18413x;

    /* loaded from: classes.dex */
    public class a extends androidx.datastore.preferences.protobuf.k {
        @Override // androidx.datastore.preferences.protobuf.k
        public final float A0(Object obj) {
            return ((i) obj).f18412w * 10000.0f;
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void J0(float f10, Object obj) {
            i iVar = (i) obj;
            iVar.f18412w = f10 / 10000.0f;
            iVar.invalidateSelf();
        }
    }

    public i(Context context, h hVar, d dVar) {
        super(context, hVar);
        this.f18413x = false;
        this.f18409t = dVar;
        dVar.f18427b = this;
        o3.d dVar2 = new o3.d();
        this.f18410u = dVar2;
        dVar2.a(1.0f);
        dVar2.b(50.0f);
        o3.c cVar = new o3.c(this, f18408y);
        this.f18411v = cVar;
        cVar.f16264t = dVar2;
        if (this.f18423p != 1.0f) {
            this.f18423p = 1.0f;
            invalidateSelf();
        }
    }

    @Override // w5.l
    public final boolean d(boolean z10, boolean z11, boolean z12) {
        boolean d5 = super.d(z10, z11, z12);
        w5.a aVar = this.f18419k;
        ContentResolver contentResolver = this.f18417i.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f10 == 0.0f) {
            this.f18413x = true;
        } else {
            this.f18413x = false;
            this.f18410u.b(50.0f / f10);
        }
        return d5;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f18409t.c(canvas, getBounds(), b());
            m<S> mVar = this.f18409t;
            Paint paint = this.f18424q;
            mVar.b(canvas, paint);
            this.f18409t.a(canvas, paint, 0.0f, this.f18412w, a1.b.C(this.f18418j.c[0], this.f18425r));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((d) this.f18409t).d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((d) this.f18409t).d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f18411v.d();
        this.f18412w = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean z10 = this.f18413x;
        o3.c cVar = this.f18411v;
        if (z10) {
            cVar.d();
            this.f18412w = i10 / 10000.0f;
            invalidateSelf();
        } else {
            cVar.f16253b = this.f18412w * 10000.0f;
            cVar.c = true;
            float f10 = i10;
            if (cVar.f16256f) {
                cVar.f16265u = f10;
            } else {
                if (cVar.f16264t == null) {
                    cVar.f16264t = new o3.d(f10);
                }
                cVar.f16264t.f16274i = f10;
                cVar.e();
            }
        }
        return true;
    }
}
