package r;

import r.i;

/* loaded from: classes.dex */
public final class f0<V extends i> implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final j f16981a;

    /* renamed from: b  reason: collision with root package name */
    public V f16982b;
    public V c;

    /* renamed from: d  reason: collision with root package name */
    public V f16983d;

    /* loaded from: classes.dex */
    public static final class a implements j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f16984a;

        public a(r rVar) {
            this.f16984a = rVar;
        }

        @Override // r.j
        public final r get(int i10) {
            return this.f16984a;
        }
    }

    public f0(j jVar) {
        this.f16981a = jVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(r rVar) {
        this(new a(rVar));
        v7.g.f(rVar, "anim");
    }

    @Override // r.b0
    public final /* synthetic */ void a() {
    }

    @Override // r.b0
    public final V b(long j2, V v3, V v10, V v11) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "targetValue");
        v7.g.f(v11, "initialVelocity");
        if (this.f16982b == null) {
            this.f16982b = (V) a1.c.W0(v3);
        }
        V v12 = this.f16982b;
        if (v12 == null) {
            v7.g.l("valueVector");
            throw null;
        }
        int b5 = v12.b();
        for (int i10 = 0; i10 < b5; i10++) {
            V v13 = this.f16982b;
            if (v13 == null) {
                v7.g.l("valueVector");
                throw null;
            }
            v13.e(i10, this.f16981a.get(i10).b(j2, v3.a(i10), v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f16982b;
        if (v14 != null) {
            return v14;
        }
        v7.g.l("valueVector");
        throw null;
    }

    @Override // r.b0
    public final V c(long j2, V v3, V v10, V v11) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "targetValue");
        v7.g.f(v11, "initialVelocity");
        if (this.c == null) {
            this.c = (V) a1.c.W0(v11);
        }
        V v12 = this.c;
        if (v12 == null) {
            v7.g.l("velocityVector");
            throw null;
        }
        int b5 = v12.b();
        for (int i10 = 0; i10 < b5; i10++) {
            V v13 = this.c;
            if (v13 == null) {
                v7.g.l("velocityVector");
                throw null;
            }
            v13.e(i10, this.f16981a.get(i10).c(j2, v3.a(i10), v10.a(i10), v11.a(i10)));
        }
        V v14 = this.c;
        if (v14 != null) {
            return v14;
        }
        v7.g.l("velocityVector");
        throw null;
    }

    @Override // r.b0
    public final long d(V v3, V v10, V v11) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "targetValue");
        b8.h it = a1.c.V1(0, v3.b()).iterator();
        long j2 = 0;
        while (it.f6502k) {
            int nextInt = it.nextInt();
            j2 = Math.max(j2, this.f16981a.get(nextInt).d(v3.a(nextInt), v10.a(nextInt), v11.a(nextInt)));
        }
        return j2;
    }

    @Override // r.b0
    public final V e(V v3, V v10, V v11) {
        v7.g.f(v3, "initialValue");
        v7.g.f(v10, "targetValue");
        if (this.f16983d == null) {
            this.f16983d = (V) a1.c.W0(v11);
        }
        V v12 = this.f16983d;
        if (v12 == null) {
            v7.g.l("endVelocityVector");
            throw null;
        }
        int b5 = v12.b();
        for (int i10 = 0; i10 < b5; i10++) {
            V v13 = this.f16983d;
            if (v13 == null) {
                v7.g.l("endVelocityVector");
                throw null;
            }
            v13.e(i10, this.f16981a.get(i10).e(v3.a(i10), v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f16983d;
        if (v14 != null) {
            return v14;
        }
        v7.g.l("endVelocityVector");
        throw null;
    }
}
