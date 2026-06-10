package a3;

import a3.j0;
import android.text.TextUtils;
import android.view.View;
import com.noto.R;

/* loaded from: classes.dex */
public final class h0 extends j0.b<CharSequence> {
    public h0() {
        super(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    @Override // a3.j0.b
    public final CharSequence b(View view) {
        return j0.o.a(view);
    }

    @Override // a3.j0.b
    public final void c(View view, CharSequence charSequence) {
        j0.o.b(view, charSequence);
    }

    @Override // a3.j0.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
