package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.bottomappbar.BottomAppBar;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isVisible", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$32", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$32 extends SuspendLambda implements u7.p<Boolean, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9095m;
    public final /* synthetic */ b0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$32(b0 b0Var, p7.c<? super NoteFragment$setupState$32> cVar) {
        super(2, cVar);
        this.n = b0Var;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super m7.n> cVar) {
        return ((NoteFragment$setupState$32) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteFragment$setupState$32 noteFragment$setupState$32 = new NoteFragment$setupState$32(this.n, cVar);
        noteFragment$setupState$32.f9095m = ((Boolean) obj).booleanValue();
        return noteFragment$setupState$32;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        boolean z10 = this.f9095m;
        b0 b0Var = this.n;
        if (z10) {
            BottomAppBar bottomAppBar = b0Var.f17296b;
            bottomAppBar.getBehavior().t(bottomAppBar);
            b0Var.c.E();
        } else {
            b0Var.f17296b.E();
            BottomAppBar bottomAppBar2 = b0Var.c;
            bottomAppBar2.getBehavior().t(bottomAppBar2);
        }
        return m7.n.f16010a;
    }
}
