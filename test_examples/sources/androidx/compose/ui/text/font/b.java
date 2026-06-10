package androidx.compose.ui.text.font;

import m7.n;
import u1.e;
import u1.f;
import u1.h;
import u1.m;
import u1.p;
import u1.q;
import u1.w;
import u1.x;
import u1.y;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class b implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final p f4123a;

    /* renamed from: b  reason: collision with root package name */
    public final q f4124b;
    public final x c;

    /* renamed from: d  reason: collision with root package name */
    public final h f4125d;

    /* renamed from: e  reason: collision with root package name */
    public final j0.c f4126e;

    /* renamed from: f  reason: collision with root package name */
    public final l<w, Object> f4127f;

    public b(AndroidFontLoader androidFontLoader, u1.b bVar) {
        x xVar = f.f17742a;
        h hVar = new h(f.f17743b);
        j0.c cVar = new j0.c(4);
        g.f(xVar, "typefaceRequestCache");
        this.f4123a = androidFontLoader;
        this.f4124b = bVar;
        this.c = xVar;
        this.f4125d = hVar;
        this.f4126e = cVar;
        this.f4127f = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    @Override // u1.e.a
    public final y a(e eVar, m mVar, int i10, int i11) {
        g.f(mVar, "fontWeight");
        q qVar = this.f4124b;
        e d5 = qVar.d(eVar);
        m c = qVar.c(mVar);
        int b5 = qVar.b(i10);
        int a10 = qVar.a(i11);
        this.f4123a.c();
        return b(new w(d5, c, b5, a10, null));
    }

    public final y b(w wVar) {
        y a10;
        x xVar = this.c;
        FontFamilyResolverImpl$resolve$result$1 fontFamilyResolverImpl$resolve$result$1 = new FontFamilyResolverImpl$resolve$result$1(this, wVar);
        xVar.getClass();
        synchronized (xVar.f17772a) {
            a10 = xVar.f17773b.a(wVar);
            if (a10 != null) {
                if (!a10.e()) {
                    xVar.f17773b.c(wVar);
                }
            }
            try {
                a10 = (y) fontFamilyResolverImpl$resolve$result$1.U(new TypefaceRequestCache$runCached$currentTypefaceResult$1(xVar, wVar));
                synchronized (xVar.f17772a) {
                    if (xVar.f17773b.a(wVar) == null && a10.e()) {
                        xVar.f17773b.b(wVar, a10);
                    }
                    n nVar = n.f16010a;
                }
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
        return a10;
    }
}
