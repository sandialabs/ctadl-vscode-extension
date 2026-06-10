package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DISTINCT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class V2 {
    public static final V2 DISTINCT;
    public static final V2 ORDERED;
    public static final V2 SHORT_CIRCUIT;
    public static final V2 SIZED;
    public static final V2 SORTED;

    /* renamed from: f  reason: collision with root package name */
    static final int f12398f;

    /* renamed from: g  reason: collision with root package name */
    static final int f12399g;

    /* renamed from: h  reason: collision with root package name */
    static final int f12400h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f12401i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f12402j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f12403k;

    /* renamed from: l  reason: collision with root package name */
    static final int f12404l;

    /* renamed from: m  reason: collision with root package name */
    static final int f12405m;
    static final int n;

    /* renamed from: o  reason: collision with root package name */
    static final int f12406o;

    /* renamed from: p  reason: collision with root package name */
    static final int f12407p;

    /* renamed from: q  reason: collision with root package name */
    static final int f12408q;

    /* renamed from: r  reason: collision with root package name */
    static final int f12409r;

    /* renamed from: s  reason: collision with root package name */
    static final int f12410s;

    /* renamed from: t  reason: collision with root package name */
    static final int f12411t;

    /* renamed from: u  reason: collision with root package name */
    static final int f12412u;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ V2[] f12413v;

    /* renamed from: a  reason: collision with root package name */
    private final Map f12414a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12415b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12416d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12417e;

    static {
        U2 u22 = U2.SPLITERATOR;
        T2 k3 = k(u22);
        U2 u23 = U2.STREAM;
        k3.a(u23);
        U2 u24 = U2.OP;
        k3.f12384a.put(u24, 3);
        V2 v22 = new V2("DISTINCT", 0, 0, k3);
        DISTINCT = v22;
        T2 k10 = k(u22);
        k10.a(u23);
        k10.f12384a.put(u24, 3);
        V2 v23 = new V2("SORTED", 1, 1, k10);
        SORTED = v23;
        T2 k11 = k(u22);
        k11.a(u23);
        Map map = k11.f12384a;
        map.put(u24, 3);
        U2 u25 = U2.TERMINAL_OP;
        map.put(u25, 2);
        U2 u26 = U2.UPSTREAM_TERMINAL_OP;
        map.put(u26, 2);
        V2 v24 = new V2("ORDERED", 2, 2, k11);
        ORDERED = v24;
        T2 k12 = k(u22);
        k12.a(u23);
        k12.f12384a.put(u24, 2);
        V2 v25 = new V2("SIZED", 3, 3, k12);
        SIZED = v25;
        T2 k13 = k(u24);
        k13.a(u25);
        V2 v26 = new V2("SHORT_CIRCUIT", 4, 12, k13);
        SHORT_CIRCUIT = v26;
        f12413v = new V2[]{v22, v23, v24, v25, v26};
        f12398f = f(u22);
        f12399g = f(u23);
        f12400h = f(u24);
        f(u25);
        f(u26);
        int i10 = 0;
        for (V2 v27 : values()) {
            i10 |= v27.f12417e;
        }
        f12401i = i10;
        int i11 = f12399g;
        f12402j = i11;
        int i12 = i11 << 1;
        f12403k = i12;
        f12404l = i11 | i12;
        V2 v28 = DISTINCT;
        f12405m = v28.c;
        n = v28.f12416d;
        V2 v29 = SORTED;
        f12406o = v29.c;
        f12407p = v29.f12416d;
        V2 v210 = ORDERED;
        f12408q = v210.c;
        f12409r = v210.f12416d;
        V2 v211 = SIZED;
        f12410s = v211.c;
        f12411t = v211.f12416d;
        f12412u = SHORT_CIRCUIT.c;
    }

    private V2(String str, int i10, int i11, T2 t22) {
        U2[] values = U2.values();
        int length = values.length;
        int i12 = 0;
        while (true) {
            Map map = t22.f12384a;
            if (i12 >= length) {
                this.f12414a = map;
                int i13 = i11 * 2;
                this.f12415b = i13;
                this.c = 1 << i13;
                this.f12416d = 2 << i13;
                this.f12417e = 3 << i13;
                return;
            }
            Map.EL.a(map, values[i12], 0);
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i10, int i11) {
        return i10 | (i11 & (i10 == 0 ? f12401i : ~(((f12402j & i10) << 1) | i10 | ((f12403k & i10) >> 1))));
    }

    private static int f(U2 u22) {
        V2[] values;
        int i10 = 0;
        for (V2 v22 : values()) {
            i10 |= ((Integer) v22.f12414a.get(u22)).intValue() << v22.f12415b;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i10 = characteristics & 4;
        int i11 = f12398f;
        return (i10 == 0 || spliterator.getComparator() == null) ? characteristics & i11 : characteristics & i11 & (-5);
    }

    private static T2 k(U2 u22) {
        T2 t22 = new T2(new EnumMap(U2.class));
        t22.a(u22);
        return t22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i10) {
        return i10 & ((~i10) >> 1) & f12402j;
    }

    public static V2 valueOf(String str) {
        return (V2) Enum.valueOf(V2.class, str);
    }

    public static V2[] values() {
        return (V2[]) f12413v.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(int i10) {
        return (i10 & this.f12417e) == this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j(int i10) {
        int i11 = this.f12417e;
        return (i10 & i11) == i11;
    }
}
