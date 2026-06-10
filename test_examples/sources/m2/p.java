package m2;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public o f15958a;

    public void a(Bundle bundle) {
        String c = c();
        if (c != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
        }
    }

    public abstract void b(q qVar);

    public abstract String c();
}
