package u5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h {
    public float c;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f17818e;

    /* renamed from: f  reason: collision with root package name */
    public x5.d f17819f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f17815a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final a f17816b = new a();

    /* renamed from: d  reason: collision with root package name */
    public boolean f17817d = true;

    /* loaded from: classes.dex */
    public class a extends androidx.datastore.preferences.protobuf.k {
        public a() {
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void D0(int i10) {
            h hVar = h.this;
            hVar.f17817d = true;
            b bVar = hVar.f17818e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void E0(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            h hVar = h.this;
            hVar.f17817d = true;
            b bVar = hVar.f17818e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        this.f17818e = new WeakReference<>(null);
        this.f17818e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.f17817d) {
            return this.c;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.f17815a.measureText((CharSequence) str, 0, str.length());
        }
        this.c = measureText;
        this.f17817d = false;
        return measureText;
    }

    public final void b(x5.d dVar, Context context) {
        if (this.f17819f != dVar) {
            this.f17819f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f17815a;
                a aVar = this.f17816b;
                dVar.f(context, textPaint, aVar);
                b bVar = this.f17818e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                this.f17817d = true;
            }
            b bVar2 = this.f17818e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
