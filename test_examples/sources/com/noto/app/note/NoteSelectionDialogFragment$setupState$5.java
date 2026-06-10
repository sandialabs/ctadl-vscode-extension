package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "position", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteSelectionDialogFragment$setupState$5", f = "NoteSelectionDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteSelectionDialogFragment$setupState$5 extends SuspendLambda implements u7.p<Integer, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ int f9256m;
    public final /* synthetic */ n0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteSelectionDialogFragment$setupState$5(n0 n0Var, p7.c<? super NoteSelectionDialogFragment$setupState$5> cVar) {
        super(2, cVar);
        this.n = n0Var;
    }

    @Override // u7.p
    public final Object R(Integer num, p7.c<? super m7.n> cVar) {
        return ((NoteSelectionDialogFragment$setupState$5) a(Integer.valueOf(num.intValue()), cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteSelectionDialogFragment$setupState$5 noteSelectionDialogFragment$setupState$5 = new NoteSelectionDialogFragment$setupState$5(this.n, cVar);
        noteSelectionDialogFragment$setupState$5.f9256m = ((Number) obj).intValue();
        return noteSelectionDialogFragment$setupState$5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        this.n.f17431b.j0(this.f9256m);
        return m7.n.f16010a;
    }
}
