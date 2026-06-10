package b6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f6387a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6388b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f6387a;
            f10 += ((b) cVar).f6388b;
        }
        this.f6387a = cVar;
        this.f6388b = f10;
    }

    @Override // b6.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f6387a.a(rectF) + this.f6388b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f6387a.equals(bVar.f6387a) && this.f6388b == bVar.f6388b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6387a, Float.valueOf(this.f6388b)});
    }
}
