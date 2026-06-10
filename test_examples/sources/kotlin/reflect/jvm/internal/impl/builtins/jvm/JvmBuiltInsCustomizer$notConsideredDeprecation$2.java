package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m8.e;
import m8.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class JvmBuiltInsCustomizer$notConsideredDeprecation$2 extends Lambda implements u7.a<e> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ JvmBuiltInsCustomizer f13411j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$notConsideredDeprecation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.f13411j = jvmBuiltInsCustomizer;
    }

    @Override // u7.a
    public final e k0() {
        List N0 = a1.c.N0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a.a(this.f13411j.f13393a.u()));
        if (N0.isEmpty()) {
            return e.a.f16014a;
        }
        return new f(N0);
    }
}
