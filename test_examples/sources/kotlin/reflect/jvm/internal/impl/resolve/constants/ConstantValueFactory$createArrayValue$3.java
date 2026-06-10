package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import l8.s;
import u7.l;
import v7.g;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class ConstantValueFactory$createArrayValue$3 extends Lambda implements l<s, r> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ PrimitiveType f14704j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstantValueFactory$createArrayValue$3(PrimitiveType primitiveType) {
        super(1);
        this.f14704j = primitiveType;
    }

    @Override // u7.l
    public final r U(s sVar) {
        s sVar2 = sVar;
        g.f(sVar2, "module");
        v r3 = sVar2.u().r(this.f14704j);
        g.e(r3, "module.builtIns.getPrimi…KotlinType(componentType)");
        return r3;
    }
}
