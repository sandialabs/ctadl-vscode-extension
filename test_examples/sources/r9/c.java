package r9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import v7.g;

/* loaded from: classes.dex */
public final class c {
    public static final a c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static int f17173d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f17174e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f17175f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f17176g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f17177h;

    /* renamed from: i  reason: collision with root package name */
    public static final int f17178i;

    /* renamed from: j  reason: collision with root package name */
    public static final int f17179j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f17180k;

    /* renamed from: l  reason: collision with root package name */
    public static final int f17181l;

    /* renamed from: m  reason: collision with root package name */
    public static final c f17182m;
    public static final c n;

    /* renamed from: o  reason: collision with root package name */
    public static final c f17183o;

    /* renamed from: p  reason: collision with root package name */
    public static final c f17184p;

    /* renamed from: q  reason: collision with root package name */
    public static final c f17185q;

    /* renamed from: r  reason: collision with root package name */
    public static final ArrayList f17186r;

    /* renamed from: s  reason: collision with root package name */
    public static final ArrayList f17187s;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f17188a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17189b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: r9.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0219a {

            /* renamed from: a  reason: collision with root package name */
            public final int f17190a;

            /* renamed from: b  reason: collision with root package name */
            public final String f17191b;

            public C0219a(String str, int i10) {
                this.f17190a = i10;
                this.f17191b = str;
            }
        }
    }

    static {
        boolean z10;
        a.C0219a c0219a;
        c cVar;
        int i10 = f17173d;
        int i11 = i10 << 1;
        f17174e = i10;
        int i12 = i11 << 1;
        f17175f = i11;
        int i13 = i12 << 1;
        f17176g = i12;
        int i14 = i13 << 1;
        f17177h = i13;
        int i15 = i14 << 1;
        f17178i = i14;
        int i16 = i15 << 1;
        f17179j = i15;
        f17173d = i16 << 1;
        int i17 = i16 - 1;
        f17180k = i17;
        int i18 = i10 | i11 | i12;
        f17181l = i18;
        f17182m = new c(i17);
        n = new c(i14 | i15);
        new c(i10);
        new c(i11);
        new c(i12);
        f17183o = new c(i18);
        new c(i13);
        f17184p = new c(i14);
        f17185q = new c(i15);
        new c(i11 | i14 | i15);
        Field[] fields = c.class.getFields();
        g.e(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            a.C0219a c0219a2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            if (obj instanceof c) {
                cVar = (c) obj;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                String name = field2.getName();
                g.e(name, "field.name");
                c0219a2 = new a.C0219a(name, cVar.f17189b);
            }
            if (c0219a2 != null) {
                arrayList2.add(c0219a2);
            }
        }
        f17186r = arrayList2;
        Field[] fields2 = c.class.getFields();
        g.e(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (g.a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            g.d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String name2 = field4.getName();
                g.e(name2, "field.name");
                c0219a = new a.C0219a(name2, intValue);
            } else {
                c0219a = null;
            }
            if (c0219a != null) {
                arrayList5.add(c0219a);
            }
        }
        f17187s = arrayList5;
    }

    public c(int i10) {
        this(i10, EmptyList.f12981i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i10, List<? extends b> list) {
        g.f(list, "excludes");
        this.f17188a = list;
        for (b bVar : list) {
            i10 &= ~bVar.a();
        }
        this.f17189b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f17189b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (g.a(c.class, obj != null ? obj.getClass() : null)) {
            g.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
            c cVar = (c) obj;
            return g.a(this.f17188a, cVar.f17188a) && this.f17189b == cVar.f17189b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17188a.hashCode() * 31) + this.f17189b;
    }

    public final String toString() {
        Object obj;
        String str;
        String str2;
        boolean z10;
        Iterator it = f17186r.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((a.C0219a) obj).f17190a == this.f17189b) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        a.C0219a c0219a = (a.C0219a) obj;
        if (c0219a != null) {
            str = c0219a.f17191b;
        } else {
            str = null;
        }
        if (str == null) {
            ArrayList arrayList = f17187s;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a.C0219a c0219a2 = (a.C0219a) it2.next();
                if (a(c0219a2.f17190a)) {
                    str2 = c0219a2.f17191b;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            str = kotlin.collections.c.t2(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder p10 = a4.b.p("DescriptorKindFilter(", str, ", ");
        p10.append(this.f17188a);
        p10.append(')');
        return p10.toString();
    }
}
