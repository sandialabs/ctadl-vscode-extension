package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import b2.k;
import g0.g0;
import g0.g1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;
import m7.n;
import s.r;
import t.i;
import t.j;
import v7.g;

/* loaded from: classes.dex */
public final class ScrollingLogic {

    /* renamed from: a  reason: collision with root package name */
    public final Orientation f1811a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1812b;
    public final g1<NestedScrollDispatcher> c;

    /* renamed from: d  reason: collision with root package name */
    public final j f1813d;

    /* renamed from: e  reason: collision with root package name */
    public final t.c f1814e;

    /* renamed from: f  reason: collision with root package name */
    public final r f1815f;

    public ScrollingLogic(Orientation orientation, boolean z10, g0 g0Var, j jVar, t.c cVar, r rVar) {
        g.f(orientation, "orientation");
        g.f(g0Var, "nestedScrollDispatcher");
        g.f(jVar, "scrollableState");
        g.f(cVar, "flingBehavior");
        this.f1811a = orientation;
        this.f1812b = z10;
        this.c = g0Var;
        this.f1813d = jVar;
        this.f1814e = cVar;
        this.f1815f = rVar;
    }

    public final long a(i iVar, long j2, u0.c cVar, int i10) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        g.f(iVar, "$this$dispatchScroll");
        r rVar = this.f1815f;
        if (rVar != null && rVar.isEnabled()) {
            j10 = rVar.f(j2, cVar);
        } else {
            j10 = u0.c.f17721b;
        }
        long e10 = u0.c.e(j2, j10);
        NestedScrollDispatcher value = this.c.getValue();
        f1.a aVar = value.c;
        if (aVar != null) {
            j11 = aVar.a(e10, i10);
        } else {
            j11 = u0.c.f17721b;
        }
        long e11 = u0.c.e(e10, j11);
        boolean z10 = this.f1812b;
        if (z10) {
            j12 = u0.c.g(-1.0f, e11);
        } else {
            j12 = e11;
        }
        long e12 = e(iVar.a(d(j12)));
        if (z10) {
            j13 = u0.c.g(-1.0f, e12);
        } else {
            j13 = e12;
        }
        long e13 = u0.c.e(e11, j13);
        f1.a aVar2 = value.c;
        if (aVar2 != null) {
            j14 = e13;
            j15 = aVar2.c(i10, j13, e13);
        } else {
            j14 = e13;
            j15 = u0.c.f17721b;
        }
        if (rVar != null && rVar.isEnabled()) {
            long j16 = j14;
            this.f1815f.a(e11, u0.c.e(j14, j15), cVar, i10);
            return j16;
        }
        return j14;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j2, p7.c<? super k> cVar) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        int i10;
        Ref$LongRef ref$LongRef;
        if (cVar instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) cVar;
            int i11 = scrollingLogic$doFlingAnimation$1.f1818o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.f1818o = i11 - Integer.MIN_VALUE;
                Object obj = scrollingLogic$doFlingAnimation$1.f1817m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = scrollingLogic$doFlingAnimation$1.f1818o;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ref$LongRef = scrollingLogic$doFlingAnimation$1.f1816l;
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                    ref$LongRef2.f13059i = j2;
                    ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, ref$LongRef2, j2, null);
                    scrollingLogic$doFlingAnimation$1.f1816l = ref$LongRef2;
                    scrollingLogic$doFlingAnimation$1.f1818o = 1;
                    if (this.f1813d.c(MutatePriority.Default, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$LongRef = ref$LongRef2;
                }
                return new k(ref$LongRef.f13059i);
            }
        }
        scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, cVar);
        Object obj2 = scrollingLogic$doFlingAnimation$1.f1817m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = scrollingLogic$doFlingAnimation$1.f1818o;
        if (i10 == 0) {
        }
        return new k(ref$LongRef.f13059i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(float f10, p7.c<? super n> cVar) {
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i10;
        Orientation orientation;
        float f11;
        float f12;
        ScrollingLogic scrollingLogic;
        ScrollingLogic scrollingLogic2;
        ScrollingLogic scrollingLogic3;
        long j2;
        ScrollingLogic scrollingLogic4;
        long j10;
        ScrollingLogic scrollingLogic5;
        long j11;
        r rVar;
        float c;
        if (cVar instanceof ScrollingLogic$onDragStopped$1) {
            scrollingLogic$onDragStopped$1 = (ScrollingLogic$onDragStopped$1) cVar;
            int i11 = scrollingLogic$onDragStopped$1.f1835r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$onDragStopped$1.f1835r = i11 - Integer.MIN_VALUE;
                obj = scrollingLogic$onDragStopped$1.f1833p;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = scrollingLogic$onDragStopped$1.f1835r;
                orientation = Orientation.Horizontal;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        m0.b.n1(obj);
                                        return n.f16010a;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                j11 = scrollingLogic$onDragStopped$1.f1832o;
                                scrollingLogic5 = scrollingLogic$onDragStopped$1.f1830l;
                                m0.b.n1(obj);
                                long d5 = k.d(j11, ((k) obj).f6351a);
                                rVar = scrollingLogic5.f1815f;
                                if (rVar == null && rVar.isEnabled()) {
                                    if (scrollingLogic5.f1811a == orientation) {
                                        c = k.b(d5);
                                    } else {
                                        c = k.c(d5);
                                    }
                                    long f13 = scrollingLogic5.f(c);
                                    scrollingLogic$onDragStopped$1.f1830l = null;
                                    scrollingLogic$onDragStopped$1.f1835r = 5;
                                    if (scrollingLogic5.f1815f.d(f13) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    return n.f16010a;
                                }
                                return n.f16010a;
                            }
                            j10 = scrollingLogic$onDragStopped$1.f1832o;
                            ScrollingLogic scrollingLogic6 = scrollingLogic$onDragStopped$1.f1830l;
                            m0.b.n1(obj);
                            scrollingLogic4 = scrollingLogic6;
                            long j12 = ((k) obj).f6351a;
                            long d10 = k.d(j10, j12);
                            scrollingLogic$onDragStopped$1.f1830l = scrollingLogic4;
                            scrollingLogic$onDragStopped$1.f1832o = j12;
                            scrollingLogic$onDragStopped$1.f1835r = 4;
                            obj = scrollingLogic4.c.getValue().a(d10, j12, scrollingLogic$onDragStopped$1);
                            if (obj != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            scrollingLogic5 = scrollingLogic4;
                            j11 = j12;
                            long d52 = k.d(j11, ((k) obj).f6351a);
                            rVar = scrollingLogic5.f1815f;
                            if (rVar == null) {
                            }
                            return n.f16010a;
                        }
                        j2 = scrollingLogic$onDragStopped$1.f1832o;
                        scrollingLogic3 = scrollingLogic$onDragStopped$1.f1830l;
                        m0.b.n1(obj);
                        long d11 = k.d(j2, ((k) obj).f6351a);
                        scrollingLogic$onDragStopped$1.f1830l = scrollingLogic3;
                        scrollingLogic$onDragStopped$1.f1832o = d11;
                        scrollingLogic$onDragStopped$1.f1835r = 3;
                        obj = scrollingLogic3.b(d11, scrollingLogic$onDragStopped$1);
                        if (obj != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        scrollingLogic4 = scrollingLogic3;
                        j10 = d11;
                        long j122 = ((k) obj).f6351a;
                        long d102 = k.d(j10, j122);
                        scrollingLogic$onDragStopped$1.f1830l = scrollingLogic4;
                        scrollingLogic$onDragStopped$1.f1832o = j122;
                        scrollingLogic$onDragStopped$1.f1835r = 4;
                        obj = scrollingLogic4.c.getValue().a(d102, j122, scrollingLogic$onDragStopped$1);
                        if (obj != coroutineSingletons) {
                        }
                    } else {
                        f11 = scrollingLogic$onDragStopped$1.n;
                        scrollingLogic2 = scrollingLogic$onDragStopped$1.f1831m;
                        scrollingLogic = scrollingLogic$onDragStopped$1.f1830l;
                        m0.b.n1(obj);
                    }
                } else {
                    m0.b.n1(obj);
                    r rVar2 = this.f1815f;
                    if (rVar2 != null && rVar2.isEnabled()) {
                        long f14 = f(f10);
                        scrollingLogic$onDragStopped$1.f1830l = this;
                        scrollingLogic$onDragStopped$1.f1831m = this;
                        f11 = f10;
                        scrollingLogic$onDragStopped$1.n = f11;
                        scrollingLogic$onDragStopped$1.f1835r = 1;
                        obj = rVar2.b(f14);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        scrollingLogic2 = this;
                        scrollingLogic = scrollingLogic2;
                    } else {
                        f11 = f10;
                        f12 = 0.0f;
                        scrollingLogic = this;
                        long f15 = scrollingLogic.f(f11 - f12);
                        scrollingLogic$onDragStopped$1.f1830l = scrollingLogic;
                        scrollingLogic$onDragStopped$1.f1831m = null;
                        scrollingLogic$onDragStopped$1.f1832o = f15;
                        scrollingLogic$onDragStopped$1.f1835r = 2;
                        obj = scrollingLogic.c.getValue().b(f15, scrollingLogic$onDragStopped$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        scrollingLogic3 = scrollingLogic;
                        j2 = f15;
                        long d112 = k.d(j2, ((k) obj).f6351a);
                        scrollingLogic$onDragStopped$1.f1830l = scrollingLogic3;
                        scrollingLogic$onDragStopped$1.f1832o = d112;
                        scrollingLogic$onDragStopped$1.f1835r = 3;
                        obj = scrollingLogic3.b(d112, scrollingLogic$onDragStopped$1);
                        if (obj != coroutineSingletons) {
                        }
                    }
                }
                long j13 = ((k) obj).f6351a;
                if (scrollingLogic2.f1811a != orientation) {
                    f12 = k.b(j13);
                } else {
                    f12 = k.c(j13);
                }
                long f152 = scrollingLogic.f(f11 - f12);
                scrollingLogic$onDragStopped$1.f1830l = scrollingLogic;
                scrollingLogic$onDragStopped$1.f1831m = null;
                scrollingLogic$onDragStopped$1.f1832o = f152;
                scrollingLogic$onDragStopped$1.f1835r = 2;
                obj = scrollingLogic.c.getValue().b(f152, scrollingLogic$onDragStopped$1);
                if (obj == coroutineSingletons) {
                }
            }
        }
        scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, cVar);
        obj = scrollingLogic$onDragStopped$1.f1833p;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = scrollingLogic$onDragStopped$1.f1835r;
        orientation = Orientation.Horizontal;
        if (i10 == 0) {
        }
        long j132 = ((k) obj).f6351a;
        if (scrollingLogic2.f1811a != orientation) {
        }
        long f1522 = scrollingLogic.f(f11 - f12);
        scrollingLogic$onDragStopped$1.f1830l = scrollingLogic;
        scrollingLogic$onDragStopped$1.f1831m = null;
        scrollingLogic$onDragStopped$1.f1832o = f1522;
        scrollingLogic$onDragStopped$1.f1835r = 2;
        obj = scrollingLogic.c.getValue().b(f1522, scrollingLogic$onDragStopped$1);
        if (obj == coroutineSingletons) {
        }
    }

    public final float d(long j2) {
        return this.f1811a == Orientation.Horizontal ? u0.c.b(j2) : u0.c.c(j2);
    }

    public final long e(float f10) {
        boolean z10;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = u0.c.f17723e;
            return u0.c.f17721b;
        }
        if (this.f1811a == Orientation.Horizontal) {
            return a1.c.s(f10, 0.0f);
        }
        return a1.c.s(0.0f, f10);
    }

    public final long f(float f10) {
        return this.f1811a == Orientation.Horizontal ? a1.b.h(f10, 0.0f) : a1.b.h(0.0f, f10);
    }
}
