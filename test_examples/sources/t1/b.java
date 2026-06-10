package t1;

import androidx.compose.ui.text.font.a;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import n7.i;
import v7.g;

/* loaded from: classes.dex */
public final class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public int[] f17560a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f17561b;
    public int c;

    public b() {
        this(0);
    }

    public b(int i10) {
        this.f17560a = m0.b.f15896i;
        this.f17561b = m0.b.f15897j;
        this.c = 0;
    }

    public final V a(K k3) {
        int b5;
        if (k3 == null) {
            b5 = c();
        } else {
            b5 = b(k3.hashCode(), k3);
        }
        if (b5 >= 0) {
            return (V) this.f17561b[(b5 << 1) + 1];
        }
        return null;
    }

    public final int b(int i10, Object obj) {
        g.f(obj, "key");
        int i11 = this.c;
        if (i11 == 0) {
            return -1;
        }
        int w10 = m0.b.w(i11, i10, this.f17560a);
        if (w10 >= 0 && !g.a(obj, this.f17561b[w10 << 1])) {
            int i12 = w10 + 1;
            while (i12 < i11 && this.f17560a[i12] == i10) {
                if (g.a(obj, this.f17561b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = w10 - 1; i13 >= 0 && this.f17560a[i13] == i10; i13--) {
                if (g.a(obj, this.f17561b[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return w10;
    }

    public final int c() {
        int i10 = this.c;
        if (i10 == 0) {
            return -1;
        }
        int w10 = m0.b.w(i10, 0, this.f17560a);
        if (w10 >= 0 && this.f17561b[w10 << 1] != null) {
            int i11 = w10 + 1;
            while (i11 < i10 && this.f17560a[i11] == 0) {
                if (this.f17561b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = w10 - 1; i12 >= 0 && this.f17560a[i12] == 0; i12--) {
                if (this.f17561b[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return w10;
    }

    public final Object d(a.b bVar, a.C0027a c0027a) {
        int hashCode;
        int b5;
        int i10 = this.c;
        if (bVar == null) {
            b5 = c();
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
            b5 = b(hashCode, bVar);
        }
        if (b5 >= 0) {
            int i11 = (b5 << 1) + 1;
            Object[] objArr = this.f17561b;
            Object obj = objArr[i11];
            objArr[i11] = c0027a;
            return obj;
        }
        int i12 = ~b5;
        int[] iArr = this.f17560a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            g.e(copyOf, "copyOf(this, newSize)");
            this.f17560a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f17561b, i13 << 1);
            g.e(copyOf2, "copyOf(this, newSize)");
            this.f17561b = copyOf2;
            if (i10 != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f17560a;
            int i14 = i12 + 1;
            i.a2(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f17561b;
            i.b2(objArr2, objArr2, i14 << 1, i12 << 1, this.c << 1);
        }
        int i15 = this.c;
        if (i10 == i15) {
            int[] iArr3 = this.f17560a;
            if (i12 < iArr3.length) {
                iArr3[i12] = hashCode;
                Object[] objArr3 = this.f17561b;
                int i16 = i12 << 1;
                objArr3[i16] = bVar;
                objArr3[i16 + 1] = c0027a;
                this.c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        int b5;
        boolean z10;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = this.c;
                if (i10 != bVar.c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    Object[] objArr = this.f17561b;
                    int i12 = i11 << 1;
                    Object obj2 = objArr[i12];
                    Object obj3 = objArr[i12 + 1];
                    Object a10 = bVar.a(obj2);
                    if (obj3 == null) {
                        if (a10 == null) {
                            if (obj2 == null) {
                                b5 = bVar.c();
                            } else {
                                b5 = bVar.b(obj2.hashCode(), obj2);
                            }
                            if (b5 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                            }
                        }
                        return false;
                    } else if (!g.a(obj3, a10)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            } else {
                int i13 = this.c;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object[] objArr2 = this.f17561b;
                    int i15 = i14 << 1;
                    Object obj4 = objArr2[i15];
                    Object obj5 = objArr2[i15 + 1];
                    Object obj6 = ((Map) obj).get(obj4);
                    if (obj5 == null) {
                        if (obj6 != null || !((Map) obj).containsKey(obj4)) {
                            return false;
                        }
                    } else if (!g.a(obj5, obj6)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f17560a;
        Object[] objArr = this.f17561b;
        int i10 = this.c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final String toString() {
        boolean z10;
        int i10 = this.c;
        if (i10 <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        int i11 = this.c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            int i13 = i12 << 1;
            Object obj = this.f17561b[i13];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.f17561b[i13 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        g.e(sb2, "buffer.toString()");
        return sb2;
    }
}
