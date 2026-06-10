package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0255e implements InterfaceC0257g {

    /* renamed from: a  reason: collision with root package name */
    private final char f11934a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0255e(char c) {
        this.f11934a = c;
    }

    @Override // j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        sb.append(this.f11934a);
        return true;
    }

    @Override // j$.time.format.InterfaceC0257g
    public final int f(x xVar, CharSequence charSequence, int i10) {
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        char charAt = charSequence.charAt(i10);
        char c = this.f11934a;
        return (charAt == c || (!xVar.k() && (Character.toUpperCase(charAt) == Character.toUpperCase(c) || Character.toLowerCase(charAt) == Character.toLowerCase(c)))) ? i10 + 1 : ~i10;
    }

    public final String toString() {
        char c = this.f11934a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
