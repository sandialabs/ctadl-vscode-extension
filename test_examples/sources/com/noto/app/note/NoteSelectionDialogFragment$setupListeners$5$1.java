package com.noto.app.note;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteSelectionDialogFragment$setupListeners$5$1 extends Lambda implements u7.l<Throwable, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteSelectionDialogFragment f9226j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteSelectionDialogFragment$setupListeners$5$1(NoteSelectionDialogFragment noteSelectionDialogFragment) {
        super(1);
        this.f9226j = noteSelectionDialogFragment;
    }

    @Override // u7.l
    public final m7.n U(Throwable th) {
        Throwable th2 = th;
        NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9226j;
        Context j2 = noteSelectionDialogFragment.j();
        if (j2 != null) {
            String e10 = q.e(j2, R.plurals.note_is_archived, noteSelectionDialogFragment.l0().size(), Integer.valueOf(noteSelectionDialogFragment.l0().size()));
            View k02 = noteSelectionDialogFragment.k0();
            if (k02 != null) {
                ViewUtilsKt.w(k02, e10, Integer.valueOf((int) R.drawable.ic_round_archive_24), Integer.valueOf(noteSelectionDialogFragment.g0()), noteSelectionDialogFragment.j0(), 16);
            }
            a1.c.W1(j2);
            a1.c.Y1(j2);
        }
        noteSelectionDialogFragment.Z();
        return m7.n.f16010a;
    }
}
