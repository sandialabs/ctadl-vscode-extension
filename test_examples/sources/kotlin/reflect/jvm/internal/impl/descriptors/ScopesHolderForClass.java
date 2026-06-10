package kotlin.reflect.jvm.internal.impl.descriptors;

import c8.j;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import u7.l;

/* loaded from: classes.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* renamed from: a  reason: collision with root package name */
    public final l8.b f13459a;

    /* renamed from: b  reason: collision with root package name */
    public final l<kotlin.reflect.jvm.internal.impl.types.checker.e, T> f13460b;
    public final kotlin.reflect.jvm.internal.impl.types.checker.e c;

    /* renamed from: d  reason: collision with root package name */
    public final x9.e f13461d;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13458f = {v7.i.c(new PropertyReference1Impl(v7.i.a(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final a f13457e = new a();

    /* loaded from: classes.dex */
    public static final class a {
        public static ScopesHolderForClass a(l lVar, l8.b bVar, x9.h hVar, kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
            v7.g.f(bVar, "classDescriptor");
            v7.g.f(hVar, "storageManager");
            v7.g.f(eVar, "kotlinTypeRefinerForOwnerModule");
            return new ScopesHolderForClass(bVar, hVar, lVar, eVar);
        }
    }

    public ScopesHolderForClass(l8.b bVar, x9.h hVar, l lVar, kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        this.f13459a = bVar;
        this.f13460b = lVar;
        this.c = eVar;
        this.f13461d = hVar.a(new ScopesHolderForClass$scopeForOwnerModule$2(this));
    }

    public final T a(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        eVar.M0(DescriptorUtilsKt.j(this.f13459a));
        return (T) m0.b.u0(this.f13461d, f13458f[0]);
    }
}
