package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import f9.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.f;
import l8.c0;
import l8.d0;
import l8.i0;
import l8.u;
import m8.e;
import n7.l;
import o8.d0;
import o8.e0;
import o8.f0;
import o8.s;
import u9.g;
import u9.p;
import u9.q;
import w9.i;
import w9.j;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class MemberDeserializer {

    /* renamed from: a  reason: collision with root package name */
    public final g f14777a;

    /* renamed from: b  reason: collision with root package name */
    public final u9.a f14778b;

    public MemberDeserializer(g gVar) {
        v7.g.f(gVar, "c");
        this.f14777a = gVar;
        u9.e eVar = gVar.f17920a;
        this.f14778b = new u9.a(eVar.f17902b, eVar.f17911l);
    }

    public final f a(l8.f fVar) {
        if (fVar instanceof u) {
            h9.c e10 = ((u) fVar).e();
            g gVar = this.f14777a;
            return new f.b(e10, gVar.f17921b, gVar.f17922d, gVar.f17925g);
        } else if (fVar instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) fVar).E;
        } else {
            return null;
        }
    }

    public final m8.e b(h hVar, int i10, AnnotatedCallableKind annotatedCallableKind) {
        if (!f9.b.c.c(i10).booleanValue()) {
            return e.a.f16014a;
        }
        return new j(this.f14777a.f17920a.f17901a, new MemberDeserializer$getAnnotations$1(this, hVar, annotatedCallableKind));
    }

    public final m8.e c(ProtoBuf$Property protoBuf$Property, boolean z10) {
        if (!f9.b.c.c(protoBuf$Property.f14220l).booleanValue()) {
            return e.a.f16014a;
        }
        return new j(this.f14777a.f17920a.f17901a, new MemberDeserializer$getPropertyFieldAnnotations$1(this, z10, protoBuf$Property));
    }

    public final w9.c d(ProtoBuf$Constructor protoBuf$Constructor, boolean z10) {
        g a10;
        g gVar = this.f14777a;
        l8.f fVar = gVar.c;
        v7.g.d(fVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        l8.b bVar = (l8.b) fVar;
        int i10 = protoBuf$Constructor.f14087l;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        w9.c cVar = new w9.c(bVar, null, b(protoBuf$Constructor, i10, annotatedCallableKind), z10, CallableMemberDescriptor.Kind.DECLARATION, protoBuf$Constructor, gVar.f17921b, gVar.f17922d, gVar.f17923e, gVar.f17925g, null);
        a10 = gVar.a(cVar, EmptyList.f12981i, gVar.f17921b, gVar.f17922d, gVar.f17923e, gVar.f17924f);
        List<ProtoBuf$ValueParameter> list = protoBuf$Constructor.f14088m;
        v7.g.e(list, "proto.valueParameterList");
        cVar.d1(a10.f17927i.h(list, protoBuf$Constructor, annotatedCallableKind), q.a((ProtoBuf$Visibility) f9.b.f10979d.c(protoBuf$Constructor.f14087l)));
        cVar.a1(bVar.r());
        cVar.f13541z = bVar.l0();
        cVar.E = !f9.b.n.c(protoBuf$Constructor.f14087l).booleanValue();
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r1 != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w9.h e(ProtoBuf$Function protoBuf$Function) {
        boolean z10;
        int i10;
        boolean z11;
        m8.e eVar;
        f9.h hVar;
        g a10;
        f0 f0Var;
        l8.b bVar;
        c0 c0Var;
        r g10;
        boolean z12;
        v7.g.f(protoBuf$Function, "proto");
        boolean z13 = false;
        if ((protoBuf$Function.f14157k & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = protoBuf$Function.f14158l;
        } else {
            int i11 = protoBuf$Function.f14159m;
            i10 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        int i12 = i10;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        m8.e b5 = b(protoBuf$Function, i12, annotatedCallableKind);
        int i13 = protoBuf$Function.f14157k;
        if ((i13 & 32) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if ((i13 & 64) == 64) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        z13 = true;
        m8.e eVar2 = e.a.f16014a;
        g gVar = this.f14777a;
        if (z13) {
            eVar = new w9.a(gVar.f17920a.f17901a, new MemberDeserializer$getReceiverParameterAnnotations$1(this, protoBuf$Function, annotatedCallableKind));
        } else {
            eVar = eVar2;
        }
        h9.c g11 = DescriptorUtilsKt.g(gVar.c);
        int i14 = protoBuf$Function.n;
        f9.c cVar = gVar.f17921b;
        if (v7.g.a(g11.c(m0.b.r0(cVar, i14)), u9.r.f17942a)) {
            hVar = f9.h.f11006b;
        } else {
            hVar = gVar.f17923e;
        }
        m8.e eVar3 = eVar;
        w9.h hVar2 = new w9.h(gVar.c, null, b5, m0.b.r0(cVar, protoBuf$Function.n), q.b((ProtoBuf$MemberKind) f9.b.f10989o.c(i12)), protoBuf$Function, gVar.f17921b, gVar.f17922d, hVar, gVar.f17925g, null);
        List<ProtoBuf$TypeParameter> list = protoBuf$Function.f14162q;
        v7.g.e(list, "proto.typeParameterList");
        a10 = gVar.a(hVar2, list, gVar.f17921b, gVar.f17922d, gVar.f17923e, gVar.f17924f);
        f9.g gVar2 = gVar.f17922d;
        ProtoBuf$Type b10 = f9.f.b(protoBuf$Function, gVar2);
        TypeDeserializer typeDeserializer = a10.f17926h;
        if (b10 != null && (g10 = typeDeserializer.g(b10)) != null) {
            f0Var = k9.c.h(hVar2, g10, eVar3);
        } else {
            f0Var = null;
        }
        l8.f fVar = gVar.c;
        if (fVar instanceof l8.b) {
            bVar = (l8.b) fVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            c0Var = bVar.R0();
        } else {
            c0Var = null;
        }
        v7.g.f(gVar2, "typeTable");
        ArrayList arrayList = protoBuf$Function.f14165t;
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list2 = protoBuf$Function.f14166u;
            v7.g.e(list2, "contextReceiverTypeIdList");
            ArrayList arrayList2 = new ArrayList(l.Z1(list2, 10));
            for (Integer num : list2) {
                v7.g.e(num, "it");
                arrayList2.add(gVar2.a(num.intValue()));
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (ProtoBuf$Type protoBuf$Type : arrayList) {
            f0 b11 = k9.c.b(hVar2, typeDeserializer.g(protoBuf$Type), null, eVar2);
            if (b11 != null) {
                arrayList3.add(b11);
            }
        }
        List<i0> b12 = typeDeserializer.b();
        List<ProtoBuf$ValueParameter> list3 = protoBuf$Function.f14168w;
        v7.g.e(list3, "proto.valueParameterList");
        hVar2.f1(f0Var, c0Var, arrayList3, b12, a10.f17927i.h(list3, protoBuf$Function, annotatedCallableKind), typeDeserializer.g(f9.f.c(protoBuf$Function, gVar2)), p.a((ProtoBuf$Modality) f9.b.f10980e.c(i12)), q.a((ProtoBuf$Visibility) f9.b.f10979d.c(i12)), kotlin.collections.d.K1());
        hVar2.f13536u = a4.b.v(f9.b.f10990p, i12, "IS_OPERATOR.get(flags)");
        hVar2.f13537v = a4.b.v(f9.b.f10991q, i12, "IS_INFIX.get(flags)");
        hVar2.f13538w = a4.b.v(f9.b.f10994t, i12, "IS_EXTERNAL_FUNCTION.get(flags)");
        hVar2.f13539x = a4.b.v(f9.b.f10992r, i12, "IS_INLINE.get(flags)");
        hVar2.f13540y = a4.b.v(f9.b.f10993s, i12, "IS_TAILREC.get(flags)");
        hVar2.D = a4.b.v(f9.b.f10995u, i12, "IS_SUSPEND.get(flags)");
        hVar2.f13541z = a4.b.v(f9.b.f10996v, i12, "IS_EXPECT_FUNCTION.get(flags)");
        hVar2.E = !f9.b.f10997w.c(i12).booleanValue();
        gVar.f17920a.f17912m.a(protoBuf$Function, hVar2, gVar2, typeDeserializer);
        return hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2 A[LOOP:1: B:65:0x01bc->B:67:0x01c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w9.g f(ProtoBuf$Property protoBuf$Property) {
        boolean z10;
        int i10;
        g a10;
        MemberDeserializer memberDeserializer;
        int i11;
        m8.e eVar;
        l8.f fVar;
        l8.b bVar;
        c0 c0Var;
        int i12;
        boolean z11;
        boolean z12;
        ProtoBuf$Type protoBuf$Type;
        f0 f0Var;
        List<ProtoBuf$Type> list;
        ProtoBuf$Visibility protoBuf$Visibility;
        int i13;
        b.a aVar;
        b.a aVar2;
        b.C0117b c0117b;
        b.C0117b c0117b2;
        int i14;
        d0 d0Var;
        d0 d0Var2;
        e0 e0Var;
        MemberDeserializer memberDeserializer2;
        l8.b bVar2;
        ClassKind classKind;
        boolean z13;
        int i15;
        g a11;
        boolean z14;
        int i16;
        r g10;
        boolean z15;
        boolean z16;
        boolean z17;
        v7.g.f(protoBuf$Property, "proto");
        if ((protoBuf$Property.f14219k & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = protoBuf$Property.f14220l;
        } else {
            int i17 = protoBuf$Property.f14221m;
            i10 = ((i17 >> 8) << 6) + (i17 & 63);
        }
        int i18 = i10;
        g gVar = this.f14777a;
        w9.g gVar2 = new w9.g(gVar.c, null, b(protoBuf$Property, i18, AnnotatedCallableKind.PROPERTY), p.a((ProtoBuf$Modality) f9.b.f10980e.c(i18)), q.a((ProtoBuf$Visibility) f9.b.f10979d.c(i18)), a4.b.v(f9.b.f10998x, i18, "IS_VAR.get(flags)"), m0.b.r0(gVar.f17921b, protoBuf$Property.n), q.b((ProtoBuf$MemberKind) f9.b.f10989o.c(i18)), a4.b.v(f9.b.B, i18, "IS_LATEINIT.get(flags)"), a4.b.v(f9.b.A, i18, "IS_CONST.get(flags)"), a4.b.v(f9.b.D, i18, "IS_EXTERNAL_PROPERTY.get(flags)"), a4.b.v(f9.b.E, i18, "IS_DELEGATED.get(flags)"), a4.b.v(f9.b.F, i18, "IS_EXPECT_PROPERTY.get(flags)"), protoBuf$Property, gVar.f17921b, gVar.f17922d, gVar.f17923e, gVar.f17925g);
        List<ProtoBuf$TypeParameter> list2 = protoBuf$Property.f14224q;
        v7.g.e(list2, "proto.typeParameterList");
        a10 = gVar.a(gVar2, list2, gVar.f17921b, gVar.f17922d, gVar.f17923e, gVar.f17924f);
        boolean v3 = a4.b.v(f9.b.f10999y, i18, "HAS_GETTER.get(flags)");
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_GETTER;
        e.a.C0187a c0187a = e.a.f16014a;
        if (v3) {
            int i19 = protoBuf$Property.f14219k;
            if ((i19 & 32) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z15) {
                if ((i19 & 64) == 64) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    z16 = false;
                    if (z16) {
                        memberDeserializer = this;
                        i11 = i18;
                        eVar = new w9.a(gVar.f17920a.f17901a, new MemberDeserializer$getReceiverParameterAnnotations$1(memberDeserializer, protoBuf$Property, annotatedCallableKind));
                        f9.g gVar3 = gVar.f17922d;
                        ProtoBuf$Type d5 = f9.f.d(protoBuf$Property, gVar3);
                        TypeDeserializer typeDeserializer = a10.f17926h;
                        r g11 = typeDeserializer.g(d5);
                        List<i0> b5 = typeDeserializer.b();
                        fVar = gVar.c;
                        if (!(fVar instanceof l8.b)) {
                            bVar = (l8.b) fVar;
                        } else {
                            bVar = null;
                        }
                        if (bVar == null) {
                            c0Var = bVar.R0();
                        } else {
                            c0Var = null;
                        }
                        v7.g.f(gVar3, "typeTable");
                        i12 = protoBuf$Property.f14219k;
                        if ((i12 & 32) != 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            protoBuf$Type = protoBuf$Property.f14225r;
                        } else {
                            if ((i12 & 64) == 64) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                protoBuf$Type = gVar3.a(protoBuf$Property.f14226s);
                            } else {
                                protoBuf$Type = null;
                            }
                        }
                        if (protoBuf$Type == null && (g10 = typeDeserializer.g(protoBuf$Type)) != null) {
                            f0Var = k9.c.h(gVar2, g10, eVar);
                        } else {
                            f0Var = null;
                        }
                        v7.g.f(gVar3, "typeTable");
                        list = protoBuf$Property.f14227t;
                        if (!list.isEmpty()) {
                            list = null;
                        }
                        ArrayList arrayList = list;
                        if (list == null) {
                            List<Integer> list3 = protoBuf$Property.f14228u;
                            v7.g.e(list3, "contextReceiverTypeIdList");
                            ArrayList arrayList2 = new ArrayList(l.Z1(list3, 10));
                            for (Integer num : list3) {
                                v7.g.e(num, "it");
                                arrayList2.add(gVar3.a(num.intValue()));
                            }
                            arrayList = arrayList2;
                        }
                        ArrayList arrayList3 = new ArrayList(l.Z1(arrayList, 10));
                        for (ProtoBuf$Type protoBuf$Type2 : arrayList) {
                            arrayList3.add(k9.c.b(gVar2, typeDeserializer.g(protoBuf$Type2), null, c0187a));
                        }
                        gVar2.Y0(g11, b5, c0Var, f0Var, arrayList3);
                        b.a aVar3 = f9.b.c;
                        boolean v10 = a4.b.v(aVar3, i11, "HAS_ANNOTATIONS.get(flags)");
                        b.C0117b c0117b3 = f9.b.f10979d;
                        protoBuf$Visibility = (ProtoBuf$Visibility) c0117b3.c(i11);
                        b.C0117b c0117b4 = f9.b.f10980e;
                        ProtoBuf$Modality protoBuf$Modality = (ProtoBuf$Modality) c0117b4.c(i11);
                        if (protoBuf$Visibility == null) {
                            if (protoBuf$Modality != null) {
                                int d10 = aVar3.d(Boolean.valueOf(v10)) | (protoBuf$Modality.c() << c0117b4.f11001a) | (protoBuf$Visibility.c() << c0117b3.f11001a);
                                b.a aVar4 = f9.b.J;
                                Boolean bool = Boolean.FALSE;
                                b.a aVar5 = f9.b.K;
                                b.a aVar6 = f9.b.L;
                                int d11 = d10 | aVar4.d(bool) | aVar5.d(bool) | aVar6.d(bool);
                                d0.a aVar7 = l8.d0.f15835a;
                                if (v3) {
                                    if ((protoBuf$Property.f14219k & 256) == 256) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        i16 = protoBuf$Property.f14231x;
                                    } else {
                                        i16 = d11;
                                    }
                                    boolean v11 = a4.b.v(aVar4, i16, "IS_NOT_DEFAULT.get(getterFlags)");
                                    boolean v12 = a4.b.v(aVar5, i16, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
                                    boolean v13 = a4.b.v(aVar6, i16, "IS_INLINE_ACCESSOR.get(getterFlags)");
                                    m8.e b10 = memberDeserializer.b(protoBuf$Property, i16, annotatedCallableKind);
                                    if (v11) {
                                        aVar = aVar6;
                                        aVar2 = aVar5;
                                        i13 = d11;
                                        c0117b2 = c0117b3;
                                        c0117b = c0117b4;
                                        i14 = i11;
                                        d0Var = new o8.d0(gVar2, b10, p.a((ProtoBuf$Modality) c0117b4.c(i16)), q.a((ProtoBuf$Visibility) c0117b3.c(i16)), !v11, v12, v13, gVar2.h(), null, aVar7);
                                    } else {
                                        i13 = d11;
                                        aVar = aVar6;
                                        aVar2 = aVar5;
                                        c0117b = c0117b4;
                                        c0117b2 = c0117b3;
                                        i14 = i11;
                                        d0Var = k9.c.c(gVar2, b10);
                                    }
                                    d0Var.U0(gVar2.k());
                                } else {
                                    i13 = d11;
                                    aVar = aVar6;
                                    aVar2 = aVar5;
                                    c0117b = c0117b4;
                                    c0117b2 = c0117b3;
                                    i14 = i11;
                                    d0Var = null;
                                }
                                o8.d0 d0Var3 = d0Var;
                                if (a4.b.v(f9.b.f11000z, i14, "HAS_SETTER.get(flags)")) {
                                    if ((protoBuf$Property.f14219k & 512) == 512) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        i15 = protoBuf$Property.f14232y;
                                    } else {
                                        i15 = i13;
                                    }
                                    boolean v14 = a4.b.v(aVar4, i15, "IS_NOT_DEFAULT.get(setterFlags)");
                                    boolean v15 = a4.b.v(aVar2, i15, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
                                    boolean v16 = a4.b.v(aVar, i15, "IS_INLINE_ACCESSOR.get(setterFlags)");
                                    AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.PROPERTY_SETTER;
                                    m8.e b11 = memberDeserializer.b(protoBuf$Property, i15, annotatedCallableKind2);
                                    if (v14) {
                                        d0Var2 = d0Var3;
                                        e0 e0Var2 = new e0(gVar2, b11, p.a((ProtoBuf$Modality) c0117b.c(i15)), q.a((ProtoBuf$Visibility) c0117b2.c(i15)), !v14, v15, v16, gVar2.h(), null, aVar7);
                                        a11 = a10.a(e0Var2, EmptyList.f12981i, a10.f17921b, a10.f17922d, a10.f17923e, a10.f17924f);
                                        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) kotlin.collections.c.C2(a11.f17927i.h(a1.c.N0(protoBuf$Property.f14230w), protoBuf$Property, annotatedCallableKind2));
                                        if (hVar != null) {
                                            e0Var2.f16417u = hVar;
                                            e0Var = e0Var2;
                                        } else {
                                            e0.K(6);
                                            throw null;
                                        }
                                    } else {
                                        d0Var2 = d0Var3;
                                        e0Var = k9.c.d(gVar2, b11);
                                    }
                                } else {
                                    d0Var2 = d0Var3;
                                    e0Var = null;
                                }
                                if (a4.b.v(f9.b.C, i14, "HAS_CONSTANT.get(flags)")) {
                                    memberDeserializer2 = this;
                                    gVar2.M0(null, new MemberDeserializer$loadProperty$4(memberDeserializer2, protoBuf$Property, gVar2));
                                } else {
                                    memberDeserializer2 = this;
                                }
                                l8.f fVar2 = gVar.c;
                                if (fVar2 instanceof l8.b) {
                                    bVar2 = (l8.b) fVar2;
                                } else {
                                    bVar2 = null;
                                }
                                if (bVar2 != null) {
                                    classKind = bVar2.h();
                                } else {
                                    classKind = null;
                                }
                                if (classKind == ClassKind.f13435m) {
                                    gVar2.M0(null, new MemberDeserializer$loadProperty$5(memberDeserializer2, protoBuf$Property, gVar2));
                                }
                                gVar2.W0(d0Var2, e0Var, new s(gVar2, memberDeserializer2.c(protoBuf$Property, false)), new s(gVar2, memberDeserializer2.c(protoBuf$Property, true)));
                                return gVar2;
                            }
                            MemberDeserializer memberDeserializer3 = memberDeserializer;
                            f9.b.a(11);
                            throw null;
                        }
                        MemberDeserializer memberDeserializer4 = memberDeserializer;
                        f9.b.a(10);
                        throw null;
                    }
                }
            }
            z16 = true;
            if (z16) {
            }
        }
        memberDeserializer = this;
        i11 = i18;
        eVar = c0187a;
        f9.g gVar32 = gVar.f17922d;
        ProtoBuf$Type d52 = f9.f.d(protoBuf$Property, gVar32);
        TypeDeserializer typeDeserializer2 = a10.f17926h;
        r g112 = typeDeserializer2.g(d52);
        List<i0> b52 = typeDeserializer2.b();
        fVar = gVar.c;
        if (!(fVar instanceof l8.b)) {
        }
        if (bVar == null) {
        }
        v7.g.f(gVar32, "typeTable");
        i12 = protoBuf$Property.f14219k;
        if ((i12 & 32) != 32) {
        }
        if (!z11) {
        }
        if (protoBuf$Type == null) {
        }
        f0Var = null;
        v7.g.f(gVar32, "typeTable");
        list = protoBuf$Property.f14227t;
        if (!list.isEmpty()) {
        }
        ArrayList arrayList4 = list;
        if (list == null) {
        }
        ArrayList arrayList32 = new ArrayList(l.Z1(arrayList4, 10));
        while (r3.hasNext()) {
        }
        gVar2.Y0(g112, b52, c0Var, f0Var, arrayList32);
        b.a aVar32 = f9.b.c;
        boolean v102 = a4.b.v(aVar32, i11, "HAS_ANNOTATIONS.get(flags)");
        b.C0117b c0117b32 = f9.b.f10979d;
        protoBuf$Visibility = (ProtoBuf$Visibility) c0117b32.c(i11);
        b.C0117b c0117b42 = f9.b.f10980e;
        ProtoBuf$Modality protoBuf$Modality2 = (ProtoBuf$Modality) c0117b42.c(i11);
        if (protoBuf$Visibility == null) {
        }
    }

    public final i g(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        g gVar;
        m8.e fVar;
        g a10;
        boolean z10;
        boolean z11;
        ProtoBuf$Type a11;
        boolean z12;
        ProtoBuf$Type a12;
        v7.g.f(protoBuf$TypeAlias, "proto");
        List<ProtoBuf$Annotation> list = protoBuf$TypeAlias.f14336s;
        v7.g.e(list, "proto.annotationList");
        ArrayList arrayList = new ArrayList(l.Z1(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            gVar = this.f14777a;
            if (!hasNext) {
                break;
            }
            ProtoBuf$Annotation protoBuf$Annotation = (ProtoBuf$Annotation) it.next();
            v7.g.e(protoBuf$Annotation, "it");
            arrayList.add(this.f14778b.a(protoBuf$Annotation, gVar.f17921b));
        }
        if (arrayList.isEmpty()) {
            fVar = e.a.f16014a;
        } else {
            fVar = new m8.f(arrayList);
        }
        i iVar = new i(gVar.f17920a.f17901a, gVar.c, fVar, m0.b.r0(gVar.f17921b, protoBuf$TypeAlias.f14331m), q.a((ProtoBuf$Visibility) f9.b.f10979d.c(protoBuf$TypeAlias.f14330l)), protoBuf$TypeAlias, gVar.f17921b, gVar.f17922d, gVar.f17923e, gVar.f17925g);
        List<ProtoBuf$TypeParameter> list2 = protoBuf$TypeAlias.n;
        v7.g.e(list2, "proto.typeParameterList");
        a10 = gVar.a(iVar, list2, gVar.f17921b, gVar.f17922d, gVar.f17923e, gVar.f17924f);
        TypeDeserializer typeDeserializer = a10.f17926h;
        List<i0> b5 = typeDeserializer.b();
        f9.g gVar2 = gVar.f17922d;
        v7.g.f(gVar2, "typeTable");
        int i10 = protoBuf$TypeAlias.f14329k;
        boolean z13 = true;
        if ((i10 & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a11 = protoBuf$TypeAlias.f14332o;
            v7.g.e(a11, "underlyingType");
        } else {
            if ((i10 & 8) == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                a11 = gVar2.a(protoBuf$TypeAlias.f14333p);
            } else {
                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
            }
        }
        v d5 = typeDeserializer.d(a11, false);
        v7.g.f(gVar2, "typeTable");
        int i11 = protoBuf$TypeAlias.f14329k;
        if ((i11 & 16) == 16) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            a12 = protoBuf$TypeAlias.f14334q;
            v7.g.e(a12, "expandedType");
        } else {
            if ((i11 & 32) != 32) {
                z13 = false;
            }
            if (z13) {
                a12 = gVar2.a(protoBuf$TypeAlias.f14335r);
            } else {
                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
            }
        }
        iVar.S0(b5, d5, typeDeserializer.d(a12, false));
        return iVar;
    }

    public final List<kotlin.reflect.jvm.internal.impl.descriptors.h> h(List<ProtoBuf$ValueParameter> list, h hVar, AnnotatedCallableKind annotatedCallableKind) {
        boolean z10;
        int i10;
        m8.e eVar;
        boolean z11;
        boolean z12;
        ProtoBuf$Type protoBuf$Type;
        r rVar;
        g gVar = this.f14777a;
        l8.f fVar = gVar.c;
        v7.g.d(fVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.a aVar = (kotlin.reflect.jvm.internal.impl.descriptors.a) fVar;
        l8.f c = aVar.c();
        v7.g.e(c, "callableDescriptor.containingDeclaration");
        f a10 = a(c);
        ArrayList arrayList = new ArrayList(l.Z1(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) obj;
                if ((protoBuf$ValueParameter.f14385k & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = protoBuf$ValueParameter.f14386l;
                } else {
                    i10 = 0;
                }
                if (a10 != null && a4.b.v(f9.b.c, i10, "HAS_ANNOTATIONS.get(flags)")) {
                    eVar = new j(gVar.f17920a.f17901a, new MemberDeserializer$valueParameters$1$annotations$1(this, a10, hVar, annotatedCallableKind, i11, protoBuf$ValueParameter));
                } else {
                    eVar = e.a.f16014a;
                }
                h9.e r02 = m0.b.r0(gVar.f17921b, protoBuf$ValueParameter.f14387m);
                f9.g gVar2 = gVar.f17922d;
                ProtoBuf$Type e10 = f9.f.e(protoBuf$ValueParameter, gVar2);
                TypeDeserializer typeDeserializer = gVar.f17926h;
                r g10 = typeDeserializer.g(e10);
                boolean v3 = a4.b.v(f9.b.G, i10, "DECLARES_DEFAULT_VALUE.get(flags)");
                boolean v10 = a4.b.v(f9.b.H, i10, "IS_CROSSINLINE.get(flags)");
                Boolean c10 = f9.b.I.c(i10);
                v7.g.e(c10, "IS_NOINLINE.get(flags)");
                boolean booleanValue = c10.booleanValue();
                v7.g.f(gVar2, "typeTable");
                int i13 = protoBuf$ValueParameter.f14385k;
                if ((i13 & 16) == 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    protoBuf$Type = protoBuf$ValueParameter.f14389p;
                } else {
                    if ((i13 & 32) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        protoBuf$Type = gVar2.a(protoBuf$ValueParameter.f14390q);
                    } else {
                        protoBuf$Type = null;
                    }
                }
                if (protoBuf$Type != null) {
                    rVar = typeDeserializer.g(protoBuf$Type);
                } else {
                    rVar = null;
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.e(aVar, null, i11, eVar, r02, g10, v3, v10, booleanValue, rVar, l8.d0.f15835a));
                arrayList = arrayList2;
                i11 = i12;
            } else {
                a1.c.F1();
                throw null;
            }
        }
        return kotlin.collections.c.L2(arrayList);
    }
}
