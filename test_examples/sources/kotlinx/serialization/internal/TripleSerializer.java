package kotlinx.serialization.internal;

import kotlin.Triple;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import qa.b;
import sa.e;
import ta.c;
import ta.d;
import ua.t1;
import v7.g;

/* loaded from: classes.dex */
public final class TripleSerializer<A, B, C> implements b<Triple<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a  reason: collision with root package name */
    public final b<A> f15657a;

    /* renamed from: b  reason: collision with root package name */
    public final b<B> f15658b;
    public final b<C> c;

    /* renamed from: d  reason: collision with root package name */
    public final SerialDescriptorImpl f15659d = kotlinx.serialization.descriptors.a.b("kotlin.Triple", new e[0], new TripleSerializer$descriptor$1(this));

    public TripleSerializer(b<A> bVar, b<B> bVar2, b<C> bVar3) {
        this.f15657a = bVar;
        this.f15658b = bVar2;
        this.c = bVar3;
    }

    @Override // qa.b, qa.e, qa.a
    public final e a() {
        return this.f15659d;
    }

    @Override // qa.e
    public final void b(d dVar, Object obj) {
        Triple triple = (Triple) obj;
        g.f(dVar, "encoder");
        g.f(triple, "value");
        SerialDescriptorImpl serialDescriptorImpl = this.f15659d;
        ta.b b5 = dVar.b(serialDescriptorImpl);
        b5.g0(serialDescriptorImpl, 0, this.f15657a, triple.f12972i);
        b5.g0(serialDescriptorImpl, 1, this.f15658b, triple.f12973j);
        b5.g0(serialDescriptorImpl, 2, this.c, triple.f12974k);
        b5.a(serialDescriptorImpl);
    }

    @Override // qa.a
    public final Object e(c cVar) {
        g.f(cVar, "decoder");
        SerialDescriptorImpl serialDescriptorImpl = this.f15659d;
        ta.a b5 = cVar.b(serialDescriptorImpl);
        b5.C();
        Object obj = t1.f18014a;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int t10 = b5.t(serialDescriptorImpl);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            obj3 = b5.A(serialDescriptorImpl, 2, this.c, null);
                        } else {
                            throw new SerializationException(androidx.activity.e.g("Unexpected index ", t10));
                        }
                    } else {
                        obj2 = b5.A(serialDescriptorImpl, 1, this.f15658b, null);
                    }
                } else {
                    obj = b5.A(serialDescriptorImpl, 0, this.f15657a, null);
                }
            } else {
                b5.a(serialDescriptorImpl);
                Object obj4 = t1.f18014a;
                if (obj != obj4) {
                    if (obj2 != obj4) {
                        if (obj3 != obj4) {
                            return new Triple(obj, obj2, obj3);
                        }
                        throw new SerializationException("Element 'third' is missing");
                    }
                    throw new SerializationException("Element 'second' is missing");
                }
                throw new SerializationException("Element 'first' is missing");
            }
        }
    }
}
