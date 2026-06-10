package a7;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class z implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f388a;

    /* renamed from: b  reason: collision with root package name */
    public final long f389b;

    public z(long j2, long j10) {
        this.f388a = j2;
        this.f389b = j10;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f388a);
        bundle.putLong("note_id", this.f389b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteFragment_to_noteReminderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return this.f388a == zVar.f388a && this.f389b == zVar.f389b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f388a;
        long j10 = this.f389b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteFragmentToNoteReminderDialogFragment(folderId=");
        sb.append(this.f388a);
        sb.append(", noteId=");
        return androidx.activity.e.i(sb, this.f389b, ")");
    }
}
