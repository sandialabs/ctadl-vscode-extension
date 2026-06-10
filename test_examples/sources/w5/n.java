package w5;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import w5.c;

/* loaded from: classes.dex */
public final class n<S extends c> extends l {

    /* renamed from: t  reason: collision with root package name */
    public m<S> f18428t;

    /* renamed from: u  reason: collision with root package name */
    public j.b f18429u;

    public n(Context context, h hVar, d dVar, g gVar) {
        super(context, hVar);
        this.f18428t = dVar;
        dVar.f18427b = this;
        this.f18429u = gVar;
        gVar.f12607a = this;
    }

    @Override // w5.l
    public final boolean d(boolean z10, boolean z11, boolean z12) {
        boolean d5 = super.d(z10, z11, z12);
        if (!isRunning()) {
            this.f18429u.c();
        }
        a aVar = this.f18419k;
        ContentResolver contentResolver = this.f18417i.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z10 && (z12 || (Build.VERSION.SDK_INT <= 22 && f10 > 0.0f))) {
            this.f18429u.i();
        }
        return d5;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f18428t.c(canvas, getBounds(), b());
            m<S> mVar = this.f18428t;
            Paint paint = this.f18424q;
            mVar.b(canvas, paint);
            int i10 = 0;
            while (true) {
                j.b bVar = this.f18429u;
                Object obj = bVar.c;
                if (i10 >= ((int[]) obj).length) {
                    canvas.restore();
                    return;
                }
                m<S> mVar2 = this.f18428t;
                Object obj2 = bVar.f12608b;
                int i11 = i10 * 2;
                mVar2.a(canvas, paint, ((float[]) obj2)[i11], ((float[]) obj2)[i11 + 1], ((int[]) obj)[i10]);
                i10++;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((d) this.f18428t).d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((d) this.f18428t).d();
    }
}
