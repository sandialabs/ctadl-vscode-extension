package com.noto.app.note;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.d0;
import com.noto.R;
import com.noto.app.folder.FolderViewModel;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "folderId", "Lm7/n;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteSelectionDialogFragment$setupListeners$8$1 extends Lambda implements u7.l<Long, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteSelectionDialogFragment f9229j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d0 f9230k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.note.NoteSelectionDialogFragment$setupListeners$8$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ NoteSelectionDialogFragment f9231j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ d0 f9232k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NoteSelectionDialogFragment noteSelectionDialogFragment, d0 d0Var) {
            super(1);
            this.f9231j = noteSelectionDialogFragment;
            this.f9232k = d0Var;
        }

        @Override // u7.l
        public final m7.n U(Throwable th) {
            Throwable th2 = th;
            NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9231j;
            Context j2 = noteSelectionDialogFragment.j();
            if (j2 != null) {
                String e10 = q.e(j2, R.plurals.note_is_copied, noteSelectionDialogFragment.l0().size(), Integer.valueOf(noteSelectionDialogFragment.l0().size()), (String) this.f9232k.b("folder_title"));
                View k02 = noteSelectionDialogFragment.k0();
                if (k02 != null) {
                    ViewUtilsKt.w(k02, e10, Integer.valueOf((int) R.drawable.ic_round_file_copy_24), Integer.valueOf(noteSelectionDialogFragment.g0()), noteSelectionDialogFragment.j0(), 16);
                }
                a1.c.W1(j2);
                a1.c.Y1(j2);
            }
            noteSelectionDialogFragment.Z();
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteSelectionDialogFragment$setupListeners$8$1(NoteSelectionDialogFragment noteSelectionDialogFragment, d0 d0Var) {
        super(1);
        this.f9229j = noteSelectionDialogFragment;
        this.f9230k = d0Var;
    }

    @Override // u7.l
    public final m7.n U(Long l2) {
        Long l4 = l2;
        int i10 = NoteSelectionDialogFragment.B0;
        NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9229j;
        FolderViewModel m02 = noteSelectionDialogFragment.m0();
        v7.g.e(l4, "folderId");
        m02.f(l4.longValue()).O(new AnonymousClass1(noteSelectionDialogFragment, this.f9230k));
        return m7.n.f16010a;
    }
}
