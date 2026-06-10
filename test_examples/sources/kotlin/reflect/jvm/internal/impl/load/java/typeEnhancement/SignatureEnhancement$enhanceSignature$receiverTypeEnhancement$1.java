package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import l8.c0;
import u7.l;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends Lambda implements l<CallableMemberDescriptor, r> {

    /* renamed from: j  reason: collision with root package name */
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 f13890j = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1();

    public SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1() {
        super(1);
    }

    @Override // u7.l
    public final r U(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        g.f(callableMemberDescriptor2, "it");
        c0 R = callableMemberDescriptor2.R();
        g.c(R);
        r b5 = R.b();
        g.e(b5, "it.extensionReceiverParameter!!.type");
        return b5;
    }
}
