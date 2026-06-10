package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.q.a;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class q<T extends a<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final q f4929d = new q(0);

    /* renamed from: a  reason: collision with root package name */
    public final z0<T, Object> f4930a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4931b;
    public boolean c;

    /* loaded from: classes.dex */
    public interface a<T extends a<T>> extends Comparable<T> {
        void c();

        void d();

        void e();

        WireFormat$JavaType f();

        void g();

        GeneratedMessageLite.a t(i0.a aVar, i0 i0Var);
    }

    public q() {
        int i10 = z0.f4957o;
        this.f4930a = new y0(16);
    }

    public static Object b(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static int c(WireFormat$FieldType wireFormat$FieldType, int i10, Object obj) {
        int d12 = CodedOutputStream.d1(i10);
        if (wireFormat$FieldType == WireFormat$FieldType.f4826l) {
            d12 *= 2;
        }
        return d(wireFormat$FieldType, obj) + d12;
    }

    public static int d(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f4780j;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f4780j;
                return 4;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return CodedOutputStream.h1(((Long) obj).longValue());
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return CodedOutputStream.h1(((Long) obj).longValue());
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return CodedOutputStream.U0(((Integer) obj).intValue());
            case 5:
            case ma.i.f16049q /* 15 */:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f4780j;
                return 8;
            case 6:
            case 14:
                ((Integer) obj).intValue();
                Logger logger22 = CodedOutputStream.f4780j;
                return 4;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).booleanValue();
                Logger logger4 = CodedOutputStream.f4780j;
                return 1;
            case 8:
                if (obj instanceof ByteString) {
                    Logger logger5 = CodedOutputStream.f4780j;
                    int size = ((ByteString) obj).size();
                    return CodedOutputStream.f1(size) + size;
                }
                return CodedOutputStream.c1((String) obj);
            case ma.i.f16046m /* 9 */:
                Logger logger6 = CodedOutputStream.f4780j;
                return ((i0) obj).b();
            case ma.i.f16047o /* 10 */:
                if (obj instanceof v) {
                    return CodedOutputStream.W0((v) obj);
                }
                Logger logger7 = CodedOutputStream.f4780j;
                int b5 = ((i0) obj).b();
                return CodedOutputStream.f1(b5) + b5;
            case 11:
                if (obj instanceof ByteString) {
                    Logger logger8 = CodedOutputStream.f4780j;
                    int size2 = ((ByteString) obj).size();
                    return CodedOutputStream.f1(size2) + size2;
                }
                Logger logger9 = CodedOutputStream.f4780j;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.f1(length) + length;
            case 12:
                return CodedOutputStream.f1(((Integer) obj).intValue());
            case 13:
                if (obj instanceof u.a) {
                    return CodedOutputStream.U0(((u.a) obj).c());
                }
                return CodedOutputStream.U0(((Integer) obj).intValue());
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.f1((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.h1((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(a<?> aVar, Object obj) {
        aVar.e();
        aVar.c();
        aVar.d();
        return c(null, 0, obj);
    }

    public static int g(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.f() == WireFormat$JavaType.f4837r) {
            aVar.d();
            aVar.g();
            boolean z10 = value instanceof v;
            ((a) entry.getKey()).c();
            if (z10) {
                return CodedOutputStream.W0((v) value) + CodedOutputStream.d1(3) + CodedOutputStream.e1(2, 0) + (CodedOutputStream.d1(1) * 2);
            }
            int e12 = CodedOutputStream.e1(2, 0) + (CodedOutputStream.d1(1) * 2);
            int d12 = CodedOutputStream.d1(3);
            int b5 = ((i0) value).b();
            return CodedOutputStream.f1(b5) + b5 + d12 + e12;
        }
        return e(aVar, value);
    }

    public static <T extends a<T>> boolean k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.f() == WireFormat$JavaType.f4837r) {
            key.d();
            Object value = entry.getValue();
            if (!(value instanceof i0)) {
                if (value instanceof v) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else if (!((i0) value).a()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if ((r2 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        boolean z10;
        Charset charset = u.f4942a;
        obj.getClass();
        switch (wireFormat$FieldType.f4828i.ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                break;
            case 1:
                z10 = obj instanceof Long;
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                z10 = obj instanceof Float;
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                z10 = obj instanceof Double;
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                z10 = obj instanceof Boolean;
                break;
            case 5:
                z10 = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof ByteString)) {
                    break;
                }
                z10 = true;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!(obj instanceof Integer)) {
                    if (obj instanceof u.a) {
                    }
                    z10 = false;
                    break;
                }
                z10 = true;
                break;
            case 8:
                if (!(obj instanceof i0)) {
                    if (obj instanceof v) {
                    }
                    z10 = false;
                    break;
                }
                z10 = true;
                break;
            default:
                z10 = false;
                break;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static void p(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i10, Object obj) {
        int intValue;
        if (wireFormat$FieldType == WireFormat$FieldType.f4826l) {
            codedOutputStream.A1(i10, 3);
            ((i0) obj).e(codedOutputStream);
            codedOutputStream.A1(i10, 4);
            return;
        }
        codedOutputStream.A1(i10, wireFormat$FieldType.f4829j);
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                codedOutputStream.r1(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                codedOutputStream.p1(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                codedOutputStream.E1(((Long) obj).longValue());
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                codedOutputStream.E1(((Long) obj).longValue());
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                codedOutputStream.t1(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.r1(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.p1(((Integer) obj).intValue());
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                codedOutputStream.j1(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.z1((String) obj);
                    return;
                }
                break;
            case ma.i.f16046m /* 9 */:
                ((i0) obj).e(codedOutputStream);
                return;
            case ma.i.f16047o /* 10 */:
                codedOutputStream.v1((i0) obj);
                return;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.l1(bArr, bArr.length);
                    return;
                }
                break;
            case 12:
                codedOutputStream.C1(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof u.a) {
                    intValue = ((u.a) obj).c();
                } else {
                    intValue = ((Integer) obj).intValue();
                }
                codedOutputStream.t1(intValue);
                return;
            case 14:
                codedOutputStream.p1(((Integer) obj).intValue());
                return;
            case ma.i.f16049q /* 15 */:
                codedOutputStream.r1(((Long) obj).longValue());
                return;
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                codedOutputStream.C1((intValue2 >> 31) ^ (intValue2 << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.E1((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
        codedOutputStream.n1((ByteString) obj);
    }

    /* renamed from: a */
    public final q<T> clone() {
        z0<T, Object> z0Var;
        q<T> qVar = new q<>();
        int i10 = 0;
        while (true) {
            z0Var = this.f4930a;
            if (i10 >= z0Var.d()) {
                break;
            }
            Map.Entry<T, Object> c = z0Var.c(i10);
            qVar.n(c.getKey(), c.getValue());
            i10++;
        }
        for (Map.Entry<T, Object> entry : z0Var.e()) {
            qVar.n(entry.getKey(), entry.getValue());
        }
        qVar.c = this.c;
        return qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f4930a.equals(((q) obj).f4930a);
        }
        return false;
    }

    public final Object f(T t10) {
        Object obj = this.f4930a.get(t10);
        if (obj instanceof v) {
            return ((v) obj).a(null);
        }
        return obj;
    }

    public final int h() {
        z0<T, Object> z0Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            z0Var = this.f4930a;
            if (i10 >= z0Var.d()) {
                break;
            }
            Map.Entry<T, Object> c = z0Var.c(i10);
            i11 += e(c.getKey(), c.getValue());
            i10++;
        }
        for (Map.Entry<T, Object> entry : z0Var.e()) {
            i11 += e(entry.getKey(), entry.getValue());
        }
        return i11;
    }

    public final int hashCode() {
        return this.f4930a.hashCode();
    }

    public final boolean i() {
        return this.f4930a.isEmpty();
    }

    public final boolean j() {
        int i10 = 0;
        while (true) {
            z0<T, Object> z0Var = this.f4930a;
            if (i10 >= z0Var.d()) {
                for (Map.Entry<T, Object> entry : z0Var.e()) {
                    if (!k(entry)) {
                        return false;
                    }
                }
                return true;
            } else if (!k(z0Var.c(i10))) {
                return false;
            } else {
                i10++;
            }
        }
    }

    public final Iterator<Map.Entry<T, Object>> l() {
        boolean z10 = this.c;
        z0<T, Object> z0Var = this.f4930a;
        return z10 ? new v.b(z0Var.entrySet().iterator()) : z0Var.entrySet().iterator();
    }

    public final void m(Map.Entry<T, Object> entry) {
        Object b5;
        Object f10;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof v) {
            value = ((v) value).a(null);
        }
        key.d();
        if (key.f() == WireFormat$JavaType.f4837r && (f10 = f(key)) != null) {
            b5 = key.t(((i0) f10).c(), (i0) value).i();
            this.f4930a.put(key, b5);
        }
        b5 = b(value);
        this.f4930a.put(key, b5);
    }

    public final void n(T t10, Object obj) {
        t10.d();
        t10.e();
        o(null, obj);
        if (obj instanceof v) {
            this.c = true;
        }
        this.f4930a.put(t10, obj);
    }

    public q(int i10) {
        int i11 = z0.f4957o;
        y0 y0Var = new y0(0);
        this.f4930a = y0Var;
        if (!this.f4931b) {
            y0Var.g();
            this.f4931b = true;
        }
        if (this.f4931b) {
            return;
        }
        y0Var.g();
        this.f4931b = true;
    }
}
