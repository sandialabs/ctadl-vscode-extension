package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0256f implements InterfaceC0257g {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC0257g[] f11935a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11936b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0256f(ArrayList arrayList, boolean z10) {
        this((InterfaceC0257g[]) arrayList.toArray(new InterfaceC0257g[arrayList.size()]), z10);
    }

    C0256f(InterfaceC0257g[] interfaceC0257gArr, boolean z10) {
        this.f11935a = interfaceC0257gArr;
        this.f11936b = z10;
    }

    public final C0256f a() {
        return !this.f11936b ? this : new C0256f(this.f11935a, false);
    }

    @Override // j$.time.format.InterfaceC0257g
    public final boolean e(z zVar, StringBuilder sb) {
        int length = sb.length();
        boolean z10 = this.f11936b;
        if (z10) {
            zVar.g();
        }
        try {
            for (InterfaceC0257g interfaceC0257g : this.f11935a) {
                if (!interfaceC0257g.e(zVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z10) {
                zVar.a();
            }
            return true;
        } finally {
            if (z10) {
                zVar.a();
            }
        }
    }

    @Override // j$.time.format.InterfaceC0257g
    public final int f(x xVar, CharSequence charSequence, int i10) {
        boolean z10 = this.f11936b;
        InterfaceC0257g[] interfaceC0257gArr = this.f11935a;
        if (!z10) {
            for (InterfaceC0257g interfaceC0257g : interfaceC0257gArr) {
                i10 = interfaceC0257g.f(xVar, charSequence, i10);
                if (i10 < 0) {
                    break;
                }
            }
            return i10;
        }
        xVar.r();
        int i11 = i10;
        for (InterfaceC0257g interfaceC0257g2 : interfaceC0257gArr) {
            i11 = interfaceC0257g2.f(xVar, charSequence, i11);
            if (i11 < 0) {
                xVar.f(false);
                return i10;
            }
        }
        xVar.f(true);
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC0257g[] interfaceC0257gArr = this.f11935a;
        if (interfaceC0257gArr != null) {
            boolean z10 = this.f11936b;
            sb.append(z10 ? "[" : "(");
            for (InterfaceC0257g interfaceC0257g : interfaceC0257gArr) {
                sb.append(interfaceC0257g);
            }
            sb.append(z10 ? "]" : ")");
        }
        return sb.toString();
    }
}
