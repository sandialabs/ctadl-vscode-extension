package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Lambda;
import m8.e;
import u8.o;
import v7.g;
import x8.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ContextKt$childForClassOrPackage$1 extends Lambda implements u7.a<o> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f13684j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ l8.c f13685k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextKt$childForClassOrPackage$1(c cVar, l8.c cVar2) {
        super(0);
        this.f13684j = cVar;
        this.f13685k = cVar2;
    }

    @Override // u7.a
    public final o k0() {
        e annotations = this.f13685k.getAnnotations();
        c cVar = this.f13684j;
        g.f(cVar, "<this>");
        g.f(annotations, "additionalAnnotations");
        return cVar.f18762a.f18753q.b((o) cVar.f18764d.getValue(), annotations);
    }
}
