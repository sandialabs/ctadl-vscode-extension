package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "body", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$24", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$24 extends SuspendLambda implements u7.p<String, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9085m;
    public final /* synthetic */ NoteFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$24(NoteFragment noteFragment, p7.c<? super NoteFragment$setupState$24> cVar) {
        super(2, cVar);
        this.n = noteFragment;
    }

    @Override // u7.p
    public final Object R(String str, p7.c<? super m7.n> cVar) {
        return ((NoteFragment$setupState$24) a(str, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteFragment$setupState$24 noteFragment$setupState$24 = new NoteFragment$setupState$24(this.n, cVar);
        noteFragment$setupState$24.f9085m = obj;
        return noteFragment$setupState$24;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        String str = (String) this.f9085m;
        int i10 = NoteFragment.f9026f0;
        NoteViewModel b02 = this.n.b0();
        b02.getClass();
        v7.g.f(str, "body");
        m0.b.M0(a1.b.d0(b02), null, null, new NoteViewModel$emitNewBodyOnly$1(b02, str, null), 3);
        return m7.n.f16010a;
    }
}
