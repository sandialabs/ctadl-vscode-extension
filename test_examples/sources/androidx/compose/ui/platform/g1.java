package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import com.noto.R;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g1 implements View.OnAttachStateChangeListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f3844i;

    public g1(AbstractComposeView abstractComposeView) {
        this.f3844i = abstractComposeView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        v7.g.f(view, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z10;
        Boolean bool;
        v7.g.f(view, "v");
        AbstractComposeView abstractComposeView = this.f3844i;
        v7.g.f(abstractComposeView, "<this>");
        Iterator it = androidx.core.view.a.b(abstractComposeView).iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            ViewParent viewParent = (ViewParent) it.next();
            if (viewParent instanceof View) {
                View view2 = (View) viewParent;
                v7.g.f(view2, "<this>");
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                if (tag instanceof Boolean) {
                    bool = (Boolean) tag;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    z10 = bool.booleanValue();
                }
                if (z10) {
                    z10 = true;
                    break;
                }
            }
        }
        if (!z10) {
            g0.f fVar = abstractComposeView.f3553k;
            if (fVar != null) {
                ((WrappedComposition) fVar).a();
            }
            abstractComposeView.f3553k = null;
            abstractComposeView.requestLayout();
        }
    }
}
