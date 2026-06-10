package c7;

import android.os.Bundle;
import androidx.navigation.o;
import com.noto.R;
import java.util.Arrays;
import v7.g;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f6548a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6549b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6550d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6551e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6552f;

    public a(long[] jArr, boolean z10, long j2, boolean z11, boolean z12, String str) {
        this.f6548a = jArr;
        this.f6549b = z10;
        this.c = j2;
        this.f6550d = z11;
        this.f6551e = z12;
        this.f6552f = str;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLongArray("filtered_folder_ids", this.f6548a);
        bundle.putBoolean("is_dismissible", this.f6549b);
        bundle.putLong("selected_folder_id", this.c);
        bundle.putBoolean("is_none_enabled", this.f6550d);
        bundle.putBoolean("is_main_interface", this.f6551e);
        bundle.putString("title", this.f6552f);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_generalSettingsFragment_to_selectFolderDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return g.a(this.f6548a, aVar.f6548a) && this.f6549b == aVar.f6549b && this.c == aVar.c && this.f6550d == aVar.f6550d && this.f6551e == aVar.f6551e && g.a(this.f6552f, aVar.f6552f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f6548a) * 31;
        int i10 = 1;
        boolean z10 = this.f6549b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        long j2 = this.c;
        int i12 = (((hashCode + i11) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z11 = this.f6550d;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.f6551e;
        if (!z12) {
            i10 = z12 ? 1 : 0;
        }
        int i15 = (i14 + i10) * 31;
        String str = this.f6552f;
        return i15 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f6548a);
        return "ActionGeneralSettingsFragmentToSelectFolderDialogFragment(filteredFolderIds=" + arrays + ", isDismissible=" + this.f6549b + ", selectedFolderId=" + this.c + ", isNoneEnabled=" + this.f6550d + ", isMainInterface=" + this.f6551e + ", title=" + this.f6552f + ")";
    }
}
