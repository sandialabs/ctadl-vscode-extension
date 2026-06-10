package w8;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import l8.z;
import m8.e;

/* loaded from: classes.dex */
public final class d extends e {
    public final g L;
    public final g M;
    public final z N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l8.b bVar, g gVar, g gVar2, z zVar) {
        super(bVar, e.a.f16014a, gVar.p(), gVar.g(), gVar2 != null, zVar.getName(), gVar.j(), null, CallableMemberDescriptor.Kind.DECLARATION, false, null);
        v7.g.f(bVar, "ownerDescriptor");
        this.L = gVar;
        this.M = gVar2;
        this.N = zVar;
    }
}
