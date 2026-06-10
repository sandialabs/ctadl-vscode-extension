package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Lambda;
import m8.e;
import u8.o;
import v7.g;
import x8.c;

/* loaded from: classes.dex */
public final class ContextKt$copyWithNewDefaultTypeQualifiers$1 extends Lambda implements u7.a<o> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f13686j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ e f13687k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextKt$copyWithNewDefaultTypeQualifiers$1(c cVar, e eVar) {
        super(0);
        this.f13686j = cVar;
        this.f13687k = eVar;
    }

    @Override // u7.a
    public final o k0() {
        c cVar = this.f13686j;
        g.f(cVar, "<this>");
        e eVar = this.f13687k;
        g.f(eVar, "additionalAnnotations");
        return cVar.f18762a.f18753q.b((o) cVar.f18764d.getValue(), eVar);
    }
}
