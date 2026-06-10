package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class IntersectionTypeConstructor$makeDebugNameForIntersectionType$3 extends Lambda implements u7.l<y9.r, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.l<y9.r, Object> f14946j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IntersectionTypeConstructor$makeDebugNameForIntersectionType$3(u7.l<? super y9.r, ? extends Object> lVar) {
        super(1);
        this.f14946j = lVar;
    }

    @Override // u7.l
    public final CharSequence U(y9.r rVar) {
        y9.r rVar2 = rVar;
        v7.g.e(rVar2, "it");
        return this.f14946j.U(rVar2).toString();
    }
}
