package kotlin.reflect.jvm.internal.impl.resolve;

import fa.d;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1 extends Lambda implements l<H, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d<H> f14698j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(d<H> dVar) {
        super(1);
        this.f14698j = dVar;
    }

    @Override // u7.l
    public final n U(Object obj) {
        g.e(obj, "it");
        this.f14698j.add(obj);
        return n.f16010a;
    }
}
