package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Lambda;
import l8.x;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class ModuleDescriptorImpl$packages$1 extends Lambda implements l<h9.c, x> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f13523j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl$packages$1(c cVar) {
        super(1);
        this.f13523j = cVar;
    }

    @Override // u7.l
    public final x U(h9.c cVar) {
        h9.c cVar2 = cVar;
        g.f(cVar2, "fqName");
        c cVar3 = this.f13523j;
        return cVar3.n.a(cVar3, cVar2, cVar3.f13564k);
    }
}
