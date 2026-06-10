package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class h implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18682a;

    public h() {
        this(0L);
    }

    public h(long j2) {
        this.f18682a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18682a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderDialogFragment_to_newFolderFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f18682a == ((h) obj).f18682a;
    }

    public final int hashCode() {
        long j2 = this.f18682a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionFolderDialogFragmentToNewFolderFragment(folderId="), this.f18682a, ")");
    }
}
