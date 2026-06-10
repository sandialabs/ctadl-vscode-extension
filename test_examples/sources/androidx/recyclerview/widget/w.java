package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.l f5996a;

    /* renamed from: b  reason: collision with root package name */
    public int f5997b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public w(RecyclerView.l lVar) {
        this.f5996a = lVar;
    }

    public static w a(RecyclerView.l lVar, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return new v(lVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new u(lVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public final int m() {
        if (Integer.MIN_VALUE == this.f5997b) {
            return 0;
        }
        return l() - this.f5997b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i10);
}
