package a3;

import a3.b1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.noto.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final e f114a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final q2.b f115a;

        /* renamed from: b  reason: collision with root package name */
        public final q2.b f116b;

        public a(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            Insets upperBound;
            lowerBound = bounds.getLowerBound();
            this.f115a = q2.b.c(lowerBound);
            upperBound = bounds.getUpperBound();
            this.f116b = q2.b.c(upperBound);
        }

        public a(q2.b bVar, q2.b bVar2) {
            this.f115a = bVar;
            this.f116b = bVar2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f115a + " upper=" + this.f116b + "}";
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: i  reason: collision with root package name */
        public WindowInsets f117i;

        /* renamed from: j  reason: collision with root package name */
        public final int f118j;

        public b(int i10) {
            this.f118j = i10;
        }

        public abstract void b(a1 a1Var);

        public abstract void c(a1 a1Var);

        public abstract b1 d(b1 b1Var, List<a1> list);

        public abstract a e(a1 a1Var, a aVar);
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* loaded from: classes.dex */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public final b f119a;

            /* renamed from: b  reason: collision with root package name */
            public b1 f120b;

            /* renamed from: a3.a1$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0001a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ a1 f121a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ b1 f122b;
                public final /* synthetic */ b1 c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ int f123d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ View f124e;

                public C0001a(a1 a1Var, b1 b1Var, b1 b1Var2, int i10, View view) {
                    this.f121a = a1Var;
                    this.f122b = b1Var;
                    this.c = b1Var2;
                    this.f123d = i10;
                    this.f124e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    b1.e bVar;
                    q2.b g10;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    a1 a1Var = this.f121a;
                    a1Var.f114a.d(animatedFraction);
                    float b5 = a1Var.f114a.b();
                    int i10 = Build.VERSION.SDK_INT;
                    b1 b1Var = this.f122b;
                    if (i10 >= 30) {
                        bVar = new b1.d(b1Var);
                    } else if (i10 >= 29) {
                        bVar = new b1.c(b1Var);
                    } else {
                        bVar = new b1.b(b1Var);
                    }
                    for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                        if ((this.f123d & i11) == 0) {
                            g10 = b1Var.a(i11);
                        } else {
                            q2.b a10 = b1Var.a(i11);
                            q2.b a11 = this.c.a(i11);
                            float f10 = 1.0f - b5;
                            g10 = b1.g(a10, (int) (((a10.f16871a - a11.f16871a) * f10) + 0.5d), (int) (((a10.f16872b - a11.f16872b) * f10) + 0.5d), (int) (((a10.c - a11.c) * f10) + 0.5d), (int) (((a10.f16873d - a11.f16873d) * f10) + 0.5d));
                        }
                        bVar.c(i11, g10);
                    }
                    c.g(this.f124e, bVar.b(), Collections.singletonList(a1Var));
                }
            }

            /* loaded from: classes.dex */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ a1 f125a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ View f126b;

                public b(a1 a1Var, View view) {
                    this.f125a = a1Var;
                    this.f126b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    a1 a1Var = this.f125a;
                    a1Var.f114a.d(1.0f);
                    c.e(this.f126b, a1Var);
                }
            }

            /* renamed from: a3.a1$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0002c implements Runnable {

                /* renamed from: i  reason: collision with root package name */
                public final /* synthetic */ View f127i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ a1 f128j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ a f129k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f130l;

                public RunnableC0002c(View view, a1 a1Var, a aVar, ValueAnimator valueAnimator) {
                    this.f127i = view;
                    this.f128j = a1Var;
                    this.f129k = aVar;
                    this.f130l = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.h(this.f127i, this.f128j, this.f129k);
                    this.f130l.start();
                }
            }

            public a(View view, v.j jVar) {
                b1 b1Var;
                b1.e bVar;
                this.f119a = jVar;
                b1 h10 = j0.h(view);
                if (h10 != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        bVar = new b1.d(h10);
                    } else if (i10 >= 29) {
                        bVar = new b1.c(h10);
                    } else {
                        bVar = new b1.b(h10);
                    }
                    b1Var = bVar.b();
                } else {
                    b1Var = null;
                }
                this.f120b = b1Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f120b = b1.i(view, windowInsets);
                } else {
                    b1 i10 = b1.i(view, windowInsets);
                    if (this.f120b == null) {
                        this.f120b = j0.h(view);
                    }
                    if (this.f120b == null) {
                        this.f120b = i10;
                    } else {
                        b j2 = c.j(view);
                        if (j2 != null && Objects.equals(j2.f117i, windowInsets)) {
                            return c.i(view, windowInsets);
                        }
                        b1 b1Var = this.f120b;
                        int i11 = 0;
                        for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                            if (!i10.a(i12).equals(b1Var.a(i12))) {
                                i11 |= i12;
                            }
                        }
                        if (i11 == 0) {
                            return c.i(view, windowInsets);
                        }
                        b1 b1Var2 = this.f120b;
                        a1 a1Var = new a1(i11, new DecelerateInterpolator(), 160L);
                        e eVar = a1Var.f114a;
                        eVar.d(0.0f);
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(eVar.a());
                        q2.b a10 = i10.a(i11);
                        q2.b a11 = b1Var2.a(i11);
                        int min = Math.min(a10.f16871a, a11.f16871a);
                        int i13 = a10.f16872b;
                        int i14 = a11.f16872b;
                        int min2 = Math.min(i13, i14);
                        int i15 = a10.c;
                        int i16 = a11.c;
                        int min3 = Math.min(i15, i16);
                        int i17 = a10.f16873d;
                        int i18 = i11;
                        int i19 = a11.f16873d;
                        a aVar = new a(q2.b.b(min, min2, min3, Math.min(i17, i19)), q2.b.b(Math.max(a10.f16871a, a11.f16871a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i19)));
                        c.f(view, a1Var, windowInsets, false);
                        duration.addUpdateListener(new C0001a(a1Var, i10, b1Var2, i18, view));
                        duration.addListener(new b(a1Var, view));
                        a0.a(view, new RunnableC0002c(view, a1Var, aVar, duration));
                        this.f120b = i10;
                    }
                }
                return c.i(view, windowInsets);
            }
        }

        public c(int i10, DecelerateInterpolator decelerateInterpolator, long j2) {
            super(i10, decelerateInterpolator, j2);
        }

        public static void e(View view, a1 a1Var) {
            b j2 = j(view);
            if (j2 != null) {
                j2.b(a1Var);
                if (j2.f118j == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    e(viewGroup.getChildAt(i10), a1Var);
                }
            }
        }

        public static void f(View view, a1 a1Var, WindowInsets windowInsets, boolean z10) {
            b j2 = j(view);
            if (j2 != null) {
                j2.f117i = windowInsets;
                if (!z10) {
                    j2.c(a1Var);
                    z10 = j2.f118j == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    f(viewGroup.getChildAt(i10), a1Var, windowInsets, z10);
                }
            }
        }

        public static void g(View view, b1 b1Var, List<a1> list) {
            b j2 = j(view);
            if (j2 != null) {
                b1Var = j2.d(b1Var, list);
                if (j2.f118j == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    g(viewGroup.getChildAt(i10), b1Var, list);
                }
            }
        }

        public static void h(View view, a1 a1Var, a aVar) {
            b j2 = j(view);
            if (j2 != null) {
                j2.e(a1Var, aVar);
                if (j2.f118j == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    h(viewGroup.getChildAt(i10), a1Var, aVar);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f119a;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        public final WindowInsetsAnimation f131e;

        /* loaded from: classes.dex */
        public static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final b f132a;

            /* renamed from: b  reason: collision with root package name */
            public List<a1> f133b;
            public ArrayList<a1> c;

            /* renamed from: d  reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, a1> f134d;

            public a(v.j jVar) {
                super(jVar.f118j);
                this.f134d = new HashMap<>();
                this.f132a = jVar;
            }

            public final a1 a(WindowInsetsAnimation windowInsetsAnimation) {
                a1 a1Var = this.f134d.get(windowInsetsAnimation);
                if (a1Var == null) {
                    a1 a1Var2 = new a1(windowInsetsAnimation);
                    this.f134d.put(windowInsetsAnimation, a1Var2);
                    return a1Var2;
                }
                return a1Var;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f132a.b(a(windowInsetsAnimation));
                this.f134d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f132a.c(a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<a1> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<a1> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.f133b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                        a1 a10 = a(windowInsetsAnimation);
                        fraction = windowInsetsAnimation.getFraction();
                        a10.f114a.d(fraction);
                        this.c.add(a10);
                    } else {
                        return this.f132a.d(b1.i(null, windowInsets), this.f133b).h();
                    }
                }
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                a e10 = this.f132a.e(a(windowInsetsAnimation), new a(bounds));
                e10.getClass();
                return d.e(e10);
            }
        }

        public d(int i10, DecelerateInterpolator decelerateInterpolator, long j2) {
            this(new WindowInsetsAnimation(i10, decelerateInterpolator, j2));
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f131e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.f115a.d(), aVar.f116b.d());
        }

        @Override // a3.a1.e
        public final long a() {
            long durationMillis;
            durationMillis = this.f131e.getDurationMillis();
            return durationMillis;
        }

        @Override // a3.a1.e
        public final float b() {
            float interpolatedFraction;
            interpolatedFraction = this.f131e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // a3.a1.e
        public final int c() {
            int typeMask;
            typeMask = this.f131e.getTypeMask();
            return typeMask;
        }

        @Override // a3.a1.e
        public final void d(float f10) {
            this.f131e.setFraction(f10);
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f135a;

        /* renamed from: b  reason: collision with root package name */
        public float f136b;
        public final Interpolator c;

        /* renamed from: d  reason: collision with root package name */
        public final long f137d;

        public e(int i10, DecelerateInterpolator decelerateInterpolator, long j2) {
            this.f135a = i10;
            this.c = decelerateInterpolator;
            this.f137d = j2;
        }

        public long a() {
            return this.f137d;
        }

        public float b() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.f136b) : this.f136b;
        }

        public int c() {
            return this.f135a;
        }

        public void d(float f10) {
            this.f136b = f10;
        }
    }

    public a1(int i10, DecelerateInterpolator decelerateInterpolator, long j2) {
        this.f114a = Build.VERSION.SDK_INT >= 30 ? new d(i10, decelerateInterpolator, j2) : new c(i10, decelerateInterpolator, j2);
    }

    public a1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f114a = new d(windowInsetsAnimation);
        }
    }
}
