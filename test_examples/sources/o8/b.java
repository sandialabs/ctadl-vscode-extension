package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes.dex */
public abstract class b extends w {

    /* renamed from: i  reason: collision with root package name */
    public final h9.e f16380i;

    /* renamed from: j  reason: collision with root package name */
    public final x9.e<y9.v> f16381j;

    /* renamed from: k  reason: collision with root package name */
    public final x9.e<MemberScope> f16382k;

    /* renamed from: l  reason: collision with root package name */
    public final x9.e<l8.c0> f16383l;

    /* loaded from: classes.dex */
    public class a implements u7.a<y9.v> {
        public a() {
        }

        @Override // u7.a
        public final y9.v k0() {
            b bVar = b.this;
            return kotlin.reflect.jvm.internal.impl.types.r.o(bVar, bVar.I0(), new o8.a(this));
        }
    }

    /* renamed from: o8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0205b implements u7.a<MemberScope> {
        public C0205b() {
        }

        @Override // u7.a
        public final MemberScope k0() {
            return new r9.e(b.this.I0());
        }
    }

    /* loaded from: classes.dex */
    public class c implements u7.a<l8.c0> {
        public c() {
        }

        @Override // u7.a
        public final l8.c0 k0() {
            return new u(b.this);
        }
    }

    public b(x9.h hVar, h9.e eVar) {
        if (hVar == null) {
            z0(0);
            throw null;
        } else if (eVar == null) {
            z0(1);
            throw null;
        } else {
            this.f16380i = eVar;
            this.f16381j = hVar.a(new a());
            this.f16382k = hVar.a(new C0205b());
            this.f16383l = hVar.a(new c());
        }
    }

    public static /* synthetic */ void z0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case ma.i.f16046m /* 9 */:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case ma.i.f16047o /* 10 */:
            case ma.i.f16049q /* 15 */:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 5:
            case 6:
            case ma.i.f16046m /* 9 */:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 13:
            case ma.i.f16049q /* 15 */:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // l8.b
    public MemberScope I0() {
        MemberScope c0 = c0(DescriptorUtilsKt.i(k9.d.d(this)));
        if (c0 != null) {
            return c0;
        }
        z0(17);
        throw null;
    }

    @Override // o8.w
    public MemberScope K(kotlin.reflect.jvm.internal.impl.types.q qVar, kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        if (qVar == null) {
            z0(10);
            throw null;
        } else if (eVar == null) {
            z0(11);
            throw null;
        } else if (!qVar.e()) {
            return new SubstitutingScope(c0(eVar), TypeSubstitutor.d(qVar));
        } else {
            MemberScope c0 = c0(eVar);
            if (c0 != null) {
                return c0;
            }
            z0(12);
            throw null;
        }
    }

    @Override // l8.f0
    /* renamed from: M0 */
    public l8.b d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.h() ? this : new v(this, typeSubstitutor);
        }
        z0(18);
        throw null;
    }

    @Override // l8.b
    public List<l8.c0> N0() {
        List<l8.c0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        z0(6);
        throw null;
    }

    @Override // l8.b
    public final l8.c0 R0() {
        l8.c0 k02 = this.f16383l.k0();
        if (k02 != null) {
            return k02;
        }
        z0(5);
        throw null;
    }

    @Override // o8.w, l8.b, l8.f
    public final l8.b a() {
        return this;
    }

    @Override // o8.w, l8.b, l8.f
    public final l8.d a() {
        return this;
    }

    @Override // o8.w, l8.b, l8.f
    public final l8.f a() {
        return this;
    }

    @Override // l8.f
    public final h9.e getName() {
        h9.e eVar = this.f16380i;
        if (eVar != null) {
            return eVar;
        }
        z0(2);
        throw null;
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.j(this, d5);
    }

    @Override // l8.b, l8.d
    public final y9.v r() {
        y9.v k02 = this.f16381j.k0();
        if (k02 != null) {
            return k02;
        }
        z0(20);
        throw null;
    }

    @Override // l8.b
    public MemberScope w0() {
        MemberScope k02 = this.f16382k.k0();
        if (k02 != null) {
            return k02;
        }
        z0(4);
        throw null;
    }

    @Override // l8.b
    public final MemberScope y(kotlin.reflect.jvm.internal.impl.types.q qVar) {
        if (qVar == null) {
            z0(15);
            throw null;
        }
        MemberScope K = K(qVar, DescriptorUtilsKt.i(k9.d.d(this)));
        if (K != null) {
            return K;
        }
        z0(16);
        throw null;
    }
}
