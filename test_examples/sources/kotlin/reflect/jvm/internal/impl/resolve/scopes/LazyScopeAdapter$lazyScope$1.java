package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class LazyScopeAdapter$lazyScope$1 extends Lambda implements u7.a<MemberScope> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.a<MemberScope> f14736j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyScopeAdapter$lazyScope$1(u7.a<? extends MemberScope> aVar) {
        super(0);
        this.f14736j = aVar;
    }

    @Override // u7.a
    public final MemberScope k0() {
        MemberScope k02 = this.f14736j.k0();
        return k02 instanceof r9.a ? ((r9.a) k02).h() : k02;
    }
}
