package i8;

import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import u7.l;

/* loaded from: classes.dex */
public final class d implements l<h9.e, l8.b> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.e f11824i;

    public d(kotlin.reflect.jvm.internal.impl.builtins.e eVar) {
        this.f11824i = eVar;
    }

    @Override // u7.l
    public final l8.b U(h9.e eVar) {
        h9.e eVar2 = eVar;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.c l2 = this.f11824i.l();
        h9.c cVar = kotlin.reflect.jvm.internal.impl.builtins.g.f13354k;
        MemberScope w10 = l2.t0(cVar).w();
        if (w10 != null) {
            l8.d e10 = w10.e(eVar2, NoLookupLocation.FROM_BUILTINS);
            if (e10 != null) {
                if (e10 instanceof l8.b) {
                    return (l8.b) e10;
                }
                throw new AssertionError("Must be a class descriptor " + eVar2 + ", but was " + e10);
            }
            throw new AssertionError("Built-in class " + cVar.c(eVar2) + " is not found");
        }
        kotlin.reflect.jvm.internal.impl.builtins.e.a(11);
        throw null;
    }
}
