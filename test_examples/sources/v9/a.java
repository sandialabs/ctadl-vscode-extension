package v9;

import h9.c;
import ha.i;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import v7.g;

/* loaded from: classes.dex */
public final class a extends t9.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f18189m = new a();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a() {
        super(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
        d dVar = new d();
        e9.b.a(dVar);
        GeneratedMessageLite.d<ProtoBuf$Package, Integer> dVar2 = e9.b.f10673a;
        g.e(dVar2, "packageFqName");
        GeneratedMessageLite.d<ProtoBuf$Constructor, List<ProtoBuf$Annotation>> dVar3 = e9.b.c;
        g.e(dVar3, "constructorAnnotation");
        GeneratedMessageLite.d<ProtoBuf$Class, List<ProtoBuf$Annotation>> dVar4 = e9.b.f10674b;
        g.e(dVar4, "classAnnotation");
        GeneratedMessageLite.d<ProtoBuf$Function, List<ProtoBuf$Annotation>> dVar5 = e9.b.f10675d;
        g.e(dVar5, "functionAnnotation");
        GeneratedMessageLite.d<ProtoBuf$Property, List<ProtoBuf$Annotation>> dVar6 = e9.b.f10676e;
        g.e(dVar6, "propertyAnnotation");
        GeneratedMessageLite.d<ProtoBuf$Property, List<ProtoBuf$Annotation>> dVar7 = e9.b.f10677f;
        g.e(dVar7, "propertyGetterAnnotation");
        GeneratedMessageLite.d<ProtoBuf$Property, List<ProtoBuf$Annotation>> dVar8 = e9.b.f10678g;
        g.e(dVar8, "propertySetterAnnotation");
        GeneratedMessageLite.d<ProtoBuf$EnumEntry, List<ProtoBuf$Annotation>> dVar9 = e9.b.f10680i;
        g.e(dVar9, "enumEntryAnnotation");
        GeneratedMessageLite.d<ProtoBuf$Property, ProtoBuf$Annotation.Argument.Value> dVar10 = e9.b.f10679h;
        g.e(dVar10, "compileTimeValue");
        GeneratedMessageLite.d<ProtoBuf$ValueParameter, List<ProtoBuf$Annotation>> dVar11 = e9.b.f10681j;
        g.e(dVar11, "parameterAnnotation");
        GeneratedMessageLite.d<ProtoBuf$Type, List<ProtoBuf$Annotation>> dVar12 = e9.b.f10682k;
        g.e(dVar12, "typeAnnotation");
        GeneratedMessageLite.d<ProtoBuf$TypeParameter, List<ProtoBuf$Annotation>> dVar13 = e9.b.f10683l;
        g.e(dVar13, "typeParameterAnnotation");
    }

    public static String a(c cVar) {
        String b5;
        g.f(cVar, "fqName");
        StringBuilder sb = new StringBuilder();
        sb.append(i.V0(cVar.b(), '.', '/'));
        sb.append('/');
        if (cVar.d()) {
            b5 = "default-package";
        } else {
            b5 = cVar.f().b();
            g.e(b5, "fqName.shortName().asString()");
        }
        sb.append(b5.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
