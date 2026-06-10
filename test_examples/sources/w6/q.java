package w6;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f18471a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18472b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18473d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f18474e;

    /* renamed from: f  reason: collision with root package name */
    public final String f18475f;

    public q(long[] jArr, boolean z10, long j2, boolean z11, boolean z12, String str) {
        this.f18471a = jArr;
        this.f18472b = z10;
        this.c = j2;
        this.f18473d = z11;
        this.f18474e = z12;
        this.f18475f = str;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLongArray("filtered_folder_ids", this.f18471a);
        bundle.putBoolean("is_dismissible", this.f18472b);
        bundle.putLong("selected_folder_id", this.c);
        bundle.putBoolean("is_none_enabled", this.f18473d);
        bundle.putBoolean("is_main_interface", this.f18474e);
        bundle.putString("title", this.f18475f);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_filteredFragment_to_selectFolderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return v7.g.a(this.f18471a, qVar.f18471a) && this.f18472b == qVar.f18472b && this.c == qVar.c && this.f18473d == qVar.f18473d && this.f18474e == qVar.f18474e && v7.g.a(this.f18475f, qVar.f18475f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f18471a) * 31;
        int i10 = 1;
        boolean z10 = this.f18472b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        long j2 = this.c;
        int i12 = (((hashCode + i11) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z11 = this.f18473d;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.f18474e;
        if (!z12) {
            i10 = z12 ? 1 : 0;
        }
        int i15 = (i14 + i10) * 31;
        String str = this.f18475f;
        return i15 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18471a);
        return "ActionFilteredFragmentToSelectFolderDialogFragment(filteredFolderIds=" + arrays + ", isDismissible=" + this.f18472b + ", selectedFolderId=" + this.c + ", isNoneEnabled=" + this.f18473d + ", isMainInterface=" + this.f18474e + ", title=" + this.f18475f + ")";
    }
}
