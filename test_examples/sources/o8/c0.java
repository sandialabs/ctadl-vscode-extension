package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.d0;
import l8.l;
import m8.e;

/* loaded from: classes.dex */
public class c0 extends l0 implements l8.z {
    public final boolean A;
    public List<l8.c0> B;
    public l8.c0 C;
    public l8.c0 D;
    public ArrayList E;
    public d0 F;
    public l8.b0 G;
    public l8.n H;
    public l8.n I;

    /* renamed from: q */
    public final Modality f16394q;

    /* renamed from: r */
    public l8.m f16395r;

    /* renamed from: s */
    public Collection<? extends l8.z> f16396s;

    /* renamed from: t */
    public final l8.z f16397t;

    /* renamed from: u */
    public final CallableMemberDescriptor.Kind f16398u;

    /* renamed from: v */
    public final boolean f16399v;

    /* renamed from: w */
    public final boolean f16400w;

    /* renamed from: x */
    public final boolean f16401x;

    /* renamed from: y */
    public final boolean f16402y;

    /* renamed from: z */
    public final boolean f16403z;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public l8.f f16404a;

        /* renamed from: b */
        public Modality f16405b;
        public l8.m c;

        /* renamed from: e */
        public CallableMemberDescriptor.Kind f16407e;

        /* renamed from: h */
        public final l8.c0 f16410h;

        /* renamed from: i */
        public final h9.e f16411i;

        /* renamed from: j */
        public final y9.r f16412j;

        /* renamed from: d */
        public l8.z f16406d = null;

        /* renamed from: f */
        public kotlin.reflect.jvm.internal.impl.types.q f16408f = kotlin.reflect.jvm.internal.impl.types.q.f15072a;

        /* renamed from: g */
        public boolean f16409g = true;

