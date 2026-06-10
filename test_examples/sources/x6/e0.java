package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class e0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18675a;

    public e0() {
        this(-1L);
    }

    public e0(long j2) {
        this.f18675a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18675a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_newFolderFragment_to_folderFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.f18675a == ((e0) obj).f18675a;
    }

    public final int hashCode() {
        long j2 = this.f18675a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionNewFolderFragmentToFolderFragment(folderId="), this.f18675a, ")");
    }
}
