package androidx.datastore.core;

import androidx.datastore.preferences.core.MutablePreferences;
import j3.d;
import j3.f;
import j3.h;
import j3.i;
import j3.j;
import ja.q;
import ja.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.sync.MutexImpl;
import m7.e;
import p7.c;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class SingleProcessDataStore<T> implements d<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final LinkedHashSet f4674k = new LinkedHashSet();

    /* renamed from: l  reason: collision with root package name */
    public static final Object f4675l = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final u7.a<File> f4676a;

    /* renamed from: b  reason: collision with root package name */
    public final h<T> f4677b;
    public final j3.a<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final x f4678d;

    /* renamed from: e  reason: collision with root package name */
    public final n f4679e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4680f;

    /* renamed from: g  reason: collision with root package name */
    public final e f4681g;

    /* renamed from: h  reason: collision with root package name */
    public final StateFlowImpl f4682h;

    /* renamed from: i  reason: collision with root package name */
    public List<? extends p<? super f<T>, ? super c<? super m7.n>, ? extends Object>> f4683i;

    /* renamed from: j  reason: collision with root package name */
    public final SimpleActor<a<T>> f4684j;

    /* loaded from: classes.dex */
    public static abstract class a<T> {

        /* renamed from: androidx.datastore.core.SingleProcessDataStore$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0033a<T> extends a<T> {

            /* renamed from: a  reason: collision with root package name */
            public final i<T> f4688a;

            public C0033a(i<T> iVar) {
                this.f4688a = iVar;
            }
        }

        /* loaded from: classes.dex */
        public static final class b<T> extends a<T> {

            /* renamed from: a  reason: collision with root package name */
            public final p<T, c<? super T>, Object> f4689a;

            /* renamed from: b  reason: collision with root package name */
            public final ja.p<T> f4690b;
            public final i<T> c;

            /* renamed from: d  reason: collision with root package name */
            public final CoroutineContext f4691d;

            public b(p pVar, q qVar, i iVar, CoroutineContext coroutineContext) {
                g.f(coroutineContext, "callerContext");
                this.f4689a = pVar;
                this.f4690b = qVar;
                this.c = iVar;
                this.f4691d = coroutineContext;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends OutputStream {

        /* renamed from: i  reason: collision with root package name */
        public final FileOutputStream f4696i;

        public b(FileOutputStream fileOutputStream) {
            this.f4696i = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f4696i.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
            this.f4696i.write(i10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            g.f(bArr, "b");
            this.f4696i.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            g.f(bArr, "bytes");
            this.f4696i.write(bArr, i10, i11);
        }
    }

    public SingleProcessDataStore(u7.a aVar, List list, a1.c cVar, x xVar) {
        m3.b bVar = m3.b.f15976a;
        g.f(xVar, "scope");
        this.f4676a = aVar;
        this.f4677b = bVar;
        this.c = cVar;
        this.f4678d = xVar;
        this.f4679e = new n(new SingleProcessDataStore$data$1(this, null));
        this.f4680f = ".tmp";
        this.f4681g = kotlin.a.b(new SingleProcessDataStore$file$2(this));
        this.f4682h = kotlinx.coroutines.flow.f.a(j.f12672a);
        this.f4683i = kotlin.collections.c.L2(list);
        this.f4684j = new SimpleActor<>(xVar, new SingleProcessDataStore$actor$1(this), SingleProcessDataStore$actor$2.f4693j, new SingleProcessDataStore$actor$3(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(SingleProcessDataStore singleProcessDataStore, a.b bVar, c cVar) {
        SingleProcessDataStore$handleUpdate$1 singleProcessDataStore$handleUpdate$1;
        int i10;
        ja.p<T> pVar;
        SingleProcessDataStore singleProcessDataStore2;
        a.b bVar2;
        ja.p<T> pVar2;
        ja.p<T> pVar3;
        ja.p<T> pVar4;
        Throwable a10;
        singleProcessDataStore.getClass();
        if (cVar instanceof SingleProcessDataStore$handleUpdate$1) {
            singleProcessDataStore$handleUpdate$1 = (SingleProcessDataStore$handleUpdate$1) cVar;
            int i11 = singleProcessDataStore$handleUpdate$1.f4705q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$handleUpdate$1.f4705q = i11 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$handleUpdate$1.f4703o;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = singleProcessDataStore$handleUpdate$1.f4705q;
                boolean z10 = true;
                if (i10 == 0) {
                    try {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                pVar = singleProcessDataStore$handleUpdate$1.n;
                                singleProcessDataStore2 = singleProcessDataStore$handleUpdate$1.f4702m;
                                bVar2 = (a.b) singleProcessDataStore$handleUpdate$1.f4701l;
                                m0.b.n1(obj);
                                try {
                                    p<T, c<? super T>, Object> pVar5 = bVar2.f4689a;
                                    CoroutineContext coroutineContext = bVar2.f4691d;
                                    singleProcessDataStore$handleUpdate$1.f4701l = pVar;
                                    singleProcessDataStore$handleUpdate$1.f4702m = null;
                                    singleProcessDataStore$handleUpdate$1.n = null;
                                    singleProcessDataStore$handleUpdate$1.f4705q = 3;
                                    obj = singleProcessDataStore2.j(singleProcessDataStore$handleUpdate$1, coroutineContext, pVar5);
                                    pVar4 = pVar;
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    pVar3 = pVar;
                                    pVar2 = pVar3;
                                    obj = m0.b.Q(th);
                                    pVar4 = pVar2;
                                    a10 = Result.a(obj);
                                    if (a10 == null) {
                                    }
                                    return m7.n.f16010a;
                                }
                            }
                        }
                        ja.p<T> pVar6 = (ja.p) singleProcessDataStore$handleUpdate$1.f4701l;
                        m0.b.n1(obj);
                        pVar4 = pVar6;
                    } catch (Throwable th2) {
                        th = th2;
                        pVar2 = singleProcessDataStore;
                        obj = m0.b.Q(th);
                        pVar4 = pVar2;
                        a10 = Result.a(obj);
                        if (a10 == null) {
                        }
                        return m7.n.f16010a;
                    }
                } else {
                    m0.b.n1(obj);
                    pVar3 = bVar.f4690b;
                    try {
                        i<T> iVar = (i) singleProcessDataStore.f4682h.getValue();
                        if (iVar instanceof j3.b) {
                            p<T, c<? super T>, Object> pVar7 = bVar.f4689a;
                            CoroutineContext coroutineContext2 = bVar.f4691d;
                            singleProcessDataStore$handleUpdate$1.f4701l = pVar3;
                            singleProcessDataStore$handleUpdate$1.f4705q = 1;
                            Object j2 = singleProcessDataStore.j(singleProcessDataStore$handleUpdate$1, coroutineContext2, pVar7);
                            if (j2 != coroutineSingletons) {
                                obj = j2;
                                pVar4 = pVar3;
                            } else {
                                return coroutineSingletons;
                            }
                        } else {
                            if (!(iVar instanceof j3.g)) {
                                z10 = iVar instanceof j;
                            }
                            if (z10) {
                                if (iVar == bVar.c) {
                                    singleProcessDataStore$handleUpdate$1.f4701l = bVar;
                                    singleProcessDataStore$handleUpdate$1.f4702m = singleProcessDataStore;
                                    singleProcessDataStore$handleUpdate$1.n = pVar3;
                                    singleProcessDataStore$handleUpdate$1.f4705q = 2;
                                    if (singleProcessDataStore.f(singleProcessDataStore$handleUpdate$1) != coroutineSingletons) {
                                        bVar2 = bVar;
                                        singleProcessDataStore2 = singleProcessDataStore;
                                        pVar = pVar3;
                                        p<T, c<? super T>, Object> pVar52 = bVar2.f4689a;
                                        CoroutineContext coroutineContext3 = bVar2.f4691d;
                                        singleProcessDataStore$handleUpdate$1.f4701l = pVar;
                                        singleProcessDataStore$handleUpdate$1.f4702m = null;
                                        singleProcessDataStore$handleUpdate$1.n = null;
                                        singleProcessDataStore$handleUpdate$1.f4705q = 3;
                                        obj = singleProcessDataStore2.j(singleProcessDataStore$handleUpdate$1, coroutineContext3, pVar52);
                                        pVar4 = pVar;
                                        if (obj == coroutineSingletons) {
                                        }
                                    } else {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    throw ((j3.g) iVar).f12671a;
                                }
                            } else if (iVar instanceof j3.e) {
                                throw ((j3.e) iVar).f12670a;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        pVar2 = pVar3;
                        obj = m0.b.Q(th);
                        pVar4 = pVar2;
                        a10 = Result.a(obj);
                        if (a10 == null) {
                        }
                        return m7.n.f16010a;
                    }
                }
                a10 = Result.a(obj);
                if (a10 == null) {
                    pVar4.u(obj);
                } else {
                    pVar4.q(a10);
                }
                return m7.n.f16010a;
            }
        }
        singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(singleProcessDataStore, cVar);
        Object obj2 = singleProcessDataStore$handleUpdate$1.f4703o;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = singleProcessDataStore$handleUpdate$1.f4705q;
        boolean z102 = true;
        if (i10 == 0) {
        }
        a10 = Result.a(obj2);
        if (a10 == null) {
        }
        return m7.n.f16010a;
    }

    @Override // j3.d
    public final Object a(p<? super T, ? super c<? super T>, ? extends Object> pVar, c<? super T> cVar) {
        q qVar = new q(null);
        this.f4684j.a(new a.b(pVar, qVar, (i) this.f4682h.getValue(), cVar.f()));
        return qVar.U(cVar);
    }

    @Override // j3.d
    public final kotlinx.coroutines.flow.b<T> b() {
        return this.f4679e;
    }

    public final File d() {
        return (File) this.f4681g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Type inference failed for: r11v6, types: [kotlinx.coroutines.sync.b] */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlinx.coroutines.sync.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(c<? super m7.n> cVar) {
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$1;
        CoroutineSingletons coroutineSingletons;
        int i10;
        boolean z10;
        Ref$ObjectRef ref$ObjectRef;
        SingleProcessDataStore singleProcessDataStore;
        MutexImpl mutexImpl;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$BooleanRef ref$BooleanRef;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        List<? extends p<? super f<T>, ? super c<? super m7.n>, ? extends Object>> list;
        Iterator<T> it;
        Ref$BooleanRef ref$BooleanRef2;
        Ref$ObjectRef ref$ObjectRef3;
        kotlinx.coroutines.sync.b bVar;
        SingleProcessDataStore singleProcessDataStore2;
        T t10;
        if (cVar instanceof SingleProcessDataStore$readAndInit$1) {
            singleProcessDataStore$readAndInit$1 = (SingleProcessDataStore$readAndInit$1) cVar;
            int i11 = singleProcessDataStore$readAndInit$1.f4713t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$1.f4713t = i11 - Integer.MIN_VALUE;
                T t11 = (T) singleProcessDataStore$readAndInit$1.f4711r;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = singleProcessDataStore$readAndInit$1.f4713t;
                int i12 = 0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                bVar = (kotlinx.coroutines.sync.b) singleProcessDataStore$readAndInit$1.f4708o;
                                ref$BooleanRef2 = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.n;
                                ref$ObjectRef3 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.f4707m;
                                singleProcessDataStore2 = singleProcessDataStore$readAndInit$1.f4706l;
                                m0.b.n1(t11);
                                try {
                                    ref$BooleanRef2.f13056i = true;
                                    m7.n nVar = m7.n.f16010a;
                                    bVar.a(null);
                                    StateFlowImpl stateFlowImpl = singleProcessDataStore2.f4682h;
                                    t10 = ref$ObjectRef3.f13060i;
                                    if (t10 != null) {
                                        i12 = t10.hashCode();
                                    }
                                    stateFlowImpl.setValue(new j3.b(i12, t10));
                                    return m7.n.f16010a;
                                } catch (Throwable th) {
                                    bVar.a(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = singleProcessDataStore$readAndInit$1.f4710q;
                        singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$1.f4709p;
                        ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.f4708o;
                        ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.n;
                        singleProcessDataStore = singleProcessDataStore$readAndInit$1.f4706l;
                        m0.b.n1(t11);
                        mutexImpl = (kotlinx.coroutines.sync.b) singleProcessDataStore$readAndInit$1.f4707m;
                        while (it.hasNext()) {
                            singleProcessDataStore$readAndInit$1.f4706l = singleProcessDataStore;
                            singleProcessDataStore$readAndInit$1.f4707m = mutexImpl;
                            singleProcessDataStore$readAndInit$1.n = ref$ObjectRef2;
                            singleProcessDataStore$readAndInit$1.f4708o = ref$BooleanRef;
                            singleProcessDataStore$readAndInit$1.f4709p = singleProcessDataStore$readAndInit$api$1;
                            singleProcessDataStore$readAndInit$1.f4710q = it;
                            singleProcessDataStore$readAndInit$1.f4713t = 2;
                            if (((p) it.next()).R(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        ref$BooleanRef2 = ref$BooleanRef;
                        singleProcessDataStore.f4683i = null;
                        singleProcessDataStore$readAndInit$1.f4706l = singleProcessDataStore;
                        singleProcessDataStore$readAndInit$1.f4707m = ref$ObjectRef2;
                        singleProcessDataStore$readAndInit$1.n = ref$BooleanRef2;
                        singleProcessDataStore$readAndInit$1.f4708o = mutexImpl;
                        singleProcessDataStore$readAndInit$1.f4709p = null;
                        singleProcessDataStore$readAndInit$1.f4710q = null;
                        singleProcessDataStore$readAndInit$1.f4713t = 3;
                        if (mutexImpl.b(null, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef3 = ref$ObjectRef2;
                        bVar = mutexImpl;
                        singleProcessDataStore2 = singleProcessDataStore;
                        ref$BooleanRef2.f13056i = true;
                        m7.n nVar2 = m7.n.f16010a;
                        bVar.a(null);
                        StateFlowImpl stateFlowImpl2 = singleProcessDataStore2.f4682h;
                        t10 = ref$ObjectRef3.f13060i;
                        if (t10 != null) {
                        }
                        stateFlowImpl2.setValue(new j3.b(i12, t10));
                        return m7.n.f16010a;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.f4708o;
                    SingleProcessDataStore singleProcessDataStore3 = singleProcessDataStore$readAndInit$1.f4706l;
                    m0.b.n1(t11);
                    mutexImpl = (kotlinx.coroutines.sync.b) singleProcessDataStore$readAndInit$1.f4707m;
                    singleProcessDataStore = singleProcessDataStore3;
                    ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.n;
                } else {
                    m0.b.n1(t11);
                    StateFlowImpl stateFlowImpl3 = this.f4682h;
                    if (!g.a(stateFlowImpl3.getValue(), j.f12672a) && !(stateFlowImpl3.getValue() instanceof j3.g)) {
                        z10 = false;
                        if (!z10) {
                            MutexImpl mutexImpl2 = new MutexImpl(false);
                            ref$ObjectRef = new Ref$ObjectRef();
                            singleProcessDataStore$readAndInit$1.f4706l = this;
                            singleProcessDataStore$readAndInit$1.f4707m = mutexImpl2;
                            singleProcessDataStore$readAndInit$1.n = ref$ObjectRef;
                            singleProcessDataStore$readAndInit$1.f4708o = ref$ObjectRef;
                            singleProcessDataStore$readAndInit$1.f4713t = 1;
                            ?? i13 = i(singleProcessDataStore$readAndInit$1);
                            if (i13 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            singleProcessDataStore = this;
                            mutexImpl = mutexImpl2;
                            ref$ObjectRef2 = ref$ObjectRef;
                            t11 = i13;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                }
                ref$ObjectRef.f13060i = t11;
                ref$BooleanRef = new Ref$BooleanRef();
                singleProcessDataStore$readAndInit$api$1 = new SingleProcessDataStore$readAndInit$api$1(mutexImpl, ref$BooleanRef, ref$ObjectRef2, singleProcessDataStore);
                list = singleProcessDataStore.f4683i;
                if (list != null) {
                    it = list.iterator();
                    mutexImpl = mutexImpl;
                    while (it.hasNext()) {
                    }
                }
                ref$BooleanRef2 = ref$BooleanRef;
                singleProcessDataStore.f4683i = null;
                singleProcessDataStore$readAndInit$1.f4706l = singleProcessDataStore;
                singleProcessDataStore$readAndInit$1.f4707m = ref$ObjectRef2;
                singleProcessDataStore$readAndInit$1.n = ref$BooleanRef2;
                singleProcessDataStore$readAndInit$1.f4708o = mutexImpl;
                singleProcessDataStore$readAndInit$1.f4709p = null;
                singleProcessDataStore$readAndInit$1.f4710q = null;
                singleProcessDataStore$readAndInit$1.f4713t = 3;
                if (mutexImpl.b(null, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
                }
            }
        }
        singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, cVar);
        T t112 = (T) singleProcessDataStore$readAndInit$1.f4711r;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = singleProcessDataStore$readAndInit$1.f4713t;
        int i122 = 0;
        if (i10 == 0) {
        }
        ref$ObjectRef.f13060i = t112;
        ref$BooleanRef = new Ref$BooleanRef();
        singleProcessDataStore$readAndInit$api$1 = new SingleProcessDataStore$readAndInit$api$1(mutexImpl, ref$BooleanRef, ref$ObjectRef2, singleProcessDataStore);
        list = singleProcessDataStore.f4683i;
        if (list != null) {
        }
        ref$BooleanRef2 = ref$BooleanRef;
        singleProcessDataStore.f4683i = null;
        singleProcessDataStore$readAndInit$1.f4706l = singleProcessDataStore;
        singleProcessDataStore$readAndInit$1.f4707m = ref$ObjectRef2;
        singleProcessDataStore$readAndInit$1.n = ref$BooleanRef2;
        singleProcessDataStore$readAndInit$1.f4708o = mutexImpl;
        singleProcessDataStore$readAndInit$1.f4709p = null;
        singleProcessDataStore$readAndInit$1.f4710q = null;
        singleProcessDataStore$readAndInit$1.f4713t = 3;
        if (mutexImpl.b(null, singleProcessDataStore$readAndInit$1) == coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(c<? super m7.n> cVar) {
        SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1;
        int i10;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (cVar instanceof SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) cVar;
            int i11 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f4726o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f4726o = i11 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f4725m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f4726o;
                if (i10 != 0) {
                    m0.b.n1(obj);
                    try {
                        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f4724l = this;
                        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f4726o = 1;
                        if (e(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        th = th;
                        singleProcessDataStore = this;
                        singleProcessDataStore.f4682h.setValue(new j3.g(th));
                        throw th;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    singleProcessDataStore = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f4724l;
                    try {
                        m0.b.n1(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        singleProcessDataStore.f4682h.setValue(new j3.g(th));
                        throw th;
                    }
                }
                return m7.n.f16010a;
            }
        }
        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, cVar);
        Object obj2 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f4725m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.f4726o;
        if (i10 != 0) {
        }
        return m7.n.f16010a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(c<? super m7.n> cVar) {
        SingleProcessDataStore$readAndInitOrPropagateFailure$1 singleProcessDataStore$readAndInitOrPropagateFailure$1;
        int i10;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (cVar instanceof SingleProcessDataStore$readAndInitOrPropagateFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateFailure$1) cVar;
            int i11 = singleProcessDataStore$readAndInitOrPropagateFailure$1.f4729o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.f4729o = i11 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInitOrPropagateFailure$1.f4728m;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = singleProcessDataStore$readAndInitOrPropagateFailure$1.f4729o;
                if (i10 != 0) {
                    m0.b.n1(obj);
                    try {
                        singleProcessDataStore$readAndInitOrPropagateFailure$1.f4727l = this;
                        singleProcessDataStore$readAndInitOrPropagateFailure$1.f4729o = 1;
                        if (e(singleProcessDataStore$readAndInitOrPropagateFailure$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th) {
                        th = th;
                        singleProcessDataStore = this;
                        singleProcessDataStore.f4682h.setValue(new j3.g(th));
                        return m7.n.f16010a;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    singleProcessDataStore = singleProcessDataStore$readAndInitOrPropagateFailure$1.f4727l;
                    try {
                        m0.b.n1(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        singleProcessDataStore.f4682h.setValue(new j3.g(th));
                        return m7.n.f16010a;
                    }
                }
                return m7.n.f16010a;
            }
        }
        singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, cVar);
        Object obj2 = singleProcessDataStore$readAndInitOrPropagateFailure$1.f4728m;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = singleProcessDataStore$readAndInitOrPropagateFailure$1.f4729o;
        if (i10 != 0) {
        }
        return m7.n.f16010a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(c<? super T> cVar) {
        SingleProcessDataStore$readData$1 singleProcessDataStore$readData$1;
        int i10;
        SingleProcessDataStore<T> singleProcessDataStore;
        Throwable th;
        FileInputStream fileInputStream;
        try {
            if (cVar instanceof SingleProcessDataStore$readData$1) {
                SingleProcessDataStore$readData$1 singleProcessDataStore$readData$12 = (SingleProcessDataStore$readData$1) cVar;
                int i11 = singleProcessDataStore$readData$12.f4733p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    singleProcessDataStore$readData$12.f4733p = i11 - Integer.MIN_VALUE;
                    singleProcessDataStore$readData$1 = singleProcessDataStore$readData$12;
                    Object obj = singleProcessDataStore$readData$1.n;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = singleProcessDataStore$readData$1.f4733p;
                    if (i10 != 0) {
                        m0.b.n1(obj);
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(d());
                            try {
                                h<T> hVar = this.f4677b;
                                singleProcessDataStore$readData$1.f4730l = this;
                                singleProcessDataStore$readData$1.f4731m = fileInputStream2;
                                singleProcessDataStore$readData$1.f4733p = 1;
                                MutablePreferences c = hVar.c(fileInputStream2);
                                if (c == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                fileInputStream = fileInputStream2;
                                obj = c;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } catch (FileNotFoundException e10) {
                            e = e10;
                            singleProcessDataStore = this;
                            if (singleProcessDataStore.d().exists()) {
                                throw e;
                            }
                            return singleProcessDataStore.f4677b.a();
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fileInputStream = singleProcessDataStore$readData$1.f4731m;
                        SingleProcessDataStore singleProcessDataStore2 = singleProcessDataStore$readData$1.f4730l;
                        try {
                            m0.b.n1(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                    m0.b.D(fileInputStream, null);
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            m0.b.D(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e11) {
            e = e11;
            singleProcessDataStore = singleProcessDataStore$readData$1;
        }
        singleProcessDataStore$readData$1 = new SingleProcessDataStore$readData$1(this, cVar);
        Object obj2 = singleProcessDataStore$readData$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = singleProcessDataStore$readData$1.f4733p;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(c<? super T> cVar) {
        SingleProcessDataStore$readDataOrHandleCorruption$1 singleProcessDataStore$readDataOrHandleCorruption$1;
        int i10;
        SingleProcessDataStore singleProcessDataStore;
        Object b5;
        CorruptionException corruptionException;
        SingleProcessDataStore singleProcessDataStore2;
        CorruptionException corruptionException2;
        if (cVar instanceof SingleProcessDataStore$readDataOrHandleCorruption$1) {
            singleProcessDataStore$readDataOrHandleCorruption$1 = (SingleProcessDataStore$readDataOrHandleCorruption$1) cVar;
            int i11 = singleProcessDataStore$readDataOrHandleCorruption$1.f4737p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readDataOrHandleCorruption$1.f4737p = i11 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readDataOrHandleCorruption$1.n;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = singleProcessDataStore$readDataOrHandleCorruption$1.f4737p;
                if (i10 != 0) {
                    m0.b.n1(obj);
                    try {
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4734l = this;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4737p = 1;
                        obj = h(singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } catch (CorruptionException e10) {
                        e = e10;
                        singleProcessDataStore = this;
                        j3.a<T> aVar = singleProcessDataStore.c;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4734l = singleProcessDataStore;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4735m = e;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4737p = 2;
                        b5 = aVar.b(e);
                        if (b5 != obj2) {
                        }
                    }
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            Object obj3 = singleProcessDataStore$readDataOrHandleCorruption$1.f4735m;
                            corruptionException2 = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.f4734l;
                            try {
                                m0.b.n1(obj);
                                return obj3;
                            } catch (IOException e11) {
                                e = e11;
                                a1.c.M(corruptionException2, e);
                                throw corruptionException2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    corruptionException = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.f4735m;
                    singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.f4734l;
                    m0.b.n1(obj);
                    try {
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4734l = corruptionException;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4735m = obj;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4737p = 3;
                        return singleProcessDataStore2.k(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != obj2 ? obj2 : obj;
                    } catch (IOException e12) {
                        e = e12;
                        corruptionException2 = corruptionException;
                        a1.c.M(corruptionException2, e);
                        throw corruptionException2;
                    }
                } else {
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.f4734l;
                    try {
                        m0.b.n1(obj);
                    } catch (CorruptionException e13) {
                        e = e13;
                        j3.a<T> aVar2 = singleProcessDataStore.c;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4734l = singleProcessDataStore;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4735m = e;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4737p = 2;
                        b5 = aVar2.b(e);
                        if (b5 != obj2) {
                            return obj2;
                        }
                        SingleProcessDataStore singleProcessDataStore3 = singleProcessDataStore;
                        corruptionException = e;
                        obj = b5;
                        singleProcessDataStore2 = singleProcessDataStore3;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4734l = corruptionException;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4735m = obj;
                        singleProcessDataStore$readDataOrHandleCorruption$1.f4737p = 3;
                        if (singleProcessDataStore2.k(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != obj2) {
                        }
                    }
                }
                return obj;
            }
        }
        singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, cVar);
        Object obj4 = singleProcessDataStore$readDataOrHandleCorruption$1.n;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = singleProcessDataStore$readDataOrHandleCorruption$1.f4737p;
        if (i10 != 0) {
        }
        return obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(c cVar, CoroutineContext coroutineContext, p pVar) {
        SingleProcessDataStore$transformAndWrite$1 singleProcessDataStore$transformAndWrite$1;
        T t10;
        int i10;
        SingleProcessDataStore<T> singleProcessDataStore;
        j3.b bVar;
        Object obj;
        SingleProcessDataStore singleProcessDataStore2;
        if (cVar instanceof SingleProcessDataStore$transformAndWrite$1) {
            singleProcessDataStore$transformAndWrite$1 = (SingleProcessDataStore$transformAndWrite$1) cVar;
            int i11 = singleProcessDataStore$transformAndWrite$1.f4742q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$transformAndWrite$1.f4742q = i11 - Integer.MIN_VALUE;
                t10 = (T) singleProcessDataStore$transformAndWrite$1.f4740o;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = singleProcessDataStore$transformAndWrite$1.f4742q;
                if (i10 != 0) {
                    m0.b.n1(t10);
                    j3.b bVar2 = (j3.b) this.f4682h.getValue();
                    bVar2.a();
                    T t11 = bVar2.f12668a;
                    SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(t11, null, pVar);
                    singleProcessDataStore$transformAndWrite$1.f4738l = this;
                    singleProcessDataStore$transformAndWrite$1.f4739m = bVar2;
                    singleProcessDataStore$transformAndWrite$1.n = t11;
                    singleProcessDataStore$transformAndWrite$1.f4742q = 1;
                    Object I1 = m0.b.I1(singleProcessDataStore$transformAndWrite$1, coroutineContext, singleProcessDataStore$transformAndWrite$newData$1);
                    if (I1 == obj2) {
                        return obj2;
                    }
                    singleProcessDataStore = this;
                    bVar = bVar2;
                    t10 = (T) I1;
                    obj = t11;
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        obj = singleProcessDataStore$transformAndWrite$1.f4739m;
                        singleProcessDataStore2 = singleProcessDataStore$transformAndWrite$1.f4738l;
                        m0.b.n1(t10);
                        singleProcessDataStore2.f4682h.setValue(new j3.b(obj == null ? obj.hashCode() : 0, obj));
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    obj = singleProcessDataStore$transformAndWrite$1.n;
                    bVar = (j3.b) singleProcessDataStore$transformAndWrite$1.f4739m;
                    singleProcessDataStore = singleProcessDataStore$transformAndWrite$1.f4738l;
                    m0.b.n1(t10);
                }
                bVar.a();
                if (g.a(obj, t10)) {
                    singleProcessDataStore$transformAndWrite$1.f4738l = singleProcessDataStore;
                    singleProcessDataStore$transformAndWrite$1.f4739m = t10;
                    singleProcessDataStore$transformAndWrite$1.n = null;
                    singleProcessDataStore$transformAndWrite$1.f4742q = 2;
                    if (singleProcessDataStore.k(t10, singleProcessDataStore$transformAndWrite$1) == obj2) {
                        return obj2;
                    }
                    obj = t10;
                    singleProcessDataStore2 = singleProcessDataStore;
                    singleProcessDataStore2.f4682h.setValue(new j3.b(obj == null ? obj.hashCode() : 0, obj));
                    return obj;
                }
                return obj;
            }
        }
        singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, cVar);
        t10 = (T) singleProcessDataStore$transformAndWrite$1.f4740o;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = singleProcessDataStore$transformAndWrite$1.f4742q;
        if (i10 != 0) {
        }
        bVar.a();
        if (g.a(obj, t10)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4 A[Catch: IOException -> 0x00bb, TRY_ENTER, TryCatch #2 {IOException -> 0x00bb, blocks: (B:31:0x0094, B:35:0x00a4, B:36:0x00ba, B:24:0x006a, B:41:0x00c0), top: B:53:0x006a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(T t10, c<? super m7.n> cVar) {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        int i10;
        File file;
        SingleProcessDataStore<T> singleProcessDataStore;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) cVar;
            int i11 = singleProcessDataStore$writeData$1.f4750r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.f4750r = i11 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$writeData$1.f4748p;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = singleProcessDataStore$writeData$1.f4750r;
                if (i10 == 0) {
                    if (i10 == 1) {
                        fileOutputStream = singleProcessDataStore$writeData$1.f4747o;
                        fileOutputStream2 = singleProcessDataStore$writeData$1.n;
                        file = singleProcessDataStore$writeData$1.f4746m;
                        singleProcessDataStore = singleProcessDataStore$writeData$1.f4745l;
                        try {
                            m0.b.n1(obj);
                        } catch (Throwable th) {
                            th = th;
                            FileOutputStream fileOutputStream3 = fileOutputStream2;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    File d5 = d();
                    File parentFile = d5.getCanonicalFile().getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                        if (!parentFile.isDirectory()) {
                            throw new IOException(g.k(d5, "Unable to create parent directories of "));
                        }
                    }
                    file = new File(g.k(this.f4680f, d().getAbsolutePath()));
                    try {
                        FileOutputStream fileOutputStream4 = new FileOutputStream(file);
                        try {
                            h<T> hVar = this.f4677b;
                            b bVar = new b(fileOutputStream4);
                            singleProcessDataStore$writeData$1.f4745l = this;
                            singleProcessDataStore$writeData$1.f4746m = file;
                            singleProcessDataStore$writeData$1.n = fileOutputStream4;
                            singleProcessDataStore$writeData$1.f4747o = fileOutputStream4;
                            singleProcessDataStore$writeData$1.f4750r = 1;
                            if (hVar.b(t10, bVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            singleProcessDataStore = this;
                            fileOutputStream = fileOutputStream4;
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (IOException e10) {
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e10;
                    }
                }
                fileOutputStream.getFD().sync();
                m7.n nVar = m7.n.f16010a;
                m0.b.D(fileOutputStream2, null);
                if (!file.renameTo(singleProcessDataStore.d())) {
                    return m7.n.f16010a;
                }
                throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
            }
        }
        singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, cVar);
        Object obj2 = singleProcessDataStore$writeData$1.f4748p;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = singleProcessDataStore$writeData$1.f4750r;
        if (i10 == 0) {
        }
        fileOutputStream.getFD().sync();
        m7.n nVar2 = m7.n.f16010a;
        m0.b.D(fileOutputStream2, null);
        if (!file.renameTo(singleProcessDataStore.d())) {
        }
    }
}
