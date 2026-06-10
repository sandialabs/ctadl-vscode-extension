package x6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class m0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18700a;

    public m0(long j2) {
        this.f18700a = j2;
    }

    public static final m0 fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", m0.class, "folder_id")) {
            return new m0(bundle.getLong("folder_id"));
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.f18700a == ((m0) obj).f18700a;
    }

    public final int hashCode() {
        long j2 = this.f18700a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("NoteListSortingDialogFragmentArgs(folderId="), this.f18700a, ")");
    }
}
