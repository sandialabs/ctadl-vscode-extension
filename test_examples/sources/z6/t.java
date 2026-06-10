package z6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class t implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f19162a;

    public t() {
        this(0L);
    }

    public t(long j2) {
        this.f19162a = j2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f19162a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_mainVaultFragment_to_folderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f19162a == ((t) obj).f19162a;
    }

    public final int hashCode() {
        long j2 = this.f19162a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return androidx.activity.e.i(new StringBuilder("ActionMainVaultFragmentToFolderDialogFragment(folderId="), this.f19162a, ")");
    }
}
