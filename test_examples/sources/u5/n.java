package u5;

import a3.b1;
import a3.j0;
import a3.v0;
import a3.x;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public class a implements x {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ b f17828i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ c f17829j;

        public a(b bVar, c cVar) {
            this.f17828i = bVar;
            this.f17829j = cVar;
        }

        @Override // a3.x
        public final b1 a(View view, b1 b1Var) {
            return this.f17828i.a(view, b1Var, new c(this.f17829j));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        b1 a(View view, b1 b1Var, c cVar);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f17830a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17831b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f17832d;

        public c(int i10, int i11, int i12, int i13) {
            this.f17830a = i10;
            this.f17831b = i11;
            this.c = i12;
            this.f17832d = i13;
        }

        public c(c cVar) {
            this.f17830a = cVar.f17830a;
            this.f17831b = cVar.f17831b;
            this.c = cVar.c;
            this.f17832d = cVar.f17832d;
        }
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.i.u(view, new a(bVar, new c(j0.e.f(view), view.getPaddingTop(), j0.e.e(view), view.getPaddingBottom())));
        if (j0.g.b(view)) {
            j0.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new o());
        }
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup c(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static j0.c d(View view) {
        ViewGroup c10 = c(view);
        if (c10 == null) {
            return null;
        }
        return new j0.c(c10);
    }

    public static boolean e(View view) {
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        if (j0.e.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case ma.i.f16049q /* 15 */:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
