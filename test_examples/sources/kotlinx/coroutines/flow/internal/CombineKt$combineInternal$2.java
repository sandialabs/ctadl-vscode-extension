package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import la.f;
import m7.n;
import ma.i;
import n7.r;
import u7.p;
import u7.q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {57, 79, 82}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CombineKt$combineInternal$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public la.c f15390m;
    public byte[] n;

    /* renamed from: o  reason: collision with root package name */
    public int f15391o;

    /* renamed from: p  reason: collision with root package name */
    public int f15392p;

    /* renamed from: q  reason: collision with root package name */
    public int f15393q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f15394r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.b<Object>[] f15395s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ u7.a<Object[]> f15396t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q<kotlinx.coroutines.flow.c<Object>, Object[], p7.c<? super n>, Object> f15397u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.c<Object> f15398v;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    @q7.c(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {34}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f15399m;
        public final /* synthetic */ kotlinx.coroutines.flow.b<Object>[] n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ int f15400o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f15401p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ la.c<r<Object>> f15402q;

        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C01731<T> implements kotlinx.coroutines.flow.c {

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ la.c<r<Object>> f15403i;

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ int f15404j;

            public C01731(la.c<r<Object>> cVar, int i10) {
                this.f15403i = cVar;
                this.f15404j = i10;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
            @Override // kotlinx.coroutines.flow.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t10, p7.c<? super n> cVar) {
                CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                CoroutineSingletons coroutineSingletons;
                int i10;
                if (cVar instanceof CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) cVar;
                    int i11 = combineKt$combineInternal$2$1$1$emit$1.n;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.n = i11 - Integer.MIN_VALUE;
                        Object obj = combineKt$combineInternal$2$1$1$emit$1.f15405l;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = combineKt$combineInternal$2$1$1$emit$1.n;
                        if (i10 != 0) {
                            m0.b.n1(obj);
                            r<Object> rVar = new r<>(this.f15404j, t10);
                            combineKt$combineInternal$2$1$1$emit$1.n = 1;
                            if (this.f15403i.e(rVar, combineKt$combineInternal$2$1$1$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else if (i10 != 1) {
                            if (i10 == 2) {
                                m0.b.n1(obj);
                                return n.f16010a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            m0.b.n1(obj);
                        }
                        combineKt$combineInternal$2$1$1$emit$1.n = 2;
                        if (m0.b.J1(combineKt$combineInternal$2$1$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return n.f16010a;
                    }
                }
                combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, cVar);
                Object obj2 = combineKt$combineInternal$2$1$1$emit$1.f15405l;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = combineKt$combineInternal$2$1$1$emit$1.n;
                if (i10 != 0) {
                }
                combineKt$combineInternal$2$1$1$emit$1.n = 2;
                if (m0.b.J1(combineKt$combineInternal$2$1$1$emit$1) == coroutineSingletons) {
                }
                return n.f16010a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlinx.coroutines.flow.b<Object>[] bVarArr, int i10, AtomicInteger atomicInteger, la.c<r<Object>> cVar, p7.c<? super AnonymousClass1> cVar2) {
            super(2, cVar2);
            this.n = bVarArr;
            this.f15400o = i10;
            this.f15401p = atomicInteger;
            this.f15402q = cVar;
        }

        @Override // u7.p
        public final Object R(x xVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(xVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            return new AnonymousClass1(this.n, this.f15400o, this.f15401p, this.f15402q, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f15399m;
            AtomicInteger atomicInteger = this.f15401p;
            la.c<r<Object>> cVar = this.f15402q;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    kotlinx.coroutines.flow.b<Object>[] bVarArr = this.n;
                    int i11 = this.f15400o;
                    kotlinx.coroutines.flow.b<Object> bVar = bVarArr[i11];
                    C01731 c01731 = new C01731(cVar, i11);
                    this.f15399m = 1;
                    if (bVar.a(c01731, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    cVar.d(null);
                }
                return n.f16010a;
            } finally {
                if (atomicInteger.decrementAndGet() == 0) {
                    cVar.d(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(p7.c cVar, u7.a aVar, q qVar, kotlinx.coroutines.flow.c cVar2, kotlinx.coroutines.flow.b[] bVarArr) {
        super(2, cVar);
        this.f15395s = bVarArr;
        this.f15396t = aVar;
        this.f15397u = qVar;
        this.f15398v = cVar2;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((CombineKt$combineInternal$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(cVar, this.f15396t, this.f15397u, this.f15398v, this.f15395s);
        combineKt$combineInternal$2.f15394r = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[LOOP:0: B:33:0x00bc->B:43:0x00dc, LOOP_START, PHI: r8 r12 
      PHI: (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:30:0x00b7, B:43:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v5 n7.r) = (r12v4 n7.r), (r12v15 n7.r) binds: [B:30:0x00b7, B:43:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0133 -> B:53:0x0136). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x013c -> B:8:0x0025). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        int length;
        Object[] objArr;
        la.c f10;
        byte[] bArr;
        CombineKt$combineInternal$2 combineKt$combineInternal$2;
        int i10;
        Object obj2;
        r rVar;
        Object[] objArr2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f15393q;
        kotlinx.coroutines.internal.r rVar2 = i.c;
        r rVar3 = null;
        int i12 = 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        i10 = this.f15392p;
                        length = this.f15391o;
                        bArr = this.n;
                        f10 = this.f15390m;
                        m0.b.n1(obj);
                        combineKt$combineInternal$2 = this;
                        objArr2 = (Object[]) this.f15394r;
                        objArr = objArr2;
                        rVar3 = null;
                        i12 = 1;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i10 = this.f15392p;
                    length = this.f15391o;
                    bArr = this.n;
                    f10 = this.f15390m;
                    objArr = (Object[]) this.f15394r;
                    m0.b.n1(obj);
                    combineKt$combineInternal$2 = this;
                }
            } else {
                i10 = this.f15392p;
                length = this.f15391o;
                bArr = this.n;
                f10 = this.f15390m;
                objArr = (Object[]) this.f15394r;
                m0.b.n1(obj);
                obj2 = ((f) obj).f15878a;
                combineKt$combineInternal$2 = this;
                kotlinx.coroutines.internal.r[] rVarArr = objArr;
                rVar = obj2 instanceof f.b ? obj2 : rVar3;
                if (rVar != null) {
                    return n.f16010a;
                }
                do {
                    int i13 = rVar.f16128a;
                    kotlinx.coroutines.internal.r rVar4 = rVarArr[i13];
                    rVarArr[i13] = rVar.f16129b;
                    if (rVar4 == rVar2) {
                        length--;
                    }
                    if (bArr[i13] == i10) {
                        break;
                    }
                    bArr[i13] = (byte) i10;
                    Object E = f10.E();
                    if (E instanceof f.b) {
                        E = rVar3;
                    }
                    rVar = (r) E;
                } while (rVar != null);
                if (length == 0) {
                    Object[] k02 = combineKt$combineInternal$2.f15396t.k0();
                    kotlinx.coroutines.flow.c<Object> cVar = combineKt$combineInternal$2.f15398v;
                    q<kotlinx.coroutines.flow.c<Object>, Object[], p7.c<? super n>, Object> qVar = combineKt$combineInternal$2.f15397u;
                    if (k02 == null) {
                        combineKt$combineInternal$2.f15394r = rVarArr;
                        combineKt$combineInternal$2.f15390m = f10;
                        combineKt$combineInternal$2.n = bArr;
                        combineKt$combineInternal$2.f15391o = length;
                        combineKt$combineInternal$2.f15392p = i10;
                        combineKt$combineInternal$2.f15393q = 2;
                        if (qVar.O(cVar, rVarArr, combineKt$combineInternal$2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        objArr2 = rVarArr;
                        n7.i.d2(rVarArr, k02, 0, 0, 0, 14);
                        combineKt$combineInternal$2.f15394r = objArr2;
                        combineKt$combineInternal$2.f15390m = f10;
                        combineKt$combineInternal$2.n = bArr;
                        combineKt$combineInternal$2.f15391o = length;
                        combineKt$combineInternal$2.f15392p = i10;
                        combineKt$combineInternal$2.f15393q = 3;
                        if (qVar.O(cVar, k02, combineKt$combineInternal$2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        objArr = objArr2;
                        rVar3 = null;
                        i12 = 1;
                    }
                }
                objArr2 = rVarArr;
                objArr = objArr2;
                rVar3 = null;
                i12 = 1;
            }
        } else {
            m0.b.n1(obj);
            x xVar = (x) this.f15394r;
            length = this.f15395s.length;
            if (length == 0) {
                return n.f16010a;
            }
            objArr = new Object[length];
            n7.i.h2(objArr, rVar2);
            f10 = a1.b.f(length, null, 6);
            AtomicInteger atomicInteger = new AtomicInteger(length);
            for (int i14 = 0; i14 < length; i14++) {
                m0.b.M0(xVar, null, null, new AnonymousClass1(this.f15395s, i14, atomicInteger, f10, null), 3);
            }
            bArr = new byte[length];
            combineKt$combineInternal$2 = this;
            i10 = 0;
        }
        i10 = (byte) (i10 + i12);
        combineKt$combineInternal$2.f15394r = objArr;
        combineKt$combineInternal$2.f15390m = f10;
        combineKt$combineInternal$2.n = bArr;
        combineKt$combineInternal$2.f15391o = length;
        combineKt$combineInternal$2.f15392p = i10;
        combineKt$combineInternal$2.f15393q = i12;
        obj2 = f10.k(combineKt$combineInternal$2);
        if (obj2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        kotlinx.coroutines.internal.r[] rVarArr2 = objArr;
        rVar = obj2 instanceof f.b ? obj2 : rVar3;
        if (rVar != null) {
        }
    }
}
