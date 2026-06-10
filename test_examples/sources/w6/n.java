package w6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class n implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18458a;

    public n() {
        this(false);
    }

    public n(boolean z10) {
        this.f18458a = z10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("exit", this.f18458a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_filteredFragment_to_mainFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f18458a == ((n) obj).f18458a;
    }

    public final int hashCode() {
        boolean z10 = this.f18458a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return "ActionFilteredFragmentToMainFragment(exit=" + this.f18458a + ")";
    }
}
