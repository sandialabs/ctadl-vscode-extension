package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import v7.g;
import x9.h;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13572a = a.f13573a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f13573a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final j0.c f13574b = new j0.c("PackageViewDescriptorFactory");
    }

    /* loaded from: classes.dex */
    public static final class b implements d {

        /* renamed from: b  reason: collision with root package name */
        public static final b f13575b = new b();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.d
        public final LazyPackageViewDescriptorImpl a(c cVar, h9.c cVar2, h hVar) {
            g.f(cVar, "module");
            g.f(cVar2, "fqName");
            g.f(hVar, "storageManager");
            return new LazyPackageViewDescriptorImpl(cVar, cVar2, hVar);
        }
    }

    LazyPackageViewDescriptorImpl a(c cVar, h9.c cVar2, h hVar);
}
