package w5;

import android.animation.ObjectAnimator;
import android.util.Property;
import w5.b;

/* loaded from: classes.dex */
public final class g extends j.b {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f18393l = {0, 1350, 2700, 4050};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f18394m = {667, 2017, 3367, 4717};
    public static final int[] n = {1000, 2350, 3700, 5050};

    /* renamed from: o  reason: collision with root package name */
    public static final a f18395o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f18396p = new b();

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f18397d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f18398e;

    /* renamed from: g  reason: collision with root package name */
    public final h f18400g;

    /* renamed from: i  reason: collision with root package name */
    public float f18402i;

    /* renamed from: j  reason: collision with root package name */
    public float f18403j;

    /* renamed from: h  reason: collision with root package name */
    public int f18401h = 0;

    /* renamed from: k  reason: collision with root package name */
    public i4.c f18404k = null;

    /* renamed from: f  reason: collision with root package name */
    public final s3.b f18399f = new s3.b();

    /* loaded from: classes.dex */
    public class a extends Property<g, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(g gVar) {
            return Float.valueOf(gVar.f18402i);
        }

        @Override // android.util.Property
        public final void set(g gVar, Float f10) {
            s3.b bVar;
            g gVar2 = gVar;
            float floatValue = f10.floatValue();
            gVar2.f18402i = floatValue;
            int i10 = (int) (5400.0f * floatValue);
            float[] fArr = (float[]) gVar2.f12608b;
            float f11 = floatValue * 1520.0f;
            fArr[0] = (-20.0f) + f11;
            fArr[1] = f11;
            int i11 = 0;
            while (true) {
                bVar = gVar2.f18399f;
                if (i11 >= 4) {
                    break;
                }
                float f12 = 667;
                float[] fArr2 = (float[]) gVar2.f12608b;
                fArr2[1] = (bVar.getInterpolation((i10 - g.f18393l[i11]) / f12) * 250.0f) + fArr2[1];
                float f13 = (i10 - g.f18394m[i11]) / f12;
                float[] fArr3 = (float[]) gVar2.f12608b;
                fArr3[0] = (bVar.getInterpolation(f13) * 250.0f) + fArr3[0];
                i11++;
            }
            float[] fArr4 = (float[]) gVar2.f12608b;
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = ((f15 - f14) * gVar2.f18403j) + f14;
            fArr4[0] = f16;
            fArr4[0] = f16 / 360.0f;
            fArr4[1] = f15 / 360.0f;
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    break;
                }
                float f17 = (i10 - g.n[i12]) / 333;
                if (f17 >= 0.0f && f17 <= 1.0f) {
                    int i13 = i12 + gVar2.f18401h;
                    h hVar = gVar2.f18400g;
                    int[] iArr = hVar.c;
                    int length = i13 % iArr.length;
                    ((int[]) gVar2.c)[0] = e5.b.a(bVar.getInterpolation(f17), Integer.valueOf(a1.b.C(iArr[length], ((n) gVar2.f12607a).f18425r)), Integer.valueOf(a1.b.C(hVar.c[(length + 1) % iArr.length], ((n) gVar2.f12607a).f18425r))).intValue();
                    break;
                }
                i12++;
            }
            ((n) gVar2.f12607a).invalidateSelf();
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<g, Float> {
        public b() {
            super(Float.class, "completeEndFraction");
        }

        @Override // android.util.Property
        public final Float get(g gVar) {
            return Float.valueOf(gVar.f18403j);
        }

        @Override // android.util.Property
        public final void set(g gVar, Float f10) {
            gVar.f18403j = f10.floatValue();
        }
    }

    public g(h hVar) {
        this.f18400g = hVar;
    }

    @Override // j.b
    public final void c() {
        ObjectAnimator objectAnimator = this.f18397d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // j.b
    public final void f() {
        k();
    }

    @Override // j.b
    public final void g(b.c cVar) {
        this.f18404k = cVar;
    }

    @Override // j.b
    public final void h() {
        ObjectAnimator objectAnimator = this.f18398e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((n) this.f12607a).isVisible()) {
                this.f18398e.start();
            } else {
                c();
            }
        }
    }

    @Override // j.b
    public final void i() {
        if (this.f18397d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f18395o, 0.0f, 1.0f);
            this.f18397d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f18397d.setInterpolator(null);
            this.f18397d.setRepeatCount(-1);
            this.f18397d.addListener(new e(this));
        }
        if (this.f18398e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f18396p, 0.0f, 1.0f);
            this.f18398e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f18398e.setInterpolator(this.f18399f);
            this.f18398e.addListener(new f(this));
        }
        k();
        this.f18397d.start();
    }

    @Override // j.b
    public final void j() {
        this.f18404k = null;
    }

    public final void k() {
        this.f18401h = 0;
        ((int[]) this.c)[0] = a1.b.C(this.f18400g.c[0], ((n) this.f12607a).f18425r);
        this.f18403j = 0.0f;
    }
}
