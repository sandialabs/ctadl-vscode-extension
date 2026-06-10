package x6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class k0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18694a;

    public k0(long j2) {
        this.f18694a = j2;
    }

    public static final k0 fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", k0.class, "folder_id")) {
            return new k0(bundle.getLong("folder_id"));
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.f18694a == ((k0) obj).f18694a;
    }

    public final int hashCode() {
        long j2 = this.f18694a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("NoteListGroupingDialogFragmentArgs(folderId="), this.f18694a, ")");
    }
}
