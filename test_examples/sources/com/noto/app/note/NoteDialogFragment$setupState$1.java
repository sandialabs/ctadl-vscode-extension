package com.noto.app.note;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.OpenNotesIn;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteDialogFragment$setupState$1", f = "NoteDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteDialogFragment$setupState$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9019m;
    public final /* synthetic */ NoteDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ a0 f9020o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteDialogFragment$setupState$1(NoteDialogFragment noteDialogFragment, a0 a0Var, p7.c<? super NoteDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = noteDialogFragment;
        this.f9020o = a0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NoteDialogFragment$setupState$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteDialogFragment$setupState$1 noteDialogFragment$setupState$1 = new NoteDialogFragment$setupState$1(this.n, this.f9020o, cVar);
        noteDialogFragment$setupState$1.f9019m = obj;
        return noteDialogFragment$setupState$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r10 != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0 A[LOOP:0: B:35:0x00da->B:37:0x00e0, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int i10;
        boolean z10;
        boolean z11;
        androidx.navigation.i g10;
        androidx.navigation.n nVar;
        androidx.navigation.i g11;
        androidx.navigation.n nVar2;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f9019m;
        int i11 = NoteDialogFragment.C0;
        NoteDialogFragment noteDialogFragment = this.n;
        Context j2 = noteDialogFragment.j();
        if (j2 != null) {
            int b5 = q.b(j2, q.j(aVar.f17595e));
            ColorStateList h10 = q.h(b5);
            a0 a0Var = this.f9020o;
            a0Var.f17282b.c.setTextColor(b5);
            a0Var.f17282b.f17312d.setBackgroundTintList(h10);
            OpenNotesIn openNotesIn = OpenNotesIn.Editor;
            OpenNotesIn openNotesIn2 = aVar.f17609t;
            MaterialTextView materialTextView = a0Var.f17288i;
            if (openNotesIn2 != openNotesIn) {
                NavController g12 = ViewUtilsKt.g(noteDialogFragment);
                if (g12 != null && (g11 = g12.g()) != null && (nVar2 = g11.f5479j) != null && nVar2.f5511k == R.id.noteFragment) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (openNotesIn2 != OpenNotesIn.ReadingMode) {
                        NavController g13 = ViewUtilsKt.g(noteDialogFragment);
                        if (g13 != null && (g10 = g13.g()) != null && (nVar = g10.f5479j) != null && nVar.f5511k == R.id.notePagerFragment) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    materialTextView.setText(q.f(j2, R.string.edit, new Object[0]));
                    i10 = R.drawable.ic_round_edit_24;
                    materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i10, 0, 0);
                    for (MaterialTextView materialTextView2 : a1.c.O0(a0Var.f17291l, a0Var.f17284e, a0Var.f17283d, materialTextView, a0Var.f17292m, a0Var.c, a0Var.f17286g, a0Var.f17289j, a0Var.f17290k, a0Var.f17285f, a0Var.f17287h)) {
                        Drawable background = materialTextView2.getBackground();
                        v7.g.e(background, "tv.background");
                        ViewUtilsKt.s(background, h10);
                    }
                }
            }
            materialTextView.setText(q.f(j2, R.string.reading_mode, new Object[0]));
            i10 = R.drawable.ic_round_reading_mode_24;
            materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i10, 0, 0);
            while (r10.hasNext()) {
            }
        }
        return m7.n.f16010a;
    }
}
