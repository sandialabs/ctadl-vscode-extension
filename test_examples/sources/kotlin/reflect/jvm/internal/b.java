package kotlin.reflect.jvm.internal;

import g9.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.text.Regex;
import l8.l;
import l8.u;
import l8.z;
import u8.p;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Field f13237a;

        public a(Field field) {
            v7.g.f(field, "field");
            this.f13237a = field;
        }

        @Override // kotlin.reflect.jvm.internal.b
        public final String a() {
            StringBuilder sb = new StringBuilder();
            Field field = this.f13237a;
            String name = field.getName();
            v7.g.e(name, "field.name");
            sb.append(p.a(name));
            sb.append("()");
            Class<?> type = field.getType();
            v7.g.e(type, "field.type");
            sb.append(ReflectClassUtilKt.b(type));
            return sb.toString();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0141b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Method f13238a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f13239b;

        public C0141b(Method method, Method method2) {
            v7.g.f(method, "getterMethod");
            this.f13238a = method;
            this.f13239b = method2;
        }

        @Override // kotlin.reflect.jvm.internal.b
        public final String a() {
            return j.a(this.f13238a);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final z f13240a;

        /* renamed from: b  reason: collision with root package name */
        public final ProtoBuf$Property f13241b;
        public final JvmProtoBuf.JvmPropertySignature c;

        /* renamed from: d  reason: collision with root package name */
        public final f9.c f13242d;

        /* renamed from: e  reason: collision with root package name */
        public final f9.g f13243e;

        /* renamed from: f  reason: collision with root package name */
        public final String f13244f;

        public c(z zVar, ProtoBuf$Property protoBuf$Property, JvmProtoBuf.JvmPropertySignature jvmPropertySignature, f9.c cVar, f9.g gVar) {
            boolean z10;
            String str;
            String sb;
            v7.g.f(protoBuf$Property, "proto");
            v7.g.f(cVar, "nameResolver");
            v7.g.f(gVar, "typeTable");
            this.f13240a = zVar;
            this.f13241b = protoBuf$Property;
            this.c = jvmPropertySignature;
            this.f13242d = cVar;
            this.f13243e = gVar;
            if ((jvmPropertySignature.f14470j & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb = cVar.getString(jvmPropertySignature.f14473m.f14461k) + cVar.getString(jvmPropertySignature.f14473m.f14462l);
            } else {
                d.a b5 = g9.h.b(protoBuf$Property, cVar, gVar, true);
                if (b5 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(p.a(b5.f11270a));
                    l8.f c = zVar.c();
                    v7.g.e(c, "descriptor.containingDeclaration");
                    if (v7.g.a(zVar.g(), l.f15841d) && (c instanceof DeserializedClassDescriptor)) {
                        GeneratedMessageLite.d<ProtoBuf$Class, Integer> dVar = JvmProtoBuf.f14442i;
                        v7.g.e(dVar, "classModuleName");
                        Integer num = (Integer) f9.e.a(((DeserializedClassDescriptor) c).f14825m, dVar);
                        String str2 = (num == null || (str2 = cVar.getString(num.intValue())) == null) ? "main" : "main";
                        Regex regex = h9.f.f11574a;
                        regex.getClass();
                        String replaceAll = regex.f15129i.matcher(str2).replaceAll("_");
                        v7.g.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                        str = "$".concat(replaceAll);
                    } else {
                        if (v7.g.a(zVar.g(), l.f15839a) && (c instanceof u)) {
                            w9.d dVar2 = ((w9.g) zVar).N;
                            if (dVar2 instanceof d9.c) {
                                d9.c cVar2 = (d9.c) dVar2;
                                if (cVar2.c != null) {
                                    StringBuilder sb3 = new StringBuilder("$");
                                    String e10 = cVar2.f10447b.e();
                                    v7.g.e(e10, "className.internalName");
                                    sb3.append(h9.e.k(kotlin.text.b.t1(e10, '/', e10)).b());
                                    str = sb3.toString();
                                }
                            }
                        }
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append("()");
                    sb2.append(b5.f11271b);
                    sb = sb2.toString();
                } else {
                    throw new KotlinReflectionInternalError("No field signature for property: " + zVar);
                }
            }
            this.f13244f = sb;
        }

        @Override // kotlin.reflect.jvm.internal.b
        public final String a() {
            return this.f13244f;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final JvmFunctionSignature.c f13245a;

        /* renamed from: b  reason: collision with root package name */
        public final JvmFunctionSignature.c f13246b;

        public d(JvmFunctionSignature.c cVar, JvmFunctionSignature.c cVar2) {
            this.f13245a = cVar;
            this.f13246b = cVar2;
        }

        @Override // kotlin.reflect.jvm.internal.b
        public final String a() {
            return this.f13245a.f13092b;
        }
    }

    public abstract String a();
}
