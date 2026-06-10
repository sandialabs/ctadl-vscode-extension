package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements b<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ u7.p f15246i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f15247j;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    @q7.c(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f15248l;

        /* renamed from: m  reason: collision with root package name */
        public int f15249m;

        /* renamed from: o  reason: collision with root package name */
        public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 f15250o;

        /* renamed from: p  reason: collision with root package name */
        public c f15251p;

        /* renamed from: q  reason: collision with root package name */
        public SafeCollector f15252q;

        public AnonymousClass1(p7.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            this.f15248l = obj;
            this.f15249m |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.a(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(u7.p pVar, b bVar) {
        this.f15246i = pVar;
        this.f15247j = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    @Override // kotlinx.coroutines.flow.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c<? super Object> cVar, p7.c<? super m7.n> cVar2) {
        AnonymousClass1 anonymousClass1;
        CoroutineSingletons coroutineSingletons;
        int i10;
        Throwable th;
        SafeCollector safeCollector;
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        c<? super Object> cVar3;
        b bVar;
        if (cVar2 instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar2;
            int i11 = anonymousClass1.f15249m;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f15249m = i11 - Integer.MIN_VALUE;
                Object obj = anonymousClass1.f15248l;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = anonymousClass1.f15249m;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            m0.b.n1(obj);
                            return m7.n.f16010a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    safeCollector = anonymousClass1.f15252q;
                    cVar3 = anonymousClass1.f15251p;
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = anonymousClass1.f15250o;
                    try {
                        m0.b.n1(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector.m();
                        throw th;
                    }
                } else {
                    m0.b.n1(obj);
                    CoroutineContext coroutineContext = anonymousClass1.f13036j;
                    v7.g.c(coroutineContext);
                    SafeCollector safeCollector2 = new SafeCollector(cVar, coroutineContext);
                    try {
                        u7.p pVar = this.f15246i;
                        anonymousClass1.f15250o = this;
                        anonymousClass1.f15251p = cVar;
                        anonymousClass1.f15252q = safeCollector2;
                        anonymousClass1.f15249m = 1;
                        if (pVar.R(safeCollector2, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this;
                        cVar3 = cVar;
                        safeCollector = safeCollector2;
                    } catch (Throwable th3) {
                        th = th3;
                        safeCollector = safeCollector2;
                        safeCollector.m();
                        throw th;
                    }
                }
                safeCollector.m();
                bVar = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f15247j;
                anonymousClass1.f15250o = null;
                anonymousClass1.f15251p = null;
                anonymousClass1.f15252q = null;
                anonymousClass1.f15249m = 2;
                if (bVar.a(cVar3, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return m7.n.f16010a;
            }
        }
        anonymousClass1 = new AnonymousClass1(cVar2);
        Object obj2 = anonymousClass1.f15248l;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = anonymousClass1.f15249m;
        if (i10 == 0) {
        }
        safeCollector.m();
        bVar = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f15247j;
        anonymousClass1.f15250o = null;
        anonymousClass1.f15251p = null;
        anonymousClass1.f15252q = null;
        anonymousClass1.f15249m = 2;
        if (bVar.a(cVar3, anonymousClass1) == coroutineSingletons) {
        }
        return m7.n.f16010a;
    }
}
