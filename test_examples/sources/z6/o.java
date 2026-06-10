package z6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class o implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f19157a;

    public o() {
        this(0L);
    }

    public o(long j2) {
        this.f19157a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f19157a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_mainFragment_to_folderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f19157a == ((o) obj).f19157a;
    }

    public final int hashCode() {
        long j2 = this.f19157a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionMainFragmentToFolderDialogFragment(folderId="), this.f19157a, ")");
    }
}
