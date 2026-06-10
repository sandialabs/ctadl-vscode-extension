package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d1 extends b1<c1, c1> {
    @Override // androidx.datastore.preferences.protobuf.b1
    public final void a(int i10, int i11, Object obj) {
        ((c1) obj).b((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void b(int i10, long j2, Object obj) {
        ((c1) obj).b((i10 << 3) | 1, Long.valueOf(j2));
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void c(c1 c1Var, int i10, c1 c1Var2) {
        c1Var.b((i10 << 3) | 3, c1Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void d(c1 c1Var, int i10, ByteString byteString) {
        c1Var.b((i10 << 3) | 2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void e(int i10, long j2, Object obj) {
        ((c1) obj).b((i10 << 3) | 0, Long.valueOf(j2));
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final c1 f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        c1 c1Var = generatedMessageLite.unknownFields;
        if (c1Var == c1.f4851f) {
            c1 c1Var2 = new c1();
            generatedMessageLite.unknownFields = c1Var2;
            return c1Var2;
        }
        return c1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final c1 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final int h(c1 c1Var) {
        return c1Var.a();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final int i(c1 c1Var) {
        c1 c1Var2 = c1Var;
        int i10 = c1Var2.f4854d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < c1Var2.f4852a; i12++) {
                int e12 = CodedOutputStream.e1(2, c1Var2.f4853b[i12] >>> 3);
                i11 += CodedOutputStream.M0(3, (ByteString) c1Var2.c[i12]) + e12 + (CodedOutputStream.d1(1) * 2);
            }
            c1Var2.f4854d = i11;
            return i11;
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f4855e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final c1 k(Object obj, Object obj2) {
        c1 c1Var = (c1) obj;
        c1 c1Var2 = (c1) obj2;
        if (!c1Var2.equals(c1.f4851f)) {
            int i10 = c1Var.f4852a + c1Var2.f4852a;
            int[] copyOf = Arrays.copyOf(c1Var.f4853b, i10);
            System.arraycopy(c1Var2.f4853b, 0, copyOf, c1Var.f4852a, c1Var2.f4852a);
            Object[] copyOf2 = Arrays.copyOf(c1Var.c, i10);
            System.arraycopy(c1Var2.c, 0, copyOf2, c1Var.f4852a, c1Var2.f4852a);
            return new c1(i10, copyOf, copyOf2, true);
        }
        return c1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final c1 m() {
        return new c1();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void n(Object obj, c1 c1Var) {
        ((GeneratedMessageLite) obj).unknownFields = c1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void o(Object obj, c1 c1Var) {
        ((GeneratedMessageLite) obj).unknownFields = c1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void p() {
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final c1 q(Object obj) {
        c1 c1Var = (c1) obj;
        c1Var.f4855e = false;
        return c1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void r(Object obj, i iVar) {
        c1 c1Var = (c1) obj;
        c1Var.getClass();
        iVar.getClass();
        for (int i10 = 0; i10 < c1Var.f4852a; i10++) {
            iVar.l(c1Var.f4853b[i10] >>> 3, c1Var.c[i10]);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void s(Object obj, i iVar) {
        ((c1) obj).c(iVar);
    }
}
