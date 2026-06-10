package o8;

/* loaded from: classes.dex */
public abstract class l0 extends k0 {
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public x9.f<m9.g<?>> f16446o;

    /* renamed from: p  reason: collision with root package name */
    public u7.a<x9.f<m9.g<?>>> f16447p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(l8.f fVar, m8.e eVar, h9.e eVar2, boolean z10, l8.d0 d0Var) {
        super(fVar, eVar, eVar2, null, d0Var);
        if (fVar == null) {
            K(0);
            throw null;
        } else if (eVar == null) {
            K(1);
            throw null;
        } else if (eVar2 == null) {
            K(2);
            throw null;
        } else if (d0Var == null) {
            K(3);
            throw null;
        } else {
            this.n = z10;
        }
    }

    public static /* synthetic */ void K(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // l8.l0
    public final m9.g<?> J0() {
        x9.f<m9.g<?>> fVar = this.f16446o;
        if (fVar != null) {
            return fVar.k0();
        }
        return null;
    }

    @Override // l8.l0
    public final boolean M() {
        return this.n;
    }

    public final void M0(x9.f<m9.g<?>> fVar, u7.a<x9.f<m9.g<?>>> aVar) {
        if (aVar == null) {
            K(5);
            throw null;
        }
        this.f16447p = aVar;
        if (fVar == null) {
            fVar = aVar.k0();
        }
        this.f16446o = fVar;
    }
}
