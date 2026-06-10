package x2;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import v7.g;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup$OnHierarchyChangeListenerC0238a f18572b;

    /* renamed from: x2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ViewGroup$OnHierarchyChangeListenerC0238a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f18574b;

        public ViewGroup$OnHierarchyChangeListenerC0238a(Activity activity) {
            this.f18574b = activity;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view2 instanceof SplashScreenView) {
                a.this.getClass();
                a.c((SplashScreenView) view2);
                ((ViewGroup) this.f18574b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity activity) {
        super(activity);
        g.f(activity, "activity");
        this.f18572b = new ViewGroup$OnHierarchyChangeListenerC0238a(activity);
    }

    public static void c(SplashScreenView splashScreenView) {
        View rootView;
        g.f(splashScreenView, "child");
        WindowInsets build = new WindowInsets.Builder().build();
        g.e(build, "Builder().build()");
        Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        rootView = splashScreenView.getRootView();
        if (build == rootView.computeSystemWindowInsets(build, rect)) {
            rect.isEmpty();
        }
    }

    @Override // x2.b
    public final void a() {
        Activity activity = this.f18575a;
        Resources.Theme theme = activity.getTheme();
        g.e(theme, "activity.theme");
        b(theme, new TypedValue());
        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f18572b);
    }
}
