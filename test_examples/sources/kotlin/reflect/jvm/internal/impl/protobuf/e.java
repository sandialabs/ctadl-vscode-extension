package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.e.a;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class e<FieldDescriptorType extends a<FieldDescriptorType>> {

    /* renamed from: d  reason: collision with root package name */
    public static final e f14568d = new e(0);

    /* renamed from: a  reason: collision with root package name */
    public final i f14569a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14570b;
    public boolean c = false;

    /* loaded from: classes.dex */
    public interface a<T extends a<T>> extends Comparable<T> {
        int c();

        boolean d();

        WireFormat$FieldType e();

        WireFormat$JavaType f();

        boolean g();

        GeneratedMessageLite.a h(h.a aVar, h hVar);
    }

    public e() {
        int i10 = j.n;
        this.f14569a = new i(16);
    }

    public static Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public static int d(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                return 4;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return CodedOutputStream.g(((Long) obj).longValue());
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return CodedOutputStream.g(((Long) obj).longValue());
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return CodedOutputStream.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                return 4;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).booleanValue();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return CodedOutputStream.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported.", e10);
                }
            case ma.i.f16046m /* 9 */:
                return ((h) obj).b();
            case ma.i.f16047o /* 10 */:
                if (obj instanceof g) {
                    g gVar = (g) obj;
                    if (gVar.f11838a) {
                        int b5 = gVar.f11839b.b();
                        return CodedOutputStream.f(b5) + b5;
                    }
                    throw null;
                }
                return CodedOutputStream.e((h) obj);
            case 11:
                if (obj instanceof i9.a) {
                    i9.a aVar = (i9.a) obj;
                    return aVar.size() + CodedOutputStream.f(aVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return CodedOutputStream.f(bArr.length) + bArr.length;
            case 12:
                return CodedOutputStream.f(((Integer) obj).intValue());
            case 13:
                if (obj instanceof f.a) {
                    return CodedOutputStream.c(((f.a) obj).c());
                }
                return CodedOutputStream.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case ma.i.f16049q /* 15 */:
                ((Long) obj).longValue();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.f((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.g((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(a<?> aVar, Object obj) {
        WireFormat$FieldType e10 = aVar.e();
        int c = aVar.c();
        if (aVar.d()) {
            List<Object> list = (List) obj;
            int i10 = 0;
            if (aVar.g()) {
                for (Object obj2 : list) {
                    i10 += d(e10, obj2);
                }
                return CodedOutputStream.f(i10) + CodedOutputStream.h(c) + i10;
            }
            for (Object obj3 : list) {
                int h10 = CodedOutputStream.h(c);
                if (e10 == WireFormat$FieldType.f14540m) {
                    h10 *= 2;
                }
                i10 += d(e10, obj3) + h10;
            }
            return i10;
        }
        int h11 = CodedOutputStream.h(c);
        if (e10 == WireFormat$FieldType.f14540m) {
            h11 *= 2;
        }
        return d(e10, obj) + h11;
    }

    public static boolean g(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        if (aVar.f() == WireFormat$JavaType.f14552r) {
            boolean d5 = aVar.d();
            Object value = entry.getValue();
            if (d5) {
                for (h hVar : (List) value) {
                    if (!hVar.a()) {
                        return false;
                    }
                }
            } else if (!(value instanceof h)) {
                if (value instanceof g) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else if (!((h) value).a()) {
                return false;
            }
        }
        return true;
    }

    public static Object j(c cVar, WireFormat$FieldType wireFormat$FieldType) {
        boolean z10 = true;
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(cVar.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(cVar.i()));
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return Long.valueOf(cVar.l());
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return Long.valueOf(cVar.l());
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return Integer.valueOf(cVar.k());
            case 5:
                return Long.valueOf(cVar.j());
            case 6:
                return Integer.valueOf(cVar.i());
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                if (cVar.l() == 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 8:
                int k3 = cVar.k();
                int i10 = cVar.f14557b;
                int i11 = cVar.f14558d;
                if (k3 <= i10 - i11 && k3 > 0) {
                    String str = new String(cVar.f14556a, i11, k3, "UTF-8");
                    cVar.f14558d += k3;
                    return str;
                } else if (k3 == 0) {
                    return "";
                } else {
                    return new String(cVar.h(k3), "UTF-8");
                }
            case ma.i.f16046m /* 9 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case ma.i.f16047o /* 10 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return cVar.e();
            case 12:
                return Integer.valueOf(cVar.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(cVar.i());
            case ma.i.f16049q /* 15 */:
                return Long.valueOf(cVar.j());
            case 16:
                int k10 = cVar.k();
                return Integer.valueOf((-(k10 & 1)) ^ (k10 >>> 1));
            case 17:
                long l2 = cVar.l();
                return Long.valueOf((-(l2 & 1)) ^ (l2 >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void l(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        obj.getClass();
        boolean z10 = true;
        boolean z11 = false;
        switch (wireFormat$FieldType.f14543i.ordinal()) {
            case 0:
                z11 = obj instanceof Integer;
                break;
            case 1:
                z11 = obj instanceof Long;
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                z11 = obj instanceof Float;
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                z11 = obj instanceof Double;
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                z11 = obj instanceof Boolean;
                break;
            case 5:
                z11 = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof i9.a)) {
                    if (obj instanceof byte[]) {
                    }
                    z10 = false;
                }
                z11 = z10;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!(obj instanceof Integer)) {
                    if (obj instanceof f.a) {
                    }
                    z10 = false;
                }
                z11 = z10;
                break;
            case 8:
                if (!(obj instanceof h)) {
                    if (obj instanceof g) {
                    }
                    z10 = false;
                }
                z11 = z10;
                break;
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static void m(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i10, Object obj) {
        if (wireFormat$FieldType == WireFormat$FieldType.f14540m) {
            codedOutputStream.x(i10, 3);
            ((h) obj).f(codedOutputStream);
            codedOutputStream.x(i10, 4);
            return;
        }
        codedOutputStream.x(i10, wireFormat$FieldType.f14544j);
        n(codedOutputStream, wireFormat$FieldType, obj);
    }

    public static void n(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, Object obj) {
        int intValue;
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.u(Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.t(Float.floatToRawIntBits(floatValue));
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                codedOutputStream.w(((Long) obj).longValue());
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                codedOutputStream.w(((Long) obj).longValue());
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                codedOutputStream.n(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.u(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.t(((Integer) obj).intValue());
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                codedOutputStream.q(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                codedOutputStream.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                codedOutputStream.v(bytes.length);
                codedOutputStream.s(bytes);
                return;
            case ma.i.f16046m /* 9 */:
                codedOutputStream.getClass();
                ((h) obj).f(codedOutputStream);
                return;
            case ma.i.f16047o /* 10 */:
                codedOutputStream.p((h) obj);
                return;
            case 11:
                if (obj instanceof i9.a) {
                    i9.a aVar = (i9.a) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.v(aVar.size());
                    codedOutputStream.r(aVar);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.getClass();
                codedOutputStream.v(bArr.length);
                codedOutputStream.s(bArr);
                return;
            case 12:
                codedOutputStream.v(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof f.a) {
                    intValue = ((f.a) obj).c();
                } else {
                    intValue = ((Integer) obj).intValue();
                }
                codedOutputStream.n(intValue);
                return;
            case 14:
                codedOutputStream.t(((Integer) obj).intValue());
                return;
            case ma.i.f16049q /* 15 */:
                codedOutputStream.u(((Long) obj).longValue());
                return;
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                codedOutputStream.v((intValue2 >> 31) ^ (intValue2 << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.w((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a(GeneratedMessageLite.c cVar, Object obj) {
        List list;
        if (cVar.f14531k) {
            l(cVar.f14530j, obj);
            Object f10 = f(cVar);
            if (f10 == null) {
                list = new ArrayList();
                this.f14569a.e(cVar, list);
            } else {
                list = (List) f10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final e<FieldDescriptorType> clone() {
        i iVar;
        e<FieldDescriptorType> eVar = (e<FieldDescriptorType>) new e();
        int i10 = 0;
        while (true) {
            iVar = this.f14569a;
            if (i10 >= iVar.f14575j.size()) {
                break;
            }
            j<K, V>.b bVar = iVar.f14575j.get(i10);
            eVar.k((a) bVar.getKey(), bVar.getValue());
            i10++;
        }
        for (Map.Entry<Object, Object> entry : iVar.c()) {
            eVar.k((a) entry.getKey(), entry.getValue());
        }
        eVar.c = this.c;
        return eVar;
    }

    public final Object f(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f14569a.get(fielddescriptortype);
        return obj instanceof g ? ((g) obj).a() : obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List, java.lang.Object] */
    public final void h() {
        Map map;
        if (this.f14570b) {
            return;
        }
        i iVar = this.f14569a;
        if (!iVar.f14577l) {
            for (int i10 = 0; i10 < iVar.f14575j.size(); i10++) {
                j<K, V>.b bVar = iVar.f14575j.get(i10);
                if (((a) bVar.getKey()).d()) {
                    bVar.setValue(Collections.unmodifiableList((List) bVar.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : iVar.c()) {
                if (((a) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!iVar.f14577l) {
            if (iVar.f14576k.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(iVar.f14576k);
            }
            iVar.f14576k = map;
            iVar.f14577l = true;
        }
        this.f14570b = true;
    }

    public final void i(Map.Entry<FieldDescriptorType, Object> entry) {
        Object c;
        Object f10;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof g) {
            value = ((g) value).a();
        }
        boolean d5 = key.d();
        i iVar = this.f14569a;
        if (d5) {
            Object f11 = f(key);
            if (f11 == null) {
                f11 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) f11).add(c(obj));
            }
            iVar.e(key, f11);
            return;
        }
        if (key.f() == WireFormat$JavaType.f14552r && (f10 = f(key)) != null) {
            c = key.h(((h) f10).c(), (h) value).build();
            iVar.e(key, c);
        }
        c = c(value);
        iVar.e(key, c);
    }

    public final void k(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.d()) {
            l(fielddescriptortype.e(), obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l(fielddescriptortype.e(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof g) {
            this.c = true;
        }
        this.f14569a.e(fielddescriptortype, obj);
    }

    public e(int i10) {
        int i11 = j.n;
        this.f14569a = new i(0);
        h();
    }
}
