package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import m0.b;
import m7.n;
import q7.c;
import t6.d;
import t6.e;
import u7.r;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\u008a@"}, d2 = {"", "Lt6/d;", "notes", "Lt6/c;", "labels", "Lt6/e;", "noteLabels", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$getWidgetData$2", f = "NoteListWidgetConfigViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListWidgetConfigViewModel$getWidgetData$2 extends SuspendLambda implements r<List<? extends d>, List<? extends t6.c>, List<? extends e>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ List f10114m;
    public /* synthetic */ List n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ List f10115o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ NoteListWidgetConfigViewModel f10116p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigViewModel$getWidgetData$2(NoteListWidgetConfigViewModel noteListWidgetConfigViewModel, p7.c<? super NoteListWidgetConfigViewModel$getWidgetData$2> cVar) {
        super(4, cVar);
        this.f10116p = noteListWidgetConfigViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        ArrayList x3;
        b.n1(obj);
        List list = this.f10114m;
        List list2 = this.n;
        List list3 = this.f10115o;
        StateFlowImpl stateFlowImpl = this.f10116p.f10087k;
        x3 = ModelUtilsKt.x(list, list2, list3, new long[0]);
        stateFlowImpl.setValue(x3);
        return n.f16010a;
    }

    @Override // u7.r
    public final Object l0(List<? extends d> list, List<? extends t6.c> list2, List<? extends e> list3, p7.c<? super n> cVar) {
        NoteListWidgetConfigViewModel$getWidgetData$2 noteListWidgetConfigViewModel$getWidgetData$2 = new NoteListWidgetConfigViewModel$getWidgetData$2(this.f10116p, cVar);
        noteListWidgetConfigViewModel$getWidgetData$2.f10114m = list;
        noteListWidgetConfigViewModel$getWidgetData$2.n = list2;
        noteListWidgetConfigViewModel$getWidgetData$2.f10115o = list3;
        return noteListWidgetConfigViewModel$getWidgetData$2.k(n.f16010a);
    }
}
