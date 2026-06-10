package a3;

import a3.j0;
import android.text.TextUtils;
import android.view.View;
import com.noto.R;

/* loaded from: classes.dex */
public final class g0 extends j0.b<CharSequence> {
    public g0() {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Override // a3.j0.b
    public final CharSequence b(View view) {
        return j0.m.b(view);
    }

    @Override // a3.j0.b
    public final void c(View view, CharSequence charSequence) {
        j0.m.h(view, charSequence);
    }

    @Override // a3.j0.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
