package u8;

import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d  reason: collision with root package name */
    public static final n f17858d = new n(ReportLevel.f13627l, 6);

    /* renamed from: a  reason: collision with root package name */
    public final ReportLevel f17859a;

    /* renamed from: b  reason: collision with root package name */
    public final m7.d f17860b;
    public final ReportLevel c;

    public n(ReportLevel reportLevel, int i10) {
        this(reportLevel, (i10 & 2) != 0 ? new m7.d(0, 0) : null, (i10 & 4) != 0 ? reportLevel : null);
    }

    public n(ReportLevel reportLevel, m7.d dVar, ReportLevel reportLevel2) {
        v7.g.f(reportLevel2, "reportLevelAfter");
        this.f17859a = reportLevel;
        this.f17860b = dVar;
        this.c = reportLevel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f17859a == nVar.f17859a && v7.g.a(this.f17860b, nVar.f17860b) && this.c == nVar.c;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f17859a.hashCode() * 31;
        m7.d dVar = this.f17860b;
        if (dVar == null) {
            i10 = 0;
        } else {
            i10 = dVar.f15993l;
        }
        return this.c.hashCode() + ((hashCode + i10) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f17859a + ", sinceVersion=" + this.f17860b + ", reportLevelAfter=" + this.c + ')';
    }
}
