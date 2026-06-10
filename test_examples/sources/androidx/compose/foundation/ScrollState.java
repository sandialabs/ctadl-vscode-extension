package androidx.compose.foundation;

import androidx.compose.runtime.saveable.SaverKt;
import g0.j1;
import g0.k0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m7.n;
import o0.f;
import t.j;
import u.k;
import u7.p;

/* loaded from: classes.dex */
public final class ScrollState implements j {

    /* renamed from: f  reason: collision with root package name */
    public static final f f1580f = SaverKt.a(ScrollState$Companion$Saver$1.f1585j, ScrollState$Companion$Saver$2.f1586j);

    /* renamed from: a  reason: collision with root package name */
    public final k0 f1581a;

    /* renamed from: b  reason: collision with root package name */
    public final k f1582b;
    public final k0 c;

    /* renamed from: d  reason: collision with root package name */
    public float f1583d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.compose.foundation.gestures.b f1584e;

    public ScrollState(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        j1 j1Var = j1.f11059a;
        this.f1581a = a1.c.U0(valueOf, j1Var);
        this.f1582b = new k();
        this.c = a1.c.U0(Integer.MAX_VALUE, j1Var);
        this.f1584e = new androidx.compose.foundation.gestures.b(new ScrollState$scrollableState$1(this));
    }

    @Override // t.j
    public final boolean a() {
        return this.f1584e.a();
    }

    @Override // t.j
    public final float b(float f10) {
        return this.f1584e.b(f10);
    }

    @Override // t.j
    public final Object c(MutatePriority mutatePriority, p pVar, ContinuationImpl continuationImpl) {
        Object c = this.f1584e.c(mutatePriority, pVar, continuationImpl);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : n.f16010a;
    }

    public final int d() {
        return ((Number) this.f1581a.getValue()).intValue();
    }
}
