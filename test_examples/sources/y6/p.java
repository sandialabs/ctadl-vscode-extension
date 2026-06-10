package y6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageButton;
import com.airbnb.epoxy.z;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class p extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public NotoColor f18925k;

    /* renamed from: l  reason: collision with root package name */
    public View.OnClickListener f18926l;

    /* loaded from: classes.dex */
    public static final class a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public s6.u f18927a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            ImageButton imageButton = (ImageButton) view;
            this.f18927a = new s6.u(imageButton, imageButton, 1);
        }
    }

    @Override // com.airbnb.epoxy.z
    /* renamed from: D */
    public final void w(a aVar) {
        Drawable mutate;
        v7.g.f(aVar, "holder");
        s6.u uVar = aVar.f18927a;
        RippleDrawable rippleDrawable = null;
        if (uVar != null) {
            Context context = ((ImageButton) uVar.f17475a).getContext();
            View view = uVar.f17476b;
            if (context != null) {
                int b5 = f7.q.b(context, f7.q.j(E()));
                ColorStateList h10 = f7.q.h(b5);
                int a10 = f7.q.a(context, R.attr.notoBackgroundColor);
                ((ImageButton) view).setImageTintList(h10);
                ImageButton imageButton = (ImageButton) view;
                Drawable c = f7.q.c(context, R.drawable.label_item_shape);
                if (c != null && (mutate = c.mutate()) != null) {
                    Drawable drawable = ((RippleDrawable) mutate).getDrawable(0);
                    v7.g.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    gradientDrawable.setColor(a10);
                    gradientDrawable.setStroke(ModelUtilsKt.f9848a, b5);
                    RippleDrawable rippleDrawable2 = new RippleDrawable(f7.q.h(f7.q.a(context, R.attr.notoSecondaryColor)), gradientDrawable, gradientDrawable);
                    ViewUtilsKt.s(rippleDrawable2, h10);
                    rippleDrawable = rippleDrawable2;
                }
                imageButton.setBackground(rippleDrawable);
            }
            ((ImageButton) view).setOnClickListener(F());
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final NotoColor E() {
        NotoColor notoColor = this.f18925k;
        if (notoColor != null) {
            return notoColor;
        }
        v7.g.l("color");
        throw null;
    }

    public final View.OnClickListener F() {
        View.OnClickListener onClickListener = this.f18926l;
        if (onClickListener != null) {
            return onClickListener;
        }
        v7.g.l("onClickListener");
        throw null;
    }
}
