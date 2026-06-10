package x2;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import com.noto.R;
import v7.g;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f18575a;

    public b(Activity activity) {
        g.f(activity, "activity");
        this.f18575a = activity;
    }

    public void a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.f18575a.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        b(theme, typedValue);
    }

    public final void b(Resources.Theme theme, TypedValue typedValue) {
        int i10;
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i10 = typedValue.resourceId) == 0) {
            return;
        }
        this.f18575a.setTheme(i10);
    }
}
