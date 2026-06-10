package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.g;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class KTypeImpl$arguments$2$1$type$1 extends Lambda implements u7.a<Type> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KTypeImpl f13222j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f13223k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ m7.e<List<Type>> f13224l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KTypeImpl$arguments$2$1$type$1(KTypeImpl kTypeImpl, int i10, m7.e<? extends List<? extends Type>> eVar) {
        super(0);
        this.f13222j = kTypeImpl;
        this.f13223k = i10;
        this.f13224l = eVar;
    }

    @Override // u7.a
    public final Type k0() {
        Type type;
        Type type2;
        KTypeImpl kTypeImpl = this.f13222j;
        g.a<Type> aVar = kTypeImpl.f13218b;
        if (aVar != null) {
            type = aVar.k0();
        } else {
            type = null;
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                type2 = cls.getComponentType();
            } else {
                type2 = Object.class;
            }
        } else {
            boolean z10 = type instanceof GenericArrayType;
            int i10 = this.f13223k;
            if (z10) {
                if (i10 == 0) {
                    type2 = ((GenericArrayType) type).getGenericComponentType();
                } else {
                    throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl);
                }
            } else if (type instanceof ParameterizedType) {
                type2 = this.f13224l.getValue().get(i10);
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    v7.g.e(lowerBounds, "argument.lowerBounds");
                    Type type3 = (Type) kotlin.collections.b.m2(lowerBounds);
                    if (type3 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        v7.g.e(upperBounds, "argument.upperBounds");
                        type2 = (Type) kotlin.collections.b.l2(upperBounds);
                    } else {
                        type2 = type3;
                    }
                }
            } else {
                throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl);
            }
        }
        v7.g.e(type2, "{\n                      …                        }");
        return type2;
    }
}
