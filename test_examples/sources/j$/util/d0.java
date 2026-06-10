package j$.util;

/* loaded from: classes2.dex */
public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Spliterator f12179a = new Z();

    /* renamed from: b  reason: collision with root package name */
    private static final H f12180b = new X();
    private static final K c = new Y();

    /* renamed from: d  reason: collision with root package name */
    private static final E f12181d = new W();

    private static void a(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + ")");
    }

    public static E b() {
        return f12181d;
    }

    public static H c() {
        return f12180b;
    }

    public static K d() {
        return c;
    }

    public static Spliterator e() {
        return f12179a;
    }

    public static r f(E e10) {
        e10.getClass();
        return new T(e10);
    }

    public static InterfaceC0438v g(H h10) {
        h10.getClass();
        return new Q(h10);
    }

    public static InterfaceC0442z h(K k3) {
        k3.getClass();
        return new S(k3);
    }

    public static java.util.Iterator i(Spliterator spliterator) {
        spliterator.getClass();
        return new P(spliterator);
    }

    public static E j(double[] dArr, int i10, int i11) {
        dArr.getClass();
        a(dArr.length, i10, i11);
        return new V(dArr, i10, i11, 1040);
    }

    public static H k(int[] iArr, int i10, int i11) {
        iArr.getClass();
        a(iArr.length, i10, i11);
        return new a0(iArr, i10, i11, 1040);
    }

    public static K l(long[] jArr, int i10, int i11) {
        jArr.getClass();
        a(jArr.length, i10, i11);
        return new c0(jArr, i10, i11, 1040);
    }

    public static Spliterator m(Object[] objArr, int i10, int i11) {
        objArr.getClass();
        a(objArr.length, i10, i11);
        return new U(objArr, i10, i11, 1040);
    }
}
