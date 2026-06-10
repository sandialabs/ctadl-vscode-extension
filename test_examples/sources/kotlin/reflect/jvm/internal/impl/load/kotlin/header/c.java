package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;

/* loaded from: classes.dex */
public final class c extends a.AbstractC0161a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.b f13981b;

    public c(a.b bVar) {
        this.f13981b = bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.AbstractC0161a
    public final void f(String[] strArr) {
        if (strArr != null) {
            a.this.f13972e = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
    }
}
