package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public abstract class b1<T, B> {
    public abstract void a(int i10, int i11, Object obj);

    public abstract void b(int i10, long j2, Object obj);

    public abstract void c(B b5, int i10, T t10);

    public abstract void d(B b5, int i10, ByteString byteString);

    public abstract void e(int i10, long j2, Object obj);

    public abstract c1 f(Object obj);

    public abstract c1 g(Object obj);

    public abstract int h(T t10);

    public abstract int i(T t10);

    public abstract void j(Object obj);

    public abstract c1 k(Object obj, Object obj2);

    public final boolean l(B b5, v0 v0Var) {
        int e10 = v0Var.e();
        int i10 = e10 >>> 3;
        int i11 = e10 & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                a(i10, v0Var.p(), b5);
                                return true;
                            }
                            int i12 = InvalidProtocolBufferException.f4807i;
                            throw new InvalidProtocolBufferException.InvalidWireTypeException();
                        }
                        return false;
                    }
                    c1 m10 = m();
                    int i13 = (i10 << 3) | 4;
                    while (v0Var.r() != Integer.MAX_VALUE && l(m10, v0Var)) {
                    }
                    if (i13 == v0Var.e()) {
                        c(b5, i10, q(m10));
                        return true;
                    }
                    throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
                }
                d(b5, i10, v0Var.w());
                return true;
            }
            b(i10, v0Var.h(), b5);
            return true;
        }
        e(i10, v0Var.I(), b5);
        return true;
    }

    public abstract c1 m();

    public abstract void n(Object obj, B b5);

    public abstract void o(Object obj, T t10);

    public abstract void p();

    public abstract c1 q(Object obj);

    public abstract void r(Object obj, i iVar);

    public abstract void s(Object obj, i iVar);
}
