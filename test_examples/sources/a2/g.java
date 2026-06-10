package a2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final g f100b = new g(0);
    public static final g c = new g(1);

    /* renamed from: d  reason: collision with root package name */
    public static final g f101d = new g(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f102a;

    public g(int i10) {
        this.f102a = i10;
    }

    public final boolean a(g gVar) {
        int i10 = gVar.f102a;
        int i11 = this.f102a;
        return (i10 | i11) == i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f102a == ((g) obj).f102a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f102a;
    }

    public final String toString() {
        StringBuilder sb;
        int i10 = this.f102a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            sb = new StringBuilder("TextDecoration.");
            sb.append((String) arrayList.get(0));
        } else {
            sb = new StringBuilder("TextDecoration[");
            sb.append(m0.b.W(arrayList, ", ", null, 62));
            sb.append(']');
        }
        return sb.toString();
    }
}
