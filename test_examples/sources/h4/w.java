package h4;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class w extends v {
    public static boolean Y = true;

    @Override // a1.c
    @SuppressLint({"NewApi"})
    public void u1(View view, int i10, int i11, int i12, int i13) {
        if (Y) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                Y = false;
            }
        }
    }
}
