package v;

import a3.a1;
import a3.b1;
import a3.x;
import android.os.Build;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends a1.b implements Runnable, x, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    public final androidx.compose.foundation.layout.c f18060k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18061l;

    /* renamed from: m  reason: collision with root package name */
    public b1 f18062m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.compose.foundation.layout.c cVar) {
        super(!cVar.f2024p ? 1 : 0);
        v7.g.f(cVar, "composeInsets");
        this.f18060k = cVar;
    }

    @Override // a3.x
    public final b1 a(View view, b1 b1Var) {
        v7.g.f(view, "view");
        if (this.f18061l) {
            this.f18062m = b1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
            return b1Var;
        }
        androidx.compose.foundation.layout.c cVar = this.f18060k;
        cVar.a(b1Var, 0);
        if (cVar.f2024p) {
            b1 b1Var2 = b1.f139b;
            v7.g.e(b1Var2, "CONSUMED");
            return b1Var2;
        }
        return b1Var;
    }

    @Override // a3.a1.b
    public final void b(a1 a1Var) {
        v7.g.f(a1Var, "animation");
        this.f18061l = false;
        b1 b1Var = this.f18062m;
        a1.e eVar = a1Var.f114a;
        if (eVar.a() != 0 && b1Var != null) {
            this.f18060k.a(b1Var, eVar.c());
        }
        this.f18062m = null;
    }

    @Override // a3.a1.b
    public final void c(a1 a1Var) {
        this.f18061l = true;
    }

    @Override // a3.a1.b
    public final b1 d(b1 b1Var, List<a1> list) {
        v7.g.f(b1Var, "insets");
        v7.g.f(list, "runningAnimations");
        androidx.compose.foundation.layout.c cVar = this.f18060k;
        cVar.a(b1Var, 0);
        if (cVar.f2024p) {
            b1 b1Var2 = b1.f139b;
            v7.g.e(b1Var2, "CONSUMED");
            return b1Var2;
        }
        return b1Var;
    }

    @Override // a3.a1.b
    public final a1.a e(a1 a1Var, a1.a aVar) {
        v7.g.f(a1Var, "animation");
        v7.g.f(aVar, "bounds");
        this.f18061l = false;
        return aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        v7.g.f(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        v7.g.f(view, "v");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18061l) {
            this.f18061l = false;
            b1 b1Var = this.f18062m;
            if (b1Var != null) {
                this.f18060k.a(b1Var, 0);
                this.f18062m = null;
            }
        }
    }
}
