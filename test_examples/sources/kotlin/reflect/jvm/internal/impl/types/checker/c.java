package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.m;
import y9.v;

/* loaded from: classes.dex */
public final class c extends m.b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f14995a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TypeSubstitutor f14996b;

    public c(b bVar, TypeSubstitutor typeSubstitutor) {
        this.f14995a = bVar;
        this.f14996b = typeSubstitutor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m.b
    public final ba.g a(m mVar, ba.f fVar) {
        v7.g.f(mVar, "state");
        v7.g.f(fVar, "type");
        b bVar = this.f14995a;
        v I = bVar.I(fVar);
        v7.g.d(I, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
        v f10 = bVar.f(this.f14996b.i(I, Variance.INVARIANT));
        v7.g.c(f10);
        return f10;
    }
}
