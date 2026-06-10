package v0;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class e implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f18089a;

    public e(Bitmap bitmap) {
        v7.g.f(bitmap, "bitmap");
        this.f18089a = bitmap;
    }

    @Override // v0.w
    public final int a() {
        return this.f18089a.getHeight();
    }

    @Override // v0.w
    public final int b() {
        return this.f18089a.getWidth();
    }
}
