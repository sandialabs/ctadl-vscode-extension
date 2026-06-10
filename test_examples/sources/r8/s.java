package r8;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes.dex */
public final class s extends u implements b9.u {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f17161a;

    /* renamed from: b  reason: collision with root package name */
    public final EmptyList f17162b = EmptyList.f12981i;

    public s(Class<?> cls) {
        this.f17161a = cls;
    }

    @Override // r8.u
    public final Type T() {
        return this.f17161a;
    }

    @Override // b9.u
    public final PrimitiveType b() {
        Class cls = Void.TYPE;
        Class<?> cls2 = this.f17161a;
        if (v7.g.a(cls2, cls)) {
            return null;
        }
        return JvmPrimitiveType.b(cls2.getName()).j();
    }

    @Override // b9.d
    public final Collection<b9.a> getAnnotations() {
        return this.f17162b;
    }

    @Override // b9.d
    public final void s() {
    }
}
