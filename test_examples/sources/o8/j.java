package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes.dex */
public class j extends kotlin.reflect.jvm.internal.impl.descriptors.impl.b implements kotlin.reflect.jvm.internal.impl.descriptors.b {
    public final boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l8.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.c cVar, m8.e eVar, boolean z10, CallableMemberDescriptor.Kind kind, l8.d0 d0Var) {
        super(kind, bVar, cVar, d0Var, eVar, h9.g.f11578e);
        if (bVar == null) {
            K(0);
            throw null;
        } else if (eVar == null) {
            K(1);
            throw null;
        } else if (kind == null) {
            K(2);
            throw null;
        } else if (d0Var == null) {
            K(3);
            throw null;
        } else {
            this.M = z10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case ma.i.f16049q /* 15 */:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 21 && i10 != 27) {
                switch (i10) {
                    case ma.i.f16049q /* 15 */:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 5:
                    case 8:
                    case 25:
                        objArr[0] = "annotations";
                        break;
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    case 24:
                        objArr[0] = "kind";
                        break;
                    case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    case 6:
                    case ma.i.f16046m /* 9 */:
                    case 26:
                        objArr[0] = "source";
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case ma.i.f16047o /* 10 */:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case 14:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case ma.i.f16049q /* 15 */:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case 20:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 22:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case 23:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i10 != 21) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i10 != 27) {
                    switch (i10) {
                        case ma.i.f16049q /* 15 */:
                        case 16:
                            objArr[1] = "calculateContextReceiverParameters";
                            break;
                        case 17:
                            objArr[1] = "getContainingDeclaration";
                            break;
                        case 18:
                            objArr[1] = "getConstructedClass";
                            break;
                        case 19:
                            objArr[1] = "getOriginal";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i10) {
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    case 5:
                    case 6:
                        objArr[2] = "create";
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                    case ma.i.f16046m /* 9 */:
                        objArr[2] = "createSynthesized";
                        break;
                    case ma.i.f16047o /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "initialize";
                        break;
                    case ma.i.f16049q /* 15 */:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        break;
                    case 20:
                        objArr[2] = "substitute";
                        break;
                    case 22:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 21 && i10 != 27) {
                    switch (i10) {
                        case ma.i.f16049q /* 15 */:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
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
            if (i10 != 21) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 21) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 21) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 21) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 21) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 != 21) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 21) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.e M0(l8.f fVar, Modality modality, l8.k kVar) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.b) super.y0(fVar, modality, kVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c
    public final boolean O() {
        return this.M;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c
    public final l8.b P() {
        l8.b c = c();
        if (c != null) {
            return c;
        }
        K(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, o8.o
    /* renamed from: a */
    public final kotlin.reflect.jvm.internal.impl.descriptors.b z0() {
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) super.z0();
        if (bVar != null) {
            return bVar;
        }
        K(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b
    /* renamed from: b1 */
    public j S0(CallableMemberDescriptor.Kind kind, l8.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, l8.d0 d0Var, m8.e eVar2, h9.e eVar3) {
        if (fVar == null) {
            K(23);
            throw null;
        } else if (kind == null) {
            K(24);
            throw null;
        } else if (eVar2 == null) {
            K(25);
            throw null;
        } else {
            CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
            if (kind != kind2 && kind != CallableMemberDescriptor.Kind.SYNTHESIZED) {
                throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + fVar + "\nkind: " + kind);
            }
            return new j((l8.b) fVar, this, eVar2, this.M, kind2, d0Var);
        }
    }

    @Override // o8.o, l8.f
    /* renamed from: c1 */
    public final l8.b c() {
        l8.b bVar = (l8.b) super.c();
        if (bVar != null) {
            return bVar;
        }
        K(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e, l8.f0
    public final kotlin.reflect.jvm.internal.impl.descriptors.b d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.b) super.d(typeSubstitutor);
        }
        K(20);
        throw null;
    }

    public final void d1(List list, l8.m mVar) {
        if (list == null) {
            K(13);
            throw null;
        } else if (mVar != null) {
            e1(list, mVar, c().x());
        } else {
            K(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(List list, l8.m mVar, List list2) {
        l8.c0 c0Var;
        l8.b c;
        List<l8.c0> emptyList;
        if (list != null) {
            if (mVar != null) {
                if (list2 != null) {
                    l8.b c10 = c();
                    if (c10.m0()) {
                        l8.f c11 = c10.c();
                        if (c11 instanceof l8.b) {
                            c0Var = ((l8.b) c11).R0();
                            c = c();
                            if (c.N0().isEmpty()) {
                                emptyList = c.N0();
                                if (emptyList == null) {
                                    K(15);
                                    throw null;
                                }
                            } else {
                                emptyList = Collections.emptyList();
                                if (emptyList == null) {
                                    K(16);
                                    throw null;
                                }
                            }
                            V0(null, c0Var, emptyList, list2, list, null, Modality.FINAL, mVar);
                            return;
                        }
                    }
                    c0Var = null;
                    c = c();
                    if (c.N0().isEmpty()) {
                    }
                    V0(null, c0Var, emptyList, list2, list, null, Modality.FINAL, mVar);
                    return;
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    public final Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> f() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        K(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return hVar.e(this, d5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void s0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            return;
        }
        K(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor y0(l8.f fVar, Modality modality, l8.k kVar) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.b) super.y0(fVar, modality, kVar);
    }
}
