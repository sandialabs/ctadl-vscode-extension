package z6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class i implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f19148a;

    public i() {
        this(-1L);
    }

    public i(long j2) {
        this.f19148a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f19148a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_mainArchiveFragment_to_folderFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f19148a == ((i) obj).f19148a;
    }

    public final int hashCode() {
        long j2 = this.f19148a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionMainArchiveFragmentToFolderFragment(folderId="), this.f19148a, ")");
    }
}
