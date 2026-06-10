package a7;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class m0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f322a;

    /* renamed from: b  reason: collision with root package name */
    public final long f323b;

    public m0(long j2, long j10) {
        this.f322a = j2;
        this.f323b = j10;
    }

    public static final m0 fromBundle(Bundle bundle) {
        long j2;
        if (a4.b.u(bundle, "bundle", m0.class, "folder_id")) {
            long j10 = bundle.getLong("folder_id");
            if (bundle.containsKey("note_id")) {
                j2 = bundle.getLong("note_id");
            } else {
                j2 = 0;
            }
            return new m0(j10, j2);
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            return this.f322a == m0Var.f322a && this.f323b == m0Var.f323b;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f322a;
        long j10 = this.f323b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoteReminderDialogFragmentArgs(folderId=");
        sb.append(this.f322a);
        sb.append(", noteId=");
        return androidx.activity.e.i(sb, this.f323b, ")");
    }
}
