package o9;

import fa.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class c extends b.a<CallableMemberDescriptor, CallableMemberDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<CallableMemberDescriptor> f16486a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l<CallableMemberDescriptor, Boolean> f16487b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Ref$ObjectRef<CallableMemberDescriptor> ref$ObjectRef, l<? super CallableMemberDescriptor, Boolean> lVar) {
        this.f16486a = ref$ObjectRef;
        this.f16487b = lVar;
    }

    @Override // fa.b.c
    public final Object a() {
        return this.f16486a.f13060i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, T, java.lang.Object] */
    @Override // fa.b.a, fa.b.c
    public final void b(Object obj) {
        ?? r3 = (CallableMemberDescriptor) obj;
        g.f(r3, "current");
        Ref$ObjectRef<CallableMemberDescriptor> ref$ObjectRef = this.f16486a;
        if (ref$ObjectRef.f13060i == null && ((Boolean) this.f16487b.U(r3)).booleanValue()) {
            ref$ObjectRef.f13060i = r3;
        }
    }

    @Override // fa.b.c
    public final boolean c(Object obj) {
        g.f((CallableMemberDescriptor) obj, "current");
        if (this.f16486a.f13060i == null) {
            return true;
        }
        return false;
    }
}
