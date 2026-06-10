package kotlin;

import java.io.Serializable;
import v7.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Triple<A, B, C> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public final A f12972i;

    /* renamed from: j  reason: collision with root package name */
    public final B f12973j;

    /* renamed from: k  reason: collision with root package name */
    public final C f12974k;

    public Triple(A a10, B b5, C c) {
        this.f12972i = a10;
        this.f12973j = b5;
        this.f12974k = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Triple) {
            Triple triple = (Triple) obj;
            return g.a(this.f12972i, triple.f12972i) && g.a(this.f12973j, triple.f12973j) && g.a(this.f12974k, triple.f12974k);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        A a10 = this.f12972i;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b5 = this.f12973j;
        int hashCode2 = (hashCode + (b5 == null ? 0 : b5.hashCode())) * 31;
        C c = this.f12974k;
        if (c != null) {
            i10 = c.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String toString() {
        return "(" + this.f12972i + ", " + this.f12973j + ", " + this.f12974k + ')';
    }
}
