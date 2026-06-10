package o6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.epoxy.p;
import com.airbnb.epoxy.z;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import s6.u;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class k extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public NotoColor f16374k;

    /* loaded from: classes.dex */
    public static final class a extends p {

        /* renamed from: a  reason: collision with root package name */
        public u f16375a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) a1.b.O(view, R.id.indicator);
            if (circularProgressIndicator != null) {
                this.f16375a = new u((LinearLayout) view, circularProgressIndicator, 2);
                return;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.indicator)));
        }
    }

    @Override // com.airbnb.epoxy.z
    public final void A(a aVar) {
        a aVar2 = aVar;
        v7.g.f(aVar2, "holder");
        u uVar = aVar2.f16375a;
        if (uVar != null) {
            LinearLayout linearLayout = (LinearLayout) uVar.f17475a;
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
        v7.g.f(aVar, "holder");
        u uVar = aVar.f16375a;
        if (uVar != null) {
            NotoColor notoColor = this.f16374k;
            if (notoColor != null) {
                int j2 = q.j(notoColor);
                Context context = ((LinearLayout) uVar.f17475a).getContext();
                v7.g.e(context, "root.context");
                ((CircularProgressIndicator) uVar.f17476b).setIndicatorColor(q.b(context, j2));
                return;
            }
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    @Override // com.airbnb.epoxy.z, com.airbnb.epoxy.r
    public final void q(Object obj) {
        a aVar = (a) obj;
        v7.g.f(aVar, "holder");
        u uVar = aVar.f16375a;
        if (uVar != null) {
            LinearLayout linearLayout = (LinearLayout) uVar.f17475a;
            v7.g.e(linearLayout, "holder.binding.root");
            ViewUtilsKt.q(linearLayout);
            return;
        }
        v7.g.l("binding");
        throw null;
    }
}
