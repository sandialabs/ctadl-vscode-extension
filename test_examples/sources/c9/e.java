package c9;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final NullabilityQualifier f6571a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6572b;

    public /* synthetic */ e() {
        throw null;
    }

    public e(NullabilityQualifier nullabilityQualifier, boolean z10) {
        this.f6571a = nullabilityQualifier;
        this.f6572b = z10;
    }

    public static e a(e eVar, NullabilityQualifier nullabilityQualifier, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = eVar.f6571a;
        }
        if ((i10 & 2) != 0) {
            z10 = eVar.f6572b;
        }
        eVar.getClass();
        v7.g.f(nullabilityQualifier, "qualifier");
        return new e(nullabilityQualifier, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f6571a == eVar.f6571a && this.f6572b == eVar.f6572b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f6571a.hashCode() * 31;
        boolean z10 = this.f6572b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f6571a + ", isForWarningOnly=" + this.f6572b + ')';
    }
}
