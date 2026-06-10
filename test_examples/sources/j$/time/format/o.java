package j$.time.format;

import java.text.ParsePosition;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
class o {

    /* renamed from: a  reason: collision with root package name */
    protected String f11953a;

    /* renamed from: b  reason: collision with root package name */
    protected String f11954b;
    protected char c;

    /* renamed from: d  reason: collision with root package name */
    protected o f11955d;

    /* renamed from: e  reason: collision with root package name */
    protected o f11956e;

    private o(String str, String str2, o oVar) {
        this.f11953a = str;
        this.f11954b = str2;
        this.f11955d = oVar;
        this.c = str.length() == 0 ? (char) 65535 : this.f11953a.charAt(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(String str, String str2, o oVar, int i10) {
        this(str, str2, oVar);
    }

    private boolean b(String str, String str2) {
        int i10 = 0;
        while (i10 < str.length() && i10 < this.f11953a.length() && c(str.charAt(i10), this.f11953a.charAt(i10))) {
            i10++;
        }
        if (i10 != this.f11953a.length()) {
            o e10 = e(this.f11953a.substring(i10), this.f11954b, this.f11955d);
            this.f11953a = str.substring(0, i10);
            this.f11955d = e10;
            if (i10 < str.length()) {
                this.f11955d.f11956e = e(str.substring(i10), str2, null);
                this.f11954b = null;
            } else {
                this.f11954b = str2;
            }
            return true;
        } else if (i10 >= str.length()) {
            this.f11954b = str2;
            return true;
        } else {
            String substring = str.substring(i10);
            for (o oVar = this.f11955d; oVar != null; oVar = oVar.f11956e) {
                if (c(oVar.c, substring.charAt(0))) {
                    return oVar.b(substring, str2);
                }
            }
            o e11 = e(substring, str2, null);
            e11.f11956e = this.f11955d;
            this.f11955d = e11;
            return true;
        }
    }

    public static o f(x xVar) {
        return xVar.k() ? new o("", null, null) : new n();
    }

    public static o g(HashSet hashSet, x xVar) {
        o f10 = f(xVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f10.b(str, str);
        }
        return f10;
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    protected boolean c(char c, char c10) {
        return c == c10;
    }

    public final String d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (h(charSequence, index, length)) {
            int length2 = this.f11953a.length() + index;
            o oVar = this.f11955d;
            if (oVar != null && length2 != length) {
                while (true) {
                    if (!c(oVar.c, charSequence.charAt(length2))) {
                        oVar = oVar.f11956e;
                        if (oVar == null) {
                            break;
                        }
                    } else {
                        parsePosition.setIndex(length2);
                        String d5 = oVar.d(charSequence, parsePosition);
                        if (d5 != null) {
                            return d5;
                        }
                    }
                }
            }
            parsePosition.setIndex(length2);
            return this.f11954b;
        }
        return null;
    }

    protected o e(String str, String str2, o oVar) {
        return new o(str, str2, oVar);
    }

    protected boolean h(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f11953a, i10);
        }
        int length = this.f11953a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!c(this.f11953a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}
