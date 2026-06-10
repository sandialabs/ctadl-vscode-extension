package ua;

import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<c8.b<? extends Object>, qa.b<? extends Object>> f17990a;

    static {
        c8.b a10 = v7.i.a(m7.n.class);
        v7.g.f(m7.n.f16010a, "<this>");
        c8.b a11 = v7.i.a(ia.b.class);
        int i10 = ia.b.f11864l;
        f17990a = kotlin.collections.d.M1(new Pair(v7.i.a(String.class), s1.f18010a), new Pair(v7.i.a(Character.TYPE), q.f18004a), new Pair(v7.i.a(char[].class), p.c), new Pair(v7.i.a(Double.TYPE), z.f18036a), new Pair(v7.i.a(double[].class), y.c), new Pair(v7.i.a(Float.TYPE), e0.f17964a), new Pair(v7.i.a(float[].class), d0.c), new Pair(v7.i.a(Long.TYPE), x0.f18029a), new Pair(v7.i.a(long[].class), w0.c), new Pair(v7.i.a(m7.j.class), c2.f17957a), new Pair(v7.i.a(m7.k.class), b2.c), new Pair(v7.i.a(Integer.TYPE), n0.f17993a), new Pair(v7.i.a(int[].class), m0.c), new Pair(v7.i.a(m7.h.class), z1.f18040a), new Pair(v7.i.a(m7.i.class), y1.c), new Pair(v7.i.a(Short.TYPE), r1.f18008a), new Pair(v7.i.a(short[].class), q1.c), new Pair(v7.i.a(m7.l.class), f2.f17971a), new Pair(v7.i.a(m7.m.class), e2.c), new Pair(v7.i.a(Byte.TYPE), k.f17982a), new Pair(v7.i.a(byte[].class), j.c), new Pair(v7.i.a(m7.f.class), w1.f18025a), new Pair(v7.i.a(m7.g.class), v1.c), new Pair(v7.i.a(Boolean.TYPE), h.f17975a), new Pair(v7.i.a(boolean[].class), g.c), new Pair(a10, g2.f17973b), new Pair(v7.i.a(Void.class), d1.f17959a), new Pair(a11, a0.f17944a));
    }

    public static final String a(String str) {
        boolean z10;
        String valueOf;
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                String valueOf2 = String.valueOf(charAt);
                v7.g.d(valueOf2, "null cannot be cast to non-null type java.lang.String");
                Locale locale = Locale.ROOT;
                valueOf = valueOf2.toUpperCase(locale);
                v7.g.e(valueOf, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (valueOf.length() > 1) {
                    if (charAt != 329) {
                        char charAt2 = valueOf.charAt(0);
                        String substring = valueOf.substring(1);
                        v7.g.e(substring, "this as java.lang.String).substring(startIndex)");
                        String lowerCase = substring.toLowerCase(locale);
                        v7.g.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        valueOf = charAt2 + lowerCase;
                    }
                } else {
                    valueOf = String.valueOf(Character.toTitleCase(charAt));
                }
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring2 = str.substring(1);
            v7.g.e(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        return str;
    }
}
