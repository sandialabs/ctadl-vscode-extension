package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import h9.e;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import m9.b;
import m9.i;
import m9.r;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f13505a = e.k("message");

    /* renamed from: b  reason: collision with root package name */
    public static final e f13506b = e.k("replaceWith");
    public static final e c = e.k("level");

    /* renamed from: d  reason: collision with root package name */
    public static final e f13507d = e.k("expression");

    /* renamed from: e  reason: collision with root package name */
    public static final e f13508e = e.k("imports");

    public static BuiltInAnnotationDescriptor a(kotlin.reflect.jvm.internal.impl.builtins.e eVar) {
        g.f(eVar, "<this>");
        return new BuiltInAnnotationDescriptor(eVar, g.a.f13371m, d.M1(new Pair(f13505a, new r("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new Pair(f13506b, new m9.a(new BuiltInAnnotationDescriptor(eVar, g.a.f13372o, d.M1(new Pair(f13507d, new r("")), new Pair(f13508e, new b(EmptyList.f12981i, new AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1(eVar))))))), new Pair(c, new i(h9.b.l(g.a.n), e.k("WARNING")))));
    }
}
