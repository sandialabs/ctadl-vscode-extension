package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "V", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KProperty0Impl$delegateValue$1 extends Lambda implements u7.a<Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KProperty0Impl<V> f13191j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KProperty0Impl$delegateValue$1(KProperty0Impl<? extends V> kProperty0Impl) {
        super(0);
        this.f13191j = kProperty0Impl;
    }

    @Override // u7.a
    public final Object k0() {
        Object obj;
        boolean z10;
        AccessibleObject accessibleObject;
        KProperty0Impl<V> kProperty0Impl = this.f13191j;
        Member g10 = kProperty0Impl.g();
        try {
            Object obj2 = KPropertyImpl.f13198p;
            if (kProperty0Impl.f()) {
                obj = a1.c.e0(kProperty0Impl.f13202m, kProperty0Impl.d());
            } else {
                obj = null;
            }
            if (obj != obj2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                obj = null;
            }
            kProperty0Impl.f();
            if (g10 instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) g10;
            } else {
                accessibleObject = null;
            }
            if (accessibleObject != null) {
                accessibleObject.setAccessible(e8.a.a(kProperty0Impl));
            }
            if (g10 == null) {
                return null;
            }
            if (g10 instanceof Field) {
                return ((Field) g10).get(obj);
            }
            if (g10 instanceof Method) {
                int length = ((Method) g10).getParameterTypes().length;
                if (length != 0) {
                    if (length != 1) {
                        if (length == 2) {
                            Method method = (Method) g10;
                            Class<?> cls = ((Method) g10).getParameterTypes()[1];
                            v7.g.e(cls, "fieldOrMethod.parameterTypes[1]");
                            return method.invoke(null, obj, f8.i.e(cls));
                        }
                        throw new AssertionError("delegate method " + g10 + " should take 0, 1, or 2 parameters");
                    }
                    Method method2 = (Method) g10;
                    Object[] objArr = new Object[1];
                    if (obj == null) {
                        Class<?> cls2 = ((Method) g10).getParameterTypes()[0];
                        v7.g.e(cls2, "fieldOrMethod.parameterTypes[0]");
                        obj = f8.i.e(cls2);
                    }
                    objArr[0] = obj;
                    return method2.invoke(null, objArr);
                }
                return ((Method) g10).invoke(null, new Object[0]);
            }
            throw new AssertionError("delegate field/method " + g10 + " neither field nor method");
        } catch (IllegalAccessException e10) {
            throw new IllegalPropertyDelegateAccessException(e10);
        }
    }
}
