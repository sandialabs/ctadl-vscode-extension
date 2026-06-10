package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import l8.u;
import u7.l;

/* loaded from: classes.dex */
public final class NotFoundClasses$classes$1 extends Lambda implements l<NotFoundClasses.a, l8.b> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NotFoundClasses f13452j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.f13452j = notFoundClasses;
    }

    @Override // u7.l
    public final l8.b U(NotFoundClasses.a aVar) {
        l8.c cVar;
        int i10;
        NotFoundClasses.a aVar2 = aVar;
        v7.g.f(aVar2, "<name for destructuring parameter 0>");
        h9.b bVar = aVar2.f13447a;
        if (!bVar.c) {
            h9.b g10 = bVar.g();
            NotFoundClasses notFoundClasses = this.f13452j;
            List<Integer> list = aVar2.f13448b;
            if (g10 == null || (cVar = notFoundClasses.a(g10, kotlin.collections.c.i2(list))) == null) {
                x9.c<h9.c, u> cVar2 = notFoundClasses.c;
                h9.c h10 = bVar.h();
                v7.g.e(h10, "classId.packageFqName");
                cVar = (l8.c) ((LockBasedStorageManager.k) cVar2).U(h10);
            }
            l8.c cVar3 = cVar;
            boolean k3 = bVar.k();
            x9.h hVar = notFoundClasses.f13444a;
            h9.e j2 = bVar.j();
            v7.g.e(j2, "classId.shortClassName");
            Integer num = (Integer) kotlin.collections.c.p2(list);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            return new NotFoundClasses.b(hVar, cVar3, j2, k3, i10);
        }
        throw new UnsupportedOperationException("Unresolved local class: " + bVar);
    }
}
