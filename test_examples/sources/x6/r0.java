package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class r0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18714a;

    public r0(long j2) {
        this.f18714a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18714a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteListViewDialogFragment_to_noteListSortingDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && this.f18714a == ((r0) obj).f18714a;
    }

    public final int hashCode() {
        long j2 = this.f18714a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionNoteListViewDialogFragmentToNoteListSortingDialogFragment(folderId="), this.f18714a, ")");
    }
}
