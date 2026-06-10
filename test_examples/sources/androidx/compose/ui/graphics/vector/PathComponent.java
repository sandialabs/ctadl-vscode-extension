package androidx.compose.ui.graphics.vector;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import m0.b;
import m7.e;
import u0.c;
import v0.b0;
import v0.h;
import v0.m;
import v7.g;
import x0.i;
import z0.d;
import z0.f;
import z0.j;

/* loaded from: classes.dex */
public final class PathComponent extends f {

    /* renamed from: b  reason: collision with root package name */
    public m f3143b;

    /* renamed from: f  reason: collision with root package name */
    public float f3146f;

    /* renamed from: g  reason: collision with root package name */
    public m f3147g;

    /* renamed from: k  reason: collision with root package name */
    public float f3151k;

    /* renamed from: m  reason: collision with root package name */
    public float f3153m;

    /* renamed from: q  reason: collision with root package name */
    public i f3156q;
    public float c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public List<? extends d> f3144d = j.f19079a;

    /* renamed from: e  reason: collision with root package name */
    public float f3145e = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public int f3148h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f3149i = 0;

    /* renamed from: j  reason: collision with root package name */
    public float f3150j = 4.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f3152l = 1.0f;
    public boolean n = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3154o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3155p = true;

    /* renamed from: r  reason: collision with root package name */
    public final h f3157r = b.k();

    /* renamed from: s  reason: collision with root package name */
    public final h f3158s = b.k();

    /* renamed from: t  reason: collision with root package name */
    public final e f3159t = a.a(LazyThreadSafetyMode.NONE, PathComponent$pathMeasure$2.f3161j);

    /* renamed from: u  reason: collision with root package name */
    public final z0.e f3160u = new z0.e();

    @Override // z0.f
    public final void a(x0.f fVar) {
        i iVar;
        g.f(fVar, "<this>");
        if (this.n) {
            z0.e eVar = this.f3160u;
            eVar.f19062a.clear();
            h hVar = this.f3157r;
            hVar.l();
            List<? extends d> list = this.f3144d;
            g.f(list, "nodes");
            eVar.f19062a.addAll(list);
            eVar.c(hVar);
            e();
        } else if (this.f3155p) {
            e();
        }
        this.n = false;
        this.f3155p = false;
        m mVar = this.f3143b;
        h hVar2 = this.f3158s;
        if (mVar != null) {
            x0.e.c(fVar, hVar2, mVar, this.c, null, 56);
        }
        m mVar2 = this.f3147g;
        if (mVar2 != null) {
            i iVar2 = this.f3156q;
            if (!this.f3154o && iVar2 != null) {
                iVar = iVar2;
                x0.e.c(fVar, hVar2, mVar2, this.f3145e, iVar, 48);
            }
            iVar = new i(this.f3146f, this.f3150j, this.f3148h, this.f3149i, 16);
            this.f3156q = iVar;
            this.f3154o = false;
            x0.e.c(fVar, hVar2, mVar2, this.f3145e, iVar, 48);
        }
    }

    public final void e() {
        boolean z10;
        h hVar = this.f3158s;
        hVar.l();
        boolean z11 = true;
        if (this.f3151k == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        h hVar2 = this.f3157r;
        if (z10) {
            if (this.f3152l != 1.0f) {
                z11 = false;
            }
            if (z11) {
                hVar.m(hVar2, c.f17721b);
                return;
            }
        }
        e eVar = this.f3159t;
        ((b0) eVar.getValue()).c(hVar2);
        float a10 = ((b0) eVar.getValue()).a();
        float f10 = this.f3151k;
        float f11 = this.f3153m;
        float f12 = ((f10 + f11) % 1.0f) * a10;
        float f13 = ((this.f3152l + f11) % 1.0f) * a10;
        if (f12 > f13) {
            ((b0) eVar.getValue()).b(f12, a10, hVar);
            ((b0) eVar.getValue()).b(0.0f, f13, hVar);
            return;
        }
        ((b0) eVar.getValue()).b(f12, f13, hVar);
    }

    public final String toString() {
        return this.f3157r.toString();
    }
}
