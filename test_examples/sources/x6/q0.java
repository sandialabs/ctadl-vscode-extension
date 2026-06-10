package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class q0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18711a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18712b;

    public q0(long j2, boolean z10) {
        this.f18711a = j2;
        this.f18712b = z10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18711a);
        bundle.putBoolean("is_sorting", this.f18712b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteListViewDialogFragment_to_noteListOrderingDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            return this.f18711a == q0Var.f18711a && this.f18712b == q0Var.f18712b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f18711a;
        int i10 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        boolean z10 = this.f18712b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        return i10 + i11;
    }

    public final String toString() {
        return "ActionNoteListViewDialogFragmentToNoteListOrderingDialogFragment(folderId=" + this.f18711a + ", isSorting=" + this.f18712b + ")";
    }
}
