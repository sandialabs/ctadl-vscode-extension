package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.FilteringType;
import f7.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.j0;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/FilteringType;", "filteringType", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigActivity$setupState$9", f = "NoteListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteListWidgetConfigActivity$setupState$9 extends SuspendLambda implements p<FilteringType, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f10076m;
    public final /* synthetic */ j0 n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NoteListWidgetConfigActivity f10077o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigActivity$setupState$9(j0 j0Var, NoteListWidgetConfigActivity noteListWidgetConfigActivity, p7.c<? super NoteListWidgetConfigActivity$setupState$9> cVar) {
        super(2, cVar);
        this.n = j0Var;
        this.f10077o = noteListWidgetConfigActivity;
    }

    @Override // u7.p
    public final Object R(FilteringType filteringType, p7.c<? super n> cVar) {
        return ((NoteListWidgetConfigActivity$setupState$9) a(filteringType, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NoteListWidgetConfigActivity$setupState$9 noteListWidgetConfigActivity$setupState$9 = new NoteListWidgetConfigActivity$setupState$9(this.n, this.f10077o, cVar);
        noteListWidgetConfigActivity$setupState$9.f10076m = obj;
        return noteListWidgetConfigActivity$setupState$9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        String f10;
        b.n1(obj);
        MaterialTextView materialTextView = this.n.f17402m;
        int ordinal = ((FilteringType) this.f10076m).ordinal();
        if (ordinal == 0) {
            i10 = R.string.inclusive;
        } else if (ordinal == 1) {
            i10 = R.string.exclusive;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            i10 = R.string.strict;
        }
        f10 = q.f(this.f10077o, i10, new Object[0]);
        materialTextView.setText(f10);
        return n.f16010a;
    }
}
