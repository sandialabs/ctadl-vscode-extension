package x1;

import a1.c;
import a2.g;
import android.text.TextPaint;
import androidx.datastore.preferences.protobuf.k;
import u0.f;
import v0.f0;
import v0.g0;
import v0.i0;
import v0.m;
import v0.r;

/* loaded from: classes.dex */
public final class a extends TextPaint {

    /* renamed from: a  reason: collision with root package name */
    public g f18566a;

    /* renamed from: b  reason: collision with root package name */
    public g0 f18567b;
    public m c;

    /* renamed from: d  reason: collision with root package name */
    public f f18568d;

    /* renamed from: e  reason: collision with root package name */
    public k f18569e;

    public a(float f10) {
        super(1);
        ((TextPaint) this).density = f10;
        this.f18566a = g.f100b;
        this.f18567b = g0.f18112d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r0 == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(m mVar, long j2, float f10) {
        boolean a10;
        if (mVar == null) {
            setShader(null);
            this.c = null;
            this.f18568d = null;
        } else if (mVar instanceof i0) {
            boolean isNaN = Float.isNaN(f10);
            long j10 = ((i0) mVar).f18118a;
            if (!isNaN && f10 < 1.0f) {
                j10 = r.b(j10, r.d(j10) * f10);
            }
            b(j10);
        } else if (mVar instanceof f0) {
            boolean z10 = false;
            if (getShader() != null && v7.g.a(this.c, mVar)) {
                f fVar = this.f18568d;
                if (fVar == null) {
                    a10 = false;
                } else {
                    a10 = f.a(fVar.f17738a, j2);
                }
            }
            if (j2 != f.c) {
                z10 = true;
            }
            if (z10) {
                this.c = mVar;
                this.f18568d = new f(j2);
                setShader(((f0) mVar).b());
            }
            v8.b.F(this, f10);
        }
    }

    public final void b(long j2) {
        boolean z10;
        int i10 = r.f18134h;
        if (j2 != r.f18133g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int I1 = c.I1(j2);
            if (getColor() != I1) {
                setColor(I1);
            }
            setShader(null);
            this.c = null;
            this.f18568d = null;
        }
    }

    public final void c(g0 g0Var) {
        boolean z10;
        if (g0Var != null && !v7.g.a(this.f18567b, g0Var)) {
            this.f18567b = g0Var;
            if (v7.g.a(g0Var, g0.f18112d)) {
                clearShadowLayer();
                return;
            }
            g0 g0Var2 = this.f18567b;
            float f10 = g0Var2.c;
            if (f10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = Float.MIN_VALUE;
            }
            setShadowLayer(f10, u0.c.b(g0Var2.f18114b), u0.c.c(this.f18567b.f18114b), c.I1(this.f18567b.f18113a));
        }
    }

    public final void d(g gVar) {
        if (gVar == null || v7.g.a(this.f18566a, gVar)) {
            return;
        }
        this.f18566a = gVar;
        setUnderlineText(gVar.a(g.c));
        setStrikeThruText(this.f18566a.a(g.f101d));
    }
}
