package h4;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class b0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f11378a;

    public b0(View view) {
        this.f11378a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && ((b0) obj).f11378a.equals(this.f11378a);
    }

    public final int hashCode() {
        return this.f11378a.hashCode();
    }
}
