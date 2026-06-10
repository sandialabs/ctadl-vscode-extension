package a7;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f298a;

    /* renamed from: b  reason: collision with root package name */
    public final long f299b;
    public final long[] c;

    public h0(long j2, long j10, long[] jArr) {
        this.f298a = j2;
        this.f299b = j10;
        this.c = jArr;
    }

    public static final h0 fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", h0.class, "folder_id")) {
            long j2 = bundle.getLong("folder_id");
            if (bundle.containsKey("note_id")) {
                long j10 = bundle.getLong("note_id");
                if (bundle.containsKey("selected_note_ids")) {
                    long[] longArray = bundle.getLongArray("selected_note_ids");
                    if (longArray != null) {
                        return new h0(j2, j10, longArray);
                    }
                    throw new IllegalArgumentException("Argument \"selected_note_ids\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"selected_note_ids\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Required argument \"note_id\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return this.f298a == h0Var.f298a && this.f299b == h0Var.f299b && v7.g.a(this.c, h0Var.c);
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f298a;
        long j10 = this.f299b;
        return Arrays.hashCode(this.c) + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.c);
        return "NotePagerFragmentArgs(folderId=" + this.f298a + ", noteId=" + this.f299b + ", selectedNoteIds=" + arrays + ")";
    }
}
