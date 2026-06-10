package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;
import l8.u;
import o8.p;
import u7.l;

/* loaded from: classes.dex */
public final class NotFoundClasses$packageFragments$1 extends Lambda implements l<h9.c, u> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NotFoundClasses f13453j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$packageFragments$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.f13453j = notFoundClasses;
    }

    @Override // u7.l
    public final u U(h9.c cVar) {
        h9.c cVar2 = cVar;
        v7.g.f(cVar2, "fqName");
        return new p(this.f13453j.f13445b, cVar2);
    }
}
