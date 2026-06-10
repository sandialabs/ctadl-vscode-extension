package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$getWidgetData$1", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListWidgetConfigViewModel$getWidgetData$1 extends SuspendLambda implements p<t6.a, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f10113m;
    public final /* synthetic */ NoteListWidgetConfigViewModel n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigViewModel$getWidgetData$1(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super NoteListWidgetConfigViewModel$getWidgetData$1> cVar) {
        super(2, cVar);
        this.n = noteListWidgetConfigViewModel;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super n> cVar) {
        return ((NoteListWidgetConfigViewModel$getWidgetData$1) a(aVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NoteListWidgetConfigViewModel$getWidgetData$1 noteListWidgetConfigViewModel$getWidgetData$1 = new NoteListWidgetConfigViewModel$getWidgetData$1(this.n, cVar);
        noteListWidgetConfigViewModel$getWidgetData$1.f10113m = obj;
        return noteListWidgetConfigViewModel$getWidgetData$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        this.n.f10086j.setValue((t6.a) this.f10113m);
        return n.f16010a;
    }
}
