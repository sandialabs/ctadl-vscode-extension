package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lja/x;", "Lkotlinx/coroutines/flow/c;", "downstream", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {222, 355}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements u7.q<ja.x, c<Object>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public Ref$ObjectRef f15225m;
    public Ref$LongRef n;

    /* renamed from: o  reason: collision with root package name */
    public int f15226o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f15227p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f15228q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ u7.l<Object, Long> f15229r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ b<Object> f15230s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(u7.l<Object, Long> lVar, b<Object> bVar, p7.c<? super FlowKt__DelayKt$debounceInternal$1> cVar) {
        super(3, cVar);
        this.f15229r = lVar;
        this.f15230s = bVar;
    }

    @Override // u7.q
    public final Object O(ja.x xVar, c<Object> cVar, p7.c<? super m7.n> cVar2) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.f15229r, this.f15230s, cVar2);
        flowKt__DelayKt$debounceInternal$1.f15227p = xVar;
        flowKt__DelayKt$debounceInternal$1.f15228q = cVar;
        return flowKt__DelayKt$debounceInternal$1.k(m7.n.f16010a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:59|27|28|29|30|(1:32)|33|34|35|(1:37)(3:38|7|(11:9|(5:11|(1:13)|14|(1:16)(1:53)|(2:51|52)(1:(4:19|(1:21)|22|(1:24)(10:26|27|28|29|30|(0)|33|34|35|(0)(0)))))|54|28|29|30|(0)|33|34|35|(0)(0))(2:55|56))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0101, code lost:
        if (r11.m() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
        r11.t(m0.b.Q(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010d, code lost:
        if ((r0 instanceof java.util.concurrent.CancellationException) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010f, code lost:
        r12 = r11.N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
        if ((r12 instanceof ja.s) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011d, code lost:
        m0.b.v0(r11.f(), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5 A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:37:0x00e1, B:39:0x00e5, B:40:0x00ef), top: B:59:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Type inference failed for: r8v10, types: [la.m] */
    /* JADX WARN: Type inference failed for: r8v2, types: [la.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x012b -> B:12:0x006a). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        c cVar;
        Ref$ObjectRef ref$ObjectRef;
        Object obj2;
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1;
        Object obj3;
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f15226o;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ref$ObjectRef = this.f15225m;
                    cVar = (c) this.f15227p;
                    m0.b.n1(obj);
                    obj2 = (la.m) this.f15228q;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Ref$LongRef ref$LongRef = this.n;
                Ref$ObjectRef ref$ObjectRef2 = this.f15225m;
                ?? r82 = (la.m) this.f15228q;
                m0.b.n1(obj);
                c cVar2 = (c) this.f15227p;
                flowKt__DelayKt$debounceInternal$1 = this;
                ref$ObjectRef2.f13060i = null;
                Ref$LongRef ref$LongRef2 = ref$LongRef;
                CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                Ref$LongRef ref$LongRef3 = ref$LongRef2;
                flowKt__DelayKt$debounceInternal$1.f15227p = cVar2;
                flowKt__DelayKt$debounceInternal$1.f15228q = r82;
                flowKt__DelayKt$debounceInternal$1.f15225m = ref$ObjectRef2;
                flowKt__DelayKt$debounceInternal$1.n = ref$LongRef3;
                flowKt__DelayKt$debounceInternal$1.f15226o = 2;
                kotlinx.coroutines.selects.a aVar = new kotlinx.coroutines.selects.a(flowKt__DelayKt$debounceInternal$1);
                if (ref$ObjectRef2.f13060i != null) {
                    aVar.P(ref$LongRef3.f13059i, new FlowKt__DelayKt$debounceInternal$1$3$1(null, ref$ObjectRef2, cVar2));
                }
                r82.x().s(aVar, new FlowKt__DelayKt$debounceInternal$1$3$2(null, ref$ObjectRef2, cVar2));
                if (aVar.N() == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                coroutineSingletons = coroutineSingletons2;
                ref$ObjectRef = ref$ObjectRef2;
                obj3 = r82;
                cVar = cVar2;
                if (ref$ObjectRef.f13060i == ma.i.f16037d) {
                    Ref$LongRef ref$LongRef4 = new Ref$LongRef();
                    Object obj4 = ref$ObjectRef.f13060i;
                    if (obj4 != null) {
                        kotlinx.coroutines.internal.r rVar = ma.i.f16036b;
                        if (obj4 == rVar) {
                            obj4 = null;
                        }
                        long longValue = flowKt__DelayKt$debounceInternal$1.f15229r.U(obj4).longValue();
                        ref$LongRef4.f13059i = longValue;
                        int i11 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                        if (i11 >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if (i11 == 0) {
                                Object obj5 = ref$ObjectRef.f13060i;
                                if (obj5 == rVar) {
                                    obj5 = null;
                                }
                                flowKt__DelayKt$debounceInternal$1.f15227p = cVar;
                                flowKt__DelayKt$debounceInternal$1.f15228q = obj3;
                                flowKt__DelayKt$debounceInternal$1.f15225m = ref$ObjectRef;
                                flowKt__DelayKt$debounceInternal$1.n = ref$LongRef4;
                                flowKt__DelayKt$debounceInternal$1.f15226o = 1;
                                if (cVar.c(obj5, flowKt__DelayKt$debounceInternal$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                Object obj6 = obj3;
                                ref$ObjectRef2 = ref$ObjectRef;
                                ref$LongRef = ref$LongRef4;
                                cVar2 = cVar;
                                r82 = obj6;
                                ref$ObjectRef2.f13060i = null;
                                Ref$LongRef ref$LongRef22 = ref$LongRef;
                                CoroutineSingletons coroutineSingletons22 = coroutineSingletons;
                                Ref$LongRef ref$LongRef32 = ref$LongRef22;
                                flowKt__DelayKt$debounceInternal$1.f15227p = cVar2;
                                flowKt__DelayKt$debounceInternal$1.f15228q = r82;
                                flowKt__DelayKt$debounceInternal$1.f15225m = ref$ObjectRef2;
                                flowKt__DelayKt$debounceInternal$1.n = ref$LongRef32;
                                flowKt__DelayKt$debounceInternal$1.f15226o = 2;
                                kotlinx.coroutines.selects.a aVar2 = new kotlinx.coroutines.selects.a(flowKt__DelayKt$debounceInternal$1);
                                if (ref$ObjectRef2.f13060i != null) {
                                }
                                r82.x().s(aVar2, new FlowKt__DelayKt$debounceInternal$1$3$2(null, ref$ObjectRef2, cVar2));
                                if (aVar2.N() == coroutineSingletons22) {
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
                        }
                    }
                    Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                    coroutineSingletons22 = coroutineSingletons;
                    ref$LongRef32 = ref$LongRef4;
                    cVar2 = cVar;
                    r82 = obj3;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    flowKt__DelayKt$debounceInternal$1.f15227p = cVar2;
                    flowKt__DelayKt$debounceInternal$1.f15228q = r82;
                    flowKt__DelayKt$debounceInternal$1.f15225m = ref$ObjectRef2;
                    flowKt__DelayKt$debounceInternal$1.n = ref$LongRef32;
                    flowKt__DelayKt$debounceInternal$1.f15226o = 2;
                    kotlinx.coroutines.selects.a aVar22 = new kotlinx.coroutines.selects.a(flowKt__DelayKt$debounceInternal$1);
                    if (ref$ObjectRef2.f13060i != null) {
                    }
                    r82.x().s(aVar22, new FlowKt__DelayKt$debounceInternal$1$3$2(null, ref$ObjectRef2, cVar2));
                    if (aVar22.N() == coroutineSingletons22) {
                    }
                } else {
                    return m7.n.f16010a;
                }
            }
        } else {
            m0.b.n1(obj);
            cVar = (c) this.f15228q;
            FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.f15230s, null);
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f13021i;
            BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
            CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
            ja.a jVar = new la.j(CoroutineContextKt.c((ja.x) this.f15227p, emptyCoroutineContext), a1.b.f(0, bufferOverflow, 4));
            jVar.D0(coroutineStart, jVar, flowKt__DelayKt$debounceInternal$1$values$1);
            ref$ObjectRef = new Ref$ObjectRef();
            obj2 = jVar;
        }
        flowKt__DelayKt$debounceInternal$1 = this;
        obj3 = obj2;
        if (ref$ObjectRef.f13060i == ma.i.f16037d) {
        }
    }
}
