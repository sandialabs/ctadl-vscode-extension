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
public abstract class g extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public t6.c f18907k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18908l;

    /* renamed from: m  reason: collision with root package name */
    public NotoColor f18909m;
    public View.OnClickListener n;

    /* renamed from: o  reason: collision with root package name */
    public View.OnLongClickListener f18910o;

    /* loaded from: classes.dex */
    public static final class a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public s6.u f18911a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            MaterialTextView materialTextView = (MaterialTextView) view;
            this.f18911a = new s6.u(materialTextView, materialTextView, 0);
        }
    }

    @Override // com.airbnb.epoxy.z
    /* renamed from: D */
    public final void w(a aVar) {
        v7.g.f(aVar, "holder");
        s6.u uVar = aVar.f18911a;
        if (uVar != null) {
            Context context = ((MaterialTextView) uVar.f17475a).getContext();
            View view = uVar.f17476b;
            if (context != null) {
                int b5 = f7.q.b(context, f7.q.j(E()));
                int a10 = f7.q.a(context, R.attr.notoBackgroundColor);
                int a11 = f7.q.a(context, R.attr.notoSurfaceColor);
                int a12 = f7.q.a(context, R.attr.notoPrimaryColor);
                if (((i) this).f18908l) {
                    MaterialTextView materialTextView = (MaterialTextView) view;
                    v7.g.e(materialTextView, "tvLabel");
                    f7.c.b(materialTextView, a11, b5);
                    v7.g.e(materialTextView, "tvLabel");
                    f7.c.c(materialTextView, a12, a10);
                } else {
                    MaterialTextView materialTextView2 = (MaterialTextView) view;
                    v7.g.e(materialTextView2, "tvLabel");
                    f7.c.b(materialTextView2, b5, a11);
                    v7.g.e(materialTextView2, "tvLabel");
                    f7.c.c(materialTextView2, a10, a12);
                }
            }
            MaterialTextView materialTextView3 = (MaterialTextView) view;
            materialTextView3.setText(F().c);
            materialTextView3.setOnClickListener(G());
            materialTextView3.setOnLongClickListener(H());
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final NotoColor E() {
        NotoColor notoColor = this.f18909m;
        if (notoColor != null) {
            return notoColor;
        }
        v7.g.l("color");
        throw null;
    }

    public final t6.c F() {
        t6.c cVar = this.f18907k;
        if (cVar != null) {
            return cVar;
        }
        v7.g.l("label");
        throw null;
    }

    public final View.OnClickListener G() {
        View.OnClickListener onClickListener = this.n;
        if (onClickListener != null) {
            return onClickListener;
        }
        v7.g.l("onClickListener");
        throw null;
    }

    public final View.OnLongClickListener H() {
        View.OnLongClickListener onLongClickListener = this.f18910o;
        if (onLongClickListener != null) {
            return onLongClickListener;
        }
        v7.g.l("onLongClickListener");
        throw null;
    }
}
