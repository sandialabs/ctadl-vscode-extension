package w6;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18459a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18460b;
    public final int c = R.id.folderFragment;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18461d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f18462e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f18463f;

    public o(long j2, long j10, boolean z10, boolean z11, long[] jArr) {
        this.f18459a = j2;
        this.f18460b = j10;
        this.f18461d = z10;
        this.f18462e = z11;
        this.f18463f = jArr;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18459a);
        bundle.putLong("note_id", this.f18460b);
        bundle.putInt("destination", this.c);
        bundle.putBoolean("is_selection_enabled", this.f18461d);
        bundle.putBoolean("is_select_all_enabled", this.f18462e);
        bundle.putLongArray("selected_note_ids", this.f18463f);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_filteredFragment_to_noteDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f18459a == oVar.f18459a && this.f18460b == oVar.f18460b && this.c == oVar.c && this.f18461d == oVar.f18461d && this.f18462e == oVar.f18462e && v7.g.a(this.f18463f, oVar.f18463f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f18459a;
        long j10 = this.f18460b;
        int i10 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.c) * 31;
        int i11 = 1;
        boolean z10 = this.f18461d;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        int i13 = (i10 + i12) * 31;
        boolean z11 = this.f18462e;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f18463f) + ((i13 + i11) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18463f);
        return "ActionFilteredFragmentToNoteDialogFragment(folderId=" + this.f18459a + ", noteId=" + this.f18460b + ", destination=" + this.c + ", isSelectionEnabled=" + this.f18461d + ", isSelectAllEnabled=" + this.f18462e + ", selectedNoteIds=" + arrays + ")";
    }
}
