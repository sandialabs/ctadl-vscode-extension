package androidx.datastore.preferences.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m3.a;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lm3/a;", "it", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
@c(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PreferencesKt$edit$2 extends SuspendLambda implements p<m3.a, p7.c<? super m3.a>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f4774m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p<MutablePreferences, p7.c<? super n>, Object> f4775o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferencesKt$edit$2(p<? super MutablePreferences, ? super p7.c<? super n>, ? extends Object> pVar, p7.c<? super PreferencesKt$edit$2> cVar) {
        super(2, cVar);
        this.f4775o = pVar;
    }

    @Override // u7.p
    public final Object R(m3.a aVar, p7.c<? super m3.a> cVar) {
        return ((PreferencesKt$edit$2) a(aVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.f4775o, cVar);
        preferencesKt$edit$2.n = obj;
        return preferencesKt$edit$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4774m;
        if (i10 != 0) {
            if (i10 == 1) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.n;
                b.n1(obj);
                return mutablePreferences;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.n1(obj);
        MutablePreferences mutablePreferences2 = new MutablePreferences((Map<a.C0185a<?>, Object>) d.P1(((m3.a) this.n).a()), false);
        this.n = mutablePreferences2;
        this.f4774m = 1;
        if (this.f4775o.R(mutablePreferences2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return mutablePreferences2;
    }
}
