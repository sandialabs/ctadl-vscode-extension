package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import c8.j;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import l8.h0;
import l8.z;
import m0.b;
import m7.n;
import n7.l;
import n7.m;
import r9.f;
import u9.g;
import v7.i;
import x9.c;
import x9.d;
import x9.e;

/* loaded from: classes.dex */
public abstract class DeserializedMemberScope extends f {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f14865f = {i.c(new PropertyReference1Impl(i.a(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), i.c(new PropertyReference1Impl(i.a(DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b  reason: collision with root package name */
    public final g f14866b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final e f14867d;

    /* renamed from: e  reason: collision with root package name */
    public final x9.f f14868e;

    /* loaded from: classes.dex */
    public final class OptimizedImplementation implements a {

        /* renamed from: j  reason: collision with root package name */
        public static final /* synthetic */ j<Object>[] f14869j = {i.c(new PropertyReference1Impl(i.a(OptimizedImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), i.c(new PropertyReference1Impl(i.a(OptimizedImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap f14870a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedHashMap f14871b;
        public final Map<h9.e, byte[]> c;

        /* renamed from: d  reason: collision with root package name */
        public final c<h9.e, Collection<kotlin.reflect.jvm.internal.impl.descriptors.g>> f14872d;

        /* renamed from: e  reason: collision with root package name */
        public final c<h9.e, Collection<z>> f14873e;

        /* renamed from: f  reason: collision with root package name */
        public final d<h9.e, h0> f14874f;

        /* renamed from: g  reason: collision with root package name */
        public final e f14875g;

        /* renamed from: h  reason: collision with root package name */
        public final e f14876h;

        public OptimizedImplementation(List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                h9.e r02 = b.r0(DeserializedMemberScope.this.f14866b.f17921b, ((ProtoBuf$Function) ((h) obj)).n);
                Object obj2 = linkedHashMap.get(r02);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(r02, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f14870a = h(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                h9.e r03 = b.r0(deserializedMemberScope.f14866b.f17921b, ((ProtoBuf$Property) ((h) obj3)).n);
                Object obj4 = linkedHashMap2.get(r03);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(r03, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f14871b = h(linkedHashMap2);
            DeserializedMemberScope.this.f14866b.f17920a.c.d();
            DeserializedMemberScope deserializedMemberScope2 = DeserializedMemberScope.this;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj5 : list3) {
                h9.e r04 = b.r0(deserializedMemberScope2.f14866b.f17921b, ((ProtoBuf$TypeAlias) ((h) obj5)).f14331m);
                Object obj6 = linkedHashMap3.get(r04);
                if (obj6 == null) {
                    obj6 = new ArrayList();
                    linkedHashMap3.put(r04, obj6);
                }
                ((List) obj6).add(obj5);
            }
            this.c = h(linkedHashMap3);
            this.f14872d = DeserializedMemberScope.this.f14866b.f17920a.f17901a.e(new DeserializedMemberScope$OptimizedImplementation$functions$1(this));
            this.f14873e = DeserializedMemberScope.this.f14866b.f17920a.f17901a.e(new DeserializedMemberScope$OptimizedImplementation$properties$1(this));
            this.f14874f = DeserializedMemberScope.this.f14866b.f17920a.f17901a.h(new DeserializedMemberScope$OptimizedImplementation$typeAliasByName$1(this));
            DeserializedMemberScope deserializedMemberScope3 = DeserializedMemberScope.this;
            this.f14875g = deserializedMemberScope3.f14866b.f17920a.f17901a.a(new DeserializedMemberScope$OptimizedImplementation$functionNames$2(this, deserializedMemberScope3));
            DeserializedMemberScope deserializedMemberScope4 = DeserializedMemberScope.this;
            this.f14876h = deserializedMemberScope4.f14866b.f17920a.f17901a.a(new DeserializedMemberScope$OptimizedImplementation$variableNames$2(this, deserializedMemberScope4));
        }

        public static LinkedHashMap h(LinkedHashMap linkedHashMap) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(b.O0(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<kotlin.reflect.jvm.internal.impl.protobuf.a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
                for (kotlin.reflect.jvm.internal.impl.protobuf.a aVar : iterable) {
                    int b5 = aVar.b();
                    int f10 = CodedOutputStream.f(b5) + b5;
                    if (f10 > 4096) {
                        f10 = 4096;
                    }
                    CodedOutputStream j2 = CodedOutputStream.j(byteArrayOutputStream, f10);
                    j2.v(b5);
                    aVar.f(j2);
                    j2.i();
                    arrayList.add(n.f16010a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public final Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
            v7.g.f(eVar, "name");
            if (!c().contains(eVar)) {
                return EmptyList.f12981i;
            }
            return (Collection) ((LockBasedStorageManager.k) this.f14872d).U(eVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public final Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
            v7.g.f(eVar, "name");
            if (!d().contains(eVar)) {
                return EmptyList.f12981i;
            }
            return (Collection) ((LockBasedStorageManager.k) this.f14873e).U(eVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public final Set<h9.e> c() {
            return (Set) b.u0(this.f14875g, f14869j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public final Set<h9.e> d() {
            return (Set) b.u0(this.f14876h, f14869j[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public final Set<h9.e> e() {
            return this.c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public final h0 f(h9.e eVar) {
            v7.g.f(eVar, "name");
            return this.f14874f.U(eVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public final void g(ArrayList arrayList, r9.c cVar, u7.l lVar) {
            NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
            v7.g.f(cVar, "kindFilter");
            v7.g.f(lVar, "nameFilter");
            boolean a10 = cVar.a(r9.c.f17179j);
            k9.f fVar = k9.f.f12941a;
            if (a10) {
                Set<h9.e> d5 = d();
                ArrayList arrayList2 = new ArrayList();
                for (h9.e eVar : d5) {
                    if (((Boolean) lVar.U(eVar)).booleanValue()) {
                        arrayList2.addAll(b(eVar, noLookupLocation));
                    }
                }
                m.d2(arrayList2, fVar);
                arrayList.addAll(arrayList2);
            }
            if (cVar.a(r9.c.f17178i)) {
                Set<h9.e> c = c();
                ArrayList arrayList3 = new ArrayList();
                for (h9.e eVar2 : c) {
                    if (((Boolean) lVar.U(eVar2)).booleanValue()) {
                        arrayList3.addAll(a(eVar2, noLookupLocation));
                    }
                }
                m.d2(arrayList3, fVar);
                arrayList.addAll(arrayList3);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        Collection a(h9.e eVar, NoLookupLocation noLookupLocation);

        Collection b(h9.e eVar, NoLookupLocation noLookupLocation);

        Set<h9.e> c();

        Set<h9.e> d();

        Set<h9.e> e();

        h0 f(h9.e eVar);

        void g(ArrayList arrayList, r9.c cVar, u7.l lVar);
    }

    public DeserializedMemberScope(g gVar, List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3, u7.a<? extends Collection<h9.e>> aVar) {
        v7.g.f(gVar, "c");
        v7.g.f(aVar, "classNames");
        this.f14866b = gVar;
        u9.e eVar = gVar.f17920a;
        eVar.c.a();
        this.c = new OptimizedImplementation(list, list2, list3);
        DeserializedMemberScope$classNames$2 deserializedMemberScope$classNames$2 = new DeserializedMemberScope$classNames$2(aVar);
        x9.h hVar = eVar.f17901a;
        this.f14867d = hVar.a(deserializedMemberScope$classNames$2);
        this.f14868e = hVar.g(new DeserializedMemberScope$classifierNamesLazy$2(this));
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        return this.c.a(eVar, noLookupLocation);
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        return this.c.b(eVar, noLookupLocation);
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> c() {
        return this.c.c();
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> d() {
        return this.c.d();
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    public l8.d e(h9.e eVar, NoLookupLocation noLookupLocation) {
        v7.g.f(eVar, "name");
        if (q(eVar)) {
            return this.f14866b.f17920a.b(l(eVar));
        }
        a aVar = this.c;
        if (aVar.e().contains(eVar)) {
            return aVar.f(eVar);
        }
        return null;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> g() {
        j<Object> jVar = f14865f[1];
        x9.f fVar = this.f14868e;
        v7.g.f(fVar, "<this>");
        v7.g.f(jVar, "p");
        return (Set) fVar.k0();
    }

    public abstract void h(ArrayList arrayList, u7.l lVar);

    public final List i(r9.c cVar, u7.l lVar) {
        v7.g.f(cVar, "kindFilter");
        v7.g.f(lVar, "nameFilter");
        ArrayList arrayList = new ArrayList(0);
        if (cVar.a(r9.c.f17175f)) {
            h(arrayList, lVar);
        }
        a aVar = this.c;
        aVar.g(arrayList, cVar, lVar);
        if (cVar.a(r9.c.f17181l)) {
            for (h9.e eVar : m()) {
                if (((Boolean) lVar.U(eVar)).booleanValue()) {
                    b.u(arrayList, this.f14866b.f17920a.b(l(eVar)));
                }
            }
        }
        if (cVar.a(r9.c.f17176g)) {
            for (h9.e eVar2 : aVar.e()) {
                if (((Boolean) lVar.U(eVar2)).booleanValue()) {
                    b.u(arrayList, aVar.f(eVar2));
                }
            }
        }
        return b.G(arrayList);
    }

    public void j(h9.e eVar, ArrayList arrayList) {
        v7.g.f(eVar, "name");
    }

    public void k(h9.e eVar, ArrayList arrayList) {
        v7.g.f(eVar, "name");
    }

    public abstract h9.b l(h9.e eVar);

    public final Set<h9.e> m() {
        return (Set) b.u0(this.f14867d, f14865f[0]);
    }

    public abstract Set<h9.e> n();

    public abstract Set<h9.e> o();

    public abstract Set<h9.e> p();

    public boolean q(h9.e eVar) {
        v7.g.f(eVar, "name");
        return m().contains(eVar);
    }

    public boolean r(w9.h hVar) {
        return true;
    }
}
