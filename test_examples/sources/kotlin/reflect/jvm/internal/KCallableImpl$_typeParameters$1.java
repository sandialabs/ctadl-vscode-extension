package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l8.i0;
import n7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "R", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KCallableImpl$_typeParameters$1 extends Lambda implements u7.a<List<? extends KTypeParameterImpl>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KCallableImpl<R> f13102j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCallableImpl$_typeParameters$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.f13102j = kCallableImpl;
    }

    @Override // u7.a
    public final List<? extends KTypeParameterImpl> k0() {
        KCallableImpl<R> kCallableImpl = this.f13102j;
        List<i0> typeParameters = kCallableImpl.d().getTypeParameters();
        v7.g.e(typeParameters, "descriptor.typeParameters");
        ArrayList arrayList = new ArrayList(l.Z1(typeParameters, 10));
        for (i0 i0Var : typeParameters) {
            v7.g.e(i0Var, "descriptor");
            arrayList.add(new KTypeParameterImpl(kCallableImpl, i0Var));
        }
        return arrayList;
    }
}
