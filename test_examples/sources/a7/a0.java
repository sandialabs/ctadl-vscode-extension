package a7;

import android.os.Bundle;
import com.noto.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f258a;

    /* renamed from: b  reason: collision with root package name */
    public final long f259b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f260d;

    /* renamed from: e  reason: collision with root package name */
    public final String f261e;

    /* renamed from: f  reason: collision with root package name */
    public final String f262f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f263g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f264h;

    /* renamed from: i  reason: collision with root package name */
    public final String[] f265i;

    public a0(long j2, long j10, boolean z10, boolean z11, String str, String str2, int[] iArr, int[] iArr2, String[] strArr) {
        this.f258a = j2;
        this.f259b = j10;
        this.c = z10;
        this.f260d = z11;
        this.f261e = str;
        this.f262f = str2;
        this.f263g = iArr;
        this.f264h = iArr2;
        this.f265i = strArr;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("folder_id", this.f258a);
        bundle.putLong("note_id", this.f259b);
        bundle.putBoolean("is_undo", this.c);
        bundle.putBoolean("is_title", this.f260d);
        bundle.putString("current_title_text", this.f261e);
        bundle.putString("current_body_text", this.f262f);
        bundle.putIntArray("start_cursor_indices", this.f263g);
        bundle.putIntArray("end_cursor_indices", this.f264h);
        bundle.putStringArray("content", this.f265i);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteFragment_to_undoRedoDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return this.f258a == a0Var.f258a && this.f259b == a0Var.f259b && this.c == a0Var.c && this.f260d == a0Var.f260d && v7.g.a(this.f261e, a0Var.f261e) && v7.g.a(this.f262f, a0Var.f262f) && v7.g.a(this.f263g, a0Var.f263g) && v7.g.a(this.f264h, a0Var.f264h) && v7.g.a(this.f265i, a0Var.f265i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f258a;
        long j10 = this.f259b;
        int i10 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        int i11 = 1;
        boolean z10 = this.c;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        int i13 = (i10 + i12) * 31;
        boolean z11 = this.f260d;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        int g10 = a4.b.g(this.f262f, a4.b.g(this.f261e, (i13 + i11) * 31, 31), 31);
        return ((Arrays.hashCode(this.f264h) + ((Arrays.hashCode(this.f263g) + g10) * 31)) * 31) + Arrays.hashCode(this.f265i);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f263g);
        String arrays2 = Arrays.toString(this.f264h);
        String arrays3 = Arrays.toString(this.f265i);
        return "ActionNoteFragmentToUndoRedoDialogFragment(folderId=" + this.f258a + ", noteId=" + this.f259b + ", isUndo=" + this.c + ", isTitle=" + this.f260d + ", currentTitleText=" + this.f261e + ", currentBodyText=" + this.f262f + ", startCursorIndices=" + arrays + ", endCursorIndices=" + arrays2 + ", content=" + arrays3 + ")";
    }
}
