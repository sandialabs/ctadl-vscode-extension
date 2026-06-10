package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KClassImpl$Data$inheritedStaticMembers$2 extends Lambda implements u7.a<Collection<? extends KCallableImpl<?>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T> f13125j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$inheritedStaticMembers$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.f13125j = kClassImpl;
    }

    @Override // u7.a
    public final Collection<? extends KCallableImpl<?>> k0() {
        KClassImpl<T> kClassImpl = this.f13125j;
        return kClassImpl.k(kClassImpl.v(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
    }
}
