package androidx.appcompat.view.menu;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.noto.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f663a;

    /* renamed from: b  reason: collision with root package name */
    public final f f664b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f665d;

    /* renamed from: e  reason: collision with root package name */
    public final int f666e;

    /* renamed from: f  reason: collision with root package name */
    public View f667f;

    /* renamed from: g  reason: collision with root package name */
    public int f668g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f669h;

    /* renamed from: i  reason: collision with root package name */
    public j.a f670i;

    /* renamed from: j  reason: collision with root package name */
    public j.d f671j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f672k;

    /* renamed from: l  reason: collision with root package name */
    public final a f673l;

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(int i10, int i11, Context context, View view, f fVar, boolean z10) {
        this.f668g = 8388611;
        this.f673l = new a();
        this.f663a = context;
        this.f664b = fVar;
        this.f667f = view;
        this.c = z10;
        this.f665d = i10;
        this.f666e = i11;
    }

    public i(Context context, f fVar, View view, boolean z10) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, fVar, z10);
    }

    public final j.d a() {
        boolean z10;
        j.d lVar;
        if (this.f671j == null) {
            Context context = this.f663a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                lVar = new androidx.appcompat.view.menu.b(this.f663a, this.f667f, this.f665d, this.f666e, this.c);
            } else {
                Context context2 = this.f663a;
                f fVar = this.f664b;
                lVar = new l(this.f665d, this.f666e, context2, this.f667f, fVar, this.c);
            }
            lVar.l(this.f664b);
            lVar.r(this.f673l);
            lVar.n(this.f667f);
            lVar.j(this.f670i);
            lVar.o(this.f669h);
            lVar.p(this.f668g);
            this.f671j = lVar;
        }
        return this.f671j;
    }

    public final boolean b() {
        j.d dVar = this.f671j;
        return dVar != null && dVar.c();
    }

    public void c() {
        this.f671j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f672k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        j.d a10 = a();
        a10.s(z11);
        if (z10) {
            int i12 = this.f668g;
            View view = this.f667f;
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            if ((Gravity.getAbsoluteGravity(i12, j0.e.d(view)) & 7) == 5) {
                i10 -= this.f667f.getWidth();
            }
            a10.q(i10);
            a10.t(i11);
            int i13 = (int) ((this.f663a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f12618i = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.a();
    }
}
