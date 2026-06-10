package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.types.checker.d;
import l8.i0;
import v7.g;
import y9.e0;

/* loaded from: classes.dex */
public final class a implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14699a;

    /* renamed from: b  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.descriptors.a f14700b;
    public final kotlin.reflect.jvm.internal.impl.descriptors.a c;

    public a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z10) {
        this.f14699a = z10;
        this.f14700b = aVar;
        this.c = aVar2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.d.a
    public final boolean a(e0 e0Var, e0 e0Var2) {
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = this.f14700b;
        g.f(aVar, "$a");
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = this.c;
        g.f(aVar2, "$b");
        g.f(e0Var, "c1");
        g.f(e0Var2, "c2");
        if (g.a(e0Var, e0Var2)) {
            return true;
        }
        l8.d c = e0Var.c();
        l8.d c10 = e0Var2.c();
        if ((c instanceof i0) && (c10 instanceof i0)) {
            return b.f14701a.b((i0) c, (i0) c10, this.f14699a, new DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1(aVar, aVar2));
        }
        return false;
    }
}
