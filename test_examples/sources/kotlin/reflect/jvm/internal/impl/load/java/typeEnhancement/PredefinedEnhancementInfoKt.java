package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d;

/* loaded from: classes.dex */
public final class PredefinedEnhancementInfoKt {

    /* renamed from: a  reason: collision with root package name */
    public static final c9.c f13853a = new c9.c(NullabilityQualifier.NULLABLE, false);

    /* renamed from: b  reason: collision with root package name */
    public static final c9.c f13854b;
    public static final c9.c c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f13855d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f13854b = new c9.c(nullabilityQualifier, false);
        c = new c9.c(nullabilityQualifier, true);
        String concat = "java/lang/".concat("Object");
        String concat2 = "java/util/function/".concat("Predicate");
        String concat3 = "java/util/function/".concat("Function");
        String concat4 = "java/util/function/".concat("Consumer");
        String concat5 = "java/util/function/".concat("BiFunction");
        String concat6 = "java/util/function/".concat("BiConsumer");
        String concat7 = "java/util/function/".concat("UnaryOperator");
        String concat8 = "java/util/".concat("stream/Stream");
        String concat9 = "java/util/".concat("Optional");
        d dVar = new d();
        new d.a(dVar, "java/util/".concat("Iterator")).a("forEachRemaining", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$1$1(concat4));
        new d.a(dVar, "java/lang/".concat("Iterable")).a("spliterator", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$2$1());
        d.a aVar = new d.a(dVar, "java/util/".concat("Collection"));
        aVar.a("removeIf", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$1(concat2));
        aVar.a("stream", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$2(concat8));
        aVar.a("parallelStream", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$3$3(concat8));
        new d.a(dVar, "java/util/".concat("List")).a("replaceAll", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$4$1(concat7));
        d.a aVar2 = new d.a(dVar, "java/util/".concat("Map"));
        aVar2.a("forEach", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$1(concat6));
        aVar2.a("putIfAbsent", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$2(concat));
        aVar2.a("replace", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$3(concat));
        aVar2.a("replace", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$4(concat));
        aVar2.a("replaceAll", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$5(concat5));
        aVar2.a("compute", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$6(concat, concat5));
        aVar2.a("computeIfAbsent", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$7(concat, concat3));
        aVar2.a("computeIfPresent", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$8(concat, concat5));
        aVar2.a("merge", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9(concat, concat5));
        d.a aVar3 = new d.a(dVar, concat9);
        aVar3.a("empty", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$1(concat9));
        aVar3.a("of", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$2(concat, concat9));
        aVar3.a("ofNullable", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$3(concat, concat9));
        aVar3.a("get", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$4(concat));
        aVar3.a("ifPresent", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$6$5(concat4));
        new d.a(dVar, "java/lang/".concat("ref/Reference")).a("get", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$7$1(concat));
        new d.a(dVar, concat2).a("test", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$8$1(concat));
        new d.a(dVar, "java/util/function/".concat("BiPredicate")).a("test", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$9$1(concat));
        new d.a(dVar, concat4).a("accept", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$10$1(concat));
        new d.a(dVar, concat6).a("accept", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$11$1(concat));
        new d.a(dVar, concat3).a("apply", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$12$1(concat));
        new d.a(dVar, concat5).a("apply", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$13$1(concat));
        new d.a(dVar, "java/util/function/".concat("Supplier")).a("get", new PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$14$1(concat));
        f13855d = dVar.f13906a;
    }
}
