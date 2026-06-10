package v0;

import android.graphics.Shader;

/* loaded from: classes.dex */
public abstract class f0 extends m {

    /* renamed from: a  reason: collision with root package name */
    public Shader f18108a;

    /* renamed from: b  reason: collision with root package name */
    public long f18109b;

    public f0() {
        int i10 = u0.f.f17737d;
        this.f18109b = u0.f.c;
    }

    @Override // v0.m
    public final void a(float f10, long j2, f fVar) {
        boolean z10;
        Shader shader = this.f18108a;
        if (shader == null || !u0.f.a(this.f18109b, j2)) {
            shader = b();
            this.f18108a = shader;
            this.f18109b = j2;
        }
        long c = fVar.c();
        long j10 = r.f18129b;
        if (!r.c(c, j10)) {
            fVar.f(j10);
        }
        if (!v7.g.a(fVar.c, shader)) {
            fVar.h(shader);
        }
        if (fVar.b() == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            fVar.d(f10);
        }
    }

    public abstract Shader b();
}
