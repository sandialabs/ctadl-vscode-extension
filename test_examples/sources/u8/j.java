package u8;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final c9.e f17850a;

    /* renamed from: b  reason: collision with root package name */
    public final Collection<AnnotationQualifierApplicabilityType> f17851b;
    public final boolean c;

    public j(c9.e eVar, Collection collection) {
        this(eVar, collection, eVar.f6571a == NullabilityQualifier.NOT_NULL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(c9.e eVar, Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z10) {
        v7.g.f(collection, "qualifierApplicabilityTypes");
        this.f17850a = eVar;
        this.f17851b = collection;
        this.c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return v7.g.a(this.f17850a, jVar.f17850a) && v7.g.a(this.f17851b, jVar.f17851b) && this.c == jVar.c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f17851b.hashCode() + (this.f17850a.hashCode() * 31)) * 31;
        boolean z10 = this.c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f17850a + ", qualifierApplicabilityTypes=" + this.f17851b + ", definitelyNotNull=" + this.c + ')';
    }
}
