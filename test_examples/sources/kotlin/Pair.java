package kotlin;

import java.io.Serializable;
import v7.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Pair<A, B> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public final A f12962i;

    /* renamed from: j  reason: collision with root package name */
    public final B f12963j;

    public Pair(A a10, B b5) {
        this.f12962i = a10;
        this.f12963j = b5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return g.a(this.f12962i, pair.f12962i) && g.a(this.f12963j, pair.f12963j);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        A a10 = this.f12962i;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b5 = this.f12963j;
        if (b5 != null) {
            i10 = b5.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "(" + this.f12962i + ", " + this.f12963j + ')';
    }
}
