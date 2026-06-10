package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import h9.e;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.d;
import l8.f;
import u7.l;

/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a {
        public static Collection a(c cVar, r9.c cVar2, int i10) {
            l<e, Boolean> lVar;
            if ((i10 & 1) != 0) {
                cVar2 = r9.c.f17182m;
            }
            if ((i10 & 2) != 0) {
                MemberScope.f14737a.getClass();
                lVar = MemberScope.Companion.f14739b;
            } else {
                lVar = null;
            }
            return cVar.f(cVar2, lVar);
        }
    }

    d e(e eVar, NoLookupLocation noLookupLocation);

    Collection<f> f(r9.c cVar, l<? super e, Boolean> lVar);
}
