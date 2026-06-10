package va;

import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;
import sa.h;

/* loaded from: classes.dex */
public final class n implements qa.b<JsonNull> {

    /* renamed from: a  reason: collision with root package name */
    public static final n f18227a = new n();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialDescriptorImpl f18228b;

    static {
        SerialDescriptorImpl c;
        c = kotlinx.serialization.descriptors.a.c("kotlinx.serialization.json.JsonNull", h.b.f17531a, new sa.e[0], SerialDescriptorsKt$buildSerialDescriptor$1.f15608j);
        f18228b = c;
    }

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18228b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        v7.g.f(dVar, "encoder");
        v7.g.f((JsonNull) obj, "value");
        ma.i.j(dVar);
        dVar.j();
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        ma.i.o(cVar);
        if (!cVar.o()) {
            cVar.W();
            return JsonNull.INSTANCE;
        }
        throw new JsonDecodingException("Expected 'null' literal");
    }
}
