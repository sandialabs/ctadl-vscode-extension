package com.noto.app.widget;

import android.widget.LinearLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.j0;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "radius", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigActivity$setupState$8", f = "NoteListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteListWidgetConfigActivity$setupState$8 extends SuspendLambda implements p<Integer, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ int f10074m;
    public final /* synthetic */ j0 n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NoteListWidgetConfigActivity f10075o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigActivity$setupState$8(j0 j0Var, NoteListWidgetConfigActivity noteListWidgetConfigActivity, p7.c<? super NoteListWidgetConfigActivity$setupState$8> cVar) {
        super(2, cVar);
        this.n = j0Var;
        this.f10075o = noteListWidgetConfigActivity;
    }

    @Override // u7.p
    public final Object R(Integer num, p7.c<? super n> cVar) {
        return ((NoteListWidgetConfigActivity$setupState$8) a(Integer.valueOf(num.intValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NoteListWidgetConfigActivity$setupState$8 noteListWidgetConfigActivity$setupState$8 = new NoteListWidgetConfigActivity$setupState$8(this.n, this.f10075o, cVar);
        noteListWidgetConfigActivity$setupState$8.f10074m = ((Number) obj).intValue();
        return noteListWidgetConfigActivity$setupState$8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        int i10 = this.f10074m;
        j0 j0Var = this.n;
        j0Var.f17396g.setValue(i10);
        LinearLayout linearLayout = j0Var.f17403o.f17381d;
        int Q1 = a1.c.Q1(i10);
        NoteListWidgetConfigActivity noteListWidgetConfigActivity = this.f10075o;
        linearLayout.setBackground(q.c(noteListWidgetConfigActivity, Q1));
        j0Var.f17403o.f17383f.setBackground(q.c(noteListWidgetConfigActivity, a1.c.P1(i10)));
        return n.f16010a;
    }
}
