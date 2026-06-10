package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l8.i0;
import n7.l;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KClassImpl$Data$typeParameters$2 extends Lambda implements u7.a<List<? extends KTypeParameterImpl>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T>.Data f13137j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T> f13138k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$typeParameters$2(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.f13137j = data;
        this.f13138k = kClassImpl;
    }

    @Override // u7.a
    public final List<? extends KTypeParameterImpl> k0() {
        List<i0> x3 = this.f13137j.a().x();
        v7.g.e(x3, "descriptor.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(l.Z1(x3, 10));
        for (i0 i0Var : x3) {
            v7.g.e(i0Var, "descriptor");
            arrayList.add(new KTypeParameterImpl(this.f13138k, i0Var));
        }
        return arrayList;
    }
}
