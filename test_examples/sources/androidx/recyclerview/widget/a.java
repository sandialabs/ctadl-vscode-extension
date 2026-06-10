package androidx.recyclerview.widget;

import androidx.recyclerview.widget.t;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements t.a {

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0043a f5794d;

    /* renamed from: a  reason: collision with root package name */
    public final h1.c f5792a = new h1.c(30, 1);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f5793b = new ArrayList<>();
    public final ArrayList<b> c = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public int f5796f = 0;

    /* renamed from: e  reason: collision with root package name */
    public final t f5795e = new t(this);

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0043a {
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f5797a;

        /* renamed from: b  reason: collision with root package name */
        public int f5798b;
        public Object c;

        /* renamed from: d  reason: collision with root package name */
        public int f5799d;

        public b(Object obj, int i10, int i11, int i12) {
            this.f5797a = i10;
            this.f5798b = i11;
            this.f5799d = i12;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = this.f5797a;
                if (i10 != bVar.f5797a) {
                    return false;
                }
                if (i10 == 8 && Math.abs(this.f5799d - this.f5798b) == 1 && this.f5799d == bVar.f5798b && this.f5798b == bVar.f5799d) {
                    return true;
                }
                if (this.f5799d == bVar.f5799d && this.f5798b == bVar.f5798b) {
                    Object obj2 = this.c;
                    Object obj3 = bVar.c;
                    if (obj2 != null) {
                        if (!obj2.equals(obj3)) {
                            return false;
                        }
                    } else if (obj3 != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.f5797a * 31) + this.f5798b) * 31) + this.f5799d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i10 = this.f5797a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            str = "??";
                        } else {
                            str = "mv";
                        }
                    } else {
                        str = "up";
                    }
                } else {
                    str = "rm";
                }
            } else {
                str = "add";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f5798b);
            sb.append("c:");
            sb.append(this.f5799d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(a0 a0Var) {
        this.f5794d = a0Var;
    }

    public final boolean a(int i10) {
        ArrayList<b> arrayList = this.c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f5797a;
            if (i12 == 8) {
                if (f(bVar.f5799d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f5798b;
                int i14 = bVar.f5799d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a0) this.f5794d).a(arrayList.get(i10));
        }
        l(arrayList);
        this.f5796f = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f5793b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = arrayList.get(i10);
            int i11 = bVar.f5797a;
            InterfaceC0043a interfaceC0043a = this.f5794d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            a0 a0Var = (a0) interfaceC0043a;
                            a0Var.a(bVar);
                            a0Var.e(bVar.f5798b, bVar.f5799d);
                        }
                    } else {
                        a0 a0Var2 = (a0) interfaceC0043a;
                        a0Var2.a(bVar);
                        a0Var2.c(bVar.f5798b, bVar.f5799d, bVar.c);
                    }
                } else {
                    a0 a0Var3 = (a0) interfaceC0043a;
                    a0Var3.a(bVar);
                    int i12 = bVar.f5798b;
                    int i13 = bVar.f5799d;
                    RecyclerView recyclerView = a0Var3.f5800a;
                    recyclerView.Q(i12, i13, true);
                    recyclerView.f5640t0 = true;
                    recyclerView.f5634q0.c += i13;
                }
            } else {
                a0 a0Var4 = (a0) interfaceC0043a;
                a0Var4.a(bVar);
                a0Var4.d(bVar.f5798b, bVar.f5799d);
            }
        }
        l(arrayList);
        this.f5796f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r9 == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(b bVar) {
        int i10;
        boolean z10;
        int i11 = bVar.f5797a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m10 = m(bVar.f5798b, i11);
        int i12 = bVar.f5798b;
        int i13 = bVar.f5797a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        } else {
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f5799d; i15++) {
            int m11 = m((i10 * i15) + bVar.f5798b, bVar.f5797a);
            int i16 = bVar.f5797a;
            if (i16 != 2) {
                z10 = (i16 == 4 && m11 == m10 + 1) ? true : true;
                z10 = false;
            }
            if (z10) {
                i14++;
            } else {
                b h10 = h(bVar.c, i16, m10, i14);
                e(h10, i12);
                k(h10);
                if (bVar.f5797a == 4) {
                    i12 += i14;
                }
                m10 = m11;
                i14 = 1;
            }
        }
        Object obj = bVar.c;
        k(bVar);
        if (i14 > 0) {
            b h11 = h(obj, bVar.f5797a, m10, i14);
            e(h11, i12);
            k(h11);
        }
    }

    public final void e(b bVar, int i10) {
        a0 a0Var = (a0) this.f5794d;
        a0Var.a(bVar);
        int i11 = bVar.f5797a;
        if (i11 != 2) {
            if (i11 == 4) {
                a0Var.c(i10, bVar.f5799d, bVar.c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = bVar.f5799d;
        RecyclerView recyclerView = a0Var.f5800a;
        recyclerView.Q(i10, i12, true);
        recyclerView.f5640t0 = true;
        recyclerView.f5634q0.c += i12;
    }

    public final int f(int i10, int i11) {
        ArrayList<b> arrayList = this.c;
        int size = arrayList.size();
        while (i11 < size) {
            b bVar = arrayList.get(i11);
            int i12 = bVar.f5797a;
            if (i12 == 8) {
                int i13 = bVar.f5798b;
                if (i13 == i10) {
                    i10 = bVar.f5799d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f5799d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f5798b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f5799d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f5799d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f5793b.size() > 0;
    }

    public final b h(Object obj, int i10, int i11, int i12) {
        b bVar = (b) this.f5792a.a();
        if (bVar == null) {
            return new b(obj, i10, i11, i12);
        }
        bVar.f5797a = i10;
        bVar.f5798b = i11;
        bVar.f5799d = i12;
        bVar.c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.c.add(bVar);
        int i10 = bVar.f5797a;
        InterfaceC0043a interfaceC0043a = this.f5794d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        ((a0) interfaceC0043a).e(bVar.f5798b, bVar.f5799d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                ((a0) interfaceC0043a).c(bVar.f5798b, bVar.f5799d, bVar.c);
                return;
            }
            int i11 = bVar.f5798b;
            int i12 = bVar.f5799d;
            RecyclerView recyclerView = ((a0) interfaceC0043a).f5800a;
            recyclerView.Q(i11, i12, false);
            recyclerView.f5640t0 = true;
            return;
        }
        ((a0) interfaceC0043a).d(bVar.f5798b, bVar.f5799d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0202, code lost:
        d(h(r11.c, 4, r15, r5));
        r15 = r12;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0254, code lost:
        d(h(null, 2, r5, r12));
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016f, code lost:
        if (r4 >= r12.f5798b) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        int i10;
        boolean z10;
        char c;
        b h10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        ArrayList<b> arrayList = this.f5793b;
        t tVar = this.f5795e;
        tVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z14 = false;
            while (true) {
                i10 = 8;
                if (size >= 0) {
                    if (arrayList.get(size).f5797a == 8) {
                        if (z14) {
                            break;
                        }
                    } else {
                        z14 = true;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            b bVar = null;
            if (size == -1) {
                break;
            }
            int i17 = size + 1;
            b bVar2 = arrayList.get(size);
            b bVar3 = arrayList.get(i17);
            int i18 = bVar3.f5797a;
            if (i18 != 1) {
                t.a aVar = tVar.f5995a;
                if (i18 != 2) {
                    if (i18 == 4) {
                        int i19 = bVar2.f5799d;
                        int i20 = bVar3.f5798b;
                        if (i19 < i20) {
                            bVar3.f5798b = i20 - 1;
                        } else {
                            int i21 = bVar3.f5799d;
                            if (i19 < i20 + i21) {
                                bVar3.f5799d = i21 - 1;
                                h10 = ((a) aVar).h(bVar3.c, 4, bVar2.f5798b, 1);
                                i11 = bVar2.f5798b;
                                i12 = bVar3.f5798b;
                                if (i11 > i12) {
                                    bVar3.f5798b = i12 + 1;
                                } else {
                                    int i22 = i12 + bVar3.f5799d;
                                    if (i11 < i22) {
                                        int i23 = i22 - i11;
                                        bVar = ((a) aVar).h(bVar3.c, 4, i11 + 1, i23);
                                        bVar3.f5799d -= i23;
                                    }
                                }
                                arrayList.set(i17, bVar2);
                                if (bVar3.f5799d <= 0) {
                                    arrayList.set(size, bVar3);
                                } else {
                                    arrayList.remove(size);
                                    ((a) aVar).k(bVar3);
                                }
                                if (h10 != null) {
                                    arrayList.add(size, h10);
                                }
                                if (bVar == null) {
                                    arrayList.add(size, bVar);
                                }
                            }
                        }
                        h10 = null;
                        i11 = bVar2.f5798b;
                        i12 = bVar3.f5798b;
                        if (i11 > i12) {
                        }
                        arrayList.set(i17, bVar2);
                        if (bVar3.f5799d <= 0) {
                        }
                        if (h10 != null) {
                        }
                        if (bVar == null) {
                        }
                    }
                } else {
                    int i24 = bVar2.f5798b;
                    int i25 = bVar2.f5799d;
                    int i26 = bVar3.f5798b;
                    if (i24 < i25) {
                        if (i26 == i24 && bVar3.f5799d == i25 - i24) {
                            z13 = false;
                            z12 = z13;
                            z11 = true;
                            if (i25 >= i26) {
                            }
                            i13 = bVar2.f5798b;
                            i14 = bVar3.f5798b;
                            if (i13 > i14) {
                            }
                            if (!z11) {
                            }
                        } else {
                            z11 = false;
                            z12 = false;
                            if (i25 >= i26) {
                                bVar3.f5798b = i26 - 1;
                            } else {
                                int i27 = bVar3.f5799d;
                                if (i25 < i26 + i27) {
                                    bVar3.f5799d = i27 - 1;
                                    bVar2.f5797a = 2;
                                    bVar2.f5799d = 1;
                                    if (bVar3.f5799d == 0) {
                                        arrayList.remove(i17);
                                        ((a) aVar).k(bVar3);
                                    }
                                }
                            }
                            i13 = bVar2.f5798b;
                            i14 = bVar3.f5798b;
                            if (i13 > i14) {
                                bVar3.f5798b = i14 + 1;
                            } else {
                                int i28 = i14 + bVar3.f5799d;
                                if (i13 < i28) {
                                    bVar = ((a) aVar).h(null, 2, i13 + 1, i28 - i13);
                                    bVar3.f5799d = bVar2.f5798b - bVar3.f5798b;
                                }
                            }
                            if (!z11) {
                                arrayList.set(size, bVar3);
                                arrayList.remove(i17);
                                ((a) aVar).k(bVar2);
                            } else if (z12) {
                                if (bVar != null) {
                                    int i29 = bVar2.f5798b;
                                    if (i29 > bVar.f5798b) {
                                        bVar2.f5798b = i29 - bVar.f5799d;
                                    }
                                    int i30 = bVar2.f5799d;
                                    if (i30 > bVar.f5798b) {
                                        bVar2.f5799d = i30 - bVar.f5799d;
                                    }
                                }
                                int i31 = bVar2.f5798b;
                                if (i31 > bVar3.f5798b) {
                                    bVar2.f5798b = i31 - bVar3.f5799d;
                                }
                                i15 = bVar2.f5799d;
                                if (i15 > bVar3.f5798b) {
                                    bVar2.f5799d = i15 - bVar3.f5799d;
                                }
                                arrayList.set(size, bVar3);
                                if (bVar2.f5798b != bVar2.f5799d) {
                                    arrayList.set(i17, bVar2);
                                } else {
                                    arrayList.remove(i17);
                                }
                                if (bVar != null) {
                                    arrayList.add(size, bVar);
                                }
                            } else {
                                if (bVar != null) {
                                    int i32 = bVar2.f5798b;
                                    if (i32 >= bVar.f5798b) {
                                        bVar2.f5798b = i32 - bVar.f5799d;
                                    }
                                    int i33 = bVar2.f5799d;
                                    if (i33 >= bVar.f5798b) {
                                        bVar2.f5799d = i33 - bVar.f5799d;
                                    }
                                }
                                int i34 = bVar2.f5798b;
                                if (i34 >= bVar3.f5798b) {
                                    bVar2.f5798b = i34 - bVar3.f5799d;
                                }
                                i15 = bVar2.f5799d;
                            }
                        }
                    } else if (i26 == i25 + 1 && bVar3.f5799d == i24 - i25) {
                        z13 = true;
                        z12 = z13;
                        z11 = true;
                        if (i25 >= i26) {
                        }
                        i13 = bVar2.f5798b;
                        i14 = bVar3.f5798b;
                        if (i13 > i14) {
                        }
                        if (!z11) {
                        }
                    } else {
                        z11 = false;
                        z12 = true;
                        if (i25 >= i26) {
                        }
                        i13 = bVar2.f5798b;
                        i14 = bVar3.f5798b;
                        if (i13 > i14) {
                        }
                        if (!z11) {
                        }
                    }
                }
            } else {
                int i35 = bVar2.f5799d;
                int i36 = bVar3.f5798b;
                if (i35 < i36) {
                    i16 = -1;
                } else {
                    i16 = 0;
                }
                int i37 = bVar2.f5798b;
                if (i37 < i36) {
                    i16++;
                }
                if (i36 <= i37) {
                    bVar2.f5798b = i37 + bVar3.f5799d;
                }
                int i38 = bVar3.f5798b;
                if (i38 <= i35) {
                    bVar2.f5799d = i35 + bVar3.f5799d;
                }
                bVar3.f5798b = i38 + i16;
                arrayList.set(size, bVar3);
                arrayList.set(i17, bVar2);
            }
        }
        int size2 = arrayList.size();
        int i39 = 0;
        while (i39 < size2) {
            b bVar4 = arrayList.get(i39);
            int i40 = bVar4.f5797a;
            if (i40 != 1) {
                InterfaceC0043a interfaceC0043a = this.f5794d;
                if (i40 != 2) {
                    if (i40 != 4) {
                        if (i40 == i10) {
                            i(bVar4);
                        }
                    } else {
                        int i41 = bVar4.f5798b;
                        int i42 = bVar4.f5799d + i41;
                        int i43 = i41;
                        int i44 = 0;
                        char c10 = 65535;
                        while (i41 < i42) {
                            if (((a0) interfaceC0043a).b(i41) == null && !a(i41)) {
                                if (c10 == 1) {
                                    i(h(bVar4.c, 4, i43, i44));
                                    i43 = i41;
                                    i44 = 0;
                                }
                                c10 = 0;
                                i44++;
                                i41++;
                            }
                            c10 = 1;
                            i44++;
                            i41++;
                        }
                        if (i44 != bVar4.f5799d) {
                            Object obj = bVar4.c;
                            k(bVar4);
                            bVar4 = h(obj, 4, i43, i44);
                        }
                        if (c10 == 0) {
                            d(bVar4);
                        } else {
                            i(bVar4);
                        }
                    }
                } else {
                    int i45 = bVar4.f5798b;
                    int i46 = bVar4.f5799d + i45;
                    int i47 = i45;
                    int i48 = 0;
                    char c11 = 65535;
                    while (i47 < i46) {
                        if (((a0) interfaceC0043a).b(i47) == null && !a(i47)) {
                            if (c11 == 1) {
                                i(h(null, 2, i45, i48));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c = 0;
                            if (!z10) {
                                i47 -= i48;
                                i46 -= i48;
                                i48 = 1;
                            } else {
                                i48++;
                            }
                            i47++;
                            c11 = c;
                        }
                        z10 = false;
                        c = 1;
                        if (!z10) {
                        }
                        i47++;
                        c11 = c;
                    }
                    if (i48 != bVar4.f5799d) {
                        k(bVar4);
                        bVar4 = h(null, 2, i45, i48);
                    }
                    if (c11 == 0) {
                        d(bVar4);
                    } else {
                        i(bVar4);
                    }
                }
            } else {
                i(bVar4);
            }
            i39++;
            i10 = 8;
        }
        arrayList.clear();
    }

    public final void k(b bVar) {
        bVar.c = null;
        this.f5792a.b(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((b) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList<b> arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i18 = bVar.f5797a;
            if (i18 == 8) {
                int i19 = bVar.f5798b;
                int i20 = bVar.f5799d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f5798b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f5798b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f5799d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.f5799d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f5798b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f5798b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f5798b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f5799d;
                } else if (i18 == 2) {
                    i10 += bVar.f5799d;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f5797a == 8) {
                int i22 = bVar2.f5799d;
                if (i22 != bVar2.f5798b && i22 >= 0) {
                }
                arrayList.remove(size2);
                k(bVar2);
            } else {
                if (bVar2.f5799d > 0) {
                }
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i10;
    }
}
