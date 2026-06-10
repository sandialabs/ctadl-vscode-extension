package x6;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18653a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18654b;
    public final long[] c;

    public a0(long j2, long j10, long[] jArr) {
        v7.g.f(jArr, "selectedNoteIds");
        this.f18653a = j2;
        this.f18654b = j10;
        this.c = jArr;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18653a);
        bundle.putLong("note_id", this.f18654b);
        bundle.putLongArray("selected_note_ids", this.c);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_notePagerFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return this.f18653a == a0Var.f18653a && this.f18654b == a0Var.f18654b && v7.g.a(this.c, a0Var.c);
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f18653a;
        long j10 = this.f18654b;
        return Arrays.hashCode(this.c) + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.c);
        return "ActionFolderFragmentToNotePagerFragment(folderId=" + this.f18653a + ", noteId=" + this.f18654b + ", selectedNoteIds=" + arrays + ")";
    }
}
