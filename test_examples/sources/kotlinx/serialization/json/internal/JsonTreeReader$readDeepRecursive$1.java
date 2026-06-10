package kotlinx.serialization.json.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import m7.n;
import u7.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Lm7/a;", "Lm7/n;", "Lkotlinx/serialization/json/b;", "it", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements q<m7.a<n, kotlinx.serialization.json.b>, n, p7.c<? super kotlinx.serialization.json.b>, Object> {

    /* renamed from: k  reason: collision with root package name */
    public int f15681k;

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ m7.a f15682l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ d f15683m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(d dVar, p7.c<? super JsonTreeReader$readDeepRecursive$1> cVar) {
        super(3, cVar);
        this.f15683m = dVar;
    }

    @Override // u7.q
    public final Object O(m7.a<n, kotlinx.serialization.json.b> aVar, n nVar, p7.c<? super kotlinx.serialization.json.b> cVar) {
        n nVar2 = nVar;
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.f15683m, cVar);
        jsonTreeReader$readDeepRecursive$1.f15682l = aVar;
        return jsonTreeReader$readDeepRecursive$1.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15681k;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            m7.a aVar = this.f15682l;
            d dVar = this.f15683m;
            byte t10 = dVar.f15702a.t();
            if (t10 == 1) {
                return dVar.d(true);
            }
            if (t10 == 0) {
                return dVar.d(false);
            }
            if (t10 == 6) {
                this.f15681k = 1;
                obj = d.a(dVar, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (t10 == 8) {
                return dVar.c();
            } else {
                wa.a.p(dVar.f15702a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (kotlinx.serialization.json.b) obj;
    }
}
