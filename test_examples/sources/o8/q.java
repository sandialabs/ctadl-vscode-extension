package o8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import l8.l;

/* loaded from: classes.dex */
public final class q extends k {

    /* renamed from: p  reason: collision with root package name */
    public final y9.d f16453p;

    /* renamed from: q  reason: collision with root package name */
    public final a f16454q;

    /* renamed from: r  reason: collision with root package name */
    public final x9.e<Set<h9.e>> f16455r;

    /* renamed from: s  reason: collision with root package name */
    public final m8.e f16456s;

    /* loaded from: classes.dex */
    public class a extends r9.f {

        /* renamed from: b  reason: collision with root package name */
        public final x9.c<h9.e, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> f16457b;
        public final x9.c<h9.e, Collection<? extends l8.z>> c;

        /* renamed from: d  reason: collision with root package name */
        public final x9.e<Collection<l8.f>> f16458d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ q f16459e;

        /* renamed from: o8.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0206a implements u7.l<h9.e, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g>> {
            public C0206a() {
            }

            @Override // u7.l
            public final Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.g> U(h9.e eVar) {
                h9.e eVar2 = eVar;
                a aVar = a.this;
                if (eVar2 != null) {
                    return aVar.j(aVar.i().a(eVar2, NoLookupLocation.FOR_NON_TRACKED_SCOPE), eVar2);
                }
                aVar.getClass();
                a.h(8);
                throw null;
            }
        }

        /* loaded from: classes.dex */
        public class b implements u7.l<h9.e, Collection<? extends l8.z>> {
            public b() {
            }

            @Override // u7.l
            public final Collection<? extends l8.z> U(h9.e eVar) {
                h9.e eVar2 = eVar;
                a aVar = a.this;
                if (eVar2 != null) {
                    return aVar.j(aVar.i().b(eVar2, NoLookupLocation.FOR_NON_TRACKED_SCOPE), eVar2);
                }
                aVar.getClass();
                a.h(4);
                throw null;
            }
        }

        /* loaded from: classes.dex */
        public class c implements u7.a<Collection<l8.f>> {
            public c() {
            }

            @Override // u7.a
            public final Collection<l8.f> k0() {
                a aVar = a.this;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                for (h9.e eVar : aVar.f16459e.f16455r.k0()) {
                    NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(aVar.a(eVar, noLookupLocation));
                    hashSet.addAll(aVar.b(eVar, noLookupLocation));
                }
                return hashSet;
            }
        }

