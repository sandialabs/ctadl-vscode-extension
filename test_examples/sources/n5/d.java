package n5;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<C0192d> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f16099b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final C0192d f16100a = new C0192d();

        @Override // android.animation.TypeEvaluator
        public final C0192d evaluate(float f10, C0192d c0192d, C0192d c0192d2) {
            C0192d c0192d3 = c0192d;
            C0192d c0192d4 = c0192d2;
            float f11 = c0192d3.f16103a;
            float f12 = 1.0f - f10;
            float f13 = (c0192d4.f16103a * f10) + (f11 * f12);
            float f14 = c0192d3.f16104b;
            float f15 = c0192d4.f16104b * f10;
            float f16 = c0192d3.c;
            float f17 = f10 * c0192d4.c;
            C0192d c0192d5 = this.f16100a;
            c0192d5.f16103a = f13;
            c0192d5.f16104b = f15 + (f14 * f12);
            c0192d5.c = f17 + (f12 * f16);
            return c0192d5;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<d, C0192d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16101a = new b();

        public b() {
            super(C0192d.class, "circularReveal");
        }

        @Override // android.util.Property
        public final C0192d get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(d dVar, C0192d c0192d) {
            dVar.setRevealInfo(c0192d);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f16102a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: n5.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0192d {

        /* renamed from: a  reason: collision with root package name */
        public float f16103a;

        /* renamed from: b  reason: collision with root package name */
        public float f16104b;
        public float c;

        public C0192d() {
        }

        public C0192d(float f10, float f11, float f12) {
            this.f16103a = f10;
            this.f16104b = f11;
            this.c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0192d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(C0192d c0192d);
}
