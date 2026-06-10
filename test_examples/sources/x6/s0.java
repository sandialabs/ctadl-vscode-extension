package x6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.widget.i1;
import com.noto.app.domain.model.NotoColor;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class s0 extends com.airbnb.epoxy.z<a> {

    /* renamed from: k  reason: collision with root package name */
    public NotoColor f18716k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18717l;

    /* renamed from: m  reason: collision with root package name */
    public View.OnClickListener f18718m;

    /* loaded from: classes.dex */
    public static final class a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public s6.b f18719a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            RadioButton radioButton = (RadioButton) view;
            this.f18719a = new s6.b(radioButton, radioButton, 2);
        }
    }

    @Override // com.airbnb.epoxy.z
    /* renamed from: D */
    public final void w(a aVar) {
        v7.g.f(aVar, "holder");
        s6.b bVar = aVar.f18719a;
        if (bVar != null) {
            Context context = ((RadioButton) bVar.f17293a).getContext();
            View view = bVar.f17294b;
            if (context != null) {
                ((RadioButton) view).setBackgroundTintList(f7.q.h(f7.q.b(context, f7.q.j(E()))));
            }
            ((RadioButton) view).setChecked(((t0) this).f18717l);
            ((RadioButton) view).setOnClickListener(F());
            i1.a((RadioButton) view, E().name());
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final NotoColor E() {
        NotoColor notoColor = this.f18716k;
        if (notoColor != null) {
            return notoColor;
        }
        v7.g.l("notoColor");
        throw null;
    }

    public final View.OnClickListener F() {
        View.OnClickListener onClickListener = this.f18718m;
        if (onClickListener != null) {
            return onClickListener;
        }
        v7.g.l("onClickListener");
        throw null;
    }
}
