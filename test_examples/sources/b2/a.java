package b2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f6334b = {18, 20, 17, 15};
    public static final int[] c = {65535, 262143, 32767, 8191};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f6335d = {32767, 8191, 65535, 262143};

    /* renamed from: a  reason: collision with root package name */
    public final long f6336a;

    /* renamed from: b2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0052a {
        public static int a(int i10) {
            if (i10 < 8191) {
                return 13;
            }
            if (i10 < 32767) {
                return 15;
            }
            if (i10 < 65535) {
                return 16;
            }
            if (i10 < 262143) {
                return 18;
            }
            throw new IllegalArgumentException(a4.b.i("Can't represent a size of ", i10, " in Constraints"));
        }

        public static long b(int i10, int i11, int i12, int i13) {
            long j2;
            int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
            int a10 = a(i14);
            int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
            int a11 = a(i15);
            if (a10 + a11 > 31) {
                throw new IllegalArgumentException("Can't represent a width of " + i15 + " and height of " + i14 + " in Constraints");
            }
            if (a11 == 13) {
                j2 = 3;
            } else if (a11 == 18) {
                j2 = 1;
            } else if (a11 == 15) {
                j2 = 2;
            } else if (a11 != 16) {
                throw new IllegalStateException("Should only have the provided constants.");
            } else {
                j2 = 0;
            }
            int i16 = 0;
            int i17 = i11 == Integer.MAX_VALUE ? 0 : i11 + 1;
            if (i13 != Integer.MAX_VALUE) {
                i16 = i13 + 1;
            }
            int i18 = a.f6334b[(int) j2];
            return (i17 << 33) | j2 | (i10 << 2) | (i12 << i18) | (i16 << (i18 + 31));
        }
    }

    public /* synthetic */ a(long j2) {
        this.f6336a = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long a(long j2, int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean z11;
        if ((i14 & 1) != 0) {
            i10 = h(j2);
        }
        if ((i14 & 2) != 0) {
            i11 = f(j2);
        }
        if ((i14 & 4) != 0) {
            i12 = g(j2);
        }
        if ((i14 & 8) != 0) {
            i13 = e(j2);
        }
        boolean z12 = false;
        if (i12 >= 0 && i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 < i10 && i11 != Integer.MAX_VALUE) {
                z11 = false;
                if (!z11) {
                    if ((i13 >= i12 || i13 == Integer.MAX_VALUE) ? true : true) {
                        return C0052a.b(i10, i11, i12, i13);
                    }
                    throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')').toString());
                }
                throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')').toString());
            }
            z11 = true;
            if (!z11) {
            }
        } else {
            throw new IllegalArgumentException(("minHeight(" + i12 + ") and minWidth(" + i10 + ") must be >= 0").toString());
        }
    }

    public static final boolean b(long j2, long j10) {
        return j2 == j10;
    }

    public static final boolean c(long j2) {
        int i10 = (int) (3 & j2);
        return (((int) (j2 >> (f6334b[i10] + 31))) & f6335d[i10]) != 0;
    }

    public static final boolean d(long j2) {
        return (((int) (j2 >> 33)) & c[(int) (3 & j2)]) != 0;
    }

    public static final int e(long j2) {
        int i10 = (int) (3 & j2);
        int i11 = ((int) (j2 >> (f6334b[i10] + 31))) & f6335d[i10];
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int f(long j2) {
        int i10 = ((int) (j2 >> 33)) & c[(int) (3 & j2)];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    public static final int g(long j2) {
        int i10 = (int) (3 & j2);
        return ((int) (j2 >> f6334b[i10])) & f6335d[i10];
    }

    public static final int h(long j2) {
        return ((int) (j2 >> 2)) & c[(int) (3 & j2)];
    }

    public static String i(long j2) {
        int f10 = f(j2);
        String str = "Infinity";
        String valueOf = f10 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(f10);
        int e10 = e(j2);
        if (e10 != Integer.MAX_VALUE) {
            str = String.valueOf(e10);
        }
        return "Constraints(minWidth = " + h(j2) + ", maxWidth = " + valueOf + ", minHeight = " + g(j2) + ", maxHeight = " + str + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f6336a != ((a) obj).f6336a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f6336a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return i(this.f6336a);
    }
}
