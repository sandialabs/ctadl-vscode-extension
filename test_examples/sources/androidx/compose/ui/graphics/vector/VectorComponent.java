package androidx.compose.ui.graphics.vector;

import a1.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.unit.LayoutDirection;
import b2.h;
import g0.k0;
import m7.n;
import u7.l;
import v0.d;
import v0.e;
import v0.j;
import v0.o;
import v0.r;
import v0.s;
import v7.g;
import x0.a;
import z0.a;
import z0.b;
import z0.f;

/* loaded from: classes.dex */
public final class VectorComponent extends f {

    /* renamed from: b  reason: collision with root package name */
    public final b f3162b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final a f3163d;

    /* renamed from: e  reason: collision with root package name */
    public u7.a<n> f3164e;

    /* renamed from: f  reason: collision with root package name */
    public final k0 f3165f;

    /* renamed from: g  reason: collision with root package name */
    public float f3166g;

    /* renamed from: h  reason: collision with root package name */
    public float f3167h;

    /* renamed from: i  reason: collision with root package name */
    public long f3168i;

    /* renamed from: j  reason: collision with root package name */
    public final l<x0.f, n> f3169j;

    public VectorComponent() {
        b bVar = new b();
        bVar.f18987k = 0.0f;
        bVar.f18992q = true;
        bVar.c();
        bVar.f18988l = 0.0f;
        bVar.f18992q = true;
        bVar.c();
        bVar.d(new VectorComponent$root$1$1(this));
        this.f3162b = bVar;
        this.c = true;
        this.f3163d = new a();
        this.f3164e = VectorComponent$invalidateCallback$1.f3171j;
        this.f3165f = c.V0(null);
        this.f3168i = u0.f.c;
        this.f3169j = new VectorComponent$drawVectorBlock$1(this);
    }

    @Override // z0.f
    public final void a(x0.f fVar) {
        g.f(fVar, "<this>");
        e(fVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(x0.f fVar, float f10, s sVar) {
        s sVar2;
        Bitmap createBitmap;
        boolean z10;
        e eVar;
        g.f(fVar, "<this>");
        if (sVar != null) {
            sVar2 = sVar;
        } else {
            sVar2 = (s) this.f3165f.getValue();
        }
        boolean z11 = this.c;
        a aVar = this.f3163d;
        if (!z11 && u0.f.a(this.f3168i, fVar.a())) {
            z10 = false;
            aVar.getClass();
            eVar = aVar.f18975a;
            if (eVar != null) {
                z10 = true;
            }
            if (!z10) {
                x0.e.b(fVar, eVar, 0L, aVar.f18977d, 0L, f10, sVar2, 0, 858);
                return;
            }
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
        }
        float d5 = u0.f.d(fVar.a()) / this.f3166g;
        b bVar = this.f3162b;
        bVar.f18989m = d5;
        bVar.f18992q = true;
        bVar.c();
        bVar.n = u0.f.b(fVar.a()) / this.f3167h;
        bVar.f18992q = true;
        bVar.c();
        long f11 = v8.b.f((int) Math.ceil(u0.f.d(fVar.a())), (int) Math.ceil(u0.f.b(fVar.a())));
        LayoutDirection layoutDirection = fVar.getLayoutDirection();
        l<x0.f, n> lVar = this.f3169j;
        aVar.getClass();
        g.f(layoutDirection, "layoutDirection");
        g.f(lVar, "block");
        aVar.c = fVar;
        e eVar2 = aVar.f18975a;
        v0.c cVar = aVar.f18976b;
        if (eVar2 == null || cVar == null || ((int) (f11 >> 32)) > eVar2.b() || h.b(f11) > eVar2.a()) {
            int i10 = (int) (f11 >> 32);
            int b5 = h.b(f11);
            Rgb rgb = ColorSpaces.c;
            g.f(rgb, "colorSpace");
            Bitmap.Config J1 = c.J1(0);
            if (Build.VERSION.SDK_INT >= 26) {
                createBitmap = j.c(i10, b5, 0, true, rgb);
            } else {
                createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, b5, J1);
                g.e(createBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
                createBitmap.setHasAlpha(true);
            }
            e eVar3 = new e(createBitmap);
            Canvas canvas = d.f18088a;
            v0.c cVar2 = new v0.c();
            cVar2.f18085a = new Canvas(eVar3.f18089a);
            aVar.f18975a = eVar3;
            aVar.f18976b = cVar2;
            cVar = cVar2;
            eVar2 = eVar3;
        }
        aVar.f18977d = f11;
        long M = v8.b.M(f11);
        x0.a aVar2 = aVar.f18978e;
        a.C0237a c0237a = aVar2.f18549i;
        b2.b bVar2 = c0237a.f18553a;
        LayoutDirection layoutDirection2 = c0237a.f18554b;
        o oVar = c0237a.c;
        long j2 = c0237a.f18555d;
        c0237a.f18553a = fVar;
        c0237a.f18554b = layoutDirection;
        c0237a.c = cVar;
        c0237a.f18555d = M;
        cVar.m();
        x0.e.e(aVar2, r.f18129b, 0L, 62);
        ((VectorComponent$drawVectorBlock$1) lVar).U(aVar2);
        cVar.l();
        a.C0237a c0237a2 = aVar2.f18549i;
        c0237a2.getClass();
        g.f(bVar2, "<set-?>");
        c0237a2.f18553a = bVar2;
        g.f(layoutDirection2, "<set-?>");
        c0237a2.f18554b = layoutDirection2;
        g.f(oVar, "<set-?>");
        c0237a2.c = oVar;
        c0237a2.f18555d = j2;
        eVar2.f18089a.prepareToDraw();
        z10 = false;
        this.c = false;
        this.f3168i = fVar.a();
        aVar.getClass();
        eVar = aVar.f18975a;
        if (eVar != null) {
        }
        if (!z10) {
        }
    }

    public final String toString() {
        String str = "Params: \tname: " + this.f3162b.f18985i + "\n\tviewportWidth: " + this.f3166g + "\n\tviewportHeight: " + this.f3167h + "\n";
        g.e(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
