package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/lang/reflect/Type;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class KTypeImpl$arguments$2$parameterizedTypeArguments$2 extends Lambda implements u7.a<List<? extends Type>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KTypeImpl f13225j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2$parameterizedTypeArguments$2(KTypeImpl kTypeImpl) {
        super(0);
        this.f13225j = kTypeImpl;
    }

    @Override // u7.a
    public final List<? extends Type> k0() {
        Type type;
        g.a<Type> aVar = this.f13225j.f13218b;
        if (aVar != null) {
            type = aVar.k0();
        } else {
            type = null;
        }
        v7.g.c(type);
        return ReflectClassUtilKt.c(type);
    }
}
