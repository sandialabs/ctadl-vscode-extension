package kotlinx.coroutines.internal;

import ja.m1;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class ThreadContextKt {

    /* renamed from: a  reason: collision with root package name */
    public static final r f15463a = new r("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    public static final u7.p<Object, CoroutineContext.a, Object> f15464b = ThreadContextKt$countAll$1.f15466j;
    public static final u7.p<m1<?>, CoroutineContext.a, m1<?>> c = ThreadContextKt$findOne$1.f15467j;

    /* renamed from: d  reason: collision with root package name */
    public static final u7.p<v, CoroutineContext.a, v> f15465d = ThreadContextKt$updateState$1.f15468j;

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f15463a) {
            return;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            m1<Object>[] m1VarArr = vVar.c;
            int length = m1VarArr.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i10 = length - 1;
                m1<Object> m1Var = m1VarArr[length];
                v7.g.c(m1Var);
                m1Var.y(vVar.f15499b[length]);
                if (i10 >= 0) {
                    length = i10;
                } else {
                    return;
                }
            }
        } else {
            Object J = coroutineContext.J(null, c);
            if (J != null) {
                ((m1) J).y(obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object J = coroutineContext.J(0, f15464b);
        v7.g.c(J);
        return J;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? f15463a : obj instanceof Integer ? coroutineContext.J(new v(coroutineContext, ((Number) obj).intValue()), f15465d) : ((m1) obj).P(coroutineContext);
    }
}
