package f5;

import a3.j0;
import android.view.View;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final View f10938a;

    /* renamed from: b  reason: collision with root package name */
    public int f10939b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f10940d;

    public i(View view) {
        this.f10938a = view;
    }

    public final void a() {
        int i10 = this.f10940d;
        View view = this.f10938a;
        j0.k(view, i10 - (view.getTop() - this.f10939b));
        j0.j(view, 0 - (view.getLeft() - this.c));
    }
}
