package x6;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18726a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18727b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18728d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f18729e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f18730f;

    public x(long j2, long j10, boolean z10, boolean z11, long[] jArr) {
        v7.g.f(jArr, "selectedNoteIds");
        this.f18726a = j2;
        this.f18727b = j10;
        this.c = R.id.folderFragment;
        this.f18728d = z10;
        this.f18729e = z11;
        this.f18730f = jArr;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18726a);
        bundle.putLong("note_id", this.f18727b);
        bundle.putInt("destination", this.c);
        bundle.putBoolean("is_selection_enabled", this.f18728d);
        bundle.putBoolean("is_select_all_enabled", this.f18729e);
        bundle.putLongArray("selected_note_ids", this.f18730f);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_noteDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f18726a == xVar.f18726a && this.f18727b == xVar.f18727b && this.c == xVar.c && this.f18728d == xVar.f18728d && this.f18729e == xVar.f18729e && v7.g.a(this.f18730f, xVar.f18730f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f18726a;
        long j10 = this.f18727b;
        int i10 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.c) * 31;
        int i11 = 1;
        boolean z10 = this.f18728d;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        int i13 = (i10 + i12) * 31;
        boolean z11 = this.f18729e;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f18730f) + ((i13 + i11) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18730f);
        return "ActionFolderFragmentToNoteDialogFragment(folderId=" + this.f18726a + ", noteId=" + this.f18727b + ", destination=" + this.c + ", isSelectionEnabled=" + this.f18728d + ", isSelectAllEnabled=" + this.f18729e + ", selectedNoteIds=" + arrays + ")";
    }
}
