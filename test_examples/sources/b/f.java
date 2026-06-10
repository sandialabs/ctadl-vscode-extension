package b;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import v7.g;

/* loaded from: classes.dex */
public final class f extends a<Intent, androidx.activity.result.a> {
    @Override // b.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        g.f(componentActivity, "context");
        g.f(intent, "input");
        return intent;
    }

    @Override // b.a
    public final Object c(Intent intent, int i10) {
        return new androidx.activity.result.a(intent, i10);
    }
}
