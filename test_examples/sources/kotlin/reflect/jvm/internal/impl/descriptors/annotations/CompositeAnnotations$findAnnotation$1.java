package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Lambda;
import m8.c;
import m8.e;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class CompositeAnnotations$findAnnotation$1 extends Lambda implements l<e, c> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h9.c f13482j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations$findAnnotation$1(h9.c cVar) {
        super(1);
        this.f13482j = cVar;
    }

    @Override // u7.l
    public final c U(e eVar) {
        e eVar2 = eVar;
        g.f(eVar2, "it");
        return eVar2.j(this.f13482j);
    }
}
