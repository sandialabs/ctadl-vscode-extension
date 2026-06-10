package h4;

import android.view.View;
import android.view.ViewGroup;
import com.noto.R;

/* loaded from: classes.dex */
public final class z extends m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f11434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f11435b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a0 f11436d;

    public z(a0 a0Var, ViewGroup viewGroup, View view, View view2) {
        this.f11436d = a0Var;
        this.f11434a = viewGroup;
        this.f11435b = view;
        this.c = view2;
    }

    @Override // h4.m, h4.j.d
    public final void b() {
        this.f11434a.getOverlay().remove(this.f11435b);
    }

    @Override // h4.m, h4.j.d
    public final void c() {
        View view = this.f11435b;
        if (view.getParent() == null) {
            this.f11434a.getOverlay().add(view);
        } else {
            this.f11436d.d();
        }
    }

    @Override // h4.j.d
    public final void e(j jVar) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.f11434a.getOverlay().remove(this.f11435b);
        jVar.x(this);
    }
}
