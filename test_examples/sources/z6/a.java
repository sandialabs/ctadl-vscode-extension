package z6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class a extends com.airbnb.epoxy.z<C0250a> {

    /* renamed from: k  reason: collision with root package name */
    public boolean f19121k;

    /* renamed from: l  reason: collision with root package name */
    public View.OnClickListener f19122l;

    /* renamed from: z6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0250a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public s6.a f19123a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            MaterialCardView materialCardView = (MaterialCardView) view;
            int i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) a1.b.O(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.ll;
                if (((LinearLayout) a1.b.O(view, R.id.ll)) != null) {
                    i10 = R.id.tv_title;
                    MaterialTextView materialTextView = (MaterialTextView) a1.b.O(view, R.id.tv_title);
                    if (materialTextView != null) {
                        this.f19123a = new s6.a(materialCardView, imageView, materialTextView);
                        return;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    @Override // com.airbnb.epoxy.z
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: D */
    public final void w(C0250a c0250a) {
        v7.g.f(c0250a, "holder");
        s6.a aVar = c0250a.f19123a;
        if (aVar != null) {
            c cVar = (c) this;
            boolean z10 = cVar.f19121k;
            MaterialCardView materialCardView = aVar.f17279a;
            materialCardView.setSelected(z10);
            materialCardView.setStrokeWidth(b.f19124a);
            materialCardView.setOnClickListener(E());
            Context context = materialCardView.getContext();
            if (context != null) {
                int a10 = f7.q.a(context, R.attr.notoPrimaryColor);
                int a11 = f7.q.a(context, R.attr.notoBackgroundColor);
                materialCardView.setRippleColor(f7.q.h(a10));
                materialCardView.setStrokeColor(a10);
                if (cVar.f19121k) {
                    materialCardView.setCardBackgroundColor(q2.a.d(a10, 32));
                } else {
                    materialCardView.setCardBackgroundColor(a11);
                }
                aVar.c.setTextColor(a10);
                aVar.f17280b.setImageTintList(f7.q.h(a10));
                m7.n nVar = m7.n.f16010a;
                return;
            }
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final View.OnClickListener E() {
        View.OnClickListener onClickListener = this.f19122l;
        if (onClickListener != null) {
            return onClickListener;
        }
        v7.g.l("onClickListener");
        throw null;
    }
}
