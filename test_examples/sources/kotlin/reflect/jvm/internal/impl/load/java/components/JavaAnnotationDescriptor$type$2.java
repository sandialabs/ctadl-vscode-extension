package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Lambda;
import u7.a;
import v7.g;
import x8.c;
import y9.v;

/* loaded from: classes.dex */
public final class JavaAnnotationDescriptor$type$2 extends Lambda implements a<v> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f13663j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ JavaAnnotationDescriptor f13664k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaAnnotationDescriptor$type$2(c cVar, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        super(0);
        this.f13663j = cVar;
        this.f13664k = javaAnnotationDescriptor;
    }

    @Override // u7.a
    public final v k0() {
        v r3 = this.f13663j.f18762a.f18751o.u().j(this.f13664k.f13659a).r();
        g.e(r3, "c.module.builtIns.getBui…qName(fqName).defaultType");
        return r3;
    }
}
