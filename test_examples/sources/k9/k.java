package k9;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes.dex */
public final class k implements u7.l<CallableMemberDescriptor, m7.n> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ androidx.datastore.preferences.protobuf.k f12943i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ CallableMemberDescriptor f12944j;

    public k(g gVar, CallableMemberDescriptor callableMemberDescriptor) {
        this.f12943i = gVar;
        this.f12944j = callableMemberDescriptor;
    }

    @Override // u7.l
    public final m7.n U(CallableMemberDescriptor callableMemberDescriptor) {
        this.f12943i.B0(this.f12944j, callableMemberDescriptor);
        return m7.n.f16010a;
    }
}
