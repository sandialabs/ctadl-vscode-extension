package androidx.compose.foundation.gestures;

import b2.k;
import g0.g0;
import g0.g1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import t.j;

/* loaded from: classes.dex */
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements f1.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f1806i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g1<ScrollingLogic> f1807j;

    public ScrollableKt$scrollableNestedScrollConnection$1(g0 g0Var, boolean z10) {
        this.f1806i = z10;
        this.f1807j = g0Var;
    }

    @Override // f1.a
    public final long a(long j2, int i10) {
        return u0.c.f17721b;
    }

    @Override // f1.a
    public final long c(int i10, long j2, long j10) {
        if (this.f1806i) {
            ScrollingLogic value = this.f1807j.getValue();
            j jVar = value.f1813d;
            if (jVar.a()) {
                return u0.c.f17721b;
            }
            float d5 = value.d(j10);
            boolean z10 = value.f1812b;
            if (z10) {
                d5 *= -1;
            }
            float b5 = jVar.b(d5);
            if (z10) {
                b5 *= -1;
            }
            return value.e(b5);
        }
        return u0.c.f17721b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // f1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j2, long j10, p7.c<? super k> cVar) {
        ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1;
        int i10;
        long j11;
        if (cVar instanceof ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) {
            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = (ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) cVar;
            int i11 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f1810o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f1810o = i11 - Integer.MIN_VALUE;
                Object obj = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f1809m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f1810o;
                if (i10 == 0) {
                    if (i10 == 1) {
                        j10 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f1808l;
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    if (this.f1806i) {
                        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f1808l = j10;
                        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f1810o = 1;
                        obj = this.f1807j.getValue().b(j10, scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        int i12 = k.c;
                        j11 = k.f6350b;
                        return new k(j11);
                    }
                }
                j11 = k.d(j10, ((k) obj).f6351a);
                return new k(j11);
            }
        }
        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, cVar);
        Object obj2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f1809m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.f1810o;
        if (i10 == 0) {
        }
        j11 = k.d(j10, ((k) obj2).f6351a);
        return new k(j11);
    }

    @Override // f1.a
    public final Object e(long j2, p7.c cVar) {
        return new k(k.f6350b);
    }
}
