package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import kotlin.reflect.jvm.internal.impl.util.c;
import kotlin.reflect.jvm.internal.impl.util.d;
import kotlin.text.Regex;
import l8.c0;
import l8.d0;
import l8.f;
import l8.m;
import m8.e;
import ma.i;
import o8.f0;
import o8.g0;
import y9.r;

/* loaded from: classes.dex */
public final class JavaMethodDescriptor extends g0 implements w8.a {
    public static final a O = new a();
    public static final b P = new b();
    public ParameterNamesStatus M;
    public final boolean N;

    /* loaded from: classes.dex */
    public enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: i  reason: collision with root package name */
        public final boolean f13679i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f13680j;

        ParameterNamesStatus(boolean z10, boolean z11) {
            this.f13679i = z10;
            this.f13680j = z11;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0150a<h> {
    }

    /* loaded from: classes.dex */
    public static class b implements a.InterfaceC0150a<Boolean> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaMethodDescriptor(f fVar, g gVar, e eVar, h9.e eVar2, CallableMemberDescriptor.Kind kind, d0 d0Var, boolean z10) {
        super(fVar, gVar, eVar, eVar2, kind, d0Var);
        if (fVar == null) {
            K(0);
            throw null;
        } else if (eVar == null) {
            K(1);
            throw null;
        } else if (eVar2 == null) {
            K(2);
            throw null;
        } else if (kind == null) {
            K(3);
            throw null;
        } else if (d0Var == null) {
            K(4);
            throw null;
        } else {
            this.M = null;
            this.N = z10;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case i.f16049q /* 15 */:
                objArr[0] = "kind";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case i.f16046m /* 9 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case i.f16047o /* 10 */:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case i.f16046m /* 9 */:
            case i.f16047o /* 10 */:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case i.f16049q /* 15 */:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static JavaMethodDescriptor g1(f fVar, LazyJavaAnnotations lazyJavaAnnotations, h9.e eVar, a9.a aVar, boolean z10) {
        if (fVar == null) {
            K(5);
            throw null;
        } else if (eVar == null) {
            K(7);
            throw null;
        } else if (aVar != null) {
            return new JavaMethodDescriptor(fVar, null, lazyJavaAnnotations, eVar, CallableMemberDescriptor.Kind.DECLARATION, aVar, z10);
        } else {
            K(8);
            throw null;
        }
    }

    @Override // w8.a
    public final w8.a S(r rVar, ArrayList arrayList, r rVar2, Pair pair) {
        f0 h10;
        ArrayList o02 = c.o0(arrayList, m(), this);
        if (rVar == null) {
            h10 = null;
        } else {
            h10 = k9.c.h(this, rVar, e.a.f16014a);
        }
        b.a aVar = (b.a) v();
        aVar.f13547g = o02;
        aVar.m(rVar2);
        aVar.f13549i = h10;
        aVar.f13555p = true;
        aVar.f13554o = true;
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar.build();
        if (pair != null) {
            javaMethodDescriptor.X0((a.InterfaceC0150a) pair.f12962i, pair.f12963j);
        }
        if (javaMethodDescriptor != null) {
            return javaMethodDescriptor;
        }
        K(21);
        throw null;
    }

    @Override // o8.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.b S0(CallableMemberDescriptor.Kind kind, f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, e eVar2, h9.e eVar3) {
        if (fVar != null) {
            if (kind != null) {
                if (eVar2 != null) {
                    g gVar = (g) eVar;
                    if (eVar3 == null) {
                        eVar3 = getName();
                    }
                    JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(fVar, gVar, eVar2, eVar3, kind, d0Var, this.N);
                    ParameterNamesStatus parameterNamesStatus = this.M;
                    javaMethodDescriptor.h1(parameterNamesStatus.f13679i, parameterNamesStatus.f13680j);
                    return javaMethodDescriptor;
                }
                K(16);
                throw null;
            }
            K(15);
            throw null;
        }
        K(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final boolean Z() {
        return this.M.f13680j;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0067 A[SYNTHETIC] */
    @Override // o8.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g0 f1(f0 f0Var, c0 c0Var, List list, List list2, List list3, r rVar, Modality modality, m mVar, Map map) {
        kotlin.reflect.jvm.internal.impl.util.c cVar;
        boolean z10;
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (mVar != null) {
                        super.f1(f0Var, c0Var, list, list2, list3, rVar, modality, mVar, map);
                        OperatorChecks.f15083a.getClass();
                        Iterator<d> it = OperatorChecks.f15084b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                d next = it.next();
                                next.getClass();
                                int i10 = 0;
                                h9.e eVar = next.f15099a;
                                if (eVar == null || v7.g.a(getName(), eVar)) {
                                    Regex regex = next.f15100b;
                                    if (regex != null) {
                                        String b5 = getName().b();
                                        v7.g.e(b5, "functionDescriptor.name.asString()");
                                        if (!regex.f15129i.matcher(b5).matches()) {
                                        }
                                    }
                                    Collection<h9.e> collection = next.c;
                                    if (collection == null || collection.contains(getName())) {
                                        z10 = true;
                                        continue;
                                        if (z10) {
                                            kotlin.reflect.jvm.internal.impl.util.b[] bVarArr = next.f15102e;
                                            int length = bVarArr.length;
                                            while (true) {
                                                if (i10 < length) {
                                                    String b10 = bVarArr[i10].b(this);
                                                    if (b10 != null) {
                                                        cVar = new c.b(b10);
                                                        break;
                                                    }
                                                    i10++;
                                                } else {
                                                    String U = next.f15101d.U(this);
                                                    if (U != null) {
                                                        cVar = new c.b(U);
                                                    } else {
                                                        cVar = c.C0170c.f15098b;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                z10 = false;
                                continue;
                                if (z10) {
                                }
                            } else {
                                cVar = c.a.f15097b;
                                break;
                            }
                        }
                        this.f13536u = cVar.f15096a;
                        return this;
                    }
                    K(12);
                    throw null;
                }
                K(11);
                throw null;
            }
            K(10);
            throw null;
        }
        K(9);
        throw null;
    }

    public final void h1(boolean z10, boolean z11) {
        ParameterNamesStatus parameterNamesStatus;
        if (z10) {
            if (z11) {
                parameterNamesStatus = ParameterNamesStatus.STABLE_SYNTHESIZED;
            } else {
                parameterNamesStatus = ParameterNamesStatus.STABLE_DECLARED;
            }
        } else if (z11) {
            parameterNamesStatus = ParameterNamesStatus.NON_STABLE_SYNTHESIZED;
        } else {
            parameterNamesStatus = ParameterNamesStatus.NON_STABLE_DECLARED;
        }
        this.M = parameterNamesStatus;
    }
}
