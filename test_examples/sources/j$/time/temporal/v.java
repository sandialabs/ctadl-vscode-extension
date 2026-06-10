package j$.time.temporal;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class v implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentHashMap f12045g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h  reason: collision with root package name */
    public static final r f12046h;

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.c f12047a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12048b;
    private final transient o c = u.m(this);

    /* renamed from: d  reason: collision with root package name */
    private final transient o f12049d = u.p(this);

    /* renamed from: e  reason: collision with root package name */
    private final transient o f12050e;

    /* renamed from: f  reason: collision with root package name */
    private final transient o f12051f;

    static {
        new v(j$.time.c.MONDAY, 4);
        g(j$.time.c.SUNDAY, 1);
        f12046h = j.f12026d;
    }

    private v(j$.time.c cVar, int i10) {
        b bVar = b.NANOS;
        this.f12050e = u.q(this);
        this.f12051f = u.o(this);
        if (cVar == null) {
            throw new NullPointerException("firstDayOfWeek");
        }
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f12047a = cVar;
        this.f12048b = i10;
    }

    public static v g(j$.time.c cVar, int i10) {
        String str = cVar.toString() + i10;
        ConcurrentHashMap concurrentHashMap = f12045g;
        v vVar = (v) concurrentHashMap.get(str);
        if (vVar == null) {
            concurrentHashMap.putIfAbsent(str, new v(cVar, i10));
            return (v) concurrentHashMap.get(str);
        }
        return vVar;
    }

    public final o d() {
        return this.c;
    }

    public final j$.time.c e() {
        return this.f12047a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && hashCode() == obj.hashCode();
    }

    public final int f() {
        return this.f12048b;
    }

    public final o h() {
        return this.f12051f;
    }

    public final int hashCode() {
        return (this.f12047a.ordinal() * 7) + this.f12048b;
    }

    public final o i() {
        return this.f12049d;
    }

    public final o j() {
        return this.f12050e;
    }

    public final String toString() {
        return "WeekFields[" + this.f12047a + ',' + this.f12048b + ']';
    }
}
