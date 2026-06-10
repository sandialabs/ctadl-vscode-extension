package h4;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class u extends a1.c {
    public static boolean V = true;

    @SuppressLint({"NewApi"})
    public float Z1(View view) {
        float transitionAlpha;
        if (V) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                V = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void a2(View view, float f10) {
        if (V) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                V = false;
            }
        }
        view.setAlpha(f10);
    }
}
