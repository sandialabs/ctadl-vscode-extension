package y6;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.z;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import s6.v;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class l extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public t6.c f18918k;

    /* renamed from: l  reason: collision with root package name */
    public NotoColor f18919l;

    /* renamed from: m  reason: collision with root package name */
    public View.OnTouchListener f18920m;

    /* loaded from: classes.dex */
    public static final class a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public v f18921a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            int i10 = R.id.ib_drag;
            ImageButton imageButton = (ImageButton) a1.b.O(view, R.id.ib_drag);
            if (imageButton != null) {
                i10 = R.id.tv_label;
                MaterialTextView materialTextView = (MaterialTextView) a1.b.O(view, R.id.tv_label);
                if (materialTextView != null) {
                    this.f18921a = new v((ConstraintLayout) view, imageButton, materialTextView);
                    return;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
    }

    @Override // com.airbnb.epoxy.z
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: D */
    public final void w(a aVar) {
        v7.g.f(aVar, "holder");
        v vVar = aVar.f18921a;
        if (vVar != null) {
            vVar.f17478b.setText(F().c);
            vVar.f17477a.setOnTouchListener(G());
            return;
        }
        v7.g.l("binding");
        throw null;
    }

    public final NotoColor E() {
        NotoColor notoColor = this.f18919l;
        if (notoColor != null) {
            return notoColor;
        }
        v7.g.l("color");
        throw null;
    }

    public final t6.c F() {
        t6.c cVar = this.f18918k;
        if (cVar != null) {
            return cVar;
        }
        v7.g.l("label");
        throw null;
    }

    public final View.OnTouchListener G() {
        View.OnTouchListener onTouchListener = this.f18920m;
        if (onTouchListener != null) {
            return onTouchListener;
        }
        v7.g.l("onDragHandleTouchListener");
        throw null;
    }
}
