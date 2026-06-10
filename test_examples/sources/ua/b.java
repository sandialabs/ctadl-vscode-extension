package ua;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.SerializationException;

/* loaded from: classes.dex */
public abstract class b<T> implements qa.b<T> {
    @Override // qa.e
    public final void b(ta.d dVar, T t10) {
        v7.g.f(dVar, "encoder");
        v7.g.f(t10, "value");
        qa.e<? super T> P = a1.b.P(this, dVar, t10);
        sa.e a10 = a();
        ta.b b5 = dVar.b(a10);
        b5.o0(a(), 0, P.a().b());
        b5.g0(a(), 1, P, t10);
        b5.a(a10);
    }

    @Override // qa.a
    public final T e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        sa.e a10 = a();
        ta.a b5 = cVar.b(a10);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        b5.C();
        T t10 = null;
        while (true) {
            int t11 = b5.t(a());
            if (t11 != -1) {
                if (t11 != 0) {
                    if (t11 != 1) {
                        StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        String str = (String) ref$ObjectRef.f13060i;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(t11);
                        throw new SerializationException(sb.toString());
                    }
                    T t12 = ref$ObjectRef.f13060i;
                    if (t12 != null) {
                        ref$ObjectRef.f13060i = t12;
                        String str2 = (String) t12;
                        qa.a<T> f10 = f(b5, str2);
                        if (f10 != null) {
                            t10 = (T) b5.A(a(), t11, f10, null);
                        } else {
                            a1.b.G0(str2, h());
                            throw null;
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                    }
                } else {
                    ref$ObjectRef.f13060i = (T) b5.E(a(), t11);
                }
            } else if (t10 != null) {
                b5.a(a10);
                return t10;
            } else {
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.f13060i)).toString());
            }
        }
    }

    public qa.a<T> f(ta.a aVar, String str) {
        v7.g.f(aVar, "decoder");
        return aVar.c().y0(str, h());
    }

    public qa.e<T> g(ta.d dVar, T t10) {
        v7.g.f(dVar, "encoder");
        v7.g.f(t10, "value");
        return dVar.c().z0(h(), t10);
    }

    public abstract c8.b<T> h();
}
