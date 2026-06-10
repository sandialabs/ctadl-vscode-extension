package u9;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import l8.d0;
import m9.j;
import m9.t;
import m9.u;
import m9.v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final l8.s f17894a;

    /* renamed from: b  reason: collision with root package name */
    public final NotFoundClasses f17895b;

    /* renamed from: u9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0230a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17896a;

        static {
            int[] iArr = new int[ProtoBuf$Annotation.Argument.Value.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f17896a = iArr;
        }
    }

    public a(l8.s sVar, NotFoundClasses notFoundClasses) {
        v7.g.f(sVar, "module");
        v7.g.f(notFoundClasses, "notFoundClasses");
        this.f17894a = sVar;
        this.f17895b = notFoundClasses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.Pair] */
    public final m8.d a(ProtoBuf$Annotation protoBuf$Annotation, f9.c cVar) {
        v7.g.f(protoBuf$Annotation, "proto");
        v7.g.f(cVar, "nameResolver");
        l8.b c = FindClassInModuleKt.c(this.f17894a, m0.b.j0(cVar, protoBuf$Annotation.f13990k), this.f17895b);
        Map K1 = kotlin.collections.d.K1();
        if (protoBuf$Annotation.f13991l.size() != 0 && !aa.h.f(c) && k9.d.n(c, ClassKind.f13435m)) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> J = c.J();
            v7.g.e(J, "annotationClass.constructors");
            kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) kotlin.collections.c.D2(J);
            if (bVar != null) {
                List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = bVar.m();
                v7.g.e(m10, "constructor.valueParameters");
                int O0 = m0.b.O0(n7.l.Z1(m10, 10));
                if (O0 < 16) {
                    O0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(O0);
                for (Object obj : m10) {
                    linkedHashMap.put(((kotlin.reflect.jvm.internal.impl.descriptors.h) obj).getName(), obj);
                }
                List<ProtoBuf$Annotation.Argument> list = protoBuf$Annotation.f13991l;
                v7.g.e(list, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf$Annotation.Argument argument : list) {
                    v7.g.e(argument, "it");
                    kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) linkedHashMap.get(m0.b.r0(cVar, argument.f13997k));
                    m9.g<?> gVar = null;
                    if (hVar != null) {
                        h9.e r02 = m0.b.r0(cVar, argument.f13997k);
                        y9.r b5 = hVar.b();
                        v7.g.e(b5, "parameter.type");
                        ProtoBuf$Annotation.Argument.Value value = argument.f13998l;
                        v7.g.e(value, "proto.value");
                        m9.g<?> c10 = c(b5, value, cVar);
                        if (b(c10, b5, value)) {
                            gVar = c10;
                        }
                        if (gVar == null) {
                            String str = "Unexpected argument value: actual type " + value.f14004k + " != expected type " + b5;
                            v7.g.f(str, "message");
                            gVar = new j.a(str);
                        }
                        gVar = new Pair(r02, gVar);
                    }
                    if (gVar != null) {
                        arrayList.add(gVar);
                    }
                }
                K1 = kotlin.collections.d.N1(arrayList);
            }
        }
        return new m8.d(c.r(), K1, d0.f15835a);
    }

    public final boolean b(m9.g<?> gVar, y9.r rVar, ProtoBuf$Annotation.Argument.Value value) {
        int i10;
        l8.b bVar;
        boolean z10;
        ProtoBuf$Annotation.Argument.Value.Type type = value.f14004k;
        if (type == null) {
            i10 = -1;
        } else {
            i10 = C0230a.f17896a[type.ordinal()];
        }
        if (i10 != 10) {
            l8.s sVar = this.f17894a;
            if (i10 != 13) {
                return v7.g.a(gVar.a(sVar), rVar);
            }
            if ((gVar instanceof m9.b) && ((List) ((m9.b) gVar).f16022a).size() == value.f14011s.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                y9.r g10 = sVar.u().g(rVar);
                m9.b bVar2 = (m9.b) gVar;
                Collection collection = (Collection) bVar2.f16022a;
                v7.g.f(collection, "<this>");
                b8.i iVar = new b8.i(0, collection.size() - 1);
                if ((iVar instanceof Collection) && ((Collection) iVar).isEmpty()) {
                    return true;
                }
                b8.h it = iVar.iterator();
                while (it.f6502k) {
                    int nextInt = it.nextInt();
                    ProtoBuf$Annotation.Argument.Value value2 = value.f14011s.get(nextInt);
                    v7.g.e(value2, "value.getArrayElement(i)");
                    if (!b((m9.g) ((List) bVar2.f16022a).get(nextInt), g10, value2)) {
                    }
                }
                return true;
            }
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        l8.d c = rVar.U0().c();
        if (c instanceof l8.b) {
            bVar = (l8.b) c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return true;
        }
        h9.e eVar = kotlin.reflect.jvm.internal.impl.builtins.e.f13324e;
        if (kotlin.reflect.jvm.internal.impl.builtins.e.c(bVar, g.a.P)) {
            return true;
        }
        return false;
    }

    public final m9.g<?> c(y9.r rVar, ProtoBuf$Annotation.Argument.Value value, f9.c cVar) {
        int i10;
        m9.g<?> eVar;
        m9.g<?> oVar;
        boolean z10;
        v7.g.f(cVar, "nameResolver");
        boolean v3 = a4.b.v(f9.b.M, value.f14013u, "IS_UNSIGNED.get(value.flags)");
        ProtoBuf$Annotation.Argument.Value.Type type = value.f14004k;
        if (type == null) {
            i10 = -1;
        } else {
            i10 = C0230a.f17896a[type.ordinal()];
        }
        switch (i10) {
            case 1:
                byte b5 = (byte) value.f14005l;
                if (v3) {
                    return new m9.s(b5);
                }
                return new m9.d(b5);
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                eVar = new m9.e((char) value.f14005l);
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                short s10 = (short) value.f14005l;
                if (v3) {
                    return new v(s10);
                }
                return new m9.q(s10);
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                int i11 = (int) value.f14005l;
                if (v3) {
                    eVar = new t(i11);
                    break;
                } else {
                    eVar = new m9.k(i11);
                    break;
                }
            case 5:
                long j2 = value.f14005l;
                if (v3) {
                    oVar = new u(j2);
                } else {
                    oVar = new m9.o(j2);
                }
                return oVar;
            case 6:
                eVar = new m9.c(value.f14006m);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                eVar = new m9.h(value.n);
                break;
            case 8:
                if (value.f14005l != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eVar = new m9.c(z10);
                break;
            case ma.i.f16046m /* 9 */:
                eVar = new m9.r(cVar.getString(value.f14007o));
                break;
            case ma.i.f16047o /* 10 */:
                eVar = new m9.n(m0.b.j0(cVar, value.f14008p), value.f14012t);
                break;
            case 11:
                eVar = new m9.i(m0.b.j0(cVar, value.f14008p), m0.b.r0(cVar, value.f14009q));
                break;
            case 12:
                ProtoBuf$Annotation protoBuf$Annotation = value.f14010r;
                v7.g.e(protoBuf$Annotation, "value.annotation");
                eVar = new m9.a(a(protoBuf$Annotation, cVar));
                break;
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> list = value.f14011s;
                v7.g.e(list, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(n7.l.Z1(list, 10));
                for (ProtoBuf$Annotation.Argument.Value value2 : list) {
                    y9.v f10 = this.f17894a.u().f();
                    v7.g.e(f10, "builtIns.anyType");
                    v7.g.e(value2, "it");
                    arrayList.add(c(f10, value2, cVar));
                }
                return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.e(arrayList, rVar);
            default:
                StringBuilder sb = new StringBuilder("Unsupported annotation argument type: ");
                sb.append(value.f14004k);
                sb.append(" (expected ");
                sb.append(rVar);
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
        }
        return eVar;
    }
}
