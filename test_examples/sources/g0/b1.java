package g0;

import androidx.compose.runtime.snapshots.SnapshotKt;

/* loaded from: classes.dex */
public class b1<T> implements p0.w, p0.m<T> {

    /* renamed from: i  reason: collision with root package name */
    public final c1<T> f11035i;

    /* renamed from: j  reason: collision with root package name */
    public a<T> f11036j;

    /* loaded from: classes.dex */
    public static final class a<T> extends p0.x {
        public T c;

        public a(T t10) {
            this.c = t10;
        }

        @Override // p0.x
        public final void a(p0.x xVar) {
            this.c = ((a) xVar).c;
        }

        @Override // p0.x
        public final p0.x b() {
            return new a(this.c);
        }
    }

    public b1(T t10, c1<T> c1Var) {
        v7.g.f(c1Var, "policy");
        this.f11035i = c1Var;
        this.f11036j = new a<>(t10);
    }

    @Override // p0.m
    public final c1<T> c() {
        return this.f11035i;
    }

    @Override // p0.w
    public final p0.x d() {
        return this.f11036j;
    }

    @Override // p0.w
    public final p0.x g(p0.x xVar, p0.x xVar2, p0.x xVar3) {
        a aVar = (a) xVar;
        T t10 = ((a) xVar2).c;
        T t11 = ((a) xVar3).c;
        c1<T> c1Var = this.f11035i;
        if (!c1Var.a(t10, t11)) {
            c1Var.b();
            return null;
        }
        return xVar2;
    }

    @Override // g0.g0, g0.g1
    public final T getValue() {
        return ((a) SnapshotKt.p(this.f11036j, this)).c;
    }

    @Override // g0.g0
    public final void setValue(T t10) {
        p0.f i10;
        a aVar = (a) SnapshotKt.h(this.f11036j);
        if (!this.f11035i.a(aVar.c, t10)) {
            a<T> aVar2 = this.f11036j;
            synchronized (SnapshotKt.c) {
                i10 = SnapshotKt.i();
                ((a) SnapshotKt.m(aVar2, this, i10, aVar)).c = t10;
                m7.n nVar = m7.n.f16010a;
            }
            SnapshotKt.l(i10, this);
        }
    }

    @Override // p0.w
    public final void t(p0.x xVar) {
        this.f11036j = (a) xVar;
    }

    public final String toString() {
        return "MutableState(value=" + ((a) SnapshotKt.h(this.f11036j)).c + ")@" + hashCode();
    }
}
