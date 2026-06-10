package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import v7.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ReportLevel f13681a;

    /* renamed from: b  reason: collision with root package name */
    public final ReportLevel f13682b;
    public final Map<h9.c, ReportLevel> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13683d;

    public e() {
        throw null;
    }

    public e(ReportLevel reportLevel, ReportLevel reportLevel2) {
        Map<h9.c, ReportLevel> K1 = kotlin.collections.d.K1();
        this.f13681a = reportLevel;
        this.f13682b = reportLevel2;
        this.c = K1;
        kotlin.a.b(new Jsr305Settings$description$2(this));
        ReportLevel reportLevel3 = ReportLevel.f13625j;
        this.f13683d = reportLevel == reportLevel3 && reportLevel2 == reportLevel3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f13681a == eVar.f13681a && this.f13682b == eVar.f13682b && g.a(this.c, eVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13681a.hashCode() * 31;
        ReportLevel reportLevel = this.f13682b;
        return this.c.hashCode() + ((hashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f13681a + ", migrationLevel=" + this.f13682b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
