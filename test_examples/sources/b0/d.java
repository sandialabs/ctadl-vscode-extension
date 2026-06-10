package b0;

import m7.j;
import v0.r;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final long f6332a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6333b;

    public d(long j2, long j10) {
        this.f6332a = j2;
        this.f6333b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return r.c(this.f6332a, dVar.f6332a) && r.c(this.f6333b, dVar.f6333b);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r.f18134h;
        return j.a(this.f6333b) + (j.a(this.f6332a) * 31);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) r.i(this.f6332a)) + ", selectionBackgroundColor=" + ((Object) r.i(this.f6333b)) + ')';
    }
}
