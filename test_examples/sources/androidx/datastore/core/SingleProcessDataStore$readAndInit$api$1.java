package androidx.datastore.core;

import j3.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p7.c;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1 implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.sync.b f4714a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f4715b;
    public final /* synthetic */ Ref$ObjectRef<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f4716d;

    public SingleProcessDataStore$readAndInit$api$1(kotlinx.coroutines.sync.b bVar, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<T> ref$ObjectRef, SingleProcessDataStore<T> singleProcessDataStore) {
        this.f4714a = bVar;
        this.f4715b = ref$BooleanRef;
        this.c = ref$ObjectRef;
        this.f4716d = singleProcessDataStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:30:0x008f, B:32:0x0093, B:51:0x00d6, B:52:0x00dd), top: B:55:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ab, B:38:0x00b3), top: B:56:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:30:0x008f, B:32:0x0093, B:51:0x00d6, B:52:0x00dd), top: B:55:0x008f }] */
    @Override // j3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p<? super T, ? super c<? super T>, ? extends Object> pVar, c<? super T> cVar) {
        SingleProcessDataStore$readAndInit$api$1$updateData$1 singleProcessDataStore$readAndInit$api$1$updateData$1;
        int i10;
        kotlinx.coroutines.sync.b bVar;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        p pVar2;
        SingleProcessDataStore singleProcessDataStore;
        kotlinx.coroutines.sync.b bVar2;
        kotlinx.coroutines.sync.b bVar3;
        T t10;
        Ref$ObjectRef ref$ObjectRef2;
        try {
            if (cVar instanceof SingleProcessDataStore$readAndInit$api$1$updateData$1) {
                singleProcessDataStore$readAndInit$api$1$updateData$1 = (SingleProcessDataStore$readAndInit$api$1$updateData$1) cVar;
                int i11 = singleProcessDataStore$readAndInit$api$1$updateData$1.f4723s;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    singleProcessDataStore$readAndInit$api$1$updateData$1.f4723s = i11 - Integer.MIN_VALUE;
                    Object obj = singleProcessDataStore$readAndInit$api$1$updateData$1.f4721q;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = singleProcessDataStore$readAndInit$api$1$updateData$1.f4723s;
                    if (i10 != 0) {
                        m0.b.n1(obj);
                        singleProcessDataStore$readAndInit$api$1$updateData$1.f4717l = pVar;
                        bVar = this.f4714a;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.f4718m = bVar;
                        Ref$BooleanRef ref$BooleanRef2 = this.f4715b;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.n = ref$BooleanRef2;
                        Ref$ObjectRef ref$ObjectRef3 = this.c;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.f4719o = ref$ObjectRef3;
                        SingleProcessDataStore singleProcessDataStore2 = this.f4716d;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.f4720p = singleProcessDataStore2;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.f4723s = 1;
                        if (bVar.b(null, singleProcessDataStore$readAndInit$api$1$updateData$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$BooleanRef = ref$BooleanRef2;
                        ref$ObjectRef = ref$ObjectRef3;
                        pVar2 = pVar;
                        singleProcessDataStore = singleProcessDataStore2;
                    } else if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                Object obj2 = singleProcessDataStore$readAndInit$api$1$updateData$1.n;
                                ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.f4718m;
                                bVar3 = (kotlinx.coroutines.sync.b) singleProcessDataStore$readAndInit$api$1$updateData$1.f4717l;
                                try {
                                    m0.b.n1(obj);
                                    t10 = obj2;
                                    ref$ObjectRef2.f13060i = t10;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    T t11 = ref$ObjectRef.f13060i;
                                    bVar3.a(null);
                                    return t11;
                                } catch (Throwable th) {
                                    th = th;
                                    bVar = bVar3;
                                    bVar.a(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.n;
                        ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.f4718m;
                        bVar2 = (kotlinx.coroutines.sync.b) singleProcessDataStore$readAndInit$api$1$updateData$1.f4717l;
                        try {
                            m0.b.n1(obj);
                            if (!g.a(obj, ref$ObjectRef.f13060i)) {
                                bVar3 = bVar2;
                                T t112 = ref$ObjectRef.f13060i;
                                bVar3.a(null);
                                return t112;
                            }
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f4717l = bVar2;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f4718m = ref$ObjectRef;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.n = obj;
                            singleProcessDataStore$readAndInit$api$1$updateData$1.f4723s = 3;
                            if (singleProcessDataStore.k(obj, singleProcessDataStore$readAndInit$api$1$updateData$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            t10 = obj;
                            ref$ObjectRef2 = ref$ObjectRef;
                            bVar3 = bVar2;
                            ref$ObjectRef2.f13060i = t10;
                            ref$ObjectRef = ref$ObjectRef2;
                            T t1122 = ref$ObjectRef.f13060i;
                            bVar3.a(null);
                            return t1122;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVar2;
                            bVar.a(null);
                            throw th;
                        }
                    } else {
                        singleProcessDataStore = singleProcessDataStore$readAndInit$api$1$updateData$1.f4720p;
                        ref$ObjectRef = singleProcessDataStore$readAndInit$api$1$updateData$1.f4719o;
                        ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$api$1$updateData$1.n;
                        pVar2 = (p) singleProcessDataStore$readAndInit$api$1$updateData$1.f4717l;
                        m0.b.n1(obj);
                        bVar = (kotlinx.coroutines.sync.b) singleProcessDataStore$readAndInit$api$1$updateData$1.f4718m;
                    }
                    if (!ref$BooleanRef.f13056i) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    T t12 = ref$ObjectRef.f13060i;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.f4717l = bVar;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.f4718m = ref$ObjectRef;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.n = singleProcessDataStore;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.f4719o = null;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.f4720p = null;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.f4723s = 2;
                    Object R = pVar2.R(t12, singleProcessDataStore$readAndInit$api$1$updateData$1);
                    if (R == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar2 = bVar;
                    obj = R;
                    if (!g.a(obj, ref$ObjectRef.f13060i)) {
                    }
                }
            }
            if (!ref$BooleanRef.f13056i) {
            }
        } catch (Throwable th3) {
            th = th3;
            bVar.a(null);
            throw th;
        }
        singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, cVar);
        Object obj3 = singleProcessDataStore$readAndInit$api$1$updateData$1.f4721q;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = singleProcessDataStore$readAndInit$api$1$updateData$1.f4723s;
        if (i10 != 0) {
        }
    }
}
