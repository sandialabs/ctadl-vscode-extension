package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.i0;
import y9.f0;
import y9.m0;
import y9.r;

/* loaded from: classes.dex */
public final class NewCapturedTypeConstructor implements l9.b {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f14980a;

    /* renamed from: b  reason: collision with root package name */
    public u7.a<? extends List<? extends m0>> f14981b;
    public final NewCapturedTypeConstructor c;

    /* renamed from: d  reason: collision with root package name */
    public final i0 f14982d;

    /* renamed from: e  reason: collision with root package name */
    public final m7.e f14983e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<List<? extends m0>> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ List<m0> f14984j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArrayList arrayList) {
            super(0);
            this.f14984j = arrayList;
        }

        @Override // u7.a
        public final List<? extends m0> k0() {
            return this.f14984j;
        }
    }

    public NewCapturedTypeConstructor() {
        throw null;
    }

    public NewCapturedTypeConstructor(f0 f0Var, u7.a<? extends List<? extends m0>> aVar, NewCapturedTypeConstructor newCapturedTypeConstructor, i0 i0Var) {
        this.f14980a = f0Var;
        this.f14981b = aVar;
        this.c = newCapturedTypeConstructor;
        this.f14982d = i0Var;
        this.f14983e = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new NewCapturedTypeConstructor$_supertypes$2(this));
    }

    public /* synthetic */ NewCapturedTypeConstructor(f0 f0Var, u7.a aVar, NewCapturedTypeConstructor newCapturedTypeConstructor, i0 i0Var, int i10) {
        this(f0Var, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : newCapturedTypeConstructor, (i10 & 8) != 0 ? null : i0Var);
    }

    @Override // y9.e0
    public final boolean a() {
        return false;
    }

    @Override // l9.b
    public final f0 b() {
        return this.f14980a;
    }

    @Override // y9.e0
    public final l8.d c() {
        return null;
    }

    @Override // y9.e0
    public final List<i0> e() {
        return EmptyList.f12981i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (v7.g.a(NewCapturedTypeConstructor.class, obj != null ? obj.getClass() : null)) {
            v7.g.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
            NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
            NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.c;
            if (newCapturedTypeConstructor2 == null) {
                newCapturedTypeConstructor2 = this;
            }
            NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.c;
            if (newCapturedTypeConstructor3 != null) {
                newCapturedTypeConstructor = newCapturedTypeConstructor3;
            }
            return newCapturedTypeConstructor2 == newCapturedTypeConstructor;
        }
        return false;
    }

    @Override // y9.e0
    public final Collection f() {
        List list = (List) this.f14983e.getValue();
        if (list == null) {
            return EmptyList.f12981i;
        }
        return list;
    }

    public final NewCapturedTypeConstructor g(e eVar) {
        v7.g.f(eVar, "kotlinTypeRefiner");
        f0 c = this.f14980a.c(eVar);
        v7.g.e(c, "projection.refine(kotlinTypeRefiner)");
        NewCapturedTypeConstructor$refine$1$1 newCapturedTypeConstructor$refine$1$1 = this.f14981b != null ? new NewCapturedTypeConstructor$refine$1$1(this, eVar) : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(c, newCapturedTypeConstructor$refine$1$1, newCapturedTypeConstructor, this.f14982d);
    }

    public final int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.f14980a + ')';
    }

    @Override // y9.e0
    public final kotlin.reflect.jvm.internal.impl.builtins.e u() {
        r b5 = this.f14980a.b();
        v7.g.e(b5, "projection.type");
        return TypeUtilsKt.g(b5);
    }
}
