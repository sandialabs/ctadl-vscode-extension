package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.s;

/* loaded from: classes.dex */
final class ReflectionTypes$kotlinReflectScope$2 extends Lambda implements u7.a<MemberScope> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s f13311j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectionTypes$kotlinReflectScope$2(kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar) {
        super(0);
        this.f13311j = cVar;
    }

    @Override // u7.a
    public final MemberScope k0() {
        return this.f13311j.t0(g.f13351h).w();
    }
}
