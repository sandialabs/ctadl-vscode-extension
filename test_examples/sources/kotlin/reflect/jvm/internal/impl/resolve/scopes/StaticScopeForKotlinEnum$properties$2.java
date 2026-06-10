package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import l8.z;

/* loaded from: classes.dex */
public final class StaticScopeForKotlinEnum$properties$2 extends Lambda implements u7.a<List<? extends z>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ StaticScopeForKotlinEnum f14746j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticScopeForKotlinEnum$properties$2(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        super(0);
        this.f14746j = staticScopeForKotlinEnum;
    }

    @Override // u7.a
    public final List<? extends z> k0() {
        return a1.c.P0(k9.c.e(this.f14746j.f14743b));
    }
}
