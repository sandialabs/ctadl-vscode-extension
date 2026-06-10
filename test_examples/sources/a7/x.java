package a7;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f374a;

    /* renamed from: b  reason: collision with root package name */
    public final long f375b;
    public final int c = R.id.folderFragment;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f376d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f377e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f378f;

    public x(long j2, long j10, boolean z10, boolean z11, long[] jArr) {
        this.f374a = j2;
        this.f375b = j10;
        this.f376d = z10;
        this.f377e = z11;
        this.f378f = jArr;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f374a);
        bundle.putLong("note_id", this.f375b);
        bundle.putInt("destination", this.c);
        bundle.putBoolean("is_selection_enabled", this.f376d);
        bundle.putBoolean("is_select_all_enabled", this.f377e);
        bundle.putLongArray("selected_note_ids", this.f378f);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteFragment_to_noteDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f374a == xVar.f374a && this.f375b == xVar.f375b && this.c == xVar.c && this.f376d == xVar.f376d && this.f377e == xVar.f377e && v7.g.a(this.f378f, xVar.f378f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f374a;
        long j10 = this.f375b;
        int i10 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.c) * 31;
        int i11 = 1;
        boolean z10 = this.f376d;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        int i13 = (i10 + i12) * 31;
        boolean z11 = this.f377e;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f378f) + ((i13 + i11) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f378f);
        return "ActionNoteFragmentToNoteDialogFragment(folderId=" + this.f374a + ", noteId=" + this.f375b + ", destination=" + this.c + ", isSelectionEnabled=" + this.f376d + ", isSelectAllEnabled=" + this.f377e + ", selectedNoteIds=" + arrays + ")";
    }
}
