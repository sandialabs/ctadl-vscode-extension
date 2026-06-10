package androidx.profileinstaller;

import androidx.activity.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import ma.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5573a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5574b = {112, 114, 109, 0};

    public static byte[] a(w3.a[] aVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (w3.a aVar : aVarArr) {
            i11 += (((((aVar.f18303g * 2) + 8) - 1) & (-8)) / 8) + (aVar.f18301e * 2) + b(aVar.f18298a, aVar.f18299b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f18302f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, w3.c.c)) {
            int length = aVarArr.length;
            while (i10 < length) {
                w3.a aVar2 = aVarArr[i10];
                l(byteArrayOutputStream, aVar2, b(aVar2.f18298a, aVar2.f18299b, bArr));
                n(byteArrayOutputStream, aVar2);
                k(byteArrayOutputStream, aVar2);
                m(byteArrayOutputStream, aVar2);
                i10++;
            }
        } else {
            for (w3.a aVar3 : aVarArr) {
                l(byteArrayOutputStream, aVar3, b(aVar3.f18298a, aVar3.f18299b, bArr));
            }
            int length2 = aVarArr.length;
            while (i10 < length2) {
                w3.a aVar4 = aVarArr[i10];
                n(byteArrayOutputStream, aVar4);
                k(byteArrayOutputStream, aVar4);
                m(byteArrayOutputStream, aVar4);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
        if (java.util.Arrays.equals(r8, r2) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = w3.c.f18310e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = w3.c.f18309d;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
            if (str.length() > 0) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    str2 = str2.replace("!", ":");
                }
                return str2;
            } else if (str2.equals("classes.dex")) {
                return str;
            } else {
                if (!str2.contains("!") && !str2.contains(":")) {
                    if (str2.endsWith(".apk")) {
                        return str2;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    if (!Arrays.equals(bArr, bArr2)) {
                    }
                    str3 = ":";
                    return e.k(sb, str3, str2);
                }
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    str2 = str2.replace("!", ":");
                }
                return str2;
            }
        }
        obj = ":";
        if (str.length() > 0) {
        }
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return i11 + i12;
                }
                throw new IllegalStateException(e.g("Unexpected flag: ", i10));
            }
            return i11;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static int[] d(int i10, ByteArrayInputStream byteArrayInputStream) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += i.I(byteArrayInputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static w3.a[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, w3.a[] aVarArr) {
        byte[] bArr3 = w3.c.f18311f;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(w3.c.f18307a, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int H = (int) i.H(1, fileInputStream);
                    byte[] G = i.G(fileInputStream, (int) i.H(4, fileInputStream), (int) i.H(4, fileInputStream));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(G);
                        try {
                            w3.a[] f10 = f(byteArrayInputStream, H, aVarArr);
                            byteArrayInputStream.close();
                            return f10;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, w3.c.f18312g)) {
            int I = i.I(fileInputStream);
            byte[] G2 = i.G(fileInputStream, (int) i.H(4, fileInputStream), (int) i.H(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(G2);
                try {
                    w3.a[] g10 = g(byteArrayInputStream2, bArr2, I, aVarArr);
                    byteArrayInputStream2.close();
                    return g10;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static w3.a[] f(ByteArrayInputStream byteArrayInputStream, int i10, w3.a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new w3.a[0];
        }
        if (i10 == aVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int I = i.I(byteArrayInputStream);
                iArr[i11] = i.I(byteArrayInputStream);
                strArr[i11] = new String(i.F(I, byteArrayInputStream), StandardCharsets.UTF_8);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                w3.a aVar = aVarArr[i12];
                if (aVar.f18299b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    aVar.f18301e = i13;
                    aVar.f18304h = d(i13, byteArrayInputStream);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return aVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static w3.a[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, w3.a[] aVarArr) {
        String str;
        w3.a aVar;
        if (byteArrayInputStream.available() == 0) {
            return new w3.a[0];
        }
        if (i10 == aVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                i.I(byteArrayInputStream);
                String str2 = new String(i.F(i.I(byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
                long H = i.H(4, byteArrayInputStream);
                int I = i.I(byteArrayInputStream);
                if (aVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i12 = 0; i12 < aVarArr.length; i12++) {
                        if (aVarArr[i12].f18299b.equals(str)) {
                            aVar = aVarArr[i12];
                            break;
                        }
                    }
                }
                aVar = null;
                if (aVar != null) {
                    aVar.f18300d = H;
                    int[] d5 = d(I, byteArrayInputStream);
                    if (Arrays.equals(bArr, w3.c.f18310e)) {
                        aVar.f18301e = I;
                        aVar.f18304h = d5;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return aVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static w3.a[] h(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, w3.c.f18308b)) {
            int H = (int) i.H(1, fileInputStream);
            byte[] G = i.G(fileInputStream, (int) i.H(4, fileInputStream), (int) i.H(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(G);
                try {
                    w3.a[] i10 = i(byteArrayInputStream, str, H);
                    byteArrayInputStream.close();
                    return i10;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static w3.a[] i(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new w3.a[0];
        }
        w3.a[] aVarArr = new w3.a[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int I = i.I(byteArrayInputStream);
            int I2 = i.I(byteArrayInputStream);
            aVarArr[i11] = new w3.a(str, new String(i.F(I, byteArrayInputStream), StandardCharsets.UTF_8), i.H(4, byteArrayInputStream), I2, (int) i.H(4, byteArrayInputStream), (int) i.H(4, byteArrayInputStream), new int[I2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            w3.a aVar = aVarArr[i12];
            int available = byteArrayInputStream.available() - aVar.f18302f;
            int i13 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = aVar.f18305i;
                if (available2 <= available) {
                    break;
                }
                i13 += i.I(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i13), 1);
                for (int I3 = i.I(byteArrayInputStream); I3 > 0; I3--) {
                    i.I(byteArrayInputStream);
                    int H = (int) i.H(1, byteArrayInputStream);
                    if (H != 6 && H != 7) {
                        while (H > 0) {
                            i.H(1, byteArrayInputStream);
                            for (int H2 = (int) i.H(1, byteArrayInputStream); H2 > 0; H2--) {
                                i.I(byteArrayInputStream);
                            }
                            H--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                aVar.f18304h = d(aVar.f18301e, byteArrayInputStream);
                int i14 = aVar.f18303g;
                BitSet valueOf = BitSet.valueOf(i.F(((((i14 * 2) + 8) - 1) & (-8)) / 8, byteArrayInputStream));
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = 2;
                    if (!valueOf.get(c(2, i15, i14))) {
                        i16 = 0;
                    }
                    if (valueOf.get(c(4, i15, i14))) {
                        i16 |= 4;
                    }
                    if (i16 != 0) {
                        Integer num = treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i16 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return aVarArr;
    }

    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, w3.a[] aVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = w3.c.f18307a;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                i.Y(byteArrayOutputStream2, aVarArr.length);
                int i10 = 2;
                int i11 = 2;
                for (w3.a aVar : aVarArr) {
                    i.X(byteArrayOutputStream2, aVar.c, 4);
                    i.X(byteArrayOutputStream2, aVar.f18300d, 4);
                    i.X(byteArrayOutputStream2, aVar.f18303g, 4);
                    String b5 = b(aVar.f18298a, aVar.f18299b, bArr2);
                    int length2 = b5.getBytes(StandardCharsets.UTF_8).length;
                    i.Y(byteArrayOutputStream2, length2);
                    i11 = i11 + 4 + 4 + 4 + 2 + (length2 * 1);
                    byteArrayOutputStream2.write(b5.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i11 == byteArray.length) {
                    d dVar = new d(FileSectionType.f5559j, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(dVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i12 = 0;
                    for (int i13 = 0; i13 < aVarArr.length; i13++) {
                        try {
                            w3.a aVar2 = aVarArr[i13];
                            i.Y(byteArrayOutputStream3, i13);
                            i.Y(byteArrayOutputStream3, aVar2.f18301e);
                            i12 = i12 + 2 + 2 + (aVar2.f18301e * 2);
                            k(byteArrayOutputStream3, aVar2);
                        } finally {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i12 == byteArray2.length) {
                        d dVar2 = new d(FileSectionType.f5560k, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(dVar2);
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < aVarArr.length) {
                            try {
                                w3.a aVar3 = aVarArr[i14];
                                int i16 = 0;
                                for (Map.Entry<Integer, Integer> entry : aVar3.f18305i.entrySet()) {
                                    i16 |= entry.getValue().intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                m(byteArrayOutputStream4, aVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                n(byteArrayOutputStream5, aVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                i.Y(byteArrayOutputStream2, i14);
                                int length3 = byteArray3.length + i10 + byteArray4.length;
                                int i17 = i15 + 2 + 4;
                                ArrayList arrayList4 = arrayList3;
                                i.X(byteArrayOutputStream2, length3, 4);
                                i.Y(byteArrayOutputStream2, i16);
                                byteArrayOutputStream2.write(byteArray3);
                                byteArrayOutputStream2.write(byteArray4);
                                i15 = i17 + length3;
                                i14++;
                                arrayList3 = arrayList4;
                                i10 = 2;
                            } finally {
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
                        if (i15 == byteArray5.length) {
                            d dVar3 = new d(FileSectionType.f5561l, byteArray5, true);
                            byteArrayOutputStream2.close();
                            arrayList2.add(dVar3);
                            long j2 = 4;
                            long size = j2 + j2 + 4 + (arrayList2.size() * 16);
                            i.X(byteArrayOutputStream, arrayList2.size(), 4);
                            int i18 = 0;
                            while (i18 < arrayList2.size()) {
                                d dVar4 = (d) arrayList2.get(i18);
                                i.X(byteArrayOutputStream, dVar4.f5575a.f5563i, 4);
                                i.X(byteArrayOutputStream, size, 4);
                                boolean z10 = dVar4.c;
                                byte[] bArr3 = dVar4.f5576b;
                                if (z10) {
                                    byte[] r3 = i.r(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(r3);
                                    i.X(byteArrayOutputStream, r3.length, 4);
                                    i.X(byteArrayOutputStream, bArr3.length, 4);
                                    length = r3.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    i.X(byteArrayOutputStream, bArr3.length, 4);
                                    i.X(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i18++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i19));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            } finally {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        byte[] bArr4 = w3.c.f18308b;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] a10 = a(aVarArr, bArr4);
            i.X(byteArrayOutputStream, aVarArr.length, 1);
            i.X(byteArrayOutputStream, a10.length, 4);
            byte[] r10 = i.r(a10);
            i.X(byteArrayOutputStream, r10.length, 4);
            byteArrayOutputStream.write(r10);
            return true;
        }
        byte[] bArr5 = w3.c.f18309d;
        if (Arrays.equals(bArr, bArr5)) {
            i.X(byteArrayOutputStream, aVarArr.length, 1);
            for (w3.a aVar4 : aVarArr) {
                String b10 = b(aVar4.f18298a, aVar4.f18299b, bArr5);
                i.Y(byteArrayOutputStream, b10.getBytes(StandardCharsets.UTF_8).length);
                i.Y(byteArrayOutputStream, aVar4.f18304h.length);
                i.X(byteArrayOutputStream, aVar4.f18305i.size() * 4, 4);
                i.X(byteArrayOutputStream, aVar4.c, 4);
                byteArrayOutputStream.write(b10.getBytes(StandardCharsets.UTF_8));
                for (Integer num : aVar4.f18305i.keySet()) {
                    i.Y(byteArrayOutputStream, num.intValue());
                    i.Y(byteArrayOutputStream, 0);
                }
                for (int i20 : aVar4.f18304h) {
                    i.Y(byteArrayOutputStream, i20);
                }
            }
            return true;
        }
        byte[] bArr6 = w3.c.c;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] a11 = a(aVarArr, bArr6);
            i.X(byteArrayOutputStream, aVarArr.length, 1);
            i.X(byteArrayOutputStream, a11.length, 4);
            byte[] r11 = i.r(a11);
            i.X(byteArrayOutputStream, r11.length, 4);
            byteArrayOutputStream.write(r11);
            return true;
        }
        byte[] bArr7 = w3.c.f18310e;
        if (Arrays.equals(bArr, bArr7)) {
            i.Y(byteArrayOutputStream, aVarArr.length);
            for (w3.a aVar5 : aVarArr) {
                String b11 = b(aVar5.f18298a, aVar5.f18299b, bArr7);
                i.Y(byteArrayOutputStream, b11.getBytes(StandardCharsets.UTF_8).length);
                TreeMap<Integer, Integer> treeMap = aVar5.f18305i;
                i.Y(byteArrayOutputStream, treeMap.size());
                i.Y(byteArrayOutputStream, aVar5.f18304h.length);
                i.X(byteArrayOutputStream, aVar5.c, 4);
                byteArrayOutputStream.write(b11.getBytes(StandardCharsets.UTF_8));
                for (Integer num2 : treeMap.keySet()) {
                    i.Y(byteArrayOutputStream, num2.intValue());
                }
                for (int i21 : aVar5.f18304h) {
                    i.Y(byteArrayOutputStream, i21);
                }
            }
            return true;
        }
        return false;
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, w3.a aVar) {
        int i10 = 0;
        for (int i11 : aVar.f18304h) {
            Integer valueOf = Integer.valueOf(i11);
            i.Y(byteArrayOutputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, w3.a aVar, String str) {
        i.Y(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        i.Y(byteArrayOutputStream, aVar.f18301e);
        i.X(byteArrayOutputStream, aVar.f18302f, 4);
        i.X(byteArrayOutputStream, aVar.c, 4);
        i.X(byteArrayOutputStream, aVar.f18303g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, w3.a aVar) {
        byte[] bArr = new byte[((((aVar.f18303g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : aVar.f18305i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i10 = intValue2 & 2;
            int i11 = aVar.f18303g;
            if (i10 != 0) {
                int c = c(2, intValue, i11);
                int i12 = c / 8;
                bArr[i12] = (byte) ((1 << (c % 8)) | bArr[i12]);
            }
            if ((intValue2 & 4) != 0) {
                int c10 = c(4, intValue, i11);
                int i13 = c10 / 8;
                bArr[i13] = (byte) ((1 << (c10 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, w3.a aVar) {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : aVar.f18305i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                i.Y(byteArrayOutputStream, intValue - i10);
                i.Y(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }
}
