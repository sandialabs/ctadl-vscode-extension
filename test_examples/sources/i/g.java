package i;

import a3.v0;
import a3.w0;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g {
    public Interpolator c;

    /* renamed from: d  reason: collision with root package name */
    public w0 f11666d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11667e;

    /* renamed from: b  reason: collision with root package name */
    public long f11665b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final a f11668f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<v0> f11664a = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a extends a1.c {
        public boolean V = false;
        public int W = 0;

        public a() {
        }

        @Override // a3.w0
        public final void a() {
            int i10 = this.W + 1;
            this.W = i10;
            g gVar = g.this;
            if (i10 == gVar.f11664a.size()) {
                w0 w0Var = gVar.f11666d;
                if (w0Var != null) {
                    w0Var.a();
                }
                this.W = 0;
                this.V = false;
                gVar.f11667e = false;
            }
        }

        @Override // a1.c, a3.w0
        public final void g() {
            if (this.V) {
                return;
            }
            this.V = true;
            w0 w0Var = g.this.f11666d;
            if (w0Var != null) {
                w0Var.g();
            }
        }
    }

    public final void a() {
        if (this.f11667e) {
            Iterator<v0> it = this.f11664a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f11667e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f11667e) {
            return;
        }
        Iterator<v0> it = this.f11664a.iterator();
        while (it.hasNext()) {
            v0 next = it.next();
            long j2 = this.f11665b;
            if (j2 >= 0) {
                next.c(j2);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = next.f217a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f11666d != null) {
                next.d(this.f11668f);
            }
            View view2 = next.f217a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f11667e = true;
    }
}
