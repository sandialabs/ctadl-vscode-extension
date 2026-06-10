package x6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class c implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18659a;

    public c() {
        this(0L);
    }

    public c(long j2) {
        this.f18659a = j2;
    }

    public static final c fromBundle(Bundle bundle) {
        long j2;
        if (a4.b.u(bundle, "bundle", c.class, "folder_id")) {
            j2 = bundle.getLong("folder_id");
        } else {
            j2 = 0;
        }
        return new c(j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f18659a == ((c) obj).f18659a;
    }

    public final int hashCode() {
        long j2 = this.f18659a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("FolderArchiveFragmentArgs(folderId="), this.f18659a, ")");
    }
}
