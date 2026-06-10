package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.time.Clock;
import j$.time.Instant;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteViewModel$updateNoteAccessDate$1", f = "NoteViewModel.kt", l = {196, 197}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteViewModel$updateNoteAccessDate$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9325m;
    public final /* synthetic */ NoteViewModel n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$updateNoteAccessDate$1(NoteViewModel noteViewModel, p7.c<? super NoteViewModel$updateNoteAccessDate$1> cVar) {
        super(2, cVar);
        this.n = noteViewModel;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((NoteViewModel$updateNoteAccessDate$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new NoteViewModel$updateNoteAccessDate$1(this.n, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9325m;
        NoteViewModel noteViewModel = this.n;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    m0.b.n1(obj);
                    return m7.n.f16010a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0.b.n1(obj);
            c = obj;
        } else {
            m0.b.n1(obj);
            kotlinx.coroutines.flow.b<t6.d> f10 = noteViewModel.f9259e.f(noteViewModel.f9264j);
            this.f9325m = 1;
            c = FlowKt__ReduceKt.c(f10, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        t6.d dVar = (t6.d) c;
        if (dVar != null) {
            u6.d dVar2 = noteViewModel.f9259e;
            na.c.Companion.getClass();
            Instant instant = Clock.systemUTC().instant();
            v7.g.e(instant, "systemUTC().instant()");
            t6.d a10 = t6.d.a(dVar, 0L, 0L, null, null, 0, false, false, null, new na.c(instant), 0, 3071);
            this.f9325m = 2;
            if (dVar2.c(a10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return m7.n.f16010a;
    }
}
