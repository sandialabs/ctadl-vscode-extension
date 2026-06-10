package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;

/* loaded from: classes.dex */
public final class d extends a.AbstractC0161a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.c f13982b;

    public d(a.c cVar) {
        this.f13982b = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.AbstractC0161a
    public final void f(String[] strArr) {
        if (strArr != null) {
            a.this.f13975h = strArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
    }
}
