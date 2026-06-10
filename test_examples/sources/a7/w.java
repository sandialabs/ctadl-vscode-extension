package a7;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class w implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f364a;

    /* renamed from: b  reason: collision with root package name */
    public final long f365b;

    public w(long j2, long j10) {
        this.f364a = j2;
        this.f365b = j10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f364a);
        bundle.putLong("label_id", this.f365b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteFragment_to_newLabelDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return this.f364a == wVar.f364a && this.f365b == wVar.f365b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f364a;
        long j10 = this.f365b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteFragmentToNewLabelDialogFragment(folderId=");
        sb.append(this.f364a);
        sb.append(", labelId=");
        return androidx.activity.e.i(sb, this.f365b, ")");
    }
}
