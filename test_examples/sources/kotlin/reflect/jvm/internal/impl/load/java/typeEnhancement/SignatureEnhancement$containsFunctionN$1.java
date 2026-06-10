package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import h9.e;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import u7.l;
import v7.g;
import y9.m0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SignatureEnhancement$containsFunctionN$1 extends Lambda implements l<m0, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final SignatureEnhancement$containsFunctionN$1 f13889j = new SignatureEnhancement$containsFunctionN$1();

    public SignatureEnhancement$containsFunctionN$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(m0 m0Var) {
        boolean z10;
        l8.d c = m0Var.U0().c();
        if (c == null) {
            return Boolean.FALSE;
        }
        e name = c.getName();
        h9.c cVar = k8.c.f12925f;
        if (g.a(name, cVar.f()) && g.a(DescriptorUtilsKt.c(c), cVar)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
