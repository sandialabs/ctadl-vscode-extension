package com.noto.app.note;

import android.view.Window;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isScreenOn", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NotePagerFragment$setupState$4", f = "NotePagerFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NotePagerFragment$setupState$4 extends SuspendLambda implements u7.p<Boolean, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9129m;
    public final /* synthetic */ NotePagerFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotePagerFragment$setupState$4(NotePagerFragment notePagerFragment, p7.c<? super NotePagerFragment$setupState$4> cVar) {
        super(2, cVar);
        this.n = notePagerFragment;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super m7.n> cVar) {
        return ((NotePagerFragment$setupState$4) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NotePagerFragment$setupState$4 notePagerFragment$setupState$4 = new NotePagerFragment$setupState$4(this.n, cVar);
        notePagerFragment$setupState$4.f9129m = ((Boolean) obj).booleanValue();
        return notePagerFragment$setupState$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Window window;
        Window window2;
        m0.b.n1(obj);
        boolean z10 = this.f9129m;
        NotePagerFragment notePagerFragment = this.n;
        if (z10) {
            s c = notePagerFragment.c();
            if (c != null && (window2 = c.getWindow()) != null) {
                window2.addFlags(128);
            }
        } else {
            s c10 = notePagerFragment.c();
            if (c10 != null && (window = c10.getWindow()) != null) {
                window.clearFlags(128);
            }
        }
        return m7.n.f16010a;
    }
}
