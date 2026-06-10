package ua;

import kotlinx.serialization.SerializationException;

/* loaded from: classes.dex */
public abstract class p0<K, V, R> implements qa.b<R> {

    /* renamed from: a  reason: collision with root package name */
    public final qa.b<K> f18000a;

    /* renamed from: b  reason: collision with root package name */
    public final qa.b<V> f18001b;

    public p0(qa.b bVar, qa.b bVar2) {
        this.f18000a = bVar;
        this.f18001b = bVar2;
    }

    @Override // qa.e
    public final void b(ta.d dVar, R r3) {
        v7.g.f(dVar, "encoder");
        ta.b b5 = dVar.b(a());
        b5.g0(a(), 0, this.f18000a, f(r3));
        b5.g0(a(), 1, this.f18001b, g(r3));
        b5.a(a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.a
    public final R e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        ta.a b5 = cVar.b(a());
        b5.C();
        Object obj = t1.f18014a;
        Object obj2 = obj;
        while (true) {
            int t10 = b5.t(a());
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        obj2 = b5.A(a(), 1, this.f18001b, null);
                    } else {
                        throw new SerializationException(androidx.activity.e.g("Invalid index: ", t10));
                    }
                } else {
                    obj = b5.A(a(), 0, this.f18000a, null);
                }
            } else {
                b5.a(a());
                Object obj3 = t1.f18014a;
                if (obj != obj3) {
                    if (obj2 != obj3) {
                        return (R) h(obj, obj2);
                    }
                    throw new SerializationException("Element 'value' is missing");
                }
                throw new SerializationException("Element 'key' is missing");
            }
        }
    }

    public abstract K f(R r3);

    public abstract V g(R r3);

    public abstract R h(K k3, V v3);
}
