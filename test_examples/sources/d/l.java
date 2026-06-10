package d;

import a3.b1;
import a3.j0;
import a3.v0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.n1;
import com.noto.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l implements a3.x {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ k f10311i;

    public l(k kVar) {
        this.f10311i = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    @Override // a3.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b1 a(View view, b1 b1Var) {
        boolean z10;
        b1 b1Var2;
        b1.e bVar;
        boolean z11;
        boolean z12;
        int d5;
        int e10;
        Context context;
        View view2;
        View view3;
        View view4;
        boolean z13;
        int i10;
        int f10 = b1Var.f();
        k kVar = this.f10311i;
        kVar.getClass();
        int f11 = b1Var.f();
        ActionBarContextView actionBarContextView = kVar.D;
        int i11 = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kVar.D.getLayoutParams();
            if (kVar.D.isShown()) {
                if (kVar.f10268l0 == null) {
                    kVar.f10268l0 = new Rect();
                    kVar.f10269m0 = new Rect();
                }
                Rect rect = kVar.f10268l0;
                Rect rect2 = kVar.f10269m0;
                rect.set(b1Var.d(), b1Var.f(), b1Var.e(), b1Var.c());
                ViewGroup viewGroup = kVar.J;
                Method method = n1.f1056a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e11) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e11);
                    }
                }
                int i12 = rect.top;
                int i13 = rect.left;
                int i14 = rect.right;
                b1 h10 = j0.h(kVar.J);
                if (h10 == null) {
                    d5 = 0;
                } else {
                    d5 = h10.d();
                }
                if (h10 == null) {
                    e10 = 0;
                } else {
                    e10 = h10.e();
                }
                if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                    z12 = false;
                    context = kVar.f10274s;
                    if (i12 <= 0 && kVar.L == null) {
                        View view5 = new View(context);
                        kVar.L = view5;
                        view5.setVisibility(8);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                        layoutParams.leftMargin = d5;
                        layoutParams.rightMargin = e10;
                        kVar.J.addView(kVar.L, -1, layoutParams);
                    } else {
                        view2 = kVar.L;
                        if (view2 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                            int i15 = marginLayoutParams2.height;
                            int i16 = marginLayoutParams.topMargin;
                            if (i15 != i16 || marginLayoutParams2.leftMargin != d5 || marginLayoutParams2.rightMargin != e10) {
                                marginLayoutParams2.height = i16;
                                marginLayoutParams2.leftMargin = d5;
                                marginLayoutParams2.rightMargin = e10;
                                kVar.L.setLayoutParams(marginLayoutParams2);
                            }
                        }
                    }
                    view3 = kVar.L;
                    if (view3 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && view3.getVisibility() != 0) {
                        view4 = kVar.L;
                        if ((j0.d.g(view4) & 8192) == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            i10 = R.color.abc_decor_view_status_guard_light;
                        } else {
                            i10 = R.color.abc_decor_view_status_guard;
                        }
                        view4.setBackgroundColor(n2.a.b(context, i10));
                    }
                    if (!kVar.Q && z10) {
                        f11 = 0;
                    }
                }
                marginLayoutParams.topMargin = i12;
                marginLayoutParams.leftMargin = i13;
                marginLayoutParams.rightMargin = i14;
                z12 = true;
                context = kVar.f10274s;
                if (i12 <= 0) {
                }
                view2 = kVar.L;
                if (view2 != null) {
                }
                view3 = kVar.L;
                if (view3 == null) {
                }
                if (z10) {
                    view4 = kVar.L;
                    if ((j0.d.g(view4) & 8192) == 0) {
                    }
                    if (!z13) {
                    }
                    view4.setBackgroundColor(n2.a.b(context, i10));
                }
                if (!kVar.Q) {
                    f11 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11;
                z10 = false;
            }
            if (z12) {
                kVar.D.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = kVar.L;
        if (view6 != null) {
            if (!z10) {
                i11 = 8;
            }
            view6.setVisibility(i11);
        }
        if (f10 != f11) {
            int d10 = b1Var.d();
            int e12 = b1Var.e();
            int c = b1Var.c();
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 30) {
                bVar = new b1.d(b1Var);
            } else if (i17 >= 29) {
                bVar = new b1.c(b1Var);
            } else {
                bVar = new b1.b(b1Var);
            }
            bVar.g(q2.b.b(d10, f11, e12, c));
            b1Var2 = bVar.b();
        } else {
            b1Var2 = b1Var;
        }
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        WindowInsets h11 = b1Var2.h();
        if (h11 != null) {
            WindowInsets b5 = j0.h.b(view, h11);
            if (!b5.equals(h11)) {
                return b1.i(view, b5);
            }
            return b1Var2;
        }
        return b1Var2;
    }
}
