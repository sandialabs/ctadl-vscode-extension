package com.noto.app.note;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f9394i = 0;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteDialogFragment f9395j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d0 f9396k;

    public /* synthetic */ d(d0 d0Var, NoteDialogFragment noteDialogFragment) {
        this.f9396k = d0Var;
        this.f9395j = noteDialogFragment;
    }

    public /* synthetic */ d(NoteDialogFragment noteDialogFragment, d0 d0Var) {
        this.f9395j = noteDialogFragment;
        this.f9396k = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f9394i;
        d0 d0Var = this.f9396k;
        NoteDialogFragment noteDialogFragment = this.f9395j;
        switch (i10) {
            case 0:
                int i11 = NoteDialogFragment.C0;
                v7.g.f(noteDialogFragment, "this$0");
                if (d0Var != null) {
                    d0Var.c("folder_id").d(noteDialogFragment.r(), new a7.g(new NoteDialogFragment$setupListeners$7$1(noteDialogFragment, d0Var)));
                }
                NavController g10 = ViewUtilsKt.g(noteDialogFragment);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, a1.c.K(new long[]{noteDialogFragment.h0().f253a}, (String) noteDialogFragment.B0.getValue()), null);
                    return;
                }
                return;
            default:
                int i12 = NoteDialogFragment.C0;
                v7.g.f(noteDialogFragment, "this$0");
                Context j2 = noteDialogFragment.j();
                if (j2 != null) {
                    String e10 = q.e(j2, R.plurals.delete_note_confirmation, 1, new Object[0]);
                    String e11 = q.e(j2, R.plurals.delete_note_description, 1, new Object[0]);
                    String e12 = q.e(j2, R.plurals.delete_note, 1, new Object[0]);
                    if (d0Var != null) {
                        d0Var.c("click_listener").d(noteDialogFragment.r(), new a7.g(new NoteDialogFragment$setupListeners$10$1$1(j2, noteDialogFragment)));
                    }
                    NavController g11 = ViewUtilsKt.g(noteDialogFragment);
                    if (g11 != null) {
                        ViewUtilsKt.o(g11, new a7.b(e10, e11, e12), null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
