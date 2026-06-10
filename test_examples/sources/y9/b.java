package y9;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* loaded from: classes.dex */
public abstract class b extends AbstractTypeConstructor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x9.h hVar) {
        super(hVar);
        if (hVar != null) {
        } else {
            o(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void o(int i10) {
        String format;
        String str = (i10 == 1 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[0] = "classifier";
            } else if (i10 != 3 && i10 != 4) {
                objArr[0] = "storageManager";
            }
            if (i10 != 1) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 3 || i10 == 4) {
                objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    objArr[2] = "isSameClassifier";
                } else if (i10 != 3 && i10 != 4) {
                    objArr[2] = "<init>";
                }
            }
            format = String.format(str, objArr);
            if (i10 == 1 && i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i10 != 1) {
        }
        if (i10 != 1) {
        }
        format = String.format(str, objArr);
        if (i10 == 1) {
        }
        throw new IllegalStateException(format);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // y9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(l8.d dVar) {
        boolean z10;
        if (!(dVar instanceof l8.b)) {
            return false;
        }
        l8.b c = c();
        v7.g.f(c, "first");
        if (v7.g.a(c.getName(), dVar.getName())) {
            l8.f c10 = c.c();
            l8.f c11 = dVar.c();
            while (true) {
                if (c10 != null && c11 != null) {
                    if (c10 instanceof l8.s) {
                        z10 = c11 instanceof l8.s;
                        break;
                    } else if (!(c11 instanceof l8.s)) {
                        if (c10 instanceof l8.u) {
                            if ((c11 instanceof l8.u) && v7.g.a(((l8.u) c10).e(), ((l8.u) c11).e())) {
                            }
                        } else if ((c11 instanceof l8.u) || !v7.g.a(c10.getName(), c11.getName())) {
                            break;
                        } else {
                            c10 = c10.c();
                            c11 = c11.c();
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return false;
            }
            return true;
        }
        z10 = false;
        if (z10) {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final r i() {
        if (kotlin.reflect.jvm.internal.impl.builtins.e.I(c())) {
            return null;
        }
        return u().f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection j() {
        l8.f c = c().c();
        if (c instanceof l8.b) {
            fa.c cVar = new fa.c();
            l8.b bVar = (l8.b) c;
            cVar.add(bVar.r());
            bVar.E0();
            return cVar;
        }
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        o(3);
        throw null;
    }

    @Override // y9.e, y9.e0
    /* renamed from: p */
    public abstract l8.b c();

    @Override // y9.e0
    public final kotlin.reflect.jvm.internal.impl.builtins.e u() {
        kotlin.reflect.jvm.internal.impl.builtins.e e10 = DescriptorUtilsKt.e(c());
        if (e10 != null) {
            return e10;
        }
        o(1);
        throw null;
    }
}
