package a7;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class t0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f355a;

    public t0(long j2) {
        this.f355a = j2;
    }

    public static final t0 fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", t0.class, "folder_id")) {
            return new t0(bundle.getLong("folder_id"));
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && this.f355a == ((t0) obj).f355a;
    }

    public final int hashCode() {
        long j2 = this.f355a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("QuickNoteDialogFragmentArgs(folderId="), this.f355a, ")");
    }
}
