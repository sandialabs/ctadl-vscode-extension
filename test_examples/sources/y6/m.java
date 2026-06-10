package y6;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.airbnb.epoxy.y;
import com.noto.R;

/* loaded from: classes.dex */
public final class m extends y<l> {

    /* renamed from: h  reason: collision with root package name */
    public final u7.a<m7.n> f18922h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.airbnb.epoxy.m mVar, u7.a<m7.n> aVar) {
        super(mVar, l.class);
        v7.g.f(mVar, "epoxyController");
        this.f18922h = aVar;
    }

    @Override // com.airbnb.epoxy.e
    public final int a(com.airbnb.epoxy.r rVar) {
        l lVar = (l) rVar;
        return 196611;
    }

    @Override // androidx.recyclerview.widget.n.d
    public final boolean i() {
        return false;
    }

    @Override // com.airbnb.epoxy.y
    public final void t(l lVar, View view) {
        Context context;
        l lVar2 = lVar;
        if (view != null) {
            view.setSelected(false);
        }
        if (view != null && (context = view.getContext()) != null && lVar2 != null) {
            int b5 = f7.q.b(context, f7.q.j(lVar2.E()));
            int a10 = f7.q.a(context, R.attr.notoBackgroundColor);
            int a11 = f7.q.a(context, R.attr.notoSurfaceColor);
            int a12 = f7.q.a(context, R.attr.notoPrimaryColor);
            TextView textView = (TextView) view.findViewById(R.id.tv_label);
            v7.g.e(textView, "tvLabel");
            f7.c.b(textView, b5, a11);
            f7.c.c(textView, a10, a12);
            ((ImageButton) view.findViewById(R.id.ib_drag)).setImageTintList(f7.q.h(a12));
        }
    }

    @Override // com.airbnb.epoxy.y
    public final void u(com.airbnb.epoxy.r rVar, View view) {
        Context context;
        l lVar = (l) rVar;
        if (view != null) {
            view.setSelected(true);
        }
        if (view != null && (context = view.getContext()) != null && lVar != null) {
            int b5 = f7.q.b(context, f7.q.j(lVar.E()));
            int a10 = f7.q.a(context, R.attr.notoBackgroundColor);
            int a11 = f7.q.a(context, R.attr.notoSurfaceColor);
            int a12 = f7.q.a(context, R.attr.notoPrimaryColor);
            TextView textView = (TextView) view.findViewById(R.id.tv_label);
            v7.g.e(textView, "tvLabel");
            f7.c.b(textView, a11, b5);
            f7.c.c(textView, a12, a10);
            ((ImageButton) view.findViewById(R.id.ib_drag)).setImageTintList(f7.q.h(b5));
            if (Build.VERSION.SDK_INT >= 28) {
                view.setOutlineAmbientShadowColor(b5);
                view.setOutlineSpotShadowColor(b5);
            }
        }
    }

    @Override // com.airbnb.epoxy.y
    public final void v(com.airbnb.epoxy.r rVar) {
        l lVar = (l) rVar;
        this.f18922h.k0();
    }
}
