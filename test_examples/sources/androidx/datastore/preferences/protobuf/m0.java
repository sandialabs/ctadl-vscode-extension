package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.v;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class m0<T> implements w0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f4922a;

    /* renamed from: b  reason: collision with root package name */
    public final b1<?, ?> f4923b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final n<?> f4924d;

    public m0(b1<?, ?> b1Var, n<?> nVar, i0 i0Var) {
        this.f4923b = b1Var;
        this.c = nVar.e(i0Var);
        this.f4924d = nVar;
        this.f4922a = i0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void a(T t10, T t11) {
        Class<?> cls = x0.f4952a;
        b1<?, ?> b1Var = this.f4923b;
        b1Var.o(t10, b1Var.k(b1Var.g(t10), b1Var.g(t11)));
        if (this.c) {
            x0.A(this.f4924d, t10, t11);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void b(T t10, v0 v0Var, m mVar) {
        b1 b1Var = this.f4923b;
        c1 f10 = b1Var.f(t10);
        n nVar = this.f4924d;
        q<ET> d5 = nVar.d(t10);
        while (v0Var.r() != Integer.MAX_VALUE && j(v0Var, mVar, nVar, d5, b1Var, f10)) {
            try {
            } finally {
                b1Var.n(t10, f10);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void c(T t10) {
        this.f4923b.j(t10);
        this.f4924d.f(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void d(Object obj, i iVar) {
        Object value;
        Iterator<Map.Entry<?, Object>> l2 = this.f4924d.c(obj).l();
        while (l2.hasNext()) {
            Map.Entry<?, Object> next = l2.next();
            q.a aVar = (q.a) next.getKey();
            if (aVar.f() == WireFormat$JavaType.f4837r) {
                aVar.d();
                aVar.g();
                boolean z10 = next instanceof v.a;
                aVar.c();
                if (z10) {
                    value = ((v.a) next).f4947i.getValue().b();
                } else {
                    value = next.getValue();
                }
                iVar.l(0, value);
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        b1<?, ?> b1Var = this.f4923b;
        b1Var.r(b1Var.g(obj), iVar);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final boolean e(T t10) {
        return this.f4924d.c(t10).j();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final boolean f(T t10, T t11) {
        b1<?, ?> b1Var = this.f4923b;
        if (b1Var.g(t10).equals(b1Var.g(t11))) {
            if (this.c) {
                n<?> nVar = this.f4924d;
                return nVar.c(t10).equals(nVar.c(t11));
            }
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final int g(T t10) {
        z0<?, Object> z0Var;
        b1<?, ?> b1Var = this.f4923b;
        int i10 = 0;
        int i11 = b1Var.i(b1Var.g(t10)) + 0;
        if (this.c) {
            q<?> c = this.f4924d.c(t10);
            int i12 = 0;
            while (true) {
                z0Var = c.f4930a;
                if (i10 >= z0Var.d()) {
                    break;
                }
                i12 += q.g(z0Var.c(i10));
                i10++;
            }
            for (Map.Entry<?, Object> entry : z0Var.e()) {
                i12 += q.g(entry);
            }
            return i11 + i12;
        }
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final T h() {
        return (T) this.f4922a.d().j();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final int i(T t10) {
        int hashCode = this.f4923b.g(t10).hashCode();
        return this.c ? (hashCode * 53) + this.f4924d.c(t10).hashCode() : hashCode;
    }

    public final <UT, UB, ET extends q.a<ET>> boolean j(v0 v0Var, m mVar, n<ET> nVar, q<ET> qVar, b1<UT, UB> b1Var, UB ub) {
        int e10 = v0Var.e();
        i0 i0Var = this.f4922a;
        if (e10 != 11) {
            if ((e10 & 7) == 2) {
                GeneratedMessageLite.e b5 = nVar.b(mVar, i0Var, e10 >>> 3);
                if (b5 != null) {
                    nVar.h(b5);
                    return true;
                }
                return b1Var.l(ub, v0Var);
            }
            return v0Var.B();
        }
        GeneratedMessageLite.e eVar = null;
        ByteString byteString = null;
        int i10 = 0;
        while (v0Var.r() != Integer.MAX_VALUE) {
            int e11 = v0Var.e();
            if (e11 == 16) {
                i10 = v0Var.y();
                eVar = nVar.b(mVar, i0Var, i10);
            } else if (e11 == 26) {
                if (eVar != null) {
                    nVar.h(eVar);
                } else {
                    byteString = v0Var.w();
                }
            } else if (!v0Var.B()) {
                break;
            }
        }
        if (v0Var.e() == 12) {
            if (byteString != null) {
                if (eVar != null) {
                    nVar.i(eVar);
                } else {
                    b1Var.d(ub, i10, byteString);
                }
            }
            return true;
        }
        throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }
}
