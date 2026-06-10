package z6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class q implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f19159a;

    public q() {
        this(0L);
    }

    public q(long j2) {
        this.f19159a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f19159a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_mainFragment_to_newFolderFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f19159a == ((q) obj).f19159a;
    }

    public final int hashCode() {
        long j2 = this.f19159a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionMainFragmentToNewFolderFragment(folderId="), this.f19159a, ")");
    }
}
