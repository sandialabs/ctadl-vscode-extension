package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: f  reason: collision with root package name */
    public static final c1 f4851f = new c1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f4852a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f4853b;
    public Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f4854d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4855e;

    public c1() {
        this(0, new int[8], new Object[8], true);
    }

    public c1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f4854d = -1;
        this.f4852a = i10;
        this.f4853b = iArr;
        this.c = objArr;
        this.f4855e = z10;
    }

    public final int a() {
        int g12;
        int i10 = this.f4854d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f4852a; i12++) {
            int i13 = this.f4853b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 5) {
                                ((Integer) this.c[i12]).intValue();
                                g12 = CodedOutputStream.P0(i14);
                            } else {
                                int i16 = InvalidProtocolBufferException.f4807i;
                                throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException());
                            }
                        } else {
                            i11 = ((c1) this.c[i12]).a() + (CodedOutputStream.d1(i14) * 2) + i11;
                        }
                    } else {
                        g12 = CodedOutputStream.M0(i14, (ByteString) this.c[i12]);
                    }
                } else {
                    ((Long) this.c[i12]).longValue();
                    g12 = CodedOutputStream.Q0(i14);
                }
            } else {
                g12 = CodedOutputStream.g1(((Long) this.c[i12]).longValue(), i14);
            }
            i11 = g12 + i11;
        }
        this.f4854d = i11;
        return i11;
    }

    public final void b(int i10, Object obj) {
        int i11;
        if (this.f4855e) {
            int i12 = this.f4852a;
            int[] iArr = this.f4853b;
            if (i12 == iArr.length) {
                if (i12 < 4) {
                    i11 = 8;
                } else {
                    i11 = i12 >> 1;
                }
                int i13 = i12 + i11;
                this.f4853b = Arrays.copyOf(iArr, i13);
                this.c = Arrays.copyOf(this.c, i13);
            }
            int[] iArr2 = this.f4853b;
            int i14 = this.f4852a;
            iArr2[i14] = i10;
            this.c[i14] = obj;
            this.f4852a = i14 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void c(i iVar) {
        if (this.f4852a == 0) {
            return;
        }
        iVar.getClass();
        for (int i10 = 0; i10 < this.f4852a; i10++) {
            int i11 = this.f4853b[i10];
            Object obj = this.c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                iVar.e(i12, ((Integer) obj).intValue());
                            } else {
                                int i14 = InvalidProtocolBufferException.f4807i;
                                throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException());
                            }
                        } else {
                            CodedOutputStream codedOutputStream = iVar.f4897a;
                            codedOutputStream.A1(i12, 3);
                            ((c1) obj).c(iVar);
                            codedOutputStream.A1(i12, 4);
                        }
                    } else {
                        iVar.b(i12, (ByteString) obj);
                    }
                } else {
                    iVar.f(((Long) obj).longValue(), i12);
                }
            } else {
                iVar.j(((Long) obj).longValue(), i12);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        int i10 = this.f4852a;
        if (i10 == c1Var.f4852a) {
            int[] iArr = this.f4853b;
            int[] iArr2 = c1Var.f4853b;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                Object[] objArr = this.c;
                Object[] objArr2 = c1Var.c;
                int i12 = this.f4852a;
                int i13 = 0;
                while (true) {
                    if (i13 < i12) {
                        if (!objArr[i13].equals(objArr2[i13])) {
                            z11 = false;
                            break;
                        }
                        i13++;
                    } else {
                        z11 = true;
                        break;
                    }
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f4852a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f4853b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.c;
        int i16 = this.f4852a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
