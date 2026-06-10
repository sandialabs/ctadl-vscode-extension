package i8;

/* loaded from: classes.dex */
public final class e implements u7.a<Void> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.c f11825i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.e f11826j;

    public e(kotlin.reflect.jvm.internal.impl.builtins.jvm.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar) {
        this.f11826j = bVar;
        this.f11825i = cVar;
    }

    @Override // u7.a
    public final Void k0() {
        kotlin.reflect.jvm.internal.impl.builtins.e eVar = this.f11826j;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar = eVar.f13325a;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar2 = this.f11825i;
        if (cVar == null) {
            eVar.f13325a = cVar2;
            return null;
        }
        throw new AssertionError("Built-ins module is already set: " + eVar.f13325a + " (attempting to reset to " + cVar2 + ")");
    }
}
