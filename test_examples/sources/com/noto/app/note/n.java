package com.noto.app.note;

import a7.q0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.note.NoteSelectionDialogFragment;
import com.noto.app.util.CustomEditText;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Triple;
import s6.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f9419i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f9420j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f9421k;

    public /* synthetic */ n(NoteSelectionDialogFragment noteSelectionDialogFragment, d0 d0Var) {
        this.f9419i = 3;
        this.f9421k = noteSelectionDialogFragment;
        this.f9420j = d0Var;
    }

    public /* synthetic */ n(Object obj, int i10, Object obj2) {
        this.f9419i = i10;
        this.f9420j = obj;
        this.f9421k = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment;
        View view2;
        Triple<Integer, Integer, String> k3;
        int i10 = this.f9419i;
        Object obj = this.f9421k;
        Object obj2 = this.f9420j;
        switch (i10) {
            case 0:
                y6.h hVar = (y6.h) obj2;
                NoteSelectionDialogFragment noteSelectionDialogFragment = (NoteSelectionDialogFragment) obj;
                v7.g.f(hVar, "$model");
                v7.g.f(noteSelectionDialogFragment, "this$0");
                boolean z10 = hVar.f18913b;
                t6.c cVar = hVar.f18912a;
                if (z10) {
                    int i11 = NoteSelectionDialogFragment.B0;
                    noteSelectionDialogFragment.m0().h(cVar.f17615a);
                    return;
                }
                int i12 = NoteSelectionDialogFragment.B0;
                noteSelectionDialogFragment.m0().t(cVar.f17615a);
                return;
            case 1:
                UndoRedoDialogFragment undoRedoDialogFragment = (UndoRedoDialogFragment) obj2;
                Triple triple = (Triple) obj;
                v7.g.f(undoRedoDialogFragment, "this$0");
                v7.g.f(triple, "$item");
                int i13 = UndoRedoDialogFragment.f9368z0;
                ClipData newPlainText = ClipData.newPlainText(undoRedoDialogFragment.j0().f369e, (CharSequence) triple.f12974k);
                ClipboardManager clipboardManager = (ClipboardManager) undoRedoDialogFragment.f9371w0.getValue();
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
                if (Build.VERSION.SDK_INT <= 32) {
                    NotoColor notoColor = ((t6.a) ((NoteViewModel) undoRedoDialogFragment.f9369u0.getValue()).f9270q.getValue()).f17595e;
                    Context j2 = undoRedoDialogFragment.j();
                    if (j2 != null && (fragment = undoRedoDialogFragment.C) != null && (view2 = fragment.M) != null) {
                        ViewUtilsKt.w(view2, q.f(j2, R.string.text_copied, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_copy_24), Integer.valueOf((int) R.id.bab), notoColor, 16);
                    }
                }
                undoRedoDialogFragment.Z();
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                b0 b0Var = (b0) obj2;
                NoteFragment noteFragment = (NoteFragment) obj;
                int i14 = NoteFragment.f9026f0;
                v7.g.f(b0Var, "$this_setupListeners");
                v7.g.f(noteFragment, "this$0");
                CustomEditText customEditText = b0Var.f17298e;
                if (customEditText.isFocused()) {
                    k3 = noteFragment.b0().l();
                } else {
                    customEditText = b0Var.f17297d;
                    if (customEditText.isFocused()) {
                        k3 = noteFragment.b0().k();
                    } else {
                        return;
                    }
                }
                customEditText.setSelection(k3.f12973j.intValue());
                return;
            default:
                NoteSelectionDialogFragment noteSelectionDialogFragment2 = (NoteSelectionDialogFragment) obj;
                d0 d0Var = (d0) obj2;
                int i15 = NoteSelectionDialogFragment.B0;
                v7.g.f(noteSelectionDialogFragment2, "this$0");
                Context j10 = noteSelectionDialogFragment2.j();
                if (j10 != null) {
                    String e10 = q.e(j10, R.plurals.delete_note_confirmation, noteSelectionDialogFragment2.l0().size(), new Object[0]);
                    String e11 = q.e(j10, R.plurals.delete_note_description, noteSelectionDialogFragment2.l0().size(), new Object[0]);
                    String e12 = q.e(j10, R.plurals.delete_note, noteSelectionDialogFragment2.l0().size(), new Object[0]);
                    if (d0Var != null) {
                        d0Var.c("click_listener").d(noteSelectionDialogFragment2.r(), new NoteSelectionDialogFragment.a(new NoteSelectionDialogFragment$setupListeners$10$1$1(j10, noteSelectionDialogFragment2)));
                    }
                    NavController g10 = ViewUtilsKt.g(noteSelectionDialogFragment2);
                    if (g10 != null) {
                        ViewUtilsKt.o(g10, new q0(e10, e11, e12), null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
