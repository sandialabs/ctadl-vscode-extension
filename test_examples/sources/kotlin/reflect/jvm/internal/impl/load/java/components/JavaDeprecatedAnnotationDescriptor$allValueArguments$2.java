package kotlin.reflect.jvm.internal.impl.load.java.components;

import h9.e;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.b;
import m9.r;
import u7.a;
import v8.c;

/* loaded from: classes.dex */
public final class JavaDeprecatedAnnotationDescriptor$allValueArguments$2 extends Lambda implements a<Map<e, ? extends r>> {

    /* renamed from: j  reason: collision with root package name */
    public static final JavaDeprecatedAnnotationDescriptor$allValueArguments$2 f13668j = new JavaDeprecatedAnnotationDescriptor$allValueArguments$2();

    public JavaDeprecatedAnnotationDescriptor$allValueArguments$2() {
        super(0);
    }

    @Override // u7.a
    public final Map<e, ? extends r> k0() {
        return b.P0(new Pair(c.f18181a, new r("Deprecated in Java")));
    }
}
