package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.c0;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h implements v0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f4894a;

    /* renamed from: b  reason: collision with root package name */
    public int f4895b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f4896d = 0;

    public h(g gVar) {
        Charset charset = u.f4942a;
        if (gVar != null) {
            this.f4894a = gVar;
            gVar.f4878d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final <T> void A(List<T> list, w0<T> w0Var, m mVar) {
        int u10;
        int i10 = this.f4895b;
        if ((i10 & 7) == 3) {
            do {
                list.add(P(w0Var, mVar));
                g gVar = this.f4894a;
                if (!gVar.c() && this.f4896d == 0) {
                    u10 = gVar.u();
                }
                return;
            } while (u10 == i10);
            this.f4896d = u10;
            return;
        }
        int i11 = InvalidProtocolBufferException.f4807i;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean B() {
        int i10;
        g gVar = this.f4894a;
        if (!gVar.c() && (i10 = this.f4895b) != this.c) {
            return gVar.x(i10);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int C() {
        T(5);
        return this.f4894a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void D(List<ByteString> list) {
        int u10;
        if ((this.f4895b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(w());
            g gVar = this.f4894a;
            if (gVar.c()) {
                return;
            }
            u10 = gVar.u();
        } while (u10 == this.f4895b);
        this.f4896d = u10;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void E(List<Double> list) {
        int u10;
        int u11;
        boolean z10 = list instanceof j;
        g gVar = this.f4894a;
        if (!z10) {
            int i10 = this.f4895b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(gVar.h()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                int v3 = gVar.v();
                V(v3);
                int b5 = gVar.b() + v3;
                do {
                    list.add(Double.valueOf(gVar.h()));
                } while (gVar.b() < b5);
                return;
            }
        }
        j jVar = (j) list;
        int i11 = this.f4895b & 7;
        if (i11 == 1) {
            do {
                jVar.d(gVar.h());
                if (gVar.c()) {
                    return;
                }
                u11 = gVar.u();
            } while (u11 == this.f4895b);
            this.f4896d = u11;
        } else if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        } else {
            int v10 = gVar.v();
            V(v10);
            int b10 = gVar.b() + v10;
            do {
                jVar.d(gVar.h());
            } while (gVar.b() < b10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final <T> void F(List<T> list, w0<T> w0Var, m mVar) {
        int u10;
        int i10 = this.f4895b;
        if ((i10 & 7) == 2) {
            do {
                list.add(Q(w0Var, mVar));
                g gVar = this.f4894a;
                if (!gVar.c() && this.f4896d == 0) {
                    u10 = gVar.u();
                }
                return;
            } while (u10 == i10);
            this.f4896d = u10;
            return;
        }
        int i11 = InvalidProtocolBufferException.f4807i;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void G(List<Long> list) {
        int u10;
        int b5;
        int u11;
        boolean z10 = list instanceof a0;
        g gVar = this.f4894a;
        if (z10) {
            a0 a0Var = (a0) list;
            int i10 = this.f4895b & 7;
            if (i10 == 0) {
                do {
                    a0Var.d(gVar.n());
                    if (gVar.c()) {
                        return;
                    }
                    u11 = gVar.u();
                } while (u11 == this.f4895b);
                this.f4896d = u11;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    a0Var.d(gVar.n());
                } while (gVar.b() < b5);
            }
        } else {
            int i11 = this.f4895b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(gVar.n()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i11 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    list.add(Long.valueOf(gVar.n()));
                } while (gVar.b() < b5);
            }
        }
        S(b5);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void H(List<Long> list) {
        int u10;
        int u11;
        boolean z10 = list instanceof a0;
        g gVar = this.f4894a;
        if (!z10) {
            int i10 = this.f4895b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(gVar.p()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                int v3 = gVar.v();
                V(v3);
                int b5 = gVar.b() + v3;
                do {
                    list.add(Long.valueOf(gVar.p()));
                } while (gVar.b() < b5);
                return;
            }
        }
        a0 a0Var = (a0) list;
        int i11 = this.f4895b & 7;
        if (i11 == 1) {
            do {
                a0Var.d(gVar.p());
                if (gVar.c()) {
                    return;
                }
                u11 = gVar.u();
            } while (u11 == this.f4895b);
            this.f4896d = u11;
        } else if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        } else {
            int v10 = gVar.v();
            V(v10);
            int b10 = gVar.b() + v10;
            do {
                a0Var.d(gVar.p());
            } while (gVar.b() < b10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final long I() {
        T(0);
        return this.f4894a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final String J() {
        T(2);
        return this.f4894a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void K(List<Long> list) {
        int u10;
        int u11;
        boolean z10 = list instanceof a0;
        g gVar = this.f4894a;
        if (!z10) {
            int i10 = this.f4895b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(gVar.k()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                int v3 = gVar.v();
                V(v3);
                int b5 = gVar.b() + v3;
                do {
                    list.add(Long.valueOf(gVar.k()));
                } while (gVar.b() < b5);
                return;
            }
        }
        a0 a0Var = (a0) list;
        int i11 = this.f4895b & 7;
        if (i11 == 1) {
            do {
                a0Var.d(gVar.k());
                if (gVar.c()) {
                    return;
                }
                u11 = gVar.u();
            } while (u11 == this.f4895b);
            this.f4896d = u11;
        } else if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        } else {
            int v10 = gVar.v();
            V(v10);
            int b10 = gVar.b() + v10;
            do {
                a0Var.d(gVar.k());
            } while (gVar.b() < b10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void L(List<Integer> list) {
        int u10;
        int b5;
        int u11;
        boolean z10 = list instanceof t;
        g gVar = this.f4894a;
        if (z10) {
            t tVar = (t) list;
            int i10 = this.f4895b & 7;
            if (i10 == 0) {
                do {
                    tVar.d(gVar.m());
                    if (gVar.c()) {
                        return;
                    }
                    u11 = gVar.u();
                } while (u11 == this.f4895b);
                this.f4896d = u11;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    tVar.d(gVar.m());
                } while (gVar.b() < b5);
            }
        } else {
            int i11 = this.f4895b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(gVar.m()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i11 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    list.add(Integer.valueOf(gVar.m()));
                } while (gVar.b() < b5);
            }
        }
        S(b5);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void M(List<Integer> list) {
        int u10;
        int b5;
        int u11;
        boolean z10 = list instanceof t;
        g gVar = this.f4894a;
        if (z10) {
            t tVar = (t) list;
            int i10 = this.f4895b & 7;
            if (i10 == 0) {
                do {
                    tVar.d(gVar.i());
                    if (gVar.c()) {
                        return;
                    }
                    u11 = gVar.u();
                } while (u11 == this.f4895b);
                this.f4896d = u11;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    tVar.d(gVar.i());
                } while (gVar.b() < b5);
            }
        } else {
            int i11 = this.f4895b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(gVar.i()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i11 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    list.add(Integer.valueOf(gVar.i()));
                } while (gVar.b() < b5);
            }
        }
        S(b5);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final <T> T N(w0<T> w0Var, m mVar) {
        T(3);
        return (T) P(w0Var, mVar);
    }

    public final Object O(WireFormat$FieldType wireFormat$FieldType, Class<?> cls, m mVar) {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return Long.valueOf(I());
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return Long.valueOf(f());
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return Integer.valueOf(z());
            case 5:
                return Long.valueOf(h());
            case 6:
                return Integer.valueOf(p());
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(q());
            case 8:
                return J();
            case ma.i.f16046m /* 9 */:
            default:
                throw new RuntimeException("unsupported field type.");
            case ma.i.f16047o /* 10 */:
                T(2);
                return Q(s0.c.a(cls), mVar);
            case 11:
                return w();
            case 12:
                return Integer.valueOf(y());
            case 13:
                return Integer.valueOf(d());
            case 14:
                return Integer.valueOf(C());
            case ma.i.f16049q /* 15 */:
                return Long.valueOf(t());
            case 16:
                return Integer.valueOf(j());
            case 17:
                return Long.valueOf(l());
        }
    }

    public final <T> T P(w0<T> w0Var, m mVar) {
        int i10 = this.c;
        this.c = ((this.f4895b >>> 3) << 3) | 4;
        try {
            T h10 = w0Var.h();
            w0Var.b(h10, this, mVar);
            w0Var.c(h10);
            if (this.f4895b == this.c) {
                return h10;
            }
            throw InvalidProtocolBufferException.e();
        } finally {
            this.c = i10;
        }
    }

    public final <T> T Q(w0<T> w0Var, m mVar) {
        g gVar = this.f4894a;
        int v3 = gVar.v();
        if (gVar.f4876a < gVar.f4877b) {
            int e10 = gVar.e(v3);
            T h10 = w0Var.h();
            gVar.f4876a++;
            w0Var.b(h10, this, mVar);
            w0Var.c(h10);
            gVar.a(0);
            gVar.f4876a--;
            gVar.d(e10);
            return h10;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void R(List<String> list, boolean z10) {
        int u10;
        int u11;
        if ((this.f4895b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        boolean z11 = list instanceof y;
        g gVar = this.f4894a;
        if (!z11 || z10) {
            do {
                list.add(z10 ? J() : o());
                if (gVar.c()) {
                    return;
                }
                u10 = gVar.u();
            } while (u10 == this.f4895b);
            this.f4896d = u10;
            return;
        }
        y yVar = (y) list;
        do {
            yVar.n(w());
            if (gVar.c()) {
                return;
            }
            u11 = gVar.u();
        } while (u11 == this.f4895b);
        this.f4896d = u11;
    }

    public final void S(int i10) {
        if (this.f4894a.b() != i10) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final void T(int i10) {
        if ((this.f4895b & 7) != i10) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final void U(int i10) {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void V(int i10) {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final <T> T a(w0<T> w0Var, m mVar) {
        T(2);
        return (T) Q(w0Var, mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void b(Map<K, V> map, c0.a<K, V> aVar, m mVar) {
        T(2);
        g gVar = this.f4894a;
        int e10 = gVar.e(gVar.v());
        Object obj = aVar.f4849b;
        V v3 = aVar.f4850d;
        V v10 = v3;
        while (true) {
            try {
                int r3 = r();
                if (r3 == Integer.MAX_VALUE || gVar.c()) {
                    break;
                } else if (r3 == 1) {
                    obj = O(aVar.f4848a, null, null);
                } else if (r3 != 2) {
                    try {
                        if (!B()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!B()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    v10 = O(aVar.c, v3.getClass(), mVar);
                }
            } finally {
                gVar.d(e10);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void c(List<Integer> list) {
        int u10;
        int b5;
        int u11;
        boolean z10 = list instanceof t;
        g gVar = this.f4894a;
        if (z10) {
            t tVar = (t) list;
            int i10 = this.f4895b & 7;
            if (i10 == 0) {
                do {
                    tVar.d(gVar.q());
                    if (gVar.c()) {
                        return;
                    }
                    u11 = gVar.u();
                } while (u11 == this.f4895b);
                this.f4896d = u11;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    tVar.d(gVar.q());
                } while (gVar.b() < b5);
            }
        } else {
            int i11 = this.f4895b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(gVar.q()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i11 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    list.add(Integer.valueOf(gVar.q()));
                } while (gVar.b() < b5);
            }
        }
        S(b5);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int d() {
        T(0);
        return this.f4894a.i();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int e() {
        return this.f4895b;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final long f() {
        T(0);
        return this.f4894a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void g(List<Integer> list) {
        int u10;
        int u11;
        boolean z10 = list instanceof t;
        g gVar = this.f4894a;
        if (!z10) {
            int i10 = this.f4895b & 7;
            if (i10 == 2) {
                int v3 = gVar.v();
                U(v3);
                int b5 = gVar.b() + v3;
                do {
                    list.add(Integer.valueOf(gVar.j()));
                } while (gVar.b() < b5);
                return;
            } else if (i10 != 5) {
                throw InvalidProtocolBufferException.b();
            } else {
                do {
                    list.add(Integer.valueOf(gVar.j()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            }
        }
        t tVar = (t) list;
        int i11 = this.f4895b & 7;
        if (i11 == 2) {
            int v10 = gVar.v();
            U(v10);
            int b10 = gVar.b() + v10;
            do {
                tVar.d(gVar.j());
            } while (gVar.b() < b10);
        } else if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        } else {
            do {
                tVar.d(gVar.j());
                if (gVar.c()) {
                    return;
                }
                u11 = gVar.u();
            } while (u11 == this.f4895b);
            this.f4896d = u11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final long h() {
        T(1);
        return this.f4894a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void i(List<Integer> list) {
        int u10;
        int u11;
        boolean z10 = list instanceof t;
        g gVar = this.f4894a;
        if (!z10) {
            int i10 = this.f4895b & 7;
            if (i10 == 2) {
                int v3 = gVar.v();
                U(v3);
                int b5 = gVar.b() + v3;
                do {
                    list.add(Integer.valueOf(gVar.o()));
                } while (gVar.b() < b5);
                return;
            } else if (i10 != 5) {
                throw InvalidProtocolBufferException.b();
            } else {
                do {
                    list.add(Integer.valueOf(gVar.o()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            }
        }
        t tVar = (t) list;
        int i11 = this.f4895b & 7;
        if (i11 == 2) {
            int v10 = gVar.v();
            U(v10);
            int b10 = gVar.b() + v10;
            do {
                tVar.d(gVar.o());
            } while (gVar.b() < b10);
        } else if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        } else {
            do {
                tVar.d(gVar.o());
                if (gVar.c()) {
                    return;
                }
                u11 = gVar.u();
            } while (u11 == this.f4895b);
            this.f4896d = u11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int j() {
        T(0);
        return this.f4894a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void k(List<Long> list) {
        int u10;
        int b5;
        int u11;
        boolean z10 = list instanceof a0;
        g gVar = this.f4894a;
        if (z10) {
            a0 a0Var = (a0) list;
            int i10 = this.f4895b & 7;
            if (i10 == 0) {
                do {
                    a0Var.d(gVar.r());
                    if (gVar.c()) {
                        return;
                    }
                    u11 = gVar.u();
                } while (u11 == this.f4895b);
                this.f4896d = u11;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    a0Var.d(gVar.r());
                } while (gVar.b() < b5);
            }
        } else {
            int i11 = this.f4895b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(gVar.r()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i11 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    list.add(Long.valueOf(gVar.r()));
                } while (gVar.b() < b5);
            }
        }
        S(b5);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final long l() {
        T(0);
        return this.f4894a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void m(List<Integer> list) {
        int u10;
        int b5;
        int u11;
        boolean z10 = list instanceof t;
        g gVar = this.f4894a;
        if (z10) {
            t tVar = (t) list;
            int i10 = this.f4895b & 7;
            if (i10 == 0) {
                do {
                    tVar.d(gVar.v());
                    if (gVar.c()) {
                        return;
                    }
                    u11 = gVar.u();
                } while (u11 == this.f4895b);
                this.f4896d = u11;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    tVar.d(gVar.v());
                } while (gVar.b() < b5);
            }
        } else {
            int i11 = this.f4895b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(gVar.v()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i11 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    list.add(Integer.valueOf(gVar.v()));
                } while (gVar.b() < b5);
            }
        }
        S(b5);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void n(List<Boolean> list) {
        int u10;
        int b5;
        int u11;
        boolean z10 = list instanceof e;
        g gVar = this.f4894a;
        if (z10) {
            e eVar = (e) list;
            int i10 = this.f4895b & 7;
            if (i10 == 0) {
                do {
                    eVar.d(gVar.f());
                    if (gVar.c()) {
                        return;
                    }
                    u11 = gVar.u();
                } while (u11 == this.f4895b);
                this.f4896d = u11;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    eVar.d(gVar.f());
                } while (gVar.b() < b5);
            }
        } else {
            int i11 = this.f4895b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(gVar.f()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i11 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    list.add(Boolean.valueOf(gVar.f()));
                } while (gVar.b() < b5);
            }
        }
        S(b5);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final String o() {
        T(2);
        return this.f4894a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int p() {
        T(5);
        return this.f4894a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean q() {
        T(0);
        return this.f4894a.f();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int r() {
        int i10 = this.f4896d;
        if (i10 != 0) {
            this.f4895b = i10;
            this.f4896d = 0;
        } else {
            this.f4895b = this.f4894a.u();
        }
        int i11 = this.f4895b;
        if (i11 != 0 && i11 != this.c) {
            return i11 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final double readDouble() {
        T(1);
        return this.f4894a.h();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final float readFloat() {
        T(5);
        return this.f4894a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void s(List<String> list) {
        R(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final long t() {
        T(1);
        return this.f4894a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void u(List<Long> list) {
        int u10;
        int b5;
        int u11;
        boolean z10 = list instanceof a0;
        g gVar = this.f4894a;
        if (z10) {
            a0 a0Var = (a0) list;
            int i10 = this.f4895b & 7;
            if (i10 == 0) {
                do {
                    a0Var.d(gVar.w());
                    if (gVar.c()) {
                        return;
                    }
                    u11 = gVar.u();
                } while (u11 == this.f4895b);
                this.f4896d = u11;
                return;
            } else if (i10 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    a0Var.d(gVar.w());
                } while (gVar.b() < b5);
            }
        } else {
            int i11 = this.f4895b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(gVar.w()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            } else if (i11 != 2) {
                throw InvalidProtocolBufferException.b();
            } else {
                b5 = gVar.b() + gVar.v();
                do {
                    list.add(Long.valueOf(gVar.w()));
                } while (gVar.b() < b5);
            }
        }
        S(b5);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void v(List<String> list) {
        R(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final ByteString w() {
        T(2);
        return this.f4894a.g();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void x(List<Float> list) {
        int u10;
        int u11;
        boolean z10 = list instanceof r;
        g gVar = this.f4894a;
        if (!z10) {
            int i10 = this.f4895b & 7;
            if (i10 == 2) {
                int v3 = gVar.v();
                U(v3);
                int b5 = gVar.b() + v3;
                do {
                    list.add(Float.valueOf(gVar.l()));
                } while (gVar.b() < b5);
                return;
            } else if (i10 != 5) {
                throw InvalidProtocolBufferException.b();
            } else {
                do {
                    list.add(Float.valueOf(gVar.l()));
                    if (gVar.c()) {
                        return;
                    }
                    u10 = gVar.u();
                } while (u10 == this.f4895b);
                this.f4896d = u10;
                return;
            }
        }
        r rVar = (r) list;
        int i11 = this.f4895b & 7;
        if (i11 == 2) {
            int v10 = gVar.v();
            U(v10);
            int b10 = gVar.b() + v10;
            do {
                rVar.d(gVar.l());
            } while (gVar.b() < b10);
        } else if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        } else {
            do {
                rVar.d(gVar.l());
                if (gVar.c()) {
                    return;
                }
                u11 = gVar.u();
            } while (u11 == this.f4895b);
            this.f4896d = u11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int y() {
        T(0);
        return this.f4894a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int z() {
        T(0);
        return this.f4894a.m();
    }
}
