package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import u7.l;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
final class SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 extends Lambda implements l<CallableMemberDescriptor, r> {

    /* renamed from: j  reason: collision with root package name */
    public static final SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 f13891j = new SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1();

    public SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1() {
        super(1);
    }

    @Override // u7.l
    public final r U(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        g.f(callableMemberDescriptor2, "it");
        r k3 = callableMemberDescriptor2.k();
        g.c(k3);
        return k3;
    }
}
