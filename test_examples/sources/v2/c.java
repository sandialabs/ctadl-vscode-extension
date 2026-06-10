package v2;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* loaded from: classes.dex */
public final class c {
    public static final void a(Bundle bundle, String str, Size size) {
        v7.g.f(bundle, "bundle");
        v7.g.f(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        v7.g.f(bundle, "bundle");
        v7.g.f(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
