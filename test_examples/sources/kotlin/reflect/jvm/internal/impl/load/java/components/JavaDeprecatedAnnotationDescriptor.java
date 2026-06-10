package kotlin.reflect.jvm.internal.impl.load.java.components;

import b9.a;
import c8.j;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import m0.b;
import v7.i;
import x8.c;
import x9.e;

/* loaded from: classes.dex */
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13666h = {i.c(new PropertyReference1Impl(i.a(JavaDeprecatedAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g  reason: collision with root package name */
    public final e f13667g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(a aVar, c cVar) {
        super(cVar, aVar, g.a.f13371m);
        v7.g.f(cVar, "c");
        this.f13667g = cVar.f18762a.f18739a.a(JavaDeprecatedAnnotationDescriptor$allValueArguments$2.f13668j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, m8.c
    public final Map<h9.e, m9.g<?>> a() {
        return (Map) b.u0(this.f13667g, f13666h[0]);
    }
}
