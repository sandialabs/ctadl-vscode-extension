package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import l8.s;
import u7.l;
import v7.g;
import v8.b;
import v8.c;
import y9.r;

/* loaded from: classes.dex */
final class JavaAnnotationTargetMapper$mapJavaTargetArguments$1 extends Lambda implements l<s, r> {

    /* renamed from: j  reason: collision with root package name */
    public static final JavaAnnotationTargetMapper$mapJavaTargetArguments$1 f13665j = new JavaAnnotationTargetMapper$mapJavaTargetArguments$1();

    public JavaAnnotationTargetMapper$mapJavaTargetArguments$1() {
        super(1);
    }

    @Override // u7.l
    public final r U(s sVar) {
        r rVar;
        s sVar2 = sVar;
        g.f(sVar2, "module");
        h t10 = b.t(c.f18182b, sVar2.u().j(g.a.f13377t));
        if (t10 != null) {
            rVar = t10.b();
        } else {
            rVar = null;
        }
        if (rVar == null) {
            return aa.h.c(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]);
        }
        return rVar;
    }
}
