package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import l8.f;
import l8.s;
import o8.l;
import x9.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class JvmBuiltInClassDescriptorFactory$cloneable$2 extends Lambda implements u7.a<l> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f13385j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h f13386k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInClassDescriptorFactory$cloneable$2(a aVar, h hVar) {
        super(0);
        this.f13385j = aVar;
        this.f13386k = hVar;
    }

    @Override // u7.a
    public final l k0() {
        a aVar = this.f13385j;
        u7.l<s, f> lVar = aVar.f13418b;
        s sVar = aVar.f13417a;
        l lVar2 = new l(lVar.U(sVar), a.f13415g, Modality.ABSTRACT, ClassKind.f13432j, a1.c.N0(sVar.u().f()), this.f13386k);
        lVar2.S0(new k8.a(this.f13386k, lVar2), EmptySet.f12983i, null);
        return lVar2;
    }
}
