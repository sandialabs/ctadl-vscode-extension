package kotlin.reflect.jvm.internal.impl.builtins;

import c8.j;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import v7.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final NotFoundClasses f13332a;

    /* renamed from: b  reason: collision with root package name */
    public final m7.e f13333b;
    public final a c = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ j<Object>[] f13331e = {i.c(new PropertyReference1Impl(i.a(f.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), i.c(new PropertyReference1Impl(i.a(f.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), i.c(new PropertyReference1Impl(i.a(f.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), i.c(new PropertyReference1Impl(i.a(f.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), i.c(new PropertyReference1Impl(i.a(f.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), i.c(new PropertyReference1Impl(i.a(f.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), i.c(new PropertyReference1Impl(i.a(f.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), i.c(new PropertyReference1Impl(i.a(f.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final b f13330d = new b();

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    public f(kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar, NotFoundClasses notFoundClasses) {
        this.f13332a = notFoundClasses;
        this.f13333b = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new ReflectionTypes$kotlinReflectScope$2(cVar));
    }
}
