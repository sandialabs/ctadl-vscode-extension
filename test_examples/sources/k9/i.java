package k9;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes.dex */
public final class i implements u7.l<CallableMemberDescriptor, Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ l8.b f12942i;

    public i(l8.b bVar) {
        this.f12942i = bVar;
    }

    @Override // u7.l
    public final Boolean U(CallableMemberDescriptor callableMemberDescriptor) {
        boolean z10;
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        boolean z11 = false;
        if (!l8.l.e(callableMemberDescriptor2.g())) {
            l8.b bVar = this.f12942i;
            if (bVar != null) {
                if (l8.l.c(l8.l.n, callableMemberDescriptor2, bVar) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            } else {
                l8.l.a(3);
                throw null;
            }
        }
        return Boolean.valueOf(z11);
    }
}
