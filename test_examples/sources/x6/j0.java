package x6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class j0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18691a;

    public j0(long j2) {
        this.f18691a = j2;
    }

    public static final j0 fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", j0.class, "folder_id")) {
            return new j0(bundle.getLong("folder_id"));
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f18691a == ((j0) obj).f18691a;
    }

    public final int hashCode() {
        long j2 = this.f18691a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("NoteListFilteringDialogFragmentArgs(folderId="), this.f18691a, ")");
    }
}
