package o8;

import m8.e;

/* loaded from: classes.dex */
public final class u extends d {

    /* renamed from: k  reason: collision with root package name */
    public final l8.b f16466k;

    /* renamed from: l  reason: collision with root package name */
    public final s9.e f16467l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b bVar) {
        super(e.a.f16014a);
        if (bVar == null) {
            K(0);
            throw null;
        }
        this.f16466k = bVar;
        this.f16467l = new s9.e(bVar);
    }

    public static /* synthetic */ void K(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // l8.f
    public final l8.f c() {
        l8.b bVar = this.f16466k;
        if (bVar != null) {
            return bVar;
        }
        K(2);
        throw null;
    }

    @Override // l8.c0
    public final s9.g getValue() {
        s9.e eVar = this.f16467l;
        if (eVar != null) {
            return eVar;
        }
        K(1);
        throw null;
    }

    @Override // o8.n
    public final String toString() {
        return "class " + this.f16466k.getName() + "::this";
    }
}
