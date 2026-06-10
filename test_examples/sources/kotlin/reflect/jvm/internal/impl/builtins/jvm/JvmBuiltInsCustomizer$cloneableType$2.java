package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import l8.s;
import x9.h;
import y9.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class JvmBuiltInsCustomizer$cloneableType$2 extends Lambda implements u7.a<v> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ JvmBuiltInsCustomizer f13404j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h f13405k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$cloneableType$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, h hVar) {
        super(0);
        this.f13404j = jvmBuiltInsCustomizer;
        this.f13405k = hVar;
    }

    @Override // u7.a
    public final v k0() {
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.f13404j;
        s sVar = jvmBuiltInsCustomizer.g().f13422a;
        a.f13412d.getClass();
        return FindClassInModuleKt.c(sVar, a.f13416h, new NotFoundClasses(this.f13405k, jvmBuiltInsCustomizer.g().f13422a)).r();
    }
}
