package a7;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f331a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f332b;

    public p0(long j2, long[] jArr) {
        this.f331a = j2;
        this.f332b = jArr;
    }

    public static final p0 fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", p0.class, "folder_id")) {
            long j2 = bundle.getLong("folder_id");
            if (bundle.containsKey("selected_note_ids")) {
                long[] longArray = bundle.getLongArray("selected_note_ids");
                if (longArray != null) {
                    return new p0(j2, longArray);
                }
                throw new IllegalArgumentException("Argument \"selected_note_ids\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"selected_note_ids\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            return this.f331a == p0Var.f331a && v7.g.a(this.f332b, p0Var.f332b);
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f331a;
        return Arrays.hashCode(this.f332b) + (((int) (j2 ^ (j2 >>> 32))) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f332b);
        return "NoteSelectionDialogFragmentArgs(folderId=" + this.f331a + ", selectedNoteIds=" + arrays + ")";
    }
}
