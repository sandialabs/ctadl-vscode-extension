package b6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f6430a;

    public i(float f10) {
        this.f6430a = f10;
    }

    @Override // b6.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f6430a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f6430a == ((i) obj).f6430a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6430a)});
    }
}
