package o8;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* loaded from: classes.dex */
public final class r extends k9.g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Set f16463i;

    public r(LinkedHashSet linkedHashSet) {
        this.f16463i = linkedHashSet;
    }

    public static /* synthetic */ void M0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // k9.g
    public final void L0(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            M0(1);
            throw null;
        } else if (callableMemberDescriptor2 != null) {
        } else {
            M0(2);
            throw null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void q0(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            M0(0);
            throw null;
        }
        OverridingUtil.r(callableMemberDescriptor, null);
        this.f16463i.add(callableMemberDescriptor);
    }
}
