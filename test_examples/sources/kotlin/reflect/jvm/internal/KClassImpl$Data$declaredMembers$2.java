package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KClassImpl$Data$declaredMembers$2 extends Lambda implements u7.a<List<? extends KCallableImpl<?>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T>.Data f13120j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$declaredMembers$2(KClassImpl<T>.Data data) {
        super(0);
        this.f13120j = data;
    }

    @Override // u7.a
    public final List<? extends KCallableImpl<?>> k0() {
        KClassImpl<T>.Data data = this.f13120j;
        data.getClass();
        c8.j<Object>[] jVarArr = KClassImpl.Data.f13106l;
        c8.j<Object> jVar = jVarArr[10];
        Object k02 = data.f13109f.k0();
        v7.g.e(k02, "<get-declaredNonStaticMembers>(...)");
        c8.j<Object> jVar2 = jVarArr[11];
        Object k03 = data.f13110g.k0();
        v7.g.e(k03, "<get-declaredStaticMembers>(...)");
        return kotlin.collections.c.z2((Collection) k03, (Collection) k02);
    }
}
