package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.EmptyList;
import v7.g;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f13281a = new e();

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final Object a(Object[] objArr) {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final Type k() {
        Class cls = Void.TYPE;
        g.e(cls, "TYPE");
        return cls;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final List<Type> l() {
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public final /* bridge */ /* synthetic */ Member m() {
        return null;
    }
}
