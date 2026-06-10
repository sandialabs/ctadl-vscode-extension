package a7;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class e implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f281a;

    /* renamed from: b  reason: collision with root package name */
    public final long f282b;

    public e(long j2, long j10) {
        this.f281a = j2;
        this.f282b = j10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f281a);
        bundle.putLong("note_id", this.f282b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteDialogFragment_to_noteReminderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f281a == eVar.f281a && this.f282b == eVar.f282b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f281a;
        long j10 = this.f282b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteDialogFragmentToNoteReminderDialogFragment(folderId=");
        sb.append(this.f281a);
        sb.append(", noteId=");
        return androidx.activity.e.i(sb, this.f282b, ")");
    }
}
