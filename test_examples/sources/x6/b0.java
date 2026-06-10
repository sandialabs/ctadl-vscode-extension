package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class b0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18657a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18658b;

    public b0(long j2, long j10) {
        this.f18657a = j2;
        this.f18658b = j10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18657a);
        bundle.putLong("note_id", this.f18658b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_noteReminderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return this.f18657a == b0Var.f18657a && this.f18658b == b0Var.f18658b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f18657a;
        long j10 = this.f18658b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionFolderFragmentToNoteReminderDialogFragment(folderId=");
        sb.append(this.f18657a);
        sb.append(", noteId=");
        return androidx.activity.e.i(sb, this.f18658b, ")");
    }
}
