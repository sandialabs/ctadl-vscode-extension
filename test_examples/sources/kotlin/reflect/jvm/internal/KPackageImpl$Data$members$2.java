package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KPackageImpl$Data$members$2 extends Lambda implements u7.a<Collection<? extends KCallableImpl<?>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KPackageImpl f13175j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ KPackageImpl.Data f13176k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$members$2(KPackageImpl.Data data, KPackageImpl kPackageImpl) {
        super(0);
        this.f13175j = kPackageImpl;
        this.f13176k = data;
    }

    @Override // u7.a
    public final Collection<? extends KCallableImpl<?>> k0() {
        KPackageImpl.Data data = this.f13176k;
        data.getClass();
        c8.j<Object> jVar = KPackageImpl.Data.f13170g[1];
        Object k02 = data.f13171d.k0();
        v7.g.e(k02, "<get-scope>(...)");
        KDeclarationContainerImpl.MemberBelonginess memberBelonginess = KDeclarationContainerImpl.MemberBelonginess.DECLARED;
        return this.f13175j.k((MemberScope) k02, memberBelonginess);
    }
}
