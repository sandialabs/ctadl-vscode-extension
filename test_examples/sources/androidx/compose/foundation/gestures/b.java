package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import g0.k0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m7.n;
import t.i;
import t.j;
import u7.l;
import u7.p;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final l<Float, Float> f1861a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1862b = new a();
    public final MutatorMutex c = new MutatorMutex();

    /* renamed from: d  reason: collision with root package name */
    public final k0 f1863d = a1.c.V0(Boolean.FALSE);

    /* loaded from: classes.dex */
    public static final class a implements i {
        public a() {
        }

        @Override // t.i
        public final float a(float f10) {
            return b.this.f1861a.U(Float.valueOf(f10)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super Float, Float> lVar) {
        this.f1861a = lVar;
    }

    @Override // t.j
    public final boolean a() {
        return ((Boolean) this.f1863d.getValue()).booleanValue();
    }

    @Override // t.j
    public final float b(float f10) {
        return this.f1861a.U(Float.valueOf(f10)).floatValue();
    }

    @Override // t.j
    public final Object c(MutatePriority mutatePriority, p pVar, ContinuationImpl continuationImpl) {
        Object H = a1.b.H(new DefaultScrollableState$scroll$2(this, mutatePriority, pVar, null), continuationImpl);
        return H == CoroutineSingletons.COROUTINE_SUSPENDED ? H : n.f16010a;
    }
}
