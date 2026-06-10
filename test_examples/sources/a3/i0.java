package a3;

import a3.j0;
import android.view.View;
import com.noto.R;

/* loaded from: classes.dex */
public final class i0 extends j0.b<Boolean> {
    public i0() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // a3.j0.b
    public final Boolean b(View view) {
        return Boolean.valueOf(j0.m.c(view));
    }

    @Override // a3.j0.b
    public final void c(View view, Boolean bool) {
        j0.m.g(view, bool.booleanValue());
    }

    @Override // a3.j0.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !j0.b.a(bool, bool2);
    }
}
