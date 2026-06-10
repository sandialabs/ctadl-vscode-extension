package com.noto.app.note;

import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class o implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Map.Entry<t6.c, Boolean> f9422i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ QuickNoteDialogFragment f9423j;

    public o(Map.Entry<t6.c, Boolean> entry, QuickNoteDialogFragment quickNoteDialogFragment) {
        this.f9422i = entry;
        this.f9423j = quickNoteDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Map.Entry<t6.c, Boolean> entry = this.f9422i;
        boolean booleanValue = entry.getValue().booleanValue();
        QuickNoteDialogFragment quickNoteDialogFragment = this.f9423j;
        if (booleanValue) {
            int i10 = QuickNoteDialogFragment.f9328y0;
            NoteViewModel g02 = quickNoteDialogFragment.g0();
            long j2 = entry.getKey().f17615a;
            g02.getClass();
            m0.b.M0(a1.b.d0(g02), null, null, new NoteViewModel$unselectLabel$1(g02, j2, null), 3);
            return;
        }
        int i11 = QuickNoteDialogFragment.f9328y0;
        NoteViewModel g03 = quickNoteDialogFragment.g0();
        long j10 = entry.getKey().f17615a;
        g03.getClass();
        m0.b.M0(a1.b.d0(g03), null, null, new NoteViewModel$selectLabel$1(g03, j10, null), 3);
    }
}
