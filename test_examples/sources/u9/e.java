package u9;

import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import l8.u;
import l8.v;
import n8.a;
import n8.c;
import n8.e;
import t8.b;
import u9.d;
import u9.f;
import u9.n;
import y9.d0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final x9.h f17901a;

    /* renamed from: b  reason: collision with root package name */
    public final l8.s f17902b;
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    public final c f17903d;

    /* renamed from: e  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.b<m8.c, m9.g<?>> f17904e;

    /* renamed from: f  reason: collision with root package name */
    public final v f17905f;

    /* renamed from: g  reason: collision with root package name */
    public final n f17906g;

    /* renamed from: h  reason: collision with root package name */
    public final j f17907h;

    /* renamed from: i  reason: collision with root package name */
    public final t8.b f17908i;

    /* renamed from: j  reason: collision with root package name */
    public final k f17909j;

    /* renamed from: k  reason: collision with root package name */
    public final Iterable<n8.b> f17910k;

    /* renamed from: l  reason: collision with root package name */
    public final NotFoundClasses f17911l;

    /* renamed from: m  reason: collision with root package name */
    public final d f17912m;
    public final n8.a n;

    /* renamed from: o  reason: collision with root package name */
    public final n8.c f17913o;

    /* renamed from: p  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.protobuf.d f17914p;

    /* renamed from: q  reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.types.checker.f f17915q;

    /* renamed from: r  reason: collision with root package name */
    public final n8.e f17916r;

    /* renamed from: s  reason: collision with root package name */
    public final List<d0> f17917s;

    /* renamed from: t  reason: collision with root package name */
    public final ClassDeserializer f17918t;

    public e(x9.h hVar, l8.s sVar, c cVar, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b bVar, v vVar, j jVar, k kVar, Iterable iterable, NotFoundClasses notFoundClasses, n8.a aVar, n8.c cVar2, kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, q9.b bVar2, List list, int i10) {
        kotlin.reflect.jvm.internal.impl.types.checker.g gVar2;
        f.a aVar2 = f.a.f17919a;
        n.a aVar3 = n.a.f17934a;
        b.a aVar4 = b.a.f17696a;
        d.a.C0231a c0231a = d.a.f17900a;
        n8.a aVar5 = (i10 & 8192) != 0 ? a.C0194a.f16134a : aVar;
        n8.c cVar3 = (i10 & 16384) != 0 ? c.a.f16135a : cVar2;
        if ((65536 & i10) != 0) {
            kotlin.reflect.jvm.internal.impl.types.checker.f.f14999b.getClass();
            gVar2 = f.a.f15001b;
        } else {
            gVar2 = gVar;
        }
        e.a aVar6 = (262144 & i10) != 0 ? e.a.f16138a : null;
        List N0 = (i10 & 524288) != 0 ? a1.c.N0(kotlin.reflect.jvm.internal.impl.types.e.f15007a) : list;
        v7.g.f(hVar, "storageManager");
        v7.g.f(sVar, "moduleDescriptor");
        v7.g.f(vVar, "packageFragmentProvider");
        v7.g.f(iterable, "fictitiousClassDescriptorFactories");
        v7.g.f(aVar5, "additionalClassPartsProvider");
        v7.g.f(cVar3, "platformDependentDeclarationFilter");
        v7.g.f(dVar, "extensionRegistryLite");
        v7.g.f(gVar2, "kotlinTypeChecker");
        v7.g.f(aVar6, "platformDependentTypeTransformer");
        v7.g.f(N0, "typeAttributeTranslators");
        this.f17901a = hVar;
        this.f17902b = sVar;
        this.c = aVar2;
        this.f17903d = cVar;
        this.f17904e = bVar;
        this.f17905f = vVar;
        this.f17906g = aVar3;
        this.f17907h = jVar;
        this.f17908i = aVar4;
        this.f17909j = kVar;
        this.f17910k = iterable;
        this.f17911l = notFoundClasses;
        this.f17912m = c0231a;
        this.n = aVar5;
        this.f17913o = cVar3;
        this.f17914p = dVar;
        this.f17915q = gVar2;
        this.f17916r = aVar6;
        this.f17917s = N0;
        this.f17918t = new ClassDeserializer(this);
    }

    public final g a(u uVar, f9.c cVar, f9.g gVar, f9.h hVar, f9.a aVar, w9.d dVar) {
        v7.g.f(uVar, "descriptor");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(hVar, "versionRequirementTable");
        v7.g.f(aVar, "metadataVersion");
        return new g(this, cVar, uVar, gVar, hVar, aVar, dVar, null, EmptyList.f12981i);
    }

    public final l8.b b(h9.b bVar) {
        v7.g.f(bVar, "classId");
        Set<h9.b> set = ClassDeserializer.c;
        return this.f17918t.a(bVar, null);
    }
}
