package u5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class p extends ImageButton {

    /* renamed from: i  reason: collision with root package name */
    public int f17833i;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public p(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17833i = getVisibility();
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f17833i = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f17833i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
