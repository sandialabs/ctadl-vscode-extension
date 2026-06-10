package o1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements o, Iterable<Map.Entry<? extends androidx.compose.ui.semantics.a<?>, ? extends Object>>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashMap f16206i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    public boolean f16207j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f16208k;

    @Override // o1.o
    public final <T> void c(androidx.compose.ui.semantics.a<T> aVar, T t10) {
        v7.g.f(aVar, "key");
        this.f16206i.put(aVar, t10);
    }

    public final <T> boolean d(androidx.compose.ui.semantics.a<T> aVar) {
        v7.g.f(aVar, "key");
        return this.f16206i.containsKey(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return v7.g.a(this.f16206i, jVar.f16206i) && this.f16207j == jVar.f16207j && this.f16208k == jVar.f16208k;
        }
        return false;
    }

    public final <T> T g(androidx.compose.ui.semantics.a<T> aVar) {
        v7.g.f(aVar, "key");
        T t10 = (T) this.f16206i.get(aVar);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + aVar + " - consider getOrElse or getOrNull");
    }

    public final int hashCode() {
        return (((this.f16206i.hashCode() * 31) + (this.f16207j ? 1231 : 1237)) * 31) + (this.f16208k ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends androidx.compose.ui.semantics.a<?>, ? extends Object>> iterator() {
        return this.f16206i.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f16207j) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f16208k) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f16206i.entrySet()) {
            Object value = entry.getValue();
            sb.append(str);
            sb.append(((androidx.compose.ui.semantics.a) entry.getKey()).f3979a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return m0.b.l1(this) + "{ " + ((Object) sb) + " }";
    }
}
