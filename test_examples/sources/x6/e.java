package x6;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f18668a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18669b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f18670d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18671e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f18672f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f18673g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f18674h;

    public e(long j2, long j10, String str, long[] jArr, int i10, boolean z10, boolean z11, long[] jArr2) {
        this.f18668a = j2;
        this.f18669b = j10;
        this.c = str;
        this.f18670d = jArr;
        this.f18671e = i10;
        this.f18672f = z10;
        this.f18673g = z11;
        this.f18674h = jArr2;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f18668a);
        bundle.putLong("note_id", this.f18669b);
        bundle.putString("body", this.c);
        bundle.putLongArray("labels_ids", this.f18670d);
        bundle.putInt("scroll_position", this.f18671e);
        bundle.putBoolean("is_title_visible", this.f18672f);
        bundle.putBoolean("is_body_visible", this.f18673g);
        bundle.putLongArray("selected_note_ids", this.f18674h);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderArchiveFragment_to_noteFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f18668a == eVar.f18668a && this.f18669b == eVar.f18669b && v7.g.a(this.c, eVar.c) && v7.g.a(this.f18670d, eVar.f18670d) && this.f18671e == eVar.f18671e && this.f18672f == eVar.f18672f && this.f18673g == eVar.f18673g && v7.g.a(this.f18674h, eVar.f18674h);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f18668a;
        long j10 = this.f18669b;
        int i10 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        int i11 = 0;
        String str = this.c;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        long[] jArr = this.f18670d;
        if (jArr != null) {
            i11 = Arrays.hashCode(jArr);
        }
        int i12 = (((hashCode + i11) * 31) + this.f18671e) * 31;
        int i13 = 1;
        boolean z10 = this.f18672f;
        int i14 = z10;
        if (z10 != 0) {
            i14 = 1;
        }
        int i15 = (i12 + i14) * 31;
        boolean z11 = this.f18673g;
        if (!z11) {
            i13 = z11 ? 1 : 0;
        }
        return Arrays.hashCode(this.f18674h) + ((i15 + i13) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f18670d);
        String arrays2 = Arrays.toString(this.f18674h);
        return "ActionFolderArchiveFragmentToNoteFragment(folderId=" + this.f18668a + ", noteId=" + this.f18669b + ", body=" + this.c + ", labelsIds=" + arrays + ", scrollPosition=" + this.f18671e + ", isTitleVisible=" + this.f18672f + ", isBodyVisible=" + this.f18673g + ", selectedNoteIds=" + arrays2 + ")";
    }
}
