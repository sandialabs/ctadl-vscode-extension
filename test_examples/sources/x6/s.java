package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class s implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18715a;

    public s() {
        this(0L);
    }

    public s(long j2) {
        this.f18715a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18715a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_folderArchiveFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f18715a == ((s) obj).f18715a;
    }

    public final int hashCode() {
        long j2 = this.f18715a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionFolderFragmentToFolderArchiveFragment(folderId="), this.f18715a, ")");
    }
}
