package v0;

import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class i implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f18117a;

    public i(PathMeasure pathMeasure) {
        this.f18117a = pathMeasure;
    }

    @Override // v0.b0
    public final float a() {
        return this.f18117a.getLength();
    }

    @Override // v0.b0
    public final boolean b(float f10, float f11, h hVar) {
        v7.g.f(hVar, "destination");
        return this.f18117a.getSegment(f10, f11, hVar.f18115a, true);
    }

    @Override // v0.b0
    public final void c(h hVar) {
        this.f18117a.setPath(hVar != null ? hVar.f18115a : null, false);
    }
}
