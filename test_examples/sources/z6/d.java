package z6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class d extends com.airbnb.epoxy.z<a> {

    /* renamed from: k  reason: collision with root package name */
    public t6.a f19133k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f19134l;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f19136o;

    /* renamed from: q  reason: collision with root package name */
    public View.OnClickListener f19138q;

    /* renamed from: r  reason: collision with root package name */
    public View.OnLongClickListener f19139r;

    /* renamed from: s  reason: collision with root package name */
    public View.OnTouchListener f19140s;

    /* renamed from: m  reason: collision with root package name */
    public boolean f19135m = true;

    /* renamed from: p  reason: collision with root package name */
    public int f19137p = 1;

    /* loaded from: classes.dex */
    public static final class a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public s6.j f19141a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            this.f19141a = s6.j.a(view);
        }
    }

    @Override // com.airbnb.epoxy.z
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: D */
    public final void w(a aVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Drawable mutate;
        v7.g.f(aVar, "holder");
        s6.j jVar = aVar.f19141a;
        if (jVar != null) {
            LinearLayout linearLayout = jVar.f17387a;
            Context context = linearLayout.getContext();
            ImageButton imageButton = jVar.f17388b;
            MaterialTextView materialTextView = jVar.f17390e;
            MaterialTextView materialTextView2 = jVar.f17389d;
            if (context != null) {
                int b5 = f7.q.b(context, f7.q.j(E().f17595e));
                ColorStateList h10 = f7.q.h(q2.a.d(b5, 32));
                Drawable background = linearLayout.getBackground();
                v7.g.d(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
                ((RippleDrawable) background).setColor(h10);
                materialTextView2.setText(String.valueOf(this.n));
                materialTextView.setTextColor(b5);
                materialTextView2.setTextColor(b5);
                Drawable drawable = imageButton.getDrawable();
                if (drawable != null && (mutate = drawable.mutate()) != null) {
                    mutate.setTint(b5);
                }
                if (!J()) {
                    h10 = f7.q.h(f7.q.a(context, R.attr.notoBackgroundColor));
                }
                linearLayout.setBackgroundTintList(h10);
                materialTextView.setText(ModelUtilsKt.o(context, E()));
                String o10 = ModelUtilsKt.o(context, E());
                ImageView imageView = jVar.c;
                imageView.setContentDescription(o10);
                if (J()) {
                    i14 = R.drawable.ic_round_folder_open_24;
                } else if (ModelUtilsKt.u(E())) {
                    i14 = R.drawable.ic_round_folder_general_24;
                } else {
                    i14 = R.drawable.ic_round_folder_24;
                }
                imageView.setImageDrawable(f7.q.c(context, i14));
                imageView.setImageTintList(f7.q.h(b5));
            }
            if (I() && !ModelUtilsKt.u(E())) {
                i10 = 0;
            } else if (I() && ModelUtilsKt.u(E())) {
                i10 = 4;
            } else {
                i10 = 8;
            }
            imageButton.setVisibility(i10);
            imageButton.setOnTouchListener(G());
            linearLayout.setOnClickListener(F());
            linearLayout.setOnLongClickListener(H());
            v7.g.e(materialTextView2, "tvFolderNotesCount");
            if (K()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            materialTextView2.setVisibility(i11);
            linearLayout.setPaddingRelative(f7.q.d(16) * this.f19137p, linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
            v7.g.e(materialTextView, "tvFolderTitle");
            ViewGroup.LayoutParams layoutParams = materialTextView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (!K() && !I()) {
                    i12 = 16;
                } else {
                    i12 = 8;
                }
                int d5 = f7.q.d(i12);
                int marginStart = marginLayoutParams.getMarginStart();
                int i15 = marginLayoutParams.topMargin;
                int i16 = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = i15;
                marginLayoutParams.setMarginEnd(d5);
                marginLayoutParams.bottomMargin = i16;
                materialTextView.setLayoutParams(marginLayoutParams);
                ViewGroup.LayoutParams layoutParams2 = materialTextView2.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (I()) {
                        i13 = 8;
                    } else {
                        i13 = 0;
                    }
                    int d10 = f7.q.d(i13);
                    int marginStart2 = marginLayoutParams2.getMarginStart();
                    int i17 = marginLayoutParams2.topMargin;
                    int i18 = marginLayoutParams2.bottomMargin;
                    marginLayoutParams2.setMarginStart(marginStart2);
                    marginLayoutParams2.topMargin = i17;
                    marginLayoutParams2.setMarginEnd(d10);
                    marginLayoutParams2.bottomMargin = i18;
                    materialTextView2.setLayoutParams(marginLayoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        v7.g.l("binding");
        throw null;
    }

    public final t6.a E() {
        t6.a aVar = this.f19133k;
        if (aVar != null) {
            return aVar;
        }
        v7.g.l("folder");
        throw null;
    }

    public final View.OnClickListener F() {
        View.OnClickListener onClickListener = this.f19138q;
        if (onClickListener != null) {
            return onClickListener;
        }
        v7.g.l("onClickListener");
        throw null;
    }

    public final View.OnTouchListener G() {
        View.OnTouchListener onTouchListener = this.f19140s;
        if (onTouchListener != null) {
            return onTouchListener;
        }
        v7.g.l("onDragHandleTouchListener");
        throw null;
    }

    public final View.OnLongClickListener H() {
        View.OnLongClickListener onLongClickListener = this.f19139r;
        if (onLongClickListener != null) {
            return onLongClickListener;
        }
        v7.g.l("onLongClickListener");
        throw null;
    }

    public boolean I() {
        return this.f19134l;
    }

    public boolean J() {
        return this.f19136o;
    }

    public boolean K() {
        return this.f19135m;
    }
}
