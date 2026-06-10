package c9;

import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.types.r;
import y9.v;

/* loaded from: classes.dex */
public final class g extends kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a<m8.c> {

    /* renamed from: a  reason: collision with root package name */
    public final m8.a f6575a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6576b;
    public final x8.c c;

    /* renamed from: d  reason: collision with root package name */
    public final AnnotationQualifierApplicabilityType f6577d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6578e;

    public /* synthetic */ g(m8.a aVar, boolean z10, x8.c cVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        this(aVar, z10, cVar, annotationQualifierApplicabilityType, false);
    }

    public g(m8.a aVar, boolean z10, x8.c cVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z11) {
        v7.g.f(cVar, "containerContext");
        this.f6575a = aVar;
        this.f6576b = z10;
        this.c = cVar;
        this.f6577d = annotationQualifierApplicabilityType;
        this.f6578e = z11;
    }

    public final h9.d e(v vVar) {
        l8.b bVar;
        aa.f fVar = r.f15073a;
        l8.d c = vVar.U0().c();
        if (c instanceof l8.b) {
            bVar = (l8.b) c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        return k9.d.g(bVar);
    }
}
