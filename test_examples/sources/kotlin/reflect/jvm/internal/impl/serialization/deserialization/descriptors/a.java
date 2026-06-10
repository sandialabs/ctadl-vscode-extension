package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.List;
import k9.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ List<Object> f14894i;

    public a(ArrayList arrayList) {
        this.f14894i = arrayList;
    }

    @Override // k9.g
    public final void L0(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        v7.g.f(callableMemberDescriptor, "fromSuper");
        v7.g.f(callableMemberDescriptor2, "fromCurrent");
        if (callableMemberDescriptor2 instanceof b) {
            ((b) callableMemberDescriptor2).X0(d.f13509a, callableMemberDescriptor);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void q0(CallableMemberDescriptor callableMemberDescriptor) {
        v7.g.f(callableMemberDescriptor, "fakeOverride");
        OverridingUtil.r(callableMemberDescriptor, null);
        this.f14894i.add(callableMemberDescriptor);
    }
}
