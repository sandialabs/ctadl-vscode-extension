package h4;

import a3.j0;
import a3.v0;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final v f11432a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f11433b;

    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(t.f11432a.Z1(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            float floatValue = f10.floatValue();
            t.f11432a.a2(view, floatValue);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            return j0.f.a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, v0> weakHashMap = j0.f188a;
            j0.f.c(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f11432a = i10 >= 29 ? new y() : i10 >= 23 ? new x() : i10 >= 22 ? new w() : new v();
        f11433b = new a();
        new b();
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f11432a.u1(view, i10, i11, i12, i13);
    }
}
