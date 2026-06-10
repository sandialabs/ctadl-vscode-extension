package a7;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f301a;

    /* renamed from: b  reason: collision with root package name */
    public final long f302b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f303d;

    /* renamed from: e  reason: collision with root package name */
    public final int f304e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f305f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f306g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f307h;

    public i0(long j2, long j10, String str, long[] jArr, int i10, boolean z10, boolean z11, long[] jArr2) {
        this.f301a = j2;
        this.f302b = j10;
        this.c = str;
        this.f303d = jArr;
        this.f304e = i10;
        this.f305f = z10;
        this.f306g = z11;
        this.f307h = jArr2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f301a);
        bundle.putLong("note_id", this.f302b);
        bundle.putString("body", this.c);
        bundle.putLongArray("labels_ids", this.f303d);
        bundle.putInt("scroll_position", this.f304e);
        bundle.putBoolean("is_title_visible", this.f305f);
        bundle.putBoolean("is_body_visible", this.f306g);
        bundle.putLongArray("selected_note_ids", this.f307h);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_notePagerFragment_to_noteFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return this.f301a == i0Var.f301a && this.f302b == i0Var.f302b && v7.g.a(this.c, i0Var.c) && v7.g.a(this.f303d, i0Var.f303d) && this.f304e == i0Var.f304e && this.f305f == i0Var.f305f && this.f306g == i0Var.f306g && v7.g.a(this.f307h, i0Var.f307h);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f301a;
        long j10 = this.f302b;
        int i10 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        int i11 = 0;
        String str = this.c;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        long[] jArr = this.f303d;
        if (jArr != null) {
            i11 = Arrays.hashCode(jArr);
        }
        int i12 = (((hashCode + i11) * 31) + this.f304e) * 31;
        int i13 = 1;
        boolean z10 = this.f305f;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int i15 = (i12 + i14) * 31;
        boolean z11 = this.f306g;
        if (!z11) {
            i13 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f307h) + ((i15 + i13) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f303d);
        String arrays2 = Arrays.toString(this.f307h);
        return "ActionNotePagerFragmentToNoteFragment(folderId=" + this.f301a + ", noteId=" + this.f302b + ", body=" + this.c + ", labelsIds=" + arrays + ", scrollPosition=" + this.f304e + ", isTitleVisible=" + this.f305f + ", isBodyVisible=" + this.f306g + ", selectedNoteIds=" + arrays2 + ")";
    }
}
