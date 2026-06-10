package h4;

import a3.j0;
import a3.v0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b extends j {
    public static final String[] F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final C0124b G;
    public static final c H;
    public static final d I;
    public static final e J;
    public static final f K;

    /* loaded from: classes.dex */
    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f11369a;

        public a() {
            super(PointF.class, "boundsOrigin");
            this.f11369a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.f11369a;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f11369a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* renamed from: h4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0124b extends Property<i, PointF> {
        public C0124b() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            i iVar2 = iVar;
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f11372a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f11373b = round;
            int i10 = iVar2.f11376f + 1;
            iVar2.f11376f = i10;
            if (i10 == iVar2.f11377g) {
                t.a(iVar2.f11375e, iVar2.f11372a, round, iVar2.c, iVar2.f11374d);
                iVar2.f11376f = 0;
                iVar2.f11377g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<i, PointF> {
        public c() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            i iVar2 = iVar;
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f11374d = round;
            int i10 = iVar2.f11377g + 1;
            iVar2.f11377g = i10;
            if (iVar2.f11376f == i10) {
                t.a(iVar2.f11375e, iVar2.f11372a, iVar2.f11373b, iVar2.c, round);
                iVar2.f11376f = 0;
                iVar2.f11377g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            View view2 = view;
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            t.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            View view2 = view;
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            t.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            View view2 = view;
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            t.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* loaded from: classes.dex */
    public class h extends m {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11370a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f11371b;

        public h(ViewGroup viewGroup) {
            this.f11371b = viewGroup;
        }

        @Override // h4.m, h4.j.d
        public final void b() {
            s.a(this.f11371b, false);
        }

        @Override // h4.m, h4.j.d
        public final void c() {
            s.a(this.f11371b, true);
        }

        @Override // h4.m, h4.j.d
        public final void d() {
            s.a(this.f11371b, false);
            this.f11370a = true;
        }

        @Override // h4.j.d
        public final void e(j jVar) {
            if (!this.f11370a) {
                s.a(this.f11371b, false);
            }
            jVar.x(this);
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f11372a;

        /* renamed from: b  reason: collision with root package name */
        public int f11373b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f11374d;

        /* renamed from: e  reason: collision with root package name */
        public final View f11375e;

        /* renamed from: f  reason: collision with root package name */
        public int f11376f;

        /* renamed from: g  reason: collision with root package name */
        public int f11377g;

        public i(View view) {
            this.f11375e = view;
        }
    }

    static {
        new a();
        G = new C0124b();
        H = new c();
        I = new d();
        J = new e();
        K = new f();
    }

    public final void J(q qVar) {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        View view = qVar.f11427b;
        if (j0.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = qVar.f11426a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    @Override // h4.j
    public final void e(q qVar) {
        J(qVar);
    }

    @Override // h4.j
    public final void i(q qVar) {
        J(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    @Override // h4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator m(ViewGroup viewGroup, q qVar, q qVar2) {
        int i10;
        b bVar;
        Path x02;
        Property property;
        ObjectAnimator objectAnimator;
        if (qVar != null && qVar2 != null) {
            HashMap hashMap = qVar.f11426a;
            HashMap hashMap2 = qVar2.f11426a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i11 = rect.left;
                int i12 = rect2.left;
                int i13 = rect.top;
                int i14 = rect2.top;
                int i15 = rect.right;
                int i16 = rect2.right;
                int i17 = rect.bottom;
                int i18 = rect2.bottom;
                int i19 = i15 - i11;
                int i20 = i17 - i13;
                int i21 = i16 - i12;
                int i22 = i18 - i14;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i19 != 0 && i20 != 0) || (i21 != 0 && i22 != 0)) {
                    if (i11 == i12 && i13 == i14) {
                        i10 = 0;
                        if (i15 == i16 || i17 != i18) {
                            i10++;
                        }
                    }
                    i10 = 1;
                    if (i15 == i16) {
                    }
                    i10++;
                } else {
                    i10 = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i10++;
                }
                int i23 = i10;
                if (i23 > 0) {
                    View view = qVar2.f11427b;
                    t.a(view, i11, i13, i15, i17);
                    if (i23 == 2) {
                        if (i19 == i21 && i20 == i22) {
                            bVar = this;
                            x02 = bVar.B.x0(i11, i13, i12, i14);
                            property = K;
                        } else {
                            bVar = this;
                            i iVar = new i(view);
                            ObjectAnimator ofObject = ObjectAnimator.ofObject(iVar, G, (TypeConverter) null, bVar.B.x0(i11, i13, i12, i14));
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(iVar, H, (TypeConverter) null, bVar.B.x0(i15, i17, i16, i18));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject, ofObject2);
                            animatorSet.addListener(new g(iVar));
                            objectAnimator = animatorSet;
                            if (view.getParent() instanceof ViewGroup) {
                                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                                s.a(viewGroup4, true);
                                bVar.a(new h(viewGroup4));
                            }
                            return objectAnimator;
                        }
                    } else {
                        bVar = this;
                        if (i11 == i12 && i13 == i14) {
                            x02 = bVar.B.x0(i15, i17, i16, i18);
                            property = I;
                        }
                        x02 = bVar.B.x0(i11, i13, i12, i14);
                        property = J;
                    }
                    objectAnimator = ObjectAnimator.ofObject(view, property, (TypeConverter) null, x02);
                    if (view.getParent() instanceof ViewGroup) {
                    }
                    return objectAnimator;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // h4.j
    public final String[] r() {
        return F;
    }
}
