package a7;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class v implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f360a;

    public v() {
        this(false);
    }

    public v(boolean z10) {
        this.f360a = z10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("exit", this.f360a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteFragment_to_mainFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f360a == ((v) obj).f360a;
    }

    public final int hashCode() {
        boolean z10 = this.f360a;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return "ActionNoteFragmentToMainFragment(exit=" + this.f360a + ")";
    }
}
