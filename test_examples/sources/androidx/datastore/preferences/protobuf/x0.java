package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f4952a;

    /* renamed from: b  reason: collision with root package name */
    public static final b1<?, ?> f4953b;
    public static final b1<?, ?> c;

    /* renamed from: d  reason: collision with root package name */
    public static final d1 f4954d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f4952a = cls;
        f4953b = z(false);
        c = z(true);
        f4954d = new d1();
    }

    public static <T, FT extends q.a<FT>> void A(n<FT> nVar, T t10, T t11) {
        z0<FT, Object> z0Var;
        q<FT> c10 = nVar.c(t11);
        if (!c10.i()) {
            q<FT> d5 = nVar.d(t10);
            d5.getClass();
            int i10 = 0;
            while (true) {
                z0Var = c10.f4930a;
                if (i10 >= z0Var.d()) {
                    break;
                }
                d5.m(z0Var.c(i10));
                i10++;
            }
            for (Map.Entry<FT, Object> entry : z0Var.e()) {
                d5.m(entry);
            }
        }
    }

    public static boolean B(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static <UT, UB> UB C(int i10, int i11, UB ub, b1<UT, UB> b1Var) {
        if (ub == null) {
            ub = (UB) b1Var.m();
        }
        b1Var.e(i10, i11, ub);
        return ub;
    }

    public static void D(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    Logger logger = CodedOutputStream.f4780j;
                    i12++;
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.j1(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.k1(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void E(int i10, List list, i iVar) {
        if (list != null && !list.isEmpty()) {
            iVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                iVar.f4897a.m1(i10, (ByteString) list.get(i11));
            }
        }
    }

    public static void F(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    Logger logger = CodedOutputStream.f4780j;
                    i12 += 8;
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.r1(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                double doubleValue = ((Double) list.get(i11)).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.q1(Double.doubleToRawLongBits(doubleValue), i10);
                i11++;
            }
        }
    }

    public static void G(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.U0(((Integer) list.get(i13)).intValue());
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.t1(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.s1(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void H(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = CodedOutputStream.f4780j;
                    i12 += 4;
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.p1(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.o1(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void I(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = CodedOutputStream.f4780j;
                    i12 += 8;
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.r1(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.q1(((Long) list.get(i11)).longValue(), i10);
                i11++;
            }
        }
    }

    public static void J(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    Logger logger = CodedOutputStream.f4780j;
                    i12 += 4;
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.p1(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                float floatValue = ((Float) list.get(i11)).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.o1(i10, Float.floatToRawIntBits(floatValue));
                i11++;
            }
        }
    }

    public static void K(int i10, List list, i iVar, w0 w0Var) {
        if (list != null && !list.isEmpty()) {
            iVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                iVar.h(i10, w0Var, list.get(i11));
            }
        }
    }

    public static void L(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.U0(((Integer) list.get(i13)).intValue());
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.t1(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.s1(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void M(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.h1(((Long) list.get(i13)).longValue());
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.E1(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.D1(((Long) list.get(i11)).longValue(), i10);
                i11++;
            }
        }
    }

    public static void N(int i10, List list, i iVar, w0 w0Var) {
        if (list != null && !list.isEmpty()) {
            iVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                iVar.k(i10, w0Var, list.get(i11));
            }
        }
    }

    public static void O(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = CodedOutputStream.f4780j;
                    i12 += 4;
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.p1(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.o1(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void P(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = CodedOutputStream.f4780j;
                    i12 += 8;
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.r1(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.q1(((Long) list.get(i11)).longValue(), i10);
                i11++;
            }
        }
    }

    public static void Q(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += CodedOutputStream.f1((intValue >> 31) ^ (intValue << 1));
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    codedOutputStream.C1((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                codedOutputStream.B1(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void R(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += CodedOutputStream.h1((longValue >> 63) ^ (longValue << 1));
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    codedOutputStream.E1((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                codedOutputStream.D1((longValue3 >> 63) ^ (longValue3 << 1), i10);
                i11++;
            }
        }
    }

    public static void S(int i10, List list, i iVar) {
        if (list != null && !list.isEmpty()) {
            iVar.getClass();
            boolean z10 = list instanceof y;
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                y yVar = (y) list;
                while (i11 < list.size()) {
                    Object q10 = yVar.q(i11);
                    if (q10 instanceof String) {
                        codedOutputStream.y1((String) q10, i10);
                    } else {
                        codedOutputStream.m1(i10, (ByteString) q10);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.y1((String) list.get(i11), i10);
                i11++;
            }
        }
    }

    public static void T(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.f1(((Integer) list.get(i13)).intValue());
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.C1(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.B1(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void U(int i10, List list, i iVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = iVar.f4897a;
            int i11 = 0;
            if (z10) {
                codedOutputStream.A1(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.h1(((Long) list.get(i13)).longValue());
                }
                codedOutputStream.C1(i12);
                while (i11 < list.size()) {
                    codedOutputStream.E1(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                codedOutputStream.D1(((Long) list.get(i11)).longValue(), i10);
                i11++;
            }
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.L0(i10) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i10, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int d12 = CodedOutputStream.d1(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = list.get(i11).size();
            d12 += CodedOutputStream.f1(size2) + size2;
        }
        return d12;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.d1(i10) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i10 = 0;
            while (i11 < size) {
                tVar.g(i11);
                i10 += CodedOutputStream.U0(tVar.f4937j[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.U0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.P0(i10) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.Q0(i10) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<i0> list, w0 w0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.S0(i10, list.get(i12), w0Var);
        }
        return i11;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.d1(i10) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i10 = 0;
            while (i11 < size) {
                tVar.g(i11);
                i10 += CodedOutputStream.U0(tVar.f4937j[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.U0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.d1(i10) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i10 = 0;
            while (i11 < size) {
                a0Var.g(i11);
                i10 += CodedOutputStream.h1(a0Var.f4840j[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.h1(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int o(int i10, w0 w0Var, Object obj) {
        if (obj instanceof w) {
            return CodedOutputStream.W0((w) obj) + CodedOutputStream.d1(i10);
        }
        int d12 = CodedOutputStream.d1(i10);
        int i11 = ((a) ((i0) obj)).i(w0Var);
        return CodedOutputStream.f1(i11) + i11 + d12;
    }

    public static int p(int i10, List<?> list, w0 w0Var) {
        int f12;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int d12 = CodedOutputStream.d1(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof w) {
                f12 = CodedOutputStream.W0((w) obj);
            } else {
                int i12 = ((a) ((i0) obj)).i(w0Var);
                f12 = i12 + CodedOutputStream.f1(i12);
            }
            d12 += f12;
        }
        return d12;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.d1(i10) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i10 = 0;
            while (i11 < size) {
                tVar.g(i11);
                int i12 = tVar.f4937j[i11];
                i10 += CodedOutputStream.f1((i12 >> 31) ^ (i12 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i10 += CodedOutputStream.f1((intValue >> 31) ^ (intValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.d1(i10) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i10 = 0;
            while (i11 < size) {
                a0Var.g(i11);
                long j2 = a0Var.f4840j[i11];
                i10 += CodedOutputStream.h1((j2 >> 63) ^ (j2 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i10 += CodedOutputStream.h1((longValue >> 63) ^ (longValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int u(int i10, List<?> list) {
        int c12;
        int c13;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int d12 = CodedOutputStream.d1(i10) * size;
        if (list instanceof y) {
            y yVar = (y) list;
            while (i11 < size) {
                Object q10 = yVar.q(i11);
                if (q10 instanceof ByteString) {
                    int size2 = ((ByteString) q10).size();
                    c13 = CodedOutputStream.f1(size2) + size2;
                } else {
                    c13 = CodedOutputStream.c1((String) q10);
                }
                d12 += c13;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof ByteString) {
                    int size3 = ((ByteString) obj).size();
                    c12 = CodedOutputStream.f1(size3) + size3;
                } else {
                    c12 = CodedOutputStream.c1((String) obj);
                }
                d12 += c12;
                i11++;
            }
        }
        return d12;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.d1(i10) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i10 = 0;
            while (i11 < size) {
                tVar.g(i11);
                i10 += CodedOutputStream.f1(tVar.f4937j[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.f1(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.d1(i10) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i10 = 0;
            while (i11 < size) {
                a0Var.g(i11);
                i10 += CodedOutputStream.h1(a0Var.f4840j[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.h1(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static b1<?, ?> z(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (b1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
