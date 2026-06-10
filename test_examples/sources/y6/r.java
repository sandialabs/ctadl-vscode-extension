package y6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.epoxy.z;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import s6.d0;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class r extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public t6.c f18928k;

    /* renamed from: l  reason: collision with root package name */
    public NotoColor f18929l;

    /* loaded from: classes.dex */
    public static final class a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public d0 f18930a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            MaterialTextView materialTextView = (MaterialTextView) view;
            this.f18930a = new d0(materialTextView, materialTextView);
        }
    }

    @Override // com.airbnb.epoxy.z
    /* renamed from: D */
    public final void w(a aVar) {
        Drawable mutate;
        v7.g.f(aVar, "holder");
        d0 d0Var = aVar.f18930a;
        if (d0Var != null) {
            Context context = d0Var.f17324a.getContext();
            MaterialTextView materialTextView = d0Var.f17325b;
            if (context != null) {
                Drawable background = materialTextView.getBackground();
                if (background != null && (mutate = background.mutate()) != null) {
                    mutate.setTint(f7.q.b(context, f7.q.j(E())));
                }
                materialTextView.setTextColor(f7.q.a(context, R.attr.notoBackgroundColor));
            }
            materialTextView.setText(F().c);
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final NotoColor E() {
        NotoColor notoColor = this.f18929l;
        if (notoColor != null) {
            return notoColor;
        }
        v7.g.l("color");
        throw null;
    }

    public final t6.c F() {
        t6.c cVar = this.f18928k;
        if (cVar != null) {
            return cVar;
        }
        v7.g.l("label");
        throw null;
    }
}
