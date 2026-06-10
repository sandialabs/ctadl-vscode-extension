package o6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.airbnb.epoxy.p;
import com.airbnb.epoxy.z;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ViewUtilsKt;
import s6.q;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class f extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public String f16365k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16366l;

    /* renamed from: m  reason: collision with root package name */
    public NotoColor f16367m;
    public View.OnClickListener n;

    /* renamed from: o  reason: collision with root package name */
    public View.OnLongClickListener f16368o;

    /* renamed from: p  reason: collision with root package name */
    public View.OnClickListener f16369p;

    /* loaded from: classes.dex */
    public static final class a extends p {

        /* renamed from: a  reason: collision with root package name */
        public q f16370a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            int i10 = R.id.ib_create;
            ImageButton imageButton = (ImageButton) a1.b.O(view, R.id.ib_create);
            if (imageButton != null) {
                i10 = R.id.ib_visibility;
                ImageButton imageButton2 = (ImageButton) a1.b.O(view, R.id.ib_visibility);
                if (imageButton2 != null) {
                    i10 = R.id.tv_title;
                    MaterialTextView materialTextView = (MaterialTextView) a1.b.O(view, R.id.tv_title);
                    if (materialTextView != null) {
                        this.f16370a = new q((LinearLayout) view, imageButton, imageButton2, materialTextView, 0);
                        return;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    @Override // com.airbnb.epoxy.z
    public final void A(a aVar) {
        a aVar2 = aVar;
        v7.g.f(aVar2, "holder");
        q qVar = aVar2.f16370a;
        if (qVar != null) {
            LinearLayout linearLayout = qVar.f17454a;
            v7.g.e(linearLayout, "holder.binding.root");
            ViewUtilsKt.q(linearLayout);
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    @Override // com.airbnb.epoxy.z
    /* renamed from: D */
    public final void w(a aVar) {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        int i10;
        int i11;
        v7.g.f(aVar, "holder");
        q qVar = aVar.f16370a;
        String str = null;
        if (qVar != null) {
            String E = E();
            MaterialTextView materialTextView = qVar.f17455b;
            materialTextView.setText(E);
            View.OnClickListener onClickListener = this.n;
            LinearLayout linearLayout = qVar.f17454a;
            linearLayout.setOnClickListener(onClickListener);
            linearLayout.setOnLongClickListener(this.f16368o);
            boolean z13 = true;
            int i12 = 0;
            if (this.n != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            linearLayout.setClickable(z10);
            if (this.f16368o != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            linearLayout.setLongClickable(z11);
            ImageButton imageButton = (ImageButton) qVar.f17456d;
            ViewPropertyAnimator duration = imageButton.animate().setDuration(250L);
            g gVar = (g) this;
            if (gVar.f16366l) {
                f10 = 180.0f;
            } else {
                f10 = 0.0f;
            }
            duration.rotation(f10);
            Context context = linearLayout.getContext();
            if (context != null) {
                if (gVar.f16366l) {
                    i11 = R.string.hide;
                } else {
                    i11 = R.string.show;
                }
                str = f7.q.f(context, i11, new Object[0]);
            }
            imageButton.setContentDescription(str);
            imageButton.setOnClickListener(this.n);
            v7.g.e(imageButton, "ibVisibility");
            if (this.n != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageButton.setVisibility(i10);
            ImageButton imageButton2 = (ImageButton) qVar.c;
            imageButton2.setOnClickListener(this.f16369p);
            v7.g.e(imageButton2, "ibCreate");
            if (this.f16369p == null) {
                z13 = false;
            }
            if (!z13) {
                i12 = 8;
            }
            imageButton2.setVisibility(i12);
            if (this.f16367m != null) {
                Context context2 = linearLayout.getContext();
                v7.g.e(context2, "root.context");
                NotoColor notoColor = this.f16367m;
                v7.g.c(notoColor);
                int b5 = f7.q.b(context2, f7.q.j(notoColor));
                ColorStateList h10 = f7.q.h(b5);
                materialTextView.setTextColor(b5);
                imageButton.setImageTintList(h10);
                imageButton2.setImageTintList(h10);
                Drawable background = linearLayout.getBackground();
                v7.g.e(background, "root.background");
                ViewUtilsKt.s(background, h10);
                Drawable background2 = imageButton2.getBackground();
                v7.g.e(background2, "ibCreate.background");
                ViewUtilsKt.s(background2, h10);
                Drawable background3 = imageButton.getBackground();
                v7.g.e(background3, "ibVisibility.background");
                ViewUtilsKt.s(background3, h10);
                return;
            }
            Context context3 = linearLayout.getContext();
            v7.g.e(context3, "root.context");
            int a10 = f7.q.a(context3, R.attr.notoSecondaryColor);
            materialTextView.setTextColor(a10);
            imageButton.setImageTintList(f7.q.h(a10));
            imageButton2.setImageTintList(f7.q.h(a10));
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final String E() {
        String str = this.f16365k;
        if (str != null) {
            return str;
        }
        v7.g.l("title");
        throw null;
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void q(Object obj) {
        a aVar = (a) obj;
        v7.g.f(aVar, "holder");
        q qVar = aVar.f16370a;
        if (qVar != null) {
            LinearLayout linearLayout = qVar.f17454a;
            v7.g.e(linearLayout, "holder.binding.root");
            ViewUtilsKt.q(linearLayout);
            return;
        }
        v7.g.l("binding");
        throw null;
    }
}
