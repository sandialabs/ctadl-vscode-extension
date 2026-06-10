package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.datastore.preferences.PreferencesProto$Value;
import f9.c;
import f9.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.f;
import l8.c0;
import l8.d;
import l8.d0;
import l8.f;
import l8.g0;
import l8.i0;
import l8.j0;
import l8.k;
import l8.m;
import m8.e;
import n7.l;
import n7.n;
import o8.b;
import o8.f0;
import u9.g;
import u9.j;
import u9.p;
import u9.q;
import w9.h;
import x9.e;
import y9.e0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor extends b implements f {
    public final e<Collection<kotlin.reflect.jvm.internal.impl.descriptors.b>> A;
    public final x9.f<l8.b> B;
    public final e<Collection<l8.b>> C;
    public final x9.f<j0<v>> D;
    public final f.a E;
    public final m8.e F;

    /* renamed from: m  reason: collision with root package name */
    public final ProtoBuf$Class f14825m;
    public final f9.a n;

    /* renamed from: o  reason: collision with root package name */
    public final d0 f14826o;

    /* renamed from: p  reason: collision with root package name */
    public final h9.b f14827p;

    /* renamed from: q  reason: collision with root package name */
    public final Modality f14828q;

    /* renamed from: r  reason: collision with root package name */
    public final k f14829r;

    /* renamed from: s  reason: collision with root package name */
    public final ClassKind f14830s;

    /* renamed from: t  reason: collision with root package name */
    public final g f14831t;

    /* renamed from: u  reason: collision with root package name */
    public final r9.f f14832u;

    /* renamed from: v  reason: collision with root package name */
    public final DeserializedClassTypeConstructor f14833v;

    /* renamed from: w  reason: collision with root package name */
    public final ScopesHolderForClass<DeserializedClassMemberScope> f14834w;

    /* renamed from: x  reason: collision with root package name */
    public final EnumEntryClassDescriptors f14835x;

    /* renamed from: y  reason: collision with root package name */
    public final l8.f f14836y;

    /* renamed from: z  reason: collision with root package name */
    public final x9.f<kotlin.reflect.jvm.internal.impl.descriptors.b> f14837z;

    /* loaded from: classes.dex */
    public final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* renamed from: g  reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.types.checker.e f14838g;

        /* renamed from: h  reason: collision with root package name */
        public final e<Collection<l8.f>> f14839h;

        /* renamed from: i  reason: collision with root package name */
        public final e<Collection<r>> f14840i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ DeserializedClassDescriptor f14841j;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DeserializedClassMemberScope(DeserializedClassDescriptor deserializedClassDescriptor, kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
            super(r2, r3, r4, r5, new DeserializedClassDescriptor$DeserializedClassMemberScope$2$1(r1));
            v7.g.f(eVar, "kotlinTypeRefiner");
            this.f14841j = deserializedClassDescriptor;
            g gVar = deserializedClassDescriptor.f14831t;
            ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.f14825m;
            List<ProtoBuf$Function> list = protoBuf$Class.f14061y;
            v7.g.e(list, "classProto.functionList");
            List<ProtoBuf$Property> list2 = protoBuf$Class.f14062z;
            v7.g.e(list2, "classProto.propertyList");
            List<ProtoBuf$TypeAlias> list3 = protoBuf$Class.A;
            v7.g.e(list3, "classProto.typeAliasList");
            List<Integer> list4 = protoBuf$Class.f14055s;
            v7.g.e(list4, "classProto.nestedClassNameList");
            c cVar = deserializedClassDescriptor.f14831t.f17921b;
            ArrayList arrayList = new ArrayList(l.Z1(list4, 10));
            for (Number number : list4) {
                arrayList.add(m0.b.r0(cVar, number.intValue()));
            }
            this.f14838g = eVar;
            this.f14839h = this.f14866b.f17920a.f17901a.a(new DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1(this));
            this.f14840i = this.f14866b.f17920a.f17901a.a(new DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1(this));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
            v7.g.f(eVar, "name");
            s(eVar, noLookupLocation);
            return super.a(eVar, noLookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
            v7.g.f(eVar, "name");
            s(eVar, noLookupLocation);
            return super.b(eVar, noLookupLocation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public final d e(h9.e eVar, NoLookupLocation noLookupLocation) {
            l8.b U;
            v7.g.f(eVar, "name");
            s(eVar, noLookupLocation);
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.f14841j.f14835x;
            if (enumEntryClassDescriptors != null && (U = enumEntryClassDescriptors.f14848b.U(eVar)) != null) {
                return U;
            }
            return super.e(eVar, noLookupLocation);
        }

        @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public final Collection<l8.f> f(r9.c cVar, u7.l<? super h9.e, Boolean> lVar) {
            v7.g.f(cVar, "kindFilter");
            v7.g.f(lVar, "nameFilter");
            return this.f14839h.k0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void h(ArrayList arrayList, u7.l lVar) {
            ?? r1;
            v7.g.f(lVar, "nameFilter");
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.f14841j.f14835x;
            if (enumEntryClassDescriptors != null) {
                Set<h9.e> keySet = enumEntryClassDescriptors.f14847a.keySet();
                r1 = new ArrayList();
                for (h9.e eVar : keySet) {
                    v7.g.f(eVar, "name");
                    l8.b U = enumEntryClassDescriptors.f14848b.U(eVar);
                    if (U != null) {
                        r1.add(U);
                    }
                }
            } else {
                r1 = 0;
            }
            if (r1 == 0) {
                r1 = EmptyList.f12981i;
            }
            arrayList.addAll(r1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void j(h9.e eVar, ArrayList arrayList) {
            v7.g.f(eVar, "name");
            ArrayList arrayList2 = new ArrayList();
            for (r rVar : this.f14840i.k0()) {
                arrayList2.addAll(rVar.w().a(eVar, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            g gVar = this.f14866b;
            arrayList.addAll(gVar.f17920a.n.c(eVar, this.f14841j));
            gVar.f17920a.f17915q.a().h(eVar, arrayList2, new ArrayList(arrayList), this.f14841j, new a(arrayList));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void k(h9.e eVar, ArrayList arrayList) {
            v7.g.f(eVar, "name");
            ArrayList arrayList2 = new ArrayList();
            for (r rVar : this.f14840i.k0()) {
                arrayList2.addAll(rVar.w().b(eVar, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            this.f14866b.f17920a.f17915q.a().h(eVar, arrayList2, new ArrayList(arrayList), this.f14841j, new a(arrayList));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final h9.b l(h9.e eVar) {
            v7.g.f(eVar, "name");
            return this.f14841j.f14827p.d(eVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set<h9.e> n() {
            List<r> f10 = this.f14841j.f14833v.f();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (r rVar : f10) {
                Set<h9.e> g10 = rVar.w().g();
                if (g10 == null) {
                    return null;
                }
                n.f2(g10, linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set<h9.e> o() {
            DeserializedClassDescriptor deserializedClassDescriptor = this.f14841j;
            List<r> f10 = deserializedClassDescriptor.f14833v.f();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (r rVar : f10) {
                n.f2(rVar.w().c(), linkedHashSet);
            }
            linkedHashSet.addAll(this.f14866b.f17920a.n.b(deserializedClassDescriptor));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final Set<h9.e> p() {
            List<r> f10 = this.f14841j.f14833v.f();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (r rVar : f10) {
                n.f2(rVar.w().d(), linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final boolean r(h hVar) {
            return this.f14866b.f17920a.f17913o.d(this.f14841j, hVar);
        }

        public final void s(h9.e eVar, t8.a aVar) {
            v7.g.f(eVar, "name");
            s8.a.a(this.f14866b.f17920a.f17908i, (NoLookupLocation) aVar, this.f14841j, eVar);
        }
    }

    /* loaded from: classes.dex */
    public final class DeserializedClassTypeConstructor extends y9.b {
        public final e<List<i0>> c;

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.f14831t.f17920a.f17901a);
            this.c = DeserializedClassDescriptor.this.f14831t.f17920a.f17901a.a(new DeserializedClassDescriptor$DeserializedClassTypeConstructor$parameters$1(DeserializedClassDescriptor.this));
        }

        @Override // y9.e0
        public final boolean a() {
            return true;
        }

        @Override // y9.b, y9.e, y9.e0
        public final d c() {
            return DeserializedClassDescriptor.this;
        }

        @Override // y9.e0
        public final List<i0> e() {
            return this.c.k0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v16 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable] */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection<r> h() {
            String b5;
            h9.c b10;
            NotFoundClasses.b bVar;
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.f14825m;
            g gVar = deserializedClassDescriptor.f14831t;
            f9.g gVar2 = gVar.f17922d;
            v7.g.f(protoBuf$Class, "<this>");
            v7.g.f(gVar2, "typeTable");
            List<ProtoBuf$Type> list = protoBuf$Class.f14052p;
            ?? r42 = list.isEmpty() ^ true ? list : 0;
            if (r42 == 0) {
                List<Integer> list2 = protoBuf$Class.f14053q;
                v7.g.e(list2, "supertypeIdList");
                r42 = new ArrayList(l.Z1(list2, 10));
                for (Integer num : list2) {
                    v7.g.e(num, "it");
                    r42.add(gVar2.a(num.intValue()));
                }
            }
            ArrayList arrayList = new ArrayList(l.Z1(r42, 10));
            for (ProtoBuf$Type protoBuf$Type : r42) {
                arrayList.add(gVar.f17926h.g(protoBuf$Type));
            }
            ArrayList z22 = kotlin.collections.c.z2(gVar.f17920a.n.a(deserializedClassDescriptor), arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = z22.iterator();
            while (it.hasNext()) {
                d c = ((r) it.next()).U0().c();
                if (c instanceof NotFoundClasses.b) {
                    bVar = (NotFoundClasses.b) c;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                j jVar = gVar.f17920a.f17907h;
                ArrayList arrayList3 = new ArrayList(l.Z1(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    NotFoundClasses.b bVar2 = (NotFoundClasses.b) it2.next();
                    h9.b f10 = DescriptorUtilsKt.f(bVar2);
                    if (f10 != null && (b10 = f10.b()) != null) {
                        b5 = b10.b();
                    } else {
                        b5 = bVar2.getName().b();
                    }
                    arrayList3.add(b5);
                }
                jVar.b(deserializedClassDescriptor, arrayList3);
            }
            return kotlin.collections.c.L2(z22);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final g0 k() {
            return g0.a.f15837a;
        }

        @Override // y9.b
        public final l8.b p() {
            return DeserializedClassDescriptor.this;
        }

        public final String toString() {
            String str = DeserializedClassDescriptor.this.getName().f11572i;
            v7.g.e(str, "name.toString()");
            return str;
        }
    }

    /* loaded from: classes.dex */
    public final class EnumEntryClassDescriptors {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap f14847a;

        /* renamed from: b  reason: collision with root package name */
        public final x9.d<h9.e, l8.b> f14848b;
        public final e<Set<h9.e>> c;

        public EnumEntryClassDescriptors() {
            List<ProtoBuf$EnumEntry> list = DeserializedClassDescriptor.this.f14825m.B;
            v7.g.e(list, "classProto.enumEntryList");
            int O0 = m0.b.O0(l.Z1(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(O0 < 16 ? 16 : O0);
            for (Object obj : list) {
                linkedHashMap.put(m0.b.r0(DeserializedClassDescriptor.this.f14831t.f17921b, ((ProtoBuf$EnumEntry) obj).f14128l), obj);
            }
            this.f14847a = linkedHashMap;
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            this.f14848b = deserializedClassDescriptor.f14831t.f17920a.f17901a.h(new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1(this, deserializedClassDescriptor));
            this.c = DeserializedClassDescriptor.this.f14831t.f17920a.f17901a.a(new DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(g gVar, ProtoBuf$Class protoBuf$Class, c cVar, f9.a aVar, d0 d0Var) {
        super(gVar.f17920a.f17901a, m0.b.j0(cVar, protoBuf$Class.f14050m).j());
        int i10;
        r9.f fVar;
        EnumEntryClassDescriptors enumEntryClassDescriptors;
        DeserializedClassDescriptor deserializedClassDescriptor;
        m8.e jVar;
        v7.g.f(gVar, "outerContext");
        v7.g.f(protoBuf$Class, "classProto");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(aVar, "metadataVersion");
        v7.g.f(d0Var, "sourceElement");
        this.f14825m = protoBuf$Class;
        this.n = aVar;
        this.f14826o = d0Var;
        this.f14827p = m0.b.j0(cVar, protoBuf$Class.f14050m);
        this.f14828q = p.a((ProtoBuf$Modality) f9.b.f10980e.c(protoBuf$Class.f14049l));
        this.f14829r = q.a((ProtoBuf$Visibility) f9.b.f10979d.c(protoBuf$Class.f14049l));
        ProtoBuf$Class.Kind kind = (ProtoBuf$Class.Kind) f9.b.f10981f.c(protoBuf$Class.f14049l);
        if (kind == null) {
            i10 = -1;
        } else {
            i10 = p.a.f17939b[kind.ordinal()];
        }
        ClassKind classKind = ClassKind.f13431i;
        ClassKind classKind2 = ClassKind.f13433k;
        switch (i10) {
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                classKind = ClassKind.f13432j;
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                classKind = classKind2;
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                classKind = ClassKind.f13434l;
                break;
            case 5:
                classKind = ClassKind.f13435m;
                break;
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                classKind = ClassKind.n;
                break;
        }
        this.f14830s = classKind;
        List<ProtoBuf$TypeParameter> list = protoBuf$Class.f14051o;
        v7.g.e(list, "classProto.typeParameterList");
        ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Class.M;
        v7.g.e(protoBuf$TypeTable, "classProto.typeTable");
        f9.g gVar2 = new f9.g(protoBuf$TypeTable);
        f9.h hVar = f9.h.f11006b;
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = protoBuf$Class.O;
        v7.g.e(protoBuf$VersionRequirementTable, "classProto.versionRequirementTable");
        g a10 = gVar.a(this, list, cVar, gVar2, h.a.a(protoBuf$VersionRequirementTable), aVar);
        this.f14831t = a10;
        u9.e eVar = a10.f17920a;
        if (classKind == classKind2) {
            fVar = new StaticScopeForKotlinEnum(eVar.f17901a, this);
        } else {
            fVar = MemberScope.a.f14741b;
        }
        this.f14832u = fVar;
        this.f14833v = new DeserializedClassTypeConstructor();
        ScopesHolderForClass.a aVar2 = ScopesHolderForClass.f13457e;
        x9.h hVar2 = eVar.f17901a;
        kotlin.reflect.jvm.internal.impl.types.checker.e b5 = eVar.f17915q.b();
        DeserializedClassDescriptor$memberScopeHolder$1 deserializedClassDescriptor$memberScopeHolder$1 = new DeserializedClassDescriptor$memberScopeHolder$1(this);
        aVar2.getClass();
        this.f14834w = ScopesHolderForClass.a.a(deserializedClassDescriptor$memberScopeHolder$1, this, hVar2, b5);
        if (classKind == classKind2) {
            enumEntryClassDescriptors = new EnumEntryClassDescriptors();
        } else {
            enumEntryClassDescriptors = null;
        }
        this.f14835x = enumEntryClassDescriptors;
        l8.f fVar2 = gVar.c;
        this.f14836y = fVar2;
        DeserializedClassDescriptor$primaryConstructor$1 deserializedClassDescriptor$primaryConstructor$1 = new DeserializedClassDescriptor$primaryConstructor$1(this);
        x9.h hVar3 = eVar.f17901a;
        this.f14837z = hVar3.g(deserializedClassDescriptor$primaryConstructor$1);
        this.A = hVar3.a(new DeserializedClassDescriptor$constructors$1(this));
        this.B = hVar3.g(new DeserializedClassDescriptor$companionObjectDescriptor$1(this));
        this.C = hVar3.a(new DeserializedClassDescriptor$sealedSubclasses$1(this));
        this.D = hVar3.g(new DeserializedClassDescriptor$valueClassRepresentation$1(this));
        c cVar2 = a10.f17921b;
        f9.g gVar3 = a10.f17922d;
        if (fVar2 instanceof DeserializedClassDescriptor) {
            deserializedClassDescriptor = (DeserializedClassDescriptor) fVar2;
        } else {
            deserializedClassDescriptor = null;
        }
        this.E = new f.a(protoBuf$Class, cVar2, gVar3, d0Var, deserializedClassDescriptor != null ? deserializedClassDescriptor.E : null);
        if (!f9.b.c.c(protoBuf$Class.f14049l).booleanValue()) {
            jVar = e.a.f16014a;
        } else {
            jVar = new w9.j(hVar3, new DeserializedClassDescriptor$annotations$1(this));
        }
        this.F = jVar;
    }

    @Override // l8.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.b A0() {
        return this.f14837z.k0();
    }

    @Override // l8.b
    public final MemberScope B0() {
        return this.f14832u;
    }

    @Override // l8.r
    public final boolean D() {
        return a4.b.v(f9.b.f10984i, this.f14825m.f14049l, "IS_EXTERNAL_CLASS.get(classProto.flags)");
    }

    @Override // l8.b
    public final l8.b E0() {
        return this.B.k0();
    }

    @Override // l8.b
    public final boolean H() {
        if (f9.b.f10981f.c(this.f14825m.f14049l) == ProtoBuf$Class.Kind.n) {
            return true;
        }
        return false;
    }

    @Override // l8.b
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J() {
        return this.A.k0();
    }

    @Override // l8.r
    public final boolean L0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Iterable] */
    @Override // o8.b, l8.b
    public final List<c0> N0() {
        g gVar = this.f14831t;
        f9.g gVar2 = gVar.f17922d;
        ProtoBuf$Class protoBuf$Class = this.f14825m;
        v7.g.f(protoBuf$Class, "<this>");
        v7.g.f(gVar2, "typeTable");
        List<ProtoBuf$Type> list = protoBuf$Class.f14057u;
        ?? r3 = list.isEmpty() ^ true ? list : 0;
        if (r3 == 0) {
            List<Integer> list2 = protoBuf$Class.f14058v;
            v7.g.e(list2, "contextReceiverTypeIdList");
            r3 = new ArrayList(l.Z1(list2, 10));
            for (Integer num : list2) {
                v7.g.e(num, "it");
                r3.add(gVar2.a(num.intValue()));
            }
        }
        ArrayList arrayList = new ArrayList(l.Z1(r3, 10));
        for (ProtoBuf$Type protoBuf$Type : r3) {
            arrayList.add(new f0(R0(), new s9.b(this, gVar.f17926h.g(protoBuf$Type), null), e.a.f16014a));
        }
        return arrayList;
    }

    @Override // l8.b
    public final boolean Q0() {
        return a4.b.v(f9.b.f10983h, this.f14825m.f14049l, "IS_DATA.get(classProto.flags)");
    }

    public final DeserializedClassMemberScope S0() {
        return this.f14834w.a(this.f14831t.f17920a.f17915q.b());
    }

    @Override // l8.b
    public final boolean T() {
        return a4.b.v(f9.b.f10987l, this.f14825m.f14049l, "IS_FUN_INTERFACE.get(classProto.flags)");
    }

    @Override // l8.b, l8.g, l8.f
    public final l8.f c() {
        return this.f14836y;
    }

    @Override // o8.w
    public final MemberScope c0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        return this.f14834w.a(eVar);
    }

    @Override // l8.b
    public final Collection<l8.b> e0() {
        return this.C.k0();
    }

    @Override // l8.b, l8.j, l8.r
    public final m g() {
        return this.f14829r;
    }

    @Override // m8.a
    public final m8.e getAnnotations() {
        return this.F;
    }

    @Override // l8.b
    public final ClassKind h() {
        return this.f14830s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r0.f10975d <= 1) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // l8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i() {
        boolean z10;
        if (!a4.b.v(f9.b.f10986k, this.f14825m.f14049l, "IS_VALUE_CLASS.get(classProto.flags)")) {
            return false;
        }
        f9.a aVar = this.n;
        int i10 = aVar.f10974b;
        if (i10 >= 1) {
            if (i10 <= 1) {
                int i11 = aVar.c;
                if (i11 >= 4) {
                    if (i11 > 4) {
                    }
                }
            }
            z10 = false;
            if (z10) {
                return false;
            }
            return true;
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // l8.b
    public final boolean i0() {
        if (a4.b.v(f9.b.f10986k, this.f14825m.f14049l, "IS_VALUE_CLASS.get(classProto.flags)") && this.n.a(1, 4, 2)) {
            return true;
        }
        return false;
    }

    @Override // l8.i
    public final d0 j() {
        return this.f14826o;
    }

    @Override // l8.r
    public final boolean l0() {
        return a4.b.v(f9.b.f10985j, this.f14825m.f14049l, "IS_EXPECT_CLASS.get(classProto.flags)");
    }

    @Override // l8.e
    public final boolean m0() {
        return a4.b.v(f9.b.f10982g, this.f14825m.f14049l, "IS_INNER.get(classProto.flags)");
    }

    @Override // l8.d
    public final e0 o() {
        return this.f14833v;
    }

    @Override // l8.b, l8.r
    public final Modality p() {
        return this.f14828q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(l0() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // l8.b, l8.e
    public final List<i0> x() {
        return this.f14831t.f17926h.b();
    }

    @Override // l8.b
    public final j0<v> x0() {
        return this.D.k0();
    }
}
