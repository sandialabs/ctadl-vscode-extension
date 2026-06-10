package a7;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f339a;

    /* renamed from: b  reason: collision with root package name */
    public final long f340b;
    public final long[] c;

    public r0(long j2, long j10, long[] jArr) {
        this.f339a = j2;
        this.f340b = j10;
        this.c = jArr;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f339a);
        bundle.putLong("note_id", this.f340b);
        bundle.putLongArray("selected_note_ids", this.c);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteSelectionDialogFragment_to_notePagerFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            return this.f339a == r0Var.f339a && this.f340b == r0Var.f340b && v7.g.a(this.c, r0Var.c);
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f339a;
        long j10 = this.f340b;
        return Arrays.hashCode(this.c) + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.c);
        return "ActionNoteSelectionDialogFragmentToNotePagerFragment(folderId=" + this.f339a + ", noteId=" + this.f340b + ", selectedNoteIds=" + arrays + ")";
    }
}
