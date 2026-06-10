package d0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.ripple.CommonRippleIndicationInstance;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g0.d;
import g0.g0;
import m7.n;

/* loaded from: classes.dex */
public final class b extends androidx.compose.material.ripple.b {
    public b() {
        throw null;
    }

    public b(boolean z10, float f10, g0 g0Var) {
        super(z10, f10, g0Var);
    }

    @Override // androidx.compose.material.ripple.b
    public final g b(u.i iVar, boolean z10, float f10, g0 g0Var, g0 g0Var2, g0.d dVar) {
        View view;
        g gVar;
        v7.g.f(iVar, "interactionSource");
        dVar.f(1643266907);
        dVar.f(601470064);
        Object w10 = dVar.w(AndroidCompositionLocals_androidKt.f3659f);
        while (!(w10 instanceof ViewGroup)) {
            Object parent = ((View) w10).getParent();
            if (parent instanceof View) {
                v7.g.e(parent, "parent");
                w10 = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + w10 + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) w10;
        dVar.u();
        boolean isInEditMode = viewGroup.isInEditMode();
        Object obj = d.a.f11039a;
        if (isInEditMode) {
            dVar.f(1643267309);
            dVar.f(-3686552);
            boolean z11 = dVar.z(iVar) | dVar.z(this);
            Object g10 = dVar.g();
            if (z11 || g10 == obj) {
                g10 = new CommonRippleIndicationInstance(z10, f10, g0Var, g0Var2);
                dVar.q(g10);
            }
            dVar.u();
            gVar = (CommonRippleIndicationInstance) g10;
            dVar.u();
        } else {
            dVar.f(1643267473);
            dVar.u();
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    view = viewGroup.getChildAt(i10);
                    if (view instanceof e) {
                        break;
                    } else if (i11 >= childCount) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            view = null;
            if (view == null) {
                Context context = viewGroup.getContext();
                v7.g.e(context, "view.context");
                view = new e(context);
                viewGroup.addView(view);
                n nVar = n.f16010a;
            }
            dVar.f(-3686095);
            boolean z12 = dVar.z(iVar) | dVar.z(this) | dVar.z(view);
            Object g11 = dVar.g();
            if (z12 || g11 == obj) {
                g11 = new androidx.compose.material.ripple.a(z10, f10, g0Var, g0Var2, (e) view);
                dVar.q(g11);
            }
            dVar.u();
            gVar = (androidx.compose.material.ripple.a) g11;
        }
        dVar.u();
        return gVar;
    }
}
