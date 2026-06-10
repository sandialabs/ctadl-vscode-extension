package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$22", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$22 extends SuspendLambda implements u7.p<CharSequence, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f9084m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$22(NoteFragment noteFragment, p7.c<? super NoteFragment$setupState$22> cVar) {
        super(2, cVar);
        this.f9084m = noteFragment;
    }

    @Override // u7.p
    public final Object R(CharSequence charSequence, p7.c<? super m7.n> cVar) {
        return ((NoteFragment$setupState$22) a(charSequence, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new NoteFragment$setupState$22(this.f9084m, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        int i10 = NoteFragment.f9026f0;
        this.f9084m.b0().f9275v.setValue(Boolean.TRUE);
        return m7.n.f16010a;
    }
}
