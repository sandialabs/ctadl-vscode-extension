package z6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class u implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f19163a;

    public u() {
        this(-1L);
    }

    public u(long j2) {
        this.f19163a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f19163a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_mainVaultFragment_to_folderFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f19163a == ((u) obj).f19163a;
    }

    public final int hashCode() {
        long j2 = this.f19163a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionMainVaultFragmentToFolderFragment(folderId="), this.f19163a, ")");
    }
}
