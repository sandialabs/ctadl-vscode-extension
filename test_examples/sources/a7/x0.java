package a7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class x0 extends com.airbnb.epoxy.z<a> {

    /* renamed from: k  reason: collision with root package name */
    public String f379k;

    /* renamed from: l  reason: collision with root package name */
    public int f380l;

    /* renamed from: m  reason: collision with root package name */
    public int f381m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public NotoColor f382o;

    /* renamed from: p  reason: collision with root package name */
    public View.OnClickListener f383p;

    /* renamed from: q  reason: collision with root package name */
    public View.OnClickListener f384q;

    /* loaded from: classes.dex */
    public static final class a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public s6.c f385a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            int i10 = R.id.ib_copy;
            ImageButton imageButton = (ImageButton) a1.b.O(view, R.id.ib_copy);
            if (imageButton != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                MaterialTextView materialTextView = (MaterialTextView) a1.b.O(view, R.id.tv_text);
                if (materialTextView != null) {
                    this.f385a = new s6.c(linearLayout, imageButton, linearLayout, materialTextView);
                    return;
                }
                i10 = R.id.tv_text;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    @Override // com.airbnb.epoxy.z
    @SuppressLint({"SetTextI18n"})
    /* renamed from: D */
    public final void w(a aVar) {
        int i10;
        Drawable mutate;
        v7.g.f(aVar, "holder");
        s6.c cVar = aVar.f385a;
        if (cVar != null) {
            Context context = cVar.b().getContext();
            LinearLayout linearLayout = cVar.f17311b;
            if (context != null) {
                int a10 = f7.q.a(context, R.attr.notoSurfaceColor);
                int a11 = f7.q.a(context, R.attr.notoBackgroundColor);
                int b5 = f7.q.b(context, f7.q.j(E()));
                int a12 = f7.q.a(context, R.attr.notoSecondaryColor);
                Drawable background = linearLayout.getBackground();
                if (background != null && (mutate = background.mutate()) != null) {
                    if (!((y0) this).n) {
                        a10 = a11;
                    }
                    mutate.setTint(a10);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (!ha.i.T0(H())) {
                    int a13 = kotlin.text.b.a1(H());
                    int c0 = a1.c.c0(this.f380l, 0, a13);
                    int c02 = a1.c.c0(this.f381m, 0, a13);
                    String q12 = kotlin.text.b.q1(H(), a1.c.V1(0, c0));
                    String q13 = kotlin.text.b.q1(H(), a1.c.V1(c0, c02));
                    String q14 = kotlin.text.b.q1(H(), new b8.i(c02, a13));
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(a12);
                    int length = spannableStringBuilder.length();
                    int i11 = 50;
                    if (q12.length() > 50) {
                        spannableStringBuilder.append((CharSequence) "...");
                        spannableStringBuilder.append(' ');
                        int length2 = q12.length();
                        if (50 > length2) {
                            i10 = length2;
                        } else {
                            i10 = 50;
                        }
                        q12 = q12.substring(length2 - i10);
                        v7.g.e(q12, "this as java.lang.String).substring(startIndex)");
                    }
                    spannableStringBuilder.append((CharSequence) q12);
                    spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                    ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(b5);
                    int length3 = spannableStringBuilder.length();
                    StyleSpan styleSpan = new StyleSpan(1);
                    int length4 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) q13);
                    spannableStringBuilder.setSpan(styleSpan, length4, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.setSpan(foregroundColorSpan2, length3, spannableStringBuilder.length(), 17);
                    ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(a12);
                    int length5 = spannableStringBuilder.length();
                    if (q14.length() > 50) {
                        int length6 = q14.length();
                        if (50 > length6) {
                            i11 = length6;
                        }
                        String substring = q14.substring(0, i11);
                        v7.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        spannableStringBuilder.append((CharSequence) substring);
                        spannableStringBuilder.append(' ');
                        spannableStringBuilder.append((CharSequence) "...");
                    } else {
                        spannableStringBuilder.append((CharSequence) q14);
                    }
                    spannableStringBuilder.setSpan(foregroundColorSpan3, length5, spannableStringBuilder.length(), 17);
                }
                cVar.c.setText(new SpannedString(spannableStringBuilder));
            }
            linearLayout.setOnClickListener(F());
            ((ImageButton) cVar.f17312d).setOnClickListener(G());
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final NotoColor E() {
        NotoColor notoColor = this.f382o;
        if (notoColor != null) {
            return notoColor;
        }
        v7.g.l("color");
        throw null;
    }

    public final View.OnClickListener F() {
        View.OnClickListener onClickListener = this.f383p;
        if (onClickListener != null) {
            return onClickListener;
        }
        v7.g.l("onClickListener");
        throw null;
    }

    public final View.OnClickListener G() {
        View.OnClickListener onClickListener = this.f384q;
        if (onClickListener != null) {
            return onClickListener;
        }
        v7.g.l("onCopyClickListener");
        throw null;
    }

    public final String H() {
        String str = this.f379k;
        if (str != null) {
            return str;
        }
        v7.g.l("text");
        throw null;
    }
}
