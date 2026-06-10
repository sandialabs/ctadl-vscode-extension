package l9;

import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.q;
import l8.i0;
import y9.f0;
import y9.h;
import y9.r;

/* loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, boolean z10) {
        super(qVar);
        this.c = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final boolean b() {
        return this.c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    public final f0 d(r rVar) {
        f0 d5 = this.f18949b.d(rVar);
        i0 i0Var = null;
        if (d5 == null) {
            return null;
        }
        l8.d c = rVar.U0().c();
        if (c instanceof i0) {
            i0Var = (i0) c;
        }
        return CapturedTypeConstructorKt.a(d5, i0Var);
    }
}
