package o8;

import m8.e;

/* loaded from: classes.dex */
public abstract class a0 extends o implements l8.u {

    /* renamed from: m  reason: collision with root package name */
    public final h9.c f16379m;
    public final String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(l8.s sVar, h9.c cVar) {
        super(sVar, e.a.f16014a, cVar.g(), l8.d0.f15835a);
        v7.g.f(sVar, "module");
        v7.g.f(cVar, "fqName");
        this.f16379m = cVar;
        this.n = "package " + cVar + " of " + sVar;
    }

    @Override // o8.o, l8.f
    public final l8.s c() {
        l8.f c = super.c();
        v7.g.d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (l8.s) c;
    }

    @Override // l8.u
    public final h9.c e() {
        return this.f16379m;
    }

    @Override // o8.o, l8.i
    public l8.d0 j() {
        return l8.d0.f15835a;
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.a(this, d5);
    }

    @Override // o8.n
    public String toString() {
        return this.n;
    }
}
