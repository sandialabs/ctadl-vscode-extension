package com.noto.app.note;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import com.noto.app.note.NoteSelectionDialogFragment;
import com.noto.app.util.ViewUtilsKt;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f9400i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f9401j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Fragment f9402k;

    public /* synthetic */ f(int i10, Fragment fragment, Object obj) {
        this.f9400i = i10;
        this.f9401j = obj;
        this.f9402k = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f9400i;
        Fragment fragment = this.f9402k;
        Object obj = this.f9401j;
        switch (i10) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                NoteFragment noteFragment = (NoteFragment) fragment;
                v7.g.f(entry, "$entry");
                v7.g.f(noteFragment, "this$0");
                if (((Boolean) entry.getValue()).booleanValue()) {
                    int i11 = NoteFragment.f9026f0;
                    NoteViewModel b02 = noteFragment.b0();
                    long j2 = ((t6.c) entry.getKey()).f17615a;
                    b02.getClass();
                    m0.b.M0(a1.b.d0(b02), null, null, new NoteViewModel$unselectLabel$1(b02, j2, null), 3);
                    return;
                }
                int i12 = NoteFragment.f9026f0;
                NoteViewModel b03 = noteFragment.b0();
                long j10 = ((t6.c) entry.getKey()).f17615a;
                b03.getClass();
                m0.b.M0(a1.b.d0(b03), null, null, new NoteViewModel$selectLabel$1(b03, j10, null), 3);
                return;
            case 1:
                d0 d0Var = (d0) obj;
                NoteDialogFragment noteDialogFragment = (NoteDialogFragment) fragment;
                int i13 = NoteDialogFragment.C0;
                v7.g.f(noteDialogFragment, "this$0");
                if (d0Var != null) {
                    d0Var.c("folder_id").d(noteDialogFragment.r(), new a7.g(new NoteDialogFragment$setupListeners$8$1(noteDialogFragment, d0Var)));
                }
                NavController g10 = ViewUtilsKt.g(noteDialogFragment);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, a1.c.K(new long[]{noteDialogFragment.h0().f253a}, (String) noteDialogFragment.B0.getValue()), null);
                    return;
                }
                return;
            default:
                d0 d0Var2 = (d0) obj;
                NoteSelectionDialogFragment noteSelectionDialogFragment = (NoteSelectionDialogFragment) fragment;
                int i14 = NoteSelectionDialogFragment.B0;
                v7.g.f(noteSelectionDialogFragment, "this$0");
                if (d0Var2 != null) {
                    d0Var2.c("folder_id").d(noteSelectionDialogFragment.r(), new NoteSelectionDialogFragment.a(new NoteSelectionDialogFragment$setupListeners$9$1(noteSelectionDialogFragment, d0Var2)));
                }
                NavController g11 = ViewUtilsKt.g(noteSelectionDialogFragment);
                if (g11 != null) {
                    ViewUtilsKt.o(g11, a1.c.L(new long[]{noteSelectionDialogFragment.h0().f331a}), null);
                    return;
                }
                return;
        }
    }
}
