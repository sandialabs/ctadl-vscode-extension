package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import v7.g;
import y9.r;
import y9.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1 extends Lambda implements u7.a<r> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ JvmBuiltInsCustomizer f13406j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.f13406j = jvmBuiltInsCustomizer;
    }

    @Override // u7.a
    public final r k0() {
        v f10 = this.f13406j.f13393a.u().f();
        g.e(f10, "moduleDescriptor.builtIns.anyType");
        return f10;
    }
}
