package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class z implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18738a;

    public z(long j2) {
        this.f18738a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18738a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_noteListViewDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f18738a == ((z) obj).f18738a;
    }

    public final int hashCode() {
        long j2 = this.f18738a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionFolderFragmentToNoteListViewDialogFragment(folderId="), this.f18738a, ")");
    }
}
