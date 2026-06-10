package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import n7.l;
import y9.r;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KTypeParameterImpl$upperBounds$2 extends Lambda implements u7.a<List<? extends KTypeImpl>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KTypeParameterImpl f13231j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTypeParameterImpl$upperBounds$2(KTypeParameterImpl kTypeParameterImpl) {
        super(0);
        this.f13231j = kTypeParameterImpl;
    }

    @Override // u7.a
    public final List<? extends KTypeImpl> k0() {
        List<r> upperBounds = this.f13231j.f13228i.getUpperBounds();
        v7.g.e(upperBounds, "descriptor.upperBounds");
        ArrayList arrayList = new ArrayList(l.Z1(upperBounds, 10));
        for (r rVar : upperBounds) {
            arrayList.add(new KTypeImpl(rVar, null));
        }
        return arrayList;
    }
}
