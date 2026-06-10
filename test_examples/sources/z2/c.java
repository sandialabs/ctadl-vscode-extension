package z2;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class c<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f19113a;

    /* renamed from: b  reason: collision with root package name */
    public final S f19114b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Rect rect, Rect rect2) {
        this.f19113a = rect;
        this.f19114b = rect2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!b.a(cVar.f19113a, this.f19113a) || !b.a(cVar.f19114b, this.f19114b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 0;
        F f10 = this.f19113a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f19114b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f19113a + " " + this.f19114b + "}";
    }
}
