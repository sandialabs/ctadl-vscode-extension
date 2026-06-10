package x6;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18731a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18732b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f18733d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18734e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f18735f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f18736g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f18737h;

    public y(long j2, long j10, String str, long[] jArr, int i10, boolean z10, boolean z11, long[] jArr2) {
        v7.g.f(jArr2, "selectedNoteIds");
        this.f18731a = j2;
        this.f18732b = j10;
        this.c = str;
        this.f18733d = jArr;
        this.f18734e = i10;
        this.f18735f = z10;
        this.f18736g = z11;
        this.f18737h = jArr2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18731a);
        bundle.putLong("note_id", this.f18732b);
        bundle.putString("body", this.c);
        bundle.putLongArray("labels_ids", this.f18733d);
        bundle.putInt("scroll_position", this.f18734e);
        bundle.putBoolean("is_title_visible", this.f18735f);
        bundle.putBoolean("is_body_visible", this.f18736g);
        bundle.putLongArray("selected_note_ids", this.f18737h);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderFragment_to_noteFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return this.f18731a == yVar.f18731a && this.f18732b == yVar.f18732b && v7.g.a(this.c, yVar.c) && v7.g.a(this.f18733d, yVar.f18733d) && this.f18734e == yVar.f18734e && this.f18735f == yVar.f18735f && this.f18736g == yVar.f18736g && v7.g.a(this.f18737h, yVar.f18737h);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f18731a;
        long j10 = this.f18732b;
        int i10 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        int i11 = 0;
        String str = this.c;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        long[] jArr = this.f18733d;
        if (jArr != null) {
            i11 = Arrays.hashCode(jArr);
        }
        int i12 = (((hashCode + i11) * 31) + this.f18734e) * 31;
        int i13 = 1;
        boolean z10 = this.f18735f;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int i15 = (i12 + i14) * 31;
        boolean z11 = this.f18736g;
        if (!z11) {
            i13 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f18737h) + ((i15 + i13) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18733d);
        String arrays2 = Arrays.toString(this.f18737h);
        return "ActionFolderFragmentToNoteFragment(folderId=" + this.f18731a + ", noteId=" + this.f18732b + ", body=" + this.c + ", labelsIds=" + arrays + ", scrollPosition=" + this.f18734e + ", isTitleVisible=" + this.f18735f + ", isBodyVisible=" + this.f18736g + ", selectedNoteIds=" + arrays2 + ")";
    }
}
