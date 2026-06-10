package s9;

import y9.r;

/* loaded from: classes.dex */
public final class c extends a implements f {
    public final kotlin.reflect.jvm.internal.impl.descriptors.a c;

    /* renamed from: d  reason: collision with root package name */
    public final h9.e f17505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, r rVar, h9.e eVar, g gVar) {
        super(rVar, gVar);
        v7.g.f(rVar, "receiverType");
        this.c = aVar;
        this.f17505d = eVar;
    }

    @Override // s9.f
    public final h9.e a() {
        return this.f17505d;
    }

    public final String toString() {
        return "Cxt { " + this.c + " }";
    }
}
