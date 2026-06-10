package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import u7.l;
import v7.g;
import y9.r;

/* loaded from: classes.dex */
final class SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 extends Lambda implements l<CallableMemberDescriptor, r> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h f13892j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1(h hVar) {
        super(1);
        this.f13892j = hVar;
    }

    @Override // u7.l
    public final r U(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        g.f(callableMemberDescriptor2, "it");
        r b5 = callableMemberDescriptor2.m().get(this.f13892j.getIndex()).b();
        g.e(b5, "it.valueParameters[p.index].type");
        return b5;
    }
}
