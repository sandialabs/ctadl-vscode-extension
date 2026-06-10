package androidx.datastore.preferences.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lm3/a;", "it", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
@c(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PreferenceDataStore$updateData$2 extends SuspendLambda implements p<m3.a, p7.c<? super m3.a>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f4771m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p<m3.a, p7.c<? super m3.a>, Object> f4772o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStore$updateData$2(p<? super m3.a, ? super p7.c<? super m3.a>, ? extends Object> pVar, p7.c<? super PreferenceDataStore$updateData$2> cVar) {
        super(2, cVar);
        this.f4772o = pVar;
    }

    @Override // u7.p
    public final Object R(m3.a aVar, p7.c<? super m3.a> cVar) {
        return ((PreferenceDataStore$updateData$2) a(aVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.f4772o, cVar);
        preferenceDataStore$updateData$2.n = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4771m;
        if (i10 != 0) {
            if (i10 == 1) {
                b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b.n1(obj);
            this.f4771m = 1;
            obj = this.f4772o.R((m3.a) this.n, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        m3.a aVar = (m3.a) obj;
        ((MutablePreferences) aVar).f4768b.set(true);
        return aVar;
    }
}
