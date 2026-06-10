package x6;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18660a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f18661b;

    public c0(long j2, long[] jArr) {
        this.f18660a = j2;
        this.f18661b = jArr;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18660a);
        bundle.putLongArray("selected_note_ids", this.f18661b);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_noteSelectionDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.f18660a == c0Var.f18660a && v7.g.a(this.f18661b, c0Var.f18661b);
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f18660a;
        return Arrays.hashCode(this.f18661b) + (((int) (j2 ^ (j2 >>> 32))) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18661b);
        return "ActionFolderFragmentToNoteSelectionDialogFragment(folderId=" + this.f18660a + ", selectedNoteIds=" + arrays + ")";
    }
}
