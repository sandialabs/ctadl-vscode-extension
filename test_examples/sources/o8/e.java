package o8;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes.dex */
public final class e implements y9.e0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractTypeAliasDescriptor f16416a;

    public e(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f16416a = abstractTypeAliasDescriptor;
    }

    @Override // y9.e0
    public final boolean a() {
        return true;
    }

    @Override // y9.e0
    public final l8.d c() {
        return this.f16416a;
    }

    @Override // y9.e0
    public final List<l8.i0> e() {
        List list = ((w9.i) this.f16416a).f18496y;
        if (list != null) {
            return list;
        }
        v7.g.l("typeConstructorParameters");
        throw null;
    }

    @Override // y9.e0
    public final Collection<y9.r> f() {
        Collection<y9.r> f10 = ((w9.i) this.f16416a).F().U0().f();
        v7.g.e(f10, "declarationDescriptor.un…pe.constructor.supertypes");
        return f10;
    }

    public final String toString() {
        return "[typealias " + this.f16416a.getName().b() + ']';
    }

    @Override // y9.e0
    public final kotlin.reflect.jvm.internal.impl.builtins.e u() {
        return DescriptorUtilsKt.e(this.f16416a);
    }
}
