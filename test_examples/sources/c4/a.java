package c4;

import android.annotation.SuppressLint;
import v7.g;
import y3.j;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: i  reason: collision with root package name */
    public final String f6527i;

    /* renamed from: c4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0054a {
        @SuppressLint({"SyntheticAccessor"})
        public static void a(j jVar, Object[] objArr) {
            double floatValue;
            long longValue;
            int intValue;
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                if (obj == null) {
                    jVar.o(i10);
                } else if (obj instanceof byte[]) {
                    jVar.E(i10, (byte[]) obj);
                } else {
                    if (obj instanceof Float) {
                        floatValue = ((Number) obj).floatValue();
                    } else if (obj instanceof Double) {
                        floatValue = ((Number) obj).doubleValue();
                    } else {
                        if (obj instanceof Long) {
                            longValue = ((Number) obj).longValue();
                        } else {
                            if (obj instanceof Integer) {
                                intValue = ((Number) obj).intValue();
                            } else if (obj instanceof Short) {
                                intValue = ((Number) obj).shortValue();
                            } else if (obj instanceof Byte) {
                                intValue = ((Number) obj).byteValue();
                            } else if (obj instanceof String) {
                                jVar.F((String) obj, i10);
                            } else if (obj instanceof Boolean) {
                                if (((Boolean) obj).booleanValue()) {
                                    longValue = 1;
                                } else {
                                    longValue = 0;
                                }
                            } else {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            longValue = intValue;
                        }
                        jVar.r(longValue, i10);
                    }
                    jVar.a(floatValue, i10);
                }
            }
        }
    }

    public a(String str) {
        g.f(str, "query");
        this.f6527i = str;
    }

    @Override // c4.e
    public final String a() {
        return this.f6527i;
    }

    @Override // c4.e
    public final void b(j jVar) {
    }
}
