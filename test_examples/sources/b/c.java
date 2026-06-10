package b;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.activity.ComponentActivity;
import b.a;
import v7.g;

/* loaded from: classes.dex */
public final class c extends a<Uri, Uri> {
    @Override // b.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Uri uri = (Uri) obj;
        g.f(componentActivity, "context");
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        if (Build.VERSION.SDK_INT >= 26 && uri != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        return intent;
    }

    @Override // b.a
    public final a.C0051a b(ComponentActivity componentActivity, Object obj) {
        Uri uri = (Uri) obj;
        g.f(componentActivity, "context");
        return null;
    }

    @Override // b.a
    public final Object c(Intent intent, int i10) {
        if (!(i10 == -1)) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
