package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class w implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18724a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18725b;

    public w(long j2, long j10) {
        this.f18724a = j2;
        this.f18725b = j10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18724a);
        bundle.putLong("label_id", this.f18725b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_newLabelDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return this.f18724a == wVar.f18724a && this.f18725b == wVar.f18725b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f18724a;
        long j10 = this.f18725b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionFolderFragmentToNewLabelDialogFragment(folderId=");
        sb.append(this.f18724a);
        sb.append(", labelId=");
        return androidx.activity.e.i(sb, this.f18725b, ")");
    }
}
