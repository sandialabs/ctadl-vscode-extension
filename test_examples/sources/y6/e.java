package y6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class e implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18903a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18904b;

    public e(long j2, long j10) {
        this.f18903a = j2;
        this.f18904b = j10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18903a);
        bundle.putLong("label_id", this.f18904b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_labelDialogFragment_to_newLabelDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f18903a == eVar.f18903a && this.f18904b == eVar.f18904b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f18903a;
        long j10 = this.f18904b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionLabelDialogFragmentToNewLabelDialogFragment(folderId=");
        sb.append(this.f18903a);
        sb.append(", labelId=");
        return androidx.activity.e.i(sb, this.f18904b, ")");
    }
}
