package androidx.compose.material.ripple;

import g0.k0;
import ja.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import r.f;
import u0.c;

/* loaded from: classes.dex */
public final class RippleAnimation {

    /* renamed from: a  reason: collision with root package name */
    public c f2143a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2144b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Float f2145d;

    /* renamed from: e  reason: collision with root package name */
    public Float f2146e;

    /* renamed from: f  reason: collision with root package name */
    public c f2147f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.compose.animation.core.a<Float, f> f2148g = a1.c.h(0.0f);

    /* renamed from: h  reason: collision with root package name */
    public final androidx.compose.animation.core.a<Float, f> f2149h = a1.c.h(0.0f);

    /* renamed from: i  reason: collision with root package name */
    public final androidx.compose.animation.core.a<Float, f> f2150i = a1.c.h(0.0f);

    /* renamed from: j  reason: collision with root package name */
    public final q f2151j = new q(null);

    /* renamed from: k  reason: collision with root package name */
    public final k0 f2152k;

    /* renamed from: l  reason: collision with root package name */
    public final k0 f2153l;

    public RippleAnimation(c cVar, float f10, boolean z10) {
        this.f2143a = cVar;
        this.f2144b = f10;
        this.c = z10;
        Boolean bool = Boolean.FALSE;
        this.f2152k = a1.c.V0(bool);
        this.f2153l = a1.c.V0(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p7.c<? super n> cVar) {
        RippleAnimation$animate$1 rippleAnimation$animate$1;
        Object obj;
        int i10;
        RippleAnimation rippleAnimation;
        Object H;
        if (cVar instanceof RippleAnimation$animate$1) {
            rippleAnimation$animate$1 = (RippleAnimation$animate$1) cVar;
            int i11 = rippleAnimation$animate$1.f2156o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rippleAnimation$animate$1.f2156o = i11 - Integer.MIN_VALUE;
                Object obj2 = rippleAnimation$animate$1.f2155m;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = rippleAnimation$animate$1.f2156o;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                m0.b.n1(obj2);
                                return n.f16010a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rippleAnimation = rippleAnimation$animate$1.f2154l;
                        m0.b.n1(obj2);
                        rippleAnimation$animate$1.f2154l = null;
                        rippleAnimation$animate$1.f2156o = 3;
                        rippleAnimation.getClass();
                        H = a1.b.H(new RippleAnimation$fadeOut$2(rippleAnimation, null), rippleAnimation$animate$1);
                        if (H != obj) {
                            H = n.f16010a;
                        }
                        if (H == obj) {
                            return obj;
                        }
                        return n.f16010a;
                    }
                    rippleAnimation = rippleAnimation$animate$1.f2154l;
                    m0.b.n1(obj2);
                } else {
                    m0.b.n1(obj2);
                    rippleAnimation$animate$1.f2154l = this;
                    rippleAnimation$animate$1.f2156o = 1;
                    Object H2 = a1.b.H(new RippleAnimation$fadeIn$2(this, null), rippleAnimation$animate$1);
                    if (H2 != obj) {
                        H2 = n.f16010a;
                    }
                    if (H2 == obj) {
                        return obj;
                    }
                    rippleAnimation = this;
                }
                rippleAnimation.f2152k.setValue(Boolean.TRUE);
                rippleAnimation$animate$1.f2154l = rippleAnimation;
                rippleAnimation$animate$1.f2156o = 2;
                if (rippleAnimation.f2151j.U(rippleAnimation$animate$1) == obj) {
                    return obj;
                }
                rippleAnimation$animate$1.f2154l = null;
                rippleAnimation$animate$1.f2156o = 3;
                rippleAnimation.getClass();
                H = a1.b.H(new RippleAnimation$fadeOut$2(rippleAnimation, null), rippleAnimation$animate$1);
                if (H != obj) {
                }
                if (H == obj) {
                }
                return n.f16010a;
            }
        }
        rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, cVar);
        Object obj22 = rippleAnimation$animate$1.f2155m;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = rippleAnimation$animate$1.f2156o;
        if (i10 == 0) {
        }
        rippleAnimation.f2152k.setValue(Boolean.TRUE);
        rippleAnimation$animate$1.f2154l = rippleAnimation;
        rippleAnimation$animate$1.f2156o = 2;
        if (rippleAnimation.f2151j.U(rippleAnimation$animate$1) == obj) {
        }
        rippleAnimation$animate$1.f2154l = null;
        rippleAnimation$animate$1.f2156o = 3;
        rippleAnimation.getClass();
        H = a1.b.H(new RippleAnimation$fadeOut$2(rippleAnimation, null), rippleAnimation$animate$1);
        if (H != obj) {
        }
        if (H == obj) {
        }
        return n.f16010a;
    }
}
