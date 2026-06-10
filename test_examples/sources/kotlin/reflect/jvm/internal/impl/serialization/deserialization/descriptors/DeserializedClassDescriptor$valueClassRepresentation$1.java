package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import h9.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import l8.j0;
import l8.o;
import l8.t;
import l8.z;
import m0.b;
import n7.l;
import u9.g;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class DeserializedClassDescriptor$valueClassRepresentation$1 extends Lambda implements u7.a<j0<v>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedClassDescriptor f14860j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$valueClassRepresentation$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.f14860j = deserializedClassDescriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r6.H.size() > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e5, code lost:
        if (r9 == false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011b A[LOOP:0: B:72:0x0113->B:74:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j0<v> k0() {
        boolean z10;
        e name;
        boolean z11;
        boolean z12;
        ProtoBuf$Type protoBuf$Type;
        v vVar;
        boolean z13;
        o oVar;
        boolean z14;
        boolean z15;
        boolean z16;
        ArrayList arrayList;
        ?? r42;
        DeserializedClassDescriptor deserializedClassDescriptor = this.f14860j;
        boolean i10 = deserializedClassDescriptor.i();
        g gVar = deserializedClassDescriptor.f14831t;
        ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.f14825m;
        t tVar = null;
        if (i10 || deserializedClassDescriptor.i0()) {
            if (deserializedClassDescriptor.i0()) {
                int i11 = protoBuf$Class.f14048k;
                if ((i11 & 8) == 8) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    if ((i11 & 16) == 16) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        if ((i11 & 32) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (!z16) {
                        }
                    }
                }
            }
            if ((protoBuf$Class.f14048k & 8) == 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                name = b.r0(gVar.f17921b, protoBuf$Class.E);
            } else if (!deserializedClassDescriptor.n.a(1, 5, 1)) {
                kotlin.reflect.jvm.internal.impl.descriptors.b A0 = deserializedClassDescriptor.A0();
                if (A0 != null) {
                    List<h> m10 = A0.m();
                    v7.g.e(m10, "constructor.valueParameters");
                    name = ((h) c.n2(m10)).getName();
                    v7.g.e(name, "{\n                // Bef…irst().name\n            }");
                } else {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + deserializedClassDescriptor).toString());
                }
            } else {
                throw new IllegalStateException(("Inline class has no underlying property name in metadata: " + deserializedClassDescriptor).toString());
            }
            f9.g gVar2 = gVar.f17922d;
            v7.g.f(gVar2, "typeTable");
            int i12 = protoBuf$Class.f14048k;
            if ((i12 & 16) == 16) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                protoBuf$Type = protoBuf$Class.F;
            } else {
                if ((i12 & 32) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    protoBuf$Type = gVar2.a(protoBuf$Class.G);
                } else {
                    protoBuf$Type = null;
                }
            }
            if (protoBuf$Type == null || (vVar = gVar.f17926h.d(protoBuf$Type, true)) == null) {
                Iterator it = deserializedClassDescriptor.S0().b(name, NoLookupLocation.FROM_DESERIALIZATION).iterator();
                z zVar = null;
                boolean z17 = false;
                while (true) {
                    if (it.hasNext()) {
                        ?? next = it.next();
                        if (((z) next).R() == null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            if (z17) {
                                break;
                            }
                            zVar = next;
                            z17 = true;
                        }
                    }
                }
                zVar = null;
                z zVar2 = zVar;
                if (zVar2 != null) {
                    r b5 = zVar2.b();
                    v7.g.d(b5, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
                    vVar = (v) b5;
                } else {
                    throw new IllegalStateException(("Value class has no underlying property: " + deserializedClassDescriptor).toString());
                }
            }
            oVar = new o(name, vVar);
            List<Integer> list = protoBuf$Class.H;
            v7.g.e(list, "classProto.multiFieldValueClassUnderlyingNameList");
            arrayList = new ArrayList(l.Z1(list, 10));
            for (Integer num : list) {
                f9.c cVar = gVar.f17921b;
                v7.g.e(num, "it");
                arrayList.add(b.r0(cVar, num.intValue()));
            }
            if (!arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                if (deserializedClassDescriptor.i0()) {
                    Pair pair = new Pair(Integer.valueOf(protoBuf$Class.K.size()), Integer.valueOf(protoBuf$Class.J.size()));
                    if (v7.g.a(pair, new Pair(Integer.valueOf(arrayList.size()), 0))) {
                        List<Integer> list2 = protoBuf$Class.K;
                        v7.g.e(list2, "classProto.multiFieldVal…ClassUnderlyingTypeIdList");
                        r42 = new ArrayList(l.Z1(list2, 10));
                        for (Integer num2 : list2) {
                            f9.g gVar3 = gVar.f17922d;
                            v7.g.e(num2, "it");
                            r42.add(gVar3.a(num2.intValue()));
                        }
                    } else if (v7.g.a(pair, new Pair(0, Integer.valueOf(arrayList.size())))) {
                        r42 = protoBuf$Class.J;
                    } else {
                        throw new IllegalStateException(("Illegal multi-field value class representation: " + deserializedClassDescriptor).toString());
                    }
                    v7.g.e(r42, "when (typeIdCount to typ…tation: $this\")\n        }");
                    ArrayList arrayList2 = new ArrayList(l.Z1(r42, 10));
                    for (ProtoBuf$Type protoBuf$Type2 : r42) {
                        TypeDeserializer typeDeserializer = gVar.f17926h;
                        v7.g.e(protoBuf$Type2, "it");
                        arrayList2.add(typeDeserializer.d(protoBuf$Type2, true));
                    }
                    tVar = new t(c.S2(arrayList, arrayList2));
                } else {
                    throw new IllegalArgumentException(("Not a value class: " + deserializedClassDescriptor).toString());
                }
            }
            if (oVar != null && tVar != null) {
                throw new IllegalArgumentException("Class cannot have both inline class representation and multi field class representation: " + deserializedClassDescriptor);
            }
            if ((!deserializedClassDescriptor.i0() || deserializedClassDescriptor.i()) && oVar == null && tVar == null) {
                throw new IllegalArgumentException("Value class has no value class representation: " + deserializedClassDescriptor);
            }
            return tVar;
        }
        oVar = null;
        List<Integer> list3 = protoBuf$Class.H;
        v7.g.e(list3, "classProto.multiFieldValueClassUnderlyingNameList");
        arrayList = new ArrayList(l.Z1(list3, 10));
        while (r1.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        if (arrayList != null) {
        }
        if (oVar != null) {
            throw new IllegalArgumentException("Class cannot have both inline class representation and multi field class representation: " + deserializedClassDescriptor);
        }
        if (!deserializedClassDescriptor.i0()) {
        }
        throw new IllegalArgumentException("Value class has no value class representation: " + deserializedClassDescriptor);
    }
}
