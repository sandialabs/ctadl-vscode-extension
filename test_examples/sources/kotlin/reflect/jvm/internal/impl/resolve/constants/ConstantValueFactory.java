package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import m9.b;
import m9.d;
import m9.e;
import m9.g;
import m9.h;
import m9.k;
import m9.o;
import m9.p;
import m9.q;
import y9.r;

/* loaded from: classes.dex */
public final class ConstantValueFactory {
    public static b a(List list, PrimitiveType primitiveType) {
        List<Object> L2 = c.L2(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : L2) {
            g c = c(obj);
            if (c != null) {
                arrayList.add(c);
            }
        }
        return new b(arrayList, new ConstantValueFactory$createArrayValue$3(primitiveType));
    }

    public static b b(List list, r rVar) {
        v7.g.f(list, "value");
        return new b(list, new ConstantValueFactory$createArrayValue$1(rVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v53, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v22, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v29, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v39, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [kotlin.collections.EmptyList] */
    public static g c(Object obj) {
        ?? r52;
        ArrayList arrayList;
        PrimitiveType primitiveType;
        ?? r53;
        ArrayList arrayList2;
        ?? r54;
        ArrayList arrayList3;
        ?? r55;
        ArrayList arrayList4;
        ?? r56;
        ArrayList arrayList5;
        ?? r02;
        ?? r57;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ?? r03;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new q(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new o(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m9.c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new h(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new m9.c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new m9.r((String) obj);
        }
        int i10 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            v7.g.f(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    r03 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i10 < length2) {
                        r03.add(Byte.valueOf(bArr[i10]));
                        i10++;
                    }
                } else {
                    r03 = a1.c.N0(Byte.valueOf(bArr[0]));
                }
            } else {
                r03 = EmptyList.f12981i;
            }
            primitiveType = PrimitiveType.f13298p;
            arrayList7 = r03;
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            v7.g.f(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    arrayList6 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i10 < length4) {
                        arrayList6.add(Short.valueOf(sArr[i10]));
                        i10++;
                    }
                    primitiveType = PrimitiveType.f13299q;
                    arrayList7 = arrayList6;
                } else {
                    r57 = a1.c.N0(Short.valueOf(sArr[0]));
                }
            } else {
                r57 = EmptyList.f12981i;
            }
            arrayList6 = r57;
            primitiveType = PrimitiveType.f13299q;
            arrayList7 = arrayList6;
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            v7.g.f(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    r02 = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i10 < length6) {
                        r02.add(Integer.valueOf(iArr[i10]));
                        i10++;
                    }
                } else {
                    r02 = a1.c.N0(Integer.valueOf(iArr[0]));
                }
            } else {
                r02 = EmptyList.f12981i;
            }
            primitiveType = PrimitiveType.f13300r;
            arrayList7 = r02;
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            v7.g.f(jArr, "<this>");
            int length7 = jArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    arrayList5 = new ArrayList(jArr.length);
                    int length8 = jArr.length;
                    while (i10 < length8) {
                        arrayList5.add(Long.valueOf(jArr[i10]));
                        i10++;
                    }
                    primitiveType = PrimitiveType.f13302t;
                    arrayList7 = arrayList5;
                } else {
                    r56 = a1.c.N0(Long.valueOf(jArr[0]));
                }
            } else {
                r56 = EmptyList.f12981i;
            }
            arrayList5 = r56;
            primitiveType = PrimitiveType.f13302t;
            arrayList7 = arrayList5;
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            v7.g.f(cArr, "<this>");
            int length9 = cArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    arrayList4 = new ArrayList(cArr.length);
                    int length10 = cArr.length;
                    while (i10 < length10) {
                        arrayList4.add(Character.valueOf(cArr[i10]));
                        i10++;
                    }
                    primitiveType = PrimitiveType.f13297o;
                    arrayList7 = arrayList4;
                } else {
                    r55 = a1.c.N0(Character.valueOf(cArr[0]));
                }
            } else {
                r55 = EmptyList.f12981i;
            }
            arrayList4 = r55;
            primitiveType = PrimitiveType.f13297o;
            arrayList7 = arrayList4;
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            v7.g.f(fArr, "<this>");
            int length11 = fArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    arrayList3 = new ArrayList(fArr.length);
                    int length12 = fArr.length;
                    while (i10 < length12) {
                        arrayList3.add(Float.valueOf(fArr[i10]));
                        i10++;
                    }
                    primitiveType = PrimitiveType.f13301s;
                    arrayList7 = arrayList3;
                } else {
                    r54 = a1.c.N0(Float.valueOf(fArr[0]));
                }
            } else {
                r54 = EmptyList.f12981i;
            }
            arrayList3 = r54;
            primitiveType = PrimitiveType.f13301s;
            arrayList7 = arrayList3;
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            v7.g.f(dArr, "<this>");
            int length13 = dArr.length;
            if (length13 != 0) {
                if (length13 != 1) {
                    arrayList2 = new ArrayList(dArr.length);
                    int length14 = dArr.length;
                    while (i10 < length14) {
                        arrayList2.add(Double.valueOf(dArr[i10]));
                        i10++;
                    }
                    primitiveType = PrimitiveType.f13303u;
                    arrayList7 = arrayList2;
                } else {
                    r53 = a1.c.N0(Double.valueOf(dArr[0]));
                }
            } else {
                r53 = EmptyList.f12981i;
            }
            arrayList2 = r53;
            primitiveType = PrimitiveType.f13303u;
            arrayList7 = arrayList2;
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            v7.g.f(zArr, "<this>");
            int length15 = zArr.length;
            if (length15 != 0) {
                if (length15 != 1) {
                    arrayList = new ArrayList(zArr.length);
                    int length16 = zArr.length;
                    while (i10 < length16) {
                        arrayList.add(Boolean.valueOf(zArr[i10]));
                        i10++;
                    }
                    primitiveType = PrimitiveType.n;
                    arrayList7 = arrayList;
                } else {
                    r52 = a1.c.N0(Boolean.valueOf(zArr[0]));
                }
            } else {
                r52 = EmptyList.f12981i;
            }
            arrayList = r52;
            primitiveType = PrimitiveType.n;
            arrayList7 = arrayList;
        } else if (obj == null) {
            return new p();
        } else {
            return null;
        }
        return a(arrayList7, primitiveType);
    }
}
