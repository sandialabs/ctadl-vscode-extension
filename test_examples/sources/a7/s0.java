package a7;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f343a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f344b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f345d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f346e;

    /* renamed from: f  reason: collision with root package name */
    public final String f347f;

    public s0(long[] jArr, boolean z10, long j2, boolean z11, boolean z12, String str) {
        this.f343a = jArr;
        this.f344b = z10;
        this.c = j2;
        this.f345d = z11;
        this.f346e = z12;
        this.f347f = str;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLongArray("filtered_folder_ids", this.f343a);
        bundle.putBoolean("is_dismissible", this.f344b);
        bundle.putLong("selected_folder_id", this.c);
        bundle.putBoolean("is_none_enabled", this.f345d);
        bundle.putBoolean("is_main_interface", this.f346e);
        bundle.putString("title", this.f347f);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteSelectionDialogFragment_to_selectFolderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            return v7.g.a(this.f343a, s0Var.f343a) && this.f344b == s0Var.f344b && this.c == s0Var.c && this.f345d == s0Var.f345d && this.f346e == s0Var.f346e && v7.g.a(this.f347f, s0Var.f347f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f343a) * 31;
        int i10 = 1;
        boolean z10 = this.f344b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        long j2 = this.c;
        int i12 = (((hashCode + i11) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z11 = this.f345d;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.f346e;
        if (!z12) {
            i10 = z12 ? 1 : 0;
        }
        int i15 = (i14 + i10) * 31;
        String str = this.f347f;
        return i15 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f343a);
        return "ActionNoteSelectionDialogFragmentToSelectFolderDialogFragment(filteredFolderIds=" + arrays + ", isDismissible=" + this.f344b + ", selectedFolderId=" + this.c + ", isNoneEnabled=" + this.f345d + ", isMainInterface=" + this.f346e + ", title=" + this.f347f + ")";
    }
}
