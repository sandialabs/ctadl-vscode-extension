package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.a0;

/* loaded from: classes.dex */
public final class z extends m0 {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ a0.g f1167r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ a0 f1168s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, View view, a0.g gVar) {
        super(view);
        this.f1168s = a0Var;
        this.f1167r = gVar;
    }

    @Override // androidx.appcompat.widget.m0
    public final j.f b() {
        return this.f1167r;
    }

    @Override // androidx.appcompat.widget.m0
    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        a0 a0Var = this.f1168s;
        if (!a0Var.getInternalPopup().c()) {
            a0Var.n.m(a0.c.b(a0Var), a0.c.a(a0Var));
            return true;
        }
        return true;
    }
}
