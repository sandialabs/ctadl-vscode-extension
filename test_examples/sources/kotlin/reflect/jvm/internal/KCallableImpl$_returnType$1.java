package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import y9.r;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "R", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KCallableImpl$_returnType$1 extends Lambda implements u7.a<KTypeImpl> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KCallableImpl<R> f13100j;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "R", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<Type> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ KCallableImpl<Object> f13101j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(KCallableImpl<Object> kCallableImpl) {
            super(0);
            this.f13101j = kCallableImpl;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        @Override // u7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Type k0() {
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar;
            boolean z10;
            ParameterizedType parameterizedType;
            Type type;
            WildcardType wildcardType;
            Type[] lowerBounds;
            KCallableImpl<Object> kCallableImpl = this.f13101j;
            CallableMemberDescriptor d5 = kCallableImpl.d();
            Type type2 = null;
            if (d5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) d5;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                z10 = true;
                if (eVar.r0()) {
                    if (z10) {
                        Object w22 = kotlin.collections.c.w2(kCallableImpl.b().l());
                        if (w22 instanceof ParameterizedType) {
                            parameterizedType = (ParameterizedType) w22;
                        } else {
                            parameterizedType = null;
                        }
                        if (parameterizedType != null) {
                            type = parameterizedType.getRawType();
                        } else {
                            type = null;
                        }
                        if (v7.g.a(type, p7.c.class)) {
                            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                            v7.g.e(actualTypeArguments, "continuationType.actualTypeArguments");
                            Object s22 = kotlin.collections.b.s2(actualTypeArguments);
                            if (s22 instanceof WildcardType) {
                                wildcardType = (WildcardType) s22;
                            } else {
                                wildcardType = null;
                            }
                            if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                                type2 = (Type) kotlin.collections.b.l2(lowerBounds);
                            }
                        }
                    }
                    if (type2 != null) {
                        return kCallableImpl.b().k();
                    }
                    return type2;
                }
            }
            z10 = false;
            if (z10) {
            }
            if (type2 != null) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCallableImpl$_returnType$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.f13100j = kCallableImpl;
    }

    @Override // u7.a
    public final KTypeImpl k0() {
        KCallableImpl<R> kCallableImpl = this.f13100j;
        r k3 = kCallableImpl.d().k();
        v7.g.c(k3);
        return new KTypeImpl(k3, new AnonymousClass1(kCallableImpl));
    }
}
