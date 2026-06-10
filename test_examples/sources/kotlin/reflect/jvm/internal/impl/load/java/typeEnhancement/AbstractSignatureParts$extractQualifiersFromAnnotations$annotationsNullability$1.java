package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import u7.l;
import v7.g;
import w8.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1 extends Lambda implements l<Object, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a<Object> f13844j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1(a<Object> aVar) {
        super(1);
        this.f13844j = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r0.f6577d == kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.n) goto L5;
     */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean U(Object obj) {
        boolean z10;
        g.f(obj, "$this$extractNullability");
        c9.g gVar = (c9.g) this.f13844j;
        gVar.getClass();
        m8.c cVar = (m8.c) obj;
        if (!(cVar instanceof f) || !((f) cVar).i()) {
            if (cVar instanceof LazyJavaAnnotationDescriptor) {
                gVar.c.f18762a.f18756t.c();
                if (!((LazyJavaAnnotationDescriptor) cVar).f13721h) {
                }
            }
            z10 = false;
            return Boolean.valueOf(z10);
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
