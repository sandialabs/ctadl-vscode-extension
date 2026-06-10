package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.c;
import kotlin.collections.d;

/* loaded from: classes.dex */
public enum KotlinTarget {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PROJECTION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);
    

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<String, KotlinTarget> f13488j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    public static final Set<KotlinTarget> f13489k;

    /* renamed from: l  reason: collision with root package name */
    public static final Set<KotlinTarget> f13490l;

    /* renamed from: m  reason: collision with root package name */
    public static final List<KotlinTarget> f13491m;
    public static final List<KotlinTarget> n;

    /* renamed from: o  reason: collision with root package name */
    public static final List<KotlinTarget> f13492o;

    /* renamed from: p  reason: collision with root package name */
    public static final List<KotlinTarget> f13493p;

    /* renamed from: q  reason: collision with root package name */
    public static final List<KotlinTarget> f13494q;

    /* renamed from: r  reason: collision with root package name */
    public static final List<KotlinTarget> f13495r;

    /* renamed from: s  reason: collision with root package name */
    public static final List<KotlinTarget> f13496s;

    /* renamed from: t  reason: collision with root package name */
    public static final List<KotlinTarget> f13497t;

    /* renamed from: u  reason: collision with root package name */
    public static final List<KotlinTarget> f13498u;

    /* renamed from: v  reason: collision with root package name */
    public static final List<KotlinTarget> f13499v;

    /* renamed from: w  reason: collision with root package name */
    public static final List<KotlinTarget> f13500w;

    /* renamed from: x  reason: collision with root package name */
    public static final List<KotlinTarget> f13501x;

    /* renamed from: y  reason: collision with root package name */
    public static final Map<AnnotationUseSiteTarget, KotlinTarget> f13502y;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f13504i;

    static {
        KotlinTarget[] values;
        for (KotlinTarget kotlinTarget : values()) {
            f13488j.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : values2) {
            if (kotlinTarget2.f13504i) {
                arrayList.add(kotlinTarget2);
            }
        }
        f13489k = c.Q2(arrayList);
        f13490l = b.x2(values());
        KotlinTarget kotlinTarget3 = CLASS;
        f13491m = a1.c.O0(ANNOTATION_CLASS, kotlinTarget3);
        n = a1.c.O0(LOCAL_CLASS, kotlinTarget3);
        f13492o = a1.c.O0(CLASS_ONLY, kotlinTarget3);
        KotlinTarget kotlinTarget4 = OBJECT;
        f13493p = a1.c.O0(COMPANION_OBJECT, kotlinTarget4, kotlinTarget3);
        f13494q = a1.c.O0(STANDALONE_OBJECT, kotlinTarget4, kotlinTarget3);
        f13495r = a1.c.O0(INTERFACE, kotlinTarget3);
        f13496s = a1.c.O0(ENUM_CLASS, kotlinTarget3);
        KotlinTarget kotlinTarget5 = PROPERTY;
        KotlinTarget kotlinTarget6 = FIELD;
        f13497t = a1.c.O0(ENUM_ENTRY, kotlinTarget5, kotlinTarget6);
        KotlinTarget kotlinTarget7 = PROPERTY_SETTER;
        f13498u = a1.c.N0(kotlinTarget7);
        KotlinTarget kotlinTarget8 = PROPERTY_GETTER;
        f13499v = a1.c.N0(kotlinTarget8);
        f13500w = a1.c.N0(FUNCTION);
        KotlinTarget kotlinTarget9 = FILE;
        f13501x = a1.c.N0(kotlinTarget9);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.f13471p;
        KotlinTarget kotlinTarget10 = VALUE_PARAMETER;
        f13502y = d.M1(new Pair(annotationUseSiteTarget, kotlinTarget10), new Pair(AnnotationUseSiteTarget.f13466j, kotlinTarget6), new Pair(AnnotationUseSiteTarget.f13468l, kotlinTarget5), new Pair(AnnotationUseSiteTarget.f13467k, kotlinTarget9), new Pair(AnnotationUseSiteTarget.f13469m, kotlinTarget8), new Pair(AnnotationUseSiteTarget.n, kotlinTarget7), new Pair(AnnotationUseSiteTarget.f13470o, kotlinTarget10), new Pair(AnnotationUseSiteTarget.f13472q, kotlinTarget10), new Pair(AnnotationUseSiteTarget.f13473r, kotlinTarget6));
    }

    KotlinTarget(boolean z10) {
        this.f13504i = z10;
    }
}
