package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteViewModel$setNoteReminder$1", f = "NoteViewModel.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteViewModel$setNoteReminder$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9319m;
    public final /* synthetic */ NoteViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ na.c f9320o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$setNoteReminder$1(NoteViewModel noteViewModel, na.c cVar, p7.c<? super NoteViewModel$setNoteReminder$1> cVar2) {
        super(2, cVar2);
        this.n = noteViewModel;
        this.f9320o = cVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((NoteViewModel$setNoteReminder$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new NoteViewModel$setNoteReminder$1(this.n, this.f9320o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9319m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            NoteViewModel noteViewModel = this.n;
            u6.d dVar = noteViewModel.f9259e;
            t6.d a10 = t6.d.a((t6.d) noteViewModel.h().getValue(), 0L, 0L, null, null, 0, false, false, this.f9320o, null, 0, 3839);
            this.f9319m = 1;
            if (dVar.c(a10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return m7.n.f16010a;
    }
}
