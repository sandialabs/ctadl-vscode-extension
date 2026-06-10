package h4;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class x extends w {
    public static boolean Z = true;

    @Override // a1.c
    @SuppressLint({"NewApi"})
    public void x1(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.x1(view, i10);
        } else if (Z) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                Z = false;
            }
        }
    }
}
