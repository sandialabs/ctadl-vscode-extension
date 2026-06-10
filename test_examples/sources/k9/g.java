package k9;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes.dex */
public abstract class g extends androidx.datastore.preferences.protobuf.k {
    @Override // androidx.datastore.preferences.protobuf.k
    public final void B0(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        v7.g.f(callableMemberDescriptor, "first");
        v7.g.f(callableMemberDescriptor2, "second");
        L0(callableMemberDescriptor, callableMemberDescriptor2);
    }

    public abstract void L0(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);
}
