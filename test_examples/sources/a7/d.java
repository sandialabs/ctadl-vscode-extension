package a7;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f277a;

    /* renamed from: b  reason: collision with root package name */
    public final long f278b;
    public final long[] c;

    public d(long j2, long j10, long[] jArr) {
        this.f277a = j2;
        this.f278b = j10;
        this.c = jArr;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f277a);
        bundle.putLong("note_id", this.f278b);
        bundle.putLongArray("selected_note_ids", this.c);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteDialogFragment_to_notePagerFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f277a == dVar.f277a && this.f278b == dVar.f278b && v7.g.a(this.c, dVar.c);
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f277a;
        long j10 = this.f278b;
        return Arrays.hashCode(this.c) + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.c);
        return "ActionNoteDialogFragmentToNotePagerFragment(folderId=" + this.f277a + ", noteId=" + this.f278b + ", selectedNoteIds=" + arrays + ")";
    }
}
