package z6;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f19128a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19129b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19130d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f19131e;

    /* renamed from: f  reason: collision with root package name */
    public final String f19132f;

    public c0(long[] jArr, boolean z10, long j2, boolean z11, boolean z12, String str) {
        this.f19128a = jArr;
        this.f19129b = z10;
        this.c = j2;
        this.f19130d = z11;
        this.f19131e = z12;
        this.f19132f = str;
    }

    public static final c0 fromBundle(Bundle bundle) {
        boolean z10;
        long j2;
        boolean z11;
        boolean z12;
        String str;
        if (a4.b.u(bundle, "bundle", c0.class, "filtered_folder_ids")) {
            long[] longArray = bundle.getLongArray("filtered_folder_ids");
            if (longArray != null) {
                if (bundle.containsKey("is_dismissible")) {
                    z10 = bundle.getBoolean("is_dismissible");
                } else {
                    z10 = true;
                }
                if (bundle.containsKey("selected_folder_id")) {
                    j2 = bundle.getLong("selected_folder_id");
                } else {
                    j2 = 0;
                }
                long j10 = j2;
                if (bundle.containsKey("is_none_enabled")) {
                    z11 = bundle.getBoolean("is_none_enabled");
                } else {
                    z11 = false;
                }
                if (bundle.containsKey("is_main_interface")) {
                    z12 = bundle.getBoolean("is_main_interface");
                } else {
                    z12 = false;
                }
                if (bundle.containsKey("title")) {
                    str = bundle.getString("title");
                } else {
                    str = null;
                }
                return new c0(longArray, z10, j10, z11, z12, str);
            }
            throw new IllegalArgumentException("Argument \"filtered_folder_ids\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"filtered_folder_ids\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return v7.g.a(this.f19128a, c0Var.f19128a) && this.f19129b == c0Var.f19129b && this.c == c0Var.c && this.f19130d == c0Var.f19130d && this.f19131e == c0Var.f19131e && v7.g.a(this.f19132f, c0Var.f19132f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f19128a) * 31;
        int i10 = 1;
        boolean z10 = this.f19129b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        long j2 = this.c;
        int i12 = (((hashCode + i11) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z11 = this.f19130d;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.f19131e;
        if (!z12) {
            i10 = z12 ? 1 : 0;
        }
        int i15 = (i14 + i10) * 31;
        String str = this.f19132f;
        return i15 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f19128a);
        return "SelectFolderDialogFragmentArgs(filteredFolderIds=" + arrays + ", isDismissible=" + this.f19129b + ", selectedFolderId=" + this.c + ", isNoneEnabled=" + this.f19130d + ", isMainInterface=" + this.f19131e + ", title=" + this.f19132f + ")";
    }
}
