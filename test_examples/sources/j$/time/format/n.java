package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n extends o {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n() {
        super("", null, null, 0);
    }

    private n(String str, String str2, o oVar) {
        super(str, str2, oVar, 0);
    }

    @Override // j$.time.format.o
    protected final boolean c(char c, char c10) {
        return x.c(c, c10);
    }

    @Override // j$.time.format.o
    protected final o e(String str, String str2, o oVar) {
        return new n(str, str2, oVar);
    }

    @Override // j$.time.format.o
    protected final boolean h(CharSequence charSequence, int i10, int i11) {
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
            if (!x.c(this.f11953a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}
