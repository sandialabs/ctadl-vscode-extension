package kotlinx.coroutines.flow;

import ja.a1;
import ja.k1;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.s;
import la.c;
import la.f;

/* loaded from: classes.dex */
public final /* synthetic */ class e {

    /* renamed from: a */
    public static final kotlinx.coroutines.internal.r f15357a = new kotlinx.coroutines.internal.r("NO_VALUE");

    public static final p a(int i10, int i11, BufferOverflow bufferOverflow) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if ((i10 > 0 || i11 > 0 || bufferOverflow == BufferOverflow.SUSPEND) ? true : true) {
                    int i12 = i11 + i10;
                    if (i12 < 0) {
                        i12 = Integer.MAX_VALUE;
                    }
                    return new p(i10, i12, bufferOverflow);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
            }
            throw new IllegalArgumentException(androidx.activity.e.g("extraBufferCapacity cannot be negative, but was ", i11).toString());
        }
        throw new IllegalArgumentException(androidx.activity.e.g("replay cannot be negative, but was ", i10).toString());
    }

    public static /* synthetic */ p b(int i10, int i11, BufferOverflow bufferOverflow, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return a(i10, i11, bufferOverflow);
    }

    public static final r c(b bVar) {
        kotlinx.coroutines.flow.internal.a aVar;
        b i10;
        la.c.f15873e.getClass();
        int i11 = c.a.f15875b;
        if (1 >= i11) {
            i11 = 1;
        }
        int i12 = i11 - 1;
        boolean z10 = bVar instanceof kotlinx.coroutines.flow.internal.a;
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        if (z10 && (i10 = (aVar = (kotlinx.coroutines.flow.internal.a) bVar).i()) != null) {
            BufferOverflow bufferOverflow2 = aVar.f15425k;
            int i13 = aVar.f15424j;
            if (i13 != -3 && i13 != -2 && i13 != 0) {
                i12 = i13;
            } else if (bufferOverflow2 != bufferOverflow || i13 == 0) {
                i12 = 0;
            }
            return new r(i12, aVar.f15423i, bufferOverflow2, i10);
        }
        return new r(i12, EmptyCoroutineContext.f13021i, bufferOverflow, bVar);
    }

    public static final b d(b bVar) {
        return new kotlinx.coroutines.flow.internal.d(new FlowKt__DelayKt$debounceInternal$1(new FlowKt__DelayKt$debounce$2(), bVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0082 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:83:0x002d, B:96:0x0063, B:98:0x0067, B:100:0x006b, B:103:0x0071, B:113:0x0081, B:114:0x0082, B:116:0x0086, B:119:0x0095, B:121:0x0099, B:123:0x00a0, B:124:0x00a1, B:125:0x00b8, B:88:0x0042), top: B:135:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0067 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:83:0x002d, B:96:0x0063, B:98:0x0067, B:100:0x006b, B:103:0x0071, B:113:0x0081, B:114:0x0082, B:116:0x0086, B:119:0x0095, B:121:0x0099, B:123:0x00a0, B:124:0x00a1, B:125:0x00b8, B:88:0x0042), top: B:135:0x0021 }] */
    /* JADX WARN: Type inference failed for: r8v5, types: [la.m] */
    /* JADX WARN: Type inference failed for: r8v7, types: [la.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0092 -> B:84:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(c cVar, la.c cVar2, boolean z10, p7.c cVar3) {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        int i10;
        la.c cVar4;
        Object obj;
        c cVar5;
        la.c cVar6;
        boolean z11;
        Throwable th;
        f.a aVar;
        Throwable th2;
        la.c cVar7;
        try {
            if (cVar3 instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
                flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1) cVar3;
                int i11 = flowKt__ChannelsKt$emitAllImpl$1.f15222p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    flowKt__ChannelsKt$emitAllImpl$1.f15222p = i11 - Integer.MIN_VALUE;
                    Object obj2 = flowKt__ChannelsKt$emitAllImpl$1.f15221o;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = flowKt__ChannelsKt$emitAllImpl$1.f15222p;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                z11 = flowKt__ChannelsKt$emitAllImpl$1.n;
                                ?? r82 = flowKt__ChannelsKt$emitAllImpl$1.f15220m;
                                cVar5 = flowKt__ChannelsKt$emitAllImpl$1.f15219l;
                                m0.b.n1(obj2);
                                la.c cVar8 = r82;
                                c cVar9 = cVar5;
                                z10 = z11;
                                cVar = cVar9;
                                cVar7 = cVar8;
                                try {
                                    flowKt__ChannelsKt$emitAllImpl$1.f15219l = cVar;
                                    flowKt__ChannelsKt$emitAllImpl$1.f15220m = cVar7;
                                    flowKt__ChannelsKt$emitAllImpl$1.n = z10;
                                    flowKt__ChannelsKt$emitAllImpl$1.f15222p = 1;
                                    obj = cVar7.k(flowKt__ChannelsKt$emitAllImpl$1);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    boolean z12 = z10;
                                    cVar5 = cVar;
                                    z11 = z12;
                                    cVar6 = cVar7;
                                    if (obj instanceof f.a) {
                                        if (obj instanceof f.a) {
                                            aVar = (f.a) obj;
                                        } else {
                                            aVar = null;
                                        }
                                        if (aVar != null) {
                                            th2 = aVar.f15879a;
                                        } else {
                                            th2 = null;
                                        }
                                        if (th2 == null) {
                                            if (z11) {
                                                a1.b.t(cVar6, null);
                                            }
                                            return m7.n.f16010a;
                                        }
                                        throw th2;
                                    } else if (!(obj instanceof f.b)) {
                                        flowKt__ChannelsKt$emitAllImpl$1.f15219l = cVar5;
                                        flowKt__ChannelsKt$emitAllImpl$1.f15220m = cVar6;
                                        flowKt__ChannelsKt$emitAllImpl$1.n = z11;
                                        flowKt__ChannelsKt$emitAllImpl$1.f15222p = 2;
                                        cVar8 = cVar6;
                                        if (cVar5.c(obj, flowKt__ChannelsKt$emitAllImpl$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        c cVar92 = cVar5;
                                        z10 = z11;
                                        cVar = cVar92;
                                        cVar7 = cVar8;
                                        flowKt__ChannelsKt$emitAllImpl$1.f15219l = cVar;
                                        flowKt__ChannelsKt$emitAllImpl$1.f15220m = cVar7;
                                        flowKt__ChannelsKt$emitAllImpl$1.n = z10;
                                        flowKt__ChannelsKt$emitAllImpl$1.f15222p = 1;
                                        obj = cVar7.k(flowKt__ChannelsKt$emitAllImpl$1);
                                        if (obj == coroutineSingletons) {
                                        }
                                    } else if ((obj instanceof f.a) && (th = ((f.a) obj).f15879a) != null) {
                                        throw th;
                                    } else {
                                        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
                                    }
                                } catch (Throwable th3) {
                                    boolean z13 = z10;
                                    th = th3;
                                    cVar = z13;
                                    cVar4 = cVar7;
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        if (cVar != null) {
                                            a1.b.t(cVar4, th);
                                        }
                                        throw th4;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            z11 = flowKt__ChannelsKt$emitAllImpl$1.n;
                            ?? r83 = flowKt__ChannelsKt$emitAllImpl$1.f15220m;
                            cVar5 = flowKt__ChannelsKt$emitAllImpl$1.f15219l;
                            m0.b.n1(obj2);
                            obj = ((la.f) obj2).f15878a;
                            cVar6 = r83;
                            if (obj instanceof f.a) {
                            }
                        }
                    } else {
                        m0.b.n1(obj2);
                        cVar7 = cVar2;
                        if (cVar instanceof x) {
                            ((x) cVar).getClass();
                            throw null;
                        }
                        flowKt__ChannelsKt$emitAllImpl$1.f15219l = cVar;
                        flowKt__ChannelsKt$emitAllImpl$1.f15220m = cVar7;
                        flowKt__ChannelsKt$emitAllImpl$1.n = z10;
                        flowKt__ChannelsKt$emitAllImpl$1.f15222p = 1;
                        obj = cVar7.k(flowKt__ChannelsKt$emitAllImpl$1);
                        if (obj == coroutineSingletons) {
                        }
                    }
                }
            }
            if (i10 == 0) {
            }
        } catch (Throwable th5) {
            th = th5;
            cVar4 = cVar2;
        }
        flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(cVar3);
        Object obj22 = flowKt__ChannelsKt$emitAllImpl$1.f15221o;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = flowKt__ChannelsKt$emitAllImpl$1.f15222p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [ja.a, ja.k1] */
    public static final k1 f(ja.x xVar, CoroutineContext coroutineContext, b bVar, j jVar, s sVar, Object obj) {
        CoroutineStart coroutineStart;
        boolean z10;
        a1 a1Var;
        if (v7.g.a(sVar, s.a.f15449a)) {
            coroutineStart = CoroutineStart.DEFAULT;
        } else {
            coroutineStart = CoroutineStart.UNDISPATCHED;
        }
        FlowKt__ShareKt$launchSharing$1 flowKt__ShareKt$launchSharing$1 = new FlowKt__ShareKt$launchSharing$1(sVar, bVar, jVar, obj, null);
        CoroutineContext c = CoroutineContextKt.c(xVar, coroutineContext);
        if (coroutineStart == CoroutineStart.LAZY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a1Var = new a1(c, flowKt__ShareKt$launchSharing$1);
        } else {
            a1Var = new k1(c, true);
        }
        a1Var.D0(coroutineStart, a1Var, flowKt__ShareKt$launchSharing$1);
        return a1Var;
    }
}
