package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class u implements InterfaceC0257g {
    private static volatile AbstractMap.SimpleImmutableEntry c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f11970d;

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.q f11971a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11972b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(j$.time.temporal.q qVar, String str) {
        this.f11971a = qVar;
        this.f11972b = str;
    }

    private static int b(x xVar, CharSequence charSequence, int i10, int i11, l lVar) {
        String upperCase = charSequence.toString().substring(i10, i11).toUpperCase();
        if (i11 < charSequence.length() && charSequence.charAt(i11) != '0' && !xVar.b(charSequence.charAt(i11), 'Z')) {
            x d5 = xVar.d();
            int f10 = lVar.f(d5, charSequence, i11);
            try {
                if (f10 >= 0) {
                    xVar.n(ZoneId.t(upperCase, ZoneOffset.x((int) d5.j(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                    return f10;
                } else if (lVar == l.f11947d) {
                    return ~i10;
                } else {
                    xVar.n(ZoneId.of(upperCase));
                    return i11;
                }
            } catch (DateTimeException unused) {
                return ~i10;
            }
        }
        xVar.n(ZoneId.of(upperCase));
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o a(x xVar) {
        HashSet a10 = j$.time.zone.f.a();
        int size = a10.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = xVar.k() ? c : f11970d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = xVar.k() ? c : f11970d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), o.g(a10, xVar));
                        if (xVar.k()) {
                            c = simpleImmutableEntry;
                        } else {
                            f11970d = simpleImmutableEntry;
                        }
                    }
                } finally {
                }
            }
        }
        return (o) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.InterfaceC0257g
    public boolean e(z zVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) zVar.f(this.f11971a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.InterfaceC0257g
    public final int f(x xVar, CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        if (i10 <= length) {
            if (i10 == length) {
                return ~i10;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt != '+' && charAt != '-') {
                int i12 = i10 + 2;
                if (length >= i12) {
                    char charAt2 = charSequence.charAt(i10 + 1);
                    if (xVar.b(charAt, 'U') && xVar.b(charAt2, 'T')) {
                        int i13 = i10 + 3;
                        return (length < i13 || !xVar.b(charSequence.charAt(i12), 'C')) ? b(xVar, charSequence, i10, i12, l.f11948e) : b(xVar, charSequence, i10, i13, l.f11948e);
                    } else if (xVar.b(charAt, 'G') && length >= (i11 = i10 + 3) && xVar.b(charAt2, 'M') && xVar.b(charSequence.charAt(i12), 'T')) {
                        return b(xVar, charSequence, i10, i11, l.f11948e);
                    }
                }
                o a10 = a(xVar);
                ParsePosition parsePosition = new ParsePosition(i10);
                String d5 = a10.d(charSequence, parsePosition);
                if (d5 != null) {
                    xVar.n(ZoneId.of(d5));
                    return parsePosition.getIndex();
                } else if (xVar.b(charAt, 'Z')) {
                    xVar.n(ZoneOffset.UTC);
                    return i10 + 1;
                } else {
                    return ~i10;
                }
            }
            return b(xVar, charSequence, i10, i10, l.f11947d);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        return this.f11972b;
    }
}
