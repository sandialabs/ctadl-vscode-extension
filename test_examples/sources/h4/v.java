package h4;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class v extends u {
    public static boolean W = true;
    public static boolean X = true;

    @SuppressLint({"NewApi"})
    public void b2(View view, Matrix matrix) {
        if (W) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                W = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void c2(View view, Matrix matrix) {
        if (X) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                X = false;
            }
        }
    }
}
