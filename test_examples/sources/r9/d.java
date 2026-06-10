package r9;

import java.util.ArrayList;
import k9.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ArrayList<l8.f> f17192i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ GivenFunctionsMemberScope f17193j;

    public d(ArrayList<l8.f> arrayList, GivenFunctionsMemberScope givenFunctionsMemberScope) {
        this.f17192i = arrayList;
        this.f17193j = givenFunctionsMemberScope;
    }

    @Override // k9.g
    public final void L0(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        v7.g.f(callableMemberDescriptor, "fromSuper");
        v7.g.f(callableMemberDescriptor2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f17193j.f14733b + ": " + callableMemberDescriptor + " vs " + callableMemberDescriptor2).toString());
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void q0(CallableMemberDescriptor callableMemberDescriptor) {
        v7.g.f(callableMemberDescriptor, "fakeOverride");
        OverridingUtil.r(callableMemberDescriptor, null);
        this.f17192i.add(callableMemberDescriptor);
    }
}
