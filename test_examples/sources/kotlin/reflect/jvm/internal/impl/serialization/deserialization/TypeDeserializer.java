package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import aa.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.l;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import l8.i0;
import m8.e;
import u9.g;
import u9.s;
import y9.d0;
import y9.e0;
import y9.f0;
import y9.g;
import y9.g0;
import y9.h0;
import y9.r;
import y9.v;
import y9.y;
import y9.z;

/* loaded from: classes.dex */
public final class TypeDeserializer {

    /* renamed from: a  reason: collision with root package name */
    public final g f14805a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeDeserializer f14806b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14807d;

    /* renamed from: e  reason: collision with root package name */
    public final x9.d f14808e;

    /* renamed from: f  reason: collision with root package name */
    public final x9.d f14809f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<Integer, i0> f14810g;

    public TypeDeserializer(g gVar, TypeDeserializer typeDeserializer, List<ProtoBuf$TypeParameter> list, String str, String str2) {
        Map<Integer, i0> linkedHashMap;
        v7.g.f(gVar, "c");
        v7.g.f(list, "typeParameterProtos");
        v7.g.f(str, "debugName");
        this.f14805a = gVar;
        this.f14806b = typeDeserializer;
        this.c = str;
        this.f14807d = str2;
        u9.e eVar = gVar.f17920a;
        this.f14808e = eVar.f17901a.h(new TypeDeserializer$classifierDescriptors$1(this));
        this.f14809f = eVar.f17901a.h(new TypeDeserializer$typeAliasDescriptors$1(this));
        if (list.isEmpty()) {
            linkedHashMap = kotlin.collections.d.K1();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i10 = 0;
            for (ProtoBuf$TypeParameter protoBuf$TypeParameter : list) {
                linkedHashMap.put(Integer.valueOf(protoBuf$TypeParameter.f14353l), new DeserializedTypeParameterDescriptor(this.f14805a, protoBuf$TypeParameter, i10));
                i10++;
            }
        }
        this.f14810g = linkedHashMap;
    }

    public static final ArrayList e(ProtoBuf$Type protoBuf$Type, TypeDeserializer typeDeserializer) {
        Iterable iterable;
        List<ProtoBuf$Type.Argument> list = protoBuf$Type.f14281l;
        v7.g.e(list, "argumentList");
        ProtoBuf$Type a10 = f9.f.a(protoBuf$Type, typeDeserializer.f14805a.f17922d);
        if (a10 != null) {
            iterable = e(a10, typeDeserializer);
        } else {
            iterable = null;
        }
        if (iterable == null) {
            iterable = EmptyList.f12981i;
        }
        return kotlin.collections.c.z2(iterable, list);
    }

