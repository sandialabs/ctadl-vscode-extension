package y9;

/* loaded from: classes.dex */
public final class q extends kotlin.reflect.jvm.internal.impl.types.q {

    /* renamed from: b  reason: collision with root package name */
    public final l8.i0[] f18962b;
    public final f0[] c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18963d;

    public q() {
        throw null;
    }

    public q(l8.i0[] i0VarArr, f0[] f0VarArr, boolean z10) {
        v7.g.f(i0VarArr, "parameters");
        v7.g.f(f0VarArr, "arguments");
        this.f18962b = i0VarArr;
        this.c = f0VarArr;
        this.f18963d = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final boolean b() {
        return this.f18963d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final f0 d(r rVar) {
        l8.d c = rVar.U0().c();
        l8.i0 i0Var = c instanceof l8.i0 ? (l8.i0) c : null;
        if (i0Var == null) {
            return null;
        }
        int index = i0Var.getIndex();
        l8.i0[] i0VarArr = this.f18962b;
        if (index >= i0VarArr.length || !v7.g.a(i0VarArr[index].o(), i0Var.o())) {
            return null;
        }
        return this.c[index];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final boolean e() {
        return this.c.length == 0;
    }
}
