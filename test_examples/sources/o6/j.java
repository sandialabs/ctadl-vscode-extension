package o6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class j implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f16373a;

    public j(String str) {
        this.f16373a = str;
    }

    public static final j fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", j.class, "title")) {
            String string = bundle.getString("title");
            if (string != null) {
                return new j(string);
            }
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && v7.g.a(this.f16373a, ((j) obj).f16373a);
    }

    public final int hashCode() {
        return this.f16373a.hashCode();
    }

    public final String toString() {
        return androidx.activity.e.k(new StringBuilder("ProgressIndicatorDialogFragmentArgs(title="), this.f16373a, ")");
    }
}
