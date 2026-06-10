package androidx.room;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import la.e;
import m7.n;
import q7.c;
import u7.p;
import v7.g;
import y3.f;
import y3.o;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/flow/c;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@c(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CoroutinesRoom$Companion$createFlow$1 extends SuspendLambda implements p<kotlinx.coroutines.flow.c<Object>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f6002m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ boolean f6003o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ RoomDatabase f6004p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String[] f6005q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Callable<Object> f6006r;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    @c(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {136}, m = "invokeSuspend")
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f6007m;
        public /* synthetic */ Object n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ boolean f6008o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f6009p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.c<Object> f6010q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ String[] f6011r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ Callable<Object> f6012s;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
        @c(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {127, 129}, m = "invokeSuspend")
        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00451 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

            /* renamed from: m  reason: collision with root package name */
            public e f6013m;
            public int n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ RoomDatabase f6014o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ a f6015p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ la.c<n> f6016q;

            /* renamed from: r  reason: collision with root package name */
            public final /* synthetic */ Callable<Object> f6017r;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ la.c<Object> f6018s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00451(RoomDatabase roomDatabase, a aVar, la.c<n> cVar, Callable<Object> callable, la.c<Object> cVar2, p7.c<? super C00451> cVar3) {
                super(2, cVar3);
                this.f6014o = roomDatabase;
                this.f6015p = aVar;
                this.f6016q = cVar;
                this.f6017r = callable;
                this.f6018s = cVar2;
            }

            @Override // u7.p
            public final Object R(x xVar, p7.c<? super n> cVar) {
                return ((C00451) a(xVar, cVar)).k(n.f16010a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final p7.c<n> a(Object obj, p7.c<?> cVar) {
                return new C00451(this.f6014o, this.f6015p, this.f6016q, this.f6017r, this.f6018s, cVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:21:0x0046, B:23:0x004e), top: B:39:0x0046 }] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0064 -> B:37:0x0036). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object k(Object obj) {
                C00451 c00451;
                e<n> it;
                C00451 c004512;
                Object a10;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.n;
                try {
                    try {
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    it = this.f6013m;
                                    m0.b.n1(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                e<n> eVar = this.f6013m;
                                m0.b.n1(obj);
                                e<n> eVar2 = eVar;
                                CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                                c00451 = this;
                                try {
                                    if (!((Boolean) obj).booleanValue()) {
                                        eVar2.next();
                                        Object call = c00451.f6017r.call();
                                        la.c<Object> cVar = c00451.f6018s;
                                        c00451.f6013m = eVar2;
                                        c00451.n = 2;
                                        if (cVar.e(call, c00451) == coroutineSingletons2) {
                                            return coroutineSingletons2;
                                        }
                                        c004512 = c00451;
                                        coroutineSingletons = coroutineSingletons2;
                                        it = eVar2;
                                        c004512.f6013m = it;
                                        c004512.n = 1;
                                        a10 = it.a(c004512);
                                        if (a10 != coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                                        c00451 = c004512;
                                        obj = a10;
                                        eVar2 = it;
                                        coroutineSingletons2 = coroutineSingletons3;
                                        if (!((Boolean) obj).booleanValue()) {
                                            c00451.f6014o.f6030e.c(c00451.f6015p);
                                            return n.f16010a;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    c00451.f6014o.f6030e.c(c00451.f6015p);
                                    throw th;
                                }
                            }
                        } else {
                            m0.b.n1(obj);
                            this.f6014o.f6030e.a(this.f6015p);
                            it = this.f6016q.iterator();
                        }
                        c004512.f6013m = it;
                        c004512.n = 1;
                        a10 = it.a(c004512);
                        if (a10 != coroutineSingletons) {
                        }
                    } catch (Throwable th2) {
                        c00451 = c004512;
                        th = th2;
                        c00451.f6014o.f6030e.c(c00451.f6015p);
                        throw th;
                    }
                    c004512 = this;
                } catch (Throwable th3) {
                    th = th3;
                    c00451 = this;
                }
            }
        }

        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a */
        /* loaded from: classes.dex */
        public static final class a extends f.c {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ la.c<n> f6019b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String[] strArr, AbstractChannel abstractChannel) {
                super(strArr);
                this.f6019b = abstractChannel;
            }

            @Override // y3.f.c
            public final void a(Set<String> set) {
                g.f(set, "tables");
                this.f6019b.F(n.f16010a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, RoomDatabase roomDatabase, kotlinx.coroutines.flow.c<Object> cVar, String[] strArr, Callable<Object> callable, p7.c<? super AnonymousClass1> cVar2) {
            super(2, cVar2);
            this.f6008o = z10;
            this.f6009p = roomDatabase;
            this.f6010q = cVar;
            this.f6011r = strArr;
            this.f6012s = callable;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6008o, this.f6009p, this.f6010q, this.f6011r, this.f6012s, cVar);
            anonymousClass1.n = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineDispatcher Z;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f6007m;
            if (i10 != 0) {
                if (i10 == 1) {
                    m0.b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                m0.b.n1(obj);
                x xVar = (x) this.n;
                AbstractChannel f10 = a1.b.f(-1, null, 6);
                a aVar = new a(this.f6011r, f10);
                n nVar = n.f16010a;
                f10.F(nVar);
                o oVar = (o) xVar.j().a(o.f18879i);
                boolean z10 = this.f6008o;
                RoomDatabase roomDatabase = this.f6009p;
                if (z10) {
                    Z = a1.b.c0(roomDatabase);
                } else {
                    Z = a1.b.Z(roomDatabase);
                }
                AbstractChannel f11 = a1.b.f(0, null, 7);
                m0.b.M0(xVar, Z, null, new C00451(this.f6009p, aVar, f10, this.f6012s, f11, null), 2);
                this.f6007m = 1;
                Object e10 = kotlinx.coroutines.flow.e.e(this.f6010q, f11, true, this);
                if (e10 == coroutineSingletons) {
                    nVar = e10;
                }
                if (nVar == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z10, RoomDatabase roomDatabase, String[] strArr, Callable<Object> callable, p7.c<? super CoroutinesRoom$Companion$createFlow$1> cVar) {
        super(2, cVar);
        this.f6003o = z10;
        this.f6004p = roomDatabase;
        this.f6005q = strArr;
        this.f6006r = callable;
    }

    @Override // u7.p
    public final Object R(kotlinx.coroutines.flow.c<Object> cVar, p7.c<? super n> cVar2) {
        return ((CoroutinesRoom$Companion$createFlow$1) a(cVar, cVar2)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.f6003o, this.f6004p, this.f6005q, this.f6006r, cVar);
        coroutinesRoom$Companion$createFlow$1.n = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f6002m;
        if (i10 == 0) {
            m0.b.n1(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6003o, this.f6004p, (kotlinx.coroutines.flow.c) this.n, this.f6005q, this.f6006r, null);
            this.f6002m = 1;
            if (a1.b.H(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m0.b.n1(obj);
        }
        return n.f16010a;
    }
}
