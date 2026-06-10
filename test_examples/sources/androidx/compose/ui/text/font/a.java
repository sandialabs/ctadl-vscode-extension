package androidx.compose.ui.text.font;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import u1.d;
import u1.p;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final t1.a<b, C0027a> f4118a = new t1.a<>();

    /* renamed from: b  reason: collision with root package name */
    public final t1.b<b, C0027a> f4119b = new t1.b<>(0);
    public final m0.b c = new m0.b(0);

    /* renamed from: androidx.compose.ui.text.font.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0027a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f4120a;

        public /* synthetic */ C0027a(Object obj) {
            this.f4120a = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0027a)) {
                return false;
            }
            if (!g.a(this.f4120a, ((C0027a) obj).f4120a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Object obj = this.f4120a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.f4120a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final d f4121a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f4122b;

        public b(d dVar, Object obj) {
            g.f(dVar, "font");
            this.f4121a = dVar;
            this.f4122b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return g.a(this.f4121a, bVar.f4121a) && g.a(this.f4122b, bVar.f4122b);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f4121a.hashCode() * 31;
            Object obj = this.f4122b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "Key(font=" + this.f4121a + ", loaderKey=" + this.f4122b + ')';
        }
    }

    public static void b(a aVar, d dVar, p pVar, Object obj) {
        Object b5;
        pVar.c();
        b bVar = new b(dVar, null);
        synchronized (aVar.c) {
            try {
                if (obj == null) {
                    b5 = aVar.f4119b.d(bVar, new C0027a(null));
                } else {
                    b5 = aVar.f4118a.b(bVar, new C0027a(obj));
                }
                C0027a c0027a = (C0027a) b5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0027a a(d dVar, p pVar) {
        C0027a a10;
        pVar.c();
        b bVar = new b(dVar, null);
        synchronized (this.c) {
            a10 = this.f4118a.a(bVar);
            if (a10 == null) {
                a10 = this.f4119b.a(bVar);
            }
        }
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(d dVar, p pVar, l lVar, p7.c cVar) {
        AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        int i10;
        boolean z10;
        a aVar;
        b bVar;
        t1.b<b, C0027a> bVar2;
        C0027a c0027a;
        if (cVar instanceof AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (AsyncTypefaceCache$runCached$1) cVar;
            int i11 = asyncTypefaceCache$runCached$1.f4110q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                asyncTypefaceCache$runCached$1.f4110q = i11 - Integer.MIN_VALUE;
                Object obj = asyncTypefaceCache$runCached$1.f4108o;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = asyncTypefaceCache$runCached$1.f4110q;
                if (i10 == 0) {
                    if (i10 == 1) {
                        z10 = asyncTypefaceCache$runCached$1.n;
                        bVar = asyncTypefaceCache$runCached$1.f4107m;
                        aVar = asyncTypefaceCache$runCached$1.f4106l;
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    pVar.c();
                    b bVar3 = new b(dVar, null);
                    synchronized (this.c) {
                        C0027a a10 = this.f4118a.a(bVar3);
                        if (a10 == null) {
                            a10 = this.f4119b.a(bVar3);
                        }
                        if (a10 != null) {
                            return a10.f4120a;
                        }
                        n nVar = n.f16010a;
                        asyncTypefaceCache$runCached$1.f4106l = this;
                        asyncTypefaceCache$runCached$1.f4107m = bVar3;
                        z10 = false;
                        asyncTypefaceCache$runCached$1.n = false;
                        asyncTypefaceCache$runCached$1.f4110q = 1;
                        Object U = ((AsyncFontListLoader$load$2$typeface$1) lVar).U(asyncTypefaceCache$runCached$1);
                        if (U == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar = this;
                        obj = U;
                        bVar = bVar3;
                    }
                }
                synchronized (aVar.c) {
                    try {
                        if (obj == null) {
                            bVar2 = aVar.f4119b;
                            c0027a = new C0027a(null);
                        } else if (z10) {
                            bVar2 = aVar.f4119b;
                            c0027a = new C0027a(obj);
                        } else {
                            aVar.f4118a.b(bVar, new C0027a(obj));
                            n nVar2 = n.f16010a;
                        }
                        bVar2.d(bVar, c0027a);
                        n nVar22 = n.f16010a;
                    } finally {
                    }
                }
                return obj;
            }
        }
        asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, cVar);
        Object obj2 = asyncTypefaceCache$runCached$1.f4108o;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = asyncTypefaceCache$runCached$1.f4110q;
        if (i10 == 0) {
        }
        synchronized (aVar.c) {
        }
    }
}
