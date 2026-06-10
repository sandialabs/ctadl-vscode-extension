package o9;

import fa.b;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes.dex */
public final class b implements b.InterfaceC0118b {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16485b;

    public b(boolean z10) {
        this.f16485b = z10;
    }

    @Override // fa.b.InterfaceC0118b
    public final Iterable c(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        Collection<? extends CallableMemberDescriptor> collection = null;
        if (this.f16485b) {
            if (callableMemberDescriptor != null) {
                callableMemberDescriptor = callableMemberDescriptor.a();
            } else {
                callableMemberDescriptor = null;
            }
        }
        if (callableMemberDescriptor != null) {
            collection = callableMemberDescriptor.f();
        }
        if (collection == null) {
            return EmptyList.f12981i;
        }
        return collection;
    }
}
