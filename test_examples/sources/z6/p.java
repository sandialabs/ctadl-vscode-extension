package z6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class p implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f19158a;

    public p() {
        this(-1L);
    }

    public p(long j2) {
        this.f19158a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f19158a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_mainFragment_to_folderFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f19158a == ((p) obj).f19158a;
    }

    public final int hashCode() {
        long j2 = this.f19158a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionMainFragmentToFolderFragment(folderId="), this.f19158a, ")");
    }
}
