package com.noto.app.settings;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.settings.SettingsViewModel$toggleShowNotesCount$1", f = "SettingsViewModel.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SettingsViewModel$toggleShowNotesCount$1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9570m;
    public final /* synthetic */ c n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$toggleShowNotesCount$1(c cVar, p7.c<? super SettingsViewModel$toggleShowNotesCount$1> cVar2) {
        super(2, cVar2);
        this.n = cVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((SettingsViewModel$toggleShowNotesCount$1) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SettingsViewModel$toggleShowNotesCount$1(this.n, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9570m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            c cVar = this.n;
            this.f9570m = 1;
            if (cVar.f9663h.d0(!((Boolean) cVar.f9668m.getValue()).booleanValue(), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