        public a() {
            c0.this = r2;
            this.f16404a = r2.c();
            this.f16405b = r2.p();
            this.c = r2.g();
            this.f16407e = r2.h();
            this.f16410h = r2.C;
            this.f16411i = r2.getName();
            this.f16412j = r2.b();
        }

        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                case 5:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case ma.i.f16046m /* 9 */:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case ma.i.f16047o /* 10 */:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case ma.i.f16049q /* 15 */:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                case 5:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case ma.i.f16046m /* 9 */:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case ma.i.f16047o /* 10 */:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case ma.i.f16049q /* 15 */:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public final c0 b() {
            d dVar;
            f0 f0Var;
            d0 d0Var;
            d0 s10;
            e0 e0Var;
            l8.b0 l2;
            s sVar;
            u7.a<x9.f<m9.g<?>>> aVar;
            y9.r rVar;
            f0 f0Var2;
            Iterator<l8.c0> it;
            Variance variance;
            f0 f0Var3;
            c0 c0Var = c0.this;
            c0Var.getClass();
            l8.f fVar = this.f16404a;
            Modality modality = this.f16405b;
            l8.m mVar = this.c;
            l8.z zVar = this.f16406d;
            CallableMemberDescriptor.Kind kind = this.f16407e;
            h9.e eVar = this.f16411i;
            d0.a aVar2 = l8.d0.f15835a;
            c0 U0 = c0Var.U0(fVar, modality, mVar, zVar, kind, eVar);
            List<l8.i0> typeParameters = c0Var.getTypeParameters();
            ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
            TypeSubstitutor D0 = a1.b.D0(typeParameters, this.f16408f, U0, arrayList);
            Variance variance2 = Variance.OUT_VARIANCE;
            y9.r rVar2 = this.f16412j;
            y9.r k3 = D0.k(rVar2, variance2);
            if (k3 != null) {
                Variance variance3 = Variance.IN_VARIANCE;
                y9.r k10 = D0.k(rVar2, variance3);
                if (k10 != null) {
                    U0.X0(k10);
                }
                l8.c0 c0Var2 = this.f16410h;
                if (c0Var2 != null) {
                    d d5 = c0Var2.d(D0);
                    if (d5 != null) {
                        dVar = d5;
                    }
                } else {
                    dVar = null;
                }
                l8.c0 c0Var3 = c0Var.D;
                if (c0Var3 != null) {
                    y9.r k11 = D0.k(c0Var3.b(), variance3);
                    if (k11 == null) {
                        f0Var3 = null;
                    } else {
                        f0Var3 = new f0(U0, new s9.d(U0, k11, c0Var3.getValue()), c0Var3.getAnnotations());
                    }
                    f0Var = f0Var3;
                } else {
                    f0Var = null;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<l8.c0> it2 = c0Var.B.iterator();
                while (it2.hasNext()) {
                    l8.c0 next = it2.next();
                    y9.r k12 = D0.k(next.b(), variance3);
                    if (k12 == null) {
                        it = it2;
                        variance = variance3;
                        f0Var2 = null;
                    } else {
                        it = it2;
                        variance = variance3;
                        f0Var2 = new f0(U0, new s9.c(U0, k12, ((s9.f) next.getValue()).a(), next.getValue()), next.getAnnotations());
                    }
                    if (f0Var2 != null) {
                        arrayList2.add(f0Var2);
                    }
                    variance3 = variance;
                    it2 = it;
                }
                U0.Y0(k3, arrayList, dVar, f0Var, arrayList2);
                d0 d0Var2 = c0Var.F;
                CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
                if (d0Var2 == null) {
                    d0Var = null;
                } else {
                    m8.e annotations = d0Var2.getAnnotations();
                    Modality modality2 = this.f16405b;
                    l8.m g10 = c0Var.F.g();
                    if (this.f16407e == kind2 && l8.l.e(g10.d())) {
                        g10 = l8.l.f15845h;
                    }
                    l8.m mVar2 = g10;
                    d0 d0Var3 = c0Var.F;
                    boolean z10 = d0Var3.f16387m;
                    boolean z11 = d0Var3.n;
                    boolean z12 = d0Var3.f16390q;
                    CallableMemberDescriptor.Kind kind3 = this.f16407e;
                    l8.z zVar2 = this.f16406d;
                    if (zVar2 == null) {
                        s10 = null;
                    } else {
                        s10 = zVar2.s();
                    }
                    d0Var = new d0(U0, annotations, modality2, mVar2, z10, z11, z12, kind3, s10, aVar2);
                }
                if (d0Var != null) {
                    d0 d0Var4 = c0Var.F;
                    y9.r rVar3 = d0Var4.f16414u;
                    d0Var.f16393t = c0.V0(D0, d0Var4);
                    if (rVar3 != null) {
                        rVar = D0.k(rVar3, variance2);
                    } else {
                        rVar = null;
                    }
                    d0Var.U0(rVar);
                }
                l8.b0 b0Var = c0Var.G;
                if (b0Var == null) {
                    e0Var = null;
                } else {
                    m8.e annotations2 = b0Var.getAnnotations();
                    Modality modality3 = this.f16405b;
                    l8.m g11 = c0Var.G.g();
                    if (this.f16407e == kind2 && l8.l.e(g11.d())) {
                        g11 = l8.l.f15845h;
                    }
                    l8.m mVar3 = g11;
                    boolean F0 = c0Var.G.F0();
                    boolean D = c0Var.G.D();
                    boolean i10 = c0Var.G.i();
                    CallableMemberDescriptor.Kind kind4 = this.f16407e;
                    l8.z zVar3 = this.f16406d;
                    if (zVar3 == null) {
                        l2 = null;
                    } else {
                        l2 = zVar3.l();
                    }
                    e0Var = new e0(U0, annotations2, modality3, mVar3, F0, D, i10, kind4, l2, aVar2);
                }
                if (e0Var != null) {
                    List U02 = kotlin.reflect.jvm.internal.impl.descriptors.impl.b.U0(e0Var, c0Var.G.m(), D0, false, false, null);
                    if (U02 == null) {
                        U02 = Collections.singletonList(e0.T0(e0Var, DescriptorUtilsKt.e(this.f16404a).o(), c0Var.G.m().get(0).getAnnotations()));
                    }
                    if (U02.size() == 1) {
                        e0Var.f16393t = c0.V0(D0, c0Var.G);
                        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) U02.get(0);
                        if (hVar != null) {
                            e0Var.f16417u = hVar;
                        } else {
                            e0.K(6);
                            throw null;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                s sVar2 = null;
                l8.n nVar = c0Var.H;
                if (nVar == null) {
                    sVar = null;
                } else {
                    sVar = new s(U0, nVar.getAnnotations());
                }
                l8.n nVar2 = c0Var.I;
                if (nVar2 != null) {
                    sVar2 = new s(U0, nVar2.getAnnotations());
                }
                U0.W0(d0Var, e0Var, sVar, sVar2);
                if (this.f16409g) {
                    fa.d dVar2 = new fa.d();
                    for (l8.z zVar4 : c0Var.f()) {
                        dVar2.add(zVar4.d(D0));
                    }
                    U0.s0(dVar2);
                }
                if (c0Var.I() && (aVar = c0Var.f16447p) != null) {
                    U0.M0(c0Var.f16446o, aVar);
                    return U0;
                }
                return U0;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(l8.f fVar, l8.z zVar, m8.e eVar, Modality modality, l8.m mVar, boolean z10, h9.e eVar2, CallableMemberDescriptor.Kind kind, l8.d0 d0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(fVar, eVar, eVar2, z10, d0Var);
        if (fVar == null) {
            K(0);
            throw null;
        } else if (eVar == null) {
            K(1);
            throw null;
        } else if (modality == null) {
            K(2);
            throw null;
        } else if (mVar == null) {
            K(3);
            throw null;
        } else if (eVar2 == null) {
            K(4);
            throw null;
        } else if (kind == null) {
            K(5);
            throw null;
        } else if (d0Var == null) {
            K(6);
            throw null;
        } else {
            this.f16396s = null;
            this.B = Collections.emptyList();
            this.f16394q = modality;
            this.f16395r = mVar;
            this.f16397t = zVar == null ? this : zVar;
            this.f16398u = kind;
            this.f16399v = z11;
            this.f16400w = z12;
            this.f16401x = z13;
            this.f16402y = z14;
            this.f16403z = z15;
            this.A = z16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
                switch (i10) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 8:
                        objArr[0] = "annotations";
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    case ma.i.f16046m /* 9 */:
                        objArr[0] = "modality";
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    case ma.i.f16047o /* 10 */:
                    case 20:
                        objArr[0] = "visibility";
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    case 11:
                        objArr[0] = "name";
                        break;
                    case 5:
                    case 12:
                    case 35:
                        objArr[0] = "kind";
                        break;
                    case 6:
                    case 13:
                    case 37:
                        objArr[0] = "source";
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 14:
                        objArr[0] = "inType";
                        break;
                    case ma.i.f16049q /* 15 */:
                    case 17:
                        objArr[0] = "outType";
                        break;
                    case 16:
                    case 18:
                        objArr[0] = "typeParameters";
                        break;
                    case 19:
                        objArr[0] = "contextReceiverParameters";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                        break;
                    case 27:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 29:
                        objArr[0] = "copyConfiguration";
                        break;
                    case 30:
                        objArr[0] = "substitutor";
                        break;
                    case 31:
                        objArr[0] = "accessorDescriptor";
                        break;
                    case 32:
                        objArr[0] = "newOwner";
                        break;
                    case 33:
                        objArr[0] = "newModality";
                        break;
                    case 34:
                        objArr[0] = "newVisibility";
                        break;
                    case 36:
                        objArr[0] = "newName";
                        break;
                    case 40:
                        objArr[0] = "overriddenDescriptors";
                        break;
                }
                if (i10 != 28) {
                    objArr[1] = "getSourceToUseForCopy";
                } else if (i10 == 38) {
                    objArr[1] = "getOriginal";
                } else if (i10 == 39) {
                    objArr[1] = "getKind";
                } else if (i10 == 41) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i10 != 42) {
                    switch (i10) {
                        case 21:
                            objArr[1] = "getTypeParameters";
                            break;
                        case 22:
                            objArr[1] = "getContextReceiverParameters";
                            break;
                        case 23:
                            objArr[1] = "getReturnType";
                            break;
                        case 24:
                            objArr[1] = "getModality";
                            break;
                        case 25:
                            objArr[1] = "getVisibility";
                            break;
                        case 26:
                            objArr[1] = "getAccessors";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i10) {
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                    case ma.i.f16046m /* 9 */:
                    case ma.i.f16047o /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                        objArr[2] = "create";
                        break;
                    case 14:
                        objArr[2] = "setInType";
                        break;
                    case ma.i.f16049q /* 15 */:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[2] = "setType";
                        break;
                    case 20:
                        objArr[2] = "setVisibility";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        break;
                    case 27:
                        objArr[2] = "substitute";
                        break;
                    case 29:
                        objArr[2] = "doSubstitute";
                        break;
                    case 30:
                    case 31:
                        objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                        break;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    case 40:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
                    switch (i10) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 28) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 28) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 28) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 28) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 28) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 != 28) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 28) {
        }
        throw new IllegalStateException(format222);
    }

    public static c0 T0(l8.f fVar, Modality modality, l.h hVar, boolean z10, h9.e eVar, CallableMemberDescriptor.Kind kind, l8.d0 d0Var) {
        e.a.C0187a c0187a = e.a.f16014a;
        if (fVar == null) {
            K(7);
            throw null;
        } else if (hVar == null) {
            K(10);
            throw null;
        } else if (eVar == null) {
            K(11);
            throw null;
        } else if (d0Var != null) {
            return new c0(fVar, null, c0187a, modality, hVar, z10, eVar, kind, d0Var, false, false, false, false, false, false);
        } else {
            K(13);
            throw null;
        }
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.e V0(TypeSubstitutor typeSubstitutor, kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        if (fVar == null) {
            K(31);
            throw null;
        } else if (fVar.C() != null) {
            return fVar.C().d(typeSubstitutor);
        } else {
            return null;
        }
    }

    @Override // l8.r
    public boolean D() {
        return this.f16403z;
    }

    @Override // o8.k0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final l8.c0 E() {
        return this.C;
    }

    @Override // l8.l0
    public boolean I() {
        return this.f16400w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public <V> V L(a.InterfaceC0150a<V> interfaceC0150a) {
        return null;
    }

    @Override // l8.r
    public final boolean L0() {
        return this.f16402y;
    }

    @Override // o8.k0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final l8.c0 R() {
        return this.D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: S0 */
    public final c0 y0(l8.f fVar, Modality modality, l8.k kVar) {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        a aVar = new a();
        if (fVar != null) {
            aVar.f16404a = fVar;
            aVar.f16406d = null;
            aVar.f16405b = modality;
            if (kVar != null) {
                aVar.c = kVar;
                aVar.f16407e = kind;
                aVar.f16409g = false;
                c0 b5 = aVar.b();
                if (b5 != null) {
                    return b5;
                }
                K(42);
                throw null;
            }
            a.a(8);
            throw null;
        }
        a.a(0);
        throw null;
    }

    @Override // l8.z
    public final l8.n U() {
        return this.I;
    }

    public c0 U0(l8.f fVar, Modality modality, l8.m mVar, l8.z zVar, CallableMemberDescriptor.Kind kind, h9.e eVar) {
        d0.a aVar = l8.d0.f15835a;
        if (fVar != null) {
            if (modality != null) {
                if (mVar != null) {
                    if (kind != null) {
                        if (eVar != null) {
                            return new c0(fVar, zVar, getAnnotations(), modality, mVar, this.n, eVar, kind, aVar, this.f16399v, I(), this.f16401x, this.f16402y, D(), this.A);
                        }
                        K(36);
                        throw null;
                    }
                    K(35);
                    throw null;
                }
                K(34);
                throw null;
            }
            K(33);
            throw null;
        }
        K(32);
        throw null;
    }

    public final void W0(d0 d0Var, e0 e0Var, l8.n nVar, l8.n nVar2) {
        this.F = d0Var;
        this.G = e0Var;
        this.H = nVar;
        this.I = nVar2;
    }

    public void X0(y9.r rVar) {
    }

    public final void Y0(y9.r rVar, List list, l8.c0 c0Var, f0 f0Var, List list2) {
        if (rVar != null) {
            if (list != null) {
                if (list2 != null) {
                    this.f16439m = rVar;
                    this.E = new ArrayList(list);
                    this.D = f0Var;
                    this.C = c0Var;
                    this.B = list2;
                    return;
                }
                K(19);
                throw null;
            }
            K(18);
            throw null;
        }
        K(17);
        throw null;
    }

    @Override // o8.o
    /* renamed from: a */
    public final l8.z z0() {
        l8.z zVar = this.f16397t;
        l8.z a10 = zVar == this ? this : zVar.a();
        if (a10 != null) {
            return a10;
        }
        K(38);
        throw null;
    }

    @Override // l8.z
    public final l8.n a0() {
        return this.H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<l8.c0> b0() {
        List<l8.c0> list = this.B;
        if (list != null) {
            return list;
        }
        K(22);
        throw null;
    }

    @Override // l8.f0
    public final l8.z d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            K(27);
            throw null;
        } else if (typeSubstitutor.h()) {
            return this;
        } else {
            a aVar = new a();
            kotlin.reflect.jvm.internal.impl.types.q g10 = typeSubstitutor.g();
            if (g10 != null) {
                aVar.f16408f = g10;
                aVar.f16406d = z0();
                return aVar.b();
            }
            a.a(15);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final Collection<? extends l8.z> f() {
        Collection<? extends l8.z> collection = this.f16396s;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        K(41);
        throw null;
    }

    @Override // l8.l0
    public final boolean f0() {
        return this.f16399v;
    }

    @Override // l8.j, l8.r
    public final l8.m g() {
        l8.m mVar = this.f16395r;
        if (mVar != null) {
            return mVar;
        }
        K(25);
        throw null;
    }

    @Override // o8.k0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<l8.i0> getTypeParameters() {
        ArrayList arrayList = this.E;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for ".concat(n.c0(this)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor.Kind h() {
        CallableMemberDescriptor.Kind kind = this.f16398u;
        if (kind != null) {
            return kind;
        }
        K(39);
        throw null;
    }

    @Override // o8.k0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final y9.r k() {
        y9.r b5 = b();
        if (b5 != null) {
            return b5;
        }
        K(23);
        throw null;
    }

    @Override // l8.z
    public final l8.b0 l() {
        return this.G;
    }

    @Override // l8.r
    public final boolean l0() {
        return this.f16401x;
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.b(this, d5);
    }

    @Override // l8.r
    public final Modality p() {
        Modality modality = this.f16394q;
        if (modality != null) {
            return modality;
        }
        K(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i
    public final boolean p0() {
        return this.A;
    }

    @Override // l8.z
    public final d0 s() {
        return this.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void s0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != 0) {
            this.f16396s = collection;
        } else {
            K(40);
            throw null;
        }
    }

    @Override // l8.z
    public final ArrayList z() {
        ArrayList arrayList = new ArrayList(2);
        d0 d0Var = this.F;
        if (d0Var != null) {
            arrayList.add(d0Var);
        }
        l8.b0 b0Var = this.G;
        if (b0Var != null) {
            arrayList.add(b0Var);
        }
        return arrayList;
    }
}
