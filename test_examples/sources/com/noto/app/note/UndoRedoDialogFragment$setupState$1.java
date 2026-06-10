package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isScrolling", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.UndoRedoDialogFragment$setupState$1", f = "UndoRedoDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class UndoRedoDialogFragment$setupState$1 extends SuspendLambda implements u7.p<Boolean, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9384m;
    public final /* synthetic */ r n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndoRedoDialogFragment$setupState$1(r rVar, p7.c<? super UndoRedoDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = rVar;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super m7.n> cVar) {
        return ((UndoRedoDialogFragment$setupState$1) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        UndoRedoDialogFragment$setupState$1 undoRedoDialogFragment$setupState$1 = new UndoRedoDialogFragment$setupState$1(this.n, cVar);
        undoRedoDialogFragment$setupState$1.f9384m = ((Boolean) obj).booleanValue();
        return undoRedoDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        this.n.f17462b.f17311b.setSelected(this.f9384m);
        return m7.n.f16010a;
    }
}