    public static l f(List list, m8.e eVar, e0 e0Var, l8.f fVar) {
        ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d0) it.next()).a(eVar));
        }
        ArrayList a22 = n7.l.a2(arrayList);
        l.f15045j.getClass();
        return l.a.c(a22);
    }

    public final v a(int i10) {
        g gVar = this.f14805a;
        if (m0.b.j0(gVar.f17921b, i10).c) {
            gVar.f17920a.f17906g.a();
        }
        return null;
    }

    public final List<i0> b() {
        return kotlin.collections.c.L2(this.f14810g.values());
    }

    public final i0 c(int i10) {
        i0 i0Var = this.f14810g.get(Integer.valueOf(i10));
        if (i0Var == null) {
            TypeDeserializer typeDeserializer = this.f14806b;
            if (typeDeserializer != null) {
                return typeDeserializer.c(i10);
            }
            return null;
        }
        return i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x044d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e A[LOOP:1: B:57:0x0118->B:59:0x011e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v d(ProtoBuf$Type protoBuf$Type, boolean z10) {
        boolean z11;
        int i10;
        boolean r3;
        boolean z12;
        boolean z13;
        boolean z14;
        e0 d5;
        l8.d dVar;
        int i11;
        Object obj;
        v f10;
        ProtoBuf$Type protoBuf$Type2;
        v f11;
        FunctionClassKind functionClassKind;
        boolean z15;
        f0 f0Var;
        r b5;
        h9.c cVar;
        h9.c cVar2;
        int size;
        int i12;
        boolean z16;
        boolean z17;
        m8.e fVar;
        boolean z18;
        Variance variance;
        boolean z19;
        boolean z20;
        ProtoBuf$Type protoBuf$Type3;
        g0 h0Var;
        ArrayList Z0;
        Iterator it;
        int i13;
        v7.g.f(protoBuf$Type, "proto");
        if (protoBuf$Type.r()) {
            i10 = protoBuf$Type.f14285q;
        } else {
            if ((protoBuf$Type.f14280k & 128) == 128) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i10 = protoBuf$Type.f14288t;
            }
            r3 = protoBuf$Type.r();
            g gVar = this.f14805a;
            if (!r3) {
                dVar = (l8.d) this.f14808e.U(Integer.valueOf(protoBuf$Type.f14285q));
                if (dVar == null) {
                    i11 = protoBuf$Type.f14285q;
                    h9.b j02 = m0.b.j0(gVar.f17921b, i11);
                    Z0 = kotlin.sequences.a.Z0(kotlin.sequences.a.W0(SequencesKt__SequencesKt.O0(protoBuf$Type, new TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1(this)), TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2.f14817j));
                    it = SequencesKt__SequencesKt.O0(j02, TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.f14815r).iterator();
                    i13 = 0;
                    while (it.hasNext()) {
                        it.next();
                        i13++;
                        if (i13 < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                    while (Z0.size() < i13) {
                        Z0.add(0);
                    }
                    dVar = gVar.f17920a.f17911l.a(j02, Z0);
                }
                d5 = dVar.o();
                v7.g.e(d5, "classifier.typeConstructor");
            } else {
                int i14 = protoBuf$Type.f14280k;
                if ((i14 & 32) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    dVar = c(protoBuf$Type.f14286r);
                    if (dVar == null) {
                        h hVar = h.f405a;
                        d5 = h.d(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(protoBuf$Type.f14286r), this.f14807d);
                    }
                    d5 = dVar.o();
                    v7.g.e(d5, "classifier.typeConstructor");
                } else {
                    if ((i14 & 64) == 64) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        String string = gVar.f17921b.getString(protoBuf$Type.f14287s);
                        Iterator<T> it2 = b().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (v7.g.a(((i0) obj).getName().b(), string)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        i0 i0Var = (i0) obj;
                        if (i0Var == null) {
                            h hVar2 = h.f405a;
                            d5 = h.d(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, gVar.c.toString());
                        } else {
                            dVar = i0Var;
                            d5 = dVar.o();
                            v7.g.e(d5, "classifier.typeConstructor");
                        }
                    } else {
                        if ((i14 & 128) == 128) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            dVar = (l8.d) this.f14809f.U(Integer.valueOf(protoBuf$Type.f14288t));
                            if (dVar == null) {
                                i11 = protoBuf$Type.f14288t;
                                h9.b j022 = m0.b.j0(gVar.f17921b, i11);
                                Z0 = kotlin.sequences.a.Z0(kotlin.sequences.a.W0(SequencesKt__SequencesKt.O0(protoBuf$Type, new TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1(this)), TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2.f14817j));
                                it = SequencesKt__SequencesKt.O0(j022, TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.f14815r).iterator();
                                i13 = 0;
                                while (it.hasNext()) {
                                }
                                while (Z0.size() < i13) {
                                }
                                dVar = gVar.f17920a.f17911l.a(j022, Z0);
                            }
                            d5 = dVar.o();
                            v7.g.e(d5, "classifier.typeConstructor");
                        } else {
                            h hVar3 = h.f405a;
                            d5 = h.d(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
                        }
                    }
                }
            }
            if (!h.f(d5.c())) {
                h hVar4 = h.f405a;
                return h.e(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, EmptyList.f12981i, d5, (String[]) Arrays.copyOf(new String[]{d5.toString()}, 1));
            }
            w9.a aVar = new w9.a(gVar.f17920a.f17901a, new TypeDeserializer$simpleType$annotations$1(protoBuf$Type, this));
            u9.e eVar = gVar.f17920a;
            List<d0> list = eVar.f17917s;
            l8.f fVar2 = gVar.c;
            l f12 = f(list, aVar, d5, fVar2);
            ArrayList e10 = e(protoBuf$Type, this);
            ArrayList arrayList = new ArrayList(n7.l.Z1(e10, 10));
            Iterator it3 = e10.iterator();
            int i15 = 0;
            while (true) {
                boolean hasNext = it3.hasNext();
                f9.g gVar2 = gVar.f17922d;
                if (hasNext) {
                    Object next = it3.next();
                    int i16 = i15 + 1;
                    if (i15 >= 0) {
                        ProtoBuf$Type.Argument argument = (ProtoBuf$Type.Argument) next;
                        List<i0> e11 = d5.e();
                        Iterator it4 = it3;
                        v7.g.e(e11, "constructor.parameters");
                        i0 i0Var2 = (i0) kotlin.collections.c.q2(i15, e11);
                        ProtoBuf$Type.Argument.Projection projection = argument.f14299k;
                        if (projection == ProtoBuf$Type.Argument.Projection.f14306m) {
                            if (i0Var2 == null) {
                                h0Var = new z(eVar.f17902b.u());
                            } else {
                                h0Var = new StarProjectionImpl(i0Var2);
                            }
                        } else {
                            v7.g.e(projection, "typeArgumentProto.projection");
                            int ordinal = projection.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        if (ordinal != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                                    }
                                    variance = Variance.INVARIANT;
                                } else {
                                    variance = Variance.OUT_VARIANCE;
                                }
                            } else {
                                variance = Variance.IN_VARIANCE;
                            }
                            v7.g.f(gVar2, "typeTable");
                            int i17 = argument.f14298j;
                            if ((i17 & 2) == 2) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                protoBuf$Type3 = argument.f14300l;
                            } else {
                                if ((i17 & 4) == 4) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                if (z20) {
                                    protoBuf$Type3 = gVar2.a(argument.f14301m);
                                } else {
                                    protoBuf$Type3 = null;
                                }
                            }
                            if (protoBuf$Type3 == null) {
                                h0Var = new h0(h.c(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                            } else {
                                h0Var = new h0(g(protoBuf$Type3), variance);
                            }
                        }
                        arrayList.add(h0Var);
                        i15 = i16;
                        it3 = it4;
                    } else {
                        a1.c.F1();
                        throw null;
                    }
                } else {
                    List L2 = kotlin.collections.c.L2(arrayList);
                    l8.d c = d5.c();
                    if (z10 && (c instanceof l8.h0)) {
                        int i18 = KotlinTypeFactory.f14947a;
                        v b10 = KotlinTypeFactory.b((l8.h0) c, L2);
                        List<d0> list2 = eVar.f17917s;
                        ArrayList x22 = kotlin.collections.c.x2(aVar, b10.getAnnotations());
                        if (x22.isEmpty()) {
                            fVar = e.a.f16014a;
                        } else {
                            fVar = new m8.f(x22);
                        }
                        l f13 = f(list2, fVar, d5, fVar2);
                        if (!kotlin.reflect.jvm.internal.impl.types.r.g(b10) && !protoBuf$Type.f14282m) {
                            z18 = false;
                            f10 = b10.Y0(z18).a1(f13);
                        }
                        z18 = true;
                        f10 = b10.Y0(z18).a1(f13);
                    } else if (a4.b.v(f9.b.f10977a, protoBuf$Type.f14293y, "SUSPEND_TYPE.get(proto.flags)")) {
                        boolean z21 = protoBuf$Type.f14282m;
                        int size2 = d5.e().size() - L2.size();
                        if (size2 != 0) {
                            if (size2 == 1 && (size = L2.size() - 1) >= 0) {
                                e0 o10 = d5.u().w(size).o();
                                v7.g.e(o10, "functionTypeConstructor.…on(arity).typeConstructor");
                                f11 = KotlinTypeFactory.f(f12, o10, L2, z21, null);
                                if (f11 != null) {
                                    h hVar5 = h.f405a;
                                    f10 = h.e(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, L2, d5, new String[0]);
                                } else {
                                    f10 = f11;
                                }
                            }
                            f11 = null;
                            if (f11 != null) {
                            }
                        } else {
                            f11 = KotlinTypeFactory.f(f12, d5, L2, z21, null);
                            l8.d c10 = f11.U0().c();
                            if (c10 != null) {
                                functionClassKind = kotlin.reflect.jvm.internal.impl.builtins.c.e(c10);
                            } else {
                                functionClassKind = null;
                            }
                            if (functionClassKind == FunctionClassKind.f13335l) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15 && (f0Var = (f0) kotlin.collections.c.w2(kotlin.reflect.jvm.internal.impl.builtins.c.g(f11))) != null && (b5 = f0Var.b()) != null) {
                                l8.d c11 = b5.U0().c();
                                if (c11 != null) {
                                    cVar = DescriptorUtilsKt.g(c11);
                                } else {
                                    cVar = null;
                                }
                                if (b5.S0().size() == 1 && (v7.g.a(cVar, kotlin.reflect.jvm.internal.impl.builtins.g.f13349f) || v7.g.a(cVar, s.f17943a))) {
                                    r b11 = ((f0) kotlin.collections.c.C2(b5.S0())).b();
                                    v7.g.e(b11, "continuationArgumentType.arguments.single().type");
                                    if (!(fVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
                                        fVar2 = null;
                                    }
                                    kotlin.reflect.jvm.internal.impl.descriptors.a aVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) fVar2;
                                    if (aVar2 != null) {
                                        cVar2 = DescriptorUtilsKt.c(aVar2);
                                    } else {
                                        cVar2 = null;
                                    }
                                    v7.g.a(cVar2, u9.r.f17942a);
                                    kotlin.reflect.jvm.internal.impl.builtins.e g10 = TypeUtilsKt.g(f11);
                                    m8.e annotations = f11.getAnnotations();
                                    r f14 = kotlin.reflect.jvm.internal.impl.builtins.c.f(f11);
                                    List<r> d10 = kotlin.reflect.jvm.internal.impl.builtins.c.d(f11);
                                    List<f0> j2 = kotlin.collections.c.j2(kotlin.reflect.jvm.internal.impl.builtins.c.g(f11));
                                    ArrayList arrayList2 = new ArrayList(n7.l.Z1(j2, 10));
                                    for (f0 f0Var2 : j2) {
                                        arrayList2.add(f0Var2.b());
                                    }
                                    f11 = kotlin.reflect.jvm.internal.impl.builtins.c.b(g10, annotations, f14, d10, arrayList2, b11, true).Y0(f11.V0());
                                }
                                f10 = f11;
                            }
                            f11 = null;
                            f10 = f11;
                        }
                    } else {
                        f10 = KotlinTypeFactory.f(f12, d5, L2, protoBuf$Type.f14282m, null);
                        if (a4.b.v(f9.b.f10978b, protoBuf$Type.f14293y, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)")) {
                            y9.g a10 = g.a.a(f10, true);
                            if (a10 != null) {
                                f10 = a10;
                            } else {
                                throw new IllegalStateException(("null DefinitelyNotNullType for '" + f10 + '\'').toString());
                            }
                        }
                        protoBuf$Type2 = null;
                        v7.g.f(gVar2, "typeTable");
                        i12 = protoBuf$Type.f14280k;
                        if ((i12 & 1024) != 1024) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (!z16) {
                            protoBuf$Type2 = protoBuf$Type.f14291w;
                        } else {
                            if ((i12 & 2048) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                protoBuf$Type2 = gVar2.a(protoBuf$Type.f14292x);
                            }
                        }
                        if (protoBuf$Type2 != null) {
                            f10 = y.c(f10, d(protoBuf$Type2, false));
                        }
                        if (!protoBuf$Type.r()) {
                            return eVar.f17916r.a(m0.b.j0(gVar.f17921b, protoBuf$Type.f14285q), f10);
                        }
                        return f10;
                    }
                    protoBuf$Type2 = null;
                    v7.g.f(gVar2, "typeTable");
                    i12 = protoBuf$Type.f14280k;
                    if ((i12 & 1024) != 1024) {
                    }
                    if (!z16) {
                    }
                    if (protoBuf$Type2 != null) {
                    }
                    if (!protoBuf$Type.r()) {
                    }
                }
            }
        }
        a(i10);
        r3 = protoBuf$Type.r();
        u9.g gVar3 = this.f14805a;
        if (!r3) {
        }
        if (!h.f(d5.c())) {
        }
    }

    public final r g(ProtoBuf$Type protoBuf$Type) {
        boolean z10;
        boolean z11;
        ProtoBuf$Type protoBuf$Type2;
        v7.g.f(protoBuf$Type, "proto");
        boolean z12 = false;
        if ((protoBuf$Type.f14280k & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            u9.g gVar = this.f14805a;
            String string = gVar.f17921b.getString(protoBuf$Type.n);
            v d5 = d(protoBuf$Type, true);
            f9.g gVar2 = gVar.f17922d;
            v7.g.f(gVar2, "typeTable");
            int i10 = protoBuf$Type.f14280k;
            if ((i10 & 4) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                protoBuf$Type2 = protoBuf$Type.f14283o;
            } else {
                if ((i10 & 8) == 8) {
                    z12 = true;
                }
                if (z12) {
                    protoBuf$Type2 = gVar2.a(protoBuf$Type.f14284p);
                } else {
                    protoBuf$Type2 = null;
                }
            }
            v7.g.c(protoBuf$Type2);
            return gVar.f17920a.f17909j.a(protoBuf$Type, string, d5, d(protoBuf$Type2, true));
        }
        return d(protoBuf$Type, true);
    }

    public final String toString() {
        TypeDeserializer typeDeserializer;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        if (this.f14806b == null) {
            str = "";
        } else {
            str = ". Child of " + typeDeserializer.c;
        }
        sb.append(str);
        return sb.toString();
    }
}
