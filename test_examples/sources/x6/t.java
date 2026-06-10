package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class t implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18720a;

    public t() {
        this(0L);
    }

    public t(long j2) {
        this.f18720a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18720a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_folderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f18720a == ((t) obj).f18720a;
    }

    public final int hashCode() {
        long j2 = this.f18720a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionFolderFragmentToFolderDialogFragment(folderId="), this.f18720a, ")");
    }
}
