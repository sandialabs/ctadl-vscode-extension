package b;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import b.a;
import v7.g;

/* loaded from: classes.dex */
public final class b extends a<String[], Uri> {
    @Override // b.a
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        g.f(componentActivity, "context");
        g.f(strArr, "input");
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        g.e(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
        return type;
    }

    @Override // b.a
    public final a.C0051a b(ComponentActivity componentActivity, Object obj) {
        g.f(componentActivity, "context");
        g.f((String[]) obj, "input");
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
