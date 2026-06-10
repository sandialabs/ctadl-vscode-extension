package x6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class f implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18676a;

    public f() {
        this(0L);
    }

    public f(long j2) {
        this.f18676a = j2;
    }

    public static final f fromBundle(Bundle bundle) {
        long j2;
        if (a4.b.u(bundle, "bundle", f.class, "folder_id")) {
            j2 = bundle.getLong("folder_id");
        } else {
            j2 = 0;
        }
        return new f(j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f18676a == ((f) obj).f18676a;
    }

    public final int hashCode() {
        long j2 = this.f18676a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("FolderDialogFragmentArgs(folderId="), this.f18676a, ")");
    }
}
