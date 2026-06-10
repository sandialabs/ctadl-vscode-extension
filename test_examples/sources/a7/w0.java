package a7;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w0 implements androidx.navigation.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f366a;

    /* renamed from: b  reason: collision with root package name */
    public final long f367b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f368d;

    /* renamed from: e  reason: collision with root package name */
    public final String f369e;

    /* renamed from: f  reason: collision with root package name */
    public final String f370f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f371g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f372h;

    /* renamed from: i  reason: collision with root package name */
    public final String[] f373i;

    public w0(long j2, long j10, boolean z10, boolean z11, String str, String str2, int[] iArr, int[] iArr2, String[] strArr) {
        this.f366a = j2;
        this.f367b = j10;
        this.c = z10;
        this.f368d = z11;
        this.f369e = str;
        this.f370f = str2;
        this.f371g = iArr;
        this.f372h = iArr2;
        this.f373i = strArr;
    }

    public static final w0 fromBundle(Bundle bundle) {
        if (a4.b.u(bundle, "bundle", w0.class, "folder_id")) {
            long j2 = bundle.getLong("folder_id");
            if (bundle.containsKey("note_id")) {
                long j10 = bundle.getLong("note_id");
                if (bundle.containsKey("is_undo")) {
                    boolean z10 = bundle.getBoolean("is_undo");
                    if (bundle.containsKey("is_title")) {
                        boolean z11 = bundle.getBoolean("is_title");
                        if (bundle.containsKey("current_title_text")) {
                            String string = bundle.getString("current_title_text");
                            if (string != null) {
                                if (bundle.containsKey("current_body_text")) {
                                    String string2 = bundle.getString("current_body_text");
                                    if (string2 != null) {
                                        if (bundle.containsKey("start_cursor_indices")) {
                                            int[] intArray = bundle.getIntArray("start_cursor_indices");
                                            if (intArray != null) {
                                                if (bundle.containsKey("end_cursor_indices")) {
                                                    int[] intArray2 = bundle.getIntArray("end_cursor_indices");
                                                    if (intArray2 != null) {
                                                        if (bundle.containsKey("content")) {
                                                            String[] stringArray = bundle.getStringArray("content");
                                                            if (stringArray != null) {
                                                                return new w0(j2, j10, z10, z11, string, string2, intArray, intArray2, stringArray);
                                                            }
                                                            throw new IllegalArgumentException("Argument \"content\" is marked as non-null but was passed a null value.");
                                                        }
                                                        throw new IllegalArgumentException("Required argument \"content\" is missing and does not have an android:defaultValue");
                                                    }
                                                    throw new IllegalArgumentException("Argument \"end_cursor_indices\" is marked as non-null but was passed a null value.");
                                                }
                                                throw new IllegalArgumentException("Required argument \"end_cursor_indices\" is missing and does not have an android:defaultValue");
                                            }
                                            throw new IllegalArgumentException("Argument \"start_cursor_indices\" is marked as non-null but was passed a null value.");
                                        }
                                        throw new IllegalArgumentException("Required argument \"start_cursor_indices\" is missing and does not have an android:defaultValue");
                                    }
                                    throw new IllegalArgumentException("Argument \"current_body_text\" is marked as non-null but was passed a null value.");
                                }
                                throw new IllegalArgumentException("Required argument \"current_body_text\" is missing and does not have an android:defaultValue");
                            }
                            throw new IllegalArgumentException("Argument \"current_title_text\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"current_title_text\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Required argument \"is_title\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"is_undo\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Required argument \"note_id\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"folder_id\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            return this.f366a == w0Var.f366a && this.f367b == w0Var.f367b && this.c == w0Var.c && this.f368d == w0Var.f368d && v7.g.a(this.f369e, w0Var.f369e) && v7.g.a(this.f370f, w0Var.f370f) && v7.g.a(this.f371g, w0Var.f371g) && v7.g.a(this.f372h, w0Var.f372h) && v7.g.a(this.f373i, w0Var.f373i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f366a;
        long j10 = this.f367b;
        int i10 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        int i11 = 1;
        boolean z10 = this.c;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        int i13 = (i10 + i12) * 31;
        boolean z11 = this.f368d;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        int g10 = a4.b.g(this.f370f, a4.b.g(this.f369e, (i13 + i11) * 31, 31), 31);
        return ((Arrays.hashCode(this.f372h) + ((Arrays.hashCode(this.f371g) + g10) * 31)) * 31) + Arrays.hashCode(this.f373i);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f371g);
        String arrays2 = Arrays.toString(this.f372h);
        String arrays3 = Arrays.toString(this.f373i);
        return "UndoRedoDialogFragmentArgs(folderId=" + this.f366a + ", noteId=" + this.f367b + ", isUndo=" + this.c + ", isTitle=" + this.f368d + ", currentTitleText=" + this.f369e + ", currentBodyText=" + this.f370f + ", startCursorIndices=" + arrays + ", endCursorIndices=" + arrays2 + ", content=" + arrays3 + ")";
    }
}
