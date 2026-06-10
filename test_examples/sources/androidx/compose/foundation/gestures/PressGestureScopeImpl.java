package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.sync.MutexImpl;
import t.g;

/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements g, b2.b {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b2.b f1764i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1765j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1766k;

    /* renamed from: l  reason: collision with root package name */
    public final MutexImpl f1767l;

    public PressGestureScopeImpl(b2.b bVar) {
        v7.g.f(bVar, "density");
        this.f1764i = bVar;
        this.f1767l = new MutexImpl(false);
    }

    @Override // b2.b
    public final float H(float f10) {
        return this.f1764i.H(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // t.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(p7.c<? super Boolean> cVar) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        int i10;
        PressGestureScopeImpl pressGestureScopeImpl;
        if (cVar instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) cVar;
            int i11 = pressGestureScopeImpl$tryAwaitRelease$1.f1770o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.f1770o = i11 - Integer.MIN_VALUE;
                Object obj = pressGestureScopeImpl$tryAwaitRelease$1.f1769m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = pressGestureScopeImpl$tryAwaitRelease$1.f1770o;
                if (i10 == 0) {
                    if (i10 == 1) {
                        pressGestureScopeImpl = pressGestureScopeImpl$tryAwaitRelease$1.f1768l;
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    if (!this.f1765j && !this.f1766k) {
                        pressGestureScopeImpl$tryAwaitRelease$1.f1768l = this;
                        pressGestureScopeImpl$tryAwaitRelease$1.f1770o = 1;
                        if (this.f1767l.b(null, pressGestureScopeImpl$tryAwaitRelease$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    pressGestureScopeImpl = this;
                }
                return Boolean.valueOf(pressGestureScopeImpl.f1765j);
            }
        }
        pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, cVar);
        Object obj2 = pressGestureScopeImpl$tryAwaitRelease$1.f1769m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = pressGestureScopeImpl$tryAwaitRelease$1.f1770o;
        if (i10 == 0) {
        }
        return Boolean.valueOf(pressGestureScopeImpl.f1765j);
    }

    @Override // b2.b
    public final int a0(float f10) {
        return this.f1764i.a0(f10);
    }

    @Override // b2.b
    public final long g0(long j2) {
        return this.f1764i.g0(j2);
    }

    @Override // b2.b
    public final float getDensity() {
        return this.f1764i.getDensity();
    }

    @Override // b2.b
    public final float i0(long j2) {
        return this.f1764i.i0(j2);
    }

    @Override // b2.b
    public final float r0(int i10) {
        return this.f1764i.r0(i10);
    }

    @Override // b2.b
    public final float t0(float f10) {
        return this.f1764i.t0(f10);
    }

    @Override // b2.b
    public final float y() {
        return this.f1764i.y();
    }
}
