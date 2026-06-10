package y6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class c implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18899a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18900b;

    public c(long j2, long j10) {
        this.f18899a = j2;
        this.f18900b = j10;
    }

    public static final c fromBundle(Bundle bundle) {
        long j2;
        if (a4.b.u(bundle, "bundle", c.class, "folder_id")) {
            long j10 = bundle.getLong("folder_id");
            if (bundle.containsKey("label_id")) {
                j2 = bundle.getLong("label_id");
            } else {
                j2 = 0;
            }
            return new c(j10, j2);
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f18899a == cVar.f18899a && this.f18900b == cVar.f18900b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f18899a;
        long j10 = this.f18900b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LabelDialogFragmentArgs(folderId=");
        sb.append(this.f18899a);
        sb.append(", labelId=");
        return androidx.activity.e.i(sb, this.f18900b, ")");
    }
}
