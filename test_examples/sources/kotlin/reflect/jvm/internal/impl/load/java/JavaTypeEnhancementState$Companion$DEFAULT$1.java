package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.FunctionReference;
import u7.l;
import u8.m;
import u8.n;
import u8.s;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
public /* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends FunctionReference implements l<h9.c, ReportLevel> {

    /* renamed from: r  reason: collision with root package name */
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 f13621r = new JavaTypeEnhancementState$Companion$DEFAULT$1();

    public JavaTypeEnhancementState$Companion$DEFAULT$1() {
        super(1);
    }

    @Override // u7.l
    public final ReportLevel U(h9.c cVar) {
        ReportLevel reportLevel;
        h9.c cVar2 = cVar;
        g.f(cVar2, "p0");
        h9.c cVar3 = m.f17855a;
        s.f17891a.getClass();
        NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl = s.a.f17893b;
        m7.d dVar = new m7.d(7, 20);
        g.f(nullabilityAnnotationStatesImpl, "configuredReportLevels");
        ReportLevel reportLevel2 = (ReportLevel) nullabilityAnnotationStatesImpl.c.U(cVar2);
        if (reportLevel2 == null) {
            NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl2 = m.c;
            nullabilityAnnotationStatesImpl2.getClass();
            n nVar = (n) nullabilityAnnotationStatesImpl2.c.U(cVar2);
            if (nVar == null) {
                return ReportLevel.f13625j;
            }
            m7.d dVar2 = nVar.f17860b;
            if (dVar2 != null && dVar2.f15993l - dVar.f15993l <= 0) {
                reportLevel = nVar.c;
            } else {
                reportLevel = nVar.f17859a;
            }
            return reportLevel;
        }
        return reportLevel2;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final c8.d d() {
        return i.f18169a.c(m.class, "compiler.common.jvm");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }
}
