package j$.time.format;

import j$.time.DateTimeException;

/* loaded from: classes2.dex */
final class m implements InterfaceC0257g {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC0257g f11951a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11952b;
    private final char c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(InterfaceC0257g interfaceC0257g, int i10, char c) {
        this.f11951a = interfaceC0257g;
        this.f11952b = i10;
        this.c = c;
    }

    @Override // j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        int length = sb.length();
        if (this.f11951a.e(zVar, sb)) {
            int length2 = sb.length() - length;
            int i10 = this.f11952b;
            if (length2 <= i10) {
                for (int i11 = 0; i11 < i10 - length2; i11++) {
                    sb.insert(length, this.c);
                }
                return true;
            }
            throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i10);
        }
        return false;
    }

    @Override // j$.time.format.InterfaceC0257g
    public final int f(x xVar, CharSequence charSequence, int i10) {
        boolean l2 = xVar.l();
        if (i10 <= charSequence.length()) {
            if (i10 == charSequence.length()) {
                return ~i10;
            }
            int i11 = this.f11952b + i10;
            if (i11 > charSequence.length()) {
                if (l2) {
                    return ~i10;
                }
                i11 = charSequence.length();
            }
            int i12 = i10;
            while (i12 < i11 && xVar.b(charSequence.charAt(i12), this.c)) {
                i12++;
            }
            int f10 = this.f11951a.f(xVar, charSequence.subSequence(0, i11), i12);
            return (f10 == i11 || !l2) ? f10 : ~(i10 + i12);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Pad(");
        sb.append(this.f11951a);
        sb.append(",");
        sb.append(this.f11952b);
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        sb.append(str);
        return sb.toString();
    }
}
