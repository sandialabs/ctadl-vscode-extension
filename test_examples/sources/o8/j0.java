package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.g0;
import m8.e;

/* loaded from: classes.dex */
public final class j0 extends i {

    /* renamed from: s  reason: collision with root package name */
    public final u7.l<y9.r, Void> f16434s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f16435t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16436u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(l8.f fVar, m8.e eVar, boolean z10, Variance variance, h9.e eVar2, int i10, x9.h hVar) {
        super(hVar, fVar, eVar, eVar2, variance, z10, i10, r8);
        g0.a aVar = g0.a.f15837a;
        if (fVar == null) {
            K(19);
            throw null;
        } else if (eVar == null) {
            K(20);
            throw null;
        } else if (variance == null) {
            K(21);
            throw null;
        } else if (eVar2 == null) {
            K(22);
            throw null;
        } else if (hVar == null) {
            K(25);
            throw null;
        } else {
            this.f16435t = new ArrayList(1);
            this.f16436u = false;
            this.f16434s = null;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16049q /* 15 */:
            case 22:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case ma.i.f16047o /* 10 */:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static j0 V0(l8.f fVar, m8.e eVar, boolean z10, Variance variance, h9.e eVar2, int i10, x9.h hVar) {
        if (fVar != null) {
            if (eVar != null) {
                if (variance != null) {
                    if (eVar2 != null) {
                        if (hVar != null) {
                            return new j0(fVar, eVar, z10, variance, eVar2, i10, hVar);
                        }
                        K(11);
                        throw null;
                    }
                    K(9);
                    throw null;
                }
                K(8);
                throw null;
            }
            K(7);
            throw null;
        }
        K(6);
        throw null;
    }

    public static j0 W0(l8.f fVar, Variance variance, h9.e eVar, int i10, x9.h hVar) {
        e.a.C0187a c0187a = e.a.f16014a;
        if (fVar != null) {
            if (hVar != null) {
                j0 V0 = V0(fVar, c0187a, false, variance, eVar, i10, hVar);
                y9.v n = DescriptorUtilsKt.e(fVar).n();
                V0.U0();
                if (!m0.b.D0(n)) {
                    V0.f16435t.add(n);
                }
                V0.U0();
                V0.f16436u = true;
                return V0;
            }
            K(4);
            throw null;
        }
        K(0);
        throw null;
    }

    @Override // o8.i
    public final void S0(y9.r rVar) {
        if (rVar == null) {
            K(27);
            throw null;
        }
        u7.l<y9.r, Void> lVar = this.f16434s;
        if (lVar == null) {
            return;
        }
        lVar.U(rVar);
    }

    @Override // o8.i
    public final List<y9.r> T0() {
        if (this.f16436u) {
            ArrayList arrayList = this.f16435t;
            if (arrayList != null) {
                return arrayList;
            }
            K(28);
            throw null;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + X0());
    }

    public final void U0() {
        if (this.f16436u) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + X0());
        }
    }

    public final String X0() {
        return getName() + " declared in " + k9.d.g(c());
    }
}
