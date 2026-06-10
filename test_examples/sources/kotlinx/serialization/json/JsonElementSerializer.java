package kotlinx.serialization.json;

import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import ma.i;
import sa.c;
import sa.e;
import ta.d;
import v7.g;
import va.o;
import va.p;

/* loaded from: classes.dex */
public final class JsonElementSerializer implements qa.b<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonElementSerializer f15663a = new JsonElementSerializer();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptorImpl f15664b = kotlinx.serialization.descriptors.a.c("kotlinx.serialization.json.JsonElement", c.b.f17517a, new e[0], JsonElementSerializer$descriptor$1.f15665j);

    @Override // qa.b, qa.e, qa.a
    public final e a() {
        return f15664b;
    }

    @Override // qa.e
    public final void b(d dVar, Object obj) {
        qa.b bVar;
        b bVar2 = (b) obj;
        g.f(dVar, "encoder");
        g.f(bVar2, "value");
        i.j(dVar);
        if (bVar2 instanceof c) {
            bVar = p.f18233a;
        } else if (bVar2 instanceof JsonObject) {
            bVar = o.f18229a;
        } else if (bVar2 instanceof a) {
            bVar = va.b.f18193a;
        } else {
            return;
        }
        dVar.a0(bVar, bVar2);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        g.f(cVar, "decoder");
        return i.o(cVar).N();
    }
}
