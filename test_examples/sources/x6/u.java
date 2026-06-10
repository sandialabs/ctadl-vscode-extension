package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class u implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18721a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18722b;

    public u(long j2, long j10) {
        this.f18721a = j2;
        this.f18722b = j10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18721a);
        bundle.putLong("label_id", this.f18722b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_labelDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f18721a == uVar.f18721a && this.f18722b == uVar.f18722b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f18721a;
        long j10 = this.f18722b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionFolderFragmentToLabelDialogFragment(folderId=");
        sb.append(this.f18721a);
        sb.append(", labelId=");
        return androidx.activity.e.i(sb, this.f18722b, ")");
    }
}
