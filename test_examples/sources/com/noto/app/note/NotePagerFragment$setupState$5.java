package com.noto.app.note;

import a3.d1;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isFullScreen", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NotePagerFragment$setupState$5", f = "NotePagerFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NotePagerFragment$setupState$5 extends SuspendLambda implements u7.p<Boolean, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9130m;
    public final /* synthetic */ NotePagerFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotePagerFragment$setupState$5(NotePagerFragment notePagerFragment, p7.c<? super NotePagerFragment$setupState$5> cVar) {
        super(2, cVar);
        this.n = notePagerFragment;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super m7.n> cVar) {
        return ((NotePagerFragment$setupState$5) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NotePagerFragment$setupState$5 notePagerFragment$setupState$5 = new NotePagerFragment$setupState$5(this.n, cVar);
        notePagerFragment$setupState$5.f9130m = ((Boolean) obj).booleanValue();
        return notePagerFragment$setupState$5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        boolean z10 = this.f9130m;
        NotePagerFragment notePagerFragment = this.n;
        if (z10) {
            int i10 = NotePagerFragment.f9109i0;
            d1 d1Var = (d1) notePagerFragment.f9112f0.getValue();
            if (d1Var != null) {
                d1Var.f169a.e();
            }
            d1 d1Var2 = (d1) notePagerFragment.f9112f0.getValue();
            if (d1Var2 != null) {
                d1Var2.f169a.a(7);
            }
        } else {
            int i11 = NotePagerFragment.f9109i0;
            d1 d1Var3 = (d1) notePagerFragment.f9112f0.getValue();
            if (d1Var3 != null) {
                d1Var3.f169a.f(7);
            }
        }
        return m7.n.f16010a;
    }
}
