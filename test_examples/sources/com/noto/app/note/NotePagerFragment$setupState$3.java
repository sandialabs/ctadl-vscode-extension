package com.noto.app.note;

import android.app.NotificationManager;
import android.os.Build;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isDoNotDisturb", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NotePagerFragment$setupState$3", f = "NotePagerFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NotePagerFragment$setupState$3 extends SuspendLambda implements u7.p<Boolean, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9128m;
    public final /* synthetic */ NotePagerFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotePagerFragment$setupState$3(NotePagerFragment notePagerFragment, p7.c<? super NotePagerFragment$setupState$3> cVar) {
        super(2, cVar);
        this.n = notePagerFragment;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super m7.n> cVar) {
        return ((NotePagerFragment$setupState$3) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NotePagerFragment$setupState$3 notePagerFragment$setupState$3 = new NotePagerFragment$setupState$3(this.n, cVar);
        notePagerFragment$setupState$3.f9128m = ((Boolean) obj).booleanValue();
        return notePagerFragment$setupState$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean isNotificationPolicyAccessGranted;
        m0.b.n1(obj);
        if (this.f9128m && Build.VERSION.SDK_INT >= 23) {
            int i10 = NotePagerFragment.f9109i0;
            NotePagerFragment notePagerFragment = this.n;
            isNotificationPolicyAccessGranted = ((NotificationManager) notePagerFragment.f9113g0.getValue()).isNotificationPolicyAccessGranted();
            if (isNotificationPolicyAccessGranted) {
                ((NotificationManager) notePagerFragment.f9113g0.getValue()).setInterruptionFilter(2);
            }
        }
        return m7.n.f16010a;
    }
}
