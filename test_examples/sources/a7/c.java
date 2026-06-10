package a7;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f269a;

    /* renamed from: b  reason: collision with root package name */
    public final long f270b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f271d;

    /* renamed from: e  reason: collision with root package name */
    public final int f272e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f273f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f274g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f275h;

    public c(long j2, long j10, String str, long[] jArr, int i10, boolean z10, boolean z11, long[] jArr2) {
        this.f269a = j2;
        this.f270b = j10;
        this.c = str;
        this.f271d = jArr;
        this.f272e = i10;
        this.f273f = z10;
        this.f274g = z11;
        this.f275h = jArr2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f269a);
        bundle.putLong("note_id", this.f270b);
        bundle.putString("body", this.c);
        bundle.putLongArray("labels_ids", this.f271d);
        bundle.putInt("scroll_position", this.f272e);
        bundle.putBoolean("is_title_visible", this.f273f);
        bundle.putBoolean("is_body_visible", this.f274g);
        bundle.putLongArray("selected_note_ids", this.f275h);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteDialogFragment_to_noteFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f269a == cVar.f269a && this.f270b == cVar.f270b && v7.g.a(this.c, cVar.c) && v7.g.a(this.f271d, cVar.f271d) && this.f272e == cVar.f272e && this.f273f == cVar.f273f && this.f274g == cVar.f274g && v7.g.a(this.f275h, cVar.f275h);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f269a;
        long j10 = this.f270b;
        int i10 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        int i11 = 0;
        String str = this.c;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        long[] jArr = this.f271d;
        if (jArr != null) {
            i11 = Arrays.hashCode(jArr);
        }
        int i12 = (((hashCode + i11) * 31) + this.f272e) * 31;
        int i13 = 1;
        boolean z10 = this.f273f;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int i15 = (i12 + i14) * 31;
        boolean z11 = this.f274g;
        if (!z11) {
            i13 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f275h) + ((i15 + i13) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f271d);
        String arrays2 = Arrays.toString(this.f275h);
        return "ActionNoteDialogFragmentToNoteFragment(folderId=" + this.f269a + ", noteId=" + this.f270b + ", body=" + this.c + ", labelsIds=" + arrays + ", scrollPosition=" + this.f272e + ", isTitleVisible=" + this.f273f + ", isBodyVisible=" + this.f274g + ", selectedNoteIds=" + arrays2 + ")";
    }
}
