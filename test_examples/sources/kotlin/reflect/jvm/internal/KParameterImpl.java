package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import l8.y;
import l8.z;

/* loaded from: classes.dex */
public final class KParameterImpl implements KParameter {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ c8.j<Object>[] f13183e = {v7.i.c(new PropertyReference1Impl(v7.i.a(KParameterImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), v7.i.c(new PropertyReference1Impl(v7.i.a(KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a  reason: collision with root package name */
    public final KCallableImpl<?> f13184a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13185b;
    public final KParameter.Kind c;

    /* renamed from: d  reason: collision with root package name */
    public final g.a f13186d;

    public KParameterImpl(KCallableImpl<?> kCallableImpl, int i10, KParameter.Kind kind, u7.a<? extends y> aVar) {
        v7.g.f(kCallableImpl, "callable");
        this.f13184a = kCallableImpl;
        this.f13185b = i10;
        this.c = kind;
        this.f13186d = g.c(aVar);
        g.c(new KParameterImpl$annotations$2(this));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KParameterImpl) {
            KParameterImpl kParameterImpl = (KParameterImpl) obj;
            if (v7.g.a(this.f13184a, kParameterImpl.f13184a)) {
                if (this.f13185b == kParameterImpl.f13185b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    public final String getName() {
        kotlin.reflect.jvm.internal.impl.descriptors.h hVar;
        c8.j<Object> jVar = f13183e[0];
        Object k02 = this.f13186d.k0();
        v7.g.e(k02, "<get-descriptor>(...)");
        y yVar = (y) k02;
        if (yVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) {
            hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) yVar;
        } else {
            hVar = null;
        }
        if (hVar == null || hVar.c().Z()) {
            return null;
        }
        h9.e name = hVar.getName();
        v7.g.e(name, "valueParameter.name");
        if (name.f11573j) {
            return null;
        }
        return name.b();
    }

    public final int hashCode() {
        return (this.f13184a.hashCode() * 31) + this.f13185b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        CallableMemberDescriptor d5;
        String b5;
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f13232a;
        StringBuilder sb = new StringBuilder();
        int ordinal = this.c.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    str = "parameter #" + this.f13185b + ' ' + getName();
                } else {
                    sb.append(" of ");
                    d5 = this.f13184a.d();
                    if (!(d5 instanceof z)) {
                        b5 = ReflectionObjectRenderer.c((z) d5);
                    } else if (d5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                        b5 = ReflectionObjectRenderer.b((kotlin.reflect.jvm.internal.impl.descriptors.e) d5);
                    } else {
                        throw new IllegalStateException(("Illegal callable: " + d5).toString());
                    }
                    sb.append(b5);
                    String sb2 = sb.toString();
                    v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
                    return sb2;
                }
            } else {
                str = "extension receiver parameter";
            }
        } else {
            str = "instance parameter";
        }
        sb.append(str);
        sb.append(" of ");
        d5 = this.f13184a.d();
        if (!(d5 instanceof z)) {
        }
        sb.append(b5);
        String sb22 = sb.toString();
        v7.g.e(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }
}
