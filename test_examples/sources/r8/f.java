package r8;

import java.lang.annotation.Annotation;

/* loaded from: classes.dex */
public final class f extends e implements b9.c {

    /* renamed from: b  reason: collision with root package name */
    public final Annotation f17148b;

    public f(h9.e eVar, Annotation annotation) {
        super(eVar);
        this.f17148b = annotation;
    }

    @Override // b9.c
    public final d b() {
        return new d(this.f17148b);
    }
}
