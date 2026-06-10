package y6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class u implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18933a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18934b;

    public u(long j2, long j10) {
        this.f18933a = j2;
        this.f18934b = j10;
    }

    public static final u fromBundle(Bundle bundle) {
        long j2;
        if (a4.b.u(bundle, "bundle", u.class, "folder_id")) {
            long j10 = bundle.getLong("folder_id");
            if (bundle.containsKey("label_id")) {
                j2 = bundle.getLong("label_id");
            } else {
                j2 = 0;
            }
            return new u(j10, j2);
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f18933a == uVar.f18933a && this.f18934b == uVar.f18934b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f18933a;
        long j10 = this.f18934b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReorderLabelDialogFragmentArgs(folderId=");
        sb.append(this.f18933a);
        sb.append(", labelId=");
        return androidx.activity.e.i(sb, this.f18934b, ")");
    }
}
