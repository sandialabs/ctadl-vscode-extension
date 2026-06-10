package z0;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import v0.r;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final EmptyList f19079a = EmptyList.f12981i;

    static {
        int i10 = r.f18134h;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7 A[LOOP:4: B:48:0x00b5->B:80:0x00f7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<d> a(String str) {
        char c;
        boolean z10;
        int i10;
        float[] fArr;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        if (str == null) {
            return f19079a;
        }
        e eVar = new e();
        ArrayList arrayList = eVar.f19062a;
        arrayList.clear();
        int i12 = 0;
        int i13 = 1;
        int i14 = 1;
        int i15 = 0;
        while (i14 < str.length()) {
            while (i14 < str.length()) {
                char charAt = str.charAt(i14);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i14++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    break;
                }
                i14++;
            }
            String substring = str.substring(i15, i14);
            v7.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - i13;
            int i16 = 0;
            boolean z14 = false;
            while (true) {
                c = ' ';
                if (i16 > length) {
                    break;
                }
                if (!z14) {
                    i11 = i16;
                } else {
                    i11 = length;
                }
                if (v7.g.h(substring.charAt(i11), 32) <= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z14) {
                    if (!z13) {
                        z14 = true;
                    } else {
                        i16++;
                    }
                } else if (!z13) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = substring.subSequence(i16, length + 1).toString();
            if (obj.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (obj.charAt(i12) != 'z' && obj.charAt(i12) != 'Z') {
                    int length2 = obj.length();
                    float[] fArr2 = new float[length2];
                    int length3 = obj.length();
                    int i17 = 1;
                    int i18 = 0;
                    while (i17 < length3) {
                        int i19 = i17;
                        boolean z15 = false;
                        boolean z16 = false;
                        boolean z17 = false;
                        boolean z18 = false;
                        while (i19 < obj.length()) {
                            char charAt2 = obj.charAt(i19);
                            if (charAt2 != c && charAt2 != ',') {
                                z11 = false;
                                if (!z11) {
                                    if (charAt2 == '-') {
                                        z17 = (i19 == i17 || z16) ? true : true;
                                        z16 = false;
                                        if (z18) {
                                            break;
                                        }
                                        i19++;
                                        c = ' ';
                                    } else {
                                        if (charAt2 == '.') {
                                            if (!z15) {
                                                z15 = true;
                                            }
                                        } else {
                                            if (charAt2 != 'e' && charAt2 != 'E') {
                                                z12 = false;
                                                if (z12) {
                                                    z16 = true;
                                                    if (z18) {
                                                    }
                                                }
                                            }
                                            z12 = true;
                                            if (z12) {
                                            }
                                        }
                                        z16 = false;
                                        if (z18) {
                                        }
                                    }
                                }
                                z16 = false;
                                z18 = true;
                                if (z18) {
                                }
                            }
                            z11 = true;
                            if (!z11) {
                            }
                            z16 = false;
                            z18 = true;
                            if (z18) {
                            }
                        }
                        if (i17 < i19) {
                            String substring2 = obj.substring(i17, i19);
                            v7.g.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            fArr2[i18] = Float.parseFloat(substring2);
                            i18++;
                        }
                        if (!z17) {
                            i19++;
                        }
                        i17 = i19;
                        c = ' ';
                    }
                    if (i18 >= 0) {
                        if (length2 >= 0) {
                            int i20 = i18 + 0;
                            fArr = new float[i20];
                            i10 = 0;
                            System.arraycopy(fArr2, 0, fArr, 0, (Math.min(i20, length2 + 0) + 0) - 0);
                            eVar.a(obj.charAt(i10), fArr);
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                i10 = 0;
                fArr = new float[0];
                eVar.a(obj.charAt(i10), fArr);
            }
            i15 = i14;
            i13 = 1;
            i14++;
            i12 = 0;
        }
        if (i14 - i15 == 1 && i15 < str.length()) {
            eVar.a(str.charAt(i15), new float[0]);
        }
        return arrayList;
    }
}
