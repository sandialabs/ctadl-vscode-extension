package x6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class n0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18703a;

    public n0(long j2) {
        this.f18703a = j2;
    }

    public static final n0 fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", n0.class, "folder_id")) {
            return new n0(bundle.getLong("folder_id"));
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.f18703a == ((n0) obj).f18703a;
    }

    public final int hashCode() {
        long j2 = this.f18703a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("NoteListViewDialogFragmentArgs(folderId="), this.f18703a, ")");
    }
}
