package u8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h9.c f17834a = new h9.c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b  reason: collision with root package name */
    public static final h9.c f17835b = new h9.c("javax.annotation.meta.TypeQualifier");
    public static final h9.c c = new h9.c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d  reason: collision with root package name */
    public static final h9.c f17836d = new h9.c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e  reason: collision with root package name */
    public static final List<AnnotationQualifierApplicabilityType> f17837e;

    /* renamed from: f  reason: collision with root package name */
    public static final Map<h9.c, j> f17838f;

    /* renamed from: g  reason: collision with root package name */
    public static final LinkedHashMap f17839g;

    /* renamed from: h  reason: collision with root package name */
    public static final Set<h9.c> f17840h;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.f13606k;
        List<AnnotationQualifierApplicabilityType> O0 = a1.c.O0(AnnotationQualifierApplicabilityType.f13607l, AnnotationQualifierApplicabilityType.f13605j, annotationQualifierApplicabilityType, AnnotationQualifierApplicabilityType.n, AnnotationQualifierApplicabilityType.f13608m);
        f17837e = O0;
        h9.c cVar = r.c;
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<h9.c, j> P0 = m0.b.P0(new Pair(cVar, new j(new c9.e(nullabilityQualifier, false), O0, false)));
        f17838f = P0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.d.M1(new Pair(new h9.c("javax.annotation.ParametersAreNullableByDefault"), new j(new c9.e(NullabilityQualifier.NULLABLE, false), a1.c.N0(annotationQualifierApplicabilityType))), new Pair(new h9.c("javax.annotation.ParametersAreNonnullByDefault"), new j(new c9.e(nullabilityQualifier, false), a1.c.N0(annotationQualifierApplicabilityType)))));
        linkedHashMap.putAll(P0);
        f17839g = linkedHashMap;
        f17840h = a1.c.w1(r.f17882e, r.f17883f);
    }
}
