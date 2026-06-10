package e1;

import android.view.KeyEvent;
import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final KeyEvent f10599a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (!g.a(this.f10599a, ((b) obj).f10599a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10599a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f10599a + ')';
    }
}
