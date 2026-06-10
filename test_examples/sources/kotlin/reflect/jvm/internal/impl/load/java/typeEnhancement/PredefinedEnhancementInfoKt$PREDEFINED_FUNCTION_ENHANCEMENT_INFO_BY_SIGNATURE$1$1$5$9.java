package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d;
import m7.n;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9 extends Lambda implements l<d.a.C0157a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f13877j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f13878k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9(String str, String str2) {
        super(1);
        this.f13877j = str;
        this.f13878k = str2;
    }

    @Override // u7.l
    public final n U(d.a.C0157a c0157a) {
        d.a.C0157a c0157a2 = c0157a;
        g.f(c0157a2, "$this$function");
        c9.c cVar = PredefinedEnhancementInfoKt.f13854b;
        String str = this.f13877j;
        c0157a2.a(str, cVar);
        c9.c cVar2 = PredefinedEnhancementInfoKt.c;
        c0157a2.a(str, cVar2);
        c9.c cVar3 = PredefinedEnhancementInfoKt.f13853a;
        c0157a2.a(this.f13878k, cVar, cVar2, cVar2, cVar3);
        c0157a2.b(str, cVar3);
        return n.f16010a;
    }
}
