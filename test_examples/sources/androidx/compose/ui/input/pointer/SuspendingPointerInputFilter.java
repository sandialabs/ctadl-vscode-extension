package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.j1;
import b2.b;
import g1.c;
import g1.k;
import g1.o;
import g1.t;
import g1.u;
import g1.v;
import h0.e;
import j1.h;
import ja.i;
import ja.j;
import ja.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import m7.n;
import q0.d;
import u0.f;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class SuspendingPointerInputFilter extends t implements u, v, b {

    /* renamed from: j  reason: collision with root package name */
    public final j1 f3279j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b f3280k;

    /* renamed from: l  reason: collision with root package name */
    public k f3281l;

    /* renamed from: m  reason: collision with root package name */
    public final e<a<?>> f3282m;
    public final e<a<?>> n;

    /* renamed from: o  reason: collision with root package name */
    public k f3283o;

    /* renamed from: p  reason: collision with root package name */
    public long f3284p;

    /* renamed from: q  reason: collision with root package name */
    public x f3285q;

    /* loaded from: classes.dex */
    public final class a<R> implements c, b, p7.c<R> {

        /* renamed from: i  reason: collision with root package name */
        public final p7.c<R> f3286i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SuspendingPointerInputFilter f3287j;

        /* renamed from: k  reason: collision with root package name */
        public i<? super k> f3288k;

        /* renamed from: l  reason: collision with root package name */
        public PointerEventPass f3289l = PointerEventPass.Main;

        /* renamed from: m  reason: collision with root package name */
        public final EmptyCoroutineContext f3290m = EmptyCoroutineContext.f13021i;

        public a(j jVar) {
            this.f3286i = jVar;
            this.f3287j = SuspendingPointerInputFilter.this;
        }

        @Override // g1.c
        public final Object A(PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
            j jVar = new j(1, m0.b.y0(baseContinuationImpl));
            jVar.u();
            this.f3289l = pointerEventPass;
            this.f3288k = jVar;
            return jVar.s();
        }

        @Override // g1.c
        public final k C() {
            return SuspendingPointerInputFilter.this.f3281l;
        }

        @Override // b2.b
        public final float H(float f10) {
            return this.f3287j.H(f10);
        }

        @Override // g1.c
        public final long S() {
            long j2;
            SuspendingPointerInputFilter suspendingPointerInputFilter = SuspendingPointerInputFilter.this;
            long g02 = suspendingPointerInputFilter.g0(suspendingPointerInputFilter.f3279j.c());
            h hVar = suspendingPointerInputFilter.f11191i;
            if (hVar != null) {
                j2 = hVar.p();
            } else {
                j2 = 0;
            }
            return a1.c.v(Math.max(0.0f, f.d(g02) - ((int) (j2 >> 32))) / 2.0f, Math.max(0.0f, f.b(g02) - b2.h.b(j2)) / 2.0f);
        }

        @Override // b2.b
        public final int a0(float f10) {
            return this.f3287j.a0(f10);
        }

        @Override // p7.c
        public final CoroutineContext f() {
            return this.f3290m;
        }

        @Override // b2.b
        public final long g0(long j2) {
            return this.f3287j.g0(j2);
        }

        @Override // b2.b
        public final float getDensity() {
            return this.f3287j.getDensity();
        }

        @Override // g1.c
        public final j1 getViewConfiguration() {
            return SuspendingPointerInputFilter.this.f3279j;
        }

        @Override // b2.b
        public final float i0(long j2) {
            return this.f3287j.i0(j2);
        }

        @Override // g1.c
        public final long p() {
            return SuspendingPointerInputFilter.this.f3284p;
        }

        @Override // b2.b
        public final float r0(int i10) {
            return this.f3287j.r0(i10);
        }

        @Override // p7.c
        public final void t(Object obj) {
            SuspendingPointerInputFilter suspendingPointerInputFilter = SuspendingPointerInputFilter.this;
            synchronized (suspendingPointerInputFilter.f3282m) {
                suspendingPointerInputFilter.f3282m.l(this);
                n nVar = n.f16010a;
            }
            this.f3286i.t(obj);
        }

        @Override // b2.b
        public final float t0(float f10) {
            return this.f3287j.t0(f10);
        }

        @Override // b2.b
        public final float y() {
            return this.f3287j.y();
        }
    }

    public SuspendingPointerInputFilter(j1 j1Var, b bVar) {
        g.f(j1Var, "viewConfiguration");
        g.f(bVar, "density");
        this.f3279j = j1Var;
        this.f3280k = bVar;
        this.f3281l = SuspendingPointerInputFilterKt.f3292a;
        this.f3282m = new e<>(new a[16]);
        this.n = new e<>(new a[16]);
        this.f3284p = 0L;
    }

    @Override // b2.b
    public final float H(float f10) {
        return this.f3280k.H(f10);
    }

    @Override // g1.v
    public final <R> Object Q(p<? super c, ? super p7.c<? super R>, ? extends Object> pVar, p7.c<? super R> cVar) {
        j jVar = new j(1, m0.b.y0(cVar));
        jVar.u();
        a aVar = new a(jVar);
        synchronized (this.f3282m) {
            this.f3282m.b(aVar);
            new p7.e(m0.b.y0(m0.b.P(aVar, aVar, pVar))).t(n.f16010a);
        }
        jVar.x(new SuspendingPointerInputFilter$awaitPointerEventScope$2$2(aVar));
        return jVar.s();
    }

    @Override // q0.d
    public final /* synthetic */ d Z(d dVar) {
        return androidx.activity.e.b(this, dVar);
    }

    @Override // b2.b
    public final int a0(float f10) {
        return this.f3280k.a0(f10);
    }

    @Override // b2.b
    public final long g0(long j2) {
        return this.f3280k.g0(j2);
    }

    @Override // b2.b
    public final float getDensity() {
        return this.f3280k.getDensity();
    }

    @Override // g1.v
    public final j1 getViewConfiguration() {
        return this.f3279j;
    }

    @Override // q0.d
    public final Object h0(Object obj, p pVar) {
        g.f(pVar, "operation");
        return pVar.R(obj, this);
    }

    @Override // b2.b
    public final float i0(long j2) {
        return this.f3280k.i0(j2);
    }

    public final void l(k kVar, PointerEventPass pointerEventPass) {
        i<? super k> iVar;
        i<? super k> iVar2;
        synchronized (this.f3282m) {
            e<a<?>> eVar = this.n;
            eVar.c(eVar.f11334k, this.f3282m);
        }
        try {
            int ordinal = pointerEventPass.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                    }
                } else {
                    e<a<?>> eVar2 = this.n;
                    int i10 = eVar2.f11334k;
                    if (i10 > 0) {
                        int i11 = i10 - 1;
                        a<?>[] aVarArr = eVar2.f11332i;
                        g.d(aVarArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            a<?> aVar = aVarArr[i11];
                            if (pointerEventPass == aVar.f3289l && (iVar2 = aVar.f3288k) != null) {
                                aVar.f3288k = null;
                                iVar2.t(kVar);
                            }
                            i11--;
                        } while (i11 >= 0);
                    }
                }
            }
            e<a<?>> eVar3 = this.n;
            int i12 = eVar3.f11334k;
            if (i12 > 0) {
                a<?>[] aVarArr2 = eVar3.f11332i;
                g.d(aVarArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i13 = 0;
                do {
                    a<?> aVar2 = aVarArr2[i13];
                    if (pointerEventPass == aVar2.f3289l && (iVar = aVar2.f3288k) != null) {
                        aVar2.f3288k = null;
                        iVar.t(kVar);
                    }
                    i13++;
                } while (i13 < i12);
            }
        } finally {
            this.n.g();
        }
    }

    @Override // g1.u
    public final SuspendingPointerInputFilter q0() {
        return this;
    }

    @Override // b2.b
    public final float r0(int i10) {
        return this.f3280k.r0(i10);
    }

    public final void s() {
        boolean z10;
        float f10;
        k kVar = this.f3283o;
        if (kVar == null) {
            return;
        }
        List<o> list = kVar.f11159a;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            z10 = true;
            if (i11 >= size) {
                break;
            } else if (!(true ^ list.get(i11).f11164d)) {
                z10 = false;
                break;
            } else {
                i11++;
            }
        }
        if (z10) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        while (i10 < size2) {
            o oVar = list.get(i10);
            long j2 = oVar.f11162a;
            long j10 = oVar.c;
            long j11 = oVar.f11163b;
            Float f11 = oVar.f11170j;
            if (f11 != null) {
                f10 = f11.floatValue();
            } else {
                f10 = 0.0f;
            }
            long j12 = oVar.c;
            long j13 = oVar.f11163b;
            boolean z11 = oVar.f11164d;
            arrayList.add(new o(j2, j11, j10, false, f10, j13, j12, z11, z11, 1, u0.c.f17721b));
            i10++;
            list = list;
        }
        k kVar2 = new k(arrayList);
        this.f3281l = kVar2;
        l(kVar2, PointerEventPass.Initial);
        l(kVar2, PointerEventPass.Main);
        l(kVar2, PointerEventPass.Final);
        this.f3283o = null;
    }

    @Override // b2.b
    public final float t0(float f10) {
        return this.f3280k.t0(f10);
    }

    public final void w(k kVar, PointerEventPass pointerEventPass, long j2) {
        this.f3284p = j2;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.f3281l = kVar;
        }
        l(kVar, pointerEventPass);
        List<o> list = kVar.f11159a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!v0.p.g(list.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (!(!z10)) {
            kVar = null;
        }
        this.f3283o = kVar;
    }

    @Override // q0.d
    public final /* synthetic */ boolean x(l lVar) {
        return a4.b.a(this, lVar);
    }

    @Override // b2.b
    public final float y() {
        return this.f3280k.y();
    }
}
