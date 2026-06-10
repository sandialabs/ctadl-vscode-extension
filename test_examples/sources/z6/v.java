package z6;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class v extends com.airbnb.epoxy.z<a> {

    /* renamed from: k  reason: collision with root package name */
    public boolean f19164k;

    /* renamed from: l  reason: collision with root package name */
    public View.OnClickListener f19165l;

    /* loaded from: classes.dex */
    public static final class a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public s6.q f19166a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            int i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) a1.b.O(view, R.id.iv_icon);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i10 = R.id.tv_title;
                MaterialTextView materialTextView = (MaterialTextView) a1.b.O(view, R.id.tv_title);
                if (materialTextView != null) {
                    this.f19166a = new s6.q(linearLayout, imageView, linearLayout, materialTextView, 1);
                    return;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    @Override // com.airbnb.epoxy.z
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: D */
    public final void w(a aVar) {
        v7.g.f(aVar, "holder");
        s6.q qVar = aVar.f19166a;
        if (qVar != null) {
            qVar.a().setSelected(((w) this).f19164k);
            qVar.a().setOnClickListener(E());
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final View.OnClickListener E() {
        View.OnClickListener onClickListener = this.f19165l;
        if (onClickListener != null) {
            return onClickListener;
        }
        v7.g.l("onClickListener");
        throw null;
    }
}
