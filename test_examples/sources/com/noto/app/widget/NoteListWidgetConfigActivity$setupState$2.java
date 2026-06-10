package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.appbar.MaterialToolbar;
import com.noto.R;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.j0;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isCreated", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigActivity$setupState$2", f = "NoteListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteListWidgetConfigActivity$setupState$2 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f10061m;
    public final /* synthetic */ j0 n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NoteListWidgetConfigActivity f10062o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigActivity$setupState$2(j0 j0Var, NoteListWidgetConfigActivity noteListWidgetConfigActivity, p7.c<? super NoteListWidgetConfigActivity$setupState$2> cVar) {
        super(2, cVar);
        this.n = j0Var;
        this.f10062o = noteListWidgetConfigActivity;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((NoteListWidgetConfigActivity$setupState$2) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NoteListWidgetConfigActivity$setupState$2 noteListWidgetConfigActivity$setupState$2 = new NoteListWidgetConfigActivity$setupState$2(this.n, this.f10062o, cVar);
        noteListWidgetConfigActivity$setupState$2.f10061m = ((Boolean) obj).booleanValue();
        return noteListWidgetConfigActivity$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        String f10;
        b.n1(obj);
        if (this.f10061m) {
            j0 j0Var = this.n;
            MaterialToolbar materialToolbar = j0Var.f17401l;
            NoteListWidgetConfigActivity noteListWidgetConfigActivity = this.f10062o;
            f10 = q.f(noteListWidgetConfigActivity, R.string.edit_notes_widget, new Object[0]);
            materialToolbar.setTitle(f10);
            j0Var.f17392b.setText(q.f(noteListWidgetConfigActivity, R.string.update_widget, new Object[0]));
        }
        return n.f16010a;
    }
}
