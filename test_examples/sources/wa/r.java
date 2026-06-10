package wa;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.internal.JsonElementMarker;
import kotlinx.serialization.json.internal.WriteMode;
import sa.h;
import ua.b0;
import wa.k;

/* loaded from: classes.dex */
public final class r extends androidx.datastore.preferences.protobuf.k implements va.f {

    /* renamed from: i  reason: collision with root package name */
    public final va.a f18524i;

    /* renamed from: j  reason: collision with root package name */
    public final WriteMode f18525j;

    /* renamed from: k  reason: collision with root package name */
    public final wa.a f18526k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f18527l;

    /* renamed from: m  reason: collision with root package name */
    public int f18528m;
    public a n;

    /* renamed from: o  reason: collision with root package name */
    public final va.e f18529o;

    /* renamed from: p  reason: collision with root package name */
    public final JsonElementMarker f18530p;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f18531a;

        public a(String str) {
            this.f18531a = str;
        }
    }

    public r(va.a aVar, WriteMode writeMode, wa.a aVar2, sa.e eVar, a aVar3) {
        JsonElementMarker jsonElementMarker;
        v7.g.f(aVar, "json");
        v7.g.f(aVar2, "lexer");
        v7.g.f(eVar, "descriptor");
        this.f18524i = aVar;
        this.f18525j = writeMode;
        this.f18526k = aVar2;
        this.f18527l = aVar.f18192b;
        this.f18528m = -1;
        this.n = aVar3;
        va.e eVar2 = aVar.f18191a;
        this.f18529o = eVar2;
        if (eVar2.f18213f) {
            jsonElementMarker = null;
        } else {
            jsonElementMarker = new JsonElementMarker(eVar);
        }
        this.f18530p = jsonElementMarker;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.a
    public final <T> T A(sa.e eVar, int i10, qa.a<? extends T> aVar, T t10) {
        boolean z10;
        v7.g.f(eVar, "descriptor");
        v7.g.f(aVar, "deserializer");
        if (this.f18525j == WriteMode.MAP && (i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wa.a aVar2 = this.f18526k;
        if (z10) {
            k kVar = aVar2.f18499b;
            int[] iArr = kVar.f18512b;
            int i11 = kVar.c;
            if (iArr[i11] == -2) {
                kVar.f18511a[i11] = k.a.f18513a;
            }
        }
        T t11 = (T) super.A(eVar, i10, aVar, t10);
        if (z10) {
            k kVar2 = aVar2.f18499b;
            int[] iArr2 = kVar2.f18512b;
            int i12 = kVar2.c;
            if (iArr2[i12] != -2) {
                int i13 = i12 + 1;
                kVar2.c = i13;
                if (i13 == kVar2.f18511a.length) {
                    kVar2.b();
                }
            }
            Object[] objArr = kVar2.f18511a;
            int i14 = kVar2.c;
            objArr[i14] = t11;
            kVar2.f18512b[i14] = -2;
        }
        return t11;
    }

    @Override // va.f
    public final va.a H() {
        return this.f18524i;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final <T> T J(qa.a<? extends T> aVar) {
        qa.a<T> aVar2;
        va.a aVar3 = this.f18524i;
        wa.a aVar4 = this.f18526k;
        v7.g.f(aVar, "deserializer");
        try {
            if ((aVar instanceof ua.b) && !aVar3.f18191a.f18216i) {
                String x3 = a1.b.x(aVar.a(), aVar3);
                String f10 = aVar4.f(x3, this.f18529o.c);
                if (f10 != null) {
                    aVar2 = ((ua.b) aVar).f(this, f10);
                } else {
                    aVar2 = null;
                }
                if (aVar2 == null) {
                    return (T) a1.b.J(this, aVar);
                }
                this.n = new a(x3);
                return aVar2.e(this);
            }
            return aVar.e(this);
        } catch (MissingFieldException e10) {
            throw new MissingFieldException(e10.f15575i, e10.getMessage() + " at path: " + aVar4.f18499b.a(), e10);
        }
    }

    @Override // va.f
    public final kotlinx.serialization.json.b N() {
        return new kotlinx.serialization.json.internal.d(this.f18524i.f18191a, this.f18526k).b();
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final int O() {
        wa.a aVar = this.f18526k;
        long j2 = aVar.j();
        int i10 = (int) j2;
        if (j2 == i10) {
            return i10;
        }
        wa.a.p(aVar, "Failed to parse int for input '" + j2 + '\'', 0, null, 6);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final byte T() {
        wa.a aVar = this.f18526k;
        long j2 = aVar.j();
        byte b5 = (byte) j2;
        if (j2 == b5) {
            return b5;
        }
        wa.a.p(aVar, "Failed to parse byte for input '" + j2 + '\'', 0, null, 6);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final int V(sa.e eVar) {
        v7.g.f(eVar, "enumDescriptor");
        return kotlinx.serialization.json.internal.b.b(eVar, this.f18524i, c0(), " at path ".concat(this.f18526k.f18499b.a()));
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final void W() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.k, ta.a, ta.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sa.e eVar) {
        int i10;
        int[] iArr;
        int i11;
        v7.g.f(eVar, "descriptor");
        if (this.f18524i.f18191a.f18210b && eVar.c() == 0) {
            do {
            } while (t(eVar) != -1);
            char c = this.f18525j.f15695j;
            wa.a aVar = this.f18526k;
            aVar.i(c);
            k kVar = aVar.f18499b;
            i10 = kVar.c;
            iArr = kVar.f18512b;
            if (iArr[i10] == -2) {
            }
            i11 = kVar.c;
            if (i11 == -1) {
            }
        } else {
            char c10 = this.f18525j.f15695j;
            wa.a aVar2 = this.f18526k;
            aVar2.i(c10);
            k kVar2 = aVar2.f18499b;
            i10 = kVar2.c;
            iArr = kVar2.f18512b;
            if (iArr[i10] == -2) {
                iArr[i10] = -1;
                kVar2.c = i10 - 1;
            }
            i11 = kVar2.c;
            if (i11 == -1) {
                kVar2.c = i11 - 1;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c, ta.d
    public final ta.a b(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
        va.a aVar = this.f18524i;
        WriteMode b5 = w.b(eVar, aVar);
        wa.a aVar2 = this.f18526k;
        k kVar = aVar2.f18499b;
        kVar.getClass();
        int i10 = kVar.c + 1;
        kVar.c = i10;
        if (i10 == kVar.f18511a.length) {
            kVar.b();
        }
        kVar.f18511a[i10] = eVar;
        aVar2.i(b5.f15694i);
        if (aVar2.t() != 4) {
            int ordinal = b5.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (this.f18525j == b5 && aVar.f18191a.f18213f) {
                    return this;
                }
                return new r(this.f18524i, b5, this.f18526k, eVar, this.n);
            }
            return new r(this.f18524i, b5, this.f18526k, eVar, this.n);
        }
        wa.a.p(aVar2, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final short b0() {
        wa.a aVar = this.f18526k;
        long j2 = aVar.j();
        short s10 = (short) j2;
        if (j2 == s10) {
            return s10;
        }
        wa.a.p(aVar, "Failed to parse short for input '" + j2 + '\'', 0, null, 6);
        throw null;
    }

    @Override // ta.a
    public final androidx.datastore.preferences.protobuf.k c() {
        return this.f18527l;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final String c0() {
        boolean z10 = this.f18529o.c;
        wa.a aVar = this.f18526k;
        if (z10) {
            return aVar.m();
        }
        return aVar.k();
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final float d0() {
        wa.a aVar = this.f18526k;
        String l2 = aVar.l();
        boolean z10 = false;
        try {
            float parseFloat = Float.parseFloat(l2);
            if (!this.f18524i.f18191a.f18218k) {
                if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                    z10 = true;
                }
                if (!z10) {
                    a1.c.G1(aVar, Float.valueOf(parseFloat));
                    throw null;
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            wa.a.p(aVar, "Failed to parse type 'float' for input '" + l2 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final long f() {
        return this.f18526k.j();
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final boolean l() {
        boolean z10;
        boolean z11 = this.f18529o.c;
        wa.a aVar = this.f18526k;
        if (z11) {
            int v3 = aVar.v();
            if (v3 != aVar.s().length()) {
                if (aVar.s().charAt(v3) == '\"') {
                    v3++;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean c = aVar.c(v3);
                if (z10) {
                    if (aVar.f18498a != aVar.s().length()) {
                        if (aVar.s().charAt(aVar.f18498a) == '\"') {
                            aVar.f18498a++;
                            return c;
                        }
                        wa.a.p(aVar, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    wa.a.p(aVar, "EOF", 0, null, 6);
                    throw null;
                }
                return c;
            }
            wa.a.p(aVar, "EOF", 0, null, 6);
            throw null;
        }
        return aVar.c(aVar.v());
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final ta.c m(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
        return t.a(eVar) ? new j(this.f18526k, this.f18524i) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final double m0() {
        wa.a aVar = this.f18526k;
        String l2 = aVar.l();
        boolean z10 = false;
        try {
            double parseDouble = Double.parseDouble(l2);
            if (!this.f18524i.f18191a.f18218k) {
                if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                    z10 = true;
                }
                if (!z10) {
                    a1.c.G1(aVar, Double.valueOf(parseDouble));
                    throw null;
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            wa.a.p(aVar, "Failed to parse type 'double' for input '" + l2 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final boolean o() {
        boolean z10;
        JsonElementMarker jsonElementMarker = this.f18530p;
        if (jsonElementMarker != null) {
            z10 = jsonElementMarker.f15678b;
        } else {
            z10 = false;
        }
        if (z10 || this.f18526k.x(true)) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.k, ta.c
    public final char q() {
        wa.a aVar = this.f18526k;
        String l2 = aVar.l();
        if (l2.length() == 1) {
            return l2.charAt(0);
        }
        wa.a.p(aVar, "Expected single char, but got '" + l2 + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0118, code lost:
        if (r5 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011a, code lost:
        r1 = r5.f15677a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011e, code lost:
        if (r6 >= 64) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0120, code lost:
        r1.c |= 1 << r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0129, code lost:
        r3 = (r6 >>> 6) - 1;
        r1 = r1.f17952d;
        r1[r3] = (1 << (r6 & 63)) | r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013a, code lost:
        r9 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0118 A[EDGE_INSN: B:185:0x0118->B:90:0x0118 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0239 A[EDGE_INSN: B:198:0x0239->B:151:0x0239 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    @Override // ta.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(sa.e eVar) {
        String e10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String k3;
        boolean z15;
        boolean z16;
        v7.g.f(eVar, "descriptor");
        WriteMode writeMode = this.f18525j;
        int ordinal = writeMode.ordinal();
        char c = ':';
        wa.a aVar = this.f18526k;
        int i10 = -1;
        int i11 = 0;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean w10 = aVar.w();
                if (aVar.b()) {
                    int i12 = this.f18528m;
                    if (i12 != -1 && !w10) {
                        wa.a.p(aVar, "Expected end of the array or comma", 0, null, 6);
                        throw null;
                    }
                    i10 = i12 + 1;
                    this.f18528m = i10;
                } else if (w10) {
                    wa.a.p(aVar, "Unexpected trailing comma", 0, null, 6);
                    throw null;
                }
            } else {
                int i13 = this.f18528m;
                if (i13 % 2 != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    if (i13 != -1) {
                        z16 = aVar.w();
                        if (!aVar.b()) {
                            if (z15) {
                                if (this.f18528m == -1) {
                                    boolean z17 = !z16;
                                    int i14 = aVar.f18498a;
                                    if (!z17) {
                                        wa.a.p(aVar, "Unexpected trailing comma", i14, null, 4);
                                        throw null;
                                    }
                                } else {
                                    int i15 = aVar.f18498a;
                                    if (!z16) {
                                        wa.a.p(aVar, "Expected comma after the key-value pair", i15, null, 4);
                                        throw null;
                                    }
                                }
                            }
                            i10 = this.f18528m + 1;
                            this.f18528m = i10;
                        } else if (z16) {
                            wa.a.p(aVar, "Expected '}', but had ',' instead", 0, null, 6);
                            throw null;
                        }
                    }
                } else {
                    aVar.i(':');
                }
                z16 = false;
                if (!aVar.b()) {
                }
            }
        } else {
            boolean w11 = aVar.w();
            while (true) {
                boolean b5 = aVar.b();
                JsonElementMarker jsonElementMarker = this.f18530p;
                if (b5) {
                    va.e eVar2 = this.f18529o;
                    if (eVar2.c) {
                        e10 = aVar.m();
                    } else {
                        e10 = aVar.e();
                    }
                    aVar.i(c);
                    va.a aVar2 = this.f18524i;
                    int a10 = kotlinx.serialization.json.internal.b.a(e10, eVar, aVar2);
                    boolean z18 = eVar2.c;
                    if (a10 != -3) {
                        if (!eVar2.f18215h) {
                            break;
                        }
                        sa.e j2 = eVar.j(a10);
                        if (j2.f() || !aVar.x(true)) {
                            if (v7.g.a(j2.h(), h.b.f17531a) && (!j2.f() || !aVar.x(false))) {
                                byte t10 = aVar.t();
                                if (z18) {
                                    if (t10 == 1 || t10 == 0) {
                                        k3 = aVar.l();
                                        aVar.c = k3;
                                    } else {
                                        k3 = null;
                                    }
                                } else {
                                    if (t10 == 1) {
                                        k3 = aVar.k();
                                        aVar.c = k3;
                                    }
                                    k3 = null;
                                }
                                if (k3 != null && kotlinx.serialization.json.internal.b.a(k3, j2, aVar2) == -3) {
                                    aVar.k();
                                }
                            }
                            z14 = false;
                            if (z14) {
                                break;
                            }
                            z10 = aVar.w();
                            z11 = false;
                        }
                        z14 = true;
                        if (z14) {
                        }
                    } else {
                        z10 = false;
                        z11 = true;
                    }
                    if (z11) {
                        if (!eVar2.f18210b) {
                            a aVar3 = this.n;
                            if (aVar3 != null && v7.g.a(aVar3.f18531a, e10)) {
                                aVar3.f18531a = null;
                                z13 = true;
                                if (z13) {
                                    aVar.o(kotlin.text.b.g1(aVar.s().subSequence(0, aVar.f18498a).toString(), e10, 6), "Encountered an unknown key '" + e10 + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                                    throw null;
                                }
                            }
                            z13 = false;
                            if (z13) {
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        byte t11 = aVar.t();
                        if (t11 == 8 || t11 == 6) {
                            while (true) {
                                byte t12 = aVar.t();
                                if (t12 == 1) {
                                    if (z18) {
                                        aVar.l();
                                    } else {
                                        aVar.e();
                                    }
                                } else {
                                    if (t12 != 8 && t12 != 6) {
                                        z12 = false;
                                        if (!z12) {
                                            arrayList.add(Byte.valueOf(t12));
                                        } else {
                                            k kVar = aVar.f18499b;
                                            if (t12 == 9) {
                                                if (((Number) kotlin.collections.c.v2(arrayList)).byteValue() != 8) {
                                                    throw a1.c.q(aVar.f18498a, "found ] instead of } at path: " + kVar, aVar.s());
                                                }
                                            } else if (t12 == 7) {
                                                if (((Number) kotlin.collections.c.v2(arrayList)).byteValue() != 6) {
                                                    throw a1.c.q(aVar.f18498a, "found } instead of ] at path: " + kVar, aVar.s());
                                                }
                                            } else if (t12 == 10) {
                                                wa.a.p(aVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                                throw null;
                                            }
                                            if (!arrayList.isEmpty()) {
                                                arrayList.remove(a1.c.B0(arrayList));
                                            } else {
                                                throw new NoSuchElementException("List is empty.");
                                            }
                                        }
                                        aVar.g();
                                        if (arrayList.size() != 0) {
                                            break;
                                        }
                                    }
                                    z12 = true;
                                    if (!z12) {
                                    }
                                    aVar.g();
                                    if (arrayList.size() != 0) {
                                    }
                                }
                            }
                        } else {
                            aVar.l();
                        }
                        w11 = aVar.w();
                    } else {
                        w11 = z10;
                    }
                    c = ':';
                } else if (!w11) {
                    if (jsonElementMarker != null) {
                        b0 b0Var = jsonElementMarker.f15677a;
                        sa.e eVar3 = b0Var.f17950a;
                        int c10 = eVar3.c();
                        while (true) {
                            long j10 = b0Var.c;
                            long j11 = -1;
                            u7.p<sa.e, Integer, Boolean> pVar = b0Var.f17951b;
                            if (j10 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                                b0Var.c |= 1 << numberOfTrailingZeros;
                                if (pVar.R(eVar3, Integer.valueOf(numberOfTrailingZeros)).booleanValue()) {
                                    i10 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (c10 > 64) {
                                long[] jArr = b0Var.f17952d;
                                int length = jArr.length;
                                loop3: while (i11 < length) {
                                    int i16 = i11 + 1;
                                    int i17 = i16 * 64;
                                    long j12 = jArr[i11];
                                    while (j12 != j11) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j12);
                                        j12 |= 1 << numberOfTrailingZeros2;
                                        int i18 = numberOfTrailingZeros2 + i17;
                                        if (pVar.R(eVar3, Integer.valueOf(i18)).booleanValue()) {
                                            jArr[i11] = j12;
                                            i10 = i18;
                                            break loop3;
                                        }
                                        j11 = -1;
                                    }
                                    jArr[i11] = j12;
                                    i11 = i16;
                                    j11 = -1;
                                }
                            }
                        }
                    }
                    i10 = -1;
                } else {
                    wa.a.p(aVar, "Unexpected trailing comma", 0, null, 6);
                    throw null;
                }
            }
        }
        if (writeMode != WriteMode.MAP) {
            k kVar2 = aVar.f18499b;
            kVar2.f18512b[kVar2.c] = i10;
        }
        return i10;
    }
}
