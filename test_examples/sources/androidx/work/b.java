package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import n4.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f6213b = g.f("Data");
    public static final b c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6214a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f6215a = new HashMap();

        public final void a(HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                HashMap hashMap2 = this.f6215a;
                if (value == null) {
                    value = null;
                } else {
                    Class<?> cls = value.getClass();
                    if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                        int i10 = 0;
                        if (cls == boolean[].class) {
                            boolean[] zArr = (boolean[]) value;
                            String str2 = b.f6213b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i10 < zArr.length) {
                                boolArr[i10] = Boolean.valueOf(zArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            byte[] bArr = (byte[]) value;
                            String str3 = b.f6213b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i10 < bArr.length) {
                                bArr2[i10] = Byte.valueOf(bArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, bArr2);
                        } else if (cls == int[].class) {
                            int[] iArr = (int[]) value;
                            String str4 = b.f6213b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i10 < iArr.length) {
                                numArr[i10] = Integer.valueOf(iArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, numArr);
                        } else if (cls == long[].class) {
                            long[] jArr = (long[]) value;
                            String str5 = b.f6213b;
                            Long[] lArr = new Long[jArr.length];
                            while (i10 < jArr.length) {
                                lArr[i10] = Long.valueOf(jArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, lArr);
                        } else if (cls == float[].class) {
                            float[] fArr = (float[]) value;
                            String str6 = b.f6213b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i10 < fArr.length) {
                                fArr2[i10] = Float.valueOf(fArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, fArr2);
                        } else if (cls == double[].class) {
                            double[] dArr = (double[]) value;
                            String str7 = b.f6213b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i10 < dArr.length) {
                                dArr2[i10] = Double.valueOf(dArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                        }
                    }
                }
                hashMap2.put(str, value);
            }
        }
    }

    static {
        b bVar = new b(new HashMap());
        b(bVar);
        c = bVar;
    }

    public b() {
    }

    public b(b bVar) {
        this.f6214a = new HashMap(bVar.f6214a);
    }

    public b(HashMap hashMap) {
        this.f6214a = new HashMap(hashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(8:4|5|6|7|(2:9|10)|12|13|14)|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
        android.util.Log.e(r1, "Error in Data#fromByteArray: ", r8);
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0060: MOVE  (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:38:0x005f */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable e10;
        ObjectInputStream objectInputStream2;
        String str = f6213b;
        if (bArr.length <= 10240) {
            HashMap hashMap = new HashMap();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream3 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                            hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            Log.e(str, "Error in Data#fromByteArray: ", e11);
                        }
                    } catch (IOException e12) {
                        e10 = e12;
                        Log.e(str, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e13) {
                                Log.e(str, "Error in Data#fromByteArray: ", e13);
                            }
                        }
                        byteArrayInputStream.close();
                        return new b(hashMap);
                    } catch (ClassNotFoundException e14) {
                        e10 = e14;
                        Log.e(str, "Error in Data#fromByteArray: ", e10);
                        if (objectInputStream != null) {
                        }
                        byteArrayInputStream.close();
                        return new b(hashMap);
                    }
                } catch (Throwable th) {
                    th = th;
                    objectInputStream3 = objectInputStream2;
                    if (objectInputStream3 != null) {
                        try {
                            objectInputStream3.close();
                        } catch (IOException e15) {
                            Log.e(str, "Error in Data#fromByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e16) {
                        Log.e(str, "Error in Data#fromByteArray: ", e16);
                    }
                    throw th;
                }
            } catch (IOException e17) {
                e = e17;
                Throwable th2 = e;
                objectInputStream = null;
                e10 = th2;
                Log.e(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new b(hashMap);
            } catch (ClassNotFoundException e18) {
                e = e18;
                Throwable th22 = e;
                objectInputStream = null;
                e10 = th22;
                Log.e(str, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new b(hashMap);
            } catch (Throwable th3) {
                th = th3;
                if (objectInputStream3 != null) {
                }
                byteArrayInputStream.close();
                throw th;
            }
            byteArrayInputStream.close();
            return new b(hashMap);
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }

    public static byte[] b(b bVar) {
        ObjectOutputStream objectOutputStream;
        String str = f6213b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = null;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            objectOutputStream.writeInt(bVar.f6214a.size());
            for (Map.Entry entry : bVar.f6214a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e11) {
                Log.e(str, "Error in Data#toByteArray: ", e11);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(str, "Error in Data#toByteArray: ", e12);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e13) {
            e = e13;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    Log.e(str, "Error in Data#toByteArray: ", e14);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e15) {
                Log.e(str, "Error in Data#toByteArray: ", e15);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e16) {
                    Log.e(str, "Error in Data#toByteArray: ", e16);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e17) {
                Log.e(str, "Error in Data#toByteArray: ", e17);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            HashMap hashMap = this.f6214a;
            Set<String> keySet = hashMap.keySet();
            if (keySet.equals(bVar.f6214a.keySet())) {
                for (String str : keySet) {
                    Object obj2 = hashMap.get(str);
                    Object obj3 = bVar.f6214a.get(str);
                    if (obj2 != null && obj3 != null) {
                        if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                            z10 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                            continue;
                        } else {
                            z10 = obj2.equals(obj3);
                            continue;
                        }
                        if (!z10) {
                            return false;
                        }
                    }
                    z10 = false;
                    continue;
                    if (!z10) {
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6214a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.f6214a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
