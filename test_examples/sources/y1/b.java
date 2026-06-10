package y1;

import android.text.style.MetricAffectingSpan;
import androidx.activity.e;
import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f18787a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18788b;
    public final int c;

    public b(int i10, int i11, MetricAffectingSpan metricAffectingSpan) {
        this.f18787a = metricAffectingSpan;
        this.f18788b = i10;
        this.c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return g.a(this.f18787a, bVar.f18787a) && this.f18788b == bVar.f18788b && this.c == bVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f18787a.hashCode() * 31) + this.f18788b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanRange(span=");
        sb.append(this.f18787a);
        sb.append(", start=");
        sb.append(this.f18788b);
        sb.append(", end=");
        return e.h(sb, this.c, ')');
    }
}