        public a(q qVar, x9.h hVar) {
            if (hVar == null) {
                h(0);
                throw null;
            }
            this.f16459e = qVar;
            this.f16457b = hVar.e(new C0206a());
            this.c = hVar.e(new b());
            this.f16458d = hVar.a(new c());
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void h(int i10) {
            String str;
            int i11;
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
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
                if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
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
                        case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        case 5:
                        case 8:
                        case ma.i.f16047o /* 10 */:
                            objArr[0] = "name";
                            break;
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        case 6:
                            objArr[0] = "location";
                            break;
                        case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        case ma.i.f16046m /* 9 */:
                        case 12:
                        case ma.i.f16049q /* 15 */:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                            break;
                        case 11:
                            objArr[0] = "fromSupertypes";
                            break;
                        case 13:
                            objArr[0] = "kindFilter";
                            break;
                        case 14:
                            objArr[0] = "nameFilter";
                            break;
                        case 20:
                            objArr[0] = "p";
                            break;
                        default:
                            objArr[0] = "storageManager";
                            break;
                    }
                    if (i10 != 3) {
                        objArr[1] = "getContributedVariables";
                    } else if (i10 == 7) {
                        objArr[1] = "getContributedFunctions";
                    } else if (i10 == 9) {
                        objArr[1] = "getSupertypeScope";
                    } else if (i10 != 12) {
                        switch (i10) {
                            case ma.i.f16049q /* 15 */:
                                objArr[1] = "getContributedDescriptors";
                                break;
                            case 16:
                                objArr[1] = "computeAllDeclarations";
                                break;
                            case 17:
                                objArr[1] = "getFunctionNames";
                                break;
                            case 18:
                                objArr[1] = "getClassifierNames";
                                break;
                            case 19:
                                objArr[1] = "getVariableNames";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                break;
                        }
                    } else {
                        objArr[1] = "resolveFakeOverrides";
                    }
                    switch (i10) {
                        case 1:
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                            objArr[2] = "getContributedVariables";
                            break;
                        case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        case ma.i.f16046m /* 9 */:
                        case 12:
                        case ma.i.f16049q /* 15 */:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                            objArr[2] = "computeProperties";
                            break;
                        case 5:
                        case 6:
                            objArr[2] = "getContributedFunctions";
                            break;
                        case 8:
                            objArr[2] = "computeFunctions";
                            break;
                        case ma.i.f16047o /* 10 */:
                        case 11:
                            objArr[2] = "resolveFakeOverrides";
                            break;
                        case 13:
                        case 14:
                            objArr[2] = "getContributedDescriptors";
                            break;
                        case 20:
                            objArr[2] = "printScopeStructure";
                            break;
                        default:
                            objArr[2] = "<init>";
                            break;
                    }
                    String format = String.format(str, objArr);
                    if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
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
                if (i10 != 3) {
                }
                switch (i10) {
                }
                String format2 = String.format(str, objArr2);
                if (i10 != 3) {
                    switch (i10) {
                    }
                }
                throw new IllegalStateException(format2);
            }
            str = "@NotNull method %s.%s must not return null";
            if (i10 != 3) {
                switch (i10) {
                }
                Object[] objArr22 = new Object[i11];
                switch (i10) {
                }
                if (i10 != 3) {
                }
                switch (i10) {
                }
                String format22 = String.format(str, objArr22);
                if (i10 != 3) {
                }
                throw new IllegalStateException(format22);
            }
            i11 = 2;
            Object[] objArr222 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 3) {
            }
            switch (i10) {
            }
            String format222 = String.format(str, objArr222);
            if (i10 != 3) {
            }
            throw new IllegalStateException(format222);
        }

        @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection a(h9.e eVar, NoLookupLocation noLookupLocation) {
            if (eVar == null) {
                h(5);
                throw null;
            }
            Collection collection = (Collection) ((LockBasedStorageManager.k) this.f16457b).U(eVar);
            if (collection != null) {
                return collection;
            }
            h(7);
            throw null;
        }

        @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Collection b(h9.e eVar, NoLookupLocation noLookupLocation) {
            if (eVar == null) {
                h(1);
                throw null;
            }
            Collection collection = (Collection) ((LockBasedStorageManager.k) this.c).U(eVar);
            if (collection != null) {
                return collection;
            }
            h(3);
            throw null;
        }

        @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set<h9.e> c() {
            Set<h9.e> k02 = this.f16459e.f16455r.k0();
            if (k02 != null) {
                return k02;
            }
            h(17);
            throw null;
        }

        @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set<h9.e> d() {
            Set<h9.e> k02 = this.f16459e.f16455r.k0();
            if (k02 != null) {
                return k02;
            }
            h(19);
            throw null;
        }

        @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public final Collection<l8.f> f(r9.c cVar, u7.l<? super h9.e, Boolean> lVar) {
            if (cVar == null) {
                h(13);
                throw null;
            } else if (lVar == null) {
                h(14);
                throw null;
            } else {
                Collection<l8.f> k02 = this.f16458d.k0();
                if (k02 != null) {
                    return k02;
                }
                h(15);
                throw null;
            }
        }

        @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set<h9.e> g() {
            Set<h9.e> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(18);
            throw null;
        }

        public final MemberScope i() {
            MemberScope w10 = ((AbstractTypeConstructor) this.f16459e.o()).f().iterator().next().w();
            if (w10 != null) {
                return w10;
            }
            h(9);
            throw null;
        }

        public final LinkedHashSet j(Collection collection, h9.e eVar) {
            if (eVar == null) {
                h(10);
                throw null;
            } else if (collection == null) {
                h(11);
                throw null;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                OverridingUtil.f14687f.h(eVar, collection, Collections.emptySet(), this.f16459e, new r(linkedHashSet));
                return linkedHashSet;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x9.h hVar, l8.b bVar, y9.v vVar, h9.e eVar, x9.e eVar2, m8.e eVar3, l8.d0 d0Var) {
        super(hVar, bVar, eVar, d0Var);
        if (hVar == null) {
            z0(6);
            throw null;
        } else if (bVar == null) {
            z0(7);
            throw null;
        } else if (vVar == null) {
            z0(8);
            throw null;
        } else if (eVar == null) {
            z0(9);
            throw null;
        } else if (eVar2 == null) {
            z0(10);
            throw null;
        } else if (d0Var == null) {
            z0(12);
            throw null;
        } else {
            this.f16456s = eVar3;
            this.f16453p = new y9.d(this, Collections.emptyList(), Collections.singleton(vVar), hVar);
            this.f16454q = new a(this, hVar);
            this.f16455r = eVar2;
        }
    }

    public static q S0(x9.h hVar, l8.b bVar, h9.e eVar, x9.e<Set<h9.e>> eVar2, m8.e eVar3, l8.d0 d0Var) {
        if (hVar == null) {
            z0(0);
            throw null;
        } else if (bVar == null) {
            z0(1);
            throw null;
        } else if (eVar == null) {
            z0(2);
            throw null;
        } else if (eVar2 == null) {
            z0(3);
            throw null;
        } else if (d0Var != null) {
            return new q(hVar, bVar, bVar.r(), eVar, eVar2, eVar3, d0Var);
        } else {
            z0(5);
            throw null;
        }
    }

    public static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case ma.i.f16046m /* 9 */:
                objArr[0] = "name";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case ma.i.f16047o /* 10 */:
                objArr[0] = "enumMemberNames";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case ma.i.f16049q /* 15 */:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case ma.i.f16046m /* 9 */:
            case ma.i.f16047o /* 10 */:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 14:
            case ma.i.f16049q /* 15 */:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // l8.b
    public final kotlin.reflect.jvm.internal.impl.descriptors.b A0() {
        return null;
    }

    @Override // l8.b
    public final MemberScope B0() {
        MemberScope.a aVar = MemberScope.a.f14741b;
        if (aVar != null) {
            return aVar;
        }
        z0(15);
        throw null;
    }

    @Override // l8.b
    public final l8.b E0() {
        return null;
    }

    @Override // l8.b
    public final boolean H() {
        return false;
    }

    @Override // l8.b
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        z0(16);
        throw null;
    }

    @Override // l8.r
    public final boolean L0() {
        return false;
    }

    @Override // l8.b
    public final boolean Q0() {
        return false;
    }

    @Override // l8.b
    public final boolean T() {
        return false;
    }

    @Override // o8.w
    public final MemberScope c0(kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        if (eVar == null) {
            z0(13);
            throw null;
        }
        a aVar = this.f16454q;
        if (aVar != null) {
            return aVar;
        }
        z0(14);
        throw null;
    }

    @Override // l8.b
    public final Collection<l8.b> e0() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        z0(23);
        throw null;
    }

    @Override // l8.b, l8.j, l8.r
    public final l8.m g() {
        l.h hVar = l8.l.f15842e;
        if (hVar != null) {
            return hVar;
        }
        z0(20);
        throw null;
    }

    @Override // m8.a
    public final m8.e getAnnotations() {
        m8.e eVar = this.f16456s;
        if (eVar != null) {
            return eVar;
        }
        z0(21);
        throw null;
    }

    @Override // l8.b
    public final ClassKind h() {
        return ClassKind.f13434l;
    }

    @Override // l8.b
    public final boolean i() {
        return false;
    }

    @Override // l8.b
    public final boolean i0() {
        return false;
    }

    @Override // l8.r
    public final boolean l0() {
        return false;
    }

    @Override // l8.e
    public final boolean m0() {
        return false;
    }

    @Override // l8.d
    public final y9.e0 o() {
        y9.d dVar = this.f16453p;
        if (dVar != null) {
            return dVar;
        }
        z0(17);
        throw null;
    }

    @Override // l8.b, l8.r
    public final Modality p() {
        return Modality.FINAL;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // l8.b, l8.e
    public final List<l8.i0> x() {
        List<l8.i0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        z0(22);
        throw null;
    }

    @Override // l8.b
    public final l8.j0<y9.v> x0() {
        return null;
    }
}
