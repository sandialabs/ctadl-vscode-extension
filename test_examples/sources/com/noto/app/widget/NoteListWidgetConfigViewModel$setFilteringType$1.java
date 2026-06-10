package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.FilteringType;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$setFilteringType$1", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteListWidgetConfigViewModel$setFilteringType$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ NoteListWidgetConfigViewModel f10120m;
    public final /* synthetic */ FilteringType n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigViewModel$setFilteringType$1(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, FilteringType filteringType, p7.c<? super NoteListWidgetConfigViewModel$setFilteringType$1> cVar) {
        super(2, cVar);
        this.f10120m = noteListWidgetConfigViewModel;
        this.n = filteringType;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((NoteListWidgetConfigViewModel$setFilteringType$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new NoteListWidgetConfigViewModel$setFilteringType$1(this.f10120m, this.n, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        this.f10120m.f10094s.setValue(this.n);
        return n.f16010a;
    }
}
