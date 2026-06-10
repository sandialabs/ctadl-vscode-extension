package i1;

import androidx.activity.e;
import d1.b;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final float f11673a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11674b;
    public final long c;

    public a(float f10, float f11, long j2) {
        this.f11673a = f10;
        this.f11674b = f11;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.f11673a == this.f11673a) {
                return ((aVar.f11674b > this.f11674b ? 1 : (aVar.f11674b == this.f11674b ? 0 : -1)) == 0) && aVar.c == this.c;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int e10 = e.e(this.f11674b, e.e(this.f11673a, 0, 31), 31);
        long j2 = this.c;
        return e10 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f11673a + ",horizontalScrollPixels=" + this.f11674b + ",uptimeMillis=" + this.c + ')';
    }
}
