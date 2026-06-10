package y6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class f implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18905a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18906b;

    public f(long j2, long j10) {
        this.f18905a = j2;
        this.f18906b = j10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18905a);
        bundle.putLong("label_id", this.f18906b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_labelDialogFragment_to_reorderLabelDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f18905a == fVar.f18905a && this.f18906b == fVar.f18906b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f18905a;
        long j10 = this.f18906b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionLabelDialogFragmentToReorderLabelDialogFragment(folderId=");
        sb.append(this.f18905a);
        sb.append(", labelId=");
        return androidx.activity.e.i(sb, this.f18906b, ")");
    }
}
