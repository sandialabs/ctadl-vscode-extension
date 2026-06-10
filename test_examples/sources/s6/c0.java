package s6;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.noto.R;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f17313a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageButton f17314b;
    public final ImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f17315d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f17316e;

    /* renamed from: f  reason: collision with root package name */
    public final EpoxyRecyclerView f17317f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17318g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17319h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17320i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17321j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17322k;

    public c0(FrameLayout frameLayout, ImageButton imageButton, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, EpoxyRecyclerView epoxyRecyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f17313a = frameLayout;
        this.f17314b = imageButton;
        this.c = imageView;
        this.f17315d = linearLayout;
        this.f17316e = linearLayout2;
        this.f17317f = epoxyRecyclerView;
        this.f17318g = textView;
        this.f17319h = textView2;
        this.f17320i = textView3;
        this.f17321j = textView4;
        this.f17322k = textView5;
    }

    public static c0 a(View view) {
        int i10 = R.id.ib_drag;
        ImageButton imageButton = (ImageButton) a1.b.O(view, R.id.ib_drag);
        if (imageButton != null) {
            i10 = R.id.iv_selected;
            ImageView imageView = (ImageView) a1.b.O(view, R.id.iv_selected);
            if (imageView != null) {
                i10 = R.id.ll;
                LinearLayout linearLayout = (LinearLayout) a1.b.O(view, R.id.ll);
                if (linearLayout != null) {
                    i10 = R.id.ll_reminder;
                    LinearLayout linearLayout2 = (LinearLayout) a1.b.O(view, R.id.ll_reminder);
                    if (linearLayout2 != null) {
                        i10 = R.id.rv;
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(view, R.id.rv);
                        if (epoxyRecyclerView != null) {
                            i10 = R.id.tv_access_date;
                            TextView textView = (TextView) a1.b.O(view, R.id.tv_access_date);
                            if (textView != null) {
                                i10 = R.id.tv_creation_date;
                                TextView textView2 = (TextView) a1.b.O(view, R.id.tv_creation_date);
                                if (textView2 != null) {
                                    i10 = R.id.tv_note_body;
                                    TextView textView3 = (TextView) a1.b.O(view, R.id.tv_note_body);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_note_title;
                                        TextView textView4 = (TextView) a1.b.O(view, R.id.tv_note_title);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_reminder;
                                            TextView textView5 = (TextView) a1.b.O(view, R.id.tv_reminder);
                                            if (textView5 != null) {
                                                return new c0((FrameLayout) view, imageButton, imageView, linearLayout, linearLayout2, epoxyRecyclerView, textView, textView2, textView3, textView4, textView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
