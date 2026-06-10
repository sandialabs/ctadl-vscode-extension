package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class v implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18723a;

    public v() {
        this(false);
    }

    public v(boolean z10) {
        this.f18723a = z10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("exit", this.f18723a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_mainFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f18723a == ((v) obj).f18723a;
    }

    public final int hashCode() {
        boolean z10 = this.f18723a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return "ActionFolderFragmentToMainFragment(exit=" + this.f18723a + ")";
    }
}
