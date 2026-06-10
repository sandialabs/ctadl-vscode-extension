package v8;

import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import u8.q;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final h9.e f18181a = h9.e.k("message");

    /* renamed from: b  reason: collision with root package name */
    public static final h9.e f18182b = h9.e.k("allowedTargets");
    public static final h9.e c = h9.e.k("value");

    /* renamed from: d  reason: collision with root package name */
    public static final Map<h9.c, h9.c> f18183d = kotlin.collections.d.M1(new Pair(g.a.f13377t, q.c), new Pair(g.a.f13380w, q.f17866d), new Pair(g.a.f13381x, q.f17868f));

    public static w8.f a(h9.c cVar, b9.d dVar, x8.c cVar2) {
        b9.a j2;
        v7.g.f(cVar, "kotlinName");
        v7.g.f(dVar, "annotationOwner");
        v7.g.f(cVar2, "c");
        if (v7.g.a(cVar, g.a.f13371m)) {
            h9.c cVar3 = q.f17867e;
            v7.g.e(cVar3, "DEPRECATED_ANNOTATION");
            b9.a j10 = dVar.j(cVar3);
            if (j10 == null) {
                dVar.s();
            } else {
                return new JavaDeprecatedAnnotationDescriptor(j10, cVar2);
            }
        }
        h9.c cVar4 = f18183d.get(cVar);
        if (cVar4 != null && (j2 = dVar.j(cVar4)) != null) {
            return b(cVar2, j2, false);
        }
        return null;
    }

    public static w8.f b(x8.c cVar, b9.a aVar, boolean z10) {
        v7.g.f(aVar, "annotation");
        v7.g.f(cVar, "c");
        h9.b d5 = aVar.d();
        if (v7.g.a(d5, h9.b.l(q.c))) {
            return new JavaTargetAnnotationDescriptor(aVar, cVar);
        }
        if (v7.g.a(d5, h9.b.l(q.f17866d))) {
            return new JavaRetentionAnnotationDescriptor(aVar, cVar);
        }
        if (v7.g.a(d5, h9.b.l(q.f17868f))) {
            return new JavaAnnotationDescriptor(cVar, aVar, g.a.f13381x);
        }
        if (v7.g.a(d5, h9.b.l(q.f17867e))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(cVar, aVar, z10);
    }
}
