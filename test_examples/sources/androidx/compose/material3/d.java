package androidx.compose.material3;

import e0.m;
import e0.n;
import g0.k0;
import ja.i;
import ja.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.sync.MutexImpl;
import v7.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final MutexImpl f2606a = new MutexImpl(false);

    /* renamed from: b  reason: collision with root package name */
    public final k0 f2607b = a1.c.V0(null);

    /* loaded from: classes.dex */
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final n f2608a;

        /* renamed from: b  reason: collision with root package name */
        public final i<SnackbarResult> f2609b;

        public a(n nVar, j jVar) {
            g.f(nVar, "visuals");
            this.f2608a = nVar;
            this.f2609b = jVar;
        }

        @Override // e0.m
        public final n a() {
            return this.f2608a;
        }

        @Override // e0.m
        public final void b() {
            i<SnackbarResult> iVar = this.f2609b;
            if (iVar.b()) {
                iVar.t(SnackbarResult.ActionPerformed);
            }
        }

        @Override // e0.m
        public final void dismiss() {
            i<SnackbarResult> iVar = this.f2609b;
            if (iVar.b()) {
                iVar.t(SnackbarResult.Dismissed);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && g.a(v7.i.a(a.class), v7.i.a(obj.getClass()))) {
                a aVar = (a) obj;
                return g.a(this.f2608a, aVar.f2608a) && g.a(this.f2609b, aVar.f2609b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f2609b.hashCode() + (this.f2608a.hashCode() * 31);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        public final String f2610a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2611b;
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final SnackbarDuration f2612d;

        public b(String str, String str2, boolean z10, SnackbarDuration snackbarDuration) {
            g.f(str, "message");
            g.f(snackbarDuration, "duration");
            this.f2610a = str;
            this.f2611b = str2;
            this.c = z10;
            this.f2612d = snackbarDuration;
        }

        @Override // e0.n
        public final String a() {
            return this.f2610a;
        }

        @Override // e0.n
        public final String b() {
            return this.f2611b;
        }

        @Override // e0.n
        public final boolean c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && g.a(v7.i.a(b.class), v7.i.a(obj.getClass()))) {
                b bVar = (b) obj;
                return g.a(this.f2610a, bVar.f2610a) && g.a(this.f2611b, bVar.f2611b) && this.c == bVar.c && this.f2612d == bVar.f2612d;
            }
            return false;
        }

        @Override // e0.n
        public final SnackbarDuration getDuration() {
            return this.f2612d;
        }

        public final int hashCode() {
            int hashCode = this.f2610a.hashCode() * 31;
            String str = this.f2611b;
            return this.f2612d.hashCode() + ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.c ? 1231 : 1237)) * 31);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.material3.d$b, kotlinx.coroutines.sync.b, e0.n] */
    /* JADX WARN: Type inference failed for: r9v8, types: [kotlinx.coroutines.sync.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b bVar, p7.c cVar) {
        SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        CoroutineSingletons coroutineSingletons;
        int i10;
        MutexImpl mutexImpl;
        d dVar;
        n nVar;
        d dVar2;
        Throwable th;
        Object s10;
        kotlinx.coroutines.sync.b bVar2;
        try {
            try {
                if (cVar instanceof SnackbarHostState$showSnackbar$2) {
                    snackbarHostState$showSnackbar$2 = (SnackbarHostState$showSnackbar$2) cVar;
                    int i11 = snackbarHostState$showSnackbar$2.f2438r;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        snackbarHostState$showSnackbar$2.f2438r = i11 - Integer.MIN_VALUE;
                        Object obj = snackbarHostState$showSnackbar$2.f2436p;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = snackbarHostState$showSnackbar$2.f2438r;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    bVar2 = snackbarHostState$showSnackbar$2.n;
                                    dVar2 = snackbarHostState$showSnackbar$2.f2433l;
                                    try {
                                        m0.b.n1(obj);
                                        dVar2.f2607b.setValue(null);
                                        bVar2.a(null);
                                        return obj;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        dVar2.f2607b.setValue(null);
                                        throw th;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ?? r92 = snackbarHostState$showSnackbar$2.n;
                            n nVar2 = snackbarHostState$showSnackbar$2.f2434m;
                            dVar = snackbarHostState$showSnackbar$2.f2433l;
                            m0.b.n1(obj);
                            mutexImpl = r92;
                            nVar = nVar2;
                        } else {
                            m0.b.n1(obj);
                            snackbarHostState$showSnackbar$2.f2433l = this;
                            snackbarHostState$showSnackbar$2.f2434m = bVar;
                            mutexImpl = this.f2606a;
                            snackbarHostState$showSnackbar$2.n = mutexImpl;
                            snackbarHostState$showSnackbar$2.f2438r = 1;
                            if (mutexImpl.b(null, snackbarHostState$showSnackbar$2) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            dVar = this;
                            nVar = bVar;
                        }
                        snackbarHostState$showSnackbar$2.f2433l = dVar;
                        snackbarHostState$showSnackbar$2.f2434m = nVar;
                        snackbarHostState$showSnackbar$2.n = mutexImpl;
                        snackbarHostState$showSnackbar$2.f2435o = snackbarHostState$showSnackbar$2;
                        snackbarHostState$showSnackbar$2.f2438r = 2;
                        j jVar = new j(1, m0.b.y0(snackbarHostState$showSnackbar$2));
                        jVar.u();
                        dVar.f2607b.setValue(new a(nVar, jVar));
                        s10 = jVar.s();
                        if (s10 != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        dVar2 = dVar;
                        MutexImpl mutexImpl2 = mutexImpl;
                        obj = s10;
                        bVar2 = mutexImpl2;
                        dVar2.f2607b.setValue(null);
                        bVar2.a(null);
                        return obj;
                    }
                }
                snackbarHostState$showSnackbar$2.f2433l = dVar;
                snackbarHostState$showSnackbar$2.f2434m = nVar;
                snackbarHostState$showSnackbar$2.n = mutexImpl;
                snackbarHostState$showSnackbar$2.f2435o = snackbarHostState$showSnackbar$2;
                snackbarHostState$showSnackbar$2.f2438r = 2;
                j jVar2 = new j(1, m0.b.y0(snackbarHostState$showSnackbar$2));
                jVar2.u();
                dVar.f2607b.setValue(new a(nVar, jVar2));
                s10 = jVar2.s();
                if (s10 != coroutineSingletons) {
                }
            } catch (Throwable th3) {
                dVar2 = dVar;
                MutexImpl mutexImpl3 = mutexImpl;
                th = th3;
                dVar2.f2607b.setValue(null);
                throw th;
            }
            if (i10 == 0) {
            }
        } catch (Throwable th4) {
            bVar.a(null);
            throw th4;
        }
        snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, cVar);
        Object obj2 = snackbarHostState$showSnackbar$2.f2436p;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = snackbarHostState$showSnackbar$2.f2438r;
    }
}
