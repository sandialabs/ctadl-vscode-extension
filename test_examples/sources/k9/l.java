package k9;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import y9.r;

/* loaded from: classes.dex */
public final class l extends kotlin.reflect.jvm.internal.impl.types.m {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m f12945i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, KotlinTypePreparator kotlinTypePreparator, kotlin.reflect.jvm.internal.impl.types.checker.e eVar) {
        super(true, true, mVar, kotlinTypePreparator, eVar);
        this.f12945i = mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m
    public final boolean b(ba.f fVar, ba.f fVar2) {
        v7.g.f(fVar, "subType");
        v7.g.f(fVar2, "superType");
        if (fVar instanceof r) {
            if (fVar2 instanceof r) {
                return this.f12945i.f12949e.R(fVar, fVar2).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
