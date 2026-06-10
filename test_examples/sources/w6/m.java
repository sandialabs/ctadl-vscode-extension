package w6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class m implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18457a;

    public m() {
        this(-1L);
    }

    public m(long j2) {
        this.f18457a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18457a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_filteredFragment_to_folderFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f18457a == ((m) obj).f18457a;
    }

    public final int hashCode() {
        long j2 = this.f18457a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionFilteredFragmentToFolderFragment(folderId="), this.f18457a, ")");
    }
}
