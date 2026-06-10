package x6;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18662a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18663b;
    public final int c = R.id.folderArchiveFragment;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18664d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f18665e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f18666f;

    public d(long j2, long j10, boolean z10, boolean z11, long[] jArr) {
        this.f18662a = j2;
        this.f18663b = j10;
        this.f18664d = z10;
        this.f18665e = z11;
        this.f18666f = jArr;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18662a);
        bundle.putLong("note_id", this.f18663b);
        bundle.putInt("destination", this.c);
        bundle.putBoolean("is_selection_enabled", this.f18664d);
        bundle.putBoolean("is_select_all_enabled", this.f18665e);
        bundle.putLongArray("selected_note_ids", this.f18666f);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderArchiveFragment_to_noteDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f18662a == dVar.f18662a && this.f18663b == dVar.f18663b && this.c == dVar.c && this.f18664d == dVar.f18664d && this.f18665e == dVar.f18665e && v7.g.a(this.f18666f, dVar.f18666f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f18662a;
        long j10 = this.f18663b;
        int i10 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.c) * 31;
        int i11 = 1;
        boolean z10 = this.f18664d;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        int i13 = (i10 + i12) * 31;
        boolean z11 = this.f18665e;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f18666f) + ((i13 + i11) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18666f);
        return "ActionFolderArchiveFragmentToNoteDialogFragment(folderId=" + this.f18662a + ", noteId=" + this.f18663b + ", destination=" + this.c + ", isSelectionEnabled=" + this.f18664d + ", isSelectAllEnabled=" + this.f18665e + ", selectedNoteIds=" + arrays + ")";
    }
}
