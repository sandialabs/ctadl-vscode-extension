package a3;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class y0 {
    public static void a(Window window, boolean z10) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
