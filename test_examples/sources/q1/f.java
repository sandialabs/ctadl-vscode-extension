package q1;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Layout f16837a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f16838b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f16839d;

    /* renamed from: e  reason: collision with root package name */
    public char[] f16840e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16841a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16842b;
        public final boolean c;

        public a(int i10, int i11, boolean z10) {
            this.f16841a = i10;
            this.f16842b = i11;
            this.c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f16841a == aVar.f16841a && this.f16842b == aVar.f16842b && this.c == aVar.c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i10 = ((this.f16841a * 31) + this.f16842b) * 31;
            boolean z10 = this.c;
            int i11 = z10;
            if (z10 != 0) {
                i11 = 1;
            }
            return i10 + i11;
        }

        public final String toString() {
            return "BidiRun(start=" + this.f16841a + ", end=" + this.f16842b + ", isRtl=" + this.c + ')';
        }
    }

    public f(Layout layout) {
        v7.g.f(layout, "layout");
        this.f16837a = layout;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            CharSequence text = this.f16837a.getText();
            v7.g.e(text, "layout.text");
            int d12 = kotlin.text.b.d1(text, '\n', i10, false, 4);
            i10 = d12 < 0 ? this.f16837a.getText().length() : d12 + 1;
            arrayList.add(Integer.valueOf(i10));
        } while (i10 < this.f16837a.getText().length());
        this.f16838b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.f16839d = new boolean[this.f16838b.size()];
        this.f16838b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x02ad, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:?, code lost:
        return r2.getPrimaryHorizontal(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i10, boolean z10, boolean z11) {
        int lineForOffset;
        int i11;
        int i12;
        int intValue;
        boolean z12;
        int intValue2;
        int intValue3;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        Bidi bidi;
        Bidi bidi2;
        int intValue4;
        int i15;
        Bidi bidi3;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        int i16 = i10;
        Layout layout = this.f16837a;
        if (!z11) {
            if (z10) {
                return layout.getPrimaryHorizontal(i16);
            }
            return layout.getSecondaryHorizontal(i16);
        }
        v7.g.f(layout, "<this>");
        if (i16 <= 0) {
            lineForOffset = 0;
        } else if (i16 >= layout.getText().length()) {
            lineForOffset = layout.getLineCount() - 1;
        } else {
            lineForOffset = layout.getLineForOffset(i16);
            int lineStart = layout.getLineStart(lineForOffset);
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (lineStart == i16 || lineEnd == i16) {
                if (lineStart == i16) {
                    if (z11) {
                        lineForOffset--;
                    }
                } else if (!z11) {
                    lineForOffset++;
                }
            }
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (i16 != lineStart2 && i16 != lineEnd2) {
            if (z10) {
                return layout.getPrimaryHorizontal(i16);
            }
            return layout.getSecondaryHorizontal(i16);
        }
        if (i16 != 0 && i16 != layout.getText().length()) {
            ArrayList arrayList = this.f16838b;
            Integer valueOf = Integer.valueOf(i10);
            int size = arrayList.size();
            v7.g.f(arrayList, "<this>");
            int size2 = arrayList.size();
            if (size >= 0) {
                if (size <= size2) {
                    int i17 = size - 1;
                    int i18 = 0;
                    while (true) {
                        if (i18 <= i17) {
                            i11 = (i18 + i17) >>> 1;
                            int g02 = a1.c.g0((Comparable) arrayList.get(i11), valueOf);
                            if (g02 < 0) {
                                i18 = i11 + 1;
                            } else if (g02 <= 0) {
                                break;
                            } else {
                                i17 = i11 - 1;
                            }
                        } else {
                            i11 = -(i18 + 1);
                            break;
                        }
                    }
                    if (i11 < 0) {
                        i12 = -(i11 + 1);
                    } else {
                        i12 = i11 + 1;
                    }
                    if (z11 && i12 > 0) {
                        int i19 = i12 - 1;
                        if (i16 == ((Number) arrayList.get(i19)).intValue()) {
                            i12 = i19;
                        }
                    }
                    if (i12 == 0) {
                        intValue = 0;
                    } else {
                        intValue = ((Number) arrayList.get(i12 - 1)).intValue();
                    }
                    if (layout.getParagraphDirection(layout.getLineForOffset(intValue)) == -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int b5 = b(lineEnd2);
                    if (i12 == 0) {
                        intValue2 = 0;
                    } else {
                        intValue2 = ((Number) arrayList.get(i12 - 1)).intValue();
                    }
                    int i20 = lineStart2 - intValue2;
                    int i21 = b5 - intValue2;
                    boolean[] zArr = this.f16839d;
                    boolean z22 = zArr[i12];
                    ArrayList arrayList2 = this.c;
                    if (z22) {
                        bidi2 = (Bidi) arrayList2.get(i12);
                        z13 = z12;
                        i14 = lineForOffset;
                        i13 = b5;
                    } else {
                        if (i12 == 0) {
                            intValue3 = 0;
                        } else {
                            intValue3 = ((Number) arrayList.get(i12 - 1)).intValue();
                        }
                        int intValue5 = ((Number) arrayList.get(i12)).intValue();
                        int i22 = intValue5 - intValue3;
                        i13 = b5;
                        char[] cArr = this.f16840e;
                        i14 = lineForOffset;
                        if (cArr == null || cArr.length < i22) {
                            cArr = new char[i22];
                        }
                        z13 = z12;
                        TextUtils.getChars(layout.getText(), intValue3, intValue5, cArr, 0);
                        if (Bidi.requiresBidi(cArr, 0, i22)) {
                            if (i12 == 0) {
                                intValue4 = 0;
                            } else {
                                intValue4 = ((Number) arrayList.get(i12 - 1)).intValue();
                            }
                            if (layout.getParagraphDirection(layout.getLineForOffset(intValue4)) == -1) {
                                i15 = 1;
                            } else {
                                i15 = 0;
                            }
                            bidi = new Bidi(cArr, 0, null, 0, i22, i15);
                            z14 = true;
                            if (bidi.getRunCount() == 1) {
                            }
                            arrayList2.set(i12, bidi);
                            zArr[i12] = z14;
                            if (bidi != null) {
                                char[] cArr2 = this.f16840e;
                                if (cArr == cArr2) {
                                    cArr = null;
                                } else {
                                    cArr = cArr2;
                                }
                            }
                            this.f16840e = cArr;
                            bidi2 = bidi;
                        } else {
                            z14 = true;
                        }
                        bidi = null;
                        arrayList2.set(i12, bidi);
                        zArr[i12] = z14;
                        if (bidi != null) {
                        }
                        this.f16840e = cArr;
                        bidi2 = bidi;
                    }
                    if (bidi2 != null) {
                        bidi3 = bidi2.createLineBidi(i20, i21);
                    } else {
                        bidi3 = null;
                    }
                    if (bidi3 != null && bidi3.getRunCount() != 1) {
                        int runCount = bidi3.getRunCount();
                        a[] aVarArr = new a[runCount];
                        for (int i23 = 0; i23 < runCount; i23++) {
                            int runStart = bidi3.getRunStart(i23) + lineStart2;
                            int runLimit = bidi3.getRunLimit(i23) + lineStart2;
                            if (bidi3.getRunLevel(i23) % 2 == 1) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            aVarArr[i23] = new a(runStart, runLimit, z21);
                        }
                        int runCount2 = bidi3.getRunCount();
                        byte[] bArr = new byte[runCount2];
                        for (int i24 = 0; i24 < runCount2; i24++) {
                            bArr[i24] = (byte) bidi3.getRunLevel(i24);
                        }
                        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
                        if (i16 == lineStart2) {
                            int i25 = 0;
                            while (true) {
                                if (i25 < runCount) {
                                    if (aVarArr[i25].f16841a == i16) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    if (z20) {
                                        break;
                                    }
                                    i25++;
                                } else {
                                    i25 = -1;
                                    break;
                                }
                            }
                            a aVar = aVarArr[i25];
                            if (!z10) {
                                z18 = z13;
                                if (z18 != aVar.c) {
                                    z19 = z18;
                                    if (i25 != 0 && z19) {
                                        return layout.getLineLeft(i14);
                                    }
                                    int i26 = i14;
                                    if (i25 != runCount - 1 && !z19) {
                                        return layout.getLineRight(i26);
                                    }
                                    if (!z19) {
                                        return layout.getPrimaryHorizontal(aVarArr[i25 - 1].f16841a);
                                    }
                                    return layout.getPrimaryHorizontal(aVarArr[i25 + 1].f16841a);
                                }
                            } else {
                                z18 = z13;
                            }
                            if (!z18) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (i25 != 0) {
                            }
                            int i262 = i14;
                            if (i25 != runCount - 1) {
                            }
                            if (!z19) {
                            }
                        } else {
                            int i27 = i14;
                            boolean z23 = z13;
                            if (i16 > i13) {
                                i16 = b(i10);
                            }
                            int i28 = 0;
                            while (true) {
                                if (i28 < runCount) {
                                    if (aVarArr[i28].f16842b == i16) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        break;
                                    }
                                    i28++;
                                } else {
                                    i28 = -1;
                                    break;
                                }
                            }
                            a aVar2 = aVarArr[i28];
                            if (!z10 && z23 != aVar2.c) {
                                if (!z23) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (i28 != 0 && z16) {
                                    return layout.getLineLeft(i27);
                                }
                                if (i28 != runCount - 1 && !z16) {
                                    return layout.getLineRight(i27);
                                }
                                if (!z16) {
                                    return layout.getPrimaryHorizontal(aVarArr[i28 - 1].f16842b);
                                }
                                return layout.getPrimaryHorizontal(aVarArr[i28 + 1].f16842b);
                            }
                            z16 = z23;
                            if (i28 != 0) {
                            }
                            if (i28 != runCount - 1) {
                            }
                            if (!z16) {
                            }
                        }
                    }
                    int i29 = i14;
                    boolean z24 = z13;
                    boolean isRtlCharAt = layout.isRtlCharAt(lineStart2);
                    if (!z10 && z24 != isRtlCharAt) {
                        z15 = z24;
                        if (i16 != lineStart2) {
                            if (!z15) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        if (!z15) {
                            return layout.getLineLeft(i29);
                        }
                        return layout.getLineRight(i29);
                    }
                    z15 = false;
                    if (i16 != lineStart2) {
                    }
                    if (!z15) {
                    }
                } else {
                    throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                }
            } else {
                throw new IllegalArgumentException(a4.b.i("fromIndex (0) is greater than toIndex (", size, ")."));
            }
        }
        return layout.getSecondaryHorizontal(i16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
        r5 = r5 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(int i10) {
        while (i10 > 0) {
            char charAt = this.f16837a.getText().charAt(i10 - 1);
            boolean z10 = true;
            if (charAt != ' ' && charAt != '\n' && charAt != 5760) {
                if ((!(8192 <= charAt && charAt < 8203) || charAt == 8199) && charAt != 8287 && charAt != 12288) {
                    z10 = false;
                }
            }
            break;
        }
        return i10;
    }
}
