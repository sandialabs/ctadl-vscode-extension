package k0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final s f12855e = new s(0, 0, new Object[0], null);

    /* renamed from: a  reason: collision with root package name */
    public int f12856a;

    /* renamed from: b  reason: collision with root package name */
    public int f12857b;
    public final m0.b c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f12858d;

    /* loaded from: classes.dex */
    public static final class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public s<K, V> f12859a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12860b;

        public a(s<K, V> sVar, int i10) {
            v7.g.f(sVar, "node");
            this.f12859a = sVar;
            this.f12860b = i10;
        }
    }

    public s(int i10, int i11, Object[] objArr, m0.b bVar) {
        this.f12856a = i10;
        this.f12857b = i11;
        this.c = bVar;
        this.f12858d = objArr;
    }

    public static s j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, m0.b bVar) {
        if (i12 > 30) {
            return new s(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int i13 = (i10 >> i12) & 31;
        int i14 = (i11 >> i12) & 31;
        if (i13 != i14) {
            Object[] objArr = new Object[4];
            if (i13 < i14) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new s((1 << i14) | (1 << i13), 0, objArr, bVar);
        }
        return new s(0, 1 << i13, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i10, int i11, int i12, K k3, V v3, int i13, m0.b bVar) {
        int i14;
        Object obj = this.f12858d[i10];
        if (obj != null) {
            i14 = obj.hashCode();
        } else {
            i14 = 0;
        }
        s j2 = j(i14, obj, x(i10), i12, k3, v3, i13 + 5, bVar);
        int t10 = t(i11) + 1;
        Object[] objArr = this.f12858d;
        int i15 = t10 - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        n7.i.d2(objArr, objArr2, 0, 0, i10, 6);
        n7.i.b2(objArr, objArr2, i10, i10 + 2, t10);
        objArr2[i15] = j2;
        n7.i.b2(objArr, objArr2, i15 + 1, t10, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f12857b == 0) {
            return this.f12858d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f12856a);
        int length = this.f12858d.length;
        for (int i10 = bitCount * 2; i10 < length; i10++) {
            bitCount += s(i10).b();
        }
        return bitCount;
    }

    public final boolean c(K k3) {
        b8.g C1 = a1.c.C1(a1.c.V1(0, this.f12858d.length), 2);
        int i10 = C1.f6497i;
        int i11 = C1.f6498j;
        int i12 = C1.f6499k;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!v7.g.a(k3, this.f12858d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(int i10, int i11, Object obj) {
        int i12 = 1 << ((i10 >> i11) & 31);
        if (h(i12)) {
            return v7.g.a(obj, this.f12858d[f(i12)]);
        } else if (i(i12)) {
            s<K, V> s10 = s(t(i12));
            if (i11 == 30) {
                return s10.c(obj);
            }
            return s10.d(i10, i11 + 5, obj);
        } else {
            return false;
        }
    }

    public final boolean e(s<K, V> sVar) {
        if (this == sVar) {
            return true;
        }
        if (this.f12857b == sVar.f12857b && this.f12856a == sVar.f12856a) {
            int length = this.f12858d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f12858d[i10] != sVar.f12858d[i10]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f12856a) * 2;
    }

    public final Object g(int i10, int i11, Object obj) {
        int i12 = 1 << ((i10 >> i11) & 31);
        if (h(i12)) {
            int f10 = f(i12);
            if (!v7.g.a(obj, this.f12858d[f10])) {
                return null;
            }
            return x(f10);
        } else if (!i(i12)) {
            return null;
        } else {
            s<K, V> s10 = s(t(i12));
            if (i11 == 30) {
                b8.g C1 = a1.c.C1(a1.c.V1(0, s10.f12858d.length), 2);
                int i13 = C1.f6497i;
                int i14 = C1.f6498j;
                int i15 = C1.f6499k;
                if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
                    return null;
                }
                while (!v7.g.a(obj, s10.f12858d[i13])) {
                    if (i13 == i14) {
                        return null;
                    }
                    i13 += i15;
                }
                return s10.x(i13);
            }
            return s10.g(i10, i11 + 5, obj);
        }
    }

    public final boolean h(int i10) {
        return (i10 & this.f12856a) != 0;
    }

    public final boolean i(int i10) {
        return (i10 & this.f12857b) != 0;
    }

    public final s<K, V> k(int i10, e<K, V> eVar) {
        eVar.b(eVar.n - 1);
        eVar.f12842l = x(i10);
        Object[] objArr = this.f12858d;
        if (objArr.length == 2) {
            return null;
        }
        m0.b bVar = eVar.f12840j;
        m0.b bVar2 = this.c;
        Object[] G = a1.c.G(i10, objArr);
        if (bVar2 == bVar) {
            this.f12858d = G;
            return this;
        }
        return new s<>(0, 0, G, eVar.f12840j);
    }

    public final s<K, V> l(int i10, K k3, V v3, int i11, e<K, V> eVar) {
        s<K, V> l2;
        v7.g.f(eVar, "mutator");
        int i12 = 1 << ((i10 >> i11) & 31);
        boolean h10 = h(i12);
        m0.b bVar = this.c;
        if (h10) {
            int f10 = f(i12);
            if (v7.g.a(k3, this.f12858d[f10])) {
                eVar.f12842l = x(f10);
                if (x(f10) == v3) {
                    return this;
                }
                if (bVar == eVar.f12840j) {
                    this.f12858d[f10 + 1] = v3;
                    return this;
                }
                eVar.f12843m++;
                Object[] objArr = this.f12858d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                v7.g.e(copyOf, "copyOf(this, size)");
                copyOf[f10 + 1] = v3;
                return new s<>(this.f12856a, this.f12857b, copyOf, eVar.f12840j);
            }
            eVar.b(eVar.n + 1);
            m0.b bVar2 = eVar.f12840j;
            Object[] a10 = a(f10, i12, i10, k3, v3, i11, bVar2);
            if (bVar == bVar2) {
                this.f12858d = a10;
                this.f12856a ^= i12;
                this.f12857b |= i12;
                return this;
            }
            return new s<>(this.f12856a ^ i12, this.f12857b | i12, a10, bVar2);
        } else if (i(i12)) {
            int t10 = t(i12);
            s<K, V> s10 = s(t10);
            if (i11 == 30) {
                b8.g C1 = a1.c.C1(a1.c.V1(0, s10.f12858d.length), 2);
                int i13 = C1.f6497i;
                int i14 = C1.f6498j;
                int i15 = C1.f6499k;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (!v7.g.a(k3, s10.f12858d[i13])) {
                        if (i13 != i14) {
                            i13 += i15;
                        }
                    }
                    eVar.f12842l = s10.x(i13);
                    if (s10.c == eVar.f12840j) {
                        s10.f12858d[i13 + 1] = v3;
                        l2 = s10;
                    } else {
                        eVar.f12843m++;
                        Object[] objArr2 = s10.f12858d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        v7.g.e(copyOf2, "copyOf(this, size)");
                        copyOf2[i13 + 1] = v3;
                        l2 = new s<>(0, 0, copyOf2, eVar.f12840j);
                    }
                }
                eVar.b(eVar.n + 1);
                l2 = new s<>(0, 0, a1.c.C(s10.f12858d, 0, k3, v3), eVar.f12840j);
                break;
            }
            l2 = s10.l(i10, k3, v3, i11 + 5, eVar);
            if (s10 == l2) {
                return this;
            }
            return r(t10, l2, eVar.f12840j);
        } else {
            eVar.b(eVar.n + 1);
            m0.b bVar3 = eVar.f12840j;
            int f11 = f(i12);
            if (bVar == bVar3) {
                this.f12858d = a1.c.C(this.f12858d, f11, k3, v3);
                this.f12856a |= i12;
                return this;
            }
            return new s<>(this.f12856a | i12, this.f12857b, a1.c.C(this.f12858d, f11, k3, v3), bVar3);
        }
    }

    public final s<K, V> m(s<K, V> sVar, int i10, m0.a aVar, e<K, V> eVar) {
        Object[] objArr;
        int i11;
        s<K, V> j2;
        v7.g.f(eVar, "mutator");
        if (this == sVar) {
            aVar.f15889a += b();
            return this;
        }
        int i12 = 1;
        if (i10 > 30) {
            m0.b bVar = eVar.f12840j;
            Object[] objArr2 = this.f12858d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + sVar.f12858d.length);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            int length = this.f12858d.length;
            b8.g C1 = a1.c.C1(a1.c.V1(0, sVar.f12858d.length), 2);
            int i13 = C1.f6497i;
            int i14 = C1.f6498j;
            int i15 = C1.f6499k;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (c((K) sVar.f12858d[i13])) {
                        aVar.f15889a++;
                    } else {
                        Object[] objArr3 = sVar.f12858d;
                        copyOf[length] = objArr3[i13];
                        copyOf[length + 1] = objArr3[i13 + 1];
                        length += 2;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                }
            }
            if (length == this.f12858d.length) {
                return this;
            }
            if (length == sVar.f12858d.length) {
                return sVar;
            }
            if (length == copyOf.length) {
                return new s<>(0, 0, copyOf, bVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            v7.g.e(copyOf2, "copyOf(this, newSize)");
            return new s<>(0, 0, copyOf2, bVar);
        }
        int i16 = this.f12857b | sVar.f12857b;
        int i17 = this.f12856a;
        int i18 = sVar.f12856a;
        int i19 = i17 & i18;
        int i20 = (i17 ^ i18) & (~i16);
        while (i19 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i19);
            if (v7.g.a(this.f12858d[f(lowestOneBit)], sVar.f12858d[sVar.f(lowestOneBit)])) {
                i20 |= lowestOneBit;
            } else {
                i16 |= lowestOneBit;
            }
            i19 ^= lowestOneBit;
        }
        if ((i16 & i20) == 0) {
            s<K, V> sVar2 = (v7.g.a(this.c, eVar.f12840j) && this.f12856a == i20 && this.f12857b == i16) ? this : new s<>(i20, i16, new Object[Integer.bitCount(i16) + (Integer.bitCount(i20) * 2)], null);
            int i21 = i16;
            int i22 = 0;
            while (i21 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i21);
                Object[] objArr4 = sVar2.f12858d;
                int length2 = (objArr4.length - i12) - i22;
                if (i(lowestOneBit2)) {
                    j2 = s(t(lowestOneBit2));
                    if (sVar.i(lowestOneBit2)) {
                        j2 = j2.m(sVar.s(sVar.t(lowestOneBit2)), i10 + 5, aVar, eVar);
                    } else if (sVar.h(lowestOneBit2)) {
                        int f10 = sVar.f(lowestOneBit2);
                        K k3 = (K) sVar.f12858d[f10];
                        V x3 = sVar.x(f10);
                        int i23 = eVar.n;
                        objArr = objArr4;
                        i11 = lowestOneBit2;
                        j2 = j2.l(k3 != null ? k3.hashCode() : 0, k3, x3, i10 + 5, eVar);
                        if (eVar.n == i23) {
                            aVar.f15889a++;
                        }
                    }
                    objArr = objArr4;
                    i11 = lowestOneBit2;
                } else {
                    objArr = objArr4;
                    i11 = lowestOneBit2;
                    if (sVar.i(i11)) {
                        j2 = sVar.s(sVar.t(i11));
                        if (h(i11)) {
                            int f11 = f(i11);
                            K k10 = (K) this.f12858d[f11];
                            int i24 = i10 + 5;
                            if (!j2.d(k10 != null ? k10.hashCode() : 0, i24, k10)) {
                                j2 = j2.l(k10 != null ? k10.hashCode() : 0, k10, x(f11), i24, eVar);
                            }
                            aVar.f15889a++;
                        }
                    } else {
                        int f12 = f(i11);
                        Object obj = this.f12858d[f12];
                        V x10 = x(f12);
                        int f13 = sVar.f(i11);
                        Object obj2 = sVar.f12858d[f13];
                        j2 = j(obj != null ? obj.hashCode() : 0, obj, x10, obj2 != null ? obj2.hashCode() : 0, obj2, sVar.x(f13), i10 + 5, eVar.f12840j);
                    }
                }
                objArr[length2] = j2;
                i22++;
                i21 ^= i11;
                i12 = 1;
            }
            int i25 = 0;
            while (i20 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i20);
                int i26 = i25 * 2;
                if (!sVar.h(lowestOneBit3)) {
                    int f14 = f(lowestOneBit3);
                    Object[] objArr5 = sVar2.f12858d;
                    objArr5[i26] = this.f12858d[f14];
                    objArr5[i26 + 1] = x(f14);
                } else {
                    int f15 = sVar.f(lowestOneBit3);
                    Object[] objArr6 = sVar2.f12858d;
                    objArr6[i26] = sVar.f12858d[f15];
                    objArr6[i26 + 1] = sVar.x(f15);
                    if (h(lowestOneBit3)) {
                        aVar.f15889a++;
                        i25++;
                        i20 ^= lowestOneBit3;
                    }
                }
                i25++;
                i20 ^= lowestOneBit3;
            }
            return e(sVar2) ? this : sVar.e(sVar2) ? sVar : sVar2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final s<K, V> n(int i10, K k3, int i11, e<K, V> eVar) {
        s<K, V> n;
        s<K, V> sVar;
        v7.g.f(eVar, "mutator");
        int i12 = 1 << ((i10 >> i11) & 31);
        if (h(i12)) {
            int f10 = f(i12);
            if (v7.g.a(k3, this.f12858d[f10])) {
                return p(f10, i12, eVar);
            }
            return this;
        } else if (i(i12)) {
            int t10 = t(i12);
            s<K, V> s10 = s(t10);
            if (i11 == 30) {
                b8.g C1 = a1.c.C1(a1.c.V1(0, s10.f12858d.length), 2);
                int i13 = C1.f6497i;
                int i14 = C1.f6498j;
                int i15 = C1.f6499k;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (!v7.g.a(k3, s10.f12858d[i13])) {
                        if (i13 != i14) {
                            i13 += i15;
                        }
                    }
                    n = s10.k(i13, eVar);
                }
                sVar = s10;
                return q(s10, sVar, t10, i12, eVar.f12840j);
            }
            n = s10.n(i10, k3, i11 + 5, eVar);
            sVar = n;
            return q(s10, sVar, t10, i12, eVar.f12840j);
        } else {
            return this;
        }
    }

    public final s<K, V> o(int i10, K k3, V v3, int i11, e<K, V> eVar) {
        s<K, V> o10;
        s<K, V> sVar;
        v7.g.f(eVar, "mutator");
        int i12 = 1 << ((i10 >> i11) & 31);
        if (h(i12)) {
            int f10 = f(i12);
            if (!v7.g.a(k3, this.f12858d[f10]) || !v7.g.a(v3, x(f10))) {
                return this;
            }
            return p(f10, i12, eVar);
        } else if (!i(i12)) {
            return this;
        } else {
            int t10 = t(i12);
            s<K, V> s10 = s(t10);
            if (i11 == 30) {
                b8.g C1 = a1.c.C1(a1.c.V1(0, s10.f12858d.length), 2);
                int i13 = C1.f6497i;
                int i14 = C1.f6498j;
                int i15 = C1.f6499k;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (true) {
                        if (v7.g.a(k3, s10.f12858d[i13]) && v7.g.a(v3, s10.x(i13))) {
                            o10 = s10.k(i13, eVar);
                            break;
                        } else if (i13 == i14) {
                            break;
                        } else {
                            i13 += i15;
                        }
                    }
                }
                sVar = s10;
                return q(s10, sVar, t10, i12, eVar.f12840j);
            }
            o10 = s10.o(i10, k3, v3, i11 + 5, eVar);
            sVar = o10;
            return q(s10, sVar, t10, i12, eVar.f12840j);
        }
    }

    public final s<K, V> p(int i10, int i11, e<K, V> eVar) {
        eVar.b(eVar.n - 1);
        eVar.f12842l = x(i10);
        Object[] objArr = this.f12858d;
        if (objArr.length == 2) {
            return null;
        }
        m0.b bVar = eVar.f12840j;
        m0.b bVar2 = this.c;
        Object[] G = a1.c.G(i10, objArr);
        if (bVar2 == bVar) {
            this.f12858d = G;
            this.f12856a ^= i11;
            return this;
        }
        return new s<>(i11 ^ this.f12856a, this.f12857b, G, eVar.f12840j);
    }

    public final s<K, V> q(s<K, V> sVar, s<K, V> sVar2, int i10, int i11, m0.b bVar) {
        m0.b bVar2 = this.c;
        if (sVar2 == null) {
            Object[] objArr = this.f12858d;
            if (objArr.length == 1) {
                return null;
            }
            Object[] objArr2 = new Object[objArr.length - 1];
            n7.i.d2(objArr, objArr2, 0, 0, i10, 6);
            n7.i.b2(objArr, objArr2, i10, i10 + 1, objArr.length);
            if (bVar2 == bVar) {
                this.f12858d = objArr2;
                this.f12857b ^= i11;
            } else {
                return new s<>(this.f12856a, i11 ^ this.f12857b, objArr2, bVar);
            }
        } else {
            if (bVar2 != bVar) {
                if (sVar != sVar2) {
                }
            }
            return r(i10, sVar2, bVar);
        }
        return this;
    }

    public final s<K, V> r(int i10, s<K, V> sVar, m0.b bVar) {
        Object[] objArr = this.f12858d;
        if (objArr.length == 1 && sVar.f12858d.length == 2 && sVar.f12857b == 0) {
            sVar.f12856a = this.f12857b;
            return sVar;
        } else if (this.c == bVar) {
            objArr[i10] = sVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            v7.g.e(copyOf, "copyOf(this, size)");
            copyOf[i10] = sVar;
            return new s<>(this.f12856a, this.f12857b, copyOf, bVar);
        }
    }

    public final s<K, V> s(int i10) {
        Object obj = this.f12858d[i10];
        v7.g.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (s) obj;
    }

    public final int t(int i10) {
        return (this.f12858d.length - 1) - Integer.bitCount((i10 - 1) & this.f12857b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a u(int i10, int i11, Object obj, l0.a aVar) {
        a u10;
        int i12 = 1 << ((i10 >> i11) & 31);
        if (h(i12)) {
            int f10 = f(i12);
            if (v7.g.a(obj, this.f12858d[f10])) {
                if (x(f10) == aVar) {
                    return null;
                }
                Object[] objArr = this.f12858d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                v7.g.e(copyOf, "copyOf(this, size)");
                copyOf[f10 + 1] = aVar;
                return new a(new s(this.f12856a, this.f12857b, copyOf, null), 0);
            }
            return new a(new s(this.f12856a ^ i12, this.f12857b | i12, a(f10, i12, i10, obj, aVar, i11, null), null), 1);
        } else if (i(i12)) {
            int t10 = t(i12);
            s<K, V> s10 = s(t10);
            if (i11 == 30) {
                b8.g C1 = a1.c.C1(a1.c.V1(0, s10.f12858d.length), 2);
                int i13 = C1.f6497i;
                int i14 = C1.f6498j;
                int i15 = C1.f6499k;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (!v7.g.a(obj, s10.f12858d[i13])) {
                        if (i13 != i14) {
                            i13 += i15;
                        }
                    }
                    if (aVar == s10.x(i13)) {
                        u10 = null;
                    } else {
                        Object[] objArr2 = s10.f12858d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        v7.g.e(copyOf2, "copyOf(this, size)");
                        copyOf2[i13 + 1] = aVar;
                        u10 = new a(new s(0, 0, copyOf2, null), 0);
                    }
                    if (u10 == null) {
                        return null;
                    }
                }
                u10 = new a(new s(0, 0, a1.c.C(s10.f12858d, 0, obj, aVar), null), 1);
                if (u10 == null) {
                }
            } else {
                u10 = s10.u(i10, i11 + 5, obj, aVar);
                if (u10 == null) {
                    return null;
                }
            }
            u10.f12859a = w(t10, i12, u10.f12859a);
            return u10;
        } else {
            return new a(new s(this.f12856a | i12, this.f12857b, a1.c.C(this.f12858d, f(i12), obj, aVar), null), 1);
        }
    }

    public final s v(int i10, int i11, Object obj) {
        s<K, V> v3;
        int i12 = 1 << ((i10 >> i11) & 31);
        if (h(i12)) {
            int f10 = f(i12);
            if (v7.g.a(obj, this.f12858d[f10])) {
                Object[] objArr = this.f12858d;
                if (objArr.length == 2) {
                    return null;
                }
                return new s(this.f12856a ^ i12, this.f12857b, a1.c.G(f10, objArr), null);
            }
            return this;
        } else if (i(i12)) {
            int t10 = t(i12);
            s<K, V> s10 = s(t10);
            if (i11 == 30) {
                b8.g C1 = a1.c.C1(a1.c.V1(0, s10.f12858d.length), 2);
                int i13 = C1.f6497i;
                int i14 = C1.f6498j;
                int i15 = C1.f6499k;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (!v7.g.a(obj, s10.f12858d[i13])) {
                        if (i13 != i14) {
                            i13 += i15;
                        }
                    }
                    Object[] objArr2 = s10.f12858d;
                    if (objArr2.length == 2) {
                        v3 = null;
                    } else {
                        v3 = new s<>(0, 0, a1.c.G(i13, objArr2), null);
                    }
                }
                v3 = s10;
                break;
            }
            v3 = s10.v(i10, i11 + 5, obj);
            if (v3 == null) {
                Object[] objArr3 = this.f12858d;
                if (objArr3.length == 1) {
                    return null;
                }
                Object[] objArr4 = new Object[objArr3.length - 1];
                n7.i.d2(objArr3, objArr4, 0, 0, t10, 6);
                n7.i.b2(objArr3, objArr4, t10, t10 + 1, objArr3.length);
                return new s(this.f12856a, i12 ^ this.f12857b, objArr4, null);
            } else if (s10 != v3) {
                return w(t10, i12, v3);
            } else {
                return this;
            }
        } else {
            return this;
        }
    }

    public final s<K, V> w(int i10, int i11, s<K, V> sVar) {
        Object[] objArr = sVar.f12858d;
        if (objArr.length == 2 && sVar.f12857b == 0) {
            if (this.f12858d.length == 1) {
                sVar.f12856a = this.f12857b;
                return sVar;
            }
            int f10 = f(i11);
            Object[] objArr2 = this.f12858d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            n7.i.b2(copyOf, copyOf, i10 + 2, i10 + 1, objArr2.length);
            n7.i.b2(copyOf, copyOf, f10 + 2, f10, i10);
            copyOf[f10] = obj;
            copyOf[f10 + 1] = obj2;
            return new s<>(this.f12856a ^ i11, i11 ^ this.f12857b, copyOf, null);
        }
        Object[] objArr3 = this.f12858d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        v7.g.e(copyOf2, "copyOf(this, newSize)");
        copyOf2[i10] = sVar;
        return new s<>(this.f12856a, this.f12857b, copyOf2, null);
    }

    public final V x(int i10) {
        return (V) this.f12858d[i10 + 1];
    }
}
