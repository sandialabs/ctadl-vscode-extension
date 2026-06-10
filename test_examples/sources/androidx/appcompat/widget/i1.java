package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class i1 {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        k1 k1Var = k1.f1004s;
        if (k1Var != null && k1Var.f1006i == view) {
            k1.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            k1 k1Var2 = k1.f1005t;
            if (k1Var2 != null && k1Var2.f1006i == view) {
                k1Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new k1(view, charSequence);
    }
}
