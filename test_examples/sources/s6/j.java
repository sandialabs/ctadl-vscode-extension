package s6;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f17387a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageButton f17388b;
    public final ImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialTextView f17389d;

    /* renamed from: e  reason: collision with root package name */
    public final MaterialTextView f17390e;

    public j(LinearLayout linearLayout, ImageButton imageButton, ImageView imageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f17387a = linearLayout;
        this.f17388b = imageButton;
        this.c = imageView;
        this.f17389d = materialTextView;
        this.f17390e = materialTextView2;
    }

    public static j a(View view) {
        int i10 = R.id.ib_folder_handle;
        ImageButton imageButton = (ImageButton) a1.b.O(view, R.id.ib_folder_handle);
        if (imageButton != null) {
            i10 = R.id.iv_folder_icon;
            ImageView imageView = (ImageView) a1.b.O(view, R.id.iv_folder_icon);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i10 = R.id.tv_folder_notes_count;
                MaterialTextView materialTextView = (MaterialTextView) a1.b.O(view, R.id.tv_folder_notes_count);
                if (materialTextView != null) {
                    i10 = R.id.tv_folder_title;
                    MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(view, R.id.tv_folder_title);
                    if (materialTextView2 != null) {
                        return new j(linearLayout, imageButton, imageView, materialTextView, materialTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
