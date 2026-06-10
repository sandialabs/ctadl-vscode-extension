package b6;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f6386a;

    public a(float f10) {
        this.f6386a = f10;
    }

    @Override // b6.c
    public final float a(RectF rectF) {
        return this.f6386a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f6386a == ((a) obj).f6386a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6386a)});
    }
}
