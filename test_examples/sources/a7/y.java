package a7;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f386a;

    /* renamed from: b  reason: collision with root package name */
    public final long f387b;
    public final long[] c;

    public y(long j2, long j10, long[] jArr) {
        this.f386a = j2;
        this.f387b = j10;
        this.c = jArr;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f386a);
        bundle.putLong("note_id", this.f387b);
        bundle.putLongArray("selected_note_ids", this.c);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteFragment_to_notePagerFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return this.f386a == yVar.f386a && this.f387b == yVar.f387b && v7.g.a(this.c, yVar.c);
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f386a;
        long j10 = this.f387b;
        return Arrays.hashCode(this.c) + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.c);
        return "ActionNoteFragmentToNotePagerFragment(folderId=" + this.f386a + ", noteId=" + this.f387b + ", selectedNoteIds=" + arrays + ")";
    }
}
