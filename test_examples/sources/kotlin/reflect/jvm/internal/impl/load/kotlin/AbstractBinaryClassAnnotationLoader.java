package kotlin.reflect.jvm.internal.impl.load.kotlin;

import g9.d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.i;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.f;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import l8.d0;
import n7.l;

/* loaded from: classes.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends a<? extends A>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.d<A> {

    /* renamed from: a  reason: collision with root package name */
    public final d9.f f13917a;

    /* loaded from: classes.dex */
    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* loaded from: classes.dex */
    public static abstract class a<A> {
    }

    public AbstractBinaryClassAnnotationLoader(q8.f fVar) {
        this.f13917a = fVar;
    }

    public static /* synthetic */ List m(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, i iVar, boolean z10, Boolean bool, boolean z11, int i10) {
        boolean z12 = (i10 & 4) != 0 ? false : z10;
        if ((i10 & 16) != 0) {
            bool = null;
        }
        return abstractBinaryClassAnnotationLoader.l(fVar, iVar, z12, false, bool, (i10 & 32) != 0 ? false : z11);
    }

    public static i n(kotlin.reflect.jvm.internal.impl.protobuf.h hVar, f9.c cVar, f9.g gVar, AnnotatedCallableKind annotatedCallableKind, boolean z10) {
        i iVar;
        d.b c;
        v7.g.f(hVar, "proto");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(gVar, "typeTable");
        v7.g.f(annotatedCallableKind, "kind");
        if (hVar instanceof ProtoBuf$Constructor) {
            kotlin.reflect.jvm.internal.impl.protobuf.d dVar = g9.h.f11279a;
            c = g9.h.a((ProtoBuf$Constructor) hVar, cVar, gVar);
            if (c == null) {
                return null;
            }
        } else if (hVar instanceof ProtoBuf$Function) {
            kotlin.reflect.jvm.internal.impl.protobuf.d dVar2 = g9.h.f11279a;
            c = g9.h.c((ProtoBuf$Function) hVar, cVar, gVar);
            if (c == null) {
                return null;
            }
        } else if (!(hVar instanceof ProtoBuf$Property)) {
            return null;
        } else {
            GeneratedMessageLite.d<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> dVar3 = JvmProtoBuf.f14437d;
            v7.g.e(dVar3, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) f9.e.a((GeneratedMessageLite.ExtendableMessage) hVar, dVar3);
            if (jvmPropertySignature == null) {
                return null;
            }
            int ordinal = annotatedCallableKind.ordinal();
            boolean z11 = true;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                    if ((jvmPropertySignature.f14470j & 8) != 8) {
                        z11 = false;
                    }
                    if (!z11) {
                        return null;
                    }
                    JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.n;
                    v7.g.e(jvmMethodSignature, "signature.setter");
                    String string = cVar.getString(jvmMethodSignature.f14461k);
                    String string2 = cVar.getString(jvmMethodSignature.f14462l);
                    v7.g.f(string, "name");
                    v7.g.f(string2, "desc");
                    iVar = new i(string.concat(string2));
                } else {
                    if ((jvmPropertySignature.f14470j & 4) != 4) {
                        z11 = false;
                    }
                    if (!z11) {
                        return null;
                    }
                    JvmProtoBuf.JvmMethodSignature jvmMethodSignature2 = jvmPropertySignature.f14473m;
                    v7.g.e(jvmMethodSignature2, "signature.getter");
                    String string3 = cVar.getString(jvmMethodSignature2.f14461k);
                    String string4 = cVar.getString(jvmMethodSignature2.f14462l);
                    v7.g.f(string3, "name");
                    v7.g.f(string4, "desc");
                    iVar = new i(string3.concat(string4));
                }
                return iVar;
            }
            return c.a((ProtoBuf$Property) hVar, cVar, gVar, true, true, z10);
        }
        return i.a.a(c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final ArrayList a(ProtoBuf$TypeParameter protoBuf$TypeParameter, f9.c cVar) {
        v7.g.f(protoBuf$TypeParameter, "proto");
        v7.g.f(cVar, "nameResolver");
        Object l2 = protoBuf$TypeParameter.l(JvmProtoBuf.f14441h);
        v7.g.e(l2, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) l2;
        ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            v7.g.e(protoBuf$Annotation, "it");
            arrayList.add(((e) this).f13936e.a(protoBuf$Annotation, cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List b(f.a aVar, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        v7.g.f(aVar, "container");
        v7.g.f(protoBuf$EnumEntry, "proto");
        String string = aVar.f14895a.getString(protoBuf$EnumEntry.f14128l);
        String c = aVar.f14899f.c();
        v7.g.e(c, "container as ProtoContai…Class).classId.asString()");
        String b5 = g9.b.b(c);
        v7.g.f(string, "name");
        v7.g.f(b5, "desc");
        return m(this, aVar, new i(string + '#' + b5), false, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List<A> c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, ProtoBuf$Property protoBuf$Property) {
        v7.g.f(protoBuf$Property, "proto");
        return s(fVar, protoBuf$Property, PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List<A> d(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, kotlin.reflect.jvm.internal.impl.protobuf.h hVar, AnnotatedCallableKind annotatedCallableKind) {
        v7.g.f(hVar, "proto");
        v7.g.f(annotatedCallableKind, "kind");
        i n = n(hVar, fVar.f14895a, fVar.f14896b, annotatedCallableKind, false);
        if (n != null) {
            return m(this, fVar, new i(androidx.activity.e.k(new StringBuilder(), n.f13985a, "@0")), false, null, false, 60);
        }
        return EmptyList.f12981i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
        if (r10.f14901h != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<A> e(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, kotlin.reflect.jvm.internal.impl.protobuf.h hVar, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        v7.g.f(fVar, "container");
        v7.g.f(hVar, "callableProto");
        v7.g.f(annotatedCallableKind, "kind");
        v7.g.f(protoBuf$ValueParameter, "proto");
        int i11 = 0;
        i n = n(hVar, fVar.f14895a, fVar.f14896b, annotatedCallableKind, false);
        if (n != null) {
            if (hVar instanceof ProtoBuf$Function) {
                int i12 = ((ProtoBuf$Function) hVar).f14157k;
                if ((i12 & 32) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    if ((i12 & 64) == 64) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        z14 = false;
                        if (z14) {
                            i11 = 1;
                        }
                        return m(this, fVar, new i(n.f13985a + '@' + (i10 + i11)), false, null, false, 60);
                    }
                }
                z14 = true;
                if (z14) {
                }
                return m(this, fVar, new i(n.f13985a + '@' + (i10 + i11)), false, null, false, 60);
            } else if (hVar instanceof ProtoBuf$Property) {
                int i13 = ((ProtoBuf$Property) hVar).f14219k;
                if ((i13 & 32) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if ((i13 & 64) == 64) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        z11 = false;
                        if (z11) {
                            i11 = 1;
                        }
                        return m(this, fVar, new i(n.f13985a + '@' + (i10 + i11)), false, null, false, 60);
                    }
                }
                z11 = true;
                if (z11) {
                }
                return m(this, fVar, new i(n.f13985a + '@' + (i10 + i11)), false, null, false, 60);
            } else if (hVar instanceof ProtoBuf$Constructor) {
                f.a aVar = (f.a) fVar;
                if (aVar.f14900g == ProtoBuf$Class.Kind.f14065l) {
                    i11 = 2;
                }
                return m(this, fVar, new i(n.f13985a + '@' + (i10 + i11)), false, null, false, 60);
            } else {
                throw new UnsupportedOperationException("Unsupported message: " + hVar.getClass());
            }
        }
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List<A> f(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, ProtoBuf$Property protoBuf$Property) {
        v7.g.f(protoBuf$Property, "proto");
        return s(fVar, protoBuf$Property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final ArrayList g(f.a aVar) {
        d9.i iVar;
        v7.g.f(aVar, "container");
        d0 d0Var = aVar.c;
        h hVar = null;
        if (d0Var instanceof d9.i) {
            iVar = (d9.i) d0Var;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            hVar = iVar.f10462b;
        }
        if (hVar != null) {
            ArrayList arrayList = new ArrayList(1);
            hVar.e(new b(this, arrayList));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.a()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List<A> i(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, kotlin.reflect.jvm.internal.impl.protobuf.h hVar, AnnotatedCallableKind annotatedCallableKind) {
        v7.g.f(hVar, "proto");
        v7.g.f(annotatedCallableKind, "kind");
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return s(fVar, (ProtoBuf$Property) hVar, PropertyRelatedElement.PROPERTY);
        }
        i n = n(hVar, fVar.f14895a, fVar.f14896b, annotatedCallableKind, false);
        if (n == null) {
            return EmptyList.f12981i;
        }
        return m(this, fVar, n, false, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final ArrayList j(ProtoBuf$Type protoBuf$Type, f9.c cVar) {
        v7.g.f(protoBuf$Type, "proto");
        v7.g.f(cVar, "nameResolver");
        Object l2 = protoBuf$Type.l(JvmProtoBuf.f14439f);
        v7.g.e(l2, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) l2;
        ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            v7.g.e(protoBuf$Annotation, "it");
            arrayList.add(((e) this).f13936e.a(protoBuf$Annotation, cVar));
        }
        return arrayList;
    }

    public final List<A> l(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, i iVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        d9.i iVar2;
        h o10 = o(fVar, z10, z11, bool, z12);
        if (o10 == null) {
            if (fVar instanceof f.a) {
                d0 d0Var = ((f.a) fVar).c;
                if (d0Var instanceof d9.i) {
                    iVar2 = (d9.i) d0Var;
                } else {
                    iVar2 = null;
                }
                if (iVar2 != null) {
                    o10 = iVar2.f10462b;
                }
            }
            o10 = null;
        }
        if (o10 == null) {
            return EmptyList.f12981i;
        }
        List<A> list = ((AbstractBinaryClassAnnotationAndConstantLoader.a) ((LockBasedStorageManager.k) ((AbstractBinaryClassAnnotationAndConstantLoader) this).f13911b).U(o10)).f13912a.get(iVar);
        if (list == null) {
            return EmptyList.f12981i;
        }
        return list;
    }

    public final h o(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        f.a aVar;
        d9.i iVar;
        d9.c cVar;
        p9.b bVar;
        h9.b l2;
        v7.g.f(fVar, "container");
        ProtoBuf$Class.Kind kind = ProtoBuf$Class.Kind.f14064k;
        d9.f fVar2 = this.f13917a;
        d0 d0Var = fVar.c;
        if (z10) {
            if (bool != null) {
                if (fVar instanceof f.a) {
                    f.a aVar2 = (f.a) fVar;
                    if (aVar2.f14900g == kind) {
                        l2 = aVar2.f14899f.d(h9.e.k("DefaultImpls"));
                        return d9.g.a(fVar2, l2);
                    }
                }
                if (bool.booleanValue() && (fVar instanceof f.b)) {
                    if (d0Var instanceof d9.c) {
                        cVar = (d9.c) d0Var;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        bVar = cVar.c;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        String e10 = bVar.e();
                        v7.g.e(e10, "facadeClassName.internalName");
                        l2 = h9.b.l(new h9.c(ha.i.V0(e10, '/', '.')));
                        return d9.g.a(fVar2, l2);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + fVar + ')').toString());
            }
        }
        if (z11 && (fVar instanceof f.a)) {
            f.a aVar3 = (f.a) fVar;
            if (aVar3.f14900g == ProtoBuf$Class.Kind.n && (aVar = aVar3.f14898e) != null) {
                ProtoBuf$Class.Kind kind2 = ProtoBuf$Class.Kind.f14063j;
                ProtoBuf$Class.Kind kind3 = aVar.f14900g;
                if (kind3 == kind2 || kind3 == ProtoBuf$Class.Kind.f14065l || (z12 && (kind3 == kind || kind3 == ProtoBuf$Class.Kind.f14066m))) {
                    d0 d0Var2 = aVar.c;
                    if (d0Var2 instanceof d9.i) {
                        iVar = (d9.i) d0Var2;
                    } else {
                        iVar = null;
                    }
                    if (iVar == null) {
                        return null;
                    }
                    return iVar.f10462b;
                }
            }
        }
        if (!(fVar instanceof f.b) || !(d0Var instanceof d9.c)) {
            return null;
        }
        v7.g.d(d0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        d9.c cVar2 = (d9.c) d0Var;
        h hVar = cVar2.f10448d;
        if (hVar == null) {
            return d9.g.a(fVar2, cVar2.d());
        }
        return hVar;
    }

    public final boolean p(h9.b bVar) {
        h a10;
        v7.g.f(bVar, "classId");
        if (bVar.g() != null && v7.g.a(bVar.j().b(), "Container") && (a10 = d9.g.a(this.f13917a, bVar)) != null) {
            LinkedHashSet linkedHashSet = h8.b.f11557a;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            a10.e(new h8.a(ref$BooleanRef));
            if (ref$BooleanRef.f13056i) {
                return true;
            }
        }
        return false;
    }

    public abstract f q(h9.b bVar, d0 d0Var, List list);

    public final f r(h9.b bVar, q8.b bVar2, List list) {
        v7.g.f(list, "result");
        if (h8.b.f11557a.contains(bVar)) {
            return null;
        }
        return q(bVar, bVar2, list);
    }

    public final List<A> s(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, ProtoBuf$Property protoBuf$Property, PropertyRelatedElement propertyRelatedElement) {
        boolean v3 = a4.b.v(f9.b.A, protoBuf$Property.f14220l, "IS_CONST.get(proto.flags)");
        boolean d5 = g9.h.d(protoBuf$Property);
        if (propertyRelatedElement == PropertyRelatedElement.PROPERTY) {
            i b5 = c.b(protoBuf$Property, fVar.f14895a, fVar.f14896b, false, true, 40);
            if (b5 == null) {
                return EmptyList.f12981i;
            }
            return m(this, fVar, b5, true, Boolean.valueOf(v3), d5, 8);
        }
        i b10 = c.b(protoBuf$Property, fVar.f14895a, fVar.f14896b, true, false, 48);
        if (b10 == null) {
            return EmptyList.f12981i;
        }
        boolean z10 = false;
        boolean Y0 = kotlin.text.b.Y0(b10.f13985a, "$delegate", false);
        if (propertyRelatedElement == PropertyRelatedElement.DELEGATE_FIELD) {
            z10 = true;
        }
        if (Y0 != z10) {
            return EmptyList.f12981i;
        }
        return l(fVar, b10, true, true, Boolean.valueOf(v3), d5);
    }
}
