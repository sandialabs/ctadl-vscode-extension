package j$.time.temporal;

import j$.time.DateTimeException;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    static final p f12027a = new p(0);

    /* renamed from: b  reason: collision with root package name */
    static final p f12028b = new p(1);
    static final p c = new p(2);

    /* renamed from: d  reason: collision with root package name */
    static final p f12029d = new p(3);

    /* renamed from: e  reason: collision with root package name */
    static final p f12030e = new p(4);

    /* renamed from: f  reason: collision with root package name */
    static final p f12031f = new p(5);

    /* renamed from: g  reason: collision with root package name */
    static final p f12032g = new p(6);

    public static int a(l lVar, o oVar) {
        t i10 = lVar.i(oVar);
        if (!i10.g()) {
            throw new s("Invalid field " + oVar + " for get() method, use getLong() instead");
        }
        long o10 = lVar.o(oVar);
        if (i10.h(o10)) {
            return (int) o10;
        }
        throw new DateTimeException("Invalid value for " + oVar + " (valid values " + i10 + "): " + o10);
    }

    public static Object b(l lVar, q qVar) {
        if (qVar != f12027a && qVar != f12028b && qVar != c) {
            return qVar.d(lVar);
        }
        return null;
    }

    public static t c(l lVar, o oVar) {
        if (!(oVar instanceof a)) {
            if (oVar != null) {
                return oVar.f(lVar);
            }
            throw new NullPointerException("field");
        } else if (lVar.c(oVar)) {
            return oVar.h();
        } else {
            throw new s("Unsupported field: " + oVar);
        }
    }

    public static p d() {
        return f12028b;
    }

    public static p e() {
        return f12031f;
    }

    public static p f() {
        return f12032g;
    }

    public static /* synthetic */ int g(int i10) {
        int i11 = i10 % 7;
        if (i11 == 0) {
            return 0;
        }
        return (((i10 ^ 7) >> 31) | 1) > 0 ? i11 : i11 + 7;
    }

    public static p h() {
        return f12029d;
    }

    public static p i() {
        return c;
    }

    public static p j() {
        return f12030e;
    }

    public static p k() {
        return f12027a;
    }
}
