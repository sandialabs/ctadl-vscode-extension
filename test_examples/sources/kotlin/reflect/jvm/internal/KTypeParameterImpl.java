package kotlin.reflect.jvm.internal;

import c8.k;
import c8.l;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import l8.i0;
import m7.n;

/* loaded from: classes.dex */
public final class KTypeParameterImpl implements l, f8.e {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ c8.j<Object>[] f13227l = {v7.i.c(new PropertyReference1Impl(v7.i.a(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: i  reason: collision with root package name */
    public final i0 f13228i;

    /* renamed from: j  reason: collision with root package name */
    public final g.a f13229j;

    /* renamed from: k  reason: collision with root package name */
    public final f8.g f13230k;

    public KTypeParameterImpl(f8.g gVar, i0 i0Var) {
        w9.e eVar;
        kotlin.reflect.jvm.internal.impl.load.kotlin.h hVar;
        Class<?> cls;
        KClassImpl kClassImpl;
        Object n02;
        v7.g.f(i0Var, "descriptor");
        this.f13228i = i0Var;
        this.f13229j = g.c(new KTypeParameterImpl$upperBounds$2(this));
        if (gVar == null) {
            l8.f c = i0Var.c();
            v7.g.e(c, "descriptor.containingDeclaration");
            if (c instanceof l8.b) {
                n02 = e((l8.b) c);
            } else if (c instanceof CallableMemberDescriptor) {
                l8.f c10 = ((CallableMemberDescriptor) c).c();
                v7.g.e(c10, "declaration.containingDeclaration");
                if (c10 instanceof l8.b) {
                    kClassImpl = e((l8.b) c10);
                } else {
                    kotlin.reflect.jvm.internal.impl.load.kotlin.h hVar2 = null;
                    if (c instanceof w9.e) {
                        eVar = (w9.e) c;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        w9.d B = eVar.B();
                        d9.c cVar = (d9.c) (B instanceof d9.c ? B : null);
                        if (cVar != null) {
                            hVar = cVar.f10448d;
                        } else {
                            hVar = null;
                        }
                        if (hVar instanceof q8.e) {
                            hVar2 = hVar;
                        }
                        q8.e eVar2 = (q8.e) hVar2;
                        if (eVar2 != null && (cls = eVar2.f16950a) != null) {
                            c8.b a10 = v7.i.a(cls);
                            v7.g.d(a10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                            kClassImpl = (KClassImpl) a10;
                        } else {
                            throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + eVar);
                        }
                    } else {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + c);
                    }
                }
                n02 = c.n0(new f8.c(kClassImpl), n.f16010a);
            } else {
                throw new KotlinReflectionInternalError("Unknown type parameter container: " + c);
            }
            v7.g.e(n02, "when (val declaration = … $declaration\")\n        }");
            gVar = (f8.g) n02;
        }
        this.f13230k = gVar;
    }

    public static KClassImpl e(l8.b bVar) {
        c8.b bVar2;
        Class<?> j2 = f8.i.j(bVar);
        if (j2 != null) {
            bVar2 = v7.i.a(j2);
        } else {
            bVar2 = null;
        }
        KClassImpl kClassImpl = (KClassImpl) bVar2;
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + bVar.c());
    }

    @Override // f8.e
    public final l8.d a() {
        return this.f13228i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KTypeParameterImpl) {
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) obj;
            if (v7.g.a(this.f13230k, kTypeParameterImpl.f13230k) && v7.g.a(getName(), kTypeParameterImpl.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.l
    public final String getName() {
        String b5 = this.f13228i.getName().b();
        v7.g.e(b5, "descriptor.name.asString()");
        return b5;
    }

    @Override // c8.l
    public final List<k> getUpperBounds() {
        c8.j<Object> jVar = f13227l[0];
        Object k02 = this.f13229j.k0();
        v7.g.e(k02, "<get-upperBounds>(...)");
        return (List) k02;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.f13230k.hashCode() * 31);
    }

    @Override // c8.l
    public final KVariance t() {
        int ordinal = this.f13228i.t().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return KVariance.OUT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return KVariance.IN;
        }
        return KVariance.INVARIANT;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int ordinal = t().ordinal();
        if (ordinal == 1) {
            str = "in ";
        } else if (ordinal != 2) {
            sb.append(getName());
            String sb2 = sb.toString();
            v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        } else {
            str = "out ";
        }
        sb.append(str);
        sb.append(getName());
        String sb22 = sb.toString();
        v7.g.e(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }
}
