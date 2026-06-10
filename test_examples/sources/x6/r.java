package x6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18713a;

    public r() {
        this(-1L);
    }

    public r(long j2) {
        this.f18713a = j2;
    }

    public static final r fromBundle(Bundle bundle) {
        long j2;
        if (a4.b.u(bundle, "bundle", r.class, "folder_id")) {
            j2 = bundle.getLong("folder_id");
        } else {
            j2 = -1;
        }
        return new r(j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f18713a == ((r) obj).f18713a;
    }

    public final int hashCode() {
        long j2 = this.f18713a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("FolderFragmentArgs(folderId="), this.f18713a, ")");
    }
}
