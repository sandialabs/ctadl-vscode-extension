package y6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.airbnb.epoxy.z;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class a extends z<C0246a> {

    /* renamed from: k  reason: collision with root package name */
    public boolean f18895k;

    /* renamed from: l  reason: collision with root package name */
    public NotoColor f18896l;

    /* renamed from: m  reason: collision with root package name */
    public View.OnClickListener f18897m;

    /* renamed from: y6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0246a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public s6.b f18898a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            MaterialTextView materialTextView = (MaterialTextView) view;
            this.f18898a = new s6.b(materialTextView, materialTextView, 0);
        }
    }

    @Override // com.airbnb.epoxy.z
    /* renamed from: D */
    public final void w(C0246a c0246a) {
        v7.g.f(c0246a, "holder");
        s6.b bVar = c0246a.f18898a;
        if (bVar != null) {
            Context context = ((MaterialTextView) bVar.f17293a).getContext();
            View view = bVar.f17294b;
            if (context != null) {
                int b5 = f7.q.b(context, f7.q.j(E()));
                int a10 = f7.q.a(context, R.attr.notoBackgroundColor);
                int a11 = f7.q.a(context, R.attr.notoSurfaceColor);
                int a12 = f7.q.a(context, R.attr.notoPrimaryColor);
                if (((b) this).f18895k) {
                    MaterialTextView materialTextView = (MaterialTextView) view;
                    v7.g.e(materialTextView, "tvAllLabel");
                    f7.c.b(materialTextView, a11, b5);
                    v7.g.e(materialTextView, "tvAllLabel");
                    f7.c.c(materialTextView, a12, a10);
                } else {
                    MaterialTextView materialTextView2 = (MaterialTextView) view;
                    v7.g.e(materialTextView2, "tvAllLabel");
                    f7.c.b(materialTextView2, b5, a11);
                    v7.g.e(materialTextView2, "tvAllLabel");
                    f7.c.c(materialTextView2, a10, a12);
                }
            }
            ((MaterialTextView) view).setOnClickListener(F());
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final NotoColor E() {
        NotoColor notoColor = this.f18896l;
        if (notoColor != null) {
            return notoColor;
        }
        v7.g.l("color");
        throw null;
    }

    public final View.OnClickListener F() {
        View.OnClickListener onClickListener = this.f18897m;
        if (onClickListener != null) {
            return onClickListener;
        }
        v7.g.l("onClickListener");
        throw null;
    }
}
