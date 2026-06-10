package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import ja.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteViewModel$copyNote$1", f = "NoteViewModel.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteViewModel$copyNote$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9287m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NoteViewModel f9288o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ long f9289p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$copyNote$1(NoteViewModel noteViewModel, long j2, p7.c<? super NoteViewModel$copyNote$1> cVar) {
        super(2, cVar);
        this.f9288o = noteViewModel;
        this.f9289p = j2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((NoteViewModel$copyNote$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteViewModel$copyNote$1 noteViewModel$copyNote$1 = new NoteViewModel$copyNote$1(this.f9288o, this.f9289p, cVar);
        noteViewModel$copyNote$1.n = obj;
        return noteViewModel$copyNote$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Object g10;
        x xVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9287m;
        NoteViewModel noteViewModel = this.f9288o;
        if (i10 != 0) {
            if (i10 == 1) {
                xVar = (x) this.n;
                m0.b.n1(obj);
                g10 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            x xVar2 = (x) this.n;
            u6.d dVar = noteViewModel.f9259e;
            t6.d a10 = t6.d.a((t6.d) noteViewModel.h().getValue(), 0L, this.f9289p, null, null, 0, false, false, null, null, 0, 4092);
            this.n = xVar2;
            this.f9287m = 1;
            g10 = dVar.g(a10, true, this);
            if (g10 == coroutineSingletons) {
                return coroutineSingletons;
            }
            xVar = xVar2;
        }
        long longValue = ((Number) g10).longValue();
        ArrayList h10 = ModelUtilsKt.h((Map) ((kotlinx.coroutines.flow.m) noteViewModel.f()).getValue());
        NoteViewModel noteViewModel2 = this.f9288o;
        long j2 = this.f9289p;
        Iterator it = h10.iterator();
        while (it.hasNext()) {
            m0.b.M0(xVar, null, null, new NoteViewModel$copyNote$1$1$1(noteViewModel2, j2, (t6.c) it.next(), longValue, null), 3);
            j2 = j2;
        }
        return m7.n.f16010a;
    }
}
