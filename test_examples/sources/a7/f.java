package a7;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f285a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f286b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f287d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f288e;

    /* renamed from: f  reason: collision with root package name */
    public final String f289f;

    public f(long[] jArr, boolean z10, long j2, boolean z11, boolean z12, String str) {
        this.f285a = jArr;
        this.f286b = z10;
        this.c = j2;
        this.f287d = z11;
        this.f288e = z12;
        this.f289f = str;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLongArray("filtered_folder_ids", this.f285a);
        bundle.putBoolean("is_dismissible", this.f286b);
        bundle.putLong("selected_folder_id", this.c);
        bundle.putBoolean("is_none_enabled", this.f287d);
        bundle.putBoolean("is_main_interface", this.f288e);
        bundle.putString("title", this.f289f);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteDialogFragment_to_selectFolderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return v7.g.a(this.f285a, fVar.f285a) && this.f286b == fVar.f286b && this.c == fVar.c && this.f287d == fVar.f287d && this.f288e == fVar.f288e && v7.g.a(this.f289f, fVar.f289f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f285a) * 31;
        int i10 = 1;
        boolean z10 = this.f286b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        long j2 = this.c;
        int i12 = (((hashCode + i11) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z11 = this.f287d;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.f288e;
        if (!z12) {
            i10 = z12 ? 1 : 0;
        }
        int i15 = (i14 + i10) * 31;
        String str = this.f289f;
        return i15 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f285a);
        return "ActionNoteDialogFragmentToSelectFolderDialogFragment(filteredFolderIds=" + arrays + ", isDismissible=" + this.f286b + ", selectedFolderId=" + this.c + ", isNoneEnabled=" + this.f287d + ", isMainInterface=" + this.f288e + ", title=" + this.f289f + ")";
    }
}
