package androidx.compose.ui.input.nestedscroll;

import a1.c;
import androidx.activity.e;
import androidx.datastore.preferences.PreferencesProto$Value;
import b2.k;
import f1.a;
import g0.k0;
import ja.x;
import k1.d;
import k1.f;
import k1.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;
import m0.b;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class NestedScrollModifierLocal implements d, f<NestedScrollModifierLocal>, a {

    /* renamed from: i  reason: collision with root package name */
    public final NestedScrollDispatcher f3260i;

    /* renamed from: j  reason: collision with root package name */
    public final a f3261j;

    /* renamed from: k  reason: collision with root package name */
    public final k0 f3262k;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lja/x;", "invoke", "()Lja/x;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<x> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // u7.a
        public final x k0() {
            return NestedScrollModifierLocal.this.g();
        }
    }

    public NestedScrollModifierLocal(a aVar, NestedScrollDispatcher nestedScrollDispatcher) {
        g.f(aVar, "connection");
        this.f3260i = nestedScrollDispatcher;
        this.f3261j = aVar;
        nestedScrollDispatcher.f3251a = new AnonymousClass1();
        this.f3262k = c.V0(null);
    }

    @Override // k1.d
    public final void T(k1.g gVar) {
        g.f(gVar, "scope");
        this.f3262k.setValue((NestedScrollModifierLocal) gVar.i(NestedScrollModifierLocalKt.f3273a));
        this.f3260i.c = h();
    }

    @Override // q0.d
    public final /* synthetic */ q0.d Z(q0.d dVar) {
        return e.b(this, dVar);
    }

    @Override // f1.a
    public final long a(long j2, int i10) {
        long j10;
        NestedScrollModifierLocal h10 = h();
        if (h10 != null) {
            j10 = h10.a(j2, i10);
        } else {
            int i11 = u0.c.f17723e;
            j10 = u0.c.f17721b;
        }
        return u0.c.f(j10, this.f3261j.a(u0.c.e(j2, j10), i10));
    }

    @Override // f1.a
    public final long c(int i10, long j2, long j10) {
        long j11;
        long c = this.f3261j.c(i10, j2, j10);
        NestedScrollModifierLocal h10 = h();
        if (h10 != null) {
            j11 = h10.c(i10, u0.c.f(j2, c), u0.c.e(j10, c));
        } else {
            int i11 = u0.c.f17723e;
            j11 = u0.c.f17721b;
        }
        return u0.c.f(c, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    @Override // f1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j2, long j10, p7.c<? super k> cVar) {
        NestedScrollModifierLocal$onPostFling$1 nestedScrollModifierLocal$onPostFling$1;
        int i10;
        long j11;
        long j12;
        NestedScrollModifierLocal nestedScrollModifierLocal;
        NestedScrollModifierLocal h10;
        long j13;
        long j14;
        long j15;
        if (cVar instanceof NestedScrollModifierLocal$onPostFling$1) {
            nestedScrollModifierLocal$onPostFling$1 = (NestedScrollModifierLocal$onPostFling$1) cVar;
            int i11 = nestedScrollModifierLocal$onPostFling$1.f3268q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPostFling$1.f3268q = i11 - Integer.MIN_VALUE;
                Object obj = nestedScrollModifierLocal$onPostFling$1.f3266o;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = nestedScrollModifierLocal$onPostFling$1.f3268q;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            j15 = nestedScrollModifierLocal$onPostFling$1.f3265m;
                            b.n1(obj);
                            j13 = ((k) obj).f6351a;
                            j14 = j15;
                            return new k(k.e(j14, j13));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j16 = nestedScrollModifierLocal$onPostFling$1.n;
                    long j17 = nestedScrollModifierLocal$onPostFling$1.f3265m;
                    nestedScrollModifierLocal = nestedScrollModifierLocal$onPostFling$1.f3264l;
                    b.n1(obj);
                    j12 = j16;
                    j11 = j17;
                } else {
                    b.n1(obj);
                    a aVar = this.f3261j;
                    nestedScrollModifierLocal$onPostFling$1.f3264l = this;
                    j11 = j2;
                    nestedScrollModifierLocal$onPostFling$1.f3265m = j11;
                    j12 = j10;
                    nestedScrollModifierLocal$onPostFling$1.n = j12;
                    nestedScrollModifierLocal$onPostFling$1.f3268q = 1;
                    obj = aVar.d(j2, j10, nestedScrollModifierLocal$onPostFling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    nestedScrollModifierLocal = this;
                }
                long j18 = ((k) obj).f6351a;
                h10 = nestedScrollModifierLocal.h();
                if (h10 == null) {
                    long e10 = k.e(j11, j18);
                    long d5 = k.d(j12, j18);
                    nestedScrollModifierLocal$onPostFling$1.f3264l = null;
                    nestedScrollModifierLocal$onPostFling$1.f3265m = j18;
                    nestedScrollModifierLocal$onPostFling$1.f3268q = 2;
                    obj = h10.d(e10, d5, nestedScrollModifierLocal$onPostFling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j15 = j18;
                    j13 = ((k) obj).f6351a;
                    j14 = j15;
                    return new k(k.e(j14, j13));
                }
                j13 = k.f6350b;
                j14 = j18;
                return new k(k.e(j14, j13));
            }
        }
        nestedScrollModifierLocal$onPostFling$1 = new NestedScrollModifierLocal$onPostFling$1(this, cVar);
        Object obj2 = nestedScrollModifierLocal$onPostFling$1.f3266o;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = nestedScrollModifierLocal$onPostFling$1.f3268q;
        if (i10 == 0) {
        }
        long j182 = ((k) obj2).f6351a;
        h10 = nestedScrollModifierLocal.h();
        if (h10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    @Override // f1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j2, p7.c<? super k> cVar) {
        NestedScrollModifierLocal$onPreFling$1 nestedScrollModifierLocal$onPreFling$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i10;
        long j10;
        NestedScrollModifierLocal nestedScrollModifierLocal;
        long j11;
        if (cVar instanceof NestedScrollModifierLocal$onPreFling$1) {
            nestedScrollModifierLocal$onPreFling$1 = (NestedScrollModifierLocal$onPreFling$1) cVar;
            int i11 = nestedScrollModifierLocal$onPreFling$1.f3272p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPreFling$1.f3272p = i11 - Integer.MIN_VALUE;
                obj = nestedScrollModifierLocal$onPreFling$1.n;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = nestedScrollModifierLocal$onPreFling$1.f3272p;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            j11 = nestedScrollModifierLocal$onPreFling$1.f3270m;
                            b.n1(obj);
                            return new k(k.e(j11, ((k) obj).f6351a));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = nestedScrollModifierLocal$onPreFling$1.f3270m;
                    nestedScrollModifierLocal = nestedScrollModifierLocal$onPreFling$1.f3269l;
                    b.n1(obj);
                } else {
                    b.n1(obj);
                    NestedScrollModifierLocal h10 = h();
                    if (h10 != null) {
                        nestedScrollModifierLocal$onPreFling$1.f3269l = this;
                        nestedScrollModifierLocal$onPreFling$1.f3270m = j2;
                        nestedScrollModifierLocal$onPreFling$1.f3272p = 1;
                        obj = h10.e(j2, nestedScrollModifierLocal$onPreFling$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        nestedScrollModifierLocal = this;
                    } else {
                        j10 = k.f6350b;
                        nestedScrollModifierLocal = this;
                        a aVar = nestedScrollModifierLocal.f3261j;
                        long d5 = k.d(j2, j10);
                        nestedScrollModifierLocal$onPreFling$1.f3269l = null;
                        nestedScrollModifierLocal$onPreFling$1.f3270m = j10;
                        nestedScrollModifierLocal$onPreFling$1.f3272p = 2;
                        obj = aVar.e(d5, nestedScrollModifierLocal$onPreFling$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        j11 = j10;
                        return new k(k.e(j11, ((k) obj).f6351a));
                    }
                }
                j10 = ((k) obj).f6351a;
                a aVar2 = nestedScrollModifierLocal.f3261j;
                long d52 = k.d(j2, j10);
                nestedScrollModifierLocal$onPreFling$1.f3269l = null;
                nestedScrollModifierLocal$onPreFling$1.f3270m = j10;
                nestedScrollModifierLocal$onPreFling$1.f3272p = 2;
                obj = aVar2.e(d52, nestedScrollModifierLocal$onPreFling$1);
                if (obj == coroutineSingletons) {
                }
            }
        }
        nestedScrollModifierLocal$onPreFling$1 = new NestedScrollModifierLocal$onPreFling$1(this, cVar);
        obj = nestedScrollModifierLocal$onPreFling$1.n;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = nestedScrollModifierLocal$onPreFling$1.f3272p;
        if (i10 == 0) {
        }
        j10 = ((k) obj).f6351a;
        a aVar22 = nestedScrollModifierLocal.f3261j;
        long d522 = k.d(j2, j10);
        nestedScrollModifierLocal$onPreFling$1.f3269l = null;
        nestedScrollModifierLocal$onPreFling$1.f3270m = j10;
        nestedScrollModifierLocal$onPreFling$1.f3272p = 2;
        obj = aVar22.e(d522, nestedScrollModifierLocal$onPreFling$1);
        if (obj == coroutineSingletons) {
        }
    }

    public final x g() {
        x xVar;
        NestedScrollModifierLocal h10 = h();
        if ((h10 != null && (xVar = h10.g()) != null) || (xVar = this.f3260i.f3252b) != null) {
            return xVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // k1.f
    public final h<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.f3273a;
    }

    @Override // k1.f
    public final NestedScrollModifierLocal getValue() {
        return this;
    }

    public final NestedScrollModifierLocal h() {
        return (NestedScrollModifierLocal) this.f3262k.getValue();
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }
}
