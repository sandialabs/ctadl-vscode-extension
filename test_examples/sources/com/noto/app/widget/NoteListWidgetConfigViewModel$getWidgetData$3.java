package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/c;", "", "", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigViewModel$getWidgetData$3", f = "NoteListWidgetConfigViewModel.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteListWidgetConfigViewModel$getWidgetData$3 extends SuspendLambda implements p<kotlinx.coroutines.flow.c<? super List<? extends Long>>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f10117m;
    public /* synthetic */ Object n;

    public NoteListWidgetConfigViewModel$getWidgetData$3(p7.c<? super NoteListWidgetConfigViewModel$getWidgetData$3> cVar) {
        super(2, cVar);
    }

    @Override // u7.p
    public final Object R(kotlinx.coroutines.flow.c<? super List<? extends Long>> cVar, p7.c<? super n> cVar2) {
        return ((NoteListWidgetConfigViewModel$getWidgetData$3) a(cVar, cVar2)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NoteListWidgetConfigViewModel$getWidgetData$3 noteListWidgetConfigViewModel$getWidgetData$3 = new NoteListWidgetConfigViewModel$getWidgetData$3(cVar);
        noteListWidgetConfigViewModel$getWidgetData$3.n = obj;
        return noteListWidgetConfigViewModel$getWidgetData$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f10117m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            EmptyList emptyList = EmptyList.f12981i;
            this.f10117m = 1;
            if (((kotlinx.coroutines.flow.c) this.n).c(emptyList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
