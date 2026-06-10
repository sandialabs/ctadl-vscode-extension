package x6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class l0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18697a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18698b;

    public l0(long j2, boolean z10) {
        this.f18697a = j2;
        this.f18698b = z10;
    }

    public static final l0 fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", l0.class, "folder_id")) {
            long j2 = bundle.getLong("folder_id");
            if (bundle.containsKey("is_sorting")) {
                return new l0(j2, bundle.getBoolean("is_sorting"));
            }
            throw new IllegalArgumentException("Required argument \"is_sorting\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            return this.f18697a == l0Var.f18697a && this.f18698b == l0Var.f18698b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f18697a;
        int i10 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        boolean z10 = this.f18698b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        return i10 + i11;
    }

    public final String toString() {
        return "NoteListOrderingDialogFragmentArgs(folderId=" + this.f18697a + ", isSorting=" + this.f18698b + ")";
    }
}
