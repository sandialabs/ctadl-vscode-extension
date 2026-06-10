package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.io.InputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a;
import l8.u;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class AbstractDeserializedPackageFragmentProvider$fragments$1 extends Lambda implements l<h9.c, u> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f14757j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDeserializedPackageFragmentProvider$fragments$1(a aVar) {
        super(1);
        this.f14757j = aVar;
    }

    @Override // u7.l
    public final u U(h9.c cVar) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVar;
        h9.c cVar2 = cVar;
        g.f(cVar2, "fqName");
        a aVar2 = this.f14757j;
        k8.e eVar = (k8.e) aVar2;
        eVar.getClass();
        InputStream c = eVar.f14819b.c(cVar2);
        if (c != null) {
            aVar = a.C0167a.a(cVar2, eVar.f14818a, eVar.c, c, false);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        u9.e eVar2 = aVar2.f14820d;
        if (eVar2 != null) {
            aVar.S0(eVar2);
            return aVar;
        }
        g.l("components");
        throw null;
    }
}
