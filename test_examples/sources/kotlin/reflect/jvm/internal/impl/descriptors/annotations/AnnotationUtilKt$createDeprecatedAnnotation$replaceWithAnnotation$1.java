package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import l8.s;
import u7.l;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
final class AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1 extends Lambda implements l<s, r> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f13476j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1(e eVar) {
        super(1);
        this.f13476j = eVar;
    }

    @Override // u7.l
    public final r U(s sVar) {
        s sVar2 = sVar;
        g.f(sVar2, "module");
        return sVar2.u().i(this.f13476j.v());
    }
}
