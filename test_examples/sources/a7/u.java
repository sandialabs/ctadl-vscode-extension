package a7;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class u implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f356a;

    /* renamed from: b  reason: collision with root package name */
    public final long f357b;

    public u(long j2, long j10) {
        this.f356a = j2;
        this.f357b = j10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f356a);
        bundle.putLong("label_id", this.f357b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteFragment_to_labelDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f356a == uVar.f356a && this.f357b == uVar.f357b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f356a;
        long j10 = this.f357b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteFragmentToLabelDialogFragment(folderId=");
        sb.append(this.f356a);
        sb.append(", labelId=");
        return androidx.activity.e.i(sb, this.f357b, ")");
    }
}
