package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import l8.k;
import l8.r;

/* loaded from: classes.dex */
public interface CallableMemberDescriptor extends a, r {

    /* loaded from: classes.dex */
    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, l8.f
    CallableMemberDescriptor a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    Collection<? extends CallableMemberDescriptor> f();

    Kind h();

    void s0(Collection<? extends CallableMemberDescriptor> collection);

    CallableMemberDescriptor y0(l8.f fVar, Modality modality, k kVar);
}
