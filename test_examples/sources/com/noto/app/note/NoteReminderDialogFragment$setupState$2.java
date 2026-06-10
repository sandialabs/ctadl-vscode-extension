package com.noto.app.note;

import android.content.Context;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/d;", "note", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteReminderDialogFragment$setupState$2", f = "NoteReminderDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteReminderDialogFragment$setupState$2 extends SuspendLambda implements u7.p<t6.d, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9186m;
    public final /* synthetic */ NoteReminderDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ m0 f9187o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteReminderDialogFragment$setupState$2(NoteReminderDialogFragment noteReminderDialogFragment, m0 m0Var, p7.c<? super NoteReminderDialogFragment$setupState$2> cVar) {
        super(2, cVar);
        this.n = noteReminderDialogFragment;
        this.f9187o = m0Var;
    }

    @Override // u7.p
    public final Object R(t6.d dVar, p7.c<? super m7.n> cVar) {
        return ((NoteReminderDialogFragment$setupState$2) a(dVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteReminderDialogFragment$setupState$2 noteReminderDialogFragment$setupState$2 = new NoteReminderDialogFragment$setupState$2(this.n, this.f9187o, cVar);
        noteReminderDialogFragment$setupState$2.f9186m = obj;
        return noteReminderDialogFragment$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        String a10;
        TextView textView;
        m0.b.n1(obj);
        t6.d dVar = (t6.d) this.f9186m;
        int i10 = NoteReminderDialogFragment.f9176x0;
        NoteReminderDialogFragment noteReminderDialogFragment = this.n;
        Context j2 = noteReminderDialogFragment.j();
        if (j2 != null) {
            na.c cVar = dVar.f17628i;
            m0 m0Var = this.f9187o;
            if (cVar == null) {
                m0Var.f17421b.setText(noteReminderDialogFragment.q(R.string.no_note_reminder));
                m0Var.f17422d.setEndIconDrawable(q.c(j2, R.drawable.ic_round_notification_add_24));
                textView = m0Var.c.c;
                a10 = q.f(j2, R.string.new_note_reminder, new Object[0]);
            } else {
                m0Var.f17422d.setEndIconDrawable(q.c(j2, R.drawable.ic_round_cancel_24));
                m0Var.c.c.setText(q.f(j2, R.string.edit_note_reminder, new Object[0]));
                a10 = f7.g.a(dVar.f17628i, j2);
                textView = m0Var.f17421b;
            }
            textView.setText(a10);
        }
        return m7.n.f16010a;
    }
}
