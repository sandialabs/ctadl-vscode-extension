package w6;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18464a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18465b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f18466d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18467e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f18468f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f18469g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f18470h;

    public p(long j2, long j10, String str, long[] jArr, int i10, boolean z10, boolean z11, long[] jArr2) {
        this.f18464a = j2;
        this.f18465b = j10;
        this.c = str;
        this.f18466d = jArr;
        this.f18467e = i10;
        this.f18468f = z10;
        this.f18469g = z11;
        this.f18470h = jArr2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18464a);
        bundle.putLong("note_id", this.f18465b);
        bundle.putString("body", this.c);
        bundle.putLongArray("labels_ids", this.f18466d);
        bundle.putInt("scroll_position", this.f18467e);
        bundle.putBoolean("is_title_visible", this.f18468f);
        bundle.putBoolean("is_body_visible", this.f18469g);
        bundle.putLongArray("selected_note_ids", this.f18470h);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_filteredFragment_to_noteFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f18464a == pVar.f18464a && this.f18465b == pVar.f18465b && v7.g.a(this.c, pVar.c) && v7.g.a(this.f18466d, pVar.f18466d) && this.f18467e == pVar.f18467e && this.f18468f == pVar.f18468f && this.f18469g == pVar.f18469g && v7.g.a(this.f18470h, pVar.f18470h);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f18464a;
        long j10 = this.f18465b;
        int i10 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        int i11 = 0;
        String str = this.c;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        long[] jArr = this.f18466d;
        if (jArr != null) {
            i11 = Arrays.hashCode(jArr);
        }
        int i12 = (((hashCode + i11) * 31) + this.f18467e) * 31;
        int i13 = 1;
        boolean z10 = this.f18468f;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int i15 = (i12 + i14) * 31;
        boolean z11 = this.f18469g;
        if (!z11) {
            i13 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f18470h) + ((i15 + i13) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18466d);
        String arrays2 = Arrays.toString(this.f18470h);
        return "ActionFilteredFragmentToNoteFragment(folderId=" + this.f18464a + ", noteId=" + this.f18465b + ", body=" + this.c + ", labelsIds=" + arrays + ", scrollPosition=" + this.f18467e + ", isTitleVisible=" + this.f18468f + ", isBodyVisible=" + this.f18469g + ", selectedNoteIds=" + arrays2 + ")";
    }
}
