package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class o0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18706a;

    public o0(long j2) {
        this.f18706a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18706a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteListViewDialogFragment_to_noteListFilteringDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.f18706a == ((o0) obj).f18706a;
    }

    public final int hashCode() {
        long j2 = this.f18706a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionNoteListViewDialogFragmentToNoteListFilteringDialogFragment(folderId="), this.f18706a, ")");
    }
}
