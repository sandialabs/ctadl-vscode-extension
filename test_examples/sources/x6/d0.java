package x6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class d0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18667a;

    public d0() {
        this(0L);
    }

    public d0(long j2) {
        this.f18667a = j2;
    }

    public static final d0 fromBundle(Bundle bundle) {
        long j2;
        if (a4.b.u(bundle, "bundle", d0.class, "folder_id")) {
            j2 = bundle.getLong("folder_id");
        } else {
            j2 = 0;
        }
        return new d0(j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && this.f18667a == ((d0) obj).f18667a;
    }

    public final int hashCode() {
        long j2 = this.f18667a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("NewFolderFragmentArgs(folderId="), this.f18667a, ")");
    }
}
