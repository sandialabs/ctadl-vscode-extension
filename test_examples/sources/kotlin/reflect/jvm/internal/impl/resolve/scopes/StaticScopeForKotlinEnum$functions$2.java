package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.g;

/* loaded from: classes.dex */
public final class StaticScopeForKotlinEnum$functions$2 extends Lambda implements u7.a<List<? extends g>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ StaticScopeForKotlinEnum f14745j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticScopeForKotlinEnum$functions$2(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        super(0);
        this.f14745j = staticScopeForKotlinEnum;
    }

    @Override // u7.a
    public final List<? extends g> k0() {
        StaticScopeForKotlinEnum staticScopeForKotlinEnum = this.f14745j;
        return a1.c.O0(k9.c.f(staticScopeForKotlinEnum.f14743b), k9.c.g(staticScopeForKotlinEnum.f14743b));
    }
}
