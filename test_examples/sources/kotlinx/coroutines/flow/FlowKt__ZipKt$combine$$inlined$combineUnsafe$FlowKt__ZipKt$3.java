package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 implements b<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b[] f15312i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.t f15313j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/c;", "", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    @q7.c(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {333, 333}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements u7.q<c<Object>, Object[], p7.c<? super m7.n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f15314m;
        public /* synthetic */ c n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object[] f15315o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ u7.t f15316p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(p7.c cVar, u7.t tVar) {
            super(3, cVar);
            this.f15316p = tVar;
        }

        @Override // u7.q
        public final Object O(c<Object> cVar, Object[] objArr, p7.c<? super m7.n> cVar2) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar2, this.f15316p);
            anonymousClass2.n = cVar;
            anonymousClass2.f15315o = objArr;
            return anonymousClass2.k(m7.n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            c cVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f15314m;
            if (i10 == 0) {
                m0.b.n1(obj);
                cVar = this.n;
                Object[] objArr = this.f15315o;
                u7.t tVar = this.f15316p;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                Object obj6 = objArr[4];
                this.n = cVar;
                this.f15314m = 1;
                obj = tVar.E(obj2, obj3, obj4, obj5, obj6, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    m0.b.n1(obj);
                    return m7.n.f16010a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                cVar = this.n;
                m0.b.n1(obj);
            }
            this.n = null;
            this.f15314m = 2;
            if (cVar.c(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return m7.n.f16010a;
        }
    }

    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(b[] bVarArr, u7.t tVar) {
        this.f15312i = bVarArr;
        this.f15313j = tVar;
    }

    @Override // kotlinx.coroutines.flow.b
    public final Object a(c<? super Object> cVar, p7.c cVar2) {
        Object a10 = kotlinx.coroutines.flow.internal.c.a(cVar2, FlowKt__ZipKt$nullArrayFactory$1.f15320j, new AnonymousClass2(null, this.f15313j), cVar, this.f15312i);
        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a10;
        }
        return m7.n.f16010a;
    }
}
