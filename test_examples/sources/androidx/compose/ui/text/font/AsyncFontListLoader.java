package androidx.compose.ui.text.font;

import g0.g1;
import g0.k0;
import ja.w;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.TimeoutKt;
import m7.n;
import u1.d;
import u1.p;
import u1.w;
import u1.y;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class AsyncFontListLoader implements g1<Object> {

    /* renamed from: i  reason: collision with root package name */
    public final List<d> f4086i;

    /* renamed from: j  reason: collision with root package name */
    public final w f4087j;

    /* renamed from: k  reason: collision with root package name */
    public final a f4088k;

    /* renamed from: l  reason: collision with root package name */
    public final l<y.b, n> f4089l;

    /* renamed from: m  reason: collision with root package name */
    public final p f4090m;
    public final k0 n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4091o;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends d> list, Object obj, w wVar, a aVar, l<? super y.b, n> lVar, p pVar) {
        g.f(obj, "initialType");
        g.f(aVar, "asyncTypefaceCache");
        g.f(lVar, "onCompletion");
        this.f4086i = list;
        this.f4087j = wVar;
        this.f4088k = aVar;
        this.f4089l = lVar;
        this.f4090m = pVar;
        this.n = a1.c.V0(obj);
        this.f4091o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:37:0x0094, B:42:0x00c3, B:20:0x004a), top: B:56:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3 A[Catch: all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:37:0x0094, B:42:0x00c3, B:20:0x004a), top: B:56:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0070 -> B:47:0x00d9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00d6 -> B:46:0x00d7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p7.c<? super n> cVar) {
        AsyncFontListLoader$load$1 asyncFontListLoader$load$1;
        int i10;
        AsyncFontListLoader asyncFontListLoader;
        List<d> list;
        int size;
        AsyncFontListLoader asyncFontListLoader2;
        int i11;
        AsyncFontListLoader asyncFontListLoader3;
        d dVar;
        List<d> list2;
        boolean z10;
        if (cVar instanceof AsyncFontListLoader$load$1) {
            asyncFontListLoader$load$1 = (AsyncFontListLoader$load$1) cVar;
            int i12 = asyncFontListLoader$load$1.f4098s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$load$1.f4098s = i12 - Integer.MIN_VALUE;
                Object obj = asyncFontListLoader$load$1.f4096q;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = asyncFontListLoader$load$1.f4098s;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            size = asyncFontListLoader$load$1.f4095p;
                            i11 = asyncFontListLoader$load$1.f4094o;
                            list2 = asyncFontListLoader$load$1.f4093m;
                            asyncFontListLoader = asyncFontListLoader$load$1.f4092l;
                            try {
                                m0.b.n1(obj);
                                list = list2;
                                asyncFontListLoader2 = asyncFontListLoader;
                                i11++;
                                if (i11 < size) {
                                    try {
                                        dVar = list.get(i11);
                                        if (dVar.b() == 2) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            a aVar = asyncFontListLoader2.f4088k;
                                            p pVar = asyncFontListLoader2.f4090m;
                                            AsyncFontListLoader$load$2$typeface$1 asyncFontListLoader$load$2$typeface$1 = new AsyncFontListLoader$load$2$typeface$1(asyncFontListLoader2, dVar, null);
                                            asyncFontListLoader$load$1.f4092l = asyncFontListLoader2;
                                            asyncFontListLoader$load$1.f4093m = list;
                                            asyncFontListLoader$load$1.n = dVar;
                                            asyncFontListLoader$load$1.f4094o = i11;
                                            asyncFontListLoader$load$1.f4095p = size;
                                            asyncFontListLoader$load$1.f4098s = 1;
                                            Object c = aVar.c(dVar, pVar, asyncFontListLoader$load$2$typeface$1, asyncFontListLoader$load$1);
                                            if (c == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            AsyncFontListLoader asyncFontListLoader4 = asyncFontListLoader2;
                                            list2 = list;
                                            obj = c;
                                            asyncFontListLoader3 = asyncFontListLoader4;
                                            if (obj == null) {
                                                w wVar = asyncFontListLoader3.f4087j;
                                                asyncFontListLoader3.n.setValue(v0.p.H(wVar.f17770d, obj, dVar, wVar.f17769b, wVar.c));
                                                n nVar = n.f16010a;
                                                CoroutineContext coroutineContext = asyncFontListLoader$load$1.f13036j;
                                                g.c(coroutineContext);
                                                boolean h02 = a1.b.h0(coroutineContext);
                                                asyncFontListLoader3.f4091o = false;
                                                asyncFontListLoader3.f4089l.U(new y.b(asyncFontListLoader3.getValue(), h02));
                                                return nVar;
                                            }
                                            asyncFontListLoader$load$1.f4092l = asyncFontListLoader3;
                                            asyncFontListLoader$load$1.f4093m = list2;
                                            asyncFontListLoader$load$1.n = null;
                                            asyncFontListLoader$load$1.f4094o = i11;
                                            asyncFontListLoader$load$1.f4095p = size;
                                            asyncFontListLoader$load$1.f4098s = 2;
                                            if (m0.b.J1(asyncFontListLoader$load$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            asyncFontListLoader = asyncFontListLoader3;
                                            list = list2;
                                            asyncFontListLoader2 = asyncFontListLoader;
                                        }
                                        i11++;
                                        if (i11 < size) {
                                            CoroutineContext coroutineContext2 = asyncFontListLoader$load$1.f13036j;
                                            g.c(coroutineContext2);
                                            boolean h03 = a1.b.h0(coroutineContext2);
                                            asyncFontListLoader2.f4091o = false;
                                            asyncFontListLoader2.f4089l.U(new y.b(asyncFontListLoader2.getValue(), h03));
                                            return n.f16010a;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        asyncFontListLoader = asyncFontListLoader2;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        size = asyncFontListLoader$load$1.f4095p;
                        i11 = asyncFontListLoader$load$1.f4094o;
                        d dVar2 = asyncFontListLoader$load$1.n;
                        List<d> list3 = asyncFontListLoader$load$1.f4093m;
                        asyncFontListLoader3 = asyncFontListLoader$load$1.f4092l;
                        try {
                            m0.b.n1(obj);
                            dVar = dVar2;
                            list2 = list3;
                            if (obj == null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            asyncFontListLoader = asyncFontListLoader3;
                        }
                    }
                } else {
                    m0.b.n1(obj);
                    try {
                        list = this.f4086i;
                        size = list.size();
                        asyncFontListLoader2 = this;
                        i11 = 0;
                        if (i11 < size) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        asyncFontListLoader = this;
                    }
                }
                CoroutineContext coroutineContext3 = asyncFontListLoader$load$1.f13036j;
                g.c(coroutineContext3);
                boolean h04 = a1.b.h0(coroutineContext3);
                asyncFontListLoader.f4091o = false;
                asyncFontListLoader.f4089l.U(new y.b(asyncFontListLoader.getValue(), h04));
                throw th;
            }
        }
        asyncFontListLoader$load$1 = new AsyncFontListLoader$load$1(this, cVar);
        Object obj2 = asyncFontListLoader$load$1.f4096q;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = asyncFontListLoader$load$1.f4098s;
        if (i10 == 0) {
        }
        CoroutineContext coroutineContext32 = asyncFontListLoader$load$1.f13036j;
        g.c(coroutineContext32);
        boolean h042 = a1.b.h0(coroutineContext32);
        asyncFontListLoader.f4091o = false;
        asyncFontListLoader.f4089l.U(new y.b(asyncFontListLoader.getValue(), h042));
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(d dVar, p7.c<Object> cVar) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        int i10;
        Object obj;
        CoroutineContext coroutineContext;
        try {
            if (cVar instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) cVar;
                int i11 = asyncFontListLoader$loadWithTimeoutOrNull$1.f4103o;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$loadWithTimeoutOrNull$1.f4103o = i11 - Integer.MIN_VALUE;
                    Object obj2 = asyncFontListLoader$loadWithTimeoutOrNull$1.f4102m;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = asyncFontListLoader$loadWithTimeoutOrNull$1.f4103o;
                    obj = null;
                    coroutineContext = asyncFontListLoader$loadWithTimeoutOrNull$1.f13036j;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            dVar = asyncFontListLoader$loadWithTimeoutOrNull$1.f4101l;
                            m0.b.n1(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        m0.b.n1(obj2);
                        AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, dVar, null);
                        asyncFontListLoader$loadWithTimeoutOrNull$1.f4101l = dVar;
                        asyncFontListLoader$loadWithTimeoutOrNull$1.f4103o = 1;
                        obj2 = TimeoutKt.b(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    obj = obj2;
                    return obj;
                }
            }
            if (i10 == 0) {
            }
            obj = obj2;
            return obj;
        } catch (CancellationException e10) {
            g.c(coroutineContext);
            if (a1.b.h0(coroutineContext)) {
                return obj;
            }
            throw e10;
        } catch (Exception e11) {
            g.c(coroutineContext);
            ja.w wVar = (ja.w) coroutineContext.a(w.a.f12807i);
            if (wVar != null) {
                wVar.M(coroutineContext, new IllegalStateException("Unable to load font " + dVar, e11));
                return obj;
            }
            return obj;
        }
        asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, cVar);
        Object obj22 = asyncFontListLoader$loadWithTimeoutOrNull$1.f4102m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = asyncFontListLoader$loadWithTimeoutOrNull$1.f4103o;
        obj = null;
        coroutineContext = asyncFontListLoader$loadWithTimeoutOrNull$1.f13036j;
    }

    @Override // g0.g1
    public final Object getValue() {
        return this.n.getValue();
    }
}
