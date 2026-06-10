package kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.z;

/* loaded from: classes.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* renamed from: j  reason: collision with root package name */
    public final Class<?> f13168j;

    /* renamed from: k  reason: collision with root package name */
    public final g.b<Data> f13169k;

    /* loaded from: classes.dex */
    public final class Data extends KDeclarationContainerImpl.Data {

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ c8.j<Object>[] f13170g = {v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "metadata", "getMetadata()Lkotlin/Triple;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Data.class), "members", "getMembers()Ljava/util/Collection;"))};
        public final g.a c;

        /* renamed from: d  reason: collision with root package name */
        public final g.a f13171d;

        /* renamed from: e  reason: collision with root package name */
        public final g.b f13172e;

        /* renamed from: f  reason: collision with root package name */
        public final g.b f13173f;

        public Data(KPackageImpl kPackageImpl) {
            super(kPackageImpl);
            this.c = g.c(new KPackageImpl$Data$kotlinClass$2(kPackageImpl));
            this.f13171d = g.c(new KPackageImpl$Data$scope$2(this));
            this.f13172e = new g.b(new KPackageImpl$Data$multifileFacade$2(this, kPackageImpl));
            this.f13173f = new g.b(new KPackageImpl$Data$metadata$2(this));
            g.c(new KPackageImpl$Data$members$2(this, kPackageImpl));
        }

        public static final q8.e a(Data data) {
            data.getClass();
            c8.j<Object> jVar = f13170g[0];
            return (q8.e) data.c.k0();
        }
    }

    public KPackageImpl(Class<?> cls) {
        v7.g.f(cls, "jClass");
        this.f13168j = cls;
        this.f13169k = g.b(new KPackageImpl$data$1(this));
    }

    @Override // v7.b
    public final Class<?> e() {
        return this.f13168j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KPackageImpl) {
            if (v7.g.a(this.f13168j, ((KPackageImpl) obj).f13168j)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> h() {
        return EmptyList.f12981i;
    }

    public final int hashCode() {
        return this.f13168j.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> i(h9.e eVar) {
        Data k02 = this.f13169k.k0();
        k02.getClass();
        c8.j<Object> jVar = Data.f13170g[1];
        Object k03 = k02.f13171d.k0();
        v7.g.e(k03, "<get-scope>(...)");
        return ((MemberScope) k03).a(eVar, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final z j(int i10) {
        Data k02 = this.f13169k.k0();
        k02.getClass();
        c8.j<Object> jVar = Data.f13170g[3];
        Triple triple = (Triple) k02.f13173f.k0();
        if (triple != null) {
            g9.f fVar = (g9.f) triple.f12972i;
            ProtoBuf$Package protoBuf$Package = (ProtoBuf$Package) triple.f12973j;
            g9.e eVar = (g9.e) triple.f12974k;
            GeneratedMessageLite.d<ProtoBuf$Package, List<ProtoBuf$Property>> dVar = JvmProtoBuf.n;
            v7.g.e(dVar, "packageLocalVariable");
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) f9.e.b(protoBuf$Package, dVar, i10);
            if (protoBuf$Property != null) {
                Class<?> cls = this.f13168j;
                ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Package.f14196o;
                v7.g.e(protoBuf$TypeTable, "packageProto.typeTable");
                return (z) f8.i.f(cls, protoBuf$Property, fVar, new f9.g(protoBuf$TypeTable), eVar, KPackageImpl$getLocalProperty$1$1$1.f13182r);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Class<?> l() {
        Data k02 = this.f13169k.k0();
        k02.getClass();
        c8.j<Object> jVar = Data.f13170g[2];
        Class<?> cls = (Class) k02.f13172e.k0();
        if (cls == null) {
            return this.f13168j;
        }
        return cls;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection<z> m(h9.e eVar) {
        Data k02 = this.f13169k.k0();
        k02.getClass();
        c8.j<Object> jVar = Data.f13170g[1];
        Object k03 = k02.f13171d.k0();
        v7.g.e(k03, "<get-scope>(...)");
        return ((MemberScope) k03).b(eVar, NoLookupLocation.FROM_REFLECTION);
    }

    public final String toString() {
        return "file class " + ReflectClassUtilKt.a(this.f13168j).b();
    }
}
