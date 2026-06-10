package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.b0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lm7/n;", "it", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$31", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$31 extends SuspendLambda implements u7.p<m7.n, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f9094m;
    public final /* synthetic */ b0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$31(b0 b0Var, NoteFragment noteFragment, p7.c cVar) {
        super(2, cVar);
        this.f9094m = noteFragment;
        this.n = b0Var;
    }

    @Override // u7.p
    public final Object R(m7.n nVar, p7.c<? super m7.n> cVar) {
        return ((NoteFragment$setupState$31) a(nVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new NoteFragment$setupState$31(this.n, this.f9094m, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        int i10 = NoteFragment.f9026f0;
        NoteViewModel b02 = this.f9094m.b0();
        int scrollY = this.n.f17303j.getScrollY();
        b02.getClass();
        m0.b.M0(a1.b.d0(b02), null, null, new NoteViewModel$updateNoteScrollingPosition$1(b02, scrollY, null), 3);
        return m7.n.f16010a;
    }
}
