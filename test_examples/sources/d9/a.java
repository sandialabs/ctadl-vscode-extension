package d9;

/* loaded from: classes.dex */
public final class a implements u9.c {

    /* renamed from: a  reason: collision with root package name */
    public final f f10444a;

    /* renamed from: b  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.g f10445b;

    public a(q8.f fVar, kotlin.reflect.jvm.internal.impl.load.kotlin.g gVar) {
        this.f10444a = fVar;
        this.f10445b = gVar;
    }

    @Override // u9.c
    public final u9.b a(h9.b bVar) {
        v7.g.f(bVar, "classId");
        kotlin.reflect.jvm.internal.impl.load.kotlin.h a10 = g.a(this.f10444a, bVar);
        if (a10 == null) {
            return null;
        }
        v7.g.a(a10.d(), bVar);
        return this.f10445b.f(a10);
    }
}
