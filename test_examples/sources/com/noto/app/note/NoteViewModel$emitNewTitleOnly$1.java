package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteViewModel$emitNewTitleOnly$1", f = "NoteViewModel.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteViewModel$emitNewTitleOnly$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9309m;
    public final /* synthetic */ NoteViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f9310o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$emitNewTitleOnly$1(NoteViewModel noteViewModel, String str, p7.c<? super NoteViewModel$emitNewTitleOnly$1> cVar) {
        super(2, cVar);
        this.n = noteViewModel;
        this.f9310o = str;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((NoteViewModel$emitNewTitleOnly$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new NoteViewModel$emitNewTitleOnly$1(this.n, this.f9310o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9309m;
        NoteViewModel noteViewModel = this.n;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            Integer num = new Integer(noteViewModel.f9276w);
            Integer num2 = new Integer(noteViewModel.f9277x);
            String str = this.f9310o;
            Triple triple = new Triple(num, num2, str);
            List<Triple> b5 = noteViewModel.e().b();
            if (!(b5 instanceof Collection) || !b5.isEmpty()) {
                for (Triple triple2 : b5) {
                    if (v7.g.a(triple2.f12974k, str)) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                kotlinx.coroutines.flow.p pVar = noteViewModel.n;
                this.f9309m = 1;
                if (pVar.c(triple, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        noteViewModel.f9274u.setValue(Boolean.FALSE);
        return m7.n.f16010a;
    }
}
