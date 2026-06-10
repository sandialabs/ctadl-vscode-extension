package androidx.navigation;

import android.view.View;
import android.view.ViewParent;
import com.noto.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NavController a(View view) {
        NavController navController;
        NavController navController2;
        View view2 = view;
        while (true) {
            navController = null;
            if (view2 == null) {
                break;
            }
            Object tag = view2.getTag(R.id.nav_controller_view_tag);
            if (tag instanceof WeakReference) {
                tag = ((WeakReference) tag).get();
            } else if (!(tag instanceof NavController)) {
                navController2 = null;
                if (navController2 == null) {
                    navController = navController2;
                    break;
                }
                ViewParent parent = view2.getParent();
                if (parent instanceof View) {
                    view2 = (View) parent;
                } else {
                    view2 = null;
                }
            }
            navController2 = (NavController) tag;
            if (navController2 == null) {
            }
        }
        if (navController != null) {
            return navController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
