package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import y9.r;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class KClassImpl$Data$supertypes$2$1$1 extends Lambda implements u7.a<Type> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ r f13133j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<Object>.Data f13134k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<Object> f13135l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2$1$1(r rVar, KClassImpl<Object>.Data data, KClassImpl<Object> kClassImpl) {
        super(0);
        this.f13133j = rVar;
        this.f13134k = data;
        this.f13135l = kClassImpl;
    }

    @Override // u7.a
    public final Type k0() {
        Type type;
        String str;
        l8.d c = this.f13133j.U0().c();
        if (c instanceof l8.b) {
            Class<?> j2 = f8.i.j((l8.b) c);
            KClassImpl<Object>.Data data = this.f13134k;
            if (j2 != null) {
                KClassImpl<Object> kClassImpl = this.f13135l;
                boolean a10 = v7.g.a(kClassImpl.f13104j.getSuperclass(), j2);
                Class<Object> cls = kClassImpl.f13104j;
                if (a10) {
                    type = cls.getGenericSuperclass();
                    str = "{\n                      …ass\n                    }";
                } else {
                    Class<?>[] interfaces = cls.getInterfaces();
                    v7.g.e(interfaces, "jClass.interfaces");
                    int p22 = kotlin.collections.b.p2(j2, interfaces);
                    if (p22 >= 0) {
                        type = cls.getGenericInterfaces()[p22];
                        str = "{\n                      …ex]\n                    }";
                    } else {
                        throw new KotlinReflectionInternalError("No superclass of " + data + " in Java reflection for " + c);
                    }
                }
                v7.g.e(type, str);
                return type;
            }
            throw new KotlinReflectionInternalError("Unsupported superclass of " + data + ": " + c);
        }
        throw new KotlinReflectionInternalError("Supertype not a class: " + c);
    }
}
