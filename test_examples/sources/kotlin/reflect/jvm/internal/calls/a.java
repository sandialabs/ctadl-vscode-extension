package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import v7.g;

/* loaded from: classes.dex */
public interface a<M extends Member> {

    /* renamed from: kotlin.reflect.jvm.internal.calls.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0142a {
        public static <M extends Member> void a(a<? extends M> aVar, Object[] objArr) {
            g.f(objArr, "args");
            if (m0.b.i0(aVar) == objArr.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + m0.b.i0(aVar) + " arguments, but " + objArr.length + " were provided.");
        }
    }

    Object a(Object[] objArr);

    Type k();

    List<Type> l();

    M m();
}
