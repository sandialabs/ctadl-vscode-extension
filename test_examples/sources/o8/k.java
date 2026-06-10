package o8;

/* loaded from: classes.dex */
public abstract class k extends b {

    /* renamed from: m  reason: collision with root package name */
    public final l8.f f16437m;
    public final l8.d0 n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f16438o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(x9.h hVar, l8.f fVar, h9.e eVar, l8.d0 d0Var) {
        super(hVar, eVar);
        if (hVar == null) {
            z0(0);
            throw null;
        } else if (fVar == null) {
            z0(1);
            throw null;
        } else if (eVar == null) {
            z0(2);
            throw null;
        } else if (d0Var == null) {
            z0(3);
            throw null;
        } else {
            this.f16437m = fVar;
            this.n = d0Var;
            this.f16438o = false;
        }
    }

    public static /* synthetic */ void z0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public boolean D() {
        return this.f16438o;
    }

    @Override // l8.b, l8.g, l8.f
    public final l8.f c() {
        l8.f fVar = this.f16437m;
        if (fVar != null) {
            return fVar;
        }
        z0(4);
        throw null;
    }

    @Override // l8.i
    public final l8.d0 j() {
        l8.d0 d0Var = this.n;
        if (d0Var != null) {
            return d0Var;
        }
        z0(5);
        throw null;
    }
}
