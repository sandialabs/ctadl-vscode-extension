package va;

import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.json.JsonNull;
import sa.d;

/* loaded from: classes.dex */
public final class p implements qa.b<kotlinx.serialization.json.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final p f18233a = new p();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptorImpl f18234b = kotlinx.serialization.descriptors.a.d("kotlinx.serialization.json.JsonPrimitive", d.i.f17526a, new sa.e[0]);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18234b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(cVar, "value");
        ma.i.j(dVar);
        if (cVar instanceof JsonNull) {
            dVar.a0(n.f18227a, JsonNull.INSTANCE);
        } else {
            dVar.a0(l.f18225a, (k) cVar);
        }
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        kotlinx.serialization.json.b N = ma.i.o(cVar).N();
        if (N instanceof kotlinx.serialization.json.c) {
            return (kotlinx.serialization.json.c) N;
        }
        throw a1.c.q(-1, "Unexpected JSON element, expected JsonPrimitive, had " + v7.i.a(N.getClass()), N.toString());
    }
}
