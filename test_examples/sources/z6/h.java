package z6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class h implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f19147a;

    public h() {
        this(0L);
    }

    public h(long j2) {
        this.f19147a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f19147a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_mainArchiveFragment_to_folderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f19147a == ((h) obj).f19147a;
    }

    public final int hashCode() {
        long j2 = this.f19147a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionMainArchiveFragmentToFolderDialogFragment(folderId="), this.f19147a, ")");
    }
}
