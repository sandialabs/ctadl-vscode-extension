package z6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class m implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19155a;

    public m() {
        this(false);
    }

    public m(boolean z10) {
        this.f19155a = z10;
    }

    public static final m fromBundle(Bundle bundle) {
        boolean z10;
        if (a4.b.u(bundle, "bundle", m.class, "exit")) {
            z10 = bundle.getBoolean("exit");
        } else {
            z10 = false;
        }
        return new m(z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f19155a == ((m) obj).f19155a;
    }

    public final int hashCode() {
        boolean z10 = this.f19155a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return "MainFragmentArgs(exit=" + this.f19155a + ")";
    }
}
