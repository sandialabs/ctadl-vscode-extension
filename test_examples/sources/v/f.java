package v;

import androidx.compose.ui.unit.LayoutDirection;
import j1.b0;
import q0.a;
import q0.b;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f18048a = 0;

    /* loaded from: classes.dex */
    public static final class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f18049b = 0;

        static {
            new a();
        }

        @Override // v.f
        public final int a(int i10, LayoutDirection layoutDirection, b0 b0Var) {
            v7.g.f(layoutDirection, "layoutDirection");
            return i10 / 2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f18050b = 0;

        static {
            new b();
        }

        @Override // v.f
        public final int a(int i10, LayoutDirection layoutDirection, b0 b0Var) {
            v7.g.f(layoutDirection, "layoutDirection");
            if (layoutDirection == LayoutDirection.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends f {

        /* renamed from: b  reason: collision with root package name */
        public final a.b f18051b;

        public c(a.b bVar) {
            v7.g.f(bVar, "horizontal");
            this.f18051b = bVar;
        }

        @Override // v.f
        public final int a(int i10, LayoutDirection layoutDirection, b0 b0Var) {
            v7.g.f(layoutDirection, "layoutDirection");
            return this.f18051b.a(i10, layoutDirection);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f18052b = 0;

        static {
            new d();
        }

        @Override // v.f
        public final int a(int i10, LayoutDirection layoutDirection, b0 b0Var) {
            v7.g.f(layoutDirection, "layoutDirection");
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends f {

        /* renamed from: b  reason: collision with root package name */
        public final a.c f18053b;

        public e(b.C0211b c0211b) {
            this.f18053b = c0211b;
        }

        @Override // v.f
        public final int a(int i10, LayoutDirection layoutDirection, b0 b0Var) {
            v7.g.f(layoutDirection, "layoutDirection");
            return this.f18053b.a(i10);
        }
    }

    static {
        int i10 = a.f18049b;
        int i11 = d.f18052b;
        int i12 = b.f18050b;
    }

    public abstract int a(int i10, LayoutDirection layoutDirection, b0 b0Var);
}
