package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import p7.c;
import q7.b;
import q7.d;
import v7.g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lp7/c;", "", "Lq7/b;", "Ljava/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class BaseContinuationImpl implements c<Object>, b, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public final c<Object> f13035i;

    public BaseContinuationImpl(c<Object> cVar) {
        this.f13035i = cVar;
    }

    public c<n> a(Object obj, c<?> cVar) {
        g.f(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // q7.b
    public b g() {
        c<Object> cVar = this.f13035i;
        if (cVar instanceof b) {
            return (b) cVar;
        }
        return null;
    }

    public c<n> i(c<?> cVar) {
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public StackTraceElement j() {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        Integer num;
        int i11;
        q7.c cVar = (q7.c) getClass().getAnnotation(q7.c.class);
        String str2 = null;
        if (cVar == null) {
            return null;
        }
        int v3 = cVar.v();
        if (v3 <= 1) {
            int i12 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i10 = i11 - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i12 = cVar.l()[i10];
            }
            d.a aVar = d.f16943b;
            d.a aVar2 = d.f16942a;
            if (aVar == null) {
                try {
                    d.a aVar3 = new d.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    d.f16943b = aVar3;
                    aVar = aVar3;
                } catch (Exception unused2) {
                    d.f16943b = aVar2;
                    aVar = aVar2;
                }
            }
            if (aVar != aVar2) {
                Method method = aVar.f16944a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = aVar.f16945b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = aVar.c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = cVar.c();
            } else {
                str = str2 + '/' + cVar.c();
            }
            return new StackTraceElement(str, cVar.m(), cVar.f(), i12);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v3 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object k(Object obj);

    public void m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p7.c
    public final void t(Object obj) {
        c cVar = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            c cVar2 = baseContinuationImpl.f13035i;
            g.c(cVar2);
            try {
                obj = baseContinuationImpl.k(obj);
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = m0.b.Q(th);
            }
            baseContinuationImpl.m();
            if (!(cVar2 instanceof BaseContinuationImpl)) {
                cVar2.t(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object j2 = j();
        if (j2 == null) {
            j2 = getClass().getName();
        }
        sb.append(j2);
        return sb.toString();
    }
}
