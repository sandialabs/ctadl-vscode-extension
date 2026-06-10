package kotlinx.serialization.internal;

import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import qa.b;
import sa.e;
import ua.p0;
import v7.g;

/* loaded from: classes.dex */
public final class PairSerializer<K, V> extends p0<K, V, Pair<? extends K, ? extends V>> {
    public final SerialDescriptorImpl c;

    public PairSerializer(b<K> bVar, b<V> bVar2) {
        super(bVar, bVar2);
        this.c = kotlinx.serialization.descriptors.a.b("kotlin.Pair", new e[0], new PairSerializer$descriptor$1(bVar, bVar2));
    }

    @Override // qa.b, qa.e, qa.a
    public final e a() {
        return this.c;
    }

    @Override // ua.p0
    public final Object f(Object obj) {
        Pair pair = (Pair) obj;
        g.f(pair, "<this>");
        return pair.f12962i;
    }

    @Override // ua.p0
    public final Object g(Object obj) {
        Pair pair = (Pair) obj;
        g.f(pair, "<this>");
        return pair.f12963j;
    }

    @Override // ua.p0
    public final Object h(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }
}
