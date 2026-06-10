package wa;

import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.internal.WriteMode;
import sa.h;

/* loaded from: classes.dex */
public final class s extends androidx.datastore.preferences.protobuf.k implements va.i {

    /* renamed from: i  reason: collision with root package name */
    public final f f18532i;

    /* renamed from: j  reason: collision with root package name */
    public final va.a f18533j;

    /* renamed from: k  reason: collision with root package name */
    public final WriteMode f18534k;

    /* renamed from: l  reason: collision with root package name */
    public final va.i[] f18535l;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f18536m;
    public final va.e n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f18537o;

    /* renamed from: p  reason: collision with root package name */
    public String f18538p;

    public s(f fVar, va.a aVar, WriteMode writeMode, va.i[] iVarArr) {
        v7.g.f(fVar, "composer");
        v7.g.f(aVar, "json");
        v7.g.f(writeMode, "mode");
        this.f18532i = fVar;
        this.f18533j = aVar;
        this.f18534k = writeMode;
        this.f18535l = iVarArr;
        this.f18536m = aVar.f18192b;
        this.n = aVar.f18191a;
        int ordinal = writeMode.ordinal();
        if (iVarArr != null) {
            va.i iVar = iVarArr[ordinal];
            if (iVar == null && iVar == this) {
                return;
            }
            iVarArr[ordinal] = this;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final void B(byte b5) {
        if (this.f18537o) {
            l0(String.valueOf((int) b5));
        } else {
            this.f18532i.c(b5);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final void D(boolean z10) {
        if (this.f18537o) {
            l0(String.valueOf(z10));
        } else {
            this.f18532i.f18506a.c(String.valueOf(z10));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final void I(int i10) {
        if (this.f18537o) {
            l0(String.valueOf(i10));
        } else {
            this.f18532i.e(i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final void M(float f10) {
        boolean z10;
        boolean z11 = this.f18537o;
        f fVar = this.f18532i;
        if (z11) {
            l0(String.valueOf(f10));
        } else {
            fVar.f18506a.c(String.valueOf(f10));
        }
        if (!this.n.f18218k) {
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw a1.c.o(Float.valueOf(f10), fVar.f18506a.toString());
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final void S(long j2) {
        if (this.f18537o) {
            l0(String.valueOf(j2));
        } else {
            this.f18532i.f(j2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final void U(char c) {
        l0(String.valueOf(c));
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.a, ta.b
    public final void a(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
        WriteMode writeMode = this.f18534k;
        if (writeMode.f15695j != 0) {
            f fVar = this.f18532i;
            fVar.k();
            fVar.b();
            fVar.d(writeMode.f15695j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final <T> void a0(qa.e<? super T> eVar, T t10) {
        v7.g.f(eVar, "serializer");
        if (eVar instanceof ua.b) {
            va.a aVar = this.f18533j;
            if (!aVar.f18191a.f18216i) {
                ua.b bVar = (ua.b) eVar;
                String x3 = a1.b.x(eVar.a(), aVar);
                v7.g.d(t10, "null cannot be cast to non-null type kotlin.Any");
                qa.e P = a1.b.P(bVar, this, t10);
                if (bVar instanceof SealedClassSerializer) {
                    sa.e a10 = P.a();
                    v7.g.f(a10, "<this>");
                    if (m0.b.z(a10).contains(x3)) {
                        String b5 = bVar.a().b();
                        String b10 = P.a().b();
                        throw new IllegalStateException(("Sealed class '" + b10 + "' cannot be serialized as base class '" + b5 + "' because it has property name that conflicts with JSON class discriminator '" + x3 + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
                    }
                }
                sa.h h10 = P.a().h();
                v7.g.f(h10, "kind");
                if (!(h10 instanceof h.b)) {
                    if (!(h10 instanceof sa.d)) {
                        if (!(h10 instanceof sa.c)) {
                            this.f18538p = x3;
                            P.b(this, t10);
                            return;
                        }
                        throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
                    }
                    throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
                }
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
            }
        }
        eVar.b(this, t10);
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c, ta.d
    public final ta.b b(sa.e eVar) {
        va.i iVar;
        v7.g.f(eVar, "descriptor");
        va.a aVar = this.f18533j;
        WriteMode b5 = w.b(eVar, aVar);
        f fVar = this.f18532i;
        char c = b5.f15694i;
        if (c != 0) {
            fVar.d(c);
            fVar.a();
        }
        if (this.f18538p != null) {
            fVar.b();
            String str = this.f18538p;
            v7.g.c(str);
            l0(str);
            fVar.d(':');
            fVar.j();
            l0(eVar.b());
            this.f18538p = null;
        }
        if (this.f18534k == b5) {
            return this;
        }
        va.i[] iVarArr = this.f18535l;
        if (iVarArr == null || (iVar = iVarArr[b5.ordinal()]) == null) {
            return new s(fVar, aVar, b5, iVarArr);
        }
        return iVar;
    }

    @Override // ta.a
    public final androidx.datastore.preferences.protobuf.k c() {
        return this.f18536m;
    }

    @Override // ta.d
    public final void j() {
        this.f18532i.g("null");
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final ta.d k(sa.e eVar) {
        boolean z10;
        v7.g.f(eVar, "descriptor");
        boolean a10 = t.a(eVar);
        WriteMode writeMode = this.f18534k;
        va.a aVar = this.f18533j;
        f fVar = this.f18532i;
        if (a10) {
            if (!(fVar instanceof h)) {
                fVar = new h(fVar.f18506a, this.f18537o);
            }
            return new s(fVar, aVar, writeMode, null);
        }
        if (eVar.i() && v7.g.a(eVar, va.g.f18220a)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!(fVar instanceof g)) {
                fVar = new g(fVar.f18506a, this.f18537o);
            }
            return new s(fVar, aVar, writeMode, null);
        }
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final void l0(String str) {
        v7.g.f(str, "value");
        this.f18532i.i(str);
    }

    @Override // ta.d
    public final void n(sa.e eVar, int i10) {
        v7.g.f(eVar, "enumDescriptor");
        l0(eVar.d(i10));
    }

    @Override // ta.b
    public final boolean n0(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        return this.n.f18209a;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.b
    public final void p(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, int i10, qa.b bVar, Comparable comparable) {
        if (comparable != null || this.n.f18213f) {
            super.p(pluginGeneratedSerialDescriptor, i10, bVar, comparable);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void u0(sa.e eVar, int i10) {
        v7.g.f(eVar, "descriptor");
        int ordinal = this.f18534k.ordinal();
        boolean z10 = true;
        f fVar = this.f18532i;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!fVar.f18507b) {
                        fVar.d(',');
                    }
                    fVar.b();
                    va.a aVar = this.f18533j;
                    v7.g.f(aVar, "json");
                    kotlinx.serialization.json.internal.b.c(eVar, aVar);
                    l0(eVar.d(i10));
                    fVar.d(':');
                    fVar.j();
                    return;
                }
                if (i10 == 0) {
                    this.f18537o = true;
                }
                if (i10 == 1) {
                    fVar.d(',');
                } else {
                    return;
                }
            } else if (!fVar.f18507b) {
                if (i10 % 2 == 0) {
                    fVar.d(',');
                    fVar.b();
                    this.f18537o = z10;
                    return;
                }
                fVar.d(':');
            } else {
                this.f18537o = true;
            }
            fVar.j();
            z10 = false;
            this.f18537o = z10;
            return;
        } else if (!fVar.f18507b) {
            fVar.d(',');
        }
        fVar.b();
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final void v(double d5) {
        boolean z10;
        boolean z11 = this.f18537o;
        f fVar = this.f18532i;
        if (z11) {
            l0(String.valueOf(d5));
        } else {
            fVar.f18506a.c(String.valueOf(d5));
        }
        if (!this.n.f18218k) {
            if (!Double.isInfinite(d5) && !Double.isNaN(d5)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw a1.c.o(Double.valueOf(d5), fVar.f18506a.toString());
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.d
    public final void w(short s10) {
        if (this.f18537o) {
            l0(String.valueOf((int) s10));
        } else {
            this.f18532i.h(s10);
        }
    }
}
