package kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import l8.z;
import v7.l;

/* loaded from: classes.dex */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements c8.b<T>, f8.e, f8.g {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f13103l = 0;

    /* renamed from: j  reason: collision with root package name */
    public final Class<T> f13104j;

    /* renamed from: k  reason: collision with root package name */
    public final g.b<KClassImpl<T>.Data> f13105k;

    /* loaded from: classes.dex */
    public final class Data extends KDeclarationContainerImpl.Data {

        /* renamed from: l  reason: collision with root package name */
        public static final /* synthetic */ c8.j<Object>[] f13106l = {v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "annotations", "getAnnotations()Ljava/util/List;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        public final g.a c;

        /* renamed from: d  reason: collision with root package name */
        public final g.a f13107d;

        /* renamed from: e  reason: collision with root package name */
        public final g.a f13108e;

        /* renamed from: f  reason: collision with root package name */
        public final g.a f13109f;

        /* renamed from: g  reason: collision with root package name */
        public final g.a f13110g;

        /* renamed from: h  reason: collision with root package name */
        public final g.a f13111h;

        /* renamed from: i  reason: collision with root package name */
        public final g.a f13112i;

        /* renamed from: j  reason: collision with root package name */
        public final g.a f13113j;

        /* renamed from: k  reason: collision with root package name */
        public final g.a f13114k;

        public Data(KClassImpl kClassImpl) {
            super(kClassImpl);
            this.c = g.c(new KClassImpl$Data$descriptor$2(kClassImpl));
            g.c(new KClassImpl$Data$annotations$2(this));
            this.f13107d = g.c(new KClassImpl$Data$simpleName$2(this, kClassImpl));
            this.f13108e = g.c(new KClassImpl$Data$qualifiedName$2(kClassImpl));
            g.c(new KClassImpl$Data$constructors$2(kClassImpl));
            g.c(new KClassImpl$Data$nestedClasses$2(this));
            g.c(new KClassImpl$Data$typeParameters$2(this, kClassImpl));
            g.c(new KClassImpl$Data$supertypes$2(this, kClassImpl));
            g.c(new KClassImpl$Data$sealedSubclasses$2(this));
            this.f13109f = g.c(new KClassImpl$Data$declaredNonStaticMembers$2(kClassImpl));
            this.f13110g = g.c(new KClassImpl$Data$declaredStaticMembers$2(kClassImpl));
            this.f13111h = g.c(new KClassImpl$Data$inheritedNonStaticMembers$2(kClassImpl));
            this.f13112i = g.c(new KClassImpl$Data$inheritedStaticMembers$2(kClassImpl));
            this.f13113j = g.c(new KClassImpl$Data$allNonStaticMembers$2(this));
            this.f13114k = g.c(new KClassImpl$Data$allStaticMembers$2(this));
            g.c(new KClassImpl$Data$declaredMembers$2(this));
            g.c(new KClassImpl$Data$allMembers$2(this));
        }

        public final l8.b a() {
            c8.j<Object> jVar = f13106l[0];
            Object k02 = this.c.k0();
            v7.g.e(k02, "<get-descriptor>(...)");
            return (l8.b) k02;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13139a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                LinkedHashMap linkedHashMap = KotlinClassHeader.Kind.f13959j;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LinkedHashMap linkedHashMap2 = KotlinClassHeader.Kind.f13959j;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LinkedHashMap linkedHashMap3 = KotlinClassHeader.Kind.f13959j;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LinkedHashMap linkedHashMap4 = KotlinClassHeader.Kind.f13959j;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LinkedHashMap linkedHashMap5 = KotlinClassHeader.Kind.f13959j;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LinkedHashMap linkedHashMap6 = KotlinClassHeader.Kind.f13959j;
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f13139a = iArr;
        }
    }

    public KClassImpl(Class<T> cls) {
        v7.g.f(cls, "jClass");
        this.f13104j = cls;
        this.f13105k = g.b(new KClassImpl$data$1(this));
    }

    @Override // c8.b
    public final String b() {
        KClassImpl<T>.Data k02 = this.f13105k.k0();
        k02.getClass();
        c8.j<Object> jVar = Data.f13106l[3];
        return (String) k02.f13108e.k0();
    }

    @Override // c8.b
    public final boolean c(Object obj) {
        List<c8.b<? extends Object>> list = ReflectClassUtilKt.f13582a;
        Class<T> cls = this.f13104j;
        v7.g.f(cls, "<this>");
        Integer num = ReflectClassUtilKt.f13584d.get(cls);
        if (num != null) {
            return l.e(num.intValue(), obj);
        }
        Class<? extends Object> cls2 = ReflectClassUtilKt.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // c8.b
    public final String d() {
        KClassImpl<T>.Data k02 = this.f13105k.k0();
        k02.getClass();
        c8.j<Object> jVar = Data.f13106l[2];
        return (String) k02.f13107d.k0();
    }

    @Override // v7.b
    public final Class<T> e() {
        return this.f13104j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof KClassImpl) && v7.g.a(a1.c.z0(this), a1.c.z0((c8.b) obj));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> h() {
        l8.b a10 = a();
        if (a10.h() != ClassKind.f13432j && a10.h() != ClassKind.n) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J = a10.J();
            v7.g.e(J, "descriptor.constructors");
            return J;
        }
        return EmptyList.f12981i;
    }

    @Override // c8.b
    public final int hashCode() {
        return a1.c.z0(this).hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> i(h9.e eVar) {
        MemberScope u10 = u();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return kotlin.collections.c.z2(v().a(eVar, noLookupLocation), u10.a(eVar, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final z j(int i10) {
        DeserializedClassDescriptor deserializedClassDescriptor;
        Class<?> declaringClass;
        Class<T> cls = this.f13104j;
        if (v7.g.a(cls.getSimpleName(), "DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            c8.b a10 = v7.i.a(declaringClass);
            v7.g.d(a10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) a10).j(i10);
        }
        l8.b a11 = a();
        if (a11 instanceof DeserializedClassDescriptor) {
            deserializedClassDescriptor = (DeserializedClassDescriptor) a11;
        } else {
            deserializedClassDescriptor = null;
        }
        if (deserializedClassDescriptor == null) {
            return null;
        }
        GeneratedMessageLite.d<ProtoBuf$Class, List<ProtoBuf$Property>> dVar = JvmProtoBuf.f14443j;
        v7.g.e(dVar, "classLocalVariable");
        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) f9.e.b(deserializedClassDescriptor.f14825m, dVar, i10);
        if (protoBuf$Property == null) {
            return null;
        }
        Class<T> cls2 = this.f13104j;
        u9.g gVar = deserializedClassDescriptor.f14831t;
        return (z) f8.i.f(cls2, protoBuf$Property, gVar.f17921b, gVar.f17922d, deserializedClassDescriptor.n, KClassImpl$getLocalProperty$2$1$1.f13141r);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection<z> m(h9.e eVar) {
        MemberScope u10 = u();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return kotlin.collections.c.z2(v().b(eVar, noLookupLocation), u10.b(eVar, noLookupLocation));
    }

    public final h9.b r() {
        h9.b bVar = i.f13291a;
        Class<T> cls = this.f13104j;
        v7.g.f(cls, "klass");
        PrimitiveType primitiveType = null;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            v7.g.e(componentType, "klass.componentType");
            if (componentType.isPrimitive()) {
                primitiveType = JvmPrimitiveType.b(componentType.getSimpleName()).j();
            }
            if (primitiveType != null) {
                return new h9.b(kotlin.reflect.jvm.internal.impl.builtins.g.f13354k, primitiveType.f13306j);
            }
            return h9.b.l(g.a.f13365g.h());
        } else if (v7.g.a(cls, Void.TYPE)) {
            return i.f13291a;
        } else {
            if (cls.isPrimitive()) {
                primitiveType = JvmPrimitiveType.b(cls.getSimpleName()).j();
            }
            if (primitiveType != null) {
                return new h9.b(kotlin.reflect.jvm.internal.impl.builtins.g.f13354k, primitiveType.f13305i);
            }
            h9.b a10 = ReflectClassUtilKt.a(cls);
            if (!a10.c) {
                String str = k8.c.f12921a;
                h9.c b5 = a10.b();
                v7.g.e(b5, "classId.asSingleFqName()");
                h9.b f10 = k8.c.f(b5);
                if (f10 != null) {
                    return f10;
                }
                return a10;
            }
            return a10;
        }
    }

    @Override // f8.e
    /* renamed from: s */
    public final l8.b a() {
        return this.f13105k.k0().a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        h9.b r3 = r();
        h9.c h10 = r3.h();
        v7.g.e(h10, "classId.packageFqName");
        String concat = h10.d() ? "" : h10.b().concat(".");
        String V0 = ha.i.V0(r3.i().b(), '.', '$');
        sb.append(concat + V0);
        return sb.toString();
    }

    public final MemberScope u() {
        return a().r().w();
    }

    public final MemberScope v() {
        MemberScope B0 = a().B0();
        v7.g.e(B0, "descriptor.staticScope");
        return B0;
    }
}
