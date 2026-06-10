package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.e;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.q;
import l8.c0;
import l8.d0;
import l8.f;
import l8.f0;
import l8.i0;
import l8.k;
import l8.l;
import l8.m;
import ma.i;
import o8.o;
import o8.t;
import v7.g;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public abstract class b extends o implements kotlin.reflect.jvm.internal.impl.descriptors.e {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> G;
    public volatile u7.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> H;
    public final kotlin.reflect.jvm.internal.impl.descriptors.e I;
    public final CallableMemberDescriptor.Kind J;
    public kotlin.reflect.jvm.internal.impl.descriptors.e K;
    public Map<a.InterfaceC0150a<?>, Object> L;

    /* renamed from: m */
    public List<i0> f13529m;
    public List<h> n;

    /* renamed from: o */
    public r f13530o;

    /* renamed from: p */
    public List<c0> f13531p;

    /* renamed from: q */
    public c0 f13532q;

    /* renamed from: r */
    public c0 f13533r;

    /* renamed from: s */
    public Modality f13534s;

    /* renamed from: t */
    public m f13535t;

    /* renamed from: u */
    public boolean f13536u;

    /* renamed from: v */
    public boolean f13537v;

    /* renamed from: w */
    public boolean f13538w;

    /* renamed from: x */
    public boolean f13539x;

    /* renamed from: y */
    public boolean f13540y;

    /* renamed from: z */
    public boolean f13541z;

    /* loaded from: classes.dex */
    public class a implements e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> {

        /* renamed from: a */
        public q f13542a;

        /* renamed from: b */
        public f f13543b;
        public Modality c;

        /* renamed from: d */
        public m f13544d;

        /* renamed from: e */
        public kotlin.reflect.jvm.internal.impl.descriptors.e f13545e;

        /* renamed from: f */
        public CallableMemberDescriptor.Kind f13546f;

        /* renamed from: g */
        public List<h> f13547g;

        /* renamed from: h */
        public final List<c0> f13548h;

        /* renamed from: i */
        public c0 f13549i;

        /* renamed from: j */
        public c0 f13550j;

        /* renamed from: k */
        public r f13551k;

        /* renamed from: l */
        public h9.e f13552l;

        /* renamed from: m */
        public boolean f13553m;
        public boolean n;

        /* renamed from: o */
        public boolean f13554o;

        /* renamed from: p */
        public boolean f13555p;

        /* renamed from: q */
        public boolean f13556q;

        /* renamed from: r */
        public List<i0> f13557r;

        /* renamed from: s */
        public m8.e f13558s;

        /* renamed from: t */
        public boolean f13559t;

        /* renamed from: u */
        public final LinkedHashMap f13560u;

        /* renamed from: v */
        public Boolean f13561v;

        /* renamed from: w */
        public boolean f13562w;

        /* renamed from: x */
        public final /* synthetic */ b f13563x;

        public a(b bVar, q qVar, f fVar, Modality modality, m mVar, CallableMemberDescriptor.Kind kind, List list, List list2, c0 c0Var, r rVar) {
            if (qVar == null) {
                s(0);
                throw null;
            } else if (fVar == null) {
                s(1);
                throw null;
            } else if (modality == null) {
                s(2);
                throw null;
            } else if (mVar == null) {
                s(3);
                throw null;
            } else if (kind == null) {
                s(4);
                throw null;
            } else if (list == null) {
                s(5);
                throw null;
            } else if (list2 == null) {
                s(6);
                throw null;
            } else if (rVar == null) {
                s(7);
                throw null;
            } else {
                this.f13563x = bVar;
                this.f13545e = null;
                this.f13550j = bVar.f13533r;
                this.f13553m = true;
                this.n = false;
                this.f13554o = false;
                this.f13555p = false;
                this.f13556q = bVar.B;
                this.f13557r = null;
                this.f13558s = null;
                this.f13559t = bVar.C;
                this.f13560u = new LinkedHashMap();
                this.f13561v = null;
                this.f13562w = false;
                this.f13542a = qVar;
                this.f13543b = fVar;
                this.c = modality;
                this.f13544d = mVar;
                this.f13546f = kind;
                this.f13547g = list;
                this.f13548h = list2;
                this.f13549i = c0Var;
                this.f13551k = rVar;
                this.f13552l = null;
            }
        }

        public static /* synthetic */ void s(int i10) {
            String str;
            int i11;
            switch (i10) {
                case i.f16046m /* 9 */:
                case 11:
                case 13:
                case i.f16049q /* 15 */:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case i.f16047o /* 10 */:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case i.f16046m /* 9 */:
                case 11:
                case 13:
                case i.f16049q /* 15 */:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case i.f16047o /* 10 */:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    objArr[0] = "newModality";
                    break;
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    objArr[0] = "newVisibility";
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case i.f16046m /* 9 */:
                case 11:
                case 13:
                case i.f16049q /* 15 */:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case i.f16047o /* 10 */:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case i.f16046m /* 9 */:
                    objArr[1] = "setOwner";
                    break;
                case i.f16047o /* 10 */:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case i.f16049q /* 15 */:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case i.f16046m /* 9 */:
                case 11:
                case 13:
                case i.f16049q /* 15 */:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case i.f16047o /* 10 */:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i10) {
                case i.f16046m /* 9 */:
                case 11:
                case 13:
                case i.f16049q /* 15 */:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(format);
                case i.f16047o /* 10 */:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a a() {
            this.f13553m = false;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a b(EmptyList emptyList) {
            if (emptyList != null) {
                this.f13557r = emptyList;
                return this;
            }
            s(21);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final kotlin.reflect.jvm.internal.impl.descriptors.e build() {
            return this.f13563x.T0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> c(f fVar) {
            if (fVar != null) {
                this.f13543b = fVar;
                return this;
            }
            s(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> d(List list) {
            if (list != null) {
                this.f13547g = list;
                return this;
            }
            s(19);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> e(q qVar) {
            if (qVar != null) {
                this.f13542a = qVar;
                return this;
            }
            s(37);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a f(Boolean bool) {
            this.f13560u.put(JavaMethodDescriptor.P, bool);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> g(m8.e eVar) {
            if (eVar != null) {
                this.f13558s = eVar;
                return this;
            }
            s(35);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a h(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            this.f13545e = bVar;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> i(c0 c0Var) {
            this.f13550j = c0Var;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> j() {
            this.f13556q = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> k(Modality modality) {
            if (modality != null) {
                this.c = modality;
                return this;
            }
            s(10);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> l(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.f13546f = kind;
                return this;
            }
            s(14);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> m(r rVar) {
            if (rVar != null) {
                this.f13551k = rVar;
                return this;
            }
            s(23);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> n() {
            this.f13554o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> o() {
            this.f13559t = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> p(h9.e eVar) {
            if (eVar != null) {
                this.f13552l = eVar;
                return this;
            }
            s(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> q(m mVar) {
            if (mVar != null) {
                this.f13544d = mVar;
                return this;
            }
            s(12);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e.a
        public final e.a<kotlin.reflect.jvm.internal.impl.descriptors.e> r() {
            this.n = true;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CallableMemberDescriptor.Kind kind, f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2, h9.e eVar3) {
        super(fVar, eVar2, eVar3, d0Var);
        if (fVar == null) {
            K(0);
            throw null;
        } else if (eVar2 == null) {
            K(1);
            throw null;
        } else if (eVar3 == null) {
            K(2);
            throw null;
        } else if (kind == null) {
            K(3);
            throw null;
        } else if (d0Var == null) {
            K(4);
            throw null;
        } else {
            this.f13535t = l.f15846i;
            this.f13536u = false;
            this.f13537v = false;
            this.f13538w = false;
            this.f13539x = false;
            this.f13540y = false;
            this.f13541z = false;
            this.A = false;
            this.B = false;
            this.C = false;
            this.D = false;
            this.E = true;
            this.F = false;
            this.G = null;
            this.H = null;
            this.K = null;
            this.L = null;
            this.I = eVar == null ? this : eVar;
            this.J = kind;
        }
    }

    public static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case i.f16046m /* 9 */:
            case 13:
            case 14:
            case i.f16049q /* 15 */:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case i.f16047o /* 10 */:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case i.f16046m /* 9 */:
            case 13:
            case 14:
            case i.f16049q /* 15 */:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case i.f16047o /* 10 */:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "kind";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case i.f16047o /* 10 */:
                objArr[0] = "visibility";
                break;
            case i.f16046m /* 9 */:
            case 13:
            case 14:
            case i.f16049q /* 15 */:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case i.f16046m /* 9 */:
                objArr[1] = "initialize";
                break;
            case i.f16047o /* 10 */:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case i.f16049q /* 15 */:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[2] = "initialize";
                break;
            case i.f16046m /* 9 */:
            case 13:
            case 14:
            case i.f16049q /* 15 */:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case i.f16047o /* 10 */:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case i.f16046m /* 9 */:
            case 13:
            case 14:
            case i.f16049q /* 15 */:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case i.f16047o /* 10 */:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static ArrayList U0(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, List list, TypeSubstitutor typeSubstitutor, boolean z10, boolean z11, boolean[] zArr) {
        r k3;
        t tVar;
        h hVar;
        d0 d0Var;
        f0 aVar;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h hVar2 = (h) it.next();
                r b5 = hVar2.b();
                Variance variance = Variance.IN_VARIANCE;
                r k10 = typeSubstitutor.k(b5, variance);
                r N = hVar2.N();
                if (N == null) {
                    k3 = null;
                } else {
                    k3 = typeSubstitutor.k(N, variance);
                }
                if (k10 == null) {
                    return null;
                }
                if ((k10 != hVar2.b() || N != k3) && zArr != null) {
                    zArr[0] = true;
                }
                if (hVar2 instanceof e.a) {
                    tVar = new t((List) ((e.a) hVar2).f13581t.getValue());
                } else {
                    tVar = null;
                }
                if (z10) {
                    hVar = null;
                } else {
                    hVar = hVar2;
                }
                int index = hVar2.getIndex();
                m8.e annotations = hVar2.getAnnotations();
                h9.e name = hVar2.getName();
                boolean j02 = hVar2.j0();
                boolean A = hVar2.A();
                boolean K0 = hVar2.K0();
                if (z11) {
                    d0Var = hVar2.j();
                } else {
                    d0Var = d0.f15835a;
                }
                g.f(annotations, "annotations");
                g.f(name, "name");
                g.f(d0Var, "source");
                if (tVar == null) {
                    aVar = new e(eVar, hVar, index, annotations, name, k10, j02, A, K0, k3, d0Var);
                } else {
                    aVar = new e.a(eVar, hVar, index, annotations, name, k10, j02, A, K0, k3, d0Var, tVar);
                }
                arrayList.add(aVar);
            }
            return arrayList;
        }
        K(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e C() {
        return this.K;
    }

    public boolean D() {
        return this.f13538w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final c0 E() {
        return this.f13533r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean G0() {
        return this.C;
    }

    public <V> V L(a.InterfaceC0150a<V> interfaceC0150a) {
        Map<a.InterfaceC0150a<?>, Object> map = this.L;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC0150a);
    }

    @Override // l8.r
    public final boolean L0() {
        return this.A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: M0 */
    public kotlin.reflect.jvm.internal.impl.descriptors.e y0(f fVar, Modality modality, k kVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.e build = v().c(fVar).k(modality).q(kVar).l(CallableMemberDescriptor.Kind.FAKE_OVERRIDE).a().build();
        if (build != null) {
            return build;
        }
        K(26);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean O0() {
        if (this.f13537v) {
            return true;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : z0().f()) {
            if (eVar.O0()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final c0 R() {
        return this.f13532q;
    }

    public abstract b S0(CallableMemberDescriptor.Kind kind, f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, d0 d0Var, m8.e eVar2, h9.e eVar3);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.Map] */
    public b T0(a aVar) {
        m8.e annotations;
        d0 d0Var;
        o8.f0 f0Var;
        o8.d dVar;
        r k3;
        boolean z10;
        boolean z11;
        u7.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> aVar2;
        boolean z12;
        boolean z13;
        boolean z14;
        kotlin.reflect.jvm.internal.impl.descriptors.e z02;
        if (aVar != null) {
            boolean[] zArr = new boolean[1];
            if (aVar.f13558s != null) {
                annotations = m0.b.J(getAnnotations(), aVar.f13558s);
            } else {
                annotations = getAnnotations();
            }
            m8.e eVar = annotations;
            f fVar = aVar.f13543b;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = aVar.f13545e;
            CallableMemberDescriptor.Kind kind = aVar.f13546f;
            h9.e eVar3 = aVar.f13552l;
            if (aVar.f13554o) {
                if (eVar2 != null) {
                    z02 = eVar2;
                } else {
                    z02 = z0();
                }
                d0Var = z02.j();
            } else {
                d0Var = d0.f15835a;
            }
            d0 d0Var2 = d0Var;
            if (d0Var2 != null) {
                b S0 = S0(kind, fVar, eVar2, d0Var2, eVar, eVar3);
                List<i0> list = aVar.f13557r;
                if (list == null) {
                    list = getTypeParameters();
                }
                zArr[0] = zArr[0] | (!list.isEmpty());
                ArrayList arrayList = new ArrayList(list.size());
                TypeSubstitutor E0 = a1.b.E0(list, aVar.f13542a, S0, arrayList, zArr);
                if (E0 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                boolean isEmpty = aVar.f13548h.isEmpty();
                Variance variance = Variance.IN_VARIANCE;
                if (!isEmpty) {
                    for (c0 c0Var : aVar.f13548h) {
                        r k10 = E0.k(c0Var.b(), variance);
                        if (k10 == null) {
                            return null;
                        }
                        arrayList2.add(k9.c.b(S0, k10, ((s9.f) c0Var.getValue()).a(), c0Var.getAnnotations()));
                        boolean z15 = zArr[0];
                        if (k10 != c0Var.b()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zArr[0] = z14 | z15;
                    }
                }
                c0 c0Var2 = aVar.f13549i;
                if (c0Var2 != null) {
                    r k11 = E0.k(c0Var2.b(), variance);
                    if (k11 == null) {
                        return null;
                    }
                    o8.f0 f0Var2 = new o8.f0(S0, new s9.d(S0, k11, aVar.f13549i.getValue()), aVar.f13549i.getAnnotations());
                    boolean z16 = zArr[0];
                    if (k11 != aVar.f13549i.b()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zArr[0] = z13 | z16;
                    f0Var = f0Var2;
                } else {
                    f0Var = null;
                }
                c0 c0Var3 = aVar.f13550j;
                if (c0Var3 != null) {
                    o8.d d5 = c0Var3.d(E0);
                    if (d5 == null) {
                        return null;
                    }
                    boolean z17 = zArr[0];
                    if (d5 != aVar.f13550j) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zArr[0] = z17 | z12;
                    dVar = d5;
                } else {
                    dVar = null;
                }
                ArrayList U0 = U0(S0, aVar.f13547g, E0, aVar.f13555p, aVar.f13554o, zArr);
                if (U0 == null || (k3 = E0.k(aVar.f13551k, Variance.OUT_VARIANCE)) == null) {
                    return null;
                }
                boolean z18 = zArr[0];
                if (k3 != aVar.f13551k) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z19 = z18 | z10;
                zArr[0] = z19;
                if (!z19 && aVar.f13562w) {
                    return this;
                }
                S0.V0(f0Var, dVar, arrayList2, arrayList, U0, k3, aVar.c, aVar.f13544d);
                S0.f13536u = this.f13536u;
                S0.f13537v = this.f13537v;
                S0.f13538w = this.f13538w;
                S0.f13539x = this.f13539x;
                S0.f13540y = this.f13540y;
                S0.D = this.D;
                S0.f13541z = this.f13541z;
                S0.A = this.A;
                S0.Y0(this.E);
                S0.B = aVar.f13556q;
                S0.C = aVar.f13559t;
                Boolean bool = aVar.f13561v;
                if (bool != null) {
                    z11 = bool.booleanValue();
                } else {
                    z11 = this.F;
                }
                S0.Z0(z11);
                if (!aVar.f13560u.isEmpty() || this.L != null) {
                    LinkedHashMap linkedHashMap = aVar.f13560u;
                    Map<a.InterfaceC0150a<?>, Object> map = this.L;
                    if (map != null) {
                        for (Map.Entry<a.InterfaceC0150a<?>, Object> entry : map.entrySet()) {
                            if (!linkedHashMap.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    int size = linkedHashMap.size();
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    if (size == 1) {
                        linkedHashMap2 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                    }
                    S0.L = linkedHashMap2;
                }
                if (aVar.n || this.K != null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.e eVar4 = this.K;
                    if (eVar4 == null) {
                        eVar4 = this;
                    }
                    S0.K = eVar4.d(E0);
                }
                if (aVar.f13553m && !z0().f().isEmpty()) {
                    if (aVar.f13542a.e()) {
                        aVar2 = this.H;
                        if (aVar2 == null) {
                            S0.s0(f());
                        }
                    } else {
                        aVar2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.a(this, E0);
                    }
                    S0.H = aVar2;
                }
                return S0;
            }
            K(27);
            throw null;
        }
        K(25);
        throw null;
    }

    public void V0(o8.f0 f0Var, c0 c0Var, List list, List list2, List list3, r rVar, Modality modality, m mVar) {
        if (list == null) {
            K(5);
            throw null;
        } else if (list2 == null) {
            K(6);
            throw null;
        } else if (list3 == null) {
            K(7);
            throw null;
        } else if (mVar == null) {
            K(8);
            throw null;
        } else {
            this.f13529m = kotlin.collections.c.L2(list2);
            this.n = kotlin.collections.c.L2(list3);
            this.f13530o = rVar;
            this.f13534s = modality;
            this.f13535t = mVar;
            this.f13532q = f0Var;
            this.f13533r = c0Var;
            this.f13531p = list;
            for (int i10 = 0; i10 < list2.size(); i10++) {
                i0 i0Var = (i0) list2.get(i10);
                if (i0Var.getIndex() != i10) {
                    throw new IllegalStateException(i0Var + " index is " + i0Var.getIndex() + " but position is " + i10);
                }
            }
            for (int i11 = 0; i11 < list3.size(); i11++) {
                h hVar = (h) list3.get(i11);
                if (hVar.getIndex() != i11 + 0) {
                    throw new IllegalStateException(hVar + "index is " + hVar.getIndex() + " but position is " + i11);
                }
            }
        }
    }

    public final a W0(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return new a(this, typeSubstitutor.g(), c(), p(), g(), h(), m(), b0(), this.f13532q, k());
        }
        K(24);
        throw null;
    }

    public final <V> void X0(a.InterfaceC0150a<V> interfaceC0150a, Object obj) {
        if (this.L == null) {
            this.L = new LinkedHashMap();
        }
        this.L.put(interfaceC0150a, obj);
    }

    public void Y0(boolean z10) {
        this.E = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean Z() {
        return this.F;
    }

    public void Z0(boolean z10) {
        this.F = z10;
    }

    @Override // o8.o
    /* renamed from: a */
    public kotlin.reflect.jvm.internal.impl.descriptors.e z0() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.I;
        kotlin.reflect.jvm.internal.impl.descriptors.e a10 = eVar == this ? this : eVar.a();
        if (a10 != null) {
            return a10;
        }
        K(20);
        throw null;
    }

    public final void a1(v vVar) {
        if (vVar != null) {
            this.f13530o = vVar;
        } else {
            K(11);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<c0> b0() {
        List<c0> list = this.f13531p;
        if (list != null) {
            return list;
        }
        K(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, l8.f0
    public kotlin.reflect.jvm.internal.impl.descriptors.e d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            K(22);
            throw null;
        } else if (typeSubstitutor.h()) {
            return this;
        } else {
            a W0 = W0(typeSubstitutor);
            W0.f13545e = z0();
            W0.f13554o = true;
            W0.f13562w = true;
            return W0.build();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> f() {
        u7.a<Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>> aVar = this.H;
        if (aVar != null) {
            this.G = aVar.k0();
            this.H = null;
        }
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> collection = this.G;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        K(14);
        throw null;
    }

    @Override // l8.j, l8.r
    public final m g() {
        m mVar = this.f13535t;
        if (mVar != null) {
            return mVar;
        }
        K(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<i0> getTypeParameters() {
        List<i0> list = this.f13529m;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor.Kind h() {
        CallableMemberDescriptor.Kind kind = this.J;
        if (kind != null) {
            return kind;
        }
        K(21);
        throw null;
    }

    public boolean i() {
        return this.f13539x;
    }

    public r k() {
        return this.f13530o;
    }

    @Override // l8.r
    public final boolean l0() {
        return this.f13541z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public final List<h> m() {
        List<h> list = this.n;
        if (list != null) {
            return list;
        }
        K(19);
        throw null;
    }

    @Override // l8.f
    public <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.c(this, d5);
    }

    @Override // l8.r
    public final Modality p() {
        Modality modality = this.f13534s;
        if (modality != null) {
            return modality;
        }
        K(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean q0() {
        return this.B;
    }

    public boolean r0() {
        return this.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void s0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            K(17);
            throw null;
        }
        this.G = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((kotlin.reflect.jvm.internal.impl.descriptors.e) it.next()).G0()) {
                this.C = true;
                return;
            }
        }
    }

    public boolean u0() {
        return this.f13540y;
    }

    public e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> v() {
        return W0(TypeSubstitutor.f14961b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.e
    public final boolean v0() {
        if (this.f13536u) {
            return true;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : z0().f()) {
            if (eVar.v0()) {
                return true;
            }
        }
        return false;
    }
}
