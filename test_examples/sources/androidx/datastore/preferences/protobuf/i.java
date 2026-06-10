package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final CodedOutputStream f4897a;

    public i(CodedOutputStream codedOutputStream) {
        Charset charset = u.f4942a;
        if (codedOutputStream != null) {
            this.f4897a = codedOutputStream;
            codedOutputStream.f4782i = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i10, boolean z10) {
        this.f4897a.k1(i10, z10);
    }

    public final void b(int i10, ByteString byteString) {
        this.f4897a.m1(i10, byteString);
    }

    public final void c(double d5, int i10) {
        CodedOutputStream codedOutputStream = this.f4897a;
        codedOutputStream.getClass();
        codedOutputStream.q1(Double.doubleToRawLongBits(d5), i10);
    }

    public final void d(int i10, int i11) {
        this.f4897a.s1(i10, i11);
    }

    public final void e(int i10, int i11) {
        this.f4897a.o1(i10, i11);
    }

    public final void f(long j2, int i10) {
        this.f4897a.q1(j2, i10);
    }

    public final void g(int i10, float f10) {
        CodedOutputStream codedOutputStream = this.f4897a;
        codedOutputStream.getClass();
        codedOutputStream.o1(i10, Float.floatToRawIntBits(f10));
    }

    public final void h(int i10, w0 w0Var, Object obj) {
        CodedOutputStream codedOutputStream = this.f4897a;
        codedOutputStream.A1(i10, 3);
        w0Var.d((i0) obj, codedOutputStream.f4782i);
        codedOutputStream.A1(i10, 4);
    }

    public final void i(int i10, int i11) {
        this.f4897a.s1(i10, i11);
    }

    public final void j(long j2, int i10) {
        this.f4897a.D1(j2, i10);
    }

    public final void k(int i10, w0 w0Var, Object obj) {
        this.f4897a.u1(i10, (i0) obj, w0Var);
    }

    public final void l(int i10, Object obj) {
        boolean z10 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f4897a;
        if (z10) {
            codedOutputStream.x1(i10, (ByteString) obj);
        } else {
            codedOutputStream.w1(i10, (i0) obj);
        }
    }

    public final void m(int i10, int i11) {
        this.f4897a.o1(i10, i11);
    }

    public final void n(long j2, int i10) {
        this.f4897a.q1(j2, i10);
    }

    public final void o(int i10, int i11) {
        this.f4897a.B1(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void p(long j2, int i10) {
        this.f4897a.D1((j2 >> 63) ^ (j2 << 1), i10);
    }

    public final void q(int i10, int i11) {
        this.f4897a.B1(i10, i11);
    }

    public final void r(long j2, int i10) {
        this.f4897a.D1(j2, i10);
    }
}
