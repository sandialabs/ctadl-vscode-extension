package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f3879a = new r();

    public final void a(View view, g1.l lVar) {
        PointerIcon systemIcon;
        String str;
        PointerIcon pointerIcon;
        v7.g.f(view, "view");
        if (lVar instanceof g1.a) {
            ((g1.a) lVar).getClass();
            systemIcon = null;
        } else {
            if (lVar instanceof g1.b) {
                systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((g1.b) lVar).f11138a);
                str = "getSystemIcon(view.context, icon.type)";
            } else {
                systemIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
                str = "getSystemIcon(\n         …DEFAULT\n                )";
            }
            v7.g.e(systemIcon, str);
        }
        pointerIcon = view.getPointerIcon();
        if (!v7.g.a(pointerIcon, systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
