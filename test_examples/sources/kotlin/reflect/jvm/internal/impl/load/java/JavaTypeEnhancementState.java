package kotlin.reflect.jvm.internal.impl.load.java;

import u7.l;
import u8.m;
import u8.n;
import v7.g;

/* loaded from: classes.dex */
public final class JavaTypeEnhancementState {

    /* renamed from: d  reason: collision with root package name */
    public static final JavaTypeEnhancementState f13618d;

    /* renamed from: a  reason: collision with root package name */
    public final e f13619a;

    /* renamed from: b  reason: collision with root package name */
    public final l<h9.c, ReportLevel> f13620b;
    public final boolean c;

    static {
        ReportLevel reportLevel;
        ReportLevel reportLevel2;
        h9.c cVar = m.f17855a;
        m7.d dVar = m7.d.f15989m;
        g.f(dVar, "configuredKotlinVersion");
        n nVar = m.f17857d;
        m7.d dVar2 = nVar.f17860b;
        if (dVar2 != null && dVar2.f15993l - dVar.f15993l <= 0) {
            reportLevel = nVar.c;
        } else {
            reportLevel = nVar.f17859a;
        }
        g.f(reportLevel, "globalReportLevel");
        if (reportLevel == ReportLevel.f13626k) {
            reportLevel2 = null;
        } else {
            reportLevel2 = reportLevel;
        }
        f13618d = new JavaTypeEnhancementState(new e(reportLevel, reportLevel2), JavaTypeEnhancementState$Companion$DEFAULT$1.f13621r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(e eVar, l<? super h9.c, ? extends ReportLevel> lVar) {
        boolean z10;
        g.f(lVar, "getReportLevelForAnnotation");
        this.f13619a = eVar;
        this.f13620b = lVar;
        if (!eVar.f13683d) {
            if (((JavaTypeEnhancementState$Companion$DEFAULT$1) lVar).U(m.f17855a) != ReportLevel.f13625j) {
                z10 = false;
                this.c = z10;
            }
        }
        z10 = true;
        this.c = z10;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f13619a + ", getReportLevelForAnnotation=" + this.f13620b + ')';
    }
}
