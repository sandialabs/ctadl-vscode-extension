package v8;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import m7.n;
import u7.l;
import u9.j;

/* loaded from: classes.dex */
public final class a extends k9.g {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ j f18171i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Set f18172j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f18173k;

    /* renamed from: v8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0232a implements l<CallableMemberDescriptor, n> {
        public C0232a() {
        }

        @Override // u7.l
        public final n U(CallableMemberDescriptor callableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
            if (callableMemberDescriptor2 != null) {
                a.this.f18171i.g(callableMemberDescriptor2);
                return n.f16010a;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
        }
    }

    public a(j jVar, LinkedHashSet linkedHashSet, boolean z10) {
        this.f18171i = jVar;
        this.f18172j = linkedHashSet;
        this.f18173k = z10;
    }

    public static /* synthetic */ void M0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i10 == 3) {
            objArr[0] = "member";
        } else if (i10 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else if (i10 == 3 || i10 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void I0(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection) {
        if (callableMemberDescriptor != null) {
            if (this.f18173k && callableMemberDescriptor.h() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                return;
            }
            callableMemberDescriptor.s0(collection);
            return;
        }
        M0(3);
        throw null;
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
        OverridingUtil.r(callableMemberDescriptor, new C0232a());
        this.f18172j.add(callableMemberDescriptor);
    }
}
