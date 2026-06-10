package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.jvm.internal.Lambda;
import u7.a;
import v7.g;
import y9.f0;
import y9.r;

/* loaded from: classes.dex */
public final class CapturedTypeConstructorKt$createCapturedIfNeeded$1 extends Lambda implements a<r> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ f0 f14702j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturedTypeConstructorKt$createCapturedIfNeeded$1(f0 f0Var) {
        super(0);
        this.f14702j = f0Var;
    }

    @Override // u7.a
    public final r k0() {
        r b5 = this.f14702j.b();
        g.e(b5, "this@createCapturedIfNeeded.type");
        return b5;
    }
}
