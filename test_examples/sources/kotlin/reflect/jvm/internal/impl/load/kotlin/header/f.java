package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;

/* loaded from: classes.dex */
public final class f extends a.AbstractC0161a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.d f13984b;

    public f(a.d dVar) {
        this.f13984b = dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.AbstractC0161a
    public final void f(String[] strArr) {
        if (strArr != null) {
            a.this.f13972e = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
    }
}
