package s6;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f17310a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f17311b;
    public final MaterialTextView c;

    /* renamed from: d  reason: collision with root package name */
    public final View f17312d;

    public c(LinearLayout linearLayout, ImageButton imageButton, LinearLayout linearLayout2, MaterialTextView materialTextView) {
        this.f17310a = linearLayout;
        this.f17312d = imageButton;
        this.f17311b = linearLayout2;
        this.c = materialTextView;
    }

    public static c a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.tv_dialog_title;
        MaterialTextView materialTextView = (MaterialTextView) a1.b.O(view, R.id.tv_dialog_title);
        if (materialTextView != null) {
            i10 = R.id.v_head;
            View O = a1.b.O(view, R.id.v_head);
            if (O != null) {
                return new c(linearLayout, linearLayout, materialTextView, O);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public final LinearLayout b() {
        return this.f17310a;
    }

    public c(LinearLayout linearLayout, LinearLayout linearLayout2, MaterialTextView materialTextView, View view) {
        this.f17310a = linearLayout;
        this.f17311b = linearLayout2;
        this.c = materialTextView;
        this.f17312d = view;
    }
}
