package e7;

import android.annotation.SuppressLint;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.epoxy.p;
import com.airbnb.epoxy.z;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import f7.w;
import s6.p0;
import t6.g;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class a extends z<C0111a> {

    /* renamed from: k  reason: collision with root package name */
    public g f10670k;

    /* renamed from: e7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0111a extends p {

        /* renamed from: a  reason: collision with root package name */
        public p0 f10671a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            int i10 = R.id.divider;
            if (a1.b.O(view, R.id.divider) != null) {
                i10 = R.id.ll_date;
                if (((LinearLayout) a1.b.O(view, R.id.ll_date)) != null) {
                    i10 = R.id.ll_version;
                    if (((LinearLayout) a1.b.O(view, R.id.ll_version)) != null) {
                        i10 = R.id.tv_changelog;
                        MaterialTextView materialTextView = (MaterialTextView) a1.b.O(view, R.id.tv_changelog);
                        if (materialTextView != null) {
                            i10 = R.id.tv_date;
                            MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(view, R.id.tv_date);
                            if (materialTextView2 != null) {
                                i10 = R.id.tv_version;
                                MaterialTextView materialTextView3 = (MaterialTextView) a1.b.O(view, R.id.tv_version);
                                if (materialTextView3 != null) {
                                    this.f10671a = new p0((LinearLayout) view, materialTextView, materialTextView2, materialTextView3);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    @Override // com.airbnb.epoxy.z
    /* renamed from: D */
    public final void w(C0111a c0111a) {
        URLSpan[] uRLSpanArr;
        v7.g.f(c0111a, "holder");
        p0 p0Var = c0111a.f10671a;
        if (p0Var != null) {
            p0Var.c.setText(E().b().toString());
            p0Var.f17453b.setText(f7.g.b(E().c()));
            CharSequence a10 = E().a();
            MaterialTextView materialTextView = p0Var.f17452a;
            materialTextView.setText(a10);
            v7.g.e(materialTextView, "tvChangelog");
            SpannableString spannableString = new SpannableString(materialTextView.getText());
            Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            v7.g.e(spans, "spannable.getSpans(0, sp…gth, URLSpan::class.java)");
            for (URLSpan uRLSpan : (URLSpan[]) spans) {
                spannableString.setSpan(new w(uRLSpan.getURL()), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 0);
            }
            materialTextView.setText(spannableString);
            materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final g E() {
        g gVar = this.f10670k;
        if (gVar != null) {
            return gVar;
        }
        v7.g.l("release");
        throw null;
    }
}
