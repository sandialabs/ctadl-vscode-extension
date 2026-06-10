package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d;
import m7.n;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$3 extends Lambda implements l<d.a.C0157a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f13864j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$3(String str) {
        super(1);
        this.f13864j = str;
    }

    @Override // u7.l
    public final n U(d.a.C0157a c0157a) {
        d.a.C0157a c0157a2 = c0157a;
        g.f(c0157a2, "$this$function");
        c9.c cVar = PredefinedEnhancementInfoKt.f13854b;
        c0157a2.b(this.f13864j, cVar, cVar);
        return n.f16010a;
    }
}
