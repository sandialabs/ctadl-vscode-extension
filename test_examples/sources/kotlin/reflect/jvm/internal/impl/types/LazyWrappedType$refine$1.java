package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class LazyWrappedType$refine$1 extends Lambda implements u7.a<y9.r> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.e f14954j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ g f14955k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyWrappedType$refine$1(kotlin.reflect.jvm.internal.impl.types.checker.e eVar, g gVar) {
        super(0);
        this.f14954j = eVar;
        this.f14955k = gVar;
    }

    @Override // u7.a
    public final y9.r k0() {
        return this.f14954j.P0(this.f14955k.f15033k.k0());
    }
}
