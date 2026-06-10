package y6;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class o implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f18923a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18924b;

    public o(long j2, long j10) {
        this.f18923a = j2;
        this.f18924b = j10;
    }

    public static final o fromBundle(Bundle bundle) {
        long j2;
        if (a4.b.u(bundle, "bundle", o.class, "folder_id")) {
            long j10 = bundle.getLong("folder_id");
            if (bundle.containsKey("label_id")) {
                j2 = bundle.getLong("label_id");
            } else {
                j2 = 0;
            }
            return new o(j10, j2);
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f18923a == oVar.f18923a && this.f18924b == oVar.f18924b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f18923a;
        long j10 = this.f18924b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewLabelDialogFragmentArgs(folderId=");
        sb.append(this.f18923a);
        sb.append(", labelId=");
        return androidx.activity.e.i(sb, this.f18924b, ")");
    }
}
