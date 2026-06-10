package a7;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f253a;

    /* renamed from: b  reason: collision with root package name */
    public final long f254b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f255d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f256e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f257f;

    public a(long j2, long j10, int i10, boolean z10, boolean z11, long[] jArr) {
        this.f253a = j2;
        this.f254b = j10;
        this.c = i10;
        this.f255d = z10;
        this.f256e = z11;
        this.f257f = jArr;
    }

    public static final a fromBundle(Bundle bundle) {
        boolean z10;
        boolean z11;
        if (a4.b.u(bundle, "bundle", a.class, "folder_id")) {
            long j2 = bundle.getLong("folder_id");
            if (bundle.containsKey("note_id")) {
                long j10 = bundle.getLong("note_id");
                if (bundle.containsKey("destination")) {
                    int i10 = bundle.getInt("destination");
                    if (bundle.containsKey("is_selection_enabled")) {
                        z10 = bundle.getBoolean("is_selection_enabled");
                    } else {
                        z10 = false;
                    }
                    if (bundle.containsKey("is_select_all_enabled")) {
                        z11 = bundle.getBoolean("is_select_all_enabled");
                    } else {
                        z11 = false;
                    }
                    if (bundle.containsKey("selected_note_ids")) {
                        long[] longArray = bundle.getLongArray("selected_note_ids");
                        if (longArray != null) {
                            return new a(j2, j10, i10, z10, z11, longArray);
                        }
                        throw new IllegalArgumentException("Argument \"selected_note_ids\" is marked as non-null but was passed a null value.");
                    }
                    throw new IllegalArgumentException("Required argument \"selected_note_ids\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"destination\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Required argument \"note_id\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f253a == aVar.f253a && this.f254b == aVar.f254b && this.c == aVar.c && this.f255d == aVar.f255d && this.f256e == aVar.f256e && v7.g.a(this.f257f, aVar.f257f);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f253a;
        long j10 = this.f254b;
        int i10 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.c) * 31;
        int i11 = 1;
        boolean z10 = this.f255d;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        int i13 = (i10 + i12) * 31;
        boolean z11 = this.f256e;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f257f) + ((i13 + i11) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f257f);
        return "NoteDialogFragmentArgs(folderId=" + this.f253a + ", noteId=" + this.f254b + ", destination=" + this.c + ", isSelectionEnabled=" + this.f255d + ", isSelectAllEnabled=" + this.f256e + ", selectedNoteIds=" + arrays + ")";
    }
}
