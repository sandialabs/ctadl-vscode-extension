package com.noto.app.note;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.datastore.preferences.PreferencesProto$Value;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteReminderDialogFragment$setupState$1", f = "NoteReminderDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteReminderDialogFragment$setupState$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9184m;
    public final /* synthetic */ NoteReminderDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ m0 f9185o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteReminderDialogFragment$setupState$1(NoteReminderDialogFragment noteReminderDialogFragment, m0 m0Var, p7.c<? super NoteReminderDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = noteReminderDialogFragment;
        this.f9185o = m0Var;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((NoteReminderDialogFragment$setupState$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteReminderDialogFragment$setupState$1 noteReminderDialogFragment$setupState$1 = new NoteReminderDialogFragment$setupState$1(this.n, this.f9185o, cVar);
        noteReminderDialogFragment$setupState$1.f9184m = obj;
        return noteReminderDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f9184m;
        int i10 = NoteReminderDialogFragment.f9176x0;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = q.b(j2, q.j(aVar.f17595e));
            m0 m0Var = this.f9185o;
            Drawable background = m0Var.c.f17312d.getBackground();
            if (background != null && (mutate = background.mutate()) != null) {
                mutate.setTint(b5);
            }
            m0Var.c.c.setTextColor(b5);
            m0Var.f17422d.setBoxStrokeColor(b5);
            Drawable background2 = m0Var.f17420a.getBackground();
            if (background2 != null) {
                background2.setTint(b5);
            }
        }
        return m7.n.f16010a;
    }
}
