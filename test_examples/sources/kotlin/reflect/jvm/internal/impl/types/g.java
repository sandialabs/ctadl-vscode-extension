package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import y9.n0;

/* loaded from: classes.dex */
public final class g extends n0 {

    /* renamed from: j  reason: collision with root package name */
    public final x9.h f15032j;

    /* renamed from: k  reason: collision with root package name */
    public final u7.a<y9.r> f15033k;

    /* renamed from: l  reason: collision with root package name */
    public final x9.e<y9.r> f15034l;

    /* JADX WARN: Multi-variable type inference failed */
    public g(x9.h hVar, u7.a<? extends y9.r> aVar) {
        v7.g.f(hVar, "storageManager");
        this.f15032j = hVar;
        this.f15033k = aVar;
        this.f15034l = hVar.a(aVar);
    }

    @Override // y9.r
    public final y9.r W0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        return new g(this.f15032j, new LazyWrappedType$refine$1(eVar, this));
    }

    @Override // y9.n0
    public final y9.r Y0() {
        return this.f15034l.k0();
    }

    @Override // y9.n0
    public final boolean Z0() {
        return ((LockBasedStorageManager.f) this.f15034l).b();
    }
}
