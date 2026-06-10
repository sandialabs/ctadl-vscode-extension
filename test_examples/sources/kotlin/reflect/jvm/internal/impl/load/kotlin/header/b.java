package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;

/* loaded from: classes.dex */
public final class b extends a.AbstractC0161a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.b f13980b;

    public b(a.b bVar) {
        this.f13980b = bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.AbstractC0161a
    public final void f(String[] strArr) {
        if (strArr != null) {
            a.this.f13971d = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
    }
}
