package a7;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f348a;

    /* renamed from: b  reason: collision with root package name */
    public final long f349b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f350d;

    /* renamed from: e  reason: collision with root package name */
    public final int f351e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f352f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f353g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f354h;

    public t(long j2, long j10, String str, long[] jArr, int i10, boolean z10, boolean z11, long[] jArr2) {
        this.f348a = j2;
        this.f349b = j10;
        this.c = str;
        this.f350d = jArr;
        this.f351e = i10;
        this.f352f = z10;
        this.f353g = z11;
        this.f354h = jArr2;
    }

    public static final t fromBundle(Bundle bundle) {
        long j2;
        String str;
        long[] jArr;
        int i10;
        boolean z10;
        boolean z11;
        if (a4.b.u(bundle, "bundle", t.class, "folder_id")) {
            long j10 = bundle.getLong("folder_id");
            if (bundle.containsKey("note_id")) {
                j2 = bundle.getLong("note_id");
            } else {
                j2 = 0;
            }
            long j11 = j2;
            if (bundle.containsKey("body")) {
                str = bundle.getString("body");
            } else {
                str = null;
            }
            if (bundle.containsKey("labels_ids")) {
                jArr = bundle.getLongArray("labels_ids");
            } else {
                jArr = null;
            }
            if (bundle.containsKey("scroll_position")) {
                i10 = bundle.getInt("scroll_position");
            } else {
                i10 = -1;
            }
            if (bundle.containsKey("is_title_visible")) {
                z10 = bundle.getBoolean("is_title_visible");
            } else {
                z10 = false;
            }
            if (bundle.containsKey("is_body_visible")) {
                z11 = bundle.getBoolean("is_body_visible");
            } else {
                z11 = false;
            }
            if (bundle.containsKey("selected_note_ids")) {
                long[] longArray = bundle.getLongArray("selected_note_ids");
                if (longArray != null) {
                    return new t(j10, j11, str, jArr, i10, z10, z11, longArray);
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
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.f348a == tVar.f348a && this.f349b == tVar.f349b && v7.g.a(this.c, tVar.c) && v7.g.a(this.f350d, tVar.f350d) && this.f351e == tVar.f351e && this.f352f == tVar.f352f && this.f353g == tVar.f353g && v7.g.a(this.f354h, tVar.f354h);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f348a;
        long j10 = this.f349b;
        int i10 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        int i11 = 0;
        String str = this.c;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        long[] jArr = this.f350d;
        if (jArr != null) {
            i11 = Arrays.hashCode(jArr);
        }
        int i12 = (((hashCode + i11) * 31) + this.f351e) * 31;
        int i13 = 1;
        boolean z10 = this.f352f;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int i15 = (i12 + i14) * 31;
        boolean z11 = this.f353g;
        if (!z11) {
            i13 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f354h) + ((i15 + i13) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f350d);
        String arrays2 = Arrays.toString(this.f354h);
        return "NoteFragmentArgs(folderId=" + this.f348a + ", noteId=" + this.f349b + ", body=" + this.c + ", labelsIds=" + arrays + ", scrollPosition=" + this.f351e + ", isTitleVisible=" + this.f352f + ", isBodyVisible=" + this.f353g + ", selectedNoteIds=" + arrays2 + ")";
    }
}
